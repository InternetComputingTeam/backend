package com.example.backend.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.backend.bl.user.UserService;
import com.example.backend.utils.HttpClientUtil;
import com.example.backend.vo.ResponseVO;
import com.example.backend.vo.UserRequestVO;
import com.example.backend.vo.UserVO;
import com.example.backend.wxInfo.UserConstantInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserApi {

    private static final String USER_EXCEPTION = "用户不存在";
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseVO login(@RequestBody UserRequestVO userRequestVO) {

        // 向wx服务器GET请求
        Map<String, String> param = new HashMap<>();

        param.put("appid", UserConstantInterface.WX_LOGIN_APPID);
        param.put("secret", UserConstantInterface.WX_LOGIN_SECRET);
        param.put("js_code", userRequestVO.getCode());
        param.put("grant_type", UserConstantInterface.WX_LOGIN_GRANT_TYPE);

        String wxLoginResultString = HttpClientUtil.doGet(UserConstantInterface.WX_LOGIN_URL, param);
        JSONObject wxLoginResult = JSON.parseObject(wxLoginResultString);
        System.out.println(wxLoginResult);
        if (wxLoginResult.get("errcode") != null) {
            return ResponseVO.buildFailure("请求失败: " + wxLoginResult.get("errcode"));
        }

        String session_key = wxLoginResult.get("session_key").toString();
        String openid = wxLoginResult.get("openid").toString();
        userRequestVO.setOpenid(openid);
        System.out.println(openid);
        // openid 是本小程序判断用户的唯一id
        // 根据openid来判断是否已经注册
        UserVO user = userService.getUserByOpenid(openid);

        if (user != null) {
            userService.updateUser(new UserVO(userRequestVO));
            System.out.println("Update user" + userRequestVO);
        } else {
            UserVO userToInsert = new UserVO(userRequestVO);
            System.out.println("Insert User " + userToInsert);
            Boolean insertSucc = userService.insertUser(userToInsert);
            if (!insertSucc) {
                return ResponseVO.buildFailure("服务器错误");
            }
        }

        // 封装后返回
        Map<String, String> result = new HashMap<>();
        result.put("open_id", openid); result.put("session_key", session_key);
        return ResponseVO.buildSuccess(result);
        // 未做登录状态校验
    }

    @GetMapping("/{id}/getUserInfo")
    public ResponseVO getUserInfo(@PathVariable String id){
        UserVO userVO =userService.getUserByOpenid(id);
        if(userVO==null){
            return ResponseVO.buildFailure(USER_EXCEPTION);
        }
        return ResponseVO.buildSuccess(userVO);
    }
    //TODO 不确定这里是不是UserVO ,也不确定返回值类型
    @PostMapping("/{id}/userInfo/update")
    public  ResponseVO updateInfo(@RequestBody UserVO userVO,@PathVariable String id){
        boolean flag =  userService.updateUser(userVO);
        if(flag){return ResponseVO.buildSuccess(true);}
        else return ResponseVO.buildFailure("请求错误");
    }
    //TODO insert好像登陆里面有了

}

package com.example.backend.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.backend.bl.UserService;
import com.example.backend.utils.HttpClientUtil;
import com.example.backend.vo.ResponseVO;
import com.example.backend.vo.UserRequestVO;
import com.example.backend.vo.UserVO;
import com.example.backend.vo.WxLoginResultVO;
import com.example.backend.wxInfo.UserConstantInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserApi {

//    @Autowired
    private UserService userService;

//    private String nickName;
//    private String avatarUrl;
//    private String gender;
//    private String openid;
//    private String province;
//    private String country;
//    private String code;
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
        String session_key = wxLoginResult.get("session_key").toString();
        String openid = wxLoginResult.get("openid").toString();

//        // openid 是本小程序判断用户的唯一id
//        // 根据openid来判断是否已经注册
//        UserVO user = userService.getUserByOpenid(openid);
//
//        // 若未注册，则可以添加到数据库 可以一并得到一些用户信息
//        // avatar_url, nickname, gender
//        if (user != null) {
//
//        } else {
//            UserVO userToInsert = new UserVO(userRequestVO);
//            System.out.println("Insert User " + userToInsert);
//            Boolean insertSucc = userService.insertUser(userToInsert);
//            if (!insertSucc) {
//                return ResponseVO.buildFailure("服务器错误");
//            }
//        }

        // 封装后返回
        Map<String, String> result = new HashMap<>();
        result.put("open_id", openid); result.put("session_key", session_key);
        return ResponseVO.buildSuccess(result);
        // 未做登录状态校验
    }
}

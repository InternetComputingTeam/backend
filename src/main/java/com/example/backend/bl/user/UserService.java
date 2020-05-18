package com.example.backend.bl.user;

import com.example.backend.po.user.UserPO;
import com.example.backend.vo.UserVO;

public interface UserService {

    UserVO getUserByOpenid(String openid);

    Boolean insertUser(UserVO userVO);


    /**
     * UpdateUser同时不对Score进行修改
     * @param userVO userVO
     * @return boolean
     */
    Boolean updateUser(UserVO userVO);

    /**
     * UpdateScore 时传入的是差值
     * @param openid id
     * @param valueToUpdate 差值
     * @return boolean
     */
    Boolean updateScore(String openid, int valueToUpdate);


}

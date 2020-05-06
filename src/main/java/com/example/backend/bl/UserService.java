package com.example.backend.bl;

import com.example.backend.vo.UserVO;

public interface UserService {

    UserVO getUserByOpenid(String openid);

    Boolean insertUser(UserVO userVO);


}

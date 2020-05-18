package com.example.backend.bl.user;

import com.example.backend.po.user.UserPO;
import com.example.backend.vo.UserVO;

public interface UserService {

    UserVO getUserByOpenid(String openid);

    Boolean insertUser(UserVO userVO);

    Boolean updateUser(UserVO userVO);


}

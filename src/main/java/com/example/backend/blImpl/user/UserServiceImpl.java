package com.example.backend.blImpl.user;

import com.example.backend.bl.user.UserService;
import com.example.backend.data.user.UserMapper;
import com.example.backend.po.user.UserPO;
import com.example.backend.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public UserVO getUserByOpenid(String openid) {
        UserPO userInfoById = userMapper.getUserInfoById(openid);
        if (userInfoById == null) return null;
        else return new UserVO(userInfoById);
    }

    @Override
    public Boolean insertUser(UserVO userVO) {
        return userMapper.addUser(new UserPO(userVO)) > 0;
    }

    @Override
    public Boolean updateUser(UserVO userVO) {
        return userMapper.updateUser(new UserPO(userVO)) > 0;
    }
}

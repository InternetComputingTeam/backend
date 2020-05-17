package com.example.backend.data.user;

import com.example.backend.po.UserPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    int addUser(UserPO user);
    int updateUser(UserPO user);
    UserPO getUserInfoById(@Param("userId") String userId);

}

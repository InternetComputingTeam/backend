package com.example.backend.data.group;

import com.example.backend.vo.GroupInfoVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface GroupMapper {

    Integer addGroup(GroupInfoVO groupInfoVO);
    Integer delGroup(GroupInfoVO groupInfoVO);
    Integer unBound(@Param("groupId") Integer groupId);
    Integer unBoundOfUser(@Param("groupId") Integer groupId, @Param("userId") String userId);
    Integer bindToGroup(@Param("groupId") Integer groupId, @Param("userId") String userId);
    List<GroupInfoVO> queryByUser(@Param("userId") String userId);
    List<String> queryUsersByGroupId(@Param("groupId") Integer groupId);
    String queryGroupManager(@Param("groupId") Integer groupId);
}

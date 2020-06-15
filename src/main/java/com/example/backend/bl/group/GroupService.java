package com.example.backend.bl.group;

import com.example.backend.vo.GroupInfoVO;

import java.security.acl.Group;
import java.util.List;

public interface GroupService {

    Boolean addGroup(GroupInfoVO groupInfoVO);
    Boolean delGroup(GroupInfoVO groupInfoVO);
    Boolean bindToGroup(int groupId, String userId);
    Boolean unBoundFromGroup(int groupId, String userId);
    List<GroupInfoVO> queryByUser(String userId);


}

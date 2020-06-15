package com.example.backend.blImpl.group;

import com.example.backend.bl.group.GroupService;
import com.example.backend.data.group.GroupMapper;
import com.example.backend.vo.GroupInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    GroupMapper groupMapper;

    @Override
    public Boolean addGroup(GroupInfoVO groupInfoVO) {
        return groupMapper.addGroup(groupInfoVO) > 0;
    }

    @Override
    public Boolean delGroup(GroupInfoVO groupInfoVO) {
        return groupMapper.delGroup(groupInfoVO) > 0;
    }

    @Override
    public Boolean bindToGroup(int groupId, String userId) {
        return groupMapper.bindToGroup(groupId, userId) > 0;
    }

    @Override
    public Boolean unBoundFromGroup(int groupId, String userId) {
        groupMapper.unBoundOfUser(groupId, userId);
        return true;
    }

    @Override
    public List<GroupInfoVO> queryByUser(String userId) {
        return groupMapper.queryByUser(userId);
    }
}

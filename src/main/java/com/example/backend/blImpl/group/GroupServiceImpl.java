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

    //xzh修改 使得创建组的时候绑定组长
    @Override
    public Boolean addGroup(GroupInfoVO groupInfoVO) {
        String manager = groupInfoVO.getManager();

        int row= groupMapper.addGroup(groupInfoVO);
        bindToGroup(groupInfoVO.getId(),manager);
        return row>0;
    }

    @Override
    public Boolean delGroup(GroupInfoVO groupInfoVO) {
        return groupMapper.delGroup(groupInfoVO) > 0;
    }

    @Override
    public Boolean bindToGroup(int groupId, String userId) {
        if (queryUsersByGroupId(groupId).contains(userId)) {
            return false;
        }
        return groupMapper.bindToGroup(groupId, userId) > 0;
    }


    //xzh修改 设置组长不能解绑
    @Override
    public Boolean unBoundFromGroup(int groupId, String userId) {
        String manager = groupMapper.queryGroupManager(groupId);
        if(manager.equals(userId))return false;
        groupMapper.unBoundOfUser(groupId, userId);
        return true;
    }

    @Override
    public List<GroupInfoVO> queryByUser(String userId) {
        return groupMapper.queryByUser(userId);
    }

    //xzh新增
    @Override
    public List<String> queryUsersByGroupId(int groupId) {
        return groupMapper.queryUsersByGroupId(groupId);
    }
}

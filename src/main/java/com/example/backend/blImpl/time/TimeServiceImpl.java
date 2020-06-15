package com.example.backend.blImpl.time;

import com.example.backend.bl.group.GroupService;
import com.example.backend.bl.time.TimeService;
import com.example.backend.data.time.TimeMapper;
import com.example.backend.po.time.TimePO;
import com.example.backend.vo.RankVO;
import com.example.backend.vo.TimeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class TimeServiceImpl implements TimeService {
    @Autowired
    TimeMapper timeMapper;
    @Autowired
    GroupService groupService;
    @Override
    public boolean addTimeRecord(TimeVO timeVO) {
        return timeMapper.addTimeRecord(new TimePO(timeVO))>0;
    }

    @Override
    public int lengthOfTheDateOfOneUser(String userId, String createDate) {
        List<Integer> timeList = timeMapper.queryLengthOfTheDateOfOneUser(userId,createDate);
        Integer res = 0;
        for(Integer i:timeList){
            res +=i;
        }

        return (int)res;
    }

    @Override
    public List<RankVO> lengthOfTheDateOfGroup(int groupId, String createDate) {
        List<String> users = groupService.queryUsersByGroupId(groupId);
        List<RankVO> ranks = new ArrayList<RankVO>();
        for(String userId:users){
            ranks.add(
                    new RankVO(userId,lengthOfTheDateOfOneUser(userId,createDate))
            );
        }
        return ranks;

    }
}

package com.example.backend.bl.time;

import com.example.backend.vo.RankVO;
import com.example.backend.vo.TimeVO;

import java.util.List;

public interface TimeService {
    boolean addTimeRecord(TimeVO timeVO);

    int lengthOfTheDateOfOneUser(String userId,String createDate);

    List<RankVO> lengthOfTheDateOfGroup(int groupId, String createDate);

    List<TimeVO> getRecordsById(String userId);
}

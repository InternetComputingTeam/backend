package com.example.backend.data.time;

import com.example.backend.po.time.TimePO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TimeMapper {

    int addTimeRecord(TimePO timePO);

    List<Integer> queryLengthOfTheDateOfOneUser(@Param("userId") String userId, @Param("create_time0") String create_time0, @Param("create_time1") String create_time1);

    List<TimePO> getRecordsById(@Param("userId") String userId);

//    int queryLengthOfTheDateOfGroup(@Param("groupId") String groupId,@Param("create_date") String create_date);

//    int queryUserHistory(); 某个用户的历史记录
}

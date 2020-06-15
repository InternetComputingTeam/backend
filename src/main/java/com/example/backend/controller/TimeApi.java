package com.example.backend.controller;

import com.example.backend.bl.time.TimeService;
import com.example.backend.vo.RankVO;
import com.example.backend.vo.ResponseVO;
import com.example.backend.vo.TaskVO;
import com.example.backend.vo.TimeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

//按照记录的形式来组织
@RestController
@RequestMapping("/api/Time")
public class TimeApi {
    @Autowired
    TimeService timeService;



    @PostMapping("/addTimeRecord")
    public ResponseVO addTimeRecord(@RequestBody TimeVO timeVO){
        boolean flag = timeService.addTimeRecord(timeVO);
        if(flag)return ResponseVO.buildSuccess(true);
        else return ResponseVO.buildFailure("增加记录失败");
    }

    @GetMapping("/lengthOfTheDateOfOneUser/{userId}/{date}")
    public ResponseVO lengthOfTheDateOfOneUser(@PathVariable String userId,@PathVariable String date){
        int length = timeService.lengthOfTheDateOfOneUser(userId,date);
        return ResponseVO.buildSuccess(length);

    }

    @GetMapping("/lengthOfTheDateOfGroup/{groupId}/{date}")
    public ResponseVO lengthOfTheDateOfGroup(@PathVariable int groupId,@PathVariable String date){
        List<RankVO> rankVOS = timeService.lengthOfTheDateOfGroup(groupId,date);
        return ResponseVO.buildSuccess(rankVOS);


    }

}

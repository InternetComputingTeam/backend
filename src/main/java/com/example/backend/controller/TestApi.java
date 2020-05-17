package com.example.backend.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.backend.bl.user.UserService;
import com.example.backend.data.comment.CommentMapper;
import com.example.backend.data.task.TaskMapper;
import com.example.backend.po.comment.CommentPO;
import com.example.backend.po.task.TaskPO;
import com.example.backend.utils.HttpClientUtil;
import com.example.backend.vo.ResponseVO;
import com.example.backend.vo.UserRequestVO;
import com.example.backend.vo.UserVO;
import com.example.backend.wxInfo.UserConstantInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/test")
public class TestApi {

    @Autowired
    private TaskMapper taskMapper;

    @Autowired
    private CommentMapper commentMapper;

    @PostMapping("/test")
    public ResponseVO test() {
        TaskPO taskPO = new TaskPO();
        taskPO.setTitle("TestTask");
        taskPO.setStartTime(new Date());
        taskPO.setEndTime(new Date());
        taskPO.setUserId("o2IofwQs7aTixz03-p0iV80S_Gg0");
        taskMapper.addTask(taskPO);
        return ResponseVO.buildSuccess(taskPO);
    }

    @PostMapping("/test2")
    public ResponseVO test2() {
        List<TaskPO> taskPOS = taskMapper.queryTaskByUserId("o2IofwQs7aTixz03-p0iV80S_Gg0");
        return ResponseVO.buildSuccess(taskPOS);
    }

    
    @PostMapping("/test3")
    public ResponseVO test3() {
        CommentPO commentPO = new CommentPO();
        commentPO.setUserId("o2IofwQs7aTixz03-p0iV80S_Gg0");
        commentPO.setCommentTime(new Date());
        commentMapper.addComment(commentPO);
        return ResponseVO.buildSuccess();
    }

    @PostMapping("/test4")
    public ResponseVO test4() {
        List<CommentPO> commentPOS = commentMapper.queryCommentsByUserId("o2IofwQs7aTixz03-p0iV80S_Gg0");
        return ResponseVO.buildSuccess(commentPOS);
    }
}

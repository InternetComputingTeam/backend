package com.example.backend.controller;

import com.example.backend.bl.task.TaskService;
import com.example.backend.po.task.TaskPO;
import com.example.backend.vo.ResponseVO;
import com.example.backend.vo.TaskVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task")
public class TaskApi {

    @Autowired
    private TaskService taskService;

    @PostMapping("/addTask")//TODO 路由里面要不要加id
    public ResponseVO addTask(@RequestBody TaskVO taskVO){
        boolean flag = taskService.addTask(taskVO);
        if(flag)return ResponseVO.buildSuccess(true);
        else return ResponseVO.buildFailure("添加失败");
    }
    @PostMapping("/updateTask")//TODO 路由里面要不要加id
    public ResponseVO updateTask(@RequestBody TaskVO taskVO){
        boolean flag = taskService.updateTask(taskVO);
        if(flag)return ResponseVO.buildSuccess(true);
        else return ResponseVO.buildFailure("更新失败");
    }
    @PostMapping("/deleteTask")//TODO 路由里面要不要加id
    public ResponseVO deleteTask(@RequestBody TaskVO taskVO){
        boolean flag = taskService.deleteTask(taskVO);
        if(flag)return ResponseVO.buildSuccess(true);
        else return ResponseVO.buildFailure("删除失败");
    }
    @GetMapping("/{id}/queryTaskByUserId") //TODO List的PO和VO不好转换 直接用PO了
    public ResponseVO queryTaskByUserId(@PathVariable String id){
        List<TaskPO>  taskPOS= taskService.queryTaskByUserId(id);
        return ResponseVO.buildSuccess(taskPOS);
    }



}

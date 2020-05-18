package com.example.backend.blImpl.task;

import com.example.backend.bl.task.TaskService;
import com.example.backend.data.task.TaskMapper;
import com.example.backend.po.task.TaskPO;
import com.example.backend.vo.TaskVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    TaskMapper taskMapper;

    @Override
    public Boolean addTask(TaskVO taskVO) {
        return taskMapper.addTask(new TaskPO(taskVO))>0;
    }

    @Override
    public Boolean updateTask(TaskVO taskVO) {
        return taskMapper.updateTask(new TaskPO(taskVO))>0;
    }

    @Override//TODO mybatis文件里面直接写了传VO
    public Boolean deleteTask(TaskVO taskVO) {
        return taskMapper.deleteTask(new TaskPO(taskVO))>0;
    }

    @Override
    public List<TaskPO> queryTaskByUserId(String userId) {

        List<TaskPO> taskPOS = taskMapper.queryTaskByUserId(userId);
        return taskPOS;
    }
}

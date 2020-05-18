package com.example.backend.bl.task;


import com.example.backend.po.task.TaskPO;
import com.example.backend.vo.TaskVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface TaskService {
        Boolean addTask(TaskVO taskVO);

        Boolean updateTask(TaskVO taskVO);

        Boolean deleteTask(TaskVO taskVO);

        List<TaskPO> queryTaskByUserId(String userId);
}

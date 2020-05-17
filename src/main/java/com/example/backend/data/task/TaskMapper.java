package com.example.backend.data.task;

import com.example.backend.po.task.TaskPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TaskMapper {

    int addTask(TaskPO taskPO);

    int updateTask(TaskPO taskPO);

    int deleteTask(TaskPO taskPO);

    List<TaskPO> queryTaskByUserId(@Param("userId") String userId);
}

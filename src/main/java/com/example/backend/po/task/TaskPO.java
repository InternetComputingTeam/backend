package com.example.backend.po.task;

import com.example.backend.vo.TaskVO;

import java.util.Date;

public class TaskPO {
    private int taskId;
    private String userId;
    private String title;
    private Date startTime;
    private Date endTime;
    private int priority;
    private String detail;
    private int status;
    public TaskPO(TaskVO taskVO){
        this.taskId=taskVO.getTaskId();
        this.userId=taskVO.getUserId();
        this.title=taskVO.getTitle();
        this.startTime=taskVO.getStartTime();
        this.endTime=taskVO.getEndTime();
        this.priority=taskVO.getPriority();
        this.detail=taskVO.getDetail();
        this.status=taskVO.getStatus();
    }
    public TaskPO(){}
    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

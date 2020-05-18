package com.example.backend.vo;

import com.example.backend.po.task.TaskPO;

import java.util.Date;

public class TaskVO {


    private int taskId;
    private String userId;
    private String title;
    private Date startTime;
    private Date endTime;
    private int priority;
    private String detail;
    private int status;

    public TaskVO(){

    }
    public TaskVO(TaskPO taskPO){
        this.taskId=taskPO.getTaskId();
        this.userId=taskPO.getUserId();
        this.title=taskPO.getTitle();
        this.startTime=taskPO.getStartTime();
        this.endTime=taskPO.getEndTime();
        this.priority=taskPO.getPriority();
        this.detail=taskPO.getDetail();
        this.status=taskPO.getStatus();
    }


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

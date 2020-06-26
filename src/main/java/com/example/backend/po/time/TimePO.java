package com.example.backend.po.time;

import com.example.backend.vo.TimeVO;

public class TimePO {
    private int id;
    private String userId;
    private int length;
    private String createTime;//yyyy-mm-dd HH:MM:ss

    public TimePO() {}

    public TimePO(String userId, int length, String createTime) {
        this.userId = userId;
        this.length = length;
        this.createTime = createTime;
    }
    public TimePO(TimeVO timeVO){
        this.userId=timeVO.getUserId();
        this.length=timeVO.getLength();
        this.createTime=timeVO.getCreateTime();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

}

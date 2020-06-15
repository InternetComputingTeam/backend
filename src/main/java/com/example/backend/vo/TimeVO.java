package com.example.backend.vo;

import com.example.backend.po.time.TimePO;

import java.util.Date;

public class TimeVO {
    private String userId;
    private int length;
    private String createTime;//yyyy-mm-dd

    public TimeVO(String userId, int length, String createTime) {
        this.userId = userId;
        this.length = length;
        this.createTime = createTime;
    }
    public TimeVO(TimePO timePO){
        this.userId=timePO.getUserId();
        this.length=timePO.getLength();
        this.createTime=timePO.getCreateTime();
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

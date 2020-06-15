package com.example.backend.vo;

import com.example.backend.po.time.RankPO;

public class RankVO {
    private String userId;
    private int lengthOfTheDay;

    public RankVO(String userId, int lengthOfTheDay) {
        this.userId = userId;
        this.lengthOfTheDay = lengthOfTheDay;
    }
    public RankVO(RankPO rankPO){
        this.userId=rankPO.getUserId();
        this.lengthOfTheDay=rankPO.getLengthOfTheDay();
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getLengthOfTheDay() {
        return lengthOfTheDay;
    }

    public void setLengthOfTheDay(int lengthOfTheDay) {
        this.lengthOfTheDay = lengthOfTheDay;
    }
}

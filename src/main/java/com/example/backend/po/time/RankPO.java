package com.example.backend.po.time;

import com.example.backend.vo.RankVO;

public class RankPO {
    private String userId;
    private int lengthOfTheDay;

    public RankPO(String userId, int lengthOfTheDay) {
        this.userId = userId;
        this.lengthOfTheDay = lengthOfTheDay;
    }
    public RankPO(RankVO rankVO){
        this.userId=rankVO.getUserId();
        this.lengthOfTheDay=rankVO.getLengthOfTheDay();
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

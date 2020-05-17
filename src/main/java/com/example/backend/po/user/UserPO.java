package com.example.backend.po.user;

import com.example.backend.vo.UserVO;

public class UserPO {
    private String nickName;
    private String avatarUrl;
    private String gender;
    private String userId;
    private String province;
    private String country;
    private String city;

    public UserPO() {
    }


    public UserPO(UserVO userVO) {
        this.userId = userVO.getOpenid();
        this.nickName = userVO.getNickName();
        this.avatarUrl = userVO.getAvatarUrl();
        this.gender = userVO.getGender();
        this.province = userVO.getProvince();
        this.city = userVO.getCity();
        this.country = userVO.getCountry();
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

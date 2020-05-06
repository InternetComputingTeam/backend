package com.example.backend.vo;

public class UserVO {
    private String nickName;
    private String avatarUrl;
    private String gender;
    private String openid;
    private String province;
    private String country;

    public UserVO() {
    }

    public UserVO(UserRequestVO userRequestVO) {
        this.nickName = userRequestVO.getNickName();
        this.avatarUrl = userRequestVO.getAvatarUrl();
        this.gender = userRequestVO.getGender();
        this.openid = userRequestVO.getOpenid();
        this.province = userRequestVO.getProvince();
        this.country = userRequestVO.getCountry();
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

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
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

    @Override
    public String toString() {
        return "UserVO{" +
                "nickName='" + nickName + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", gender='" + gender + '\'' +
                ", openid='" + openid + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

package com.example.backend.wxInfo;

public interface                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         UserConstantInterface {
    // 请求的网址
    public static final String WX_LOGIN_URL = "https://api.weixin.qq.com/sns/jscode2session";

    // 你的appid
    public static final String WX_LOGIN_APPID = "wx73990c9a207722ab";

    // 你的密匙
    public static final String WX_LOGIN_SECRET = "ea161a115ca1d9b2cc1eee3a9521169d";

    // 固定参数
    public static final String WX_LOGIN_GRANT_TYPE = "authorization_code";

}

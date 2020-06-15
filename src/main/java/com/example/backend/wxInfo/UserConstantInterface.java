package com.example.backend.wxInfo;

public interface                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         UserConstantInterface {
    // 请求的网址
    public static final String WX_LOGIN_URL = "https://api.weixin.qq.com/sns/jscode2session";

    // 你的appid
    public static final String WX_LOGIN_APPID = "wx237c8ea4b1b6a704";

    // 你的密匙
    public static final String WX_LOGIN_SECRET = "622e25b6c89e52a079fbd70721d228ee";

    // 固定参数
    public static final String WX_LOGIN_GRANT_TYPE = "authorization_code";

}

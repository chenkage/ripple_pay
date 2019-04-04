package com.ejar.common.constant;

public class PublicKey {
    /**
     * 用户令牌key
     */
    public final static String KEY_USER_TOKEN = "token";
    /**
     * 用户会话权限key
     */
    public final static String KEY_USER_SESSION = "USER_SESSION_";
    /**
     * 用户id
     */
    public final static String KEY_USER_ID = "userId";
    /**
     * 用户会话过期时间(秒)
     */
    public final static int TIMEOUT = 30 * 60;

    /**
     * redis订单号key
     */
    public final static String KEY_ORDER_NUMBER = "mzyz:order:number";

    /**
     * redis用户验证码key
     */
    public final static String KEY_CODE = "USER_CODE_";

    /**
     * 用户验证码过期时间(秒)
     */
    public final static int USERCODE_TIMEOUT = 6 * 60;

    /**
     * 用户登录错误次数
     */
    public final static String USER_LOGIN_ERROR_NUMBER = "user_login_error_number_";

    /**
     * 用户登录错误限制时间（秒）
     */
    public final static int USER_LOGIN_ERROR_OUTTIME = 5 * 60;

    /**
     * 用户登录错误限制次数
     */
    public final static int USER_LOGIN_ERROR_MAX_NUMBER = 3;

    /**
     * 对碰奖待处理队列key
     */
    public final static String CRASH_AWARD_QUEUE_TO_BE_PROCESSED_KEY = "QUEUE_TO_BE_PROCESSED_LIST";

    /**
     * 用户系统消息key
     */
    public final static String USER_SYSTEM_MESSAGE_KEY = "USER_SYSTEM_MESSAGE_";

    /**
     * 用户系统消息队列大小
     */
    public final static int USER_SYSTEM_MESSAGE_MAX_NUM = 50;
}

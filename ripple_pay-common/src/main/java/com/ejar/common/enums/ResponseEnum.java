package com.ejar.common.enums;

import com.google.common.base.Enums;

/**
 * @description: 系统响应内容枚举
 * 使用静态地图模型提高调用效率
 * @author: Fearon
 * @create: 2018/7/19 11:37
 **/
public enum ResponseEnum {
    SUCCESS("200", "success"),
    DATA_EXCEPTION("300", "data invalid"),
    DATA_ILLEGAL("301", "非法参数引入！"),
    ACCOUNT_NULL("302", "用户名不可为空！"),
    ACCOUNT_NOEXISTS("303", "用户不存在！"),
    PASSWD_NULL("304", "密码不可为空！"),
    PASSWD_ERROR("305", "密码错误！"),
    DATA_NULLEXCEPTION("306", "空数据异常！"),
    CONTENT_NULL("307","内容不可为空"),
    USER_MARK_NOTNULL("308","用户标识不可为空"),
    USER_DATA_REMARKABLY("309","用户数据解析异常"),
    TARGET_DATA_REMARKABLY("310","目标数据解析异常"),
    LOGIN_TIME_OUT("311","登录已过期"),
    NO_SEARCH_DATA("312","未查到到相关数据"),
    AGE_IS_NOT("313","互助计划与受保人年龄不符"),
    UNBOUNDED("314", "未绑定手机号"),
    IDENTITY_EXCEPTION("315", "身份信息异常"),
    REQUEST_FAILED("400", "request can not be accessed"),
    REQUEST_DENIED("401", "无操作权限！"),
    USER_FORBIDDEN("402", "用户已被禁用！"),
    FAILED("500", "failed"),
    BADNETWORK("501", "网络异常！"),
    SERVER_EXCEPTION("502", "服务器异常！");

    private String code;
    private String description;

    ResponseEnum(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static ResponseEnum getIfPresent(String name) {
        return Enums.getIfPresent(ResponseEnum.class, name).orNull();
    }
}

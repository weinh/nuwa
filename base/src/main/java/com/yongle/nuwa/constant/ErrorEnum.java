package com.yongle.nuwa.constant;

/**
 * 类 名 称：ErrorEnum.java
 * 功能说明：
 * 开发人员：weinh
 * 开发时间：2017年09月20日
 */
public enum ErrorEnum {
    //系统相关
    SUCCESS(0, "成功"),
    ERROR(-1, "未知错误"),
    SIGNATURE_ERROR(-10, "签名错误"),
    TIMESTAMP_ERROR(-11, "时间戳错误"),
    TIMESTAMP_EMPTY(-12, "时间戳不能为空"),
    ERROR_PARAM(-13, "参数错误");
    public final Integer errorCode;
    public final String errorInfo;

    ErrorEnum(Integer errorCode, String errorInfo) {
        this.errorCode = errorCode;
        this.errorInfo = errorInfo;
    }
}

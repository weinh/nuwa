package com.yongle.nuwa.vo;

/**
 * 类 名 称：ResultBean.java
 * 功能说明：
 * 开发人员：weinh
 * 开发时间：2017年09月02日
 */
public class ResultBean {
    private Integer errorCode;
    private String errorInfo;
    private Object data;

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

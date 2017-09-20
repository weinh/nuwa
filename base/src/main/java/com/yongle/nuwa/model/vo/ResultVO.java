package com.yongle.nuwa.model.vo;

import com.yongle.nuwa.constant.ErrorEnum;

/**
 * 类 名 称：ResultVO.java
 * 功能说明：
 * 开发人员：weinh
 * 开发时间：2017年09月02日
 */
public class ResultVO<T> {
    private Integer errorCode;
    private String errorInfo;
    private T data;
    private Paging paging;

    public ResultVO() {
        this.errorCode = ErrorEnum.SUCCESS.errorCode;
        this.errorInfo = ErrorEnum.SUCCESS.errorInfo;
    }

    public ResultVO(ErrorEnum errorEnum) {
        this.errorCode = errorEnum.errorCode;
        this.errorInfo = errorEnum.errorInfo;
    }
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }
}

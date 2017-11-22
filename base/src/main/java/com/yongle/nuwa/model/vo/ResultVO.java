package com.yongle.nuwa.model.vo;

import com.yongle.nuwa.constant.ErrorEnum;

/**
 * @author weinh
 */
public class ResultVO<T> {
    private Integer errorCode;
    private String errorInfo;
    private T data;

    public ResultVO() {
        this(ErrorEnum.SUCCESS);
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
}

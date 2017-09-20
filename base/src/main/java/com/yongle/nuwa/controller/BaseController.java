package com.yongle.nuwa.controller;

import com.yongle.nuwa.vo.ResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 类 名 称：BaseController.java
 * 功能说明：
 * 开发人员：weinh
 * 开发时间：2017年09月02日
 */
public class BaseController {
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @ExceptionHandler({Exception.class})
    @ResponseBody
    public ResultBean exception(Exception e) {
        logger.error(e.getMessage(), e);
        ResultBean resultBean = new ResultBean();
        resultBean.setErrorCode(-1);
        resultBean.setErrorInfo(e.getMessage());
        return resultBean;
    }
}

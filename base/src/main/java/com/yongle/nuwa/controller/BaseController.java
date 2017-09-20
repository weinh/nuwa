package com.yongle.nuwa.controller;

import com.yongle.nuwa.constant.ErrorEnum;
import com.yongle.nuwa.model.vo.ResultVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
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
    public ResultVO exception(Exception e) {
        logger.error(e.getMessage(), e);
        ResultVO vo = new ResultVO(ErrorEnum.ERROR);
        vo.setErrorInfo(e.getMessage());
        return vo;
    }

    protected ResultVO validatorParam(BindingResult bindingResult) {
        ResultVO vo = new ResultVO(ErrorEnum.ERROR_PARAM);
        vo.setErrorInfo(bindingResult.getFieldError().getField() + bindingResult.getFieldError().getDefaultMessage());
        return vo;
    }
}

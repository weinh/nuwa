package com.yongle.nuwa.demo.controller;

import com.yongle.nuwa.controller.BaseController;
import com.yongle.nuwa.demo.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 类 名 称：DemoController.java
 * 功能说明：
 * 开发人员：weinh
 * 开发时间：2017年09月02日
 */
@RestController
@RequestMapping("/demo")
public class DemoController extends BaseController {

    @Resource
    private DemoService demoService;

    @RequestMapping("/test_transaction")
    @ResponseBody
    public boolean testTransaction(@RequestParam(name = "isException") boolean isException) {
        demoService.testTransaction(isException);
        return isException;
    }
}

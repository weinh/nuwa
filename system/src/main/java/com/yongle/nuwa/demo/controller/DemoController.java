package com.yongle.nuwa.demo.controller;

import com.yongle.nuwa.demo.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 类 名 称：DemoController.java
 * 功能说明：
 * 开发人员：weinh
 * 开发时间：2017年08月31日
 */
@RestController
public class DemoController {

    @Resource
    DemoService demoService;

    @RequestMapping("/demo")
    public String demo() {
        return "";
    }
}

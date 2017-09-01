package com.yongle.nuwa.demo.controller;

import com.yongle.nuwa.demo.service.DemoService;
import com.yongle.nuwa.model.demo.Demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
    @ResponseBody
    public Demo demo() {
        Demo demo = demoService.getDemo();
        return demo;
    }
}

package com.yongle.nuwa.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.yongle.nuwa.controller.BaseController;
import com.yongle.nuwa.demo.service.DemoService;
import com.yongle.nuwa.model.demo.Demo;
import com.yongle.nuwa.vo.ResultBean;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.StringTokenizer;

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

    @RequestMapping("/demo")
    @ResponseBody
    public ResultBean insert(@Valid @RequestBody Demo demo, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            for (ObjectError objectError : bindingResult.getAllErrors()) {
                logger.error(JSONObject.toJSONString(objectError));
            }
            return null;
        }
        return demoService.insert(demo);
    }
}

package com.yongle.nuwa.demo.controller;

import com.yongle.nuwa.controller.BaseController;
import com.yongle.nuwa.demo.service.DemoService;
import com.yongle.nuwa.model.demo.Demo;
import com.yongle.nuwa.model.vo.Paging;
import com.yongle.nuwa.model.vo.ResultVO;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

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
    public boolean testTransaction(@RequestParam(name = "isException") boolean isException) {
        demoService.testTransaction(isException);
        return isException;
    }

    @RequestMapping("/demo")
    public ResultVO insert(@Valid @RequestBody Demo demo, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return super.validatorParam(bindingResult);
        }
        return demoService.insert(demo);
    }

    @RequestMapping("/list")
    public ResultVO<Paging<Demo>> list() {
        return demoService.list();
    }
}

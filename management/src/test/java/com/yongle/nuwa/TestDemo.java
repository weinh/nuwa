package com.yongle.nuwa;

import com.yongle.nuwa.demo.service.DemoService;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * 类 名 称：TestDemo.java
 * 功能说明：
 * 开发人员：weinh
 * 开发时间：2017年09月02日
 */
public class TestDemo extends ManagementApplicationTests {

    @Resource
    private DemoService demoService;

    @Test
    public void testTransaction() {
        demoService.testTransaction(true);
    }

    @Test
    public void testAB(){
        demoService.testA();
    }

}

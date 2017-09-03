package com.yongle.nuwa.demo.service;

/**
 * 类 名 称：DemoService.java
 * 功能说明：
 * 开发人员：weinh
 * 开发时间：2017年09月02日
 */
public interface DemoService {
    void testTransaction(boolean isException);

    /**
     * 方法A调用方法B事务不生效的解决方案
     */
    void testA();

    void testB();
}

package com.yongle.nuwa.demo.service;

import com.yongle.nuwa.model.demo.Demo;
import com.yongle.nuwa.model.vo.Paging;
import com.yongle.nuwa.model.vo.ResultVO;
import com.yongle.nuwa.service.BaseService;

import java.util.List;

/**
 * 类 名 称：DemoService.java
 * 功能说明：
 * 开发人员：weinh
 * 开发时间：2017年09月02日
 */
public interface DemoService extends BaseService {
    void testTransaction(boolean isException);

    /**
     * 方法A调用方法B事务不生效的解决方案
     */
    void testA();

    void testB();

    ResultVO insert(Demo demo);

    ResultVO<Paging<Demo>> list();
}

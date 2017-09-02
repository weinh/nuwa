package com.yongle.nuwa.demo.service.impl;

import com.yongle.nuwa.demo.mapper.DemoMapper;
import com.yongle.nuwa.demo.service.DemoService;
import com.yongle.nuwa.model.demo.Demo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 类 名 称：DemoServiceImpl.java
 * 功能说明：
 * 开发人员：weinh
 * 开发时间：2017年09月02日
 */
@Service
public class DemoServiceImpl implements DemoService {

    final Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private DemoMapper demoMapper;

    @Override
    @Transactional
    public void testTransaction(boolean isException) {
        Demo demo = new Demo();
        demo.setName("before");
        demoMapper.insert(demo);
        logger.info(demo.getId() + "");
        if (isException) {
            throw new Error("报错了");
        }
        demo = new Demo();
        demo.setName("after");
        demoMapper.insert(demo);
    }
}

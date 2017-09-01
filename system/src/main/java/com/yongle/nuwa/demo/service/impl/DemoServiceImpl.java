package com.yongle.nuwa.demo.service.impl;

import com.yongle.nuwa.demo.mapper.DemoMapper;
import com.yongle.nuwa.demo.service.DemoService;
import com.yongle.nuwa.model.demo.Demo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * 类 名 称：DemoServiceImpl.java
 * 功能说明：
 * 开发人员：weinh
 * 开发时间：2017年08月31日
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    DemoMapper demoMapper;

    @Resource(name = "fooDataSource")
    DataSource dataSource;

    @Override
    public Demo getDemo() {
        return demoMapper.selectByPrimaryKey(0L);
    }
}

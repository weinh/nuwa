package com.yongle.nuwa.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yongle.nuwa.demo.mapper.DemoMapper;
import com.yongle.nuwa.demo.service.DemoService;
import com.yongle.nuwa.model.demo.Demo;
import com.yongle.nuwa.model.demo.DemoExample;
import com.yongle.nuwa.model.vo.Paging;
import com.yongle.nuwa.model.vo.ResultVO;
import com.yongle.nuwa.service.impl.BaseServiceImpl;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 类 名 称：DemoServiceImpl.java
 * 功能说明：
 * 开发人员：weinh
 * 开发时间：2017年09月02日
 */
@Service
public class DemoServiceImpl extends BaseServiceImpl implements DemoService {

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

    @Override
    @Transactional
    public void testA() {
        Demo demo = new Demo();
        demo.setName("A");
        demoMapper.insert(demo);
        DemoService demoService = (DemoService) AopContext.currentProxy();
        demoService.testB();
//        testB();
        throw new Error("B出错了");
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void testB() {
        Demo demo = new Demo();
        demo.setName("B");
        demoMapper.insert(demo);
    }

    @Override
    public ResultVO insert(Demo demo) {
        ResultVO<Demo> vo = new ResultVO<>();
        demoMapper.insert(demo);
        vo.setData(demo);
        return vo;
    }

    @Override
    public ResultVO<Paging<Demo>> list() {
        DemoExample example = new DemoExample();
        PageHelper.startPage(1, 10);
        List<Demo> demos = demoMapper.selectByExample(example);
        Paging<Demo> paging = new Paging<>(new PageInfo<>(demos));
        ResultVO<Paging<Demo>> vo = new ResultVO<>();
        vo.setData(paging);
        return vo;
    }

}

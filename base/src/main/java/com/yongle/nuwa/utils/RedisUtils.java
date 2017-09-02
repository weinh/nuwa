package com.yongle.nuwa.utils;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * 类 名 称：RedisUtils.java
 * 功能说明：
 * 开发人员：weinh
 * 开发时间：2017年09月02日
 */
@Service
public class RedisUtils {
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @PostConstruct
    private void init() {
        stringRedisTemplate.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());
    }
}

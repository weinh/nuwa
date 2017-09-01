package com.yongle.nuwa.utils;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.stereotype.Service;

/**
 * 类 名 称：MapperScannerConfigurerEX.java
 * 功能说明：
 * 开发人员：weinh
 * 开发时间：2017年09月01日
 */
@Service
public class MapperScannerConfigurerEX extends MapperScannerConfigurer {
    public MapperScannerConfigurerEX(){
        super.setBasePackage("com.yongle.nuwa.*.mapper");
    }
}

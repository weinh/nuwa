package com.yongle.nuwa.utils;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * 类 名 称：DataSourceEX.java
 * 功能说明：
 * 开发人员：weinh
 * 开发时间：2017年09月01日
 */
//@Configuration
public class DataSourceEX {
    @Bean
    @Primary
    @ConfigurationProperties("app.datasource.foo")
    public DataSourceProperties fooDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    @ConfigurationProperties("app.datasource.foo")
    public DataSource fooDataSource() {
        return fooDataSourceProperties().initializeDataSourceBuilder().build();
    }

    @Bean
    @ConfigurationProperties("app.datasource.bar")
    public DataSourceProperties barDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @ConfigurationProperties("app.datasource.bar")
    public DataSource barDataSource() {
        return barDataSourceProperties().initializeDataSourceBuilder().build();
    }
}

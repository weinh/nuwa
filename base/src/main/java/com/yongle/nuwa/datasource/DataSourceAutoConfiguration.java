package com.yongle.nuwa.datasource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * 类 名 称：DataSourceAutoConfiguration.java
 * 功能说明：
 * 开发人员：weinh
 * 开发时间：2017年09月01日
 */
@Configuration
@EnableConfigurationProperties(MultiDataSourceProperties.class)
public class DataSourceAutoConfiguration {
    @Resource
    private MultiDataSourceProperties properties;

    @Bean(name = "readDataSources")
    public List<DataSource> readDataSources() {
        List<DataSource> dataSources = new ArrayList<>(properties.getRead().size());
        for (DataSourceProperties dataSourceProperties : properties.getRead()) {
            dataSources.add(dataSourceProperties.initializeDataSourceBuilder().
                    type(properties.getType()).build());
        }
        return dataSources;
    }

    @Bean(name = "writeDataSource")
    @Primary
    public DataSource writeDataSource() {
        return properties.getWrite().initializeDataSourceBuilder().
                type(properties.getType()).build();
    }
}

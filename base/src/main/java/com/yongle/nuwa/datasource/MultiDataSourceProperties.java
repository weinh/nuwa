package com.yongle.nuwa.datasource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.sql.DataSource;
import java.util.List;

/**
 * 类 名 称：MultiDataSourceProperties.java
 * 功能说明：
 * 开发人员：weinh
 * 开发时间：2017年09月01日
 */
@ConfigurationProperties(prefix = "datasource")
public class MultiDataSourceProperties {
    private Class<? extends DataSource> type;
    private List<DataSourceProperties> read;
    private DataSourceProperties write;

    public DataSourceProperties getWrite() {
        return write;
    }

    public void setWrite(DataSourceProperties write) {
        this.write = write;
    }

    public List<DataSourceProperties> getRead() {
        return read;
    }

    public void setRead(List<DataSourceProperties> read) {
        this.read = read;
    }

    public Class<? extends DataSource> getType() {
        return type;
    }

    public void setType(Class<? extends DataSource> type) {
        this.type = type;
    }

}

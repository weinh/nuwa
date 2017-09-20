package com.yongle.nuwa.datasource;

import com.yongle.nuwa.utils.SpringContextHolder;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;

import javax.annotation.PostConstruct;

/**
 * 类 名 称：DynamicDataSourceTransactionManager.java
 * 功能说明：
 * 开发人员：weinh
 * 开发时间：2017年09月19日
 */
//@Service
public class DynamicDataSourceTransactionManager extends DataSourceTransactionManager {

    /**
     * 只读事务到读库，读写事务到写库
     *
     * @param transaction
     * @param definition
     */
    @Override
    protected void doBegin(Object transaction, TransactionDefinition definition) {
        //设置数据源
        boolean readOnly = definition.isReadOnly();
        if (readOnly) {
            DynamicDataSourceHolder.putDataSource(DynamicDataSourceGlobal.READ);
        } else {
            DynamicDataSourceHolder.putDataSource(DynamicDataSourceGlobal.WRITE);
        }
        super.doBegin(transaction, definition);
    }

    /**
     * 清理本地线程的数据源
     *
     * @param transaction
     */
    @Override
    protected void doCleanupAfterCompletion(Object transaction) {
        super.doCleanupAfterCompletion(transaction);
        DynamicDataSourceHolder.clearDataSource();
    }

    @PostConstruct
    public void abc() {
        setDataSource(SpringContextHolder.getBean(DynamicDataSource.class));
    }
}

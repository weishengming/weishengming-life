package com.weishengming.lifeservice.datasources;

import org.springframework.transaction.TransactionException;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * 在手写事务执行初修改数据源为master
 * @author yangtianci
 * @version $Id: DataSourceTransactionTemplate.java, v 0.1 2016年6月1日 下午3:48:49 yangtianci Exp $
 */
public class DataSourceTransactionTemplate extends TransactionTemplate {

    /**  */
    private static final long serialVersionUID = 7978292239094603798L;

    /**
     * 执行事务初设置数据源
     * @see org.springframework.transaction.support.TransactionTemplate#execute(org.springframework.transaction.support.TransactionCallback)
     */
    @Override
    public <T> T execute(TransactionCallback<T> action) throws TransactionException {
        DataSourceSwitcher.setMasterWithDontChangeSetMode();//设置为主数据库
        return super.execute(action);
    }
}

package com.weishengming.lifeservice.datasources;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 动态数据源
 * @author yangtianci
 * @version $Id: DynamicDataSource.java, v 0.1 2016年6月1日 下午3:49:07 yangtianci Exp $
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    /** 
     * @see org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource#determineCurrentLookupKey()
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceSwitcher.getDataSource();
    }

}

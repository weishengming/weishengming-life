package com.weishengming.lifeservice.datasources;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

/**
 * 数据源选择线程控制器
 * @author yangtianci
 * @version $Id: DataSourceSwitcher.java, v 0.1 2016年6月1日 下午3:48:28 yangtianci Exp $
 */
public class DataSourceSwitcher {
    public static final Logger                LOGGER                  = LoggerFactory
        .getLogger(DataSourceSwitcher.class);
    /**
     * 数据源线程控制器
     */
    private static final ThreadLocal<String>  dataSourceContextHolder = new ThreadLocal<String>();
    /**
     * 手动设置方式控制器
     */
    private static final ThreadLocal<Boolean> manualModeContextHolder = new ThreadLocal<Boolean>();

    /**
     * 设置数据源
     * 
     * @param dataSource
     */
    public static void setDataSource(String dataSource) {
        Assert.notNull(dataSource, "dataSource can not be null");
        dataSourceContextHolder.set(dataSource);
    }

    /**
     * 设置数据源方式
     * 
     * @param manualMode
     */
    private static void setDataSourceMode(Boolean manualMode) {
        if (null == manualMode || !manualMode) {
            manualModeContextHolder.remove();
        } else {
            manualModeContextHolder.set(manualMode);
        }
    }

    /**
     * 手动方式强制指定为主数据源
     */
    public static void setMaster() {
        setDataSource("master");
        setDataSourceMode(true);//设置为手动强制为master
    }

    /**
     * 自动设置数据源为主数据源，但不修改设置方式
     * 
     */
    public static void setMasterWithDontChangeSetMode() {
        setDataSource("master");
    }

    /**
     * 清除数据源
     */
    private static void clearDataSource() {
        dataSourceContextHolder.remove();
    }

    /**
     * 手动方式强制指定为从数据源
     */
    public static void setSlave() {
        clearDataSource();
        setDataSourceMode(false);//设置为手动强制为slave
    }

    /**
     * 指定方式设置数据源
     * 
     * @param clearSetMode 是否清除设置模式
     */
    public static void setSlaveWithDontChangeSetMode() {
        clearDataSource();
    }

    /**
     * 当前数据源是否是手动强制主数据源方式
     * 
     * @return
     */
    public static boolean isManualMasterMode() {
        Boolean mode = manualModeContextHolder.get();
        return null != mode && mode;
    }

    /**
     * 获取判断是否是从数据源
     * 
     * @return
     */
    public static boolean isSlave() {
        return null == dataSourceContextHolder.get();
    }

    /**
     * 获取数据源
     * 
     * @return
     */
    public static String getDataSource() {
        String strDataSoruce = dataSourceContextHolder.get();
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("datasource is {}", StringUtils.isEmpty(strDataSoruce) ? "slave" : strDataSoruce);
        }
        return strDataSoruce;
    }
}

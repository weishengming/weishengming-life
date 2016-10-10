package com.weishengming.lifeservice.datasources;

import java.util.HashMap;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

import com.zaxxer.hikari.HikariDataSource;

/**
 * 数据源
 * @author yangtianci
 * @version $Id: DataSourcesConfig.java, v 0.1 2016年6月1日 下午3:48:13 yangtianci Exp $
 */
@Configuration
@MapperScan("com.fenqifu.jpushservice.dao.mapper")
public class DataSourcesConfig {
    //主数据库连接
    @Value("${datasource.master.jdbcUrl}")
    private String  jdbcUrlMaster;
    @Value("${datasource.master.username}")
    private String  usernameMaster;
    @Value("${datasource.master.password}")
    private String  passwordMaster;
    //从数据库连接
    @Value("${datasource.slave.jdbcUrl}")
    private String  jdbcUrlSlave;
    @Value("${datasource.slave.username}")
    private String  usernameSlave;
    @Value("${datasource.slave.password}")
    private String  passwordSlave;
    //数据库公共配置
    @Value("${datasource.driverClassName}")
    private String  driverClassName;
    @Value("${datasource.connectionTestQuery}")
    private String  connectionTestQuery;
    @Value("${datasource.connectionTimeoutMs}")
    private Long    connectionTimeoutMs;
    @Value("${datasource.idleTimeoutMs}")
    private Long    idleTimeoutMs;
    @Value("${datasource.maxLifetimeMs}")
    private Long    maxLifetimeMs;
    @Value("${datasource.maxPoolSize}")
    private Integer maxPoolSize;
    @Value("${datasource.minIdle}")
    private Integer minIdle;

    //事务超时
    @Value("${datasource.transactionTimeoutS}")
    private Integer transactionTimeoutS;

    /**
     * 获取返回数据源
     * 
     * @return
     */
    private HikariDataSource getAbstractDataSource() {
        final HikariDataSource ds = new HikariDataSource();
        ds.setDriverClassName(this.driverClassName);
        ds.setConnectionTestQuery(this.connectionTestQuery);
        ds.setConnectionTimeout(this.connectionTimeoutMs);
        ds.setIdleTimeout(this.idleTimeoutMs);
        ds.setMaxLifetime(this.maxLifetimeMs);
        ds.setMaximumPoolSize(this.maxPoolSize);
        ds.setMinimumIdle(this.minIdle);
        return ds;
    }

    /**
     * 主数据库数据源
     * 
     * @return
     */
    @Bean(name = "masterDataSource")
    public DataSource getMasterDataSource() {
        HikariDataSource ds = this.getAbstractDataSource();
        ds.setJdbcUrl(this.jdbcUrlMaster);
        ds.setUsername(this.usernameMaster);
        ds.setPassword(this.passwordMaster);
        return ds;
    }

    /**
     * 从数据库数据源
     * 
     * @return
     */
    @Bean(name = "slaveDataSource")
    public DataSource getSlaveDataSource() {
        HikariDataSource ds = this.getAbstractDataSource();
        ds.setJdbcUrl(this.jdbcUrlSlave);
        ds.setUsername(this.usernameSlave);
        ds.setPassword(this.passwordSlave);
        return ds;
    }

    /**
     * 获取动态数据源实现类
     * 
     * @return
     */
    @Bean(name = "dataSource")
    public DynamicDataSource getDynamicDataSource() {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        //默认主数据源
        dynamicDataSource.setDefaultTargetDataSource(this.getSlaveDataSource());
        dynamicDataSource.setTargetDataSources(new HashMap<Object, Object>() {

            /**  */
            private static final long serialVersionUID = 1L;
            {
                this.put("master", getMasterDataSource());
            }
        });
        return dynamicDataSource;
    }

    /**
     * 数据源事务管理器
     * 
     * @return
     */
    @Bean
    public DataSourceTransactionManager getTransactionManager() {
        return new DataSourceTransactionManager(getDynamicDataSource());
    }

    /**
     * 编程式事务
     * 
     * @return
     */
    @Bean
    public TransactionTemplate getTransactionTemplate() {
        DataSourceTransactionTemplate transactionTemplate = new DataSourceTransactionTemplate();
        transactionTemplate.setTimeout(this.transactionTimeoutS);
        transactionTemplate.setTransactionManager(this.getTransactionManager());
        return transactionTemplate;
    }

    /**
     * mybatis 的sessionFactory
     * 
     * @return
     * @throws Exception
     */
    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(this.getDynamicDataSource());
        //扫描mapper.xml
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:sqlmap/*.xml"));

        return sqlSessionFactoryBean.getObject();
    }
}

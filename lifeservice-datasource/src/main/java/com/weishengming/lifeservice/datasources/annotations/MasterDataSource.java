package com.weishengming.lifeservice.datasources.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 主数据源注解  方法上不加注解时，默认为slave
 * @author yangtianci
 * @version $Id: MasterDataSource.java, v 0.1 2016年6月1日 下午3:47:31 yangtianci Exp $
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MasterDataSource {

}

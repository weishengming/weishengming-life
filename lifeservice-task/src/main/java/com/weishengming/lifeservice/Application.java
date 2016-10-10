package com.weishengming.lifeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 程序主入口
 * @author byshome
 * @version $Id: Application.java, v 0.1 2015年9月9日 下午3:10:46 byshome Exp $
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
@ComponentScan(value = { "com.weishengming.lifeservice", "springfox.documentation" })
@EnableScheduling
public class Application {

    /**
     * 程序入口
     * 
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.run(args);
    }

}

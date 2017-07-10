package com.weishengming.lifeservice;

import com.weishengming.hessian.lifeservice.api.service.UserInfoMongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.weishengming.hessian.lifeservice.api.service.ArticleService;
import com.weishengming.hessian.lifeservice.api.service.UserService;
import com.weishengming.lifeservice.interceptors.TrackNoInterceptor;

/**
 * 消息配送接口
 * @author yangtianci
 * @version $Id: Application.java, v 0.1 2016年6月3日 下午2:18:53 yangtianci Exp $
 */
@SpringBootApplication
//需要排除掉自动配置数据源项
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
@EnableMongoRepositories(basePackages = "com.weishengming.mongo")
//需要扫描当前jar及数据源jar 及需要扫描springfox
@ComponentScan(value = { "com.weishengming.lifeservice" })
public class Application extends WebMvcConfigurerAdapter {
    @Autowired
    private TrackNoInterceptor trackNoInterceptor;
    @Autowired
    private UserService        userService;
    @Autowired
    private ArticleService     articleService;
    @Autowired
    private UserInfoMongoService     userInfoMongoService;

    @Bean(name = "/userService")
    public HessianServiceExporter userService() {
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(userService);
        exporter.setServiceInterface(UserService.class);
        return exporter;
    }

    @Bean(name = "/articleService")
    public HessianServiceExporter articleService() {
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(articleService);
        exporter.setServiceInterface(ArticleService.class);
        return exporter;
    }
    @Bean(name = "/userInfoMongoService")
    public HessianServiceExporter userInfoMongoService() {
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(userInfoMongoService);
        exporter.setServiceInterface(UserInfoMongoService.class);
        return exporter;
    }

    /**
     * 程序入口
     * 
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.run(args);
    }

    /**
    * 拦截器
    * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addInterceptors(org.springframework.web.servlet.config.annotation.InterceptorRegistry)
    */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //不能把error也进入拦截器，否则trackNo会被重置了
        //        registry.addInterceptor(this.trackNoInterceptor).excludePathPatterns("/error", "/configuration/**",
        //            "/swagger**", "/webjars**", "/v2/**");
    }

}

package com.weishengming.lifeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 极光推送消息的程序入口
 * @author yangtianci
 * @version $Id: Application.java, v 0.1 2016年6月3日 下午2:18:53 yangtianci Exp $
 */
@SpringBootApplication
//需要排除掉自动配置数据源项
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
//需要扫描当前jar及数据源jar 及需要扫描springfox
@ComponentScan(value = { "com.weishengming.lifeservice" })
public class Application extends WebMvcConfigurerAdapter {
    //    @Autowired
    //    private TrackNoInterceptor     trackNoInterceptor;
    //    @Autowired
    //    private JPushUserService       jPushUserService;
    //    @Autowired
    //    private JPushMsgService        jPushMsgService;
    //    @Autowired
    //    private JPushOrderMsgService   jPushOrderMsgService;
    //
    //    @Autowired
    //    private JPushUserStatusService jPushUserStatusService;

    /**
     * 程序入口
     * 
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.run(args);
    }

    //    @Bean(name = "/jPushUserStatusService")
    //    public HessianServiceExporter jPushUserStatusService() {
    //        HessianServiceExporter exporter = new HessianServiceExporter();
    //        exporter.setService(jPushUserStatusService);
    //        exporter.setServiceInterface(JPushUserStatusService.class);
    //        return exporter;
    //    }

    /**
    * 拦截器
    * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addInterceptors(org.springframework.web.servlet.config.annotation.InterceptorRegistry)
    */
    //    @Override
    //    public void addInterceptors(InterceptorRegistry registry) {
    //        //不能把error也进入拦截器，否则trackNo会被重置了
    //        registry.addInterceptor(this.trackNoInterceptor).excludePathPatterns("/error", "/configuration/**",
    //            "/swagger**", "/webjars**", "/v2/**");
    //    }

}

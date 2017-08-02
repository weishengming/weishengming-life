package com.weishengming.lifeservice.crons;

import com.weishengming.lifeservice.service.UserInfoCronService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 用户定时任务
 * @author yangtianci
 * @version $Id: UserPointCornCron.java, v 0.1 2017年3月8日 下午3:33:49 yangtianci Exp $
 */
@Component
public class UserInfoCorn {

    @Autowired
    private UserInfoCronService userInfoCronService;


    /**
     * 正常环境下的初始化,
     */
    @Scheduled(cron = "*/5 * * * * ?")
    public void redisInit() {
        userInfoCronService.testAA();
    }



}

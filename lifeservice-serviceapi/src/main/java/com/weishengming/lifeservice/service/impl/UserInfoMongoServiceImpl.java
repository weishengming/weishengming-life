package com.weishengming.lifeservice.service.impl;

import com.weishengming.hessian.lifeservice.api.service.UserInfoMongoService;
import com.weishengming.hessian.lifeservice.api.service.UserService;
import com.weishengming.mongo.entities.UserInfo;
import com.weishengming.mongo.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yangtianci on 2017/7/10.
 *
 * 测试mongo
 */
@Service("userInfoMongoService")
public class UserInfoMongoServiceImpl  implements UserInfoMongoService {
    @Autowired
    private UserInfoRepository userInfoRepository;


    @Override
    public Integer insert(String userName, String passwordMd5) {
        UserInfo userInfo=new UserInfo();
        userInfo.setUserName(userName);
        userInfo.setPasswordMd5(passwordMd5);
        userInfoRepository.insert(userInfo);
        return 1;
    }
}

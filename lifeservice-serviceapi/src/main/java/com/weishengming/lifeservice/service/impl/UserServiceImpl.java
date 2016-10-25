package com.weishengming.lifeservice.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weishengming.hessian.lifeservice.api.service.UserService;
import com.weishengming.lifeservice.dao.entities.User;
import com.weishengming.lifeservice.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository      userRepository;

    @Override
    public Integer saveUser(String trueName, String password, String idCard, String mobile) {
        User user = new User();
        user.setTrueName(trueName);
        user.setIdCard(idCard);
        user.setMobile(Integer.parseInt(mobile));
        user.setPassWord(password);
        logger.error("保存用户{}", user.toString());
        return userRepository.save(user);
    }

}

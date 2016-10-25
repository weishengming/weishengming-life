package com.weishengming.lifeservice.repository.impl;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.weishengming.lifeservice.dao.entities.User;
import com.weishengming.lifeservice.dao.mapper.UserMapper;
import com.weishengming.lifeservice.repository.UserRepository;
import com.weishengming.lifeservice.utils.UUIDUtil;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer save(User user) {
        if (null == user.getUserId()) {
            user.setCreateTime(new Date());
            user.setLastModifyTime(new Date());
            user.setUserId(UUIDUtil.getUUID());
            return userMapper.insert(user);
        } else {
            User newUser = userMapper.selectByPrimaryKey(user.getUserId());
            BeanUtils.copyProperties(user, newUser);
            newUser.setLastModifyTime(new Date());
            return userMapper.updateByPrimaryKey(newUser);
        }
    }

}

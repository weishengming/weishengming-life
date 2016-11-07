package com.weishengming.lifeservice.repository.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.weishengming.lifeservice.dao.entities.User;
import com.weishengming.lifeservice.dao.entities.UserExample;
import com.weishengming.lifeservice.dao.mapper.UserMapper;
import com.weishengming.lifeservice.repository.UserRepository;
import com.weishengming.lifeservice.utils.UUIDUtil;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer save(User user) {
        if (null == user.getRecordId()) {
            user.setCreateTime(new Date());
            user.setLastModifyTime(new Date());
            user.setUserId(UUIDUtil.getUUID());
            user.setStatus(1);
            return userMapper.insert(user);
        } else {
            User newUser = userMapper.selectByPrimaryKey(user.getRecordId());
            BeanUtils.copyProperties(user, newUser);
            newUser.setLastModifyTime(new Date());
            return userMapper.updateByPrimaryKey(newUser);
        }
    }

    @Override
    public Boolean checkMobile(String mobile) {
        UserExample example = new UserExample();
        example.createCriteria().andMobileEqualTo(mobile);//新增的模板
        List<User> list = userMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(list)) {
            return false;
        }
        return true;
    }

    @Override
    public Boolean checkMobileAndPassword(String mobile, String password) {
        UserExample example = new UserExample();
        example.createCriteria().andMobileEqualTo(mobile).andPasswordEqualTo(password);
        List<User> list = userMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(list)) {
            return true;
        }
        return false;
    }

    @Override
    public User findOneByMobile(String mobile) {
        UserExample example = new UserExample();
        example.createCriteria().andMobileEqualTo(mobile);
        List<User> list = userMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(list)) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public User findOneByUserId(String userId) {
        UserExample example = new UserExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<User> list = userMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(list)) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public Integer updateName(String userId, String name) {
        return userMapper.updateNameByUserId(userId, name);
    }

    @Override
    public Integer updateAge(String userId, String age) {
        return userMapper.updateAgeByUserId(userId, age);
    }

    @Override
    public Integer updateSign(String userId, String sign) {
        return userMapper.updateSignByUserId(userId, sign);
    }

    @Override
    public Integer updateSex(String userId, String sex) {
        return userMapper.updateSexByUserId(userId, sex);
    }
}

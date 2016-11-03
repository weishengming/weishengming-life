package com.weishengming.lifeservice.repository;

import com.weishengming.lifeservice.dao.entities.User;

public interface UserRepository {

    public Integer save(User user);

    public Boolean checkMobile(String mobile);

    public Boolean checkMobileAndPassword(String mobile, String password);

    public User findOneByMobile(String mobile);

    public User findOneByUserId(String userId);

}

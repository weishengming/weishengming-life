package com.weishengming.lifeservice.repository;

import com.weishengming.lifeservice.dao.entities.User;

public interface UserRepository {

    /**
     * 保存用户
     */
    public Integer save(User user);

}

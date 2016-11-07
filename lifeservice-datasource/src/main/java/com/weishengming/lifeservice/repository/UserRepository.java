package com.weishengming.lifeservice.repository;

import com.weishengming.lifeservice.dao.entities.User;

public interface UserRepository {

    public Integer save(User user);

    public Boolean checkMobile(String mobile);

    public Boolean checkMobileAndPassword(String mobile, String password);

    public User findOneByMobile(String mobile);

    public User findOneByUserId(String userId);

    public Integer updateName(String userId, String name);

    public Integer updateAge(String userId, String age);

    public Integer updateSign(String userId, String sign);

    public Integer updateSex(String userId, String sex);

    public Integer updateAddress(String userId, String prov, String city, String county, String address);

}

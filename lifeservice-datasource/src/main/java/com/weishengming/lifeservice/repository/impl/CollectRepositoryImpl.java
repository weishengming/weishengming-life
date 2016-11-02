package com.weishengming.lifeservice.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.weishengming.lifeservice.dao.mapper.CollectMapper;
import com.weishengming.lifeservice.repository.CollectRepository;

@Repository
public class CollectRepositoryImpl implements CollectRepository {
    @Autowired
    private CollectMapper collectMapper;

}

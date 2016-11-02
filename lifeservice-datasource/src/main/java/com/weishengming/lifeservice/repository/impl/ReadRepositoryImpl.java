package com.weishengming.lifeservice.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.weishengming.lifeservice.dao.mapper.ReadMapper;
import com.weishengming.lifeservice.repository.ReadRepository;

@Repository
public class ReadRepositoryImpl implements ReadRepository {
    @Autowired
    private ReadMapper readMapper;

}

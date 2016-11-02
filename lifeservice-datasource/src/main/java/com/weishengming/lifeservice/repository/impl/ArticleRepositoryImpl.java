package com.weishengming.lifeservice.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.weishengming.lifeservice.dao.mapper.ArticleMapper;
import com.weishengming.lifeservice.repository.ArticleRepository;

@Repository
public class ArticleRepositoryImpl implements ArticleRepository {
    @Autowired
    private ArticleMapper articleMapper;

}

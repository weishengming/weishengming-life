package com.weishengming.lifeservice.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weishengming.hessian.lifeservice.api.service.ArticleService;
import com.weishengming.lifeservice.repository.UserRepository;

@Service("articleService")
public class ArticleServiceImpl implements ArticleService {
    private static final Logger logger = LoggerFactory.getLogger(ArticleServiceImpl.class);

    @Autowired
    private UserRepository      userRepository;

}

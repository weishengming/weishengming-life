package com.weishengming.lifeservice.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.weishengming.lifeservice.dao.mapper.CommentMapper;
import com.weishengming.lifeservice.repository.CommentRepository;

@Repository
public class CommentRepositoryImpl implements CommentRepository {
    @Autowired
    private CommentMapper commentMapper;

}

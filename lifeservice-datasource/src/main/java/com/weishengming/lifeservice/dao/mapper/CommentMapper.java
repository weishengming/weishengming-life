package com.weishengming.lifeservice.dao.mapper;

import com.weishengming.lifeservice.dao.entities.Comment;
import com.weishengming.lifeservice.dao.entities.CommentExample;
import com.weishengming.lifeservice.datasources.annotations.MasterDataSource;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 评论表
 * t_comment
 */
public interface CommentMapper {
    /**
     * 获取符合条件的记录数
     * t_comment
     */
    int countByExample(@Param("example") CommentExample example);

    /**
     * 删除符合条件的记录
     * t_comment
     */
    @MasterDataSource
    int deleteByExample(@Param("example") CommentExample example);

    /**
     * 删除指定主键的记录
     * t_comment
     */
    @MasterDataSource
    int deleteByPrimaryKey(@Param("recordId") Long recordId);

    /**
     * 新增记录
     * t_comment
     */
    @MasterDataSource
    int insert(@Param("record") Comment record);

    /**
     * 选择性字段新增记录
     * t_comment
     */
    @MasterDataSource
    int insertSelective(@Param("record") Comment record);

    /**
     * 获取指定条件的记录
     * t_comment
     */
    List<Comment> selectByExample(@Param("example") CommentExample example);

    /**
     * 获取指定主键的记录
     * t_comment
     */
    Comment selectByPrimaryKey(@Param("recordId") Long recordId);

    /**
     * 选择性字段更新指定条件的记录
     * t_comment
     */
    @MasterDataSource
    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     * 更新指定条件的记录
     * t_comment
     */
    @MasterDataSource
    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     * 选择性字段更新指定主键的记录
     * t_comment
     */
    @MasterDataSource
    int updateByPrimaryKeySelective(@Param("record") Comment record);

    /**
     * 更新指定主键的记录
     * t_comment
     */
    @MasterDataSource
    int updateByPrimaryKey(@Param("record") Comment record);
}
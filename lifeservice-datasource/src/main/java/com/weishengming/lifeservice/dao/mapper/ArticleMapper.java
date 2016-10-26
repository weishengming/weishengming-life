package com.weishengming.lifeservice.dao.mapper;

import com.weishengming.lifeservice.dao.entities.Article;
import com.weishengming.lifeservice.dao.entities.ArticleExample;
import com.weishengming.lifeservice.datasources.annotations.MasterDataSource;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 文章表
 * t_article
 */
public interface ArticleMapper {
    /**
     * 获取符合条件的记录数
     * t_article
     */
    int countByExample(@Param("example") ArticleExample example);

    /**
     * 删除符合条件的记录
     * t_article
     */
    @MasterDataSource
    int deleteByExample(@Param("example") ArticleExample example);

    /**
     * 删除指定主键的记录
     * t_article
     */
    @MasterDataSource
    int deleteByPrimaryKey(@Param("recordId") Long recordId);

    /**
     * 新增记录
     * t_article
     */
    @MasterDataSource
    int insert(@Param("record") Article record);

    /**
     * 选择性字段新增记录
     * t_article
     */
    @MasterDataSource
    int insertSelective(@Param("record") Article record);

    /**
     * 获取指定条件的记录
     * t_article
     */
    List<Article> selectByExample(@Param("example") ArticleExample example);

    /**
     * 获取指定主键的记录
     * t_article
     */
    Article selectByPrimaryKey(@Param("recordId") Long recordId);

    /**
     * 选择性字段更新指定条件的记录
     * t_article
     */
    @MasterDataSource
    int updateByExampleSelective(@Param("record") Article record, @Param("example") ArticleExample example);

    /**
     * 更新指定条件的记录
     * t_article
     */
    @MasterDataSource
    int updateByExample(@Param("record") Article record, @Param("example") ArticleExample example);

    /**
     * 选择性字段更新指定主键的记录
     * t_article
     */
    @MasterDataSource
    int updateByPrimaryKeySelective(@Param("record") Article record);

    /**
     * 更新指定主键的记录
     * t_article
     */
    @MasterDataSource
    int updateByPrimaryKey(@Param("record") Article record);
}
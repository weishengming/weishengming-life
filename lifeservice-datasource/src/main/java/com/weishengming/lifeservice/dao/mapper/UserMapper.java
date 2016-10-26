package com.weishengming.lifeservice.dao.mapper;

import com.weishengming.lifeservice.dao.entities.User;
import com.weishengming.lifeservice.dao.entities.UserExample;
import com.weishengming.lifeservice.datasources.annotations.MasterDataSource;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 用户表
 * t_user
 */
public interface UserMapper {
    /**
     * 获取符合条件的记录数
     * t_user
     */
    int countByExample(@Param("example") UserExample example);

    /**
     * 删除符合条件的记录
     * t_user
     */
    @MasterDataSource
    int deleteByExample(@Param("example") UserExample example);

    /**
     * 删除指定主键的记录
     * t_user
     */
    @MasterDataSource
    int deleteByPrimaryKey(@Param("recordId") Long recordId);

    /**
     * 新增记录
     * t_user
     */
    @MasterDataSource
    int insert(@Param("record") User record);

    /**
     * 选择性字段新增记录
     * t_user
     */
    @MasterDataSource
    int insertSelective(@Param("record") User record);

    /**
     * 获取指定条件的记录
     * t_user
     */
    List<User> selectByExample(@Param("example") UserExample example);

    /**
     * 获取指定主键的记录
     * t_user
     */
    User selectByPrimaryKey(@Param("recordId") Long recordId);

    /**
     * 选择性字段更新指定条件的记录
     * t_user
     */
    @MasterDataSource
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * 更新指定条件的记录
     * t_user
     */
    @MasterDataSource
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * 选择性字段更新指定主键的记录
     * t_user
     */
    @MasterDataSource
    int updateByPrimaryKeySelective(@Param("record") User record);

    /**
     * 更新指定主键的记录
     * t_user
     */
    @MasterDataSource
    int updateByPrimaryKey(@Param("record") User record);
}
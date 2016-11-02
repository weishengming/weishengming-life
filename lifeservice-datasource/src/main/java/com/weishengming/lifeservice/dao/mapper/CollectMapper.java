package com.weishengming.lifeservice.dao.mapper;

import com.weishengming.lifeservice.dao.entities.Collect;
import com.weishengming.lifeservice.dao.entities.CollectExample;
import com.weishengming.lifeservice.datasources.annotations.MasterDataSource;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 收藏表
 * t_collect
 */
public interface CollectMapper {
    /**
     * 获取符合条件的记录数
     * t_collect
     */
    int countByExample(@Param("example") CollectExample example);

    /**
     * 删除符合条件的记录
     * t_collect
     */
    @MasterDataSource
    int deleteByExample(@Param("example") CollectExample example);

    /**
     * 删除指定主键的记录
     * t_collect
     */
    @MasterDataSource
    int deleteByPrimaryKey(@Param("recordId") Long recordId);

    /**
     * 新增记录
     * t_collect
     */
    @MasterDataSource
    int insert(@Param("record") Collect record);

    /**
     * 选择性字段新增记录
     * t_collect
     */
    @MasterDataSource
    int insertSelective(@Param("record") Collect record);

    /**
     * 获取指定条件的记录
     * t_collect
     */
    List<Collect> selectByExample(@Param("example") CollectExample example);

    /**
     * 获取指定主键的记录
     * t_collect
     */
    Collect selectByPrimaryKey(@Param("recordId") Long recordId);

    /**
     * 选择性字段更新指定条件的记录
     * t_collect
     */
    @MasterDataSource
    int updateByExampleSelective(@Param("record") Collect record, @Param("example") CollectExample example);

    /**
     * 更新指定条件的记录
     * t_collect
     */
    @MasterDataSource
    int updateByExample(@Param("record") Collect record, @Param("example") CollectExample example);

    /**
     * 选择性字段更新指定主键的记录
     * t_collect
     */
    @MasterDataSource
    int updateByPrimaryKeySelective(@Param("record") Collect record);

    /**
     * 更新指定主键的记录
     * t_collect
     */
    @MasterDataSource
    int updateByPrimaryKey(@Param("record") Collect record);
}
package com.weishengming.lifeservice.dao.mapper;

import com.weishengming.lifeservice.dao.entities.Read;
import com.weishengming.lifeservice.dao.entities.ReadExample;
import com.weishengming.lifeservice.datasources.annotations.MasterDataSource;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 阅读表
 * t_read
 */
public interface ReadMapper {
    /**
     * 获取符合条件的记录数
     * t_read
     */
    int countByExample(@Param("example") ReadExample example);

    /**
     * 删除符合条件的记录
     * t_read
     */
    @MasterDataSource
    int deleteByExample(@Param("example") ReadExample example);

    /**
     * 删除指定主键的记录
     * t_read
     */
    @MasterDataSource
    int deleteByPrimaryKey(@Param("recordId") Long recordId);

    /**
     * 新增记录
     * t_read
     */
    @MasterDataSource
    int insert(@Param("record") Read record);

    /**
     * 选择性字段新增记录
     * t_read
     */
    @MasterDataSource
    int insertSelective(@Param("record") Read record);

    /**
     * 获取指定条件的记录
     * t_read
     */
    List<Read> selectByExample(@Param("example") ReadExample example);

    /**
     * 获取指定主键的记录
     * t_read
     */
    Read selectByPrimaryKey(@Param("recordId") Long recordId);

    /**
     * 选择性字段更新指定条件的记录
     * t_read
     */
    @MasterDataSource
    int updateByExampleSelective(@Param("record") Read record, @Param("example") ReadExample example);

    /**
     * 更新指定条件的记录
     * t_read
     */
    @MasterDataSource
    int updateByExample(@Param("record") Read record, @Param("example") ReadExample example);

    /**
     * 选择性字段更新指定主键的记录
     * t_read
     */
    @MasterDataSource
    int updateByPrimaryKeySelective(@Param("record") Read record);

    /**
     * 更新指定主键的记录
     * t_read
     */
    @MasterDataSource
    int updateByPrimaryKey(@Param("record") Read record);
}
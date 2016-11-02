package com.weishengming.lifeservice.dao.entities;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.weishengming.utils.jackson.JacksonDateDeserializer;
import com.weishengming.utils.jackson.JacksonDateTimeSerializer;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;

/**
 * 收藏表
 * t_collect
 */
public class Collect {
    /**
     * 记录标识
     * t_collect.RecordId
     */
    private Long recordId;

    /**
     * 文章Id
     * t_collect.ArticleId
     */
    private String articleId;

    /**
     * 收藏人Id
     * t_collect.UserId
     */
    private String userId;

    /**
     * 状态
     * t_collect.Status
     */
    private Integer status;

    /**
     * 创建时间
     * t_collect.CreateTime
     */
    @JsonSerialize(using = JacksonDateTimeSerializer.class)
    @JsonDeserialize(using = JacksonDateDeserializer.class)
    private Date createTime;

    /**
     * 最后修改时间
     * t_collect.LastModifyTime
     */
    @JsonSerialize(using = JacksonDateTimeSerializer.class)
    @JsonDeserialize(using = JacksonDateDeserializer.class)
    private Date lastModifyTime;

    /**
     * 初始化实体对象 主键列不初始化
     */
    public void initWithDefaultValue() {
        this.articleId = StringUtils.EMPTY;
        this.userId = StringUtils.EMPTY;
        this.status = 0;
        this.createTime = new Date();
        this.lastModifyTime = new Date();
    }

    /**
     * 记录标识
     * t_collect.RecordId
     *
     * @return the value of t_collect.RecordId
     */
    public Long getRecordId() {
        return recordId;
    }

    /**
     * 记录标识
     * t_collect.RecordId
     *
     * @param recordId the value for t_collect.RecordId
     */
    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    /**
     * 文章Id
     * t_collect.ArticleId
     *
     * @return the value of t_collect.ArticleId
     */
    public String getArticleId() {
        return articleId;
    }

    /**
     * 文章Id
     * t_collect.ArticleId
     *
     * @param articleId the value for t_collect.ArticleId
     */
    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    /**
     * 收藏人Id
     * t_collect.UserId
     *
     * @return the value of t_collect.UserId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 收藏人Id
     * t_collect.UserId
     *
     * @param userId the value for t_collect.UserId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 状态
     * t_collect.Status
     *
     * @return the value of t_collect.Status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态
     * t_collect.Status
     *
     * @param status the value for t_collect.Status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 创建时间
     * t_collect.CreateTime
     *
     * @return the value of t_collect.CreateTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * t_collect.CreateTime
     *
     * @param createTime the value for t_collect.CreateTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 最后修改时间
     * t_collect.LastModifyTime
     *
     * @return the value of t_collect.LastModifyTime
     */
    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * 最后修改时间
     * t_collect.LastModifyTime
     *
     * @param lastModifyTime the value for t_collect.LastModifyTime
     */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}
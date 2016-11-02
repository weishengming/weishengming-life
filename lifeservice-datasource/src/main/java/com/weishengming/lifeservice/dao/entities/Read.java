package com.weishengming.lifeservice.dao.entities;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.weishengming.utils.jackson.JacksonDateDeserializer;
import com.weishengming.utils.jackson.JacksonDateTimeSerializer;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;

/**
 * 阅读表
 * t_read
 */
public class Read {
    /**
     * 记录标识
     * t_read.RecordId
     */
    private Long recordId;

    /**
     * 文章Id
     * t_read.ArticleId
     */
    private String articleId;

    /**
     * 阅读人Id
     * t_read.UserId
     */
    private String userId;

    /**
     * 状态
     * t_read.Status
     */
    private Integer status;

    /**
     * 创建时间
     * t_read.CreateTime
     */
    @JsonSerialize(using = JacksonDateTimeSerializer.class)
    @JsonDeserialize(using = JacksonDateDeserializer.class)
    private Date createTime;

    /**
     * 最后修改时间
     * t_read.LastModifyTime
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
     * t_read.RecordId
     *
     * @return the value of t_read.RecordId
     */
    public Long getRecordId() {
        return recordId;
    }

    /**
     * 记录标识
     * t_read.RecordId
     *
     * @param recordId the value for t_read.RecordId
     */
    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    /**
     * 文章Id
     * t_read.ArticleId
     *
     * @return the value of t_read.ArticleId
     */
    public String getArticleId() {
        return articleId;
    }

    /**
     * 文章Id
     * t_read.ArticleId
     *
     * @param articleId the value for t_read.ArticleId
     */
    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    /**
     * 阅读人Id
     * t_read.UserId
     *
     * @return the value of t_read.UserId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 阅读人Id
     * t_read.UserId
     *
     * @param userId the value for t_read.UserId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 状态
     * t_read.Status
     *
     * @return the value of t_read.Status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态
     * t_read.Status
     *
     * @param status the value for t_read.Status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 创建时间
     * t_read.CreateTime
     *
     * @return the value of t_read.CreateTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * t_read.CreateTime
     *
     * @param createTime the value for t_read.CreateTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 最后修改时间
     * t_read.LastModifyTime
     *
     * @return the value of t_read.LastModifyTime
     */
    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * 最后修改时间
     * t_read.LastModifyTime
     *
     * @param lastModifyTime the value for t_read.LastModifyTime
     */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}
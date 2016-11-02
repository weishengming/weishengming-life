package com.weishengming.lifeservice.dao.entities;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.weishengming.utils.jackson.JacksonDateDeserializer;
import com.weishengming.utils.jackson.JacksonDateTimeSerializer;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;

/**
 * 评论表
 * t_comment
 */
public class Comment {
    /**
     * 记录标识
     * t_comment.RecordId
     */
    private Long recordId;

    /**
     * 文章Id
     * t_comment.ArticleId
     */
    private String articleId;

    /**
     * 评论人Id
     * t_comment.UserId
     */
    private String userId;

    /**
     * 评论内容
     * t_comment.Content
     */
    private String content;

    /**
     * 状态
     * t_comment.Status
     */
    private Integer status;

    /**
     * 创建时间
     * t_comment.CreateTime
     */
    @JsonSerialize(using = JacksonDateTimeSerializer.class)
    @JsonDeserialize(using = JacksonDateDeserializer.class)
    private Date createTime;

    /**
     * 最后修改时间
     * t_comment.LastModifyTime
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
        this.content = StringUtils.EMPTY;
        this.status = 0;
        this.createTime = new Date();
        this.lastModifyTime = new Date();
    }

    /**
     * 记录标识
     * t_comment.RecordId
     *
     * @return the value of t_comment.RecordId
     */
    public Long getRecordId() {
        return recordId;
    }

    /**
     * 记录标识
     * t_comment.RecordId
     *
     * @param recordId the value for t_comment.RecordId
     */
    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    /**
     * 文章Id
     * t_comment.ArticleId
     *
     * @return the value of t_comment.ArticleId
     */
    public String getArticleId() {
        return articleId;
    }

    /**
     * 文章Id
     * t_comment.ArticleId
     *
     * @param articleId the value for t_comment.ArticleId
     */
    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    /**
     * 评论人Id
     * t_comment.UserId
     *
     * @return the value of t_comment.UserId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 评论人Id
     * t_comment.UserId
     *
     * @param userId the value for t_comment.UserId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 评论内容
     * t_comment.Content
     *
     * @return the value of t_comment.Content
     */
    public String getContent() {
        return content;
    }

    /**
     * 评论内容
     * t_comment.Content
     *
     * @param content the value for t_comment.Content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 状态
     * t_comment.Status
     *
     * @return the value of t_comment.Status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态
     * t_comment.Status
     *
     * @param status the value for t_comment.Status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 创建时间
     * t_comment.CreateTime
     *
     * @return the value of t_comment.CreateTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * t_comment.CreateTime
     *
     * @param createTime the value for t_comment.CreateTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 最后修改时间
     * t_comment.LastModifyTime
     *
     * @return the value of t_comment.LastModifyTime
     */
    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * 最后修改时间
     * t_comment.LastModifyTime
     *
     * @param lastModifyTime the value for t_comment.LastModifyTime
     */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}
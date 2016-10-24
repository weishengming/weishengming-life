package com.weishengming.lifeservice.dao.entities;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.weishengming.utils.jackson.JacksonDateDeserializer;
import com.weishengming.utils.jackson.JacksonDateTimeSerializer;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;

/**
 * 文章表
 * t_article
 */
public class Article {
    /**
     * 文章Id
     * t_article.ArticleId
     */
    private String articleId;

    /**
     * 发布人Id
     * t_article.UserId
     */
    private String userId;

    /**
     * 标题
     * t_article.Title
     */
    private String title;

    /**
     * 内容
     * t_article.Content
     */
    private String content;

    /**
     * 文章状态
     * t_article.Status
     */
    private Integer status;

    /**
     * 创建时间
     * t_article.CreateTime
     */
    @JsonSerialize(using = JacksonDateTimeSerializer.class)
    @JsonDeserialize(using = JacksonDateDeserializer.class)
    private Date createTime;

    /**
     * 最后修改时间
     * t_article.LastModifyTime
     */
    @JsonSerialize(using = JacksonDateTimeSerializer.class)
    @JsonDeserialize(using = JacksonDateDeserializer.class)
    private Date lastModifyTime;

    /**
     * 初始化实体对象 主键列不初始化
     */
    public void initWithDefaultValue() {
        this.userId = StringUtils.EMPTY;
        this.title = StringUtils.EMPTY;
        this.content = StringUtils.EMPTY;
        this.status = 0;
        this.createTime = new Date();
        this.lastModifyTime = new Date();
    }

    /**
     * 文章Id
     * t_article.ArticleId
     *
     * @return the value of t_article.ArticleId
     */
    public String getArticleId() {
        return articleId;
    }

    /**
     * 文章Id
     * t_article.ArticleId
     *
     * @param articleId the value for t_article.ArticleId
     */
    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    /**
     * 发布人Id
     * t_article.UserId
     *
     * @return the value of t_article.UserId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 发布人Id
     * t_article.UserId
     *
     * @param userId the value for t_article.UserId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 标题
     * t_article.Title
     *
     * @return the value of t_article.Title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 标题
     * t_article.Title
     *
     * @param title the value for t_article.Title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 内容
     * t_article.Content
     *
     * @return the value of t_article.Content
     */
    public String getContent() {
        return content;
    }

    /**
     * 内容
     * t_article.Content
     *
     * @param content the value for t_article.Content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 文章状态
     * t_article.Status
     *
     * @return the value of t_article.Status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 文章状态
     * t_article.Status
     *
     * @param status the value for t_article.Status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 创建时间
     * t_article.CreateTime
     *
     * @return the value of t_article.CreateTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * t_article.CreateTime
     *
     * @param createTime the value for t_article.CreateTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 最后修改时间
     * t_article.LastModifyTime
     *
     * @return the value of t_article.LastModifyTime
     */
    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * 最后修改时间
     * t_article.LastModifyTime
     *
     * @param lastModifyTime the value for t_article.LastModifyTime
     */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}
package com.weishengming.lifeservice.dao.entities;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.weishengming.utils.jackson.JacksonDateDeserializer;
import com.weishengming.utils.jackson.JacksonDateTimeSerializer;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;

/**
 * 用户表
 * t_user
 */
public class User {
    /**
     * 记录标识
     * t_user.RecordId
     */
    private Long recordId;

    /**
     * 用户Id[UUID]
     * t_user.UserId
     */
    private String userId;

    /**
     * 用户手机号
     * t_user.Mobile
     */
    private String mobile;

    /**
     * 密码
     * t_user.Password
     */
    private String password;

    /**
     * 用户状态
     * t_user.Status
     */
    private Integer status;

    /**
     * 创建时间
     * t_user.CreateTime
     */
    @JsonSerialize(using = JacksonDateTimeSerializer.class)
    @JsonDeserialize(using = JacksonDateDeserializer.class)
    private Date createTime;

    /**
     * 最后修改时间
     * t_user.LastModifyTime
     */
    @JsonSerialize(using = JacksonDateTimeSerializer.class)
    @JsonDeserialize(using = JacksonDateDeserializer.class)
    private Date lastModifyTime;

    /**
     * 初始化实体对象 主键列不初始化
     */
    public void initWithDefaultValue() {
        this.userId = StringUtils.EMPTY;
        this.mobile = StringUtils.EMPTY;
        this.password = StringUtils.EMPTY;
        this.status = 0;
        this.createTime = new Date();
        this.lastModifyTime = new Date();
    }

    /**
     * 记录标识
     * t_user.RecordId
     *
     * @return the value of t_user.RecordId
     */
    public Long getRecordId() {
        return recordId;
    }

    /**
     * 记录标识
     * t_user.RecordId
     *
     * @param recordId the value for t_user.RecordId
     */
    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    /**
     * 用户Id[UUID]
     * t_user.UserId
     *
     * @return the value of t_user.UserId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 用户Id[UUID]
     * t_user.UserId
     *
     * @param userId the value for t_user.UserId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 用户手机号
     * t_user.Mobile
     *
     * @return the value of t_user.Mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 用户手机号
     * t_user.Mobile
     *
     * @param mobile the value for t_user.Mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 密码
     * t_user.Password
     *
     * @return the value of t_user.Password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     * t_user.Password
     *
     * @param password the value for t_user.Password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 用户状态
     * t_user.Status
     *
     * @return the value of t_user.Status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 用户状态
     * t_user.Status
     *
     * @param status the value for t_user.Status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 创建时间
     * t_user.CreateTime
     *
     * @return the value of t_user.CreateTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * t_user.CreateTime
     *
     * @param createTime the value for t_user.CreateTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 最后修改时间
     * t_user.LastModifyTime
     *
     * @return the value of t_user.LastModifyTime
     */
    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * 最后修改时间
     * t_user.LastModifyTime
     *
     * @param lastModifyTime the value for t_user.LastModifyTime
     */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}
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
     * 用户Id[UUID]
     * t_user.UserId
     */
    private String userId;

    /**
     * 真实姓名
     * t_user.TrueName
     */
    private String trueName;

    /**
     * 密码
     * t_user.PassWord
     */
    private String passWord;

    /**
     * 加密密码
     * t_user.PassWordMd5
     */
    private String passWordMd5;

    /**
     * 手机号
     * t_user.Mobile
     */
    private Integer mobile;

    /**
     * 身份证号
     * t_user.IdCard
     */
    private String idCard;

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
        this.trueName = StringUtils.EMPTY;
        this.passWord = StringUtils.EMPTY;
        this.passWordMd5 = StringUtils.EMPTY;
        this.mobile = 0;
        this.idCard = StringUtils.EMPTY;
        this.status = 0;
        this.createTime = new Date();
        this.lastModifyTime = new Date();
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
     * 真实姓名
     * t_user.TrueName
     *
     * @return the value of t_user.TrueName
     */
    public String getTrueName() {
        return trueName;
    }

    /**
     * 真实姓名
     * t_user.TrueName
     *
     * @param trueName the value for t_user.TrueName
     */
    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    /**
     * 密码
     * t_user.PassWord
     *
     * @return the value of t_user.PassWord
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 密码
     * t_user.PassWord
     *
     * @param passWord the value for t_user.PassWord
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 加密密码
     * t_user.PassWordMd5
     *
     * @return the value of t_user.PassWordMd5
     */
    public String getPassWordMd5() {
        return passWordMd5;
    }

    /**
     * 加密密码
     * t_user.PassWordMd5
     *
     * @param passWordMd5 the value for t_user.PassWordMd5
     */
    public void setPassWordMd5(String passWordMd5) {
        this.passWordMd5 = passWordMd5;
    }

    /**
     * 手机号
     * t_user.Mobile
     *
     * @return the value of t_user.Mobile
     */
    public Integer getMobile() {
        return mobile;
    }

    /**
     * 手机号
     * t_user.Mobile
     *
     * @param mobile the value for t_user.Mobile
     */
    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    /**
     * 身份证号
     * t_user.IdCard
     *
     * @return the value of t_user.IdCard
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 身份证号
     * t_user.IdCard
     *
     * @param idCard the value for t_user.IdCard
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
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
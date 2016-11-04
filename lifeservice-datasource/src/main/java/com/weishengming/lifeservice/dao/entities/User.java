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
     * 用户名字
     * t_user.UserName
     */
    private String userName;

    /**
     * 性别
     * t_user.Sex
     */
    private String sex;

    /**
     * 年龄
     * t_user.Age
     */
    private String age;

    /**
     * 省
     * t_user.Prov
     */
    private String prov;

    /**
     * 市
     * t_user.City
     */
    private String city;

    /**
     * 县
     * t_user.County
     */
    private String county;

    /**
     * 详细地址
     * t_user.Address
     */
    private String address;

    /**
     * 个性签名
     * t_user.Sign
     */
    private String sign;

    /**
     * 用户token
     * t_user.Token
     */
    private String token;

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
        this.userName = StringUtils.EMPTY;
        this.sex = StringUtils.EMPTY;
        this.age = StringUtils.EMPTY;
        this.prov = StringUtils.EMPTY;
        this.city = StringUtils.EMPTY;
        this.county = StringUtils.EMPTY;
        this.address = StringUtils.EMPTY;
        this.sign = StringUtils.EMPTY;
        this.token = StringUtils.EMPTY;
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
     * 用户名字
     * t_user.UserName
     *
     * @return the value of t_user.UserName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户名字
     * t_user.UserName
     *
     * @param userName the value for t_user.UserName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 性别
     * t_user.Sex
     *
     * @return the value of t_user.Sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 性别
     * t_user.Sex
     *
     * @param sex the value for t_user.Sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 年龄
     * t_user.Age
     *
     * @return the value of t_user.Age
     */
    public String getAge() {
        return age;
    }

    /**
     * 年龄
     * t_user.Age
     *
     * @param age the value for t_user.Age
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * 省
     * t_user.Prov
     *
     * @return the value of t_user.Prov
     */
    public String getProv() {
        return prov;
    }

    /**
     * 省
     * t_user.Prov
     *
     * @param prov the value for t_user.Prov
     */
    public void setProv(String prov) {
        this.prov = prov;
    }

    /**
     * 市
     * t_user.City
     *
     * @return the value of t_user.City
     */
    public String getCity() {
        return city;
    }

    /**
     * 市
     * t_user.City
     *
     * @param city the value for t_user.City
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 县
     * t_user.County
     *
     * @return the value of t_user.County
     */
    public String getCounty() {
        return county;
    }

    /**
     * 县
     * t_user.County
     *
     * @param county the value for t_user.County
     */
    public void setCounty(String county) {
        this.county = county;
    }

    /**
     * 详细地址
     * t_user.Address
     *
     * @return the value of t_user.Address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 详细地址
     * t_user.Address
     *
     * @param address the value for t_user.Address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 个性签名
     * t_user.Sign
     *
     * @return the value of t_user.Sign
     */
    public String getSign() {
        return sign;
    }

    /**
     * 个性签名
     * t_user.Sign
     *
     * @param sign the value for t_user.Sign
     */
    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * 用户token
     * t_user.Token
     *
     * @return the value of t_user.Token
     */
    public String getToken() {
        return token;
    }

    /**
     * 用户token
     * t_user.Token
     *
     * @param token the value for t_user.Token
     */
    public void setToken(String token) {
        this.token = token;
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
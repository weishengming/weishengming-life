package com.weishengming.lifeservice.dao.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 * 用户表
 * t_user
 */
public class UserExample {
    /**
     * 顺序排序
     */
    public static final String ORDERBYDIRECTION_ASC = "asc";

    /**
     * 倒序排序
     */
    public static final String ORDERBYDIRECTION_DESC = "desc";

    /**
     * 记录标识
     */
    public static final String FIELD_RECORDID = "RecordId";

    /**
     * 用户Id[UUID]
     */
    public static final String FIELD_USERID = "UserId";

    /**
     * 用户手机号
     */
    public static final String FIELD_MOBILE = "Mobile";

    /**
     * 密码
     */
    public static final String FIELD_PASSWORD = "Password";

    /**
     * 用户名字
     */
    public static final String FIELD_USERNAME = "UserName";

    /**
     * 性别
     */
    public static final String FIELD_SEX = "Sex";

    /**
     * 年龄
     */
    public static final String FIELD_AGE = "Age";

    /**
     * 省
     */
    public static final String FIELD_PROV = "Prov";

    /**
     * 市
     */
    public static final String FIELD_CITY = "City";

    /**
     * 县
     */
    public static final String FIELD_COUNTY = "County";

    /**
     * 详细地址
     */
    public static final String FIELD_ADDRESS = "Address";

    /**
     * 个性签名
     */
    public static final String FIELD_SIGN = "Sign";

    /**
     * 用户token
     */
    public static final String FIELD_TOKEN = "Token";

    /**
     * 用户状态
     */
    public static final String FIELD_STATUS = "Status";

    /**
     * 创建时间
     */
    public static final String FIELD_CREATETIME = "CreateTime";

    /**
     * 最后修改时间
     */
    public static final String FIELD_LASTMODIFYTIME = "LastModifyTime";

    /**
     * t_user
     */
    protected Integer offset;

    /**
     * t_user
     */
    protected Integer size;

    /**
     * t_user
     */
    protected String orderByClause;

    /**
     * t_user
     */
    protected boolean distinct;

    /**
     * t_user
     */
    protected List<Criteria> oredCriteria;

    /**
     * t_user
     */
    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * t_user
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * t_user
     */
    public void setOrderByClause(OrderBy orderBy) {
        this.orderByClause = orderBy.toString();
    }

    /**
     * t_user
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * t_user
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * t_user
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * t_user
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * t_user
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * t_user
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * t_user
     */
    public Integer getSize() {
        return size;
    }

    /**
     * t_user
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * t_user
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * t_user
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * t_user
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * t_user
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * t_user
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 用户表
     * t_user
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property, boolean isBinary) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value, isBinary));
        }

        protected void addCriterion(String condition, Object value, String property) {
            addCriterion(condition, value, property, false);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property, boolean isBinary) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2, isBinary));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            addCriterion(condition, value1, value2, property, false);
        }

        /**
         * 记录标识
         */
        public Criteria andRecordIdIsNull() {
            addCriterion("RecordId is null");
            return (Criteria) this;
        }

        /**
         * 记录标识
         */
        public Criteria andRecordIdIsNotNull() {
            addCriterion("RecordId is not null");
            return (Criteria) this;
        }

        /**
         * 记录标识
         */
        public Criteria andRecordIdEqualTo(Long value) {
            addCriterion("RecordId =", value, "recordId", false);
            return (Criteria) this;
        }

        /**
         * 记录标识
         */
        public Criteria andRecordIdNotEqualTo(Long value) {
            addCriterion("RecordId <>", value, "recordId", false);
            return (Criteria) this;
        }

        /**
         * 记录标识
         */
        public Criteria andRecordIdGreaterThan(Long value) {
            addCriterion("RecordId >", value, "recordId", false);
            return (Criteria) this;
        }

        /**
         * 记录标识
         */
        public Criteria andRecordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RecordId >=", value, "recordId", false);
            return (Criteria) this;
        }

        /**
         * 记录标识
         */
        public Criteria andRecordIdLessThan(Long value) {
            addCriterion("RecordId <", value, "recordId", false);
            return (Criteria) this;
        }

        /**
         * 记录标识
         */
        public Criteria andRecordIdLessThanOrEqualTo(Long value) {
            addCriterion("RecordId <=", value, "recordId", false);
            return (Criteria) this;
        }

        /**
         * 记录标识
         */
        public Criteria andRecordIdIn(List<Long> values) {
            addCriterion("RecordId in", values, "recordId", false);
            return (Criteria) this;
        }

        /**
         * 记录标识
         */
        public Criteria andRecordIdNotIn(List<Long> values) {
            addCriterion("RecordId not in", values, "recordId", false);
            return (Criteria) this;
        }

        /**
         * 记录标识
         */
        public Criteria andRecordIdBetween(Long value1, Long value2) {
            addCriterion("RecordId between", value1, value2, "recordId");
            return (Criteria) this;
        }

        /**
         * 记录标识
         */
        public Criteria andRecordIdNotBetween(Long value1, Long value2) {
            addCriterion("RecordId not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        /**
         * 用户Id[UUID]
         */
        public Criteria andUserIdIsNull() {
            addCriterion("UserId is null");
            return (Criteria) this;
        }

        /**
         * 用户Id[UUID]
         */
        public Criteria andUserIdIsNotNull() {
            addCriterion("UserId is not null");
            return (Criteria) this;
        }

        /**
         * 用户Id[UUID]
         */
        public Criteria andUserIdEqualTo(String value) {
            addCriterion("UserId =", value, "userId", false);
            return (Criteria) this;
        }

        /**
         * 用户Id[UUID]
         */
        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("UserId <>", value, "userId", false);
            return (Criteria) this;
        }

        /**
         * 用户Id[UUID]
         */
        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("UserId >", value, "userId", false);
            return (Criteria) this;
        }

        /**
         * 用户Id[UUID]
         */
        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("UserId >=", value, "userId", false);
            return (Criteria) this;
        }

        /**
         * 用户Id[UUID]
         */
        public Criteria andUserIdLessThan(String value) {
            addCriterion("UserId <", value, "userId", false);
            return (Criteria) this;
        }

        /**
         * 用户Id[UUID]
         */
        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("UserId <=", value, "userId", false);
            return (Criteria) this;
        }

        /**
         * 用户Id[UUID]
         */
        public Criteria andUserIdLike(String value) {
            addCriterion("UserId like", value, "userId", false);
            return (Criteria) this;
        }

        /**
         * 用户Id[UUID]
         */
        public Criteria andUserIdNotLike(String value) {
            addCriterion("UserId not like", value, "userId", false);
            return (Criteria) this;
        }

        /**
         * 用户Id[UUID]
         */
        public Criteria andUserIdIn(List<String> values) {
            addCriterion("UserId in", values, "userId", false);
            return (Criteria) this;
        }

        /**
         * 用户Id[UUID]
         */
        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("UserId not in", values, "userId", false);
            return (Criteria) this;
        }

        /**
         * 用户Id[UUID]
         */
        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("UserId between", value1, value2, "userId");
            return (Criteria) this;
        }

        /**
         * 用户Id[UUID]
         */
        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("UserId not between", value1, value2, "userId");
            return (Criteria) this;
        }

        /**
         * 用户手机号
         */
        public Criteria andMobileIsNull() {
            addCriterion("Mobile is null");
            return (Criteria) this;
        }

        /**
         * 用户手机号
         */
        public Criteria andMobileIsNotNull() {
            addCriterion("Mobile is not null");
            return (Criteria) this;
        }

        /**
         * 用户手机号
         */
        public Criteria andMobileEqualTo(String value) {
            addCriterion("Mobile =", value, "mobile", false);
            return (Criteria) this;
        }

        /**
         * 用户手机号
         */
        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("Mobile <>", value, "mobile", false);
            return (Criteria) this;
        }

        /**
         * 用户手机号
         */
        public Criteria andMobileGreaterThan(String value) {
            addCriterion("Mobile >", value, "mobile", false);
            return (Criteria) this;
        }

        /**
         * 用户手机号
         */
        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("Mobile >=", value, "mobile", false);
            return (Criteria) this;
        }

        /**
         * 用户手机号
         */
        public Criteria andMobileLessThan(String value) {
            addCriterion("Mobile <", value, "mobile", false);
            return (Criteria) this;
        }

        /**
         * 用户手机号
         */
        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("Mobile <=", value, "mobile", false);
            return (Criteria) this;
        }

        /**
         * 用户手机号
         */
        public Criteria andMobileLike(String value) {
            addCriterion("Mobile like", value, "mobile", false);
            return (Criteria) this;
        }

        /**
         * 用户手机号
         */
        public Criteria andMobileNotLike(String value) {
            addCriterion("Mobile not like", value, "mobile", false);
            return (Criteria) this;
        }

        /**
         * 用户手机号
         */
        public Criteria andMobileIn(List<String> values) {
            addCriterion("Mobile in", values, "mobile", false);
            return (Criteria) this;
        }

        /**
         * 用户手机号
         */
        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("Mobile not in", values, "mobile", false);
            return (Criteria) this;
        }

        /**
         * 用户手机号
         */
        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("Mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        /**
         * 用户手机号
         */
        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("Mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        /**
         * 密码
         */
        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        /**
         * 密码
         */
        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        /**
         * 密码
         */
        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password", false);
            return (Criteria) this;
        }

        /**
         * 密码
         */
        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password", false);
            return (Criteria) this;
        }

        /**
         * 密码
         */
        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password", false);
            return (Criteria) this;
        }

        /**
         * 密码
         */
        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password", false);
            return (Criteria) this;
        }

        /**
         * 密码
         */
        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password", false);
            return (Criteria) this;
        }

        /**
         * 密码
         */
        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password", false);
            return (Criteria) this;
        }

        /**
         * 密码
         */
        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password", false);
            return (Criteria) this;
        }

        /**
         * 密码
         */
        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password", false);
            return (Criteria) this;
        }

        /**
         * 密码
         */
        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password", false);
            return (Criteria) this;
        }

        /**
         * 密码
         */
        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password", false);
            return (Criteria) this;
        }

        /**
         * 密码
         */
        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        /**
         * 密码
         */
        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
            return (Criteria) this;
        }

        /**
         * 用户名字
         */
        public Criteria andUserNameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        /**
         * 用户名字
         */
        public Criteria andUserNameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        /**
         * 用户名字
         */
        public Criteria andUserNameEqualTo(String value) {
            addCriterion("UserName =", value, "userName", false);
            return (Criteria) this;
        }

        /**
         * 用户名字
         */
        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "userName", false);
            return (Criteria) this;
        }

        /**
         * 用户名字
         */
        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("UserName >", value, "userName", false);
            return (Criteria) this;
        }

        /**
         * 用户名字
         */
        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "userName", false);
            return (Criteria) this;
        }

        /**
         * 用户名字
         */
        public Criteria andUserNameLessThan(String value) {
            addCriterion("UserName <", value, "userName", false);
            return (Criteria) this;
        }

        /**
         * 用户名字
         */
        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "userName", false);
            return (Criteria) this;
        }

        /**
         * 用户名字
         */
        public Criteria andUserNameLike(String value) {
            addCriterion("UserName like", value, "userName", false);
            return (Criteria) this;
        }

        /**
         * 用户名字
         */
        public Criteria andUserNameNotLike(String value) {
            addCriterion("UserName not like", value, "userName", false);
            return (Criteria) this;
        }

        /**
         * 用户名字
         */
        public Criteria andUserNameIn(List<String> values) {
            addCriterion("UserName in", values, "userName", false);
            return (Criteria) this;
        }

        /**
         * 用户名字
         */
        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "userName", false);
            return (Criteria) this;
        }

        /**
         * 用户名字
         */
        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "userName");
            return (Criteria) this;
        }

        /**
         * 用户名字
         */
        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "userName");
            return (Criteria) this;
        }

        /**
         * 性别
         */
        public Criteria andSexIsNull() {
            addCriterion("Sex is null");
            return (Criteria) this;
        }

        /**
         * 性别
         */
        public Criteria andSexIsNotNull() {
            addCriterion("Sex is not null");
            return (Criteria) this;
        }

        /**
         * 性别
         */
        public Criteria andSexEqualTo(String value) {
            addCriterion("Sex =", value, "sex", false);
            return (Criteria) this;
        }

        /**
         * 性别
         */
        public Criteria andSexNotEqualTo(String value) {
            addCriterion("Sex <>", value, "sex", false);
            return (Criteria) this;
        }

        /**
         * 性别
         */
        public Criteria andSexGreaterThan(String value) {
            addCriterion("Sex >", value, "sex", false);
            return (Criteria) this;
        }

        /**
         * 性别
         */
        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("Sex >=", value, "sex", false);
            return (Criteria) this;
        }

        /**
         * 性别
         */
        public Criteria andSexLessThan(String value) {
            addCriterion("Sex <", value, "sex", false);
            return (Criteria) this;
        }

        /**
         * 性别
         */
        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("Sex <=", value, "sex", false);
            return (Criteria) this;
        }

        /**
         * 性别
         */
        public Criteria andSexLike(String value) {
            addCriterion("Sex like", value, "sex", false);
            return (Criteria) this;
        }

        /**
         * 性别
         */
        public Criteria andSexNotLike(String value) {
            addCriterion("Sex not like", value, "sex", false);
            return (Criteria) this;
        }

        /**
         * 性别
         */
        public Criteria andSexIn(List<String> values) {
            addCriterion("Sex in", values, "sex", false);
            return (Criteria) this;
        }

        /**
         * 性别
         */
        public Criteria andSexNotIn(List<String> values) {
            addCriterion("Sex not in", values, "sex", false);
            return (Criteria) this;
        }

        /**
         * 性别
         */
        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("Sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        /**
         * 性别
         */
        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("Sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        /**
         * 年龄
         */
        public Criteria andAgeIsNull() {
            addCriterion("Age is null");
            return (Criteria) this;
        }

        /**
         * 年龄
         */
        public Criteria andAgeIsNotNull() {
            addCriterion("Age is not null");
            return (Criteria) this;
        }

        /**
         * 年龄
         */
        public Criteria andAgeEqualTo(String value) {
            addCriterion("Age =", value, "age", false);
            return (Criteria) this;
        }

        /**
         * 年龄
         */
        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("Age <>", value, "age", false);
            return (Criteria) this;
        }

        /**
         * 年龄
         */
        public Criteria andAgeGreaterThan(String value) {
            addCriterion("Age >", value, "age", false);
            return (Criteria) this;
        }

        /**
         * 年龄
         */
        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("Age >=", value, "age", false);
            return (Criteria) this;
        }

        /**
         * 年龄
         */
        public Criteria andAgeLessThan(String value) {
            addCriterion("Age <", value, "age", false);
            return (Criteria) this;
        }

        /**
         * 年龄
         */
        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("Age <=", value, "age", false);
            return (Criteria) this;
        }

        /**
         * 年龄
         */
        public Criteria andAgeLike(String value) {
            addCriterion("Age like", value, "age", false);
            return (Criteria) this;
        }

        /**
         * 年龄
         */
        public Criteria andAgeNotLike(String value) {
            addCriterion("Age not like", value, "age", false);
            return (Criteria) this;
        }

        /**
         * 年龄
         */
        public Criteria andAgeIn(List<String> values) {
            addCriterion("Age in", values, "age", false);
            return (Criteria) this;
        }

        /**
         * 年龄
         */
        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("Age not in", values, "age", false);
            return (Criteria) this;
        }

        /**
         * 年龄
         */
        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("Age between", value1, value2, "age");
            return (Criteria) this;
        }

        /**
         * 年龄
         */
        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("Age not between", value1, value2, "age");
            return (Criteria) this;
        }

        /**
         * 省
         */
        public Criteria andProvIsNull() {
            addCriterion("Prov is null");
            return (Criteria) this;
        }

        /**
         * 省
         */
        public Criteria andProvIsNotNull() {
            addCriterion("Prov is not null");
            return (Criteria) this;
        }

        /**
         * 省
         */
        public Criteria andProvEqualTo(String value) {
            addCriterion("Prov =", value, "prov", false);
            return (Criteria) this;
        }

        /**
         * 省
         */
        public Criteria andProvNotEqualTo(String value) {
            addCriterion("Prov <>", value, "prov", false);
            return (Criteria) this;
        }

        /**
         * 省
         */
        public Criteria andProvGreaterThan(String value) {
            addCriterion("Prov >", value, "prov", false);
            return (Criteria) this;
        }

        /**
         * 省
         */
        public Criteria andProvGreaterThanOrEqualTo(String value) {
            addCriterion("Prov >=", value, "prov", false);
            return (Criteria) this;
        }

        /**
         * 省
         */
        public Criteria andProvLessThan(String value) {
            addCriterion("Prov <", value, "prov", false);
            return (Criteria) this;
        }

        /**
         * 省
         */
        public Criteria andProvLessThanOrEqualTo(String value) {
            addCriterion("Prov <=", value, "prov", false);
            return (Criteria) this;
        }

        /**
         * 省
         */
        public Criteria andProvLike(String value) {
            addCriterion("Prov like", value, "prov", false);
            return (Criteria) this;
        }

        /**
         * 省
         */
        public Criteria andProvNotLike(String value) {
            addCriterion("Prov not like", value, "prov", false);
            return (Criteria) this;
        }

        /**
         * 省
         */
        public Criteria andProvIn(List<String> values) {
            addCriterion("Prov in", values, "prov", false);
            return (Criteria) this;
        }

        /**
         * 省
         */
        public Criteria andProvNotIn(List<String> values) {
            addCriterion("Prov not in", values, "prov", false);
            return (Criteria) this;
        }

        /**
         * 省
         */
        public Criteria andProvBetween(String value1, String value2) {
            addCriterion("Prov between", value1, value2, "prov");
            return (Criteria) this;
        }

        /**
         * 省
         */
        public Criteria andProvNotBetween(String value1, String value2) {
            addCriterion("Prov not between", value1, value2, "prov");
            return (Criteria) this;
        }

        /**
         * 市
         */
        public Criteria andCityIsNull() {
            addCriterion("City is null");
            return (Criteria) this;
        }

        /**
         * 市
         */
        public Criteria andCityIsNotNull() {
            addCriterion("City is not null");
            return (Criteria) this;
        }

        /**
         * 市
         */
        public Criteria andCityEqualTo(String value) {
            addCriterion("City =", value, "city", false);
            return (Criteria) this;
        }

        /**
         * 市
         */
        public Criteria andCityNotEqualTo(String value) {
            addCriterion("City <>", value, "city", false);
            return (Criteria) this;
        }

        /**
         * 市
         */
        public Criteria andCityGreaterThan(String value) {
            addCriterion("City >", value, "city", false);
            return (Criteria) this;
        }

        /**
         * 市
         */
        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("City >=", value, "city", false);
            return (Criteria) this;
        }

        /**
         * 市
         */
        public Criteria andCityLessThan(String value) {
            addCriterion("City <", value, "city", false);
            return (Criteria) this;
        }

        /**
         * 市
         */
        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("City <=", value, "city", false);
            return (Criteria) this;
        }

        /**
         * 市
         */
        public Criteria andCityLike(String value) {
            addCriterion("City like", value, "city", false);
            return (Criteria) this;
        }

        /**
         * 市
         */
        public Criteria andCityNotLike(String value) {
            addCriterion("City not like", value, "city", false);
            return (Criteria) this;
        }

        /**
         * 市
         */
        public Criteria andCityIn(List<String> values) {
            addCriterion("City in", values, "city", false);
            return (Criteria) this;
        }

        /**
         * 市
         */
        public Criteria andCityNotIn(List<String> values) {
            addCriterion("City not in", values, "city", false);
            return (Criteria) this;
        }

        /**
         * 市
         */
        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("City between", value1, value2, "city");
            return (Criteria) this;
        }

        /**
         * 市
         */
        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("City not between", value1, value2, "city");
            return (Criteria) this;
        }

        /**
         * 县
         */
        public Criteria andCountyIsNull() {
            addCriterion("County is null");
            return (Criteria) this;
        }

        /**
         * 县
         */
        public Criteria andCountyIsNotNull() {
            addCriterion("County is not null");
            return (Criteria) this;
        }

        /**
         * 县
         */
        public Criteria andCountyEqualTo(String value) {
            addCriterion("County =", value, "county", false);
            return (Criteria) this;
        }

        /**
         * 县
         */
        public Criteria andCountyNotEqualTo(String value) {
            addCriterion("County <>", value, "county", false);
            return (Criteria) this;
        }

        /**
         * 县
         */
        public Criteria andCountyGreaterThan(String value) {
            addCriterion("County >", value, "county", false);
            return (Criteria) this;
        }

        /**
         * 县
         */
        public Criteria andCountyGreaterThanOrEqualTo(String value) {
            addCriterion("County >=", value, "county", false);
            return (Criteria) this;
        }

        /**
         * 县
         */
        public Criteria andCountyLessThan(String value) {
            addCriterion("County <", value, "county", false);
            return (Criteria) this;
        }

        /**
         * 县
         */
        public Criteria andCountyLessThanOrEqualTo(String value) {
            addCriterion("County <=", value, "county", false);
            return (Criteria) this;
        }

        /**
         * 县
         */
        public Criteria andCountyLike(String value) {
            addCriterion("County like", value, "county", false);
            return (Criteria) this;
        }

        /**
         * 县
         */
        public Criteria andCountyNotLike(String value) {
            addCriterion("County not like", value, "county", false);
            return (Criteria) this;
        }

        /**
         * 县
         */
        public Criteria andCountyIn(List<String> values) {
            addCriterion("County in", values, "county", false);
            return (Criteria) this;
        }

        /**
         * 县
         */
        public Criteria andCountyNotIn(List<String> values) {
            addCriterion("County not in", values, "county", false);
            return (Criteria) this;
        }

        /**
         * 县
         */
        public Criteria andCountyBetween(String value1, String value2) {
            addCriterion("County between", value1, value2, "county");
            return (Criteria) this;
        }

        /**
         * 县
         */
        public Criteria andCountyNotBetween(String value1, String value2) {
            addCriterion("County not between", value1, value2, "county");
            return (Criteria) this;
        }

        /**
         * 详细地址
         */
        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        /**
         * 详细地址
         */
        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        /**
         * 详细地址
         */
        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address", false);
            return (Criteria) this;
        }

        /**
         * 详细地址
         */
        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address", false);
            return (Criteria) this;
        }

        /**
         * 详细地址
         */
        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address", false);
            return (Criteria) this;
        }

        /**
         * 详细地址
         */
        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address", false);
            return (Criteria) this;
        }

        /**
         * 详细地址
         */
        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address", false);
            return (Criteria) this;
        }

        /**
         * 详细地址
         */
        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address", false);
            return (Criteria) this;
        }

        /**
         * 详细地址
         */
        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address", false);
            return (Criteria) this;
        }

        /**
         * 详细地址
         */
        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address", false);
            return (Criteria) this;
        }

        /**
         * 详细地址
         */
        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address", false);
            return (Criteria) this;
        }

        /**
         * 详细地址
         */
        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address", false);
            return (Criteria) this;
        }

        /**
         * 详细地址
         */
        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        /**
         * 详细地址
         */
        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
            return (Criteria) this;
        }

        /**
         * 个性签名
         */
        public Criteria andSignIsNull() {
            addCriterion("Sign is null");
            return (Criteria) this;
        }

        /**
         * 个性签名
         */
        public Criteria andSignIsNotNull() {
            addCriterion("Sign is not null");
            return (Criteria) this;
        }

        /**
         * 个性签名
         */
        public Criteria andSignEqualTo(String value) {
            addCriterion("Sign =", value, "sign", false);
            return (Criteria) this;
        }

        /**
         * 个性签名
         */
        public Criteria andSignNotEqualTo(String value) {
            addCriterion("Sign <>", value, "sign", false);
            return (Criteria) this;
        }

        /**
         * 个性签名
         */
        public Criteria andSignGreaterThan(String value) {
            addCriterion("Sign >", value, "sign", false);
            return (Criteria) this;
        }

        /**
         * 个性签名
         */
        public Criteria andSignGreaterThanOrEqualTo(String value) {
            addCriterion("Sign >=", value, "sign", false);
            return (Criteria) this;
        }

        /**
         * 个性签名
         */
        public Criteria andSignLessThan(String value) {
            addCriterion("Sign <", value, "sign", false);
            return (Criteria) this;
        }

        /**
         * 个性签名
         */
        public Criteria andSignLessThanOrEqualTo(String value) {
            addCriterion("Sign <=", value, "sign", false);
            return (Criteria) this;
        }

        /**
         * 个性签名
         */
        public Criteria andSignLike(String value) {
            addCriterion("Sign like", value, "sign", false);
            return (Criteria) this;
        }

        /**
         * 个性签名
         */
        public Criteria andSignNotLike(String value) {
            addCriterion("Sign not like", value, "sign", false);
            return (Criteria) this;
        }

        /**
         * 个性签名
         */
        public Criteria andSignIn(List<String> values) {
            addCriterion("Sign in", values, "sign", false);
            return (Criteria) this;
        }

        /**
         * 个性签名
         */
        public Criteria andSignNotIn(List<String> values) {
            addCriterion("Sign not in", values, "sign", false);
            return (Criteria) this;
        }

        /**
         * 个性签名
         */
        public Criteria andSignBetween(String value1, String value2) {
            addCriterion("Sign between", value1, value2, "sign");
            return (Criteria) this;
        }

        /**
         * 个性签名
         */
        public Criteria andSignNotBetween(String value1, String value2) {
            addCriterion("Sign not between", value1, value2, "sign");
            return (Criteria) this;
        }

        /**
         * 用户token
         */
        public Criteria andTokenIsNull() {
            addCriterion("Token is null");
            return (Criteria) this;
        }

        /**
         * 用户token
         */
        public Criteria andTokenIsNotNull() {
            addCriterion("Token is not null");
            return (Criteria) this;
        }

        /**
         * 用户token
         */
        public Criteria andTokenEqualTo(String value) {
            addCriterion("Token =", value, "token", false);
            return (Criteria) this;
        }

        /**
         * 用户token
         */
        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("Token <>", value, "token", false);
            return (Criteria) this;
        }

        /**
         * 用户token
         */
        public Criteria andTokenGreaterThan(String value) {
            addCriterion("Token >", value, "token", false);
            return (Criteria) this;
        }

        /**
         * 用户token
         */
        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("Token >=", value, "token", false);
            return (Criteria) this;
        }

        /**
         * 用户token
         */
        public Criteria andTokenLessThan(String value) {
            addCriterion("Token <", value, "token", false);
            return (Criteria) this;
        }

        /**
         * 用户token
         */
        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("Token <=", value, "token", false);
            return (Criteria) this;
        }

        /**
         * 用户token
         */
        public Criteria andTokenLike(String value) {
            addCriterion("Token like", value, "token", false);
            return (Criteria) this;
        }

        /**
         * 用户token
         */
        public Criteria andTokenNotLike(String value) {
            addCriterion("Token not like", value, "token", false);
            return (Criteria) this;
        }

        /**
         * 用户token
         */
        public Criteria andTokenIn(List<String> values) {
            addCriterion("Token in", values, "token", false);
            return (Criteria) this;
        }

        /**
         * 用户token
         */
        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("Token not in", values, "token", false);
            return (Criteria) this;
        }

        /**
         * 用户token
         */
        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("Token between", value1, value2, "token");
            return (Criteria) this;
        }

        /**
         * 用户token
         */
        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("Token not between", value1, value2, "token");
            return (Criteria) this;
        }

        /**
         * 用户状态
         */
        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        /**
         * 用户状态
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        /**
         * 用户状态
         */
        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("Status =", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 用户状态
         */
        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("Status <>", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 用户状态
         */
        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("Status >", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 用户状态
         */
        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Status >=", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 用户状态
         */
        public Criteria andStatusLessThan(Integer value) {
            addCriterion("Status <", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 用户状态
         */
        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Status <=", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 用户状态
         */
        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("Status in", values, "status", false);
            return (Criteria) this;
        }

        /**
         * 用户状态
         */
        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("Status not in", values, "status", false);
            return (Criteria) this;
        }

        /**
         * 用户状态
         */
        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        /**
         * 用户状态
         */
        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeIsNull() {
            addCriterion("LastModifyTime is null");
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeIsNotNull() {
            addCriterion("LastModifyTime is not null");
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeEqualTo(Date value) {
            addCriterion("LastModifyTime =", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeNotEqualTo(Date value) {
            addCriterion("LastModifyTime <>", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeGreaterThan(Date value) {
            addCriterion("LastModifyTime >", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LastModifyTime >=", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeLessThan(Date value) {
            addCriterion("LastModifyTime <", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("LastModifyTime <=", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeIn(List<Date> values) {
            addCriterion("LastModifyTime in", values, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeNotIn(List<Date> values) {
            addCriterion("LastModifyTime not in", values, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeBetween(Date value1, Date value2) {
            addCriterion("LastModifyTime between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("LastModifyTime not between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }
    }

    /**
     * 用户表
     *t_user
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 用户表
     * t_user
     */
    public static class Criterion {
        private boolean isBinary;

        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public boolean isIsBinary() {
            return isBinary;
        }

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
            this.isBinary = false;
        }

        protected Criterion(String condition, Object value, String typeHandler, boolean isBinary) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
            this.isBinary = isBinary;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            this(condition, value, typeHandler, false);
        }

        protected Criterion(String condition, Object value, boolean isBinary) {
            this(condition, value, null, isBinary);
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null, false);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler, boolean isBinary) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
            this.isBinary = isBinary;
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            this(condition, value, secondValue, typeHandler, false);
        }

        protected Criterion(String condition, Object value, Object secondValue, boolean isBinary) {
            this(condition, value, secondValue, null, isBinary);
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null, false);
        }
    }

    /**
     * 用户表
     *t_user
     */
    public static class OrderBy {
        private List<OrderByPair> orderByPairs;

        public OrderBy() {
            super();
            this.orderByPairs = new ArrayList<OrderByPair>();
        }

        public boolean isValid() {
            return orderByPairs.size() > 0;
        }

        public OrderBy clear() {
            orderByPairs.clear();
            return this;
        }

        public OrderBy addOrderBy(String fieldName) {
            return this.addOrderBy(fieldName, ORDERBYDIRECTION_ASC);
        }

        public OrderBy addOrderBy(String fieldName, String direction) {
            this.removeByFieldName(fieldName);//不能重复添加排序条件
            OrderByPair orderByPair = new OrderByPair(fieldName, direction);
            this.orderByPairs.add(orderByPair);
            return this;
        }

        private void removeByFieldName(String fieldName) {
            for (OrderByPair item : orderByPairs) {
                    if (StringUtils.equalsIgnoreCase(item.getFieldName(), fieldName)) {
                            orderByPairs.remove(item);
                            break;
                         }
                }
            }

        /**
         * 当没有任何排序条件时，直接返回null
         * 否则返回排序条件，多个条件时以,号分割
         */
        @Override
        public String toString() {
            if (!this.isValid()) {
                    return null;
            }
            StringBuilder sb = new StringBuilder();
            for (OrderByPair item : orderByPairs) {
                    sb.append(item.toString());
                    sb.append(',');
            }
            sb.deleteCharAt(sb.length() - 1);//删除最后一个字符
            return sb.toString();
        }
    }

    /**
     * 用户表
     *t_user
     */
    static class OrderByPair {
        private String fieldName;

        private String direction;

        public OrderByPair(String fieldName, String direction) {
            super();
            this.fieldName = fieldName;
            this.direction = direction;
        }

        public String getFieldName() {
            return this.fieldName;
        }

        public String getDirection() {
            return this.direction;
        }

        /**
         * 返回单个排序条件字符串
         */
        @Override
        public String toString() {
            return fieldName + " " + direction;
        }
    }
}
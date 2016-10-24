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
     * 用户Id[UUID]
     */
    public static final String FIELD_USERID = "UserId";

    /**
     * 真实姓名
     */
    public static final String FIELD_TRUENAME = "TrueName";

    /**
     * 密码
     */
    public static final String FIELD_PASSWORD = "PassWord";

    /**
     * 加密密码
     */
    public static final String FIELD_PASSWORDMD5 = "PassWordMd5";

    /**
     * 手机号
     */
    public static final String FIELD_MOBILE = "Mobile";

    /**
     * 身份证号
     */
    public static final String FIELD_IDCARD = "IdCard";

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
         * 真实姓名
         */
        public Criteria andTrueNameIsNull() {
            addCriterion("TrueName is null");
            return (Criteria) this;
        }

        /**
         * 真实姓名
         */
        public Criteria andTrueNameIsNotNull() {
            addCriterion("TrueName is not null");
            return (Criteria) this;
        }

        /**
         * 真实姓名
         */
        public Criteria andTrueNameEqualTo(String value) {
            addCriterion("TrueName =", value, "trueName", false);
            return (Criteria) this;
        }

        /**
         * 真实姓名
         */
        public Criteria andTrueNameNotEqualTo(String value) {
            addCriterion("TrueName <>", value, "trueName", false);
            return (Criteria) this;
        }

        /**
         * 真实姓名
         */
        public Criteria andTrueNameGreaterThan(String value) {
            addCriterion("TrueName >", value, "trueName", false);
            return (Criteria) this;
        }

        /**
         * 真实姓名
         */
        public Criteria andTrueNameGreaterThanOrEqualTo(String value) {
            addCriterion("TrueName >=", value, "trueName", false);
            return (Criteria) this;
        }

        /**
         * 真实姓名
         */
        public Criteria andTrueNameLessThan(String value) {
            addCriterion("TrueName <", value, "trueName", false);
            return (Criteria) this;
        }

        /**
         * 真实姓名
         */
        public Criteria andTrueNameLessThanOrEqualTo(String value) {
            addCriterion("TrueName <=", value, "trueName", false);
            return (Criteria) this;
        }

        /**
         * 真实姓名
         */
        public Criteria andTrueNameLike(String value) {
            addCriterion("TrueName like", value, "trueName", false);
            return (Criteria) this;
        }

        /**
         * 真实姓名
         */
        public Criteria andTrueNameNotLike(String value) {
            addCriterion("TrueName not like", value, "trueName", false);
            return (Criteria) this;
        }

        /**
         * 真实姓名
         */
        public Criteria andTrueNameIn(List<String> values) {
            addCriterion("TrueName in", values, "trueName", false);
            return (Criteria) this;
        }

        /**
         * 真实姓名
         */
        public Criteria andTrueNameNotIn(List<String> values) {
            addCriterion("TrueName not in", values, "trueName", false);
            return (Criteria) this;
        }

        /**
         * 真实姓名
         */
        public Criteria andTrueNameBetween(String value1, String value2) {
            addCriterion("TrueName between", value1, value2, "trueName");
            return (Criteria) this;
        }

        /**
         * 真实姓名
         */
        public Criteria andTrueNameNotBetween(String value1, String value2) {
            addCriterion("TrueName not between", value1, value2, "trueName");
            return (Criteria) this;
        }

        /**
         * 密码
         */
        public Criteria andPassWordIsNull() {
            addCriterion("PassWord is null");
            return (Criteria) this;
        }

        /**
         * 密码
         */
        public Criteria andPassWordIsNotNull() {
            addCriterion("PassWord is not null");
            return (Criteria) this;
        }

        /**
         * 密码
         */
        public Criteria andPassWordEqualTo(String value) {
            addCriterion("PassWord =", value, "passWord", false);
            return (Criteria) this;
        }

        /**
         * 密码
         */
        public Criteria andPassWordNotEqualTo(String value) {
            addCriterion("PassWord <>", value, "passWord", false);
            return (Criteria) this;
        }

        /**
         * 密码
         */
        public Criteria andPassWordGreaterThan(String value) {
            addCriterion("PassWord >", value, "passWord", false);
            return (Criteria) this;
        }

        /**
         * 密码
         */
        public Criteria andPassWordGreaterThanOrEqualTo(String value) {
            addCriterion("PassWord >=", value, "passWord", false);
            return (Criteria) this;
        }

        /**
         * 密码
         */
        public Criteria andPassWordLessThan(String value) {
            addCriterion("PassWord <", value, "passWord", false);
            return (Criteria) this;
        }

        /**
         * 密码
         */
        public Criteria andPassWordLessThanOrEqualTo(String value) {
            addCriterion("PassWord <=", value, "passWord", false);
            return (Criteria) this;
        }

        /**
         * 密码
         */
        public Criteria andPassWordLike(String value) {
            addCriterion("PassWord like", value, "passWord", false);
            return (Criteria) this;
        }

        /**
         * 密码
         */
        public Criteria andPassWordNotLike(String value) {
            addCriterion("PassWord not like", value, "passWord", false);
            return (Criteria) this;
        }

        /**
         * 密码
         */
        public Criteria andPassWordIn(List<String> values) {
            addCriterion("PassWord in", values, "passWord", false);
            return (Criteria) this;
        }

        /**
         * 密码
         */
        public Criteria andPassWordNotIn(List<String> values) {
            addCriterion("PassWord not in", values, "passWord", false);
            return (Criteria) this;
        }

        /**
         * 密码
         */
        public Criteria andPassWordBetween(String value1, String value2) {
            addCriterion("PassWord between", value1, value2, "passWord");
            return (Criteria) this;
        }

        /**
         * 密码
         */
        public Criteria andPassWordNotBetween(String value1, String value2) {
            addCriterion("PassWord not between", value1, value2, "passWord");
            return (Criteria) this;
        }

        /**
         * 加密密码
         */
        public Criteria andPassWordMd5IsNull() {
            addCriterion("PassWordMd5 is null");
            return (Criteria) this;
        }

        /**
         * 加密密码
         */
        public Criteria andPassWordMd5IsNotNull() {
            addCriterion("PassWordMd5 is not null");
            return (Criteria) this;
        }

        /**
         * 加密密码
         */
        public Criteria andPassWordMd5EqualTo(String value) {
            addCriterion("PassWordMd5 =", value, "passWordMd5", false);
            return (Criteria) this;
        }

        /**
         * 加密密码
         */
        public Criteria andPassWordMd5NotEqualTo(String value) {
            addCriterion("PassWordMd5 <>", value, "passWordMd5", false);
            return (Criteria) this;
        }

        /**
         * 加密密码
         */
        public Criteria andPassWordMd5GreaterThan(String value) {
            addCriterion("PassWordMd5 >", value, "passWordMd5", false);
            return (Criteria) this;
        }

        /**
         * 加密密码
         */
        public Criteria andPassWordMd5GreaterThanOrEqualTo(String value) {
            addCriterion("PassWordMd5 >=", value, "passWordMd5", false);
            return (Criteria) this;
        }

        /**
         * 加密密码
         */
        public Criteria andPassWordMd5LessThan(String value) {
            addCriterion("PassWordMd5 <", value, "passWordMd5", false);
            return (Criteria) this;
        }

        /**
         * 加密密码
         */
        public Criteria andPassWordMd5LessThanOrEqualTo(String value) {
            addCriterion("PassWordMd5 <=", value, "passWordMd5", false);
            return (Criteria) this;
        }

        /**
         * 加密密码
         */
        public Criteria andPassWordMd5Like(String value) {
            addCriterion("PassWordMd5 like", value, "passWordMd5", false);
            return (Criteria) this;
        }

        /**
         * 加密密码
         */
        public Criteria andPassWordMd5NotLike(String value) {
            addCriterion("PassWordMd5 not like", value, "passWordMd5", false);
            return (Criteria) this;
        }

        /**
         * 加密密码
         */
        public Criteria andPassWordMd5In(List<String> values) {
            addCriterion("PassWordMd5 in", values, "passWordMd5", false);
            return (Criteria) this;
        }

        /**
         * 加密密码
         */
        public Criteria andPassWordMd5NotIn(List<String> values) {
            addCriterion("PassWordMd5 not in", values, "passWordMd5", false);
            return (Criteria) this;
        }

        /**
         * 加密密码
         */
        public Criteria andPassWordMd5Between(String value1, String value2) {
            addCriterion("PassWordMd5 between", value1, value2, "passWordMd5");
            return (Criteria) this;
        }

        /**
         * 加密密码
         */
        public Criteria andPassWordMd5NotBetween(String value1, String value2) {
            addCriterion("PassWordMd5 not between", value1, value2, "passWordMd5");
            return (Criteria) this;
        }

        /**
         * 手机号
         */
        public Criteria andMobileIsNull() {
            addCriterion("Mobile is null");
            return (Criteria) this;
        }

        /**
         * 手机号
         */
        public Criteria andMobileIsNotNull() {
            addCriterion("Mobile is not null");
            return (Criteria) this;
        }

        /**
         * 手机号
         */
        public Criteria andMobileEqualTo(Integer value) {
            addCriterion("Mobile =", value, "mobile", false);
            return (Criteria) this;
        }

        /**
         * 手机号
         */
        public Criteria andMobileNotEqualTo(Integer value) {
            addCriterion("Mobile <>", value, "mobile", false);
            return (Criteria) this;
        }

        /**
         * 手机号
         */
        public Criteria andMobileGreaterThan(Integer value) {
            addCriterion("Mobile >", value, "mobile", false);
            return (Criteria) this;
        }

        /**
         * 手机号
         */
        public Criteria andMobileGreaterThanOrEqualTo(Integer value) {
            addCriterion("Mobile >=", value, "mobile", false);
            return (Criteria) this;
        }

        /**
         * 手机号
         */
        public Criteria andMobileLessThan(Integer value) {
            addCriterion("Mobile <", value, "mobile", false);
            return (Criteria) this;
        }

        /**
         * 手机号
         */
        public Criteria andMobileLessThanOrEqualTo(Integer value) {
            addCriterion("Mobile <=", value, "mobile", false);
            return (Criteria) this;
        }

        /**
         * 手机号
         */
        public Criteria andMobileIn(List<Integer> values) {
            addCriterion("Mobile in", values, "mobile", false);
            return (Criteria) this;
        }

        /**
         * 手机号
         */
        public Criteria andMobileNotIn(List<Integer> values) {
            addCriterion("Mobile not in", values, "mobile", false);
            return (Criteria) this;
        }

        /**
         * 手机号
         */
        public Criteria andMobileBetween(Integer value1, Integer value2) {
            addCriterion("Mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        /**
         * 手机号
         */
        public Criteria andMobileNotBetween(Integer value1, Integer value2) {
            addCriterion("Mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        /**
         * 身份证号
         */
        public Criteria andIdCardIsNull() {
            addCriterion("IdCard is null");
            return (Criteria) this;
        }

        /**
         * 身份证号
         */
        public Criteria andIdCardIsNotNull() {
            addCriterion("IdCard is not null");
            return (Criteria) this;
        }

        /**
         * 身份证号
         */
        public Criteria andIdCardEqualTo(String value) {
            addCriterion("IdCard =", value, "idCard", false);
            return (Criteria) this;
        }

        /**
         * 身份证号
         */
        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("IdCard <>", value, "idCard", false);
            return (Criteria) this;
        }

        /**
         * 身份证号
         */
        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("IdCard >", value, "idCard", false);
            return (Criteria) this;
        }

        /**
         * 身份证号
         */
        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("IdCard >=", value, "idCard", false);
            return (Criteria) this;
        }

        /**
         * 身份证号
         */
        public Criteria andIdCardLessThan(String value) {
            addCriterion("IdCard <", value, "idCard", false);
            return (Criteria) this;
        }

        /**
         * 身份证号
         */
        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("IdCard <=", value, "idCard", false);
            return (Criteria) this;
        }

        /**
         * 身份证号
         */
        public Criteria andIdCardLike(String value) {
            addCriterion("IdCard like", value, "idCard", false);
            return (Criteria) this;
        }

        /**
         * 身份证号
         */
        public Criteria andIdCardNotLike(String value) {
            addCriterion("IdCard not like", value, "idCard", false);
            return (Criteria) this;
        }

        /**
         * 身份证号
         */
        public Criteria andIdCardIn(List<String> values) {
            addCriterion("IdCard in", values, "idCard", false);
            return (Criteria) this;
        }

        /**
         * 身份证号
         */
        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("IdCard not in", values, "idCard", false);
            return (Criteria) this;
        }

        /**
         * 身份证号
         */
        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("IdCard between", value1, value2, "idCard");
            return (Criteria) this;
        }

        /**
         * 身份证号
         */
        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("IdCard not between", value1, value2, "idCard");
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
package com.weishengming.lifeservice.dao.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 * 评论表
 * t_comment
 */
public class CommentExample {
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
     * 文章Id
     */
    public static final String FIELD_ARTICLEID = "ArticleId";

    /**
     * 评论人Id
     */
    public static final String FIELD_USERID = "UserId";

    /**
     * 评论内容
     */
    public static final String FIELD_CONTENT = "Content";

    /**
     * 状态
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
     * t_comment
     */
    protected Integer offset;

    /**
     * t_comment
     */
    protected Integer size;

    /**
     * t_comment
     */
    protected String orderByClause;

    /**
     * t_comment
     */
    protected boolean distinct;

    /**
     * t_comment
     */
    protected List<Criteria> oredCriteria;

    /**
     * t_comment
     */
    public CommentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * t_comment
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * t_comment
     */
    public void setOrderByClause(OrderBy orderBy) {
        this.orderByClause = orderBy.toString();
    }

    /**
     * t_comment
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * t_comment
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * t_comment
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * t_comment
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * t_comment
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * t_comment
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * t_comment
     */
    public Integer getSize() {
        return size;
    }

    /**
     * t_comment
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * t_comment
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * t_comment
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * t_comment
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * t_comment
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * t_comment
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 评论表
     * t_comment
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
         * 文章Id
         */
        public Criteria andArticleIdIsNull() {
            addCriterion("ArticleId is null");
            return (Criteria) this;
        }

        /**
         * 文章Id
         */
        public Criteria andArticleIdIsNotNull() {
            addCriterion("ArticleId is not null");
            return (Criteria) this;
        }

        /**
         * 文章Id
         */
        public Criteria andArticleIdEqualTo(String value) {
            addCriterion("ArticleId =", value, "articleId", false);
            return (Criteria) this;
        }

        /**
         * 文章Id
         */
        public Criteria andArticleIdNotEqualTo(String value) {
            addCriterion("ArticleId <>", value, "articleId", false);
            return (Criteria) this;
        }

        /**
         * 文章Id
         */
        public Criteria andArticleIdGreaterThan(String value) {
            addCriterion("ArticleId >", value, "articleId", false);
            return (Criteria) this;
        }

        /**
         * 文章Id
         */
        public Criteria andArticleIdGreaterThanOrEqualTo(String value) {
            addCriterion("ArticleId >=", value, "articleId", false);
            return (Criteria) this;
        }

        /**
         * 文章Id
         */
        public Criteria andArticleIdLessThan(String value) {
            addCriterion("ArticleId <", value, "articleId", false);
            return (Criteria) this;
        }

        /**
         * 文章Id
         */
        public Criteria andArticleIdLessThanOrEqualTo(String value) {
            addCriterion("ArticleId <=", value, "articleId", false);
            return (Criteria) this;
        }

        /**
         * 文章Id
         */
        public Criteria andArticleIdLike(String value) {
            addCriterion("ArticleId like", value, "articleId", false);
            return (Criteria) this;
        }

        /**
         * 文章Id
         */
        public Criteria andArticleIdNotLike(String value) {
            addCriterion("ArticleId not like", value, "articleId", false);
            return (Criteria) this;
        }

        /**
         * 文章Id
         */
        public Criteria andArticleIdIn(List<String> values) {
            addCriterion("ArticleId in", values, "articleId", false);
            return (Criteria) this;
        }

        /**
         * 文章Id
         */
        public Criteria andArticleIdNotIn(List<String> values) {
            addCriterion("ArticleId not in", values, "articleId", false);
            return (Criteria) this;
        }

        /**
         * 文章Id
         */
        public Criteria andArticleIdBetween(String value1, String value2) {
            addCriterion("ArticleId between", value1, value2, "articleId");
            return (Criteria) this;
        }

        /**
         * 文章Id
         */
        public Criteria andArticleIdNotBetween(String value1, String value2) {
            addCriterion("ArticleId not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        /**
         * 评论人Id
         */
        public Criteria andUserIdIsNull() {
            addCriterion("UserId is null");
            return (Criteria) this;
        }

        /**
         * 评论人Id
         */
        public Criteria andUserIdIsNotNull() {
            addCriterion("UserId is not null");
            return (Criteria) this;
        }

        /**
         * 评论人Id
         */
        public Criteria andUserIdEqualTo(String value) {
            addCriterion("UserId =", value, "userId", false);
            return (Criteria) this;
        }

        /**
         * 评论人Id
         */
        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("UserId <>", value, "userId", false);
            return (Criteria) this;
        }

        /**
         * 评论人Id
         */
        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("UserId >", value, "userId", false);
            return (Criteria) this;
        }

        /**
         * 评论人Id
         */
        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("UserId >=", value, "userId", false);
            return (Criteria) this;
        }

        /**
         * 评论人Id
         */
        public Criteria andUserIdLessThan(String value) {
            addCriterion("UserId <", value, "userId", false);
            return (Criteria) this;
        }

        /**
         * 评论人Id
         */
        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("UserId <=", value, "userId", false);
            return (Criteria) this;
        }

        /**
         * 评论人Id
         */
        public Criteria andUserIdLike(String value) {
            addCriterion("UserId like", value, "userId", false);
            return (Criteria) this;
        }

        /**
         * 评论人Id
         */
        public Criteria andUserIdNotLike(String value) {
            addCriterion("UserId not like", value, "userId", false);
            return (Criteria) this;
        }

        /**
         * 评论人Id
         */
        public Criteria andUserIdIn(List<String> values) {
            addCriterion("UserId in", values, "userId", false);
            return (Criteria) this;
        }

        /**
         * 评论人Id
         */
        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("UserId not in", values, "userId", false);
            return (Criteria) this;
        }

        /**
         * 评论人Id
         */
        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("UserId between", value1, value2, "userId");
            return (Criteria) this;
        }

        /**
         * 评论人Id
         */
        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("UserId not between", value1, value2, "userId");
            return (Criteria) this;
        }

        /**
         * 评论内容
         */
        public Criteria andContentIsNull() {
            addCriterion("Content is null");
            return (Criteria) this;
        }

        /**
         * 评论内容
         */
        public Criteria andContentIsNotNull() {
            addCriterion("Content is not null");
            return (Criteria) this;
        }

        /**
         * 评论内容
         */
        public Criteria andContentEqualTo(String value) {
            addCriterion("Content =", value, "content", false);
            return (Criteria) this;
        }

        /**
         * 评论内容
         */
        public Criteria andContentNotEqualTo(String value) {
            addCriterion("Content <>", value, "content", false);
            return (Criteria) this;
        }

        /**
         * 评论内容
         */
        public Criteria andContentGreaterThan(String value) {
            addCriterion("Content >", value, "content", false);
            return (Criteria) this;
        }

        /**
         * 评论内容
         */
        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("Content >=", value, "content", false);
            return (Criteria) this;
        }

        /**
         * 评论内容
         */
        public Criteria andContentLessThan(String value) {
            addCriterion("Content <", value, "content", false);
            return (Criteria) this;
        }

        /**
         * 评论内容
         */
        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("Content <=", value, "content", false);
            return (Criteria) this;
        }

        /**
         * 评论内容
         */
        public Criteria andContentLike(String value) {
            addCriterion("Content like", value, "content", false);
            return (Criteria) this;
        }

        /**
         * 评论内容
         */
        public Criteria andContentNotLike(String value) {
            addCriterion("Content not like", value, "content", false);
            return (Criteria) this;
        }

        /**
         * 评论内容
         */
        public Criteria andContentIn(List<String> values) {
            addCriterion("Content in", values, "content", false);
            return (Criteria) this;
        }

        /**
         * 评论内容
         */
        public Criteria andContentNotIn(List<String> values) {
            addCriterion("Content not in", values, "content", false);
            return (Criteria) this;
        }

        /**
         * 评论内容
         */
        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("Content between", value1, value2, "content");
            return (Criteria) this;
        }

        /**
         * 评论内容
         */
        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("Content not between", value1, value2, "content");
            return (Criteria) this;
        }

        /**
         * 状态
         */
        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        /**
         * 状态
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        /**
         * 状态
         */
        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("Status =", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 状态
         */
        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("Status <>", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 状态
         */
        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("Status >", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 状态
         */
        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Status >=", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 状态
         */
        public Criteria andStatusLessThan(Integer value) {
            addCriterion("Status <", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 状态
         */
        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Status <=", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 状态
         */
        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("Status in", values, "status", false);
            return (Criteria) this;
        }

        /**
         * 状态
         */
        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("Status not in", values, "status", false);
            return (Criteria) this;
        }

        /**
         * 状态
         */
        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        /**
         * 状态
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
     * 评论表
     *t_comment
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 评论表
     * t_comment
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
     * 评论表
     *t_comment
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
     * 评论表
     *t_comment
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
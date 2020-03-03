package com.yz.sophia.stargaze.model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SophiaOpenServiceExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sophia_open_service
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sophia_open_service
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sophia_open_service
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    protected int offset = 0;

    protected int pageSize = 10;
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sophia_open_service
     *
     * @mbggenerated
     */
    public SophiaOpenServiceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sophia_open_service
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sophia_open_service
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sophia_open_service
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sophia_open_service
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sophia_open_service
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sophia_open_service
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sophia_open_service
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sophia_open_service
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sophia_open_service
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sophia_open_service
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sophia_open_service
     *
     * @mbggenerated
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

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProductModuleIsNull() {
            addCriterion("product_module is null");
            return (Criteria) this;
        }

        public Criteria andProductModuleIsNotNull() {
            addCriterion("product_module is not null");
            return (Criteria) this;
        }

        public Criteria andProductModuleEqualTo(String value) {
            addCriterion("product_module =", value, "productModule");
            return (Criteria) this;
        }

        public Criteria andProductModuleNotEqualTo(String value) {
            addCriterion("product_module <>", value, "productModule");
            return (Criteria) this;
        }

        public Criteria andProductModuleGreaterThan(String value) {
            addCriterion("product_module >", value, "productModule");
            return (Criteria) this;
        }

        public Criteria andProductModuleGreaterThanOrEqualTo(String value) {
            addCriterion("product_module >=", value, "productModule");
            return (Criteria) this;
        }

        public Criteria andProductModuleLessThan(String value) {
            addCriterion("product_module <", value, "productModule");
            return (Criteria) this;
        }

        public Criteria andProductModuleLessThanOrEqualTo(String value) {
            addCriterion("product_module <=", value, "productModule");
            return (Criteria) this;
        }

        public Criteria andProductModuleLike(String value) {
            addCriterion("product_module like", value, "productModule");
            return (Criteria) this;
        }

        public Criteria andProductModuleNotLike(String value) {
            addCriterion("product_module not like", value, "productModule");
            return (Criteria) this;
        }

        public Criteria andProductModuleIn(List<String> values) {
            addCriterion("product_module in", values, "productModule");
            return (Criteria) this;
        }

        public Criteria andProductModuleNotIn(List<String> values) {
            addCriterion("product_module not in", values, "productModule");
            return (Criteria) this;
        }

        public Criteria andProductModuleBetween(String value1, String value2) {
            addCriterion("product_module between", value1, value2, "productModule");
            return (Criteria) this;
        }

        public Criteria andProductModuleNotBetween(String value1, String value2) {
            addCriterion("product_module not between", value1, value2, "productModule");
            return (Criteria) this;
        }

        public Criteria andChildModuleIsNull() {
            addCriterion("child_module is null");
            return (Criteria) this;
        }

        public Criteria andChildModuleIsNotNull() {
            addCriterion("child_module is not null");
            return (Criteria) this;
        }

        public Criteria andChildModuleEqualTo(String value) {
            addCriterion("child_module =", value, "childModule");
            return (Criteria) this;
        }

        public Criteria andChildModuleNotEqualTo(String value) {
            addCriterion("child_module <>", value, "childModule");
            return (Criteria) this;
        }

        public Criteria andChildModuleGreaterThan(String value) {
            addCriterion("child_module >", value, "childModule");
            return (Criteria) this;
        }

        public Criteria andChildModuleGreaterThanOrEqualTo(String value) {
            addCriterion("child_module >=", value, "childModule");
            return (Criteria) this;
        }

        public Criteria andChildModuleLessThan(String value) {
            addCriterion("child_module <", value, "childModule");
            return (Criteria) this;
        }

        public Criteria andChildModuleLessThanOrEqualTo(String value) {
            addCriterion("child_module <=", value, "childModule");
            return (Criteria) this;
        }

        public Criteria andChildModuleLike(String value) {
            addCriterion("child_module like", value, "childModule");
            return (Criteria) this;
        }

        public Criteria andChildModuleNotLike(String value) {
            addCriterion("child_module not like", value, "childModule");
            return (Criteria) this;
        }

        public Criteria andChildModuleIn(List<String> values) {
            addCriterion("child_module in", values, "childModule");
            return (Criteria) this;
        }

        public Criteria andChildModuleNotIn(List<String> values) {
            addCriterion("child_module not in", values, "childModule");
            return (Criteria) this;
        }

        public Criteria andChildModuleBetween(String value1, String value2) {
            addCriterion("child_module between", value1, value2, "childModule");
            return (Criteria) this;
        }

        public Criteria andChildModuleNotBetween(String value1, String value2) {
            addCriterion("child_module not between", value1, value2, "childModule");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andSiteNameIsNull() {
            addCriterion("site_name is null");
            return (Criteria) this;
        }

        public Criteria andSiteNameIsNotNull() {
            addCriterion("site_name is not null");
            return (Criteria) this;
        }

        public Criteria andSiteNameEqualTo(String value) {
            addCriterion("site_name =", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotEqualTo(String value) {
            addCriterion("site_name <>", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameGreaterThan(String value) {
            addCriterion("site_name >", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameGreaterThanOrEqualTo(String value) {
            addCriterion("site_name >=", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLessThan(String value) {
            addCriterion("site_name <", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLessThanOrEqualTo(String value) {
            addCriterion("site_name <=", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLike(String value) {
            addCriterion("site_name like", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotLike(String value) {
            addCriterion("site_name not like", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameIn(List<String> values) {
            addCriterion("site_name in", values, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotIn(List<String> values) {
            addCriterion("site_name not in", values, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameBetween(String value1, String value2) {
            addCriterion("site_name between", value1, value2, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotBetween(String value1, String value2) {
            addCriterion("site_name not between", value1, value2, "siteName");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlIsNull() {
            addCriterion("download_url is null");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlIsNotNull() {
            addCriterion("download_url is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlEqualTo(String value) {
            addCriterion("download_url =", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotEqualTo(String value) {
            addCriterion("download_url <>", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlGreaterThan(String value) {
            addCriterion("download_url >", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlGreaterThanOrEqualTo(String value) {
            addCriterion("download_url >=", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlLessThan(String value) {
            addCriterion("download_url <", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlLessThanOrEqualTo(String value) {
            addCriterion("download_url <=", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlLike(String value) {
            addCriterion("download_url like", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotLike(String value) {
            addCriterion("download_url not like", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlIn(List<String> values) {
            addCriterion("download_url in", values, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotIn(List<String> values) {
            addCriterion("download_url not in", values, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlBetween(String value1, String value2) {
            addCriterion("download_url between", value1, value2, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotBetween(String value1, String value2) {
            addCriterion("download_url not between", value1, value2, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andOtherUrlIsNull() {
            addCriterion("other_url is null");
            return (Criteria) this;
        }

        public Criteria andOtherUrlIsNotNull() {
            addCriterion("other_url is not null");
            return (Criteria) this;
        }

        public Criteria andOtherUrlEqualTo(String value) {
            addCriterion("other_url =", value, "otherUrl");
            return (Criteria) this;
        }

        public Criteria andOtherUrlNotEqualTo(String value) {
            addCriterion("other_url <>", value, "otherUrl");
            return (Criteria) this;
        }

        public Criteria andOtherUrlGreaterThan(String value) {
            addCriterion("other_url >", value, "otherUrl");
            return (Criteria) this;
        }

        public Criteria andOtherUrlGreaterThanOrEqualTo(String value) {
            addCriterion("other_url >=", value, "otherUrl");
            return (Criteria) this;
        }

        public Criteria andOtherUrlLessThan(String value) {
            addCriterion("other_url <", value, "otherUrl");
            return (Criteria) this;
        }

        public Criteria andOtherUrlLessThanOrEqualTo(String value) {
            addCriterion("other_url <=", value, "otherUrl");
            return (Criteria) this;
        }

        public Criteria andOtherUrlLike(String value) {
            addCriterion("other_url like", value, "otherUrl");
            return (Criteria) this;
        }

        public Criteria andOtherUrlNotLike(String value) {
            addCriterion("other_url not like", value, "otherUrl");
            return (Criteria) this;
        }

        public Criteria andOtherUrlIn(List<String> values) {
            addCriterion("other_url in", values, "otherUrl");
            return (Criteria) this;
        }

        public Criteria andOtherUrlNotIn(List<String> values) {
            addCriterion("other_url not in", values, "otherUrl");
            return (Criteria) this;
        }

        public Criteria andOtherUrlBetween(String value1, String value2) {
            addCriterion("other_url between", value1, value2, "otherUrl");
            return (Criteria) this;
        }

        public Criteria andOtherUrlNotBetween(String value1, String value2) {
            addCriterion("other_url not between", value1, value2, "otherUrl");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sophia_open_service
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sophia_open_service
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

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
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
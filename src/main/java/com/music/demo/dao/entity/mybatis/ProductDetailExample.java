package com.music.demo.dao.entity.mybatis;

import java.util.ArrayList;
import java.util.List;

public class ProductDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCourseDetailIdIsNull() {
            addCriterion("c_course_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseDetailIdIsNotNull() {
            addCriterion("c_course_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseDetailIdEqualTo(String value) {
            addCriterion("c_course_detail_id =", value, "courseDetailId");
            return (Criteria) this;
        }

        public Criteria andCourseDetailIdNotEqualTo(String value) {
            addCriterion("c_course_detail_id <>", value, "courseDetailId");
            return (Criteria) this;
        }

        public Criteria andCourseDetailIdGreaterThan(String value) {
            addCriterion("c_course_detail_id >", value, "courseDetailId");
            return (Criteria) this;
        }

        public Criteria andCourseDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_course_detail_id >=", value, "courseDetailId");
            return (Criteria) this;
        }

        public Criteria andCourseDetailIdLessThan(String value) {
            addCriterion("c_course_detail_id <", value, "courseDetailId");
            return (Criteria) this;
        }

        public Criteria andCourseDetailIdLessThanOrEqualTo(String value) {
            addCriterion("c_course_detail_id <=", value, "courseDetailId");
            return (Criteria) this;
        }

        public Criteria andCourseDetailIdLike(String value) {
            addCriterion("c_course_detail_id like", value, "courseDetailId");
            return (Criteria) this;
        }

        public Criteria andCourseDetailIdNotLike(String value) {
            addCriterion("c_course_detail_id not like", value, "courseDetailId");
            return (Criteria) this;
        }

        public Criteria andCourseDetailIdIn(List<String> values) {
            addCriterion("c_course_detail_id in", values, "courseDetailId");
            return (Criteria) this;
        }

        public Criteria andCourseDetailIdNotIn(List<String> values) {
            addCriterion("c_course_detail_id not in", values, "courseDetailId");
            return (Criteria) this;
        }

        public Criteria andCourseDetailIdBetween(String value1, String value2) {
            addCriterion("c_course_detail_id between", value1, value2, "courseDetailId");
            return (Criteria) this;
        }

        public Criteria andCourseDetailIdNotBetween(String value1, String value2) {
            addCriterion("c_course_detail_id not between", value1, value2, "courseDetailId");
            return (Criteria) this;
        }

        public Criteria andCourseDetailAiliIdIsNull() {
            addCriterion("c_course_detail_aili_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseDetailAiliIdIsNotNull() {
            addCriterion("c_course_detail_aili_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseDetailAiliIdEqualTo(String value) {
            addCriterion("c_course_detail_aili_id =", value, "courseDetailAiliId");
            return (Criteria) this;
        }

        public Criteria andCourseDetailAiliIdNotEqualTo(String value) {
            addCriterion("c_course_detail_aili_id <>", value, "courseDetailAiliId");
            return (Criteria) this;
        }

        public Criteria andCourseDetailAiliIdGreaterThan(String value) {
            addCriterion("c_course_detail_aili_id >", value, "courseDetailAiliId");
            return (Criteria) this;
        }

        public Criteria andCourseDetailAiliIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_course_detail_aili_id >=", value, "courseDetailAiliId");
            return (Criteria) this;
        }

        public Criteria andCourseDetailAiliIdLessThan(String value) {
            addCriterion("c_course_detail_aili_id <", value, "courseDetailAiliId");
            return (Criteria) this;
        }

        public Criteria andCourseDetailAiliIdLessThanOrEqualTo(String value) {
            addCriterion("c_course_detail_aili_id <=", value, "courseDetailAiliId");
            return (Criteria) this;
        }

        public Criteria andCourseDetailAiliIdLike(String value) {
            addCriterion("c_course_detail_aili_id like", value, "courseDetailAiliId");
            return (Criteria) this;
        }

        public Criteria andCourseDetailAiliIdNotLike(String value) {
            addCriterion("c_course_detail_aili_id not like", value, "courseDetailAiliId");
            return (Criteria) this;
        }

        public Criteria andCourseDetailAiliIdIn(List<String> values) {
            addCriterion("c_course_detail_aili_id in", values, "courseDetailAiliId");
            return (Criteria) this;
        }

        public Criteria andCourseDetailAiliIdNotIn(List<String> values) {
            addCriterion("c_course_detail_aili_id not in", values, "courseDetailAiliId");
            return (Criteria) this;
        }

        public Criteria andCourseDetailAiliIdBetween(String value1, String value2) {
            addCriterion("c_course_detail_aili_id between", value1, value2, "courseDetailAiliId");
            return (Criteria) this;
        }

        public Criteria andCourseDetailAiliIdNotBetween(String value1, String value2) {
            addCriterion("c_course_detail_aili_id not between", value1, value2, "courseDetailAiliId");
            return (Criteria) this;
        }

        public Criteria andCourseTitleIsNull() {
            addCriterion("c_course_title is null");
            return (Criteria) this;
        }

        public Criteria andCourseTitleIsNotNull() {
            addCriterion("c_course_title is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTitleEqualTo(String value) {
            addCriterion("c_course_title =", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleNotEqualTo(String value) {
            addCriterion("c_course_title <>", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleGreaterThan(String value) {
            addCriterion("c_course_title >", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleGreaterThanOrEqualTo(String value) {
            addCriterion("c_course_title >=", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleLessThan(String value) {
            addCriterion("c_course_title <", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleLessThanOrEqualTo(String value) {
            addCriterion("c_course_title <=", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleLike(String value) {
            addCriterion("c_course_title like", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleNotLike(String value) {
            addCriterion("c_course_title not like", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleIn(List<String> values) {
            addCriterion("c_course_title in", values, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleNotIn(List<String> values) {
            addCriterion("c_course_title not in", values, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleBetween(String value1, String value2) {
            addCriterion("c_course_title between", value1, value2, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleNotBetween(String value1, String value2) {
            addCriterion("c_course_title not between", value1, value2, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTimeIsNull() {
            addCriterion("c_course_time is null");
            return (Criteria) this;
        }

        public Criteria andCourseTimeIsNotNull() {
            addCriterion("c_course_time is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTimeEqualTo(String value) {
            addCriterion("c_course_time =", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeNotEqualTo(String value) {
            addCriterion("c_course_time <>", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeGreaterThan(String value) {
            addCriterion("c_course_time >", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("c_course_time >=", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeLessThan(String value) {
            addCriterion("c_course_time <", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeLessThanOrEqualTo(String value) {
            addCriterion("c_course_time <=", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeLike(String value) {
            addCriterion("c_course_time like", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeNotLike(String value) {
            addCriterion("c_course_time not like", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeIn(List<String> values) {
            addCriterion("c_course_time in", values, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeNotIn(List<String> values) {
            addCriterion("c_course_time not in", values, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeBetween(String value1, String value2) {
            addCriterion("c_course_time between", value1, value2, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeNotBetween(String value1, String value2) {
            addCriterion("c_course_time not between", value1, value2, "courseTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
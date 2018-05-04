package com.music.demo.dao.entity.mybatis;

import java.util.ArrayList;
import java.util.List;

public class ProductMesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductMesExample() {
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

        public Criteria andCourseIdIsNull() {
            addCriterion("c_course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("c_course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(String value) {
            addCriterion("c_course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(String value) {
            addCriterion("c_course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(String value) {
            addCriterion("c_course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(String value) {
            addCriterion("c_course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(String value) {
            addCriterion("c_course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLike(String value) {
            addCriterion("c_course_id like", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotLike(String value) {
            addCriterion("c_course_id not like", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<String> values) {
            addCriterion("c_course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<String> values) {
            addCriterion("c_course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(String value1, String value2) {
            addCriterion("c_course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(String value1, String value2) {
            addCriterion("c_course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("c_course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("c_course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("c_course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("c_course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("c_course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("c_course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("c_course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("c_course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("c_course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("c_course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("c_course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("c_course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("c_course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIsNull() {
            addCriterion("c_course_type is null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIsNotNull() {
            addCriterion("c_course_type is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeEqualTo(String value) {
            addCriterion("c_course_type =", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotEqualTo(String value) {
            addCriterion("c_course_type <>", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeGreaterThan(String value) {
            addCriterion("c_course_type >", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_course_type >=", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLessThan(String value) {
            addCriterion("c_course_type <", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLessThanOrEqualTo(String value) {
            addCriterion("c_course_type <=", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLike(String value) {
            addCriterion("c_course_type like", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotLike(String value) {
            addCriterion("c_course_type not like", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIn(List<String> values) {
            addCriterion("c_course_type in", values, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotIn(List<String> values) {
            addCriterion("c_course_type not in", values, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeBetween(String value1, String value2) {
            addCriterion("c_course_type between", value1, value2, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotBetween(String value1, String value2) {
            addCriterion("c_course_type not between", value1, value2, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseIsfreeIsNull() {
            addCriterion("c_course_isfree is null");
            return (Criteria) this;
        }

        public Criteria andCourseIsfreeIsNotNull() {
            addCriterion("c_course_isfree is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIsfreeEqualTo(String value) {
            addCriterion("c_course_isfree =", value, "courseIsfree");
            return (Criteria) this;
        }

        public Criteria andCourseIsfreeNotEqualTo(String value) {
            addCriterion("c_course_isfree <>", value, "courseIsfree");
            return (Criteria) this;
        }

        public Criteria andCourseIsfreeGreaterThan(String value) {
            addCriterion("c_course_isfree >", value, "courseIsfree");
            return (Criteria) this;
        }

        public Criteria andCourseIsfreeGreaterThanOrEqualTo(String value) {
            addCriterion("c_course_isfree >=", value, "courseIsfree");
            return (Criteria) this;
        }

        public Criteria andCourseIsfreeLessThan(String value) {
            addCriterion("c_course_isfree <", value, "courseIsfree");
            return (Criteria) this;
        }

        public Criteria andCourseIsfreeLessThanOrEqualTo(String value) {
            addCriterion("c_course_isfree <=", value, "courseIsfree");
            return (Criteria) this;
        }

        public Criteria andCourseIsfreeLike(String value) {
            addCriterion("c_course_isfree like", value, "courseIsfree");
            return (Criteria) this;
        }

        public Criteria andCourseIsfreeNotLike(String value) {
            addCriterion("c_course_isfree not like", value, "courseIsfree");
            return (Criteria) this;
        }

        public Criteria andCourseIsfreeIn(List<String> values) {
            addCriterion("c_course_isfree in", values, "courseIsfree");
            return (Criteria) this;
        }

        public Criteria andCourseIsfreeNotIn(List<String> values) {
            addCriterion("c_course_isfree not in", values, "courseIsfree");
            return (Criteria) this;
        }

        public Criteria andCourseIsfreeBetween(String value1, String value2) {
            addCriterion("c_course_isfree between", value1, value2, "courseIsfree");
            return (Criteria) this;
        }

        public Criteria andCourseIsfreeNotBetween(String value1, String value2) {
            addCriterion("c_course_isfree not between", value1, value2, "courseIsfree");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionIsNull() {
            addCriterion("c_course_introduction is null");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionIsNotNull() {
            addCriterion("c_course_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionEqualTo(String value) {
            addCriterion("c_course_introduction =", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionNotEqualTo(String value) {
            addCriterion("c_course_introduction <>", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionGreaterThan(String value) {
            addCriterion("c_course_introduction >", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("c_course_introduction >=", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionLessThan(String value) {
            addCriterion("c_course_introduction <", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionLessThanOrEqualTo(String value) {
            addCriterion("c_course_introduction <=", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionLike(String value) {
            addCriterion("c_course_introduction like", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionNotLike(String value) {
            addCriterion("c_course_introduction not like", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionIn(List<String> values) {
            addCriterion("c_course_introduction in", values, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionNotIn(List<String> values) {
            addCriterion("c_course_introduction not in", values, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionBetween(String value1, String value2) {
            addCriterion("c_course_introduction between", value1, value2, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionNotBetween(String value1, String value2) {
            addCriterion("c_course_introduction not between", value1, value2, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseOwnerIdIsNull() {
            addCriterion("c_course_owner_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseOwnerIdIsNotNull() {
            addCriterion("c_course_owner_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseOwnerIdEqualTo(String value) {
            addCriterion("c_course_owner_id =", value, "courseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCourseOwnerIdNotEqualTo(String value) {
            addCriterion("c_course_owner_id <>", value, "courseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCourseOwnerIdGreaterThan(String value) {
            addCriterion("c_course_owner_id >", value, "courseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCourseOwnerIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_course_owner_id >=", value, "courseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCourseOwnerIdLessThan(String value) {
            addCriterion("c_course_owner_id <", value, "courseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCourseOwnerIdLessThanOrEqualTo(String value) {
            addCriterion("c_course_owner_id <=", value, "courseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCourseOwnerIdLike(String value) {
            addCriterion("c_course_owner_id like", value, "courseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCourseOwnerIdNotLike(String value) {
            addCriterion("c_course_owner_id not like", value, "courseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCourseOwnerIdIn(List<String> values) {
            addCriterion("c_course_owner_id in", values, "courseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCourseOwnerIdNotIn(List<String> values) {
            addCriterion("c_course_owner_id not in", values, "courseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCourseOwnerIdBetween(String value1, String value2) {
            addCriterion("c_course_owner_id between", value1, value2, "courseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCourseOwnerIdNotBetween(String value1, String value2) {
            addCriterion("c_course_owner_id not between", value1, value2, "courseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherIsNull() {
            addCriterion("c_course_teacher is null");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherIsNotNull() {
            addCriterion("c_course_teacher is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherEqualTo(String value) {
            addCriterion("c_course_teacher =", value, "courseTeacher");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherNotEqualTo(String value) {
            addCriterion("c_course_teacher <>", value, "courseTeacher");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherGreaterThan(String value) {
            addCriterion("c_course_teacher >", value, "courseTeacher");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("c_course_teacher >=", value, "courseTeacher");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherLessThan(String value) {
            addCriterion("c_course_teacher <", value, "courseTeacher");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherLessThanOrEqualTo(String value) {
            addCriterion("c_course_teacher <=", value, "courseTeacher");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherLike(String value) {
            addCriterion("c_course_teacher like", value, "courseTeacher");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherNotLike(String value) {
            addCriterion("c_course_teacher not like", value, "courseTeacher");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherIn(List<String> values) {
            addCriterion("c_course_teacher in", values, "courseTeacher");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherNotIn(List<String> values) {
            addCriterion("c_course_teacher not in", values, "courseTeacher");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherBetween(String value1, String value2) {
            addCriterion("c_course_teacher between", value1, value2, "courseTeacher");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherNotBetween(String value1, String value2) {
            addCriterion("c_course_teacher not between", value1, value2, "courseTeacher");
            return (Criteria) this;
        }

        public Criteria andCourseTimesIsNull() {
            addCriterion("c_course_times is null");
            return (Criteria) this;
        }

        public Criteria andCourseTimesIsNotNull() {
            addCriterion("c_course_times is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTimesEqualTo(String value) {
            addCriterion("c_course_times =", value, "courseTimes");
            return (Criteria) this;
        }

        public Criteria andCourseTimesNotEqualTo(String value) {
            addCriterion("c_course_times <>", value, "courseTimes");
            return (Criteria) this;
        }

        public Criteria andCourseTimesGreaterThan(String value) {
            addCriterion("c_course_times >", value, "courseTimes");
            return (Criteria) this;
        }

        public Criteria andCourseTimesGreaterThanOrEqualTo(String value) {
            addCriterion("c_course_times >=", value, "courseTimes");
            return (Criteria) this;
        }

        public Criteria andCourseTimesLessThan(String value) {
            addCriterion("c_course_times <", value, "courseTimes");
            return (Criteria) this;
        }

        public Criteria andCourseTimesLessThanOrEqualTo(String value) {
            addCriterion("c_course_times <=", value, "courseTimes");
            return (Criteria) this;
        }

        public Criteria andCourseTimesLike(String value) {
            addCriterion("c_course_times like", value, "courseTimes");
            return (Criteria) this;
        }

        public Criteria andCourseTimesNotLike(String value) {
            addCriterion("c_course_times not like", value, "courseTimes");
            return (Criteria) this;
        }

        public Criteria andCourseTimesIn(List<String> values) {
            addCriterion("c_course_times in", values, "courseTimes");
            return (Criteria) this;
        }

        public Criteria andCourseTimesNotIn(List<String> values) {
            addCriterion("c_course_times not in", values, "courseTimes");
            return (Criteria) this;
        }

        public Criteria andCourseTimesBetween(String value1, String value2) {
            addCriterion("c_course_times between", value1, value2, "courseTimes");
            return (Criteria) this;
        }

        public Criteria andCourseTimesNotBetween(String value1, String value2) {
            addCriterion("c_course_times not between", value1, value2, "courseTimes");
            return (Criteria) this;
        }

        public Criteria andCourseCreaterIsNull() {
            addCriterion("c_course_creater is null");
            return (Criteria) this;
        }

        public Criteria andCourseCreaterIsNotNull() {
            addCriterion("c_course_creater is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCreaterEqualTo(String value) {
            addCriterion("c_course_creater =", value, "courseCreater");
            return (Criteria) this;
        }

        public Criteria andCourseCreaterNotEqualTo(String value) {
            addCriterion("c_course_creater <>", value, "courseCreater");
            return (Criteria) this;
        }

        public Criteria andCourseCreaterGreaterThan(String value) {
            addCriterion("c_course_creater >", value, "courseCreater");
            return (Criteria) this;
        }

        public Criteria andCourseCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("c_course_creater >=", value, "courseCreater");
            return (Criteria) this;
        }

        public Criteria andCourseCreaterLessThan(String value) {
            addCriterion("c_course_creater <", value, "courseCreater");
            return (Criteria) this;
        }

        public Criteria andCourseCreaterLessThanOrEqualTo(String value) {
            addCriterion("c_course_creater <=", value, "courseCreater");
            return (Criteria) this;
        }

        public Criteria andCourseCreaterLike(String value) {
            addCriterion("c_course_creater like", value, "courseCreater");
            return (Criteria) this;
        }

        public Criteria andCourseCreaterNotLike(String value) {
            addCriterion("c_course_creater not like", value, "courseCreater");
            return (Criteria) this;
        }

        public Criteria andCourseCreaterIn(List<String> values) {
            addCriterion("c_course_creater in", values, "courseCreater");
            return (Criteria) this;
        }

        public Criteria andCourseCreaterNotIn(List<String> values) {
            addCriterion("c_course_creater not in", values, "courseCreater");
            return (Criteria) this;
        }

        public Criteria andCourseCreaterBetween(String value1, String value2) {
            addCriterion("c_course_creater between", value1, value2, "courseCreater");
            return (Criteria) this;
        }

        public Criteria andCourseCreaterNotBetween(String value1, String value2) {
            addCriterion("c_course_creater not between", value1, value2, "courseCreater");
            return (Criteria) this;
        }

        public Criteria andCourseTopOrderIsNull() {
            addCriterion("c_course_top_order is null");
            return (Criteria) this;
        }

        public Criteria andCourseTopOrderIsNotNull() {
            addCriterion("c_course_top_order is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTopOrderEqualTo(String value) {
            addCriterion("c_course_top_order =", value, "courseTopOrder");
            return (Criteria) this;
        }

        public Criteria andCourseTopOrderNotEqualTo(String value) {
            addCriterion("c_course_top_order <>", value, "courseTopOrder");
            return (Criteria) this;
        }

        public Criteria andCourseTopOrderGreaterThan(String value) {
            addCriterion("c_course_top_order >", value, "courseTopOrder");
            return (Criteria) this;
        }

        public Criteria andCourseTopOrderGreaterThanOrEqualTo(String value) {
            addCriterion("c_course_top_order >=", value, "courseTopOrder");
            return (Criteria) this;
        }

        public Criteria andCourseTopOrderLessThan(String value) {
            addCriterion("c_course_top_order <", value, "courseTopOrder");
            return (Criteria) this;
        }

        public Criteria andCourseTopOrderLessThanOrEqualTo(String value) {
            addCriterion("c_course_top_order <=", value, "courseTopOrder");
            return (Criteria) this;
        }

        public Criteria andCourseTopOrderLike(String value) {
            addCriterion("c_course_top_order like", value, "courseTopOrder");
            return (Criteria) this;
        }

        public Criteria andCourseTopOrderNotLike(String value) {
            addCriterion("c_course_top_order not like", value, "courseTopOrder");
            return (Criteria) this;
        }

        public Criteria andCourseTopOrderIn(List<String> values) {
            addCriterion("c_course_top_order in", values, "courseTopOrder");
            return (Criteria) this;
        }

        public Criteria andCourseTopOrderNotIn(List<String> values) {
            addCriterion("c_course_top_order not in", values, "courseTopOrder");
            return (Criteria) this;
        }

        public Criteria andCourseTopOrderBetween(String value1, String value2) {
            addCriterion("c_course_top_order between", value1, value2, "courseTopOrder");
            return (Criteria) this;
        }

        public Criteria andCourseTopOrderNotBetween(String value1, String value2) {
            addCriterion("c_course_top_order not between", value1, value2, "courseTopOrder");
            return (Criteria) this;
        }

        public Criteria andProductMiddlePicListIdIsNull() {
            addCriterion("c_product_middle_pic_list_id is null");
            return (Criteria) this;
        }

        public Criteria andProductMiddlePicListIdIsNotNull() {
            addCriterion("c_product_middle_pic_list_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductMiddlePicListIdEqualTo(String value) {
            addCriterion("c_product_middle_pic_list_id =", value, "productMiddlePicListId");
            return (Criteria) this;
        }

        public Criteria andProductMiddlePicListIdNotEqualTo(String value) {
            addCriterion("c_product_middle_pic_list_id <>", value, "productMiddlePicListId");
            return (Criteria) this;
        }

        public Criteria andProductMiddlePicListIdGreaterThan(String value) {
            addCriterion("c_product_middle_pic_list_id >", value, "productMiddlePicListId");
            return (Criteria) this;
        }

        public Criteria andProductMiddlePicListIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_product_middle_pic_list_id >=", value, "productMiddlePicListId");
            return (Criteria) this;
        }

        public Criteria andProductMiddlePicListIdLessThan(String value) {
            addCriterion("c_product_middle_pic_list_id <", value, "productMiddlePicListId");
            return (Criteria) this;
        }

        public Criteria andProductMiddlePicListIdLessThanOrEqualTo(String value) {
            addCriterion("c_product_middle_pic_list_id <=", value, "productMiddlePicListId");
            return (Criteria) this;
        }

        public Criteria andProductMiddlePicListIdLike(String value) {
            addCriterion("c_product_middle_pic_list_id like", value, "productMiddlePicListId");
            return (Criteria) this;
        }

        public Criteria andProductMiddlePicListIdNotLike(String value) {
            addCriterion("c_product_middle_pic_list_id not like", value, "productMiddlePicListId");
            return (Criteria) this;
        }

        public Criteria andProductMiddlePicListIdIn(List<String> values) {
            addCriterion("c_product_middle_pic_list_id in", values, "productMiddlePicListId");
            return (Criteria) this;
        }

        public Criteria andProductMiddlePicListIdNotIn(List<String> values) {
            addCriterion("c_product_middle_pic_list_id not in", values, "productMiddlePicListId");
            return (Criteria) this;
        }

        public Criteria andProductMiddlePicListIdBetween(String value1, String value2) {
            addCriterion("c_product_middle_pic_list_id between", value1, value2, "productMiddlePicListId");
            return (Criteria) this;
        }

        public Criteria andProductMiddlePicListIdNotBetween(String value1, String value2) {
            addCriterion("c_product_middle_pic_list_id not between", value1, value2, "productMiddlePicListId");
            return (Criteria) this;
        }

        public Criteria andCoursePicUrlIsNull() {
            addCriterion("c_course_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andCoursePicUrlIsNotNull() {
            addCriterion("c_course_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andCoursePicUrlEqualTo(String value) {
            addCriterion("c_course_pic_url =", value, "coursePicUrl");
            return (Criteria) this;
        }

        public Criteria andCoursePicUrlNotEqualTo(String value) {
            addCriterion("c_course_pic_url <>", value, "coursePicUrl");
            return (Criteria) this;
        }

        public Criteria andCoursePicUrlGreaterThan(String value) {
            addCriterion("c_course_pic_url >", value, "coursePicUrl");
            return (Criteria) this;
        }

        public Criteria andCoursePicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("c_course_pic_url >=", value, "coursePicUrl");
            return (Criteria) this;
        }

        public Criteria andCoursePicUrlLessThan(String value) {
            addCriterion("c_course_pic_url <", value, "coursePicUrl");
            return (Criteria) this;
        }

        public Criteria andCoursePicUrlLessThanOrEqualTo(String value) {
            addCriterion("c_course_pic_url <=", value, "coursePicUrl");
            return (Criteria) this;
        }

        public Criteria andCoursePicUrlLike(String value) {
            addCriterion("c_course_pic_url like", value, "coursePicUrl");
            return (Criteria) this;
        }

        public Criteria andCoursePicUrlNotLike(String value) {
            addCriterion("c_course_pic_url not like", value, "coursePicUrl");
            return (Criteria) this;
        }

        public Criteria andCoursePicUrlIn(List<String> values) {
            addCriterion("c_course_pic_url in", values, "coursePicUrl");
            return (Criteria) this;
        }

        public Criteria andCoursePicUrlNotIn(List<String> values) {
            addCriterion("c_course_pic_url not in", values, "coursePicUrl");
            return (Criteria) this;
        }

        public Criteria andCoursePicUrlBetween(String value1, String value2) {
            addCriterion("c_course_pic_url between", value1, value2, "coursePicUrl");
            return (Criteria) this;
        }

        public Criteria andCoursePicUrlNotBetween(String value1, String value2) {
            addCriterion("c_course_pic_url not between", value1, value2, "coursePicUrl");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNull() {
            addCriterion("c_product_num is null");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNotNull() {
            addCriterion("c_product_num is not null");
            return (Criteria) this;
        }

        public Criteria andProductNumEqualTo(String value) {
            addCriterion("c_product_num =", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotEqualTo(String value) {
            addCriterion("c_product_num <>", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThan(String value) {
            addCriterion("c_product_num >", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThanOrEqualTo(String value) {
            addCriterion("c_product_num >=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThan(String value) {
            addCriterion("c_product_num <", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThanOrEqualTo(String value) {
            addCriterion("c_product_num <=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLike(String value) {
            addCriterion("c_product_num like", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotLike(String value) {
            addCriterion("c_product_num not like", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumIn(List<String> values) {
            addCriterion("c_product_num in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotIn(List<String> values) {
            addCriterion("c_product_num not in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumBetween(String value1, String value2) {
            addCriterion("c_product_num between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotBetween(String value1, String value2) {
            addCriterion("c_product_num not between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andCourseSalePriceIsNull() {
            addCriterion("c_course_sale_price is null");
            return (Criteria) this;
        }

        public Criteria andCourseSalePriceIsNotNull() {
            addCriterion("c_course_sale_price is not null");
            return (Criteria) this;
        }

        public Criteria andCourseSalePriceEqualTo(String value) {
            addCriterion("c_course_sale_price =", value, "courseSalePrice");
            return (Criteria) this;
        }

        public Criteria andCourseSalePriceNotEqualTo(String value) {
            addCriterion("c_course_sale_price <>", value, "courseSalePrice");
            return (Criteria) this;
        }

        public Criteria andCourseSalePriceGreaterThan(String value) {
            addCriterion("c_course_sale_price >", value, "courseSalePrice");
            return (Criteria) this;
        }

        public Criteria andCourseSalePriceGreaterThanOrEqualTo(String value) {
            addCriterion("c_course_sale_price >=", value, "courseSalePrice");
            return (Criteria) this;
        }

        public Criteria andCourseSalePriceLessThan(String value) {
            addCriterion("c_course_sale_price <", value, "courseSalePrice");
            return (Criteria) this;
        }

        public Criteria andCourseSalePriceLessThanOrEqualTo(String value) {
            addCriterion("c_course_sale_price <=", value, "courseSalePrice");
            return (Criteria) this;
        }

        public Criteria andCourseSalePriceLike(String value) {
            addCriterion("c_course_sale_price like", value, "courseSalePrice");
            return (Criteria) this;
        }

        public Criteria andCourseSalePriceNotLike(String value) {
            addCriterion("c_course_sale_price not like", value, "courseSalePrice");
            return (Criteria) this;
        }

        public Criteria andCourseSalePriceIn(List<String> values) {
            addCriterion("c_course_sale_price in", values, "courseSalePrice");
            return (Criteria) this;
        }

        public Criteria andCourseSalePriceNotIn(List<String> values) {
            addCriterion("c_course_sale_price not in", values, "courseSalePrice");
            return (Criteria) this;
        }

        public Criteria andCourseSalePriceBetween(String value1, String value2) {
            addCriterion("c_course_sale_price between", value1, value2, "courseSalePrice");
            return (Criteria) this;
        }

        public Criteria andCourseSalePriceNotBetween(String value1, String value2) {
            addCriterion("c_course_sale_price not between", value1, value2, "courseSalePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceIsNull() {
            addCriterion("c_course_price is null");
            return (Criteria) this;
        }

        public Criteria andCoursePriceIsNotNull() {
            addCriterion("c_course_price is not null");
            return (Criteria) this;
        }

        public Criteria andCoursePriceEqualTo(String value) {
            addCriterion("c_course_price =", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceNotEqualTo(String value) {
            addCriterion("c_course_price <>", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceGreaterThan(String value) {
            addCriterion("c_course_price >", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceGreaterThanOrEqualTo(String value) {
            addCriterion("c_course_price >=", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceLessThan(String value) {
            addCriterion("c_course_price <", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceLessThanOrEqualTo(String value) {
            addCriterion("c_course_price <=", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceLike(String value) {
            addCriterion("c_course_price like", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceNotLike(String value) {
            addCriterion("c_course_price not like", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceIn(List<String> values) {
            addCriterion("c_course_price in", values, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceNotIn(List<String> values) {
            addCriterion("c_course_price not in", values, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceBetween(String value1, String value2) {
            addCriterion("c_course_price between", value1, value2, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceNotBetween(String value1, String value2) {
            addCriterion("c_course_price not between", value1, value2, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andText1IsNull() {
            addCriterion("c_text1 is null");
            return (Criteria) this;
        }

        public Criteria andText1IsNotNull() {
            addCriterion("c_text1 is not null");
            return (Criteria) this;
        }

        public Criteria andText1EqualTo(String value) {
            addCriterion("c_text1 =", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1NotEqualTo(String value) {
            addCriterion("c_text1 <>", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1GreaterThan(String value) {
            addCriterion("c_text1 >", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1GreaterThanOrEqualTo(String value) {
            addCriterion("c_text1 >=", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1LessThan(String value) {
            addCriterion("c_text1 <", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1LessThanOrEqualTo(String value) {
            addCriterion("c_text1 <=", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1Like(String value) {
            addCriterion("c_text1 like", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1NotLike(String value) {
            addCriterion("c_text1 not like", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1In(List<String> values) {
            addCriterion("c_text1 in", values, "text1");
            return (Criteria) this;
        }

        public Criteria andText1NotIn(List<String> values) {
            addCriterion("c_text1 not in", values, "text1");
            return (Criteria) this;
        }

        public Criteria andText1Between(String value1, String value2) {
            addCriterion("c_text1 between", value1, value2, "text1");
            return (Criteria) this;
        }

        public Criteria andText1NotBetween(String value1, String value2) {
            addCriterion("c_text1 not between", value1, value2, "text1");
            return (Criteria) this;
        }

        public Criteria andText2IsNull() {
            addCriterion("c_text2 is null");
            return (Criteria) this;
        }

        public Criteria andText2IsNotNull() {
            addCriterion("c_text2 is not null");
            return (Criteria) this;
        }

        public Criteria andText2EqualTo(String value) {
            addCriterion("c_text2 =", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2NotEqualTo(String value) {
            addCriterion("c_text2 <>", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2GreaterThan(String value) {
            addCriterion("c_text2 >", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2GreaterThanOrEqualTo(String value) {
            addCriterion("c_text2 >=", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2LessThan(String value) {
            addCriterion("c_text2 <", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2LessThanOrEqualTo(String value) {
            addCriterion("c_text2 <=", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2Like(String value) {
            addCriterion("c_text2 like", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2NotLike(String value) {
            addCriterion("c_text2 not like", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2In(List<String> values) {
            addCriterion("c_text2 in", values, "text2");
            return (Criteria) this;
        }

        public Criteria andText2NotIn(List<String> values) {
            addCriterion("c_text2 not in", values, "text2");
            return (Criteria) this;
        }

        public Criteria andText2Between(String value1, String value2) {
            addCriterion("c_text2 between", value1, value2, "text2");
            return (Criteria) this;
        }

        public Criteria andText2NotBetween(String value1, String value2) {
            addCriterion("c_text2 not between", value1, value2, "text2");
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
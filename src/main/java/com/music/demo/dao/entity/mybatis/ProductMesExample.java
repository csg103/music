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

        public Criteria andProductParentIdIsNull() {
            addCriterion("c_product_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andProductParentIdIsNotNull() {
            addCriterion("c_product_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductParentIdEqualTo(String value) {
            addCriterion("c_product_parent_id =", value, "productParentId");
            return (Criteria) this;
        }

        public Criteria andProductParentIdNotEqualTo(String value) {
            addCriterion("c_product_parent_id <>", value, "productParentId");
            return (Criteria) this;
        }

        public Criteria andProductParentIdGreaterThan(String value) {
            addCriterion("c_product_parent_id >", value, "productParentId");
            return (Criteria) this;
        }

        public Criteria andProductParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_product_parent_id >=", value, "productParentId");
            return (Criteria) this;
        }

        public Criteria andProductParentIdLessThan(String value) {
            addCriterion("c_product_parent_id <", value, "productParentId");
            return (Criteria) this;
        }

        public Criteria andProductParentIdLessThanOrEqualTo(String value) {
            addCriterion("c_product_parent_id <=", value, "productParentId");
            return (Criteria) this;
        }

        public Criteria andProductParentIdLike(String value) {
            addCriterion("c_product_parent_id like", value, "productParentId");
            return (Criteria) this;
        }

        public Criteria andProductParentIdNotLike(String value) {
            addCriterion("c_product_parent_id not like", value, "productParentId");
            return (Criteria) this;
        }

        public Criteria andProductParentIdIn(List<String> values) {
            addCriterion("c_product_parent_id in", values, "productParentId");
            return (Criteria) this;
        }

        public Criteria andProductParentIdNotIn(List<String> values) {
            addCriterion("c_product_parent_id not in", values, "productParentId");
            return (Criteria) this;
        }

        public Criteria andProductParentIdBetween(String value1, String value2) {
            addCriterion("c_product_parent_id between", value1, value2, "productParentId");
            return (Criteria) this;
        }

        public Criteria andProductParentIdNotBetween(String value1, String value2) {
            addCriterion("c_product_parent_id not between", value1, value2, "productParentId");
            return (Criteria) this;
        }

        public Criteria andProductParentNameIsNull() {
            addCriterion("c_product_parent_name is null");
            return (Criteria) this;
        }

        public Criteria andProductParentNameIsNotNull() {
            addCriterion("c_product_parent_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductParentNameEqualTo(String value) {
            addCriterion("c_product_parent_name =", value, "productParentName");
            return (Criteria) this;
        }

        public Criteria andProductParentNameNotEqualTo(String value) {
            addCriterion("c_product_parent_name <>", value, "productParentName");
            return (Criteria) this;
        }

        public Criteria andProductParentNameGreaterThan(String value) {
            addCriterion("c_product_parent_name >", value, "productParentName");
            return (Criteria) this;
        }

        public Criteria andProductParentNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_product_parent_name >=", value, "productParentName");
            return (Criteria) this;
        }

        public Criteria andProductParentNameLessThan(String value) {
            addCriterion("c_product_parent_name <", value, "productParentName");
            return (Criteria) this;
        }

        public Criteria andProductParentNameLessThanOrEqualTo(String value) {
            addCriterion("c_product_parent_name <=", value, "productParentName");
            return (Criteria) this;
        }

        public Criteria andProductParentNameLike(String value) {
            addCriterion("c_product_parent_name like", value, "productParentName");
            return (Criteria) this;
        }

        public Criteria andProductParentNameNotLike(String value) {
            addCriterion("c_product_parent_name not like", value, "productParentName");
            return (Criteria) this;
        }

        public Criteria andProductParentNameIn(List<String> values) {
            addCriterion("c_product_parent_name in", values, "productParentName");
            return (Criteria) this;
        }

        public Criteria andProductParentNameNotIn(List<String> values) {
            addCriterion("c_product_parent_name not in", values, "productParentName");
            return (Criteria) this;
        }

        public Criteria andProductParentNameBetween(String value1, String value2) {
            addCriterion("c_product_parent_name between", value1, value2, "productParentName");
            return (Criteria) this;
        }

        public Criteria andProductParentNameNotBetween(String value1, String value2) {
            addCriterion("c_product_parent_name not between", value1, value2, "productParentName");
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
package com.music.demo.dao.entity.mybatis;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProductRelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductRelExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andProductIdIsNull() {
            addCriterion("c_product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("c_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("c_product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("c_product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("c_product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("c_product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("c_product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("c_product_id like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("c_product_id not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("c_product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("c_product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("c_product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("c_product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("c_product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("c_product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("c_product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("c_product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("c_product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("c_product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("c_product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("c_product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("c_product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("c_product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("c_product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("c_product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("c_product_name not between", value1, value2, "productName");
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

        public Criteria andProductIsfreeIsNull() {
            addCriterion("c_product_isfree is null");
            return (Criteria) this;
        }

        public Criteria andProductIsfreeIsNotNull() {
            addCriterion("c_product_isfree is not null");
            return (Criteria) this;
        }

        public Criteria andProductIsfreeEqualTo(String value) {
            addCriterion("c_product_isfree =", value, "productIsfree");
            return (Criteria) this;
        }

        public Criteria andProductIsfreeNotEqualTo(String value) {
            addCriterion("c_product_isfree <>", value, "productIsfree");
            return (Criteria) this;
        }

        public Criteria andProductIsfreeGreaterThan(String value) {
            addCriterion("c_product_isfree >", value, "productIsfree");
            return (Criteria) this;
        }

        public Criteria andProductIsfreeGreaterThanOrEqualTo(String value) {
            addCriterion("c_product_isfree >=", value, "productIsfree");
            return (Criteria) this;
        }

        public Criteria andProductIsfreeLessThan(String value) {
            addCriterion("c_product_isfree <", value, "productIsfree");
            return (Criteria) this;
        }

        public Criteria andProductIsfreeLessThanOrEqualTo(String value) {
            addCriterion("c_product_isfree <=", value, "productIsfree");
            return (Criteria) this;
        }

        public Criteria andProductIsfreeLike(String value) {
            addCriterion("c_product_isfree like", value, "productIsfree");
            return (Criteria) this;
        }

        public Criteria andProductIsfreeNotLike(String value) {
            addCriterion("c_product_isfree not like", value, "productIsfree");
            return (Criteria) this;
        }

        public Criteria andProductIsfreeIn(List<String> values) {
            addCriterion("c_product_isfree in", values, "productIsfree");
            return (Criteria) this;
        }

        public Criteria andProductIsfreeNotIn(List<String> values) {
            addCriterion("c_product_isfree not in", values, "productIsfree");
            return (Criteria) this;
        }

        public Criteria andProductIsfreeBetween(String value1, String value2) {
            addCriterion("c_product_isfree between", value1, value2, "productIsfree");
            return (Criteria) this;
        }

        public Criteria andProductIsfreeNotBetween(String value1, String value2) {
            addCriterion("c_product_isfree not between", value1, value2, "productIsfree");
            return (Criteria) this;
        }

        public Criteria andProductNtroductionIsNull() {
            addCriterion("c_product_ntroduction is null");
            return (Criteria) this;
        }

        public Criteria andProductNtroductionIsNotNull() {
            addCriterion("c_product_ntroduction is not null");
            return (Criteria) this;
        }

        public Criteria andProductNtroductionEqualTo(String value) {
            addCriterion("c_product_ntroduction =", value, "productNtroduction");
            return (Criteria) this;
        }

        public Criteria andProductNtroductionNotEqualTo(String value) {
            addCriterion("c_product_ntroduction <>", value, "productNtroduction");
            return (Criteria) this;
        }

        public Criteria andProductNtroductionGreaterThan(String value) {
            addCriterion("c_product_ntroduction >", value, "productNtroduction");
            return (Criteria) this;
        }

        public Criteria andProductNtroductionGreaterThanOrEqualTo(String value) {
            addCriterion("c_product_ntroduction >=", value, "productNtroduction");
            return (Criteria) this;
        }

        public Criteria andProductNtroductionLessThan(String value) {
            addCriterion("c_product_ntroduction <", value, "productNtroduction");
            return (Criteria) this;
        }

        public Criteria andProductNtroductionLessThanOrEqualTo(String value) {
            addCriterion("c_product_ntroduction <=", value, "productNtroduction");
            return (Criteria) this;
        }

        public Criteria andProductNtroductionLike(String value) {
            addCriterion("c_product_ntroduction like", value, "productNtroduction");
            return (Criteria) this;
        }

        public Criteria andProductNtroductionNotLike(String value) {
            addCriterion("c_product_ntroduction not like", value, "productNtroduction");
            return (Criteria) this;
        }

        public Criteria andProductNtroductionIn(List<String> values) {
            addCriterion("c_product_ntroduction in", values, "productNtroduction");
            return (Criteria) this;
        }

        public Criteria andProductNtroductionNotIn(List<String> values) {
            addCriterion("c_product_ntroduction not in", values, "productNtroduction");
            return (Criteria) this;
        }

        public Criteria andProductNtroductionBetween(String value1, String value2) {
            addCriterion("c_product_ntroduction between", value1, value2, "productNtroduction");
            return (Criteria) this;
        }

        public Criteria andProductNtroductionNotBetween(String value1, String value2) {
            addCriterion("c_product_ntroduction not between", value1, value2, "productNtroduction");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIdIsNull() {
            addCriterion("c_product_owner_id is null");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIdIsNotNull() {
            addCriterion("c_product_owner_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIdEqualTo(String value) {
            addCriterion("c_product_owner_id =", value, "productOwnerId");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIdNotEqualTo(String value) {
            addCriterion("c_product_owner_id <>", value, "productOwnerId");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIdGreaterThan(String value) {
            addCriterion("c_product_owner_id >", value, "productOwnerId");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_product_owner_id >=", value, "productOwnerId");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIdLessThan(String value) {
            addCriterion("c_product_owner_id <", value, "productOwnerId");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIdLessThanOrEqualTo(String value) {
            addCriterion("c_product_owner_id <=", value, "productOwnerId");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIdLike(String value) {
            addCriterion("c_product_owner_id like", value, "productOwnerId");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIdNotLike(String value) {
            addCriterion("c_product_owner_id not like", value, "productOwnerId");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIdIn(List<String> values) {
            addCriterion("c_product_owner_id in", values, "productOwnerId");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIdNotIn(List<String> values) {
            addCriterion("c_product_owner_id not in", values, "productOwnerId");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIdBetween(String value1, String value2) {
            addCriterion("c_product_owner_id between", value1, value2, "productOwnerId");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIdNotBetween(String value1, String value2) {
            addCriterion("c_product_owner_id not between", value1, value2, "productOwnerId");
            return (Criteria) this;
        }

        public Criteria andProducTypeIdIsNull() {
            addCriterion("c_produc_type_id is null");
            return (Criteria) this;
        }

        public Criteria andProducTypeIdIsNotNull() {
            addCriterion("c_produc_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andProducTypeIdEqualTo(String value) {
            addCriterion("c_produc_type_id =", value, "producTypeId");
            return (Criteria) this;
        }

        public Criteria andProducTypeIdNotEqualTo(String value) {
            addCriterion("c_produc_type_id <>", value, "producTypeId");
            return (Criteria) this;
        }

        public Criteria andProducTypeIdGreaterThan(String value) {
            addCriterion("c_produc_type_id >", value, "producTypeId");
            return (Criteria) this;
        }

        public Criteria andProducTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_produc_type_id >=", value, "producTypeId");
            return (Criteria) this;
        }

        public Criteria andProducTypeIdLessThan(String value) {
            addCriterion("c_produc_type_id <", value, "producTypeId");
            return (Criteria) this;
        }

        public Criteria andProducTypeIdLessThanOrEqualTo(String value) {
            addCriterion("c_produc_type_id <=", value, "producTypeId");
            return (Criteria) this;
        }

        public Criteria andProducTypeIdLike(String value) {
            addCriterion("c_produc_type_id like", value, "producTypeId");
            return (Criteria) this;
        }

        public Criteria andProducTypeIdNotLike(String value) {
            addCriterion("c_produc_type_id not like", value, "producTypeId");
            return (Criteria) this;
        }

        public Criteria andProducTypeIdIn(List<String> values) {
            addCriterion("c_produc_type_id in", values, "producTypeId");
            return (Criteria) this;
        }

        public Criteria andProducTypeIdNotIn(List<String> values) {
            addCriterion("c_produc_type_id not in", values, "producTypeId");
            return (Criteria) this;
        }

        public Criteria andProducTypeIdBetween(String value1, String value2) {
            addCriterion("c_produc_type_id between", value1, value2, "producTypeId");
            return (Criteria) this;
        }

        public Criteria andProducTypeIdNotBetween(String value1, String value2) {
            addCriterion("c_produc_type_id not between", value1, value2, "producTypeId");
            return (Criteria) this;
        }

        public Criteria andProducCreatTimeIsNull() {
            addCriterion("c_produc_creat_time is null");
            return (Criteria) this;
        }

        public Criteria andProducCreatTimeIsNotNull() {
            addCriterion("c_produc_creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andProducCreatTimeEqualTo(Date value) {
            addCriterionForJDBCDate("c_produc_creat_time =", value, "producCreatTime");
            return (Criteria) this;
        }

        public Criteria andProducCreatTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("c_produc_creat_time <>", value, "producCreatTime");
            return (Criteria) this;
        }

        public Criteria andProducCreatTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("c_produc_creat_time >", value, "producCreatTime");
            return (Criteria) this;
        }

        public Criteria andProducCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_produc_creat_time >=", value, "producCreatTime");
            return (Criteria) this;
        }

        public Criteria andProducCreatTimeLessThan(Date value) {
            addCriterionForJDBCDate("c_produc_creat_time <", value, "producCreatTime");
            return (Criteria) this;
        }

        public Criteria andProducCreatTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_produc_creat_time <=", value, "producCreatTime");
            return (Criteria) this;
        }

        public Criteria andProducCreatTimeIn(List<Date> values) {
            addCriterionForJDBCDate("c_produc_creat_time in", values, "producCreatTime");
            return (Criteria) this;
        }

        public Criteria andProducCreatTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("c_produc_creat_time not in", values, "producCreatTime");
            return (Criteria) this;
        }

        public Criteria andProducCreatTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_produc_creat_time between", value1, value2, "producCreatTime");
            return (Criteria) this;
        }

        public Criteria andProducCreatTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_produc_creat_time not between", value1, value2, "producCreatTime");
            return (Criteria) this;
        }

        public Criteria andProducCreaterIsNull() {
            addCriterion("c_produc_creater is null");
            return (Criteria) this;
        }

        public Criteria andProducCreaterIsNotNull() {
            addCriterion("c_produc_creater is not null");
            return (Criteria) this;
        }

        public Criteria andProducCreaterEqualTo(String value) {
            addCriterion("c_produc_creater =", value, "producCreater");
            return (Criteria) this;
        }

        public Criteria andProducCreaterNotEqualTo(String value) {
            addCriterion("c_produc_creater <>", value, "producCreater");
            return (Criteria) this;
        }

        public Criteria andProducCreaterGreaterThan(String value) {
            addCriterion("c_produc_creater >", value, "producCreater");
            return (Criteria) this;
        }

        public Criteria andProducCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("c_produc_creater >=", value, "producCreater");
            return (Criteria) this;
        }

        public Criteria andProducCreaterLessThan(String value) {
            addCriterion("c_produc_creater <", value, "producCreater");
            return (Criteria) this;
        }

        public Criteria andProducCreaterLessThanOrEqualTo(String value) {
            addCriterion("c_produc_creater <=", value, "producCreater");
            return (Criteria) this;
        }

        public Criteria andProducCreaterLike(String value) {
            addCriterion("c_produc_creater like", value, "producCreater");
            return (Criteria) this;
        }

        public Criteria andProducCreaterNotLike(String value) {
            addCriterion("c_produc_creater not like", value, "producCreater");
            return (Criteria) this;
        }

        public Criteria andProducCreaterIn(List<String> values) {
            addCriterion("c_produc_creater in", values, "producCreater");
            return (Criteria) this;
        }

        public Criteria andProducCreaterNotIn(List<String> values) {
            addCriterion("c_produc_creater not in", values, "producCreater");
            return (Criteria) this;
        }

        public Criteria andProducCreaterBetween(String value1, String value2) {
            addCriterion("c_produc_creater between", value1, value2, "producCreater");
            return (Criteria) this;
        }

        public Criteria andProducCreaterNotBetween(String value1, String value2) {
            addCriterion("c_produc_creater not between", value1, value2, "producCreater");
            return (Criteria) this;
        }

        public Criteria andProductTopPicListIdIsNull() {
            addCriterion("c_product_top_pic_list_id is null");
            return (Criteria) this;
        }

        public Criteria andProductTopPicListIdIsNotNull() {
            addCriterion("c_product_top_pic_list_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductTopPicListIdEqualTo(String value) {
            addCriterion("c_product_top_pic_list_id =", value, "productTopPicListId");
            return (Criteria) this;
        }

        public Criteria andProductTopPicListIdNotEqualTo(String value) {
            addCriterion("c_product_top_pic_list_id <>", value, "productTopPicListId");
            return (Criteria) this;
        }

        public Criteria andProductTopPicListIdGreaterThan(String value) {
            addCriterion("c_product_top_pic_list_id >", value, "productTopPicListId");
            return (Criteria) this;
        }

        public Criteria andProductTopPicListIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_product_top_pic_list_id >=", value, "productTopPicListId");
            return (Criteria) this;
        }

        public Criteria andProductTopPicListIdLessThan(String value) {
            addCriterion("c_product_top_pic_list_id <", value, "productTopPicListId");
            return (Criteria) this;
        }

        public Criteria andProductTopPicListIdLessThanOrEqualTo(String value) {
            addCriterion("c_product_top_pic_list_id <=", value, "productTopPicListId");
            return (Criteria) this;
        }

        public Criteria andProductTopPicListIdLike(String value) {
            addCriterion("c_product_top_pic_list_id like", value, "productTopPicListId");
            return (Criteria) this;
        }

        public Criteria andProductTopPicListIdNotLike(String value) {
            addCriterion("c_product_top_pic_list_id not like", value, "productTopPicListId");
            return (Criteria) this;
        }

        public Criteria andProductTopPicListIdIn(List<String> values) {
            addCriterion("c_product_top_pic_list_id in", values, "productTopPicListId");
            return (Criteria) this;
        }

        public Criteria andProductTopPicListIdNotIn(List<String> values) {
            addCriterion("c_product_top_pic_list_id not in", values, "productTopPicListId");
            return (Criteria) this;
        }

        public Criteria andProductTopPicListIdBetween(String value1, String value2) {
            addCriterion("c_product_top_pic_list_id between", value1, value2, "productTopPicListId");
            return (Criteria) this;
        }

        public Criteria andProductTopPicListIdNotBetween(String value1, String value2) {
            addCriterion("c_product_top_pic_list_id not between", value1, value2, "productTopPicListId");
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

        public Criteria andProductDetailsPageIsNull() {
            addCriterion("c_product_details_page is null");
            return (Criteria) this;
        }

        public Criteria andProductDetailsPageIsNotNull() {
            addCriterion("c_product_details_page is not null");
            return (Criteria) this;
        }

        public Criteria andProductDetailsPageEqualTo(String value) {
            addCriterion("c_product_details_page =", value, "productDetailsPage");
            return (Criteria) this;
        }

        public Criteria andProductDetailsPageNotEqualTo(String value) {
            addCriterion("c_product_details_page <>", value, "productDetailsPage");
            return (Criteria) this;
        }

        public Criteria andProductDetailsPageGreaterThan(String value) {
            addCriterion("c_product_details_page >", value, "productDetailsPage");
            return (Criteria) this;
        }

        public Criteria andProductDetailsPageGreaterThanOrEqualTo(String value) {
            addCriterion("c_product_details_page >=", value, "productDetailsPage");
            return (Criteria) this;
        }

        public Criteria andProductDetailsPageLessThan(String value) {
            addCriterion("c_product_details_page <", value, "productDetailsPage");
            return (Criteria) this;
        }

        public Criteria andProductDetailsPageLessThanOrEqualTo(String value) {
            addCriterion("c_product_details_page <=", value, "productDetailsPage");
            return (Criteria) this;
        }

        public Criteria andProductDetailsPageLike(String value) {
            addCriterion("c_product_details_page like", value, "productDetailsPage");
            return (Criteria) this;
        }

        public Criteria andProductDetailsPageNotLike(String value) {
            addCriterion("c_product_details_page not like", value, "productDetailsPage");
            return (Criteria) this;
        }

        public Criteria andProductDetailsPageIn(List<String> values) {
            addCriterion("c_product_details_page in", values, "productDetailsPage");
            return (Criteria) this;
        }

        public Criteria andProductDetailsPageNotIn(List<String> values) {
            addCriterion("c_product_details_page not in", values, "productDetailsPage");
            return (Criteria) this;
        }

        public Criteria andProductDetailsPageBetween(String value1, String value2) {
            addCriterion("c_product_details_page between", value1, value2, "productDetailsPage");
            return (Criteria) this;
        }

        public Criteria andProductDetailsPageNotBetween(String value1, String value2) {
            addCriterion("c_product_details_page not between", value1, value2, "productDetailsPage");
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

        public Criteria andProductSalePriceIsNull() {
            addCriterion("c_product_sale_price is null");
            return (Criteria) this;
        }

        public Criteria andProductSalePriceIsNotNull() {
            addCriterion("c_product_sale_price is not null");
            return (Criteria) this;
        }

        public Criteria andProductSalePriceEqualTo(String value) {
            addCriterion("c_product_sale_price =", value, "productSalePrice");
            return (Criteria) this;
        }

        public Criteria andProductSalePriceNotEqualTo(String value) {
            addCriterion("c_product_sale_price <>", value, "productSalePrice");
            return (Criteria) this;
        }

        public Criteria andProductSalePriceGreaterThan(String value) {
            addCriterion("c_product_sale_price >", value, "productSalePrice");
            return (Criteria) this;
        }

        public Criteria andProductSalePriceGreaterThanOrEqualTo(String value) {
            addCriterion("c_product_sale_price >=", value, "productSalePrice");
            return (Criteria) this;
        }

        public Criteria andProductSalePriceLessThan(String value) {
            addCriterion("c_product_sale_price <", value, "productSalePrice");
            return (Criteria) this;
        }

        public Criteria andProductSalePriceLessThanOrEqualTo(String value) {
            addCriterion("c_product_sale_price <=", value, "productSalePrice");
            return (Criteria) this;
        }

        public Criteria andProductSalePriceLike(String value) {
            addCriterion("c_product_sale_price like", value, "productSalePrice");
            return (Criteria) this;
        }

        public Criteria andProductSalePriceNotLike(String value) {
            addCriterion("c_product_sale_price not like", value, "productSalePrice");
            return (Criteria) this;
        }

        public Criteria andProductSalePriceIn(List<String> values) {
            addCriterion("c_product_sale_price in", values, "productSalePrice");
            return (Criteria) this;
        }

        public Criteria andProductSalePriceNotIn(List<String> values) {
            addCriterion("c_product_sale_price not in", values, "productSalePrice");
            return (Criteria) this;
        }

        public Criteria andProductSalePriceBetween(String value1, String value2) {
            addCriterion("c_product_sale_price between", value1, value2, "productSalePrice");
            return (Criteria) this;
        }

        public Criteria andProductSalePriceNotBetween(String value1, String value2) {
            addCriterion("c_product_sale_price not between", value1, value2, "productSalePrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNull() {
            addCriterion("c_product_price is null");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNotNull() {
            addCriterion("c_product_price is not null");
            return (Criteria) this;
        }

        public Criteria andProductPriceEqualTo(String value) {
            addCriterion("c_product_price =", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotEqualTo(String value) {
            addCriterion("c_product_price <>", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThan(String value) {
            addCriterion("c_product_price >", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThanOrEqualTo(String value) {
            addCriterion("c_product_price >=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThan(String value) {
            addCriterion("c_product_price <", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThanOrEqualTo(String value) {
            addCriterion("c_product_price <=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLike(String value) {
            addCriterion("c_product_price like", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotLike(String value) {
            addCriterion("c_product_price not like", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceIn(List<String> values) {
            addCriterion("c_product_price in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotIn(List<String> values) {
            addCriterion("c_product_price not in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceBetween(String value1, String value2) {
            addCriterion("c_product_price between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotBetween(String value1, String value2) {
            addCriterion("c_product_price not between", value1, value2, "productPrice");
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
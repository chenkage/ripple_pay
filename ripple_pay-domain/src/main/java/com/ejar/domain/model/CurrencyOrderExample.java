package com.ejar.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CurrencyOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CurrencyOrderExample() {
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

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
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

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Byte value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Byte value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Byte value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Byte value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Byte value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Byte> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Byte> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Byte value1, Byte value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNull() {
            addCriterion("buyer_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNotNull() {
            addCriterion("buyer_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdEqualTo(Long value) {
            addCriterion("buyer_id =", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualTo(Long value) {
            addCriterion("buyer_id <>", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThan(Long value) {
            addCriterion("buyer_id >", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("buyer_id >=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThan(Long value) {
            addCriterion("buyer_id <", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualTo(Long value) {
            addCriterion("buyer_id <=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIn(List<Long> values) {
            addCriterion("buyer_id in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotIn(List<Long> values) {
            addCriterion("buyer_id not in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdBetween(Long value1, Long value2) {
            addCriterion("buyer_id between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotBetween(Long value1, Long value2) {
            addCriterion("buyer_id not between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(Long value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(Long value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(Long value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(Long value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(Long value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<Long> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<Long> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(Long value1, Long value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(Long value1, Long value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(Long value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(Long value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(Long value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(Long value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(Long value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<Long> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<Long> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(Long value1, Long value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(Long value1, Long value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andCurrencyNumberIsNull() {
            addCriterion("currency_number is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyNumberIsNotNull() {
            addCriterion("currency_number is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyNumberEqualTo(Long value) {
            addCriterion("currency_number =", value, "currencyNumber");
            return (Criteria) this;
        }

        public Criteria andCurrencyNumberNotEqualTo(Long value) {
            addCriterion("currency_number <>", value, "currencyNumber");
            return (Criteria) this;
        }

        public Criteria andCurrencyNumberGreaterThan(Long value) {
            addCriterion("currency_number >", value, "currencyNumber");
            return (Criteria) this;
        }

        public Criteria andCurrencyNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("currency_number >=", value, "currencyNumber");
            return (Criteria) this;
        }

        public Criteria andCurrencyNumberLessThan(Long value) {
            addCriterion("currency_number <", value, "currencyNumber");
            return (Criteria) this;
        }

        public Criteria andCurrencyNumberLessThanOrEqualTo(Long value) {
            addCriterion("currency_number <=", value, "currencyNumber");
            return (Criteria) this;
        }

        public Criteria andCurrencyNumberIn(List<Long> values) {
            addCriterion("currency_number in", values, "currencyNumber");
            return (Criteria) this;
        }

        public Criteria andCurrencyNumberNotIn(List<Long> values) {
            addCriterion("currency_number not in", values, "currencyNumber");
            return (Criteria) this;
        }

        public Criteria andCurrencyNumberBetween(Long value1, Long value2) {
            addCriterion("currency_number between", value1, value2, "currencyNumber");
            return (Criteria) this;
        }

        public Criteria andCurrencyNumberNotBetween(Long value1, Long value2) {
            addCriterion("currency_number not between", value1, value2, "currencyNumber");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(Long value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(Long value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(Long value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(Long value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(Long value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<Long> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<Long> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(Long value1, Long value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(Long value1, Long value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andPresentCurrencyNumberIsNull() {
            addCriterion("present_currency_number is null");
            return (Criteria) this;
        }

        public Criteria andPresentCurrencyNumberIsNotNull() {
            addCriterion("present_currency_number is not null");
            return (Criteria) this;
        }

        public Criteria andPresentCurrencyNumberEqualTo(Long value) {
            addCriterion("present_currency_number =", value, "presentCurrencyNumber");
            return (Criteria) this;
        }

        public Criteria andPresentCurrencyNumberNotEqualTo(Long value) {
            addCriterion("present_currency_number <>", value, "presentCurrencyNumber");
            return (Criteria) this;
        }

        public Criteria andPresentCurrencyNumberGreaterThan(Long value) {
            addCriterion("present_currency_number >", value, "presentCurrencyNumber");
            return (Criteria) this;
        }

        public Criteria andPresentCurrencyNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("present_currency_number >=", value, "presentCurrencyNumber");
            return (Criteria) this;
        }

        public Criteria andPresentCurrencyNumberLessThan(Long value) {
            addCriterion("present_currency_number <", value, "presentCurrencyNumber");
            return (Criteria) this;
        }

        public Criteria andPresentCurrencyNumberLessThanOrEqualTo(Long value) {
            addCriterion("present_currency_number <=", value, "presentCurrencyNumber");
            return (Criteria) this;
        }

        public Criteria andPresentCurrencyNumberIn(List<Long> values) {
            addCriterion("present_currency_number in", values, "presentCurrencyNumber");
            return (Criteria) this;
        }

        public Criteria andPresentCurrencyNumberNotIn(List<Long> values) {
            addCriterion("present_currency_number not in", values, "presentCurrencyNumber");
            return (Criteria) this;
        }

        public Criteria andPresentCurrencyNumberBetween(Long value1, Long value2) {
            addCriterion("present_currency_number between", value1, value2, "presentCurrencyNumber");
            return (Criteria) this;
        }

        public Criteria andPresentCurrencyNumberNotBetween(Long value1, Long value2) {
            addCriterion("present_currency_number not between", value1, value2, "presentCurrencyNumber");
            return (Criteria) this;
        }

        public Criteria andPresentTotalPriceIsNull() {
            addCriterion("present_total_price is null");
            return (Criteria) this;
        }

        public Criteria andPresentTotalPriceIsNotNull() {
            addCriterion("present_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andPresentTotalPriceEqualTo(Long value) {
            addCriterion("present_total_price =", value, "presentTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPresentTotalPriceNotEqualTo(Long value) {
            addCriterion("present_total_price <>", value, "presentTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPresentTotalPriceGreaterThan(Long value) {
            addCriterion("present_total_price >", value, "presentTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPresentTotalPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("present_total_price >=", value, "presentTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPresentTotalPriceLessThan(Long value) {
            addCriterion("present_total_price <", value, "presentTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPresentTotalPriceLessThanOrEqualTo(Long value) {
            addCriterion("present_total_price <=", value, "presentTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPresentTotalPriceIn(List<Long> values) {
            addCriterion("present_total_price in", values, "presentTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPresentTotalPriceNotIn(List<Long> values) {
            addCriterion("present_total_price not in", values, "presentTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPresentTotalPriceBetween(Long value1, Long value2) {
            addCriterion("present_total_price between", value1, value2, "presentTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPresentTotalPriceNotBetween(Long value1, Long value2) {
            addCriterion("present_total_price not between", value1, value2, "presentTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPOrderIdIsNull() {
            addCriterion("p_order_id is null");
            return (Criteria) this;
        }

        public Criteria andPOrderIdIsNotNull() {
            addCriterion("p_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andPOrderIdEqualTo(Long value) {
            addCriterion("p_order_id =", value, "pOrderId");
            return (Criteria) this;
        }

        public Criteria andPOrderIdNotEqualTo(Long value) {
            addCriterion("p_order_id <>", value, "pOrderId");
            return (Criteria) this;
        }

        public Criteria andPOrderIdGreaterThan(Long value) {
            addCriterion("p_order_id >", value, "pOrderId");
            return (Criteria) this;
        }

        public Criteria andPOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("p_order_id >=", value, "pOrderId");
            return (Criteria) this;
        }

        public Criteria andPOrderIdLessThan(Long value) {
            addCriterion("p_order_id <", value, "pOrderId");
            return (Criteria) this;
        }

        public Criteria andPOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("p_order_id <=", value, "pOrderId");
            return (Criteria) this;
        }

        public Criteria andPOrderIdIn(List<Long> values) {
            addCriterion("p_order_id in", values, "pOrderId");
            return (Criteria) this;
        }

        public Criteria andPOrderIdNotIn(List<Long> values) {
            addCriterion("p_order_id not in", values, "pOrderId");
            return (Criteria) this;
        }

        public Criteria andPOrderIdBetween(Long value1, Long value2) {
            addCriterion("p_order_id between", value1, value2, "pOrderId");
            return (Criteria) this;
        }

        public Criteria andPOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("p_order_id not between", value1, value2, "pOrderId");
            return (Criteria) this;
        }

        public Criteria andMainTradeStatusIsNull() {
            addCriterion("main_trade_status is null");
            return (Criteria) this;
        }

        public Criteria andMainTradeStatusIsNotNull() {
            addCriterion("main_trade_status is not null");
            return (Criteria) this;
        }

        public Criteria andMainTradeStatusEqualTo(Integer value) {
            addCriterion("main_trade_status =", value, "mainTradeStatus");
            return (Criteria) this;
        }

        public Criteria andMainTradeStatusNotEqualTo(Integer value) {
            addCriterion("main_trade_status <>", value, "mainTradeStatus");
            return (Criteria) this;
        }

        public Criteria andMainTradeStatusGreaterThan(Integer value) {
            addCriterion("main_trade_status >", value, "mainTradeStatus");
            return (Criteria) this;
        }

        public Criteria andMainTradeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("main_trade_status >=", value, "mainTradeStatus");
            return (Criteria) this;
        }

        public Criteria andMainTradeStatusLessThan(Integer value) {
            addCriterion("main_trade_status <", value, "mainTradeStatus");
            return (Criteria) this;
        }

        public Criteria andMainTradeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("main_trade_status <=", value, "mainTradeStatus");
            return (Criteria) this;
        }

        public Criteria andMainTradeStatusIn(List<Integer> values) {
            addCriterion("main_trade_status in", values, "mainTradeStatus");
            return (Criteria) this;
        }

        public Criteria andMainTradeStatusNotIn(List<Integer> values) {
            addCriterion("main_trade_status not in", values, "mainTradeStatus");
            return (Criteria) this;
        }

        public Criteria andMainTradeStatusBetween(Integer value1, Integer value2) {
            addCriterion("main_trade_status between", value1, value2, "mainTradeStatus");
            return (Criteria) this;
        }

        public Criteria andMainTradeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("main_trade_status not between", value1, value2, "mainTradeStatus");
            return (Criteria) this;
        }

        public Criteria andChildTradeStatusIsNull() {
            addCriterion("child_trade_status is null");
            return (Criteria) this;
        }

        public Criteria andChildTradeStatusIsNotNull() {
            addCriterion("child_trade_status is not null");
            return (Criteria) this;
        }

        public Criteria andChildTradeStatusEqualTo(Integer value) {
            addCriterion("child_trade_status =", value, "childTradeStatus");
            return (Criteria) this;
        }

        public Criteria andChildTradeStatusNotEqualTo(Integer value) {
            addCriterion("child_trade_status <>", value, "childTradeStatus");
            return (Criteria) this;
        }

        public Criteria andChildTradeStatusGreaterThan(Integer value) {
            addCriterion("child_trade_status >", value, "childTradeStatus");
            return (Criteria) this;
        }

        public Criteria andChildTradeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("child_trade_status >=", value, "childTradeStatus");
            return (Criteria) this;
        }

        public Criteria andChildTradeStatusLessThan(Integer value) {
            addCriterion("child_trade_status <", value, "childTradeStatus");
            return (Criteria) this;
        }

        public Criteria andChildTradeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("child_trade_status <=", value, "childTradeStatus");
            return (Criteria) this;
        }

        public Criteria andChildTradeStatusIn(List<Integer> values) {
            addCriterion("child_trade_status in", values, "childTradeStatus");
            return (Criteria) this;
        }

        public Criteria andChildTradeStatusNotIn(List<Integer> values) {
            addCriterion("child_trade_status not in", values, "childTradeStatus");
            return (Criteria) this;
        }

        public Criteria andChildTradeStatusBetween(Integer value1, Integer value2) {
            addCriterion("child_trade_status between", value1, value2, "childTradeStatus");
            return (Criteria) this;
        }

        public Criteria andChildTradeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("child_trade_status not between", value1, value2, "childTradeStatus");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Integer value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Integer value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Integer value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Integer value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Integer> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Integer> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Integer value1, Integer value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andTradeRateIsNull() {
            addCriterion("trade_rate is null");
            return (Criteria) this;
        }

        public Criteria andTradeRateIsNotNull() {
            addCriterion("trade_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTradeRateEqualTo(String value) {
            addCriterion("trade_rate =", value, "tradeRate");
            return (Criteria) this;
        }

        public Criteria andTradeRateNotEqualTo(String value) {
            addCriterion("trade_rate <>", value, "tradeRate");
            return (Criteria) this;
        }

        public Criteria andTradeRateGreaterThan(String value) {
            addCriterion("trade_rate >", value, "tradeRate");
            return (Criteria) this;
        }

        public Criteria andTradeRateGreaterThanOrEqualTo(String value) {
            addCriterion("trade_rate >=", value, "tradeRate");
            return (Criteria) this;
        }

        public Criteria andTradeRateLessThan(String value) {
            addCriterion("trade_rate <", value, "tradeRate");
            return (Criteria) this;
        }

        public Criteria andTradeRateLessThanOrEqualTo(String value) {
            addCriterion("trade_rate <=", value, "tradeRate");
            return (Criteria) this;
        }

        public Criteria andTradeRateLike(String value) {
            addCriterion("trade_rate like", value, "tradeRate");
            return (Criteria) this;
        }

        public Criteria andTradeRateNotLike(String value) {
            addCriterion("trade_rate not like", value, "tradeRate");
            return (Criteria) this;
        }

        public Criteria andTradeRateIn(List<String> values) {
            addCriterion("trade_rate in", values, "tradeRate");
            return (Criteria) this;
        }

        public Criteria andTradeRateNotIn(List<String> values) {
            addCriterion("trade_rate not in", values, "tradeRate");
            return (Criteria) this;
        }

        public Criteria andTradeRateBetween(String value1, String value2) {
            addCriterion("trade_rate between", value1, value2, "tradeRate");
            return (Criteria) this;
        }

        public Criteria andTradeRateNotBetween(String value1, String value2) {
            addCriterion("trade_rate not between", value1, value2, "tradeRate");
            return (Criteria) this;
        }

        public Criteria andTradeNumberIsNull() {
            addCriterion("trade_number is null");
            return (Criteria) this;
        }

        public Criteria andTradeNumberIsNotNull() {
            addCriterion("trade_number is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNumberEqualTo(Long value) {
            addCriterion("trade_number =", value, "tradeNumber");
            return (Criteria) this;
        }

        public Criteria andTradeNumberNotEqualTo(Long value) {
            addCriterion("trade_number <>", value, "tradeNumber");
            return (Criteria) this;
        }

        public Criteria andTradeNumberGreaterThan(Long value) {
            addCriterion("trade_number >", value, "tradeNumber");
            return (Criteria) this;
        }

        public Criteria andTradeNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("trade_number >=", value, "tradeNumber");
            return (Criteria) this;
        }

        public Criteria andTradeNumberLessThan(Long value) {
            addCriterion("trade_number <", value, "tradeNumber");
            return (Criteria) this;
        }

        public Criteria andTradeNumberLessThanOrEqualTo(Long value) {
            addCriterion("trade_number <=", value, "tradeNumber");
            return (Criteria) this;
        }

        public Criteria andTradeNumberIn(List<Long> values) {
            addCriterion("trade_number in", values, "tradeNumber");
            return (Criteria) this;
        }

        public Criteria andTradeNumberNotIn(List<Long> values) {
            addCriterion("trade_number not in", values, "tradeNumber");
            return (Criteria) this;
        }

        public Criteria andTradeNumberBetween(Long value1, Long value2) {
            addCriterion("trade_number between", value1, value2, "tradeNumber");
            return (Criteria) this;
        }

        public Criteria andTradeNumberNotBetween(Long value1, Long value2) {
            addCriterion("trade_number not between", value1, value2, "tradeNumber");
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
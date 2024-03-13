package com.jyq.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BdcQlrlbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BdcQlrlbExample() {
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

        public Criteria andSlidIsNull() {
            addCriterion("SLID is null");
            return (Criteria) this;
        }

        public Criteria andSlidIsNotNull() {
            addCriterion("SLID is not null");
            return (Criteria) this;
        }

        public Criteria andSlidEqualTo(String value) {
            addCriterion("SLID =", value, "slid");
            return (Criteria) this;
        }

        public Criteria andSlidNotEqualTo(String value) {
            addCriterion("SLID <>", value, "slid");
            return (Criteria) this;
        }

        public Criteria andSlidGreaterThan(String value) {
            addCriterion("SLID >", value, "slid");
            return (Criteria) this;
        }

        public Criteria andSlidGreaterThanOrEqualTo(String value) {
            addCriterion("SLID >=", value, "slid");
            return (Criteria) this;
        }

        public Criteria andSlidLessThan(String value) {
            addCriterion("SLID <", value, "slid");
            return (Criteria) this;
        }

        public Criteria andSlidLessThanOrEqualTo(String value) {
            addCriterion("SLID <=", value, "slid");
            return (Criteria) this;
        }

        public Criteria andSlidLike(String value) {
            addCriterion("SLID like", value, "slid");
            return (Criteria) this;
        }

        public Criteria andSlidNotLike(String value) {
            addCriterion("SLID not like", value, "slid");
            return (Criteria) this;
        }

        public Criteria andSlidIn(List<String> values) {
            addCriterion("SLID in", values, "slid");
            return (Criteria) this;
        }

        public Criteria andSlidNotIn(List<String> values) {
            addCriterion("SLID not in", values, "slid");
            return (Criteria) this;
        }

        public Criteria andSlidBetween(String value1, String value2) {
            addCriterion("SLID between", value1, value2, "slid");
            return (Criteria) this;
        }

        public Criteria andSlidNotBetween(String value1, String value2) {
            addCriterion("SLID not between", value1, value2, "slid");
            return (Criteria) this;
        }

        public Criteria andSxhIsNull() {
            addCriterion("SXH is null");
            return (Criteria) this;
        }

        public Criteria andSxhIsNotNull() {
            addCriterion("SXH is not null");
            return (Criteria) this;
        }

        public Criteria andSxhEqualTo(BigDecimal value) {
            addCriterion("SXH =", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhNotEqualTo(BigDecimal value) {
            addCriterion("SXH <>", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhGreaterThan(BigDecimal value) {
            addCriterion("SXH >", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SXH >=", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhLessThan(BigDecimal value) {
            addCriterion("SXH <", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SXH <=", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhIn(List<BigDecimal> values) {
            addCriterion("SXH in", values, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhNotIn(List<BigDecimal> values) {
            addCriterion("SXH not in", values, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SXH between", value1, value2, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SXH not between", value1, value2, "sxh");
            return (Criteria) this;
        }

        public Criteria andLysqbIsNull() {
            addCriterion("LYSQB is null");
            return (Criteria) this;
        }

        public Criteria andLysqbIsNotNull() {
            addCriterion("LYSQB is not null");
            return (Criteria) this;
        }

        public Criteria andLysqbEqualTo(BigDecimal value) {
            addCriterion("LYSQB =", value, "lysqb");
            return (Criteria) this;
        }

        public Criteria andLysqbNotEqualTo(BigDecimal value) {
            addCriterion("LYSQB <>", value, "lysqb");
            return (Criteria) this;
        }

        public Criteria andLysqbGreaterThan(BigDecimal value) {
            addCriterion("LYSQB >", value, "lysqb");
            return (Criteria) this;
        }

        public Criteria andLysqbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LYSQB >=", value, "lysqb");
            return (Criteria) this;
        }

        public Criteria andLysqbLessThan(BigDecimal value) {
            addCriterion("LYSQB <", value, "lysqb");
            return (Criteria) this;
        }

        public Criteria andLysqbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LYSQB <=", value, "lysqb");
            return (Criteria) this;
        }

        public Criteria andLysqbIn(List<BigDecimal> values) {
            addCriterion("LYSQB in", values, "lysqb");
            return (Criteria) this;
        }

        public Criteria andLysqbNotIn(List<BigDecimal> values) {
            addCriterion("LYSQB not in", values, "lysqb");
            return (Criteria) this;
        }

        public Criteria andLysqbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LYSQB between", value1, value2, "lysqb");
            return (Criteria) this;
        }

        public Criteria andLysqbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LYSQB not between", value1, value2, "lysqb");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("BZ is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("BZ is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(BigDecimal value) {
            addCriterion("BZ =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(BigDecimal value) {
            addCriterion("BZ <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(BigDecimal value) {
            addCriterion("BZ >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BZ >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(BigDecimal value) {
            addCriterion("BZ <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BZ <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<BigDecimal> values) {
            addCriterion("BZ in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<BigDecimal> values) {
            addCriterion("BZ not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BZ between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BZ not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andQlridIsNull() {
            addCriterion("QLRID is null");
            return (Criteria) this;
        }

        public Criteria andQlridIsNotNull() {
            addCriterion("QLRID is not null");
            return (Criteria) this;
        }

        public Criteria andQlridEqualTo(String value) {
            addCriterion("QLRID =", value, "qlrid");
            return (Criteria) this;
        }

        public Criteria andQlridNotEqualTo(String value) {
            addCriterion("QLRID <>", value, "qlrid");
            return (Criteria) this;
        }

        public Criteria andQlridGreaterThan(String value) {
            addCriterion("QLRID >", value, "qlrid");
            return (Criteria) this;
        }

        public Criteria andQlridGreaterThanOrEqualTo(String value) {
            addCriterion("QLRID >=", value, "qlrid");
            return (Criteria) this;
        }

        public Criteria andQlridLessThan(String value) {
            addCriterion("QLRID <", value, "qlrid");
            return (Criteria) this;
        }

        public Criteria andQlridLessThanOrEqualTo(String value) {
            addCriterion("QLRID <=", value, "qlrid");
            return (Criteria) this;
        }

        public Criteria andQlridLike(String value) {
            addCriterion("QLRID like", value, "qlrid");
            return (Criteria) this;
        }

        public Criteria andQlridNotLike(String value) {
            addCriterion("QLRID not like", value, "qlrid");
            return (Criteria) this;
        }

        public Criteria andQlridIn(List<String> values) {
            addCriterion("QLRID in", values, "qlrid");
            return (Criteria) this;
        }

        public Criteria andQlridNotIn(List<String> values) {
            addCriterion("QLRID not in", values, "qlrid");
            return (Criteria) this;
        }

        public Criteria andQlridBetween(String value1, String value2) {
            addCriterion("QLRID between", value1, value2, "qlrid");
            return (Criteria) this;
        }

        public Criteria andQlridNotBetween(String value1, String value2) {
            addCriterion("QLRID not between", value1, value2, "qlrid");
            return (Criteria) this;
        }

        public Criteria andCeridIsNull() {
            addCriterion("CERID is null");
            return (Criteria) this;
        }

        public Criteria andCeridIsNotNull() {
            addCriterion("CERID is not null");
            return (Criteria) this;
        }

        public Criteria andCeridEqualTo(String value) {
            addCriterion("CERID =", value, "cerid");
            return (Criteria) this;
        }

        public Criteria andCeridNotEqualTo(String value) {
            addCriterion("CERID <>", value, "cerid");
            return (Criteria) this;
        }

        public Criteria andCeridGreaterThan(String value) {
            addCriterion("CERID >", value, "cerid");
            return (Criteria) this;
        }

        public Criteria andCeridGreaterThanOrEqualTo(String value) {
            addCriterion("CERID >=", value, "cerid");
            return (Criteria) this;
        }

        public Criteria andCeridLessThan(String value) {
            addCriterion("CERID <", value, "cerid");
            return (Criteria) this;
        }

        public Criteria andCeridLessThanOrEqualTo(String value) {
            addCriterion("CERID <=", value, "cerid");
            return (Criteria) this;
        }

        public Criteria andCeridLike(String value) {
            addCriterion("CERID like", value, "cerid");
            return (Criteria) this;
        }

        public Criteria andCeridNotLike(String value) {
            addCriterion("CERID not like", value, "cerid");
            return (Criteria) this;
        }

        public Criteria andCeridIn(List<String> values) {
            addCriterion("CERID in", values, "cerid");
            return (Criteria) this;
        }

        public Criteria andCeridNotIn(List<String> values) {
            addCriterion("CERID not in", values, "cerid");
            return (Criteria) this;
        }

        public Criteria andCeridBetween(String value1, String value2) {
            addCriterion("CERID between", value1, value2, "cerid");
            return (Criteria) this;
        }

        public Criteria andCeridNotBetween(String value1, String value2) {
            addCriterion("CERID not between", value1, value2, "cerid");
            return (Criteria) this;
        }

        public Criteria andBdcqzhIsNull() {
            addCriterion("BDCQZH is null");
            return (Criteria) this;
        }

        public Criteria andBdcqzhIsNotNull() {
            addCriterion("BDCQZH is not null");
            return (Criteria) this;
        }

        public Criteria andBdcqzhEqualTo(Object value) {
            addCriterion("BDCQZH =", value, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andBdcqzhNotEqualTo(Object value) {
            addCriterion("BDCQZH <>", value, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andBdcqzhGreaterThan(Object value) {
            addCriterion("BDCQZH >", value, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andBdcqzhGreaterThanOrEqualTo(Object value) {
            addCriterion("BDCQZH >=", value, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andBdcqzhLessThan(Object value) {
            addCriterion("BDCQZH <", value, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andBdcqzhLessThanOrEqualTo(Object value) {
            addCriterion("BDCQZH <=", value, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andBdcqzhIn(List<Object> values) {
            addCriterion("BDCQZH in", values, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andBdcqzhNotIn(List<Object> values) {
            addCriterion("BDCQZH not in", values, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andBdcqzhBetween(Object value1, Object value2) {
            addCriterion("BDCQZH between", value1, value2, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andBdcqzhNotBetween(Object value1, Object value2) {
            addCriterion("BDCQZH not between", value1, value2, "bdcqzh");
            return (Criteria) this;
        }

        public Criteria andDyidIsNull() {
            addCriterion("DYID is null");
            return (Criteria) this;
        }

        public Criteria andDyidIsNotNull() {
            addCriterion("DYID is not null");
            return (Criteria) this;
        }

        public Criteria andDyidEqualTo(Object value) {
            addCriterion("DYID =", value, "dyid");
            return (Criteria) this;
        }

        public Criteria andDyidNotEqualTo(Object value) {
            addCriterion("DYID <>", value, "dyid");
            return (Criteria) this;
        }

        public Criteria andDyidGreaterThan(Object value) {
            addCriterion("DYID >", value, "dyid");
            return (Criteria) this;
        }

        public Criteria andDyidGreaterThanOrEqualTo(Object value) {
            addCriterion("DYID >=", value, "dyid");
            return (Criteria) this;
        }

        public Criteria andDyidLessThan(Object value) {
            addCriterion("DYID <", value, "dyid");
            return (Criteria) this;
        }

        public Criteria andDyidLessThanOrEqualTo(Object value) {
            addCriterion("DYID <=", value, "dyid");
            return (Criteria) this;
        }

        public Criteria andDyidIn(List<Object> values) {
            addCriterion("DYID in", values, "dyid");
            return (Criteria) this;
        }

        public Criteria andDyidNotIn(List<Object> values) {
            addCriterion("DYID not in", values, "dyid");
            return (Criteria) this;
        }

        public Criteria andDyidBetween(Object value1, Object value2) {
            addCriterion("DYID between", value1, value2, "dyid");
            return (Criteria) this;
        }

        public Criteria andDyidNotBetween(Object value1, Object value2) {
            addCriterion("DYID not between", value1, value2, "dyid");
            return (Criteria) this;
        }

        public Criteria andBdcdyhIsNull() {
            addCriterion("BDCDYH is null");
            return (Criteria) this;
        }

        public Criteria andBdcdyhIsNotNull() {
            addCriterion("BDCDYH is not null");
            return (Criteria) this;
        }

        public Criteria andBdcdyhEqualTo(Object value) {
            addCriterion("BDCDYH =", value, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andBdcdyhNotEqualTo(Object value) {
            addCriterion("BDCDYH <>", value, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andBdcdyhGreaterThan(Object value) {
            addCriterion("BDCDYH >", value, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andBdcdyhGreaterThanOrEqualTo(Object value) {
            addCriterion("BDCDYH >=", value, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andBdcdyhLessThan(Object value) {
            addCriterion("BDCDYH <", value, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andBdcdyhLessThanOrEqualTo(Object value) {
            addCriterion("BDCDYH <=", value, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andBdcdyhIn(List<Object> values) {
            addCriterion("BDCDYH in", values, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andBdcdyhNotIn(List<Object> values) {
            addCriterion("BDCDYH not in", values, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andBdcdyhBetween(Object value1, Object value2) {
            addCriterion("BDCDYH between", value1, value2, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andBdcdyhNotBetween(Object value1, Object value2) {
            addCriterion("BDCDYH not between", value1, value2, "bdcdyh");
            return (Criteria) this;
        }

        public Criteria andZjzlIsNull() {
            addCriterion("ZJZL is null");
            return (Criteria) this;
        }

        public Criteria andZjzlIsNotNull() {
            addCriterion("ZJZL is not null");
            return (Criteria) this;
        }

        public Criteria andZjzlEqualTo(BigDecimal value) {
            addCriterion("ZJZL =", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlNotEqualTo(BigDecimal value) {
            addCriterion("ZJZL <>", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlGreaterThan(BigDecimal value) {
            addCriterion("ZJZL >", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZJZL >=", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlLessThan(BigDecimal value) {
            addCriterion("ZJZL <", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZJZL <=", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlIn(List<BigDecimal> values) {
            addCriterion("ZJZL in", values, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlNotIn(List<BigDecimal> values) {
            addCriterion("ZJZL not in", values, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZJZL between", value1, value2, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZJZL not between", value1, value2, "zjzl");
            return (Criteria) this;
        }

        public Criteria andXhIsNull() {
            addCriterion("XH is null");
            return (Criteria) this;
        }

        public Criteria andXhIsNotNull() {
            addCriterion("XH is not null");
            return (Criteria) this;
        }

        public Criteria andXhEqualTo(BigDecimal value) {
            addCriterion("XH =", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotEqualTo(BigDecimal value) {
            addCriterion("XH <>", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThan(BigDecimal value) {
            addCriterion("XH >", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XH >=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThan(BigDecimal value) {
            addCriterion("XH <", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XH <=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhIn(List<BigDecimal> values) {
            addCriterion("XH in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotIn(List<BigDecimal> values) {
            addCriterion("XH not in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XH between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XH not between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andQxdmIsNull() {
            addCriterion("QXDM is null");
            return (Criteria) this;
        }

        public Criteria andQxdmIsNotNull() {
            addCriterion("QXDM is not null");
            return (Criteria) this;
        }

        public Criteria andQxdmEqualTo(Object value) {
            addCriterion("QXDM =", value, "qxdm");
            return (Criteria) this;
        }

        public Criteria andQxdmNotEqualTo(Object value) {
            addCriterion("QXDM <>", value, "qxdm");
            return (Criteria) this;
        }

        public Criteria andQxdmGreaterThan(Object value) {
            addCriterion("QXDM >", value, "qxdm");
            return (Criteria) this;
        }

        public Criteria andQxdmGreaterThanOrEqualTo(Object value) {
            addCriterion("QXDM >=", value, "qxdm");
            return (Criteria) this;
        }

        public Criteria andQxdmLessThan(Object value) {
            addCriterion("QXDM <", value, "qxdm");
            return (Criteria) this;
        }

        public Criteria andQxdmLessThanOrEqualTo(Object value) {
            addCriterion("QXDM <=", value, "qxdm");
            return (Criteria) this;
        }

        public Criteria andQxdmIn(List<Object> values) {
            addCriterion("QXDM in", values, "qxdm");
            return (Criteria) this;
        }

        public Criteria andQxdmNotIn(List<Object> values) {
            addCriterion("QXDM not in", values, "qxdm");
            return (Criteria) this;
        }

        public Criteria andQxdmBetween(Object value1, Object value2) {
            addCriterion("QXDM between", value1, value2, "qxdm");
            return (Criteria) this;
        }

        public Criteria andQxdmNotBetween(Object value1, Object value2) {
            addCriterion("QXDM not between", value1, value2, "qxdm");
            return (Criteria) this;
        }

        public Criteria andSjhqbsIsNull() {
            addCriterion("SJHQBS is null");
            return (Criteria) this;
        }

        public Criteria andSjhqbsIsNotNull() {
            addCriterion("SJHQBS is not null");
            return (Criteria) this;
        }

        public Criteria andSjhqbsEqualTo(BigDecimal value) {
            addCriterion("SJHQBS =", value, "sjhqbs");
            return (Criteria) this;
        }

        public Criteria andSjhqbsNotEqualTo(BigDecimal value) {
            addCriterion("SJHQBS <>", value, "sjhqbs");
            return (Criteria) this;
        }

        public Criteria andSjhqbsGreaterThan(BigDecimal value) {
            addCriterion("SJHQBS >", value, "sjhqbs");
            return (Criteria) this;
        }

        public Criteria andSjhqbsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SJHQBS >=", value, "sjhqbs");
            return (Criteria) this;
        }

        public Criteria andSjhqbsLessThan(BigDecimal value) {
            addCriterion("SJHQBS <", value, "sjhqbs");
            return (Criteria) this;
        }

        public Criteria andSjhqbsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SJHQBS <=", value, "sjhqbs");
            return (Criteria) this;
        }

        public Criteria andSjhqbsIn(List<BigDecimal> values) {
            addCriterion("SJHQBS in", values, "sjhqbs");
            return (Criteria) this;
        }

        public Criteria andSjhqbsNotIn(List<BigDecimal> values) {
            addCriterion("SJHQBS not in", values, "sjhqbs");
            return (Criteria) this;
        }

        public Criteria andSjhqbsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SJHQBS between", value1, value2, "sjhqbs");
            return (Criteria) this;
        }

        public Criteria andSjhqbsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SJHQBS not between", value1, value2, "sjhqbs");
            return (Criteria) this;
        }

        public Criteria andSjhqsjIsNull() {
            addCriterion("SJHQSJ is null");
            return (Criteria) this;
        }

        public Criteria andSjhqsjIsNotNull() {
            addCriterion("SJHQSJ is not null");
            return (Criteria) this;
        }

        public Criteria andSjhqsjEqualTo(Date value) {
            addCriterionForJDBCDate("SJHQSJ =", value, "sjhqsj");
            return (Criteria) this;
        }

        public Criteria andSjhqsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("SJHQSJ <>", value, "sjhqsj");
            return (Criteria) this;
        }

        public Criteria andSjhqsjGreaterThan(Date value) {
            addCriterionForJDBCDate("SJHQSJ >", value, "sjhqsj");
            return (Criteria) this;
        }

        public Criteria andSjhqsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SJHQSJ >=", value, "sjhqsj");
            return (Criteria) this;
        }

        public Criteria andSjhqsjLessThan(Date value) {
            addCriterionForJDBCDate("SJHQSJ <", value, "sjhqsj");
            return (Criteria) this;
        }

        public Criteria andSjhqsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SJHQSJ <=", value, "sjhqsj");
            return (Criteria) this;
        }

        public Criteria andSjhqsjIn(List<Date> values) {
            addCriterionForJDBCDate("SJHQSJ in", values, "sjhqsj");
            return (Criteria) this;
        }

        public Criteria andSjhqsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("SJHQSJ not in", values, "sjhqsj");
            return (Criteria) this;
        }

        public Criteria andSjhqsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SJHQSJ between", value1, value2, "sjhqsj");
            return (Criteria) this;
        }

        public Criteria andSjhqsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SJHQSJ not between", value1, value2, "sjhqsj");
            return (Criteria) this;
        }

        public Criteria andBdclxIsNull() {
            addCriterion("BDCLX is null");
            return (Criteria) this;
        }

        public Criteria andBdclxIsNotNull() {
            addCriterion("BDCLX is not null");
            return (Criteria) this;
        }

        public Criteria andBdclxEqualTo(Object value) {
            addCriterion("BDCLX =", value, "bdclx");
            return (Criteria) this;
        }

        public Criteria andBdclxNotEqualTo(Object value) {
            addCriterion("BDCLX <>", value, "bdclx");
            return (Criteria) this;
        }

        public Criteria andBdclxGreaterThan(Object value) {
            addCriterion("BDCLX >", value, "bdclx");
            return (Criteria) this;
        }

        public Criteria andBdclxGreaterThanOrEqualTo(Object value) {
            addCriterion("BDCLX >=", value, "bdclx");
            return (Criteria) this;
        }

        public Criteria andBdclxLessThan(Object value) {
            addCriterion("BDCLX <", value, "bdclx");
            return (Criteria) this;
        }

        public Criteria andBdclxLessThanOrEqualTo(Object value) {
            addCriterion("BDCLX <=", value, "bdclx");
            return (Criteria) this;
        }

        public Criteria andBdclxIn(List<Object> values) {
            addCriterion("BDCLX in", values, "bdclx");
            return (Criteria) this;
        }

        public Criteria andBdclxNotIn(List<Object> values) {
            addCriterion("BDCLX not in", values, "bdclx");
            return (Criteria) this;
        }

        public Criteria andBdclxBetween(Object value1, Object value2) {
            addCriterion("BDCLX between", value1, value2, "bdclx");
            return (Criteria) this;
        }

        public Criteria andBdclxNotBetween(Object value1, Object value2) {
            addCriterion("BDCLX not between", value1, value2, "bdclx");
            return (Criteria) this;
        }

        public Criteria andDybgztIsNull() {
            addCriterion("DYBGZT is null");
            return (Criteria) this;
        }

        public Criteria andDybgztIsNotNull() {
            addCriterion("DYBGZT is not null");
            return (Criteria) this;
        }

        public Criteria andDybgztEqualTo(BigDecimal value) {
            addCriterion("DYBGZT =", value, "dybgzt");
            return (Criteria) this;
        }

        public Criteria andDybgztNotEqualTo(BigDecimal value) {
            addCriterion("DYBGZT <>", value, "dybgzt");
            return (Criteria) this;
        }

        public Criteria andDybgztGreaterThan(BigDecimal value) {
            addCriterion("DYBGZT >", value, "dybgzt");
            return (Criteria) this;
        }

        public Criteria andDybgztGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DYBGZT >=", value, "dybgzt");
            return (Criteria) this;
        }

        public Criteria andDybgztLessThan(BigDecimal value) {
            addCriterion("DYBGZT <", value, "dybgzt");
            return (Criteria) this;
        }

        public Criteria andDybgztLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DYBGZT <=", value, "dybgzt");
            return (Criteria) this;
        }

        public Criteria andDybgztIn(List<BigDecimal> values) {
            addCriterion("DYBGZT in", values, "dybgzt");
            return (Criteria) this;
        }

        public Criteria andDybgztNotIn(List<BigDecimal> values) {
            addCriterion("DYBGZT not in", values, "dybgzt");
            return (Criteria) this;
        }

        public Criteria andDybgztBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DYBGZT between", value1, value2, "dybgzt");
            return (Criteria) this;
        }

        public Criteria andDybgztNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DYBGZT not between", value1, value2, "dybgzt");
            return (Criteria) this;
        }

        public Criteria andYhzgxIsNull() {
            addCriterion("YHZGX is null");
            return (Criteria) this;
        }

        public Criteria andYhzgxIsNotNull() {
            addCriterion("YHZGX is not null");
            return (Criteria) this;
        }

        public Criteria andYhzgxEqualTo(BigDecimal value) {
            addCriterion("YHZGX =", value, "yhzgx");
            return (Criteria) this;
        }

        public Criteria andYhzgxNotEqualTo(BigDecimal value) {
            addCriterion("YHZGX <>", value, "yhzgx");
            return (Criteria) this;
        }

        public Criteria andYhzgxGreaterThan(BigDecimal value) {
            addCriterion("YHZGX >", value, "yhzgx");
            return (Criteria) this;
        }

        public Criteria andYhzgxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YHZGX >=", value, "yhzgx");
            return (Criteria) this;
        }

        public Criteria andYhzgxLessThan(BigDecimal value) {
            addCriterion("YHZGX <", value, "yhzgx");
            return (Criteria) this;
        }

        public Criteria andYhzgxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YHZGX <=", value, "yhzgx");
            return (Criteria) this;
        }

        public Criteria andYhzgxIn(List<BigDecimal> values) {
            addCriterion("YHZGX in", values, "yhzgx");
            return (Criteria) this;
        }

        public Criteria andYhzgxNotIn(List<BigDecimal> values) {
            addCriterion("YHZGX not in", values, "yhzgx");
            return (Criteria) this;
        }

        public Criteria andYhzgxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YHZGX between", value1, value2, "yhzgx");
            return (Criteria) this;
        }

        public Criteria andYhzgxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YHZGX not between", value1, value2, "yhzgx");
            return (Criteria) this;
        }

        public Criteria andGxztIsNull() {
            addCriterion("GXZT is null");
            return (Criteria) this;
        }

        public Criteria andGxztIsNotNull() {
            addCriterion("GXZT is not null");
            return (Criteria) this;
        }

        public Criteria andGxztEqualTo(BigDecimal value) {
            addCriterion("GXZT =", value, "gxzt");
            return (Criteria) this;
        }

        public Criteria andGxztNotEqualTo(BigDecimal value) {
            addCriterion("GXZT <>", value, "gxzt");
            return (Criteria) this;
        }

        public Criteria andGxztGreaterThan(BigDecimal value) {
            addCriterion("GXZT >", value, "gxzt");
            return (Criteria) this;
        }

        public Criteria andGxztGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GXZT >=", value, "gxzt");
            return (Criteria) this;
        }

        public Criteria andGxztLessThan(BigDecimal value) {
            addCriterion("GXZT <", value, "gxzt");
            return (Criteria) this;
        }

        public Criteria andGxztLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GXZT <=", value, "gxzt");
            return (Criteria) this;
        }

        public Criteria andGxztIn(List<BigDecimal> values) {
            addCriterion("GXZT in", values, "gxzt");
            return (Criteria) this;
        }

        public Criteria andGxztNotIn(List<BigDecimal> values) {
            addCriterion("GXZT not in", values, "gxzt");
            return (Criteria) this;
        }

        public Criteria andGxztBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GXZT between", value1, value2, "gxzt");
            return (Criteria) this;
        }

        public Criteria andGxztNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GXZT not between", value1, value2, "gxzt");
            return (Criteria) this;
        }

        public Criteria andLsbzIsNull() {
            addCriterion("LSBZ is null");
            return (Criteria) this;
        }

        public Criteria andLsbzIsNotNull() {
            addCriterion("LSBZ is not null");
            return (Criteria) this;
        }

        public Criteria andLsbzEqualTo(BigDecimal value) {
            addCriterion("LSBZ =", value, "lsbz");
            return (Criteria) this;
        }

        public Criteria andLsbzNotEqualTo(BigDecimal value) {
            addCriterion("LSBZ <>", value, "lsbz");
            return (Criteria) this;
        }

        public Criteria andLsbzGreaterThan(BigDecimal value) {
            addCriterion("LSBZ >", value, "lsbz");
            return (Criteria) this;
        }

        public Criteria andLsbzGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LSBZ >=", value, "lsbz");
            return (Criteria) this;
        }

        public Criteria andLsbzLessThan(BigDecimal value) {
            addCriterion("LSBZ <", value, "lsbz");
            return (Criteria) this;
        }

        public Criteria andLsbzLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LSBZ <=", value, "lsbz");
            return (Criteria) this;
        }

        public Criteria andLsbzIn(List<BigDecimal> values) {
            addCriterion("LSBZ in", values, "lsbz");
            return (Criteria) this;
        }

        public Criteria andLsbzNotIn(List<BigDecimal> values) {
            addCriterion("LSBZ not in", values, "lsbz");
            return (Criteria) this;
        }

        public Criteria andLsbzBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LSBZ between", value1, value2, "lsbz");
            return (Criteria) this;
        }

        public Criteria andLsbzNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LSBZ not between", value1, value2, "lsbz");
            return (Criteria) this;
        }

        public Criteria andZjhmIsNull() {
            addCriterion("ZJHM is null");
            return (Criteria) this;
        }

        public Criteria andZjhmIsNotNull() {
            addCriterion("ZJHM is not null");
            return (Criteria) this;
        }

        public Criteria andZjhmEqualTo(Object value) {
            addCriterion("ZJHM =", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotEqualTo(Object value) {
            addCriterion("ZJHM <>", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmGreaterThan(Object value) {
            addCriterion("ZJHM >", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmGreaterThanOrEqualTo(Object value) {
            addCriterion("ZJHM >=", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLessThan(Object value) {
            addCriterion("ZJHM <", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLessThanOrEqualTo(Object value) {
            addCriterion("ZJHM <=", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmIn(List<Object> values) {
            addCriterion("ZJHM in", values, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotIn(List<Object> values) {
            addCriterion("ZJHM not in", values, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmBetween(Object value1, Object value2) {
            addCriterion("ZJHM between", value1, value2, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotBetween(Object value1, Object value2) {
            addCriterion("ZJHM not between", value1, value2, "zjhm");
            return (Criteria) this;
        }

        public Criteria andQlrmcIsNull() {
            addCriterion("QLRMC is null");
            return (Criteria) this;
        }

        public Criteria andQlrmcIsNotNull() {
            addCriterion("QLRMC is not null");
            return (Criteria) this;
        }

        public Criteria andQlrmcEqualTo(Object value) {
            addCriterion("QLRMC =", value, "qlrmc");
            return (Criteria) this;
        }

        public Criteria andQlrmcNotEqualTo(Object value) {
            addCriterion("QLRMC <>", value, "qlrmc");
            return (Criteria) this;
        }

        public Criteria andQlrmcGreaterThan(Object value) {
            addCriterion("QLRMC >", value, "qlrmc");
            return (Criteria) this;
        }

        public Criteria andQlrmcGreaterThanOrEqualTo(Object value) {
            addCriterion("QLRMC >=", value, "qlrmc");
            return (Criteria) this;
        }

        public Criteria andQlrmcLessThan(Object value) {
            addCriterion("QLRMC <", value, "qlrmc");
            return (Criteria) this;
        }

        public Criteria andQlrmcLessThanOrEqualTo(Object value) {
            addCriterion("QLRMC <=", value, "qlrmc");
            return (Criteria) this;
        }

        public Criteria andQlrmcIn(List<Object> values) {
            addCriterion("QLRMC in", values, "qlrmc");
            return (Criteria) this;
        }

        public Criteria andQlrmcNotIn(List<Object> values) {
            addCriterion("QLRMC not in", values, "qlrmc");
            return (Criteria) this;
        }

        public Criteria andQlrmcBetween(Object value1, Object value2) {
            addCriterion("QLRMC between", value1, value2, "qlrmc");
            return (Criteria) this;
        }

        public Criteria andQlrmcNotBetween(Object value1, Object value2) {
            addCriterion("QLRMC not between", value1, value2, "qlrmc");
            return (Criteria) this;
        }

        public Criteria andLctypeIsNull() {
            addCriterion("LCTYPE is null");
            return (Criteria) this;
        }

        public Criteria andLctypeIsNotNull() {
            addCriterion("LCTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLctypeEqualTo(String value) {
            addCriterion("LCTYPE =", value, "lctype");
            return (Criteria) this;
        }

        public Criteria andLctypeNotEqualTo(String value) {
            addCriterion("LCTYPE <>", value, "lctype");
            return (Criteria) this;
        }

        public Criteria andLctypeGreaterThan(String value) {
            addCriterion("LCTYPE >", value, "lctype");
            return (Criteria) this;
        }

        public Criteria andLctypeGreaterThanOrEqualTo(String value) {
            addCriterion("LCTYPE >=", value, "lctype");
            return (Criteria) this;
        }

        public Criteria andLctypeLessThan(String value) {
            addCriterion("LCTYPE <", value, "lctype");
            return (Criteria) this;
        }

        public Criteria andLctypeLessThanOrEqualTo(String value) {
            addCriterion("LCTYPE <=", value, "lctype");
            return (Criteria) this;
        }

        public Criteria andLctypeLike(String value) {
            addCriterion("LCTYPE like", value, "lctype");
            return (Criteria) this;
        }

        public Criteria andLctypeNotLike(String value) {
            addCriterion("LCTYPE not like", value, "lctype");
            return (Criteria) this;
        }

        public Criteria andLctypeIn(List<String> values) {
            addCriterion("LCTYPE in", values, "lctype");
            return (Criteria) this;
        }

        public Criteria andLctypeNotIn(List<String> values) {
            addCriterion("LCTYPE not in", values, "lctype");
            return (Criteria) this;
        }

        public Criteria andLctypeBetween(String value1, String value2) {
            addCriterion("LCTYPE between", value1, value2, "lctype");
            return (Criteria) this;
        }

        public Criteria andLctypeNotBetween(String value1, String value2) {
            addCriterion("LCTYPE not between", value1, value2, "lctype");
            return (Criteria) this;
        }

        public Criteria andLqlbIsNull() {
            addCriterion("LQLB is null");
            return (Criteria) this;
        }

        public Criteria andLqlbIsNotNull() {
            addCriterion("LQLB is not null");
            return (Criteria) this;
        }

        public Criteria andLqlbEqualTo(Object value) {
            addCriterion("LQLB =", value, "lqlb");
            return (Criteria) this;
        }

        public Criteria andLqlbNotEqualTo(Object value) {
            addCriterion("LQLB <>", value, "lqlb");
            return (Criteria) this;
        }

        public Criteria andLqlbGreaterThan(Object value) {
            addCriterion("LQLB >", value, "lqlb");
            return (Criteria) this;
        }

        public Criteria andLqlbGreaterThanOrEqualTo(Object value) {
            addCriterion("LQLB >=", value, "lqlb");
            return (Criteria) this;
        }

        public Criteria andLqlbLessThan(Object value) {
            addCriterion("LQLB <", value, "lqlb");
            return (Criteria) this;
        }

        public Criteria andLqlbLessThanOrEqualTo(Object value) {
            addCriterion("LQLB <=", value, "lqlb");
            return (Criteria) this;
        }

        public Criteria andLqlbIn(List<Object> values) {
            addCriterion("LQLB in", values, "lqlb");
            return (Criteria) this;
        }

        public Criteria andLqlbNotIn(List<Object> values) {
            addCriterion("LQLB not in", values, "lqlb");
            return (Criteria) this;
        }

        public Criteria andLqlbBetween(Object value1, Object value2) {
            addCriterion("LQLB between", value1, value2, "lqlb");
            return (Criteria) this;
        }

        public Criteria andLqlbNotBetween(Object value1, Object value2) {
            addCriterion("LQLB not between", value1, value2, "lqlb");
            return (Criteria) this;
        }

        public Criteria andSfcqzyIsNull() {
            addCriterion("SFCQZY is null");
            return (Criteria) this;
        }

        public Criteria andSfcqzyIsNotNull() {
            addCriterion("SFCQZY is not null");
            return (Criteria) this;
        }

        public Criteria andSfcqzyEqualTo(Object value) {
            addCriterion("SFCQZY =", value, "sfcqzy");
            return (Criteria) this;
        }

        public Criteria andSfcqzyNotEqualTo(Object value) {
            addCriterion("SFCQZY <>", value, "sfcqzy");
            return (Criteria) this;
        }

        public Criteria andSfcqzyGreaterThan(Object value) {
            addCriterion("SFCQZY >", value, "sfcqzy");
            return (Criteria) this;
        }

        public Criteria andSfcqzyGreaterThanOrEqualTo(Object value) {
            addCriterion("SFCQZY >=", value, "sfcqzy");
            return (Criteria) this;
        }

        public Criteria andSfcqzyLessThan(Object value) {
            addCriterion("SFCQZY <", value, "sfcqzy");
            return (Criteria) this;
        }

        public Criteria andSfcqzyLessThanOrEqualTo(Object value) {
            addCriterion("SFCQZY <=", value, "sfcqzy");
            return (Criteria) this;
        }

        public Criteria andSfcqzyIn(List<Object> values) {
            addCriterion("SFCQZY in", values, "sfcqzy");
            return (Criteria) this;
        }

        public Criteria andSfcqzyNotIn(List<Object> values) {
            addCriterion("SFCQZY not in", values, "sfcqzy");
            return (Criteria) this;
        }

        public Criteria andSfcqzyBetween(Object value1, Object value2) {
            addCriterion("SFCQZY between", value1, value2, "sfcqzy");
            return (Criteria) this;
        }

        public Criteria andSfcqzyNotBetween(Object value1, Object value2) {
            addCriterion("SFCQZY not between", value1, value2, "sfcqzy");
            return (Criteria) this;
        }

        public Criteria andQllbIsNull() {
            addCriterion("QLLB is null");
            return (Criteria) this;
        }

        public Criteria andQllbIsNotNull() {
            addCriterion("QLLB is not null");
            return (Criteria) this;
        }

        public Criteria andQllbEqualTo(Object value) {
            addCriterion("QLLB =", value, "qllb");
            return (Criteria) this;
        }

        public Criteria andQllbNotEqualTo(Object value) {
            addCriterion("QLLB <>", value, "qllb");
            return (Criteria) this;
        }

        public Criteria andQllbGreaterThan(Object value) {
            addCriterion("QLLB >", value, "qllb");
            return (Criteria) this;
        }

        public Criteria andQllbGreaterThanOrEqualTo(Object value) {
            addCriterion("QLLB >=", value, "qllb");
            return (Criteria) this;
        }

        public Criteria andQllbLessThan(Object value) {
            addCriterion("QLLB <", value, "qllb");
            return (Criteria) this;
        }

        public Criteria andQllbLessThanOrEqualTo(Object value) {
            addCriterion("QLLB <=", value, "qllb");
            return (Criteria) this;
        }

        public Criteria andQllbIn(List<Object> values) {
            addCriterion("QLLB in", values, "qllb");
            return (Criteria) this;
        }

        public Criteria andQllbNotIn(List<Object> values) {
            addCriterion("QLLB not in", values, "qllb");
            return (Criteria) this;
        }

        public Criteria andQllbBetween(Object value1, Object value2) {
            addCriterion("QLLB between", value1, value2, "qllb");
            return (Criteria) this;
        }

        public Criteria andQllbNotBetween(Object value1, Object value2) {
            addCriterion("QLLB not between", value1, value2, "qllb");
            return (Criteria) this;
        }

        public Criteria andOldslidIsNull() {
            addCriterion("OLDSLID is null");
            return (Criteria) this;
        }

        public Criteria andOldslidIsNotNull() {
            addCriterion("OLDSLID is not null");
            return (Criteria) this;
        }

        public Criteria andOldslidEqualTo(Object value) {
            addCriterion("OLDSLID =", value, "oldslid");
            return (Criteria) this;
        }

        public Criteria andOldslidNotEqualTo(Object value) {
            addCriterion("OLDSLID <>", value, "oldslid");
            return (Criteria) this;
        }

        public Criteria andOldslidGreaterThan(Object value) {
            addCriterion("OLDSLID >", value, "oldslid");
            return (Criteria) this;
        }

        public Criteria andOldslidGreaterThanOrEqualTo(Object value) {
            addCriterion("OLDSLID >=", value, "oldslid");
            return (Criteria) this;
        }

        public Criteria andOldslidLessThan(Object value) {
            addCriterion("OLDSLID <", value, "oldslid");
            return (Criteria) this;
        }

        public Criteria andOldslidLessThanOrEqualTo(Object value) {
            addCriterion("OLDSLID <=", value, "oldslid");
            return (Criteria) this;
        }

        public Criteria andOldslidIn(List<Object> values) {
            addCriterion("OLDSLID in", values, "oldslid");
            return (Criteria) this;
        }

        public Criteria andOldslidNotIn(List<Object> values) {
            addCriterion("OLDSLID not in", values, "oldslid");
            return (Criteria) this;
        }

        public Criteria andOldslidBetween(Object value1, Object value2) {
            addCriterion("OLDSLID between", value1, value2, "oldslid");
            return (Criteria) this;
        }

        public Criteria andOldslidNotBetween(Object value1, Object value2) {
            addCriterion("OLDSLID not between", value1, value2, "oldslid");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNull() {
            addCriterion("HOUSE_ID is null");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNotNull() {
            addCriterion("HOUSE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHouseIdEqualTo(Object value) {
            addCriterion("HOUSE_ID =", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotEqualTo(Object value) {
            addCriterion("HOUSE_ID <>", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThan(Object value) {
            addCriterion("HOUSE_ID >", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThanOrEqualTo(Object value) {
            addCriterion("HOUSE_ID >=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThan(Object value) {
            addCriterion("HOUSE_ID <", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThanOrEqualTo(Object value) {
            addCriterion("HOUSE_ID <=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdIn(List<Object> values) {
            addCriterion("HOUSE_ID in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotIn(List<Object> values) {
            addCriterion("HOUSE_ID not in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdBetween(Object value1, Object value2) {
            addCriterion("HOUSE_ID between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotBetween(Object value1, Object value2) {
            addCriterion("HOUSE_ID not between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andFourCodeIsNull() {
            addCriterion("FOUR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFourCodeIsNotNull() {
            addCriterion("FOUR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFourCodeEqualTo(Object value) {
            addCriterion("FOUR_CODE =", value, "fourCode");
            return (Criteria) this;
        }

        public Criteria andFourCodeNotEqualTo(Object value) {
            addCriterion("FOUR_CODE <>", value, "fourCode");
            return (Criteria) this;
        }

        public Criteria andFourCodeGreaterThan(Object value) {
            addCriterion("FOUR_CODE >", value, "fourCode");
            return (Criteria) this;
        }

        public Criteria andFourCodeGreaterThanOrEqualTo(Object value) {
            addCriterion("FOUR_CODE >=", value, "fourCode");
            return (Criteria) this;
        }

        public Criteria andFourCodeLessThan(Object value) {
            addCriterion("FOUR_CODE <", value, "fourCode");
            return (Criteria) this;
        }

        public Criteria andFourCodeLessThanOrEqualTo(Object value) {
            addCriterion("FOUR_CODE <=", value, "fourCode");
            return (Criteria) this;
        }

        public Criteria andFourCodeIn(List<Object> values) {
            addCriterion("FOUR_CODE in", values, "fourCode");
            return (Criteria) this;
        }

        public Criteria andFourCodeNotIn(List<Object> values) {
            addCriterion("FOUR_CODE not in", values, "fourCode");
            return (Criteria) this;
        }

        public Criteria andFourCodeBetween(Object value1, Object value2) {
            addCriterion("FOUR_CODE between", value1, value2, "fourCode");
            return (Criteria) this;
        }

        public Criteria andFourCodeNotBetween(Object value1, Object value2) {
            addCriterion("FOUR_CODE not between", value1, value2, "fourCode");
            return (Criteria) this;
        }

        public Criteria andGlqyIsNull() {
            addCriterion("GLQY is null");
            return (Criteria) this;
        }

        public Criteria andGlqyIsNotNull() {
            addCriterion("GLQY is not null");
            return (Criteria) this;
        }

        public Criteria andGlqyEqualTo(Object value) {
            addCriterion("GLQY =", value, "glqy");
            return (Criteria) this;
        }

        public Criteria andGlqyNotEqualTo(Object value) {
            addCriterion("GLQY <>", value, "glqy");
            return (Criteria) this;
        }

        public Criteria andGlqyGreaterThan(Object value) {
            addCriterion("GLQY >", value, "glqy");
            return (Criteria) this;
        }

        public Criteria andGlqyGreaterThanOrEqualTo(Object value) {
            addCriterion("GLQY >=", value, "glqy");
            return (Criteria) this;
        }

        public Criteria andGlqyLessThan(Object value) {
            addCriterion("GLQY <", value, "glqy");
            return (Criteria) this;
        }

        public Criteria andGlqyLessThanOrEqualTo(Object value) {
            addCriterion("GLQY <=", value, "glqy");
            return (Criteria) this;
        }

        public Criteria andGlqyIn(List<Object> values) {
            addCriterion("GLQY in", values, "glqy");
            return (Criteria) this;
        }

        public Criteria andGlqyNotIn(List<Object> values) {
            addCriterion("GLQY not in", values, "glqy");
            return (Criteria) this;
        }

        public Criteria andGlqyBetween(Object value1, Object value2) {
            addCriterion("GLQY between", value1, value2, "glqy");
            return (Criteria) this;
        }

        public Criteria andGlqyNotBetween(Object value1, Object value2) {
            addCriterion("GLQY not between", value1, value2, "glqy");
            return (Criteria) this;
        }

        public Criteria andNfdrbszdIsNull() {
            addCriterion("NFDRBSZD is null");
            return (Criteria) this;
        }

        public Criteria andNfdrbszdIsNotNull() {
            addCriterion("NFDRBSZD is not null");
            return (Criteria) this;
        }

        public Criteria andNfdrbszdEqualTo(Object value) {
            addCriterion("NFDRBSZD =", value, "nfdrbszd");
            return (Criteria) this;
        }

        public Criteria andNfdrbszdNotEqualTo(Object value) {
            addCriterion("NFDRBSZD <>", value, "nfdrbszd");
            return (Criteria) this;
        }

        public Criteria andNfdrbszdGreaterThan(Object value) {
            addCriterion("NFDRBSZD >", value, "nfdrbszd");
            return (Criteria) this;
        }

        public Criteria andNfdrbszdGreaterThanOrEqualTo(Object value) {
            addCriterion("NFDRBSZD >=", value, "nfdrbszd");
            return (Criteria) this;
        }

        public Criteria andNfdrbszdLessThan(Object value) {
            addCriterion("NFDRBSZD <", value, "nfdrbszd");
            return (Criteria) this;
        }

        public Criteria andNfdrbszdLessThanOrEqualTo(Object value) {
            addCriterion("NFDRBSZD <=", value, "nfdrbszd");
            return (Criteria) this;
        }

        public Criteria andNfdrbszdIn(List<Object> values) {
            addCriterion("NFDRBSZD in", values, "nfdrbszd");
            return (Criteria) this;
        }

        public Criteria andNfdrbszdNotIn(List<Object> values) {
            addCriterion("NFDRBSZD not in", values, "nfdrbszd");
            return (Criteria) this;
        }

        public Criteria andNfdrbszdBetween(Object value1, Object value2) {
            addCriterion("NFDRBSZD between", value1, value2, "nfdrbszd");
            return (Criteria) this;
        }

        public Criteria andNfdrbszdNotBetween(Object value1, Object value2) {
            addCriterion("NFDRBSZD not between", value1, value2, "nfdrbszd");
            return (Criteria) this;
        }

        public Criteria andCbfbmIsNull() {
            addCriterion("CBFBM is null");
            return (Criteria) this;
        }

        public Criteria andCbfbmIsNotNull() {
            addCriterion("CBFBM is not null");
            return (Criteria) this;
        }

        public Criteria andCbfbmEqualTo(String value) {
            addCriterion("CBFBM =", value, "cbfbm");
            return (Criteria) this;
        }

        public Criteria andCbfbmNotEqualTo(String value) {
            addCriterion("CBFBM <>", value, "cbfbm");
            return (Criteria) this;
        }

        public Criteria andCbfbmGreaterThan(String value) {
            addCriterion("CBFBM >", value, "cbfbm");
            return (Criteria) this;
        }

        public Criteria andCbfbmGreaterThanOrEqualTo(String value) {
            addCriterion("CBFBM >=", value, "cbfbm");
            return (Criteria) this;
        }

        public Criteria andCbfbmLessThan(String value) {
            addCriterion("CBFBM <", value, "cbfbm");
            return (Criteria) this;
        }

        public Criteria andCbfbmLessThanOrEqualTo(String value) {
            addCriterion("CBFBM <=", value, "cbfbm");
            return (Criteria) this;
        }

        public Criteria andCbfbmLike(String value) {
            addCriterion("CBFBM like", value, "cbfbm");
            return (Criteria) this;
        }

        public Criteria andCbfbmNotLike(String value) {
            addCriterion("CBFBM not like", value, "cbfbm");
            return (Criteria) this;
        }

        public Criteria andCbfbmIn(List<String> values) {
            addCriterion("CBFBM in", values, "cbfbm");
            return (Criteria) this;
        }

        public Criteria andCbfbmNotIn(List<String> values) {
            addCriterion("CBFBM not in", values, "cbfbm");
            return (Criteria) this;
        }

        public Criteria andCbfbmBetween(String value1, String value2) {
            addCriterion("CBFBM between", value1, value2, "cbfbm");
            return (Criteria) this;
        }

        public Criteria andCbfbmNotBetween(String value1, String value2) {
            addCriterion("CBFBM not between", value1, value2, "cbfbm");
            return (Criteria) this;
        }

        public Criteria andQlrtzIsNull() {
            addCriterion("QLRTZ is null");
            return (Criteria) this;
        }

        public Criteria andQlrtzIsNotNull() {
            addCriterion("QLRTZ is not null");
            return (Criteria) this;
        }

        public Criteria andQlrtzEqualTo(String value) {
            addCriterion("QLRTZ =", value, "qlrtz");
            return (Criteria) this;
        }

        public Criteria andQlrtzNotEqualTo(String value) {
            addCriterion("QLRTZ <>", value, "qlrtz");
            return (Criteria) this;
        }

        public Criteria andQlrtzGreaterThan(String value) {
            addCriterion("QLRTZ >", value, "qlrtz");
            return (Criteria) this;
        }

        public Criteria andQlrtzGreaterThanOrEqualTo(String value) {
            addCriterion("QLRTZ >=", value, "qlrtz");
            return (Criteria) this;
        }

        public Criteria andQlrtzLessThan(String value) {
            addCriterion("QLRTZ <", value, "qlrtz");
            return (Criteria) this;
        }

        public Criteria andQlrtzLessThanOrEqualTo(String value) {
            addCriterion("QLRTZ <=", value, "qlrtz");
            return (Criteria) this;
        }

        public Criteria andQlrtzLike(String value) {
            addCriterion("QLRTZ like", value, "qlrtz");
            return (Criteria) this;
        }

        public Criteria andQlrtzNotLike(String value) {
            addCriterion("QLRTZ not like", value, "qlrtz");
            return (Criteria) this;
        }

        public Criteria andQlrtzIn(List<String> values) {
            addCriterion("QLRTZ in", values, "qlrtz");
            return (Criteria) this;
        }

        public Criteria andQlrtzNotIn(List<String> values) {
            addCriterion("QLRTZ not in", values, "qlrtz");
            return (Criteria) this;
        }

        public Criteria andQlrtzBetween(String value1, String value2) {
            addCriterion("QLRTZ between", value1, value2, "qlrtz");
            return (Criteria) this;
        }

        public Criteria andQlrtzNotBetween(String value1, String value2) {
            addCriterion("QLRTZ not between", value1, value2, "qlrtz");
            return (Criteria) this;
        }

        public Criteria andQlrlxIsNull() {
            addCriterion("QLRLX is null");
            return (Criteria) this;
        }

        public Criteria andQlrlxIsNotNull() {
            addCriterion("QLRLX is not null");
            return (Criteria) this;
        }

        public Criteria andQlrlxEqualTo(Object value) {
            addCriterion("QLRLX =", value, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andQlrlxNotEqualTo(Object value) {
            addCriterion("QLRLX <>", value, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andQlrlxGreaterThan(Object value) {
            addCriterion("QLRLX >", value, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andQlrlxGreaterThanOrEqualTo(Object value) {
            addCriterion("QLRLX >=", value, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andQlrlxLessThan(Object value) {
            addCriterion("QLRLX <", value, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andQlrlxLessThanOrEqualTo(Object value) {
            addCriterion("QLRLX <=", value, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andQlrlxIn(List<Object> values) {
            addCriterion("QLRLX in", values, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andQlrlxNotIn(List<Object> values) {
            addCriterion("QLRLX not in", values, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andQlrlxBetween(Object value1, Object value2) {
            addCriterion("QLRLX between", value1, value2, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andQlrlxNotBetween(Object value1, Object value2) {
            addCriterion("QLRLX not between", value1, value2, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andPushStateIsNull() {
            addCriterion("PUSH_STATE is null");
            return (Criteria) this;
        }

        public Criteria andPushStateIsNotNull() {
            addCriterion("PUSH_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andPushStateEqualTo(BigDecimal value) {
            addCriterion("PUSH_STATE =", value, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateNotEqualTo(BigDecimal value) {
            addCriterion("PUSH_STATE <>", value, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateGreaterThan(BigDecimal value) {
            addCriterion("PUSH_STATE >", value, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PUSH_STATE >=", value, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateLessThan(BigDecimal value) {
            addCriterion("PUSH_STATE <", value, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PUSH_STATE <=", value, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateIn(List<BigDecimal> values) {
            addCriterion("PUSH_STATE in", values, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateNotIn(List<BigDecimal> values) {
            addCriterion("PUSH_STATE not in", values, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PUSH_STATE between", value1, value2, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PUSH_STATE not between", value1, value2, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushState2IsNull() {
            addCriterion("PUSH_STATE2 is null");
            return (Criteria) this;
        }

        public Criteria andPushState2IsNotNull() {
            addCriterion("PUSH_STATE2 is not null");
            return (Criteria) this;
        }

        public Criteria andPushState2EqualTo(BigDecimal value) {
            addCriterion("PUSH_STATE2 =", value, "pushState2");
            return (Criteria) this;
        }

        public Criteria andPushState2NotEqualTo(BigDecimal value) {
            addCriterion("PUSH_STATE2 <>", value, "pushState2");
            return (Criteria) this;
        }

        public Criteria andPushState2GreaterThan(BigDecimal value) {
            addCriterion("PUSH_STATE2 >", value, "pushState2");
            return (Criteria) this;
        }

        public Criteria andPushState2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PUSH_STATE2 >=", value, "pushState2");
            return (Criteria) this;
        }

        public Criteria andPushState2LessThan(BigDecimal value) {
            addCriterion("PUSH_STATE2 <", value, "pushState2");
            return (Criteria) this;
        }

        public Criteria andPushState2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("PUSH_STATE2 <=", value, "pushState2");
            return (Criteria) this;
        }

        public Criteria andPushState2In(List<BigDecimal> values) {
            addCriterion("PUSH_STATE2 in", values, "pushState2");
            return (Criteria) this;
        }

        public Criteria andPushState2NotIn(List<BigDecimal> values) {
            addCriterion("PUSH_STATE2 not in", values, "pushState2");
            return (Criteria) this;
        }

        public Criteria andPushState2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("PUSH_STATE2 between", value1, value2, "pushState2");
            return (Criteria) this;
        }

        public Criteria andPushState2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PUSH_STATE2 not between", value1, value2, "pushState2");
            return (Criteria) this;
        }

        public Criteria andQllxIsNull() {
            addCriterion("QLLX is null");
            return (Criteria) this;
        }

        public Criteria andQllxIsNotNull() {
            addCriterion("QLLX is not null");
            return (Criteria) this;
        }

        public Criteria andQllxEqualTo(BigDecimal value) {
            addCriterion("QLLX =", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxNotEqualTo(BigDecimal value) {
            addCriterion("QLLX <>", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxGreaterThan(BigDecimal value) {
            addCriterion("QLLX >", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QLLX >=", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxLessThan(BigDecimal value) {
            addCriterion("QLLX <", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QLLX <=", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxIn(List<BigDecimal> values) {
            addCriterion("QLLX in", values, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxNotIn(List<BigDecimal> values) {
            addCriterion("QLLX not in", values, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QLLX between", value1, value2, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QLLX not between", value1, value2, "qllx");
            return (Criteria) this;
        }

        public Criteria andYsdmIsNull() {
            addCriterion("YSDM is null");
            return (Criteria) this;
        }

        public Criteria andYsdmIsNotNull() {
            addCriterion("YSDM is not null");
            return (Criteria) this;
        }

        public Criteria andYsdmEqualTo(Object value) {
            addCriterion("YSDM =", value, "ysdm");
            return (Criteria) this;
        }

        public Criteria andYsdmNotEqualTo(Object value) {
            addCriterion("YSDM <>", value, "ysdm");
            return (Criteria) this;
        }

        public Criteria andYsdmGreaterThan(Object value) {
            addCriterion("YSDM >", value, "ysdm");
            return (Criteria) this;
        }

        public Criteria andYsdmGreaterThanOrEqualTo(Object value) {
            addCriterion("YSDM >=", value, "ysdm");
            return (Criteria) this;
        }

        public Criteria andYsdmLessThan(Object value) {
            addCriterion("YSDM <", value, "ysdm");
            return (Criteria) this;
        }

        public Criteria andYsdmLessThanOrEqualTo(Object value) {
            addCriterion("YSDM <=", value, "ysdm");
            return (Criteria) this;
        }

        public Criteria andYsdmIn(List<Object> values) {
            addCriterion("YSDM in", values, "ysdm");
            return (Criteria) this;
        }

        public Criteria andYsdmNotIn(List<Object> values) {
            addCriterion("YSDM not in", values, "ysdm");
            return (Criteria) this;
        }

        public Criteria andYsdmBetween(Object value1, Object value2) {
            addCriterion("YSDM between", value1, value2, "ysdm");
            return (Criteria) this;
        }

        public Criteria andYsdmNotBetween(Object value1, Object value2) {
            addCriterion("YSDM not between", value1, value2, "ysdm");
            return (Criteria) this;
        }

        public Criteria andFbfbmIsNull() {
            addCriterion("FBFBM is null");
            return (Criteria) this;
        }

        public Criteria andFbfbmIsNotNull() {
            addCriterion("FBFBM is not null");
            return (Criteria) this;
        }

        public Criteria andFbfbmEqualTo(Object value) {
            addCriterion("FBFBM =", value, "fbfbm");
            return (Criteria) this;
        }

        public Criteria andFbfbmNotEqualTo(Object value) {
            addCriterion("FBFBM <>", value, "fbfbm");
            return (Criteria) this;
        }

        public Criteria andFbfbmGreaterThan(Object value) {
            addCriterion("FBFBM >", value, "fbfbm");
            return (Criteria) this;
        }

        public Criteria andFbfbmGreaterThanOrEqualTo(Object value) {
            addCriterion("FBFBM >=", value, "fbfbm");
            return (Criteria) this;
        }

        public Criteria andFbfbmLessThan(Object value) {
            addCriterion("FBFBM <", value, "fbfbm");
            return (Criteria) this;
        }

        public Criteria andFbfbmLessThanOrEqualTo(Object value) {
            addCriterion("FBFBM <=", value, "fbfbm");
            return (Criteria) this;
        }

        public Criteria andFbfbmIn(List<Object> values) {
            addCriterion("FBFBM in", values, "fbfbm");
            return (Criteria) this;
        }

        public Criteria andFbfbmNotIn(List<Object> values) {
            addCriterion("FBFBM not in", values, "fbfbm");
            return (Criteria) this;
        }

        public Criteria andFbfbmBetween(Object value1, Object value2) {
            addCriterion("FBFBM between", value1, value2, "fbfbm");
            return (Criteria) this;
        }

        public Criteria andFbfbmNotBetween(Object value1, Object value2) {
            addCriterion("FBFBM not between", value1, value2, "fbfbm");
            return (Criteria) this;
        }

        public Criteria andDzIsNull() {
            addCriterion("DZ is null");
            return (Criteria) this;
        }

        public Criteria andDzIsNotNull() {
            addCriterion("DZ is not null");
            return (Criteria) this;
        }

        public Criteria andDzEqualTo(Object value) {
            addCriterion("DZ =", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotEqualTo(Object value) {
            addCriterion("DZ <>", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzGreaterThan(Object value) {
            addCriterion("DZ >", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzGreaterThanOrEqualTo(Object value) {
            addCriterion("DZ >=", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzLessThan(Object value) {
            addCriterion("DZ <", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzLessThanOrEqualTo(Object value) {
            addCriterion("DZ <=", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzIn(List<Object> values) {
            addCriterion("DZ in", values, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotIn(List<Object> values) {
            addCriterion("DZ not in", values, "dz");
            return (Criteria) this;
        }

        public Criteria andDzBetween(Object value1, Object value2) {
            addCriterion("DZ between", value1, value2, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotBetween(Object value1, Object value2) {
            addCriterion("DZ not between", value1, value2, "dz");
            return (Criteria) this;
        }

        public Criteria andQlmjIsNull() {
            addCriterion("QLMJ is null");
            return (Criteria) this;
        }

        public Criteria andQlmjIsNotNull() {
            addCriterion("QLMJ is not null");
            return (Criteria) this;
        }

        public Criteria andQlmjEqualTo(Object value) {
            addCriterion("QLMJ =", value, "qlmj");
            return (Criteria) this;
        }

        public Criteria andQlmjNotEqualTo(Object value) {
            addCriterion("QLMJ <>", value, "qlmj");
            return (Criteria) this;
        }

        public Criteria andQlmjGreaterThan(Object value) {
            addCriterion("QLMJ >", value, "qlmj");
            return (Criteria) this;
        }

        public Criteria andQlmjGreaterThanOrEqualTo(Object value) {
            addCriterion("QLMJ >=", value, "qlmj");
            return (Criteria) this;
        }

        public Criteria andQlmjLessThan(Object value) {
            addCriterion("QLMJ <", value, "qlmj");
            return (Criteria) this;
        }

        public Criteria andQlmjLessThanOrEqualTo(Object value) {
            addCriterion("QLMJ <=", value, "qlmj");
            return (Criteria) this;
        }

        public Criteria andQlmjIn(List<Object> values) {
            addCriterion("QLMJ in", values, "qlmj");
            return (Criteria) this;
        }

        public Criteria andQlmjNotIn(List<Object> values) {
            addCriterion("QLMJ not in", values, "qlmj");
            return (Criteria) this;
        }

        public Criteria andQlmjBetween(Object value1, Object value2) {
            addCriterion("QLMJ between", value1, value2, "qlmj");
            return (Criteria) this;
        }

        public Criteria andQlmjNotBetween(Object value1, Object value2) {
            addCriterion("QLMJ not between", value1, value2, "qlmj");
            return (Criteria) this;
        }

        public Criteria andFzjgIsNull() {
            addCriterion("FZJG is null");
            return (Criteria) this;
        }

        public Criteria andFzjgIsNotNull() {
            addCriterion("FZJG is not null");
            return (Criteria) this;
        }

        public Criteria andFzjgEqualTo(Object value) {
            addCriterion("FZJG =", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgNotEqualTo(Object value) {
            addCriterion("FZJG <>", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgGreaterThan(Object value) {
            addCriterion("FZJG >", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgGreaterThanOrEqualTo(Object value) {
            addCriterion("FZJG >=", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgLessThan(Object value) {
            addCriterion("FZJG <", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgLessThanOrEqualTo(Object value) {
            addCriterion("FZJG <=", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgIn(List<Object> values) {
            addCriterion("FZJG in", values, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgNotIn(List<Object> values) {
            addCriterion("FZJG not in", values, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgBetween(Object value1, Object value2) {
            addCriterion("FZJG between", value1, value2, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgNotBetween(Object value1, Object value2) {
            addCriterion("FZJG not between", value1, value2, "fzjg");
            return (Criteria) this;
        }

        public Criteria andGjIsNull() {
            addCriterion("GJ is null");
            return (Criteria) this;
        }

        public Criteria andGjIsNotNull() {
            addCriterion("GJ is not null");
            return (Criteria) this;
        }

        public Criteria andGjEqualTo(Object value) {
            addCriterion("GJ =", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotEqualTo(Object value) {
            addCriterion("GJ <>", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjGreaterThan(Object value) {
            addCriterion("GJ >", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjGreaterThanOrEqualTo(Object value) {
            addCriterion("GJ >=", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjLessThan(Object value) {
            addCriterion("GJ <", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjLessThanOrEqualTo(Object value) {
            addCriterion("GJ <=", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjIn(List<Object> values) {
            addCriterion("GJ in", values, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotIn(List<Object> values) {
            addCriterion("GJ not in", values, "gj");
            return (Criteria) this;
        }

        public Criteria andGjBetween(Object value1, Object value2) {
            addCriterion("GJ between", value1, value2, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotBetween(Object value1, Object value2) {
            addCriterion("GJ not between", value1, value2, "gj");
            return (Criteria) this;
        }

        public Criteria andDhIsNull() {
            addCriterion("DH is null");
            return (Criteria) this;
        }

        public Criteria andDhIsNotNull() {
            addCriterion("DH is not null");
            return (Criteria) this;
        }

        public Criteria andDhEqualTo(Object value) {
            addCriterion("DH =", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotEqualTo(Object value) {
            addCriterion("DH <>", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhGreaterThan(Object value) {
            addCriterion("DH >", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhGreaterThanOrEqualTo(Object value) {
            addCriterion("DH >=", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLessThan(Object value) {
            addCriterion("DH <", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLessThanOrEqualTo(Object value) {
            addCriterion("DH <=", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhIn(List<Object> values) {
            addCriterion("DH in", values, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotIn(List<Object> values) {
            addCriterion("DH not in", values, "dh");
            return (Criteria) this;
        }

        public Criteria andDhBetween(Object value1, Object value2) {
            addCriterion("DH between", value1, value2, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotBetween(Object value1, Object value2) {
            addCriterion("DH not between", value1, value2, "dh");
            return (Criteria) this;
        }

        public Criteria andYbIsNull() {
            addCriterion("YB is null");
            return (Criteria) this;
        }

        public Criteria andYbIsNotNull() {
            addCriterion("YB is not null");
            return (Criteria) this;
        }

        public Criteria andYbEqualTo(Object value) {
            addCriterion("YB =", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbNotEqualTo(Object value) {
            addCriterion("YB <>", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbGreaterThan(Object value) {
            addCriterion("YB >", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbGreaterThanOrEqualTo(Object value) {
            addCriterion("YB >=", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbLessThan(Object value) {
            addCriterion("YB <", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbLessThanOrEqualTo(Object value) {
            addCriterion("YB <=", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbIn(List<Object> values) {
            addCriterion("YB in", values, "yb");
            return (Criteria) this;
        }

        public Criteria andYbNotIn(List<Object> values) {
            addCriterion("YB not in", values, "yb");
            return (Criteria) this;
        }

        public Criteria andYbBetween(Object value1, Object value2) {
            addCriterion("YB between", value1, value2, "yb");
            return (Criteria) this;
        }

        public Criteria andYbNotBetween(Object value1, Object value2) {
            addCriterion("YB not between", value1, value2, "yb");
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
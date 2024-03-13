package com.jyq.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BdcQlrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BdcQlrExample() {
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

        public Criteria andDzyjIsNull() {
            addCriterion("DZYJ is null");
            return (Criteria) this;
        }

        public Criteria andDzyjIsNotNull() {
            addCriterion("DZYJ is not null");
            return (Criteria) this;
        }

        public Criteria andDzyjEqualTo(Object value) {
            addCriterion("DZYJ =", value, "dzyj");
            return (Criteria) this;
        }

        public Criteria andDzyjNotEqualTo(Object value) {
            addCriterion("DZYJ <>", value, "dzyj");
            return (Criteria) this;
        }

        public Criteria andDzyjGreaterThan(Object value) {
            addCriterion("DZYJ >", value, "dzyj");
            return (Criteria) this;
        }

        public Criteria andDzyjGreaterThanOrEqualTo(Object value) {
            addCriterion("DZYJ >=", value, "dzyj");
            return (Criteria) this;
        }

        public Criteria andDzyjLessThan(Object value) {
            addCriterion("DZYJ <", value, "dzyj");
            return (Criteria) this;
        }

        public Criteria andDzyjLessThanOrEqualTo(Object value) {
            addCriterion("DZYJ <=", value, "dzyj");
            return (Criteria) this;
        }

        public Criteria andDzyjIn(List<Object> values) {
            addCriterion("DZYJ in", values, "dzyj");
            return (Criteria) this;
        }

        public Criteria andDzyjNotIn(List<Object> values) {
            addCriterion("DZYJ not in", values, "dzyj");
            return (Criteria) this;
        }

        public Criteria andDzyjBetween(Object value1, Object value2) {
            addCriterion("DZYJ between", value1, value2, "dzyj");
            return (Criteria) this;
        }

        public Criteria andDzyjNotBetween(Object value1, Object value2) {
            addCriterion("DZYJ not between", value1, value2, "dzyj");
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

        public Criteria andXbIsNull() {
            addCriterion("XB is null");
            return (Criteria) this;
        }

        public Criteria andXbIsNotNull() {
            addCriterion("XB is not null");
            return (Criteria) this;
        }

        public Criteria andXbEqualTo(BigDecimal value) {
            addCriterion("XB =", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotEqualTo(BigDecimal value) {
            addCriterion("XB <>", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThan(BigDecimal value) {
            addCriterion("XB >", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XB >=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThan(BigDecimal value) {
            addCriterion("XB <", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XB <=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbIn(List<BigDecimal> values) {
            addCriterion("XB in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotIn(List<BigDecimal> values) {
            addCriterion("XB not in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XB between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XB not between", value1, value2, "xb");
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

        public Criteria andGjIsNull() {
            addCriterion("GJ is null");
            return (Criteria) this;
        }

        public Criteria andGjIsNotNull() {
            addCriterion("GJ is not null");
            return (Criteria) this;
        }

        public Criteria andGjEqualTo(BigDecimal value) {
            addCriterion("GJ =", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotEqualTo(BigDecimal value) {
            addCriterion("GJ <>", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjGreaterThan(BigDecimal value) {
            addCriterion("GJ >", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GJ >=", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjLessThan(BigDecimal value) {
            addCriterion("GJ <", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GJ <=", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjIn(List<BigDecimal> values) {
            addCriterion("GJ in", values, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotIn(List<BigDecimal> values) {
            addCriterion("GJ not in", values, "gj");
            return (Criteria) this;
        }

        public Criteria andGjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GJ between", value1, value2, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GJ not between", value1, value2, "gj");
            return (Criteria) this;
        }

        public Criteria andSshyIsNull() {
            addCriterion("SSHY is null");
            return (Criteria) this;
        }

        public Criteria andSshyIsNotNull() {
            addCriterion("SSHY is not null");
            return (Criteria) this;
        }

        public Criteria andSshyEqualTo(BigDecimal value) {
            addCriterion("SSHY =", value, "sshy");
            return (Criteria) this;
        }

        public Criteria andSshyNotEqualTo(BigDecimal value) {
            addCriterion("SSHY <>", value, "sshy");
            return (Criteria) this;
        }

        public Criteria andSshyGreaterThan(BigDecimal value) {
            addCriterion("SSHY >", value, "sshy");
            return (Criteria) this;
        }

        public Criteria andSshyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SSHY >=", value, "sshy");
            return (Criteria) this;
        }

        public Criteria andSshyLessThan(BigDecimal value) {
            addCriterion("SSHY <", value, "sshy");
            return (Criteria) this;
        }

        public Criteria andSshyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SSHY <=", value, "sshy");
            return (Criteria) this;
        }

        public Criteria andSshyIn(List<BigDecimal> values) {
            addCriterion("SSHY in", values, "sshy");
            return (Criteria) this;
        }

        public Criteria andSshyNotIn(List<BigDecimal> values) {
            addCriterion("SSHY not in", values, "sshy");
            return (Criteria) this;
        }

        public Criteria andSshyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SSHY between", value1, value2, "sshy");
            return (Criteria) this;
        }

        public Criteria andSshyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SSHY not between", value1, value2, "sshy");
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

        public Criteria andQlblIsNull() {
            addCriterion("QLBL is null");
            return (Criteria) this;
        }

        public Criteria andQlblIsNotNull() {
            addCriterion("QLBL is not null");
            return (Criteria) this;
        }

        public Criteria andQlblEqualTo(Object value) {
            addCriterion("QLBL =", value, "qlbl");
            return (Criteria) this;
        }

        public Criteria andQlblNotEqualTo(Object value) {
            addCriterion("QLBL <>", value, "qlbl");
            return (Criteria) this;
        }

        public Criteria andQlblGreaterThan(Object value) {
            addCriterion("QLBL >", value, "qlbl");
            return (Criteria) this;
        }

        public Criteria andQlblGreaterThanOrEqualTo(Object value) {
            addCriterion("QLBL >=", value, "qlbl");
            return (Criteria) this;
        }

        public Criteria andQlblLessThan(Object value) {
            addCriterion("QLBL <", value, "qlbl");
            return (Criteria) this;
        }

        public Criteria andQlblLessThanOrEqualTo(Object value) {
            addCriterion("QLBL <=", value, "qlbl");
            return (Criteria) this;
        }

        public Criteria andQlblIn(List<Object> values) {
            addCriterion("QLBL in", values, "qlbl");
            return (Criteria) this;
        }

        public Criteria andQlblNotIn(List<Object> values) {
            addCriterion("QLBL not in", values, "qlbl");
            return (Criteria) this;
        }

        public Criteria andQlblBetween(Object value1, Object value2) {
            addCriterion("QLBL between", value1, value2, "qlbl");
            return (Criteria) this;
        }

        public Criteria andQlblNotBetween(Object value1, Object value2) {
            addCriterion("QLBL not between", value1, value2, "qlbl");
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

        public Criteria andQlmjEqualTo(Double value) {
            addCriterion("QLMJ =", value, "qlmj");
            return (Criteria) this;
        }

        public Criteria andQlmjNotEqualTo(Double value) {
            addCriterion("QLMJ <>", value, "qlmj");
            return (Criteria) this;
        }

        public Criteria andQlmjGreaterThan(Double value) {
            addCriterion("QLMJ >", value, "qlmj");
            return (Criteria) this;
        }

        public Criteria andQlmjGreaterThanOrEqualTo(Double value) {
            addCriterion("QLMJ >=", value, "qlmj");
            return (Criteria) this;
        }

        public Criteria andQlmjLessThan(Double value) {
            addCriterion("QLMJ <", value, "qlmj");
            return (Criteria) this;
        }

        public Criteria andQlmjLessThanOrEqualTo(Double value) {
            addCriterion("QLMJ <=", value, "qlmj");
            return (Criteria) this;
        }

        public Criteria andQlmjIn(List<Double> values) {
            addCriterion("QLMJ in", values, "qlmj");
            return (Criteria) this;
        }

        public Criteria andQlmjNotIn(List<Double> values) {
            addCriterion("QLMJ not in", values, "qlmj");
            return (Criteria) this;
        }

        public Criteria andQlmjBetween(Double value1, Double value2) {
            addCriterion("QLMJ between", value1, value2, "qlmj");
            return (Criteria) this;
        }

        public Criteria andQlmjNotBetween(Double value1, Double value2) {
            addCriterion("QLMJ not between", value1, value2, "qlmj");
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

        public Criteria andQlrlxEqualTo(BigDecimal value) {
            addCriterion("QLRLX =", value, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andQlrlxNotEqualTo(BigDecimal value) {
            addCriterion("QLRLX <>", value, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andQlrlxGreaterThan(BigDecimal value) {
            addCriterion("QLRLX >", value, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andQlrlxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QLRLX >=", value, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andQlrlxLessThan(BigDecimal value) {
            addCriterion("QLRLX <", value, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andQlrlxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QLRLX <=", value, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andQlrlxIn(List<BigDecimal> values) {
            addCriterion("QLRLX in", values, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andQlrlxNotIn(List<BigDecimal> values) {
            addCriterion("QLRLX not in", values, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andQlrlxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QLRLX between", value1, value2, "qlrlx");
            return (Criteria) this;
        }

        public Criteria andQlrlxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QLRLX not between", value1, value2, "qlrlx");
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

        public Criteria andBzIsNull() {
            addCriterion("BZ is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("BZ is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(Object value) {
            addCriterion("BZ =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(Object value) {
            addCriterion("BZ <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(Object value) {
            addCriterion("BZ >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(Object value) {
            addCriterion("BZ >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(Object value) {
            addCriterion("BZ <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(Object value) {
            addCriterion("BZ <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<Object> values) {
            addCriterion("BZ in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<Object> values) {
            addCriterion("BZ not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(Object value1, Object value2) {
            addCriterion("BZ between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(Object value1, Object value2) {
            addCriterion("BZ not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andGyfsIsNull() {
            addCriterion("GYFS is null");
            return (Criteria) this;
        }

        public Criteria andGyfsIsNotNull() {
            addCriterion("GYFS is not null");
            return (Criteria) this;
        }

        public Criteria andGyfsEqualTo(BigDecimal value) {
            addCriterion("GYFS =", value, "gyfs");
            return (Criteria) this;
        }

        public Criteria andGyfsNotEqualTo(BigDecimal value) {
            addCriterion("GYFS <>", value, "gyfs");
            return (Criteria) this;
        }

        public Criteria andGyfsGreaterThan(BigDecimal value) {
            addCriterion("GYFS >", value, "gyfs");
            return (Criteria) this;
        }

        public Criteria andGyfsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GYFS >=", value, "gyfs");
            return (Criteria) this;
        }

        public Criteria andGyfsLessThan(BigDecimal value) {
            addCriterion("GYFS <", value, "gyfs");
            return (Criteria) this;
        }

        public Criteria andGyfsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GYFS <=", value, "gyfs");
            return (Criteria) this;
        }

        public Criteria andGyfsIn(List<BigDecimal> values) {
            addCriterion("GYFS in", values, "gyfs");
            return (Criteria) this;
        }

        public Criteria andGyfsNotIn(List<BigDecimal> values) {
            addCriterion("GYFS not in", values, "gyfs");
            return (Criteria) this;
        }

        public Criteria andGyfsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GYFS between", value1, value2, "gyfs");
            return (Criteria) this;
        }

        public Criteria andGyfsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GYFS not between", value1, value2, "gyfs");
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

        public Criteria andGzdwIsNull() {
            addCriterion("GZDW is null");
            return (Criteria) this;
        }

        public Criteria andGzdwIsNotNull() {
            addCriterion("GZDW is not null");
            return (Criteria) this;
        }

        public Criteria andGzdwEqualTo(Object value) {
            addCriterion("GZDW =", value, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwNotEqualTo(Object value) {
            addCriterion("GZDW <>", value, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwGreaterThan(Object value) {
            addCriterion("GZDW >", value, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwGreaterThanOrEqualTo(Object value) {
            addCriterion("GZDW >=", value, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwLessThan(Object value) {
            addCriterion("GZDW <", value, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwLessThanOrEqualTo(Object value) {
            addCriterion("GZDW <=", value, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwIn(List<Object> values) {
            addCriterion("GZDW in", values, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwNotIn(List<Object> values) {
            addCriterion("GZDW not in", values, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwBetween(Object value1, Object value2) {
            addCriterion("GZDW between", value1, value2, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwNotBetween(Object value1, Object value2) {
            addCriterion("GZDW not between", value1, value2, "gzdw");
            return (Criteria) this;
        }

        public Criteria andHjszssIsNull() {
            addCriterion("HJSZSS is null");
            return (Criteria) this;
        }

        public Criteria andHjszssIsNotNull() {
            addCriterion("HJSZSS is not null");
            return (Criteria) this;
        }

        public Criteria andHjszssEqualTo(BigDecimal value) {
            addCriterion("HJSZSS =", value, "hjszss");
            return (Criteria) this;
        }

        public Criteria andHjszssNotEqualTo(BigDecimal value) {
            addCriterion("HJSZSS <>", value, "hjszss");
            return (Criteria) this;
        }

        public Criteria andHjszssGreaterThan(BigDecimal value) {
            addCriterion("HJSZSS >", value, "hjszss");
            return (Criteria) this;
        }

        public Criteria andHjszssGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HJSZSS >=", value, "hjszss");
            return (Criteria) this;
        }

        public Criteria andHjszssLessThan(BigDecimal value) {
            addCriterion("HJSZSS <", value, "hjszss");
            return (Criteria) this;
        }

        public Criteria andHjszssLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HJSZSS <=", value, "hjszss");
            return (Criteria) this;
        }

        public Criteria andHjszssIn(List<BigDecimal> values) {
            addCriterion("HJSZSS in", values, "hjszss");
            return (Criteria) this;
        }

        public Criteria andHjszssNotIn(List<BigDecimal> values) {
            addCriterion("HJSZSS not in", values, "hjszss");
            return (Criteria) this;
        }

        public Criteria andHjszssBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HJSZSS between", value1, value2, "hjszss");
            return (Criteria) this;
        }

        public Criteria andHjszssNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HJSZSS not between", value1, value2, "hjszss");
            return (Criteria) this;
        }

        public Criteria andGyqrdygxIsNull() {
            addCriterion("GYQRDYGX is null");
            return (Criteria) this;
        }

        public Criteria andGyqrdygxIsNotNull() {
            addCriterion("GYQRDYGX is not null");
            return (Criteria) this;
        }

        public Criteria andGyqrdygxEqualTo(BigDecimal value) {
            addCriterion("GYQRDYGX =", value, "gyqrdygx");
            return (Criteria) this;
        }

        public Criteria andGyqrdygxNotEqualTo(BigDecimal value) {
            addCriterion("GYQRDYGX <>", value, "gyqrdygx");
            return (Criteria) this;
        }

        public Criteria andGyqrdygxGreaterThan(BigDecimal value) {
            addCriterion("GYQRDYGX >", value, "gyqrdygx");
            return (Criteria) this;
        }

        public Criteria andGyqrdygxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GYQRDYGX >=", value, "gyqrdygx");
            return (Criteria) this;
        }

        public Criteria andGyqrdygxLessThan(BigDecimal value) {
            addCriterion("GYQRDYGX <", value, "gyqrdygx");
            return (Criteria) this;
        }

        public Criteria andGyqrdygxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GYQRDYGX <=", value, "gyqrdygx");
            return (Criteria) this;
        }

        public Criteria andGyqrdygxIn(List<BigDecimal> values) {
            addCriterion("GYQRDYGX in", values, "gyqrdygx");
            return (Criteria) this;
        }

        public Criteria andGyqrdygxNotIn(List<BigDecimal> values) {
            addCriterion("GYQRDYGX not in", values, "gyqrdygx");
            return (Criteria) this;
        }

        public Criteria andGyqrdygxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GYQRDYGX between", value1, value2, "gyqrdygx");
            return (Criteria) this;
        }

        public Criteria andGyqrdygxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GYQRDYGX not between", value1, value2, "gyqrdygx");
            return (Criteria) this;
        }

        public Criteria andQlrgxIsNull() {
            addCriterion("QLRGX is null");
            return (Criteria) this;
        }

        public Criteria andQlrgxIsNotNull() {
            addCriterion("QLRGX is not null");
            return (Criteria) this;
        }

        public Criteria andQlrgxEqualTo(BigDecimal value) {
            addCriterion("QLRGX =", value, "qlrgx");
            return (Criteria) this;
        }

        public Criteria andQlrgxNotEqualTo(BigDecimal value) {
            addCriterion("QLRGX <>", value, "qlrgx");
            return (Criteria) this;
        }

        public Criteria andQlrgxGreaterThan(BigDecimal value) {
            addCriterion("QLRGX >", value, "qlrgx");
            return (Criteria) this;
        }

        public Criteria andQlrgxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QLRGX >=", value, "qlrgx");
            return (Criteria) this;
        }

        public Criteria andQlrgxLessThan(BigDecimal value) {
            addCriterion("QLRGX <", value, "qlrgx");
            return (Criteria) this;
        }

        public Criteria andQlrgxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QLRGX <=", value, "qlrgx");
            return (Criteria) this;
        }

        public Criteria andQlrgxIn(List<BigDecimal> values) {
            addCriterion("QLRGX in", values, "qlrgx");
            return (Criteria) this;
        }

        public Criteria andQlrgxNotIn(List<BigDecimal> values) {
            addCriterion("QLRGX not in", values, "qlrgx");
            return (Criteria) this;
        }

        public Criteria andQlrgxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QLRGX between", value1, value2, "qlrgx");
            return (Criteria) this;
        }

        public Criteria andQlrgxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QLRGX not between", value1, value2, "qlrgx");
            return (Criteria) this;
        }

        public Criteria andSfztxIsNull() {
            addCriterion("SFZTX is null");
            return (Criteria) this;
        }

        public Criteria andSfztxIsNotNull() {
            addCriterion("SFZTX is not null");
            return (Criteria) this;
        }

        public Criteria andSfztxEqualTo(Object value) {
            addCriterion("SFZTX =", value, "sfztx");
            return (Criteria) this;
        }

        public Criteria andSfztxNotEqualTo(Object value) {
            addCriterion("SFZTX <>", value, "sfztx");
            return (Criteria) this;
        }

        public Criteria andSfztxGreaterThan(Object value) {
            addCriterion("SFZTX >", value, "sfztx");
            return (Criteria) this;
        }

        public Criteria andSfztxGreaterThanOrEqualTo(Object value) {
            addCriterion("SFZTX >=", value, "sfztx");
            return (Criteria) this;
        }

        public Criteria andSfztxLessThan(Object value) {
            addCriterion("SFZTX <", value, "sfztx");
            return (Criteria) this;
        }

        public Criteria andSfztxLessThanOrEqualTo(Object value) {
            addCriterion("SFZTX <=", value, "sfztx");
            return (Criteria) this;
        }

        public Criteria andSfztxIn(List<Object> values) {
            addCriterion("SFZTX in", values, "sfztx");
            return (Criteria) this;
        }

        public Criteria andSfztxNotIn(List<Object> values) {
            addCriterion("SFZTX not in", values, "sfztx");
            return (Criteria) this;
        }

        public Criteria andSfztxBetween(Object value1, Object value2) {
            addCriterion("SFZTX between", value1, value2, "sfztx");
            return (Criteria) this;
        }

        public Criteria andSfztxNotBetween(Object value1, Object value2) {
            addCriterion("SFZTX not between", value1, value2, "sfztx");
            return (Criteria) this;
        }

        public Criteria andRxtxIsNull() {
            addCriterion("RXTX is null");
            return (Criteria) this;
        }

        public Criteria andRxtxIsNotNull() {
            addCriterion("RXTX is not null");
            return (Criteria) this;
        }

        public Criteria andRxtxEqualTo(Object value) {
            addCriterion("RXTX =", value, "rxtx");
            return (Criteria) this;
        }

        public Criteria andRxtxNotEqualTo(Object value) {
            addCriterion("RXTX <>", value, "rxtx");
            return (Criteria) this;
        }

        public Criteria andRxtxGreaterThan(Object value) {
            addCriterion("RXTX >", value, "rxtx");
            return (Criteria) this;
        }

        public Criteria andRxtxGreaterThanOrEqualTo(Object value) {
            addCriterion("RXTX >=", value, "rxtx");
            return (Criteria) this;
        }

        public Criteria andRxtxLessThan(Object value) {
            addCriterion("RXTX <", value, "rxtx");
            return (Criteria) this;
        }

        public Criteria andRxtxLessThanOrEqualTo(Object value) {
            addCriterion("RXTX <=", value, "rxtx");
            return (Criteria) this;
        }

        public Criteria andRxtxIn(List<Object> values) {
            addCriterion("RXTX in", values, "rxtx");
            return (Criteria) this;
        }

        public Criteria andRxtxNotIn(List<Object> values) {
            addCriterion("RXTX not in", values, "rxtx");
            return (Criteria) this;
        }

        public Criteria andRxtxBetween(Object value1, Object value2) {
            addCriterion("RXTX between", value1, value2, "rxtx");
            return (Criteria) this;
        }

        public Criteria andRxtxNotBetween(Object value1, Object value2) {
            addCriterion("RXTX not between", value1, value2, "rxtx");
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

        public Criteria andDklbIsNull() {
            addCriterion("DKLB is null");
            return (Criteria) this;
        }

        public Criteria andDklbIsNotNull() {
            addCriterion("DKLB is not null");
            return (Criteria) this;
        }

        public Criteria andDklbEqualTo(Object value) {
            addCriterion("DKLB =", value, "dklb");
            return (Criteria) this;
        }

        public Criteria andDklbNotEqualTo(Object value) {
            addCriterion("DKLB <>", value, "dklb");
            return (Criteria) this;
        }

        public Criteria andDklbGreaterThan(Object value) {
            addCriterion("DKLB >", value, "dklb");
            return (Criteria) this;
        }

        public Criteria andDklbGreaterThanOrEqualTo(Object value) {
            addCriterion("DKLB >=", value, "dklb");
            return (Criteria) this;
        }

        public Criteria andDklbLessThan(Object value) {
            addCriterion("DKLB <", value, "dklb");
            return (Criteria) this;
        }

        public Criteria andDklbLessThanOrEqualTo(Object value) {
            addCriterion("DKLB <=", value, "dklb");
            return (Criteria) this;
        }

        public Criteria andDklbIn(List<Object> values) {
            addCriterion("DKLB in", values, "dklb");
            return (Criteria) this;
        }

        public Criteria andDklbNotIn(List<Object> values) {
            addCriterion("DKLB not in", values, "dklb");
            return (Criteria) this;
        }

        public Criteria andDklbBetween(Object value1, Object value2) {
            addCriterion("DKLB between", value1, value2, "dklb");
            return (Criteria) this;
        }

        public Criteria andDklbNotBetween(Object value1, Object value2) {
            addCriterion("DKLB not between", value1, value2, "dklb");
            return (Criteria) this;
        }

        public Criteria andZbIsNull() {
            addCriterion("ZB is null");
            return (Criteria) this;
        }

        public Criteria andZbIsNotNull() {
            addCriterion("ZB is not null");
            return (Criteria) this;
        }

        public Criteria andZbEqualTo(BigDecimal value) {
            addCriterion("ZB =", value, "zb");
            return (Criteria) this;
        }

        public Criteria andZbNotEqualTo(BigDecimal value) {
            addCriterion("ZB <>", value, "zb");
            return (Criteria) this;
        }

        public Criteria andZbGreaterThan(BigDecimal value) {
            addCriterion("ZB >", value, "zb");
            return (Criteria) this;
        }

        public Criteria andZbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZB >=", value, "zb");
            return (Criteria) this;
        }

        public Criteria andZbLessThan(BigDecimal value) {
            addCriterion("ZB <", value, "zb");
            return (Criteria) this;
        }

        public Criteria andZbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZB <=", value, "zb");
            return (Criteria) this;
        }

        public Criteria andZbIn(List<BigDecimal> values) {
            addCriterion("ZB in", values, "zb");
            return (Criteria) this;
        }

        public Criteria andZbNotIn(List<BigDecimal> values) {
            addCriterion("ZB not in", values, "zb");
            return (Criteria) this;
        }

        public Criteria andZbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZB between", value1, value2, "zb");
            return (Criteria) this;
        }

        public Criteria andZbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZB not between", value1, value2, "zb");
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

        public Criteria andQllxEqualTo(String value) {
            addCriterion("QLLX =", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxNotEqualTo(String value) {
            addCriterion("QLLX <>", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxGreaterThan(String value) {
            addCriterion("QLLX >", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxGreaterThanOrEqualTo(String value) {
            addCriterion("QLLX >=", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxLessThan(String value) {
            addCriterion("QLLX <", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxLessThanOrEqualTo(String value) {
            addCriterion("QLLX <=", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxLike(String value) {
            addCriterion("QLLX like", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxNotLike(String value) {
            addCriterion("QLLX not like", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxIn(List<String> values) {
            addCriterion("QLLX in", values, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxNotIn(List<String> values) {
            addCriterion("QLLX not in", values, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxBetween(String value1, String value2) {
            addCriterion("QLLX between", value1, value2, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxNotBetween(String value1, String value2) {
            addCriterion("QLLX not between", value1, value2, "qllx");
            return (Criteria) this;
        }

        public Criteria andYwhIsNull() {
            addCriterion("YWH is null");
            return (Criteria) this;
        }

        public Criteria andYwhIsNotNull() {
            addCriterion("YWH is not null");
            return (Criteria) this;
        }

        public Criteria andYwhEqualTo(String value) {
            addCriterion("YWH =", value, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhNotEqualTo(String value) {
            addCriterion("YWH <>", value, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhGreaterThan(String value) {
            addCriterion("YWH >", value, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhGreaterThanOrEqualTo(String value) {
            addCriterion("YWH >=", value, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhLessThan(String value) {
            addCriterion("YWH <", value, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhLessThanOrEqualTo(String value) {
            addCriterion("YWH <=", value, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhLike(String value) {
            addCriterion("YWH like", value, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhNotLike(String value) {
            addCriterion("YWH not like", value, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhIn(List<String> values) {
            addCriterion("YWH in", values, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhNotIn(List<String> values) {
            addCriterion("YWH not in", values, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhBetween(String value1, String value2) {
            addCriterion("YWH between", value1, value2, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhNotBetween(String value1, String value2) {
            addCriterion("YWH not between", value1, value2, "ywh");
            return (Criteria) this;
        }

        public Criteria andQsztIsNull() {
            addCriterion("QSZT is null");
            return (Criteria) this;
        }

        public Criteria andQsztIsNotNull() {
            addCriterion("QSZT is not null");
            return (Criteria) this;
        }

        public Criteria andQsztEqualTo(String value) {
            addCriterion("QSZT =", value, "qszt");
            return (Criteria) this;
        }

        public Criteria andQsztNotEqualTo(String value) {
            addCriterion("QSZT <>", value, "qszt");
            return (Criteria) this;
        }

        public Criteria andQsztGreaterThan(String value) {
            addCriterion("QSZT >", value, "qszt");
            return (Criteria) this;
        }

        public Criteria andQsztGreaterThanOrEqualTo(String value) {
            addCriterion("QSZT >=", value, "qszt");
            return (Criteria) this;
        }

        public Criteria andQsztLessThan(String value) {
            addCriterion("QSZT <", value, "qszt");
            return (Criteria) this;
        }

        public Criteria andQsztLessThanOrEqualTo(String value) {
            addCriterion("QSZT <=", value, "qszt");
            return (Criteria) this;
        }

        public Criteria andQsztLike(String value) {
            addCriterion("QSZT like", value, "qszt");
            return (Criteria) this;
        }

        public Criteria andQsztNotLike(String value) {
            addCriterion("QSZT not like", value, "qszt");
            return (Criteria) this;
        }

        public Criteria andQsztIn(List<String> values) {
            addCriterion("QSZT in", values, "qszt");
            return (Criteria) this;
        }

        public Criteria andQsztNotIn(List<String> values) {
            addCriterion("QSZT not in", values, "qszt");
            return (Criteria) this;
        }

        public Criteria andQsztBetween(String value1, String value2) {
            addCriterion("QSZT between", value1, value2, "qszt");
            return (Criteria) this;
        }

        public Criteria andQsztNotBetween(String value1, String value2) {
            addCriterion("QSZT not between", value1, value2, "qszt");
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
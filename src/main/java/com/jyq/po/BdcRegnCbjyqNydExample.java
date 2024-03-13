package com.jyq.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BdcRegnCbjyqNydExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BdcRegnCbjyqNydExample() {
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

        public Criteria andDjkidIsNull() {
            addCriterion("DJKID is null");
            return (Criteria) this;
        }

        public Criteria andDjkidIsNotNull() {
            addCriterion("DJKID is not null");
            return (Criteria) this;
        }

        public Criteria andDjkidEqualTo(Object value) {
            addCriterion("DJKID =", value, "djkid");
            return (Criteria) this;
        }

        public Criteria andDjkidNotEqualTo(Object value) {
            addCriterion("DJKID <>", value, "djkid");
            return (Criteria) this;
        }

        public Criteria andDjkidGreaterThan(Object value) {
            addCriterion("DJKID >", value, "djkid");
            return (Criteria) this;
        }

        public Criteria andDjkidGreaterThanOrEqualTo(Object value) {
            addCriterion("DJKID >=", value, "djkid");
            return (Criteria) this;
        }

        public Criteria andDjkidLessThan(Object value) {
            addCriterion("DJKID <", value, "djkid");
            return (Criteria) this;
        }

        public Criteria andDjkidLessThanOrEqualTo(Object value) {
            addCriterion("DJKID <=", value, "djkid");
            return (Criteria) this;
        }

        public Criteria andDjkidIn(List<Object> values) {
            addCriterion("DJKID in", values, "djkid");
            return (Criteria) this;
        }

        public Criteria andDjkidNotIn(List<Object> values) {
            addCriterion("DJKID not in", values, "djkid");
            return (Criteria) this;
        }

        public Criteria andDjkidBetween(Object value1, Object value2) {
            addCriterion("DJKID between", value1, value2, "djkid");
            return (Criteria) this;
        }

        public Criteria andDjkidNotBetween(Object value1, Object value2) {
            addCriterion("DJKID not between", value1, value2, "djkid");
            return (Criteria) this;
        }

        public Criteria andOidIsNull() {
            addCriterion("OID is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("OID is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(BigDecimal value) {
            addCriterion("OID =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(BigDecimal value) {
            addCriterion("OID <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(BigDecimal value) {
            addCriterion("OID >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OID >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(BigDecimal value) {
            addCriterion("OID <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OID <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<BigDecimal> values) {
            addCriterion("OID in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<BigDecimal> values) {
            addCriterion("OID not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OID between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OID not between", value1, value2, "oid");
            return (Criteria) this;
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

        public Criteria andZlIsNull() {
            addCriterion("ZL is null");
            return (Criteria) this;
        }

        public Criteria andZlIsNotNull() {
            addCriterion("ZL is not null");
            return (Criteria) this;
        }

        public Criteria andZlEqualTo(Object value) {
            addCriterion("ZL =", value, "zl");
            return (Criteria) this;
        }

        public Criteria andZlNotEqualTo(Object value) {
            addCriterion("ZL <>", value, "zl");
            return (Criteria) this;
        }

        public Criteria andZlGreaterThan(Object value) {
            addCriterion("ZL >", value, "zl");
            return (Criteria) this;
        }

        public Criteria andZlGreaterThanOrEqualTo(Object value) {
            addCriterion("ZL >=", value, "zl");
            return (Criteria) this;
        }

        public Criteria andZlLessThan(Object value) {
            addCriterion("ZL <", value, "zl");
            return (Criteria) this;
        }

        public Criteria andZlLessThanOrEqualTo(Object value) {
            addCriterion("ZL <=", value, "zl");
            return (Criteria) this;
        }

        public Criteria andZlIn(List<Object> values) {
            addCriterion("ZL in", values, "zl");
            return (Criteria) this;
        }

        public Criteria andZlNotIn(List<Object> values) {
            addCriterion("ZL not in", values, "zl");
            return (Criteria) this;
        }

        public Criteria andZlBetween(Object value1, Object value2) {
            addCriterion("ZL between", value1, value2, "zl");
            return (Criteria) this;
        }

        public Criteria andZlNotBetween(Object value1, Object value2) {
            addCriterion("ZL not between", value1, value2, "zl");
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

        public Criteria andQllxEqualTo(Object value) {
            addCriterion("QLLX =", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxNotEqualTo(Object value) {
            addCriterion("QLLX <>", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxGreaterThan(Object value) {
            addCriterion("QLLX >", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxGreaterThanOrEqualTo(Object value) {
            addCriterion("QLLX >=", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxLessThan(Object value) {
            addCriterion("QLLX <", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxLessThanOrEqualTo(Object value) {
            addCriterion("QLLX <=", value, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxIn(List<Object> values) {
            addCriterion("QLLX in", values, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxNotIn(List<Object> values) {
            addCriterion("QLLX not in", values, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxBetween(Object value1, Object value2) {
            addCriterion("QLLX between", value1, value2, "qllx");
            return (Criteria) this;
        }

        public Criteria andQllxNotBetween(Object value1, Object value2) {
            addCriterion("QLLX not between", value1, value2, "qllx");
            return (Criteria) this;
        }

        public Criteria andYslhIsNull() {
            addCriterion("YSLH is null");
            return (Criteria) this;
        }

        public Criteria andYslhIsNotNull() {
            addCriterion("YSLH is not null");
            return (Criteria) this;
        }

        public Criteria andYslhEqualTo(String value) {
            addCriterion("YSLH =", value, "yslh");
            return (Criteria) this;
        }

        public Criteria andYslhNotEqualTo(String value) {
            addCriterion("YSLH <>", value, "yslh");
            return (Criteria) this;
        }

        public Criteria andYslhGreaterThan(String value) {
            addCriterion("YSLH >", value, "yslh");
            return (Criteria) this;
        }

        public Criteria andYslhGreaterThanOrEqualTo(String value) {
            addCriterion("YSLH >=", value, "yslh");
            return (Criteria) this;
        }

        public Criteria andYslhLessThan(String value) {
            addCriterion("YSLH <", value, "yslh");
            return (Criteria) this;
        }

        public Criteria andYslhLessThanOrEqualTo(String value) {
            addCriterion("YSLH <=", value, "yslh");
            return (Criteria) this;
        }

        public Criteria andYslhLike(String value) {
            addCriterion("YSLH like", value, "yslh");
            return (Criteria) this;
        }

        public Criteria andYslhNotLike(String value) {
            addCriterion("YSLH not like", value, "yslh");
            return (Criteria) this;
        }

        public Criteria andYslhIn(List<String> values) {
            addCriterion("YSLH in", values, "yslh");
            return (Criteria) this;
        }

        public Criteria andYslhNotIn(List<String> values) {
            addCriterion("YSLH not in", values, "yslh");
            return (Criteria) this;
        }

        public Criteria andYslhBetween(String value1, String value2) {
            addCriterion("YSLH between", value1, value2, "yslh");
            return (Criteria) this;
        }

        public Criteria andYslhNotBetween(String value1, String value2) {
            addCriterion("YSLH not between", value1, value2, "yslh");
            return (Criteria) this;
        }

        public Criteria andDjxlIsNull() {
            addCriterion("DJXL is null");
            return (Criteria) this;
        }

        public Criteria andDjxlIsNotNull() {
            addCriterion("DJXL is not null");
            return (Criteria) this;
        }

        public Criteria andDjxlEqualTo(Object value) {
            addCriterion("DJXL =", value, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlNotEqualTo(Object value) {
            addCriterion("DJXL <>", value, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlGreaterThan(Object value) {
            addCriterion("DJXL >", value, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlGreaterThanOrEqualTo(Object value) {
            addCriterion("DJXL >=", value, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlLessThan(Object value) {
            addCriterion("DJXL <", value, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlLessThanOrEqualTo(Object value) {
            addCriterion("DJXL <=", value, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlIn(List<Object> values) {
            addCriterion("DJXL in", values, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlNotIn(List<Object> values) {
            addCriterion("DJXL not in", values, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlBetween(Object value1, Object value2) {
            addCriterion("DJXL between", value1, value2, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjxlNotBetween(Object value1, Object value2) {
            addCriterion("DJXL not between", value1, value2, "djxl");
            return (Criteria) this;
        }

        public Criteria andDjbztIsNull() {
            addCriterion("DJBZT is null");
            return (Criteria) this;
        }

        public Criteria andDjbztIsNotNull() {
            addCriterion("DJBZT is not null");
            return (Criteria) this;
        }

        public Criteria andDjbztEqualTo(Object value) {
            addCriterion("DJBZT =", value, "djbzt");
            return (Criteria) this;
        }

        public Criteria andDjbztNotEqualTo(Object value) {
            addCriterion("DJBZT <>", value, "djbzt");
            return (Criteria) this;
        }

        public Criteria andDjbztGreaterThan(Object value) {
            addCriterion("DJBZT >", value, "djbzt");
            return (Criteria) this;
        }

        public Criteria andDjbztGreaterThanOrEqualTo(Object value) {
            addCriterion("DJBZT >=", value, "djbzt");
            return (Criteria) this;
        }

        public Criteria andDjbztLessThan(Object value) {
            addCriterion("DJBZT <", value, "djbzt");
            return (Criteria) this;
        }

        public Criteria andDjbztLessThanOrEqualTo(Object value) {
            addCriterion("DJBZT <=", value, "djbzt");
            return (Criteria) this;
        }

        public Criteria andDjbztIn(List<Object> values) {
            addCriterion("DJBZT in", values, "djbzt");
            return (Criteria) this;
        }

        public Criteria andDjbztNotIn(List<Object> values) {
            addCriterion("DJBZT not in", values, "djbzt");
            return (Criteria) this;
        }

        public Criteria andDjbztBetween(Object value1, Object value2) {
            addCriterion("DJBZT between", value1, value2, "djbzt");
            return (Criteria) this;
        }

        public Criteria andDjbztNotBetween(Object value1, Object value2) {
            addCriterion("DJBZT not between", value1, value2, "djbzt");
            return (Criteria) this;
        }

        public Criteria andDjjgIsNull() {
            addCriterion("DJJG is null");
            return (Criteria) this;
        }

        public Criteria andDjjgIsNotNull() {
            addCriterion("DJJG is not null");
            return (Criteria) this;
        }

        public Criteria andDjjgEqualTo(Object value) {
            addCriterion("DJJG =", value, "djjg");
            return (Criteria) this;
        }

        public Criteria andDjjgNotEqualTo(Object value) {
            addCriterion("DJJG <>", value, "djjg");
            return (Criteria) this;
        }

        public Criteria andDjjgGreaterThan(Object value) {
            addCriterion("DJJG >", value, "djjg");
            return (Criteria) this;
        }

        public Criteria andDjjgGreaterThanOrEqualTo(Object value) {
            addCriterion("DJJG >=", value, "djjg");
            return (Criteria) this;
        }

        public Criteria andDjjgLessThan(Object value) {
            addCriterion("DJJG <", value, "djjg");
            return (Criteria) this;
        }

        public Criteria andDjjgLessThanOrEqualTo(Object value) {
            addCriterion("DJJG <=", value, "djjg");
            return (Criteria) this;
        }

        public Criteria andDjjgIn(List<Object> values) {
            addCriterion("DJJG in", values, "djjg");
            return (Criteria) this;
        }

        public Criteria andDjjgNotIn(List<Object> values) {
            addCriterion("DJJG not in", values, "djjg");
            return (Criteria) this;
        }

        public Criteria andDjjgBetween(Object value1, Object value2) {
            addCriterion("DJJG between", value1, value2, "djjg");
            return (Criteria) this;
        }

        public Criteria andDjjgNotBetween(Object value1, Object value2) {
            addCriterion("DJJG not between", value1, value2, "djjg");
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

        public Criteria andBdclxEqualTo(BigDecimal value) {
            addCriterion("BDCLX =", value, "bdclx");
            return (Criteria) this;
        }

        public Criteria andBdclxNotEqualTo(BigDecimal value) {
            addCriterion("BDCLX <>", value, "bdclx");
            return (Criteria) this;
        }

        public Criteria andBdclxGreaterThan(BigDecimal value) {
            addCriterion("BDCLX >", value, "bdclx");
            return (Criteria) this;
        }

        public Criteria andBdclxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BDCLX >=", value, "bdclx");
            return (Criteria) this;
        }

        public Criteria andBdclxLessThan(BigDecimal value) {
            addCriterion("BDCLX <", value, "bdclx");
            return (Criteria) this;
        }

        public Criteria andBdclxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BDCLX <=", value, "bdclx");
            return (Criteria) this;
        }

        public Criteria andBdclxIn(List<BigDecimal> values) {
            addCriterion("BDCLX in", values, "bdclx");
            return (Criteria) this;
        }

        public Criteria andBdclxNotIn(List<BigDecimal> values) {
            addCriterion("BDCLX not in", values, "bdclx");
            return (Criteria) this;
        }

        public Criteria andBdclxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BDCLX between", value1, value2, "bdclx");
            return (Criteria) this;
        }

        public Criteria andBdclxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BDCLX not between", value1, value2, "bdclx");
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

        public Criteria andTdytIsNull() {
            addCriterion("TDYT is null");
            return (Criteria) this;
        }

        public Criteria andTdytIsNotNull() {
            addCriterion("TDYT is not null");
            return (Criteria) this;
        }

        public Criteria andTdytEqualTo(String value) {
            addCriterion("TDYT =", value, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytNotEqualTo(String value) {
            addCriterion("TDYT <>", value, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytGreaterThan(String value) {
            addCriterion("TDYT >", value, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytGreaterThanOrEqualTo(String value) {
            addCriterion("TDYT >=", value, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytLessThan(String value) {
            addCriterion("TDYT <", value, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytLessThanOrEqualTo(String value) {
            addCriterion("TDYT <=", value, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytLike(String value) {
            addCriterion("TDYT like", value, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytNotLike(String value) {
            addCriterion("TDYT not like", value, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytIn(List<String> values) {
            addCriterion("TDYT in", values, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytNotIn(List<String> values) {
            addCriterion("TDYT not in", values, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytBetween(String value1, String value2) {
            addCriterion("TDYT between", value1, value2, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytNotBetween(String value1, String value2) {
            addCriterion("TDYT not between", value1, value2, "tdyt");
            return (Criteria) this;
        }

        public Criteria andYdyhflIsNull() {
            addCriterion("YDYHFL is null");
            return (Criteria) this;
        }

        public Criteria andYdyhflIsNotNull() {
            addCriterion("YDYHFL is not null");
            return (Criteria) this;
        }

        public Criteria andYdyhflEqualTo(String value) {
            addCriterion("YDYHFL =", value, "ydyhfl");
            return (Criteria) this;
        }

        public Criteria andYdyhflNotEqualTo(String value) {
            addCriterion("YDYHFL <>", value, "ydyhfl");
            return (Criteria) this;
        }

        public Criteria andYdyhflGreaterThan(String value) {
            addCriterion("YDYHFL >", value, "ydyhfl");
            return (Criteria) this;
        }

        public Criteria andYdyhflGreaterThanOrEqualTo(String value) {
            addCriterion("YDYHFL >=", value, "ydyhfl");
            return (Criteria) this;
        }

        public Criteria andYdyhflLessThan(String value) {
            addCriterion("YDYHFL <", value, "ydyhfl");
            return (Criteria) this;
        }

        public Criteria andYdyhflLessThanOrEqualTo(String value) {
            addCriterion("YDYHFL <=", value, "ydyhfl");
            return (Criteria) this;
        }

        public Criteria andYdyhflLike(String value) {
            addCriterion("YDYHFL like", value, "ydyhfl");
            return (Criteria) this;
        }

        public Criteria andYdyhflNotLike(String value) {
            addCriterion("YDYHFL not like", value, "ydyhfl");
            return (Criteria) this;
        }

        public Criteria andYdyhflIn(List<String> values) {
            addCriterion("YDYHFL in", values, "ydyhfl");
            return (Criteria) this;
        }

        public Criteria andYdyhflNotIn(List<String> values) {
            addCriterion("YDYHFL not in", values, "ydyhfl");
            return (Criteria) this;
        }

        public Criteria andYdyhflBetween(String value1, String value2) {
            addCriterion("YDYHFL between", value1, value2, "ydyhfl");
            return (Criteria) this;
        }

        public Criteria andYdyhflNotBetween(String value1, String value2) {
            addCriterion("YDYHFL not between", value1, value2, "ydyhfl");
            return (Criteria) this;
        }

        public Criteria andYzshIsNull() {
            addCriterion("YZSH is null");
            return (Criteria) this;
        }

        public Criteria andYzshIsNotNull() {
            addCriterion("YZSH is not null");
            return (Criteria) this;
        }

        public Criteria andYzshEqualTo(Object value) {
            addCriterion("YZSH =", value, "yzsh");
            return (Criteria) this;
        }

        public Criteria andYzshNotEqualTo(Object value) {
            addCriterion("YZSH <>", value, "yzsh");
            return (Criteria) this;
        }

        public Criteria andYzshGreaterThan(Object value) {
            addCriterion("YZSH >", value, "yzsh");
            return (Criteria) this;
        }

        public Criteria andYzshGreaterThanOrEqualTo(Object value) {
            addCriterion("YZSH >=", value, "yzsh");
            return (Criteria) this;
        }

        public Criteria andYzshLessThan(Object value) {
            addCriterion("YZSH <", value, "yzsh");
            return (Criteria) this;
        }

        public Criteria andYzshLessThanOrEqualTo(Object value) {
            addCriterion("YZSH <=", value, "yzsh");
            return (Criteria) this;
        }

        public Criteria andYzshIn(List<Object> values) {
            addCriterion("YZSH in", values, "yzsh");
            return (Criteria) this;
        }

        public Criteria andYzshNotIn(List<Object> values) {
            addCriterion("YZSH not in", values, "yzsh");
            return (Criteria) this;
        }

        public Criteria andYzshBetween(Object value1, Object value2) {
            addCriterion("YZSH between", value1, value2, "yzsh");
            return (Criteria) this;
        }

        public Criteria andYzshNotBetween(Object value1, Object value2) {
            addCriterion("YZSH not between", value1, value2, "yzsh");
            return (Criteria) this;
        }

        public Criteria andQlxzIsNull() {
            addCriterion("QLXZ is null");
            return (Criteria) this;
        }

        public Criteria andQlxzIsNotNull() {
            addCriterion("QLXZ is not null");
            return (Criteria) this;
        }

        public Criteria andQlxzEqualTo(Object value) {
            addCriterion("QLXZ =", value, "qlxz");
            return (Criteria) this;
        }

        public Criteria andQlxzNotEqualTo(Object value) {
            addCriterion("QLXZ <>", value, "qlxz");
            return (Criteria) this;
        }

        public Criteria andQlxzGreaterThan(Object value) {
            addCriterion("QLXZ >", value, "qlxz");
            return (Criteria) this;
        }

        public Criteria andQlxzGreaterThanOrEqualTo(Object value) {
            addCriterion("QLXZ >=", value, "qlxz");
            return (Criteria) this;
        }

        public Criteria andQlxzLessThan(Object value) {
            addCriterion("QLXZ <", value, "qlxz");
            return (Criteria) this;
        }

        public Criteria andQlxzLessThanOrEqualTo(Object value) {
            addCriterion("QLXZ <=", value, "qlxz");
            return (Criteria) this;
        }

        public Criteria andQlxzIn(List<Object> values) {
            addCriterion("QLXZ in", values, "qlxz");
            return (Criteria) this;
        }

        public Criteria andQlxzNotIn(List<Object> values) {
            addCriterion("QLXZ not in", values, "qlxz");
            return (Criteria) this;
        }

        public Criteria andQlxzBetween(Object value1, Object value2) {
            addCriterion("QLXZ between", value1, value2, "qlxz");
            return (Criteria) this;
        }

        public Criteria andQlxzNotBetween(Object value1, Object value2) {
            addCriterion("QLXZ not between", value1, value2, "qlxz");
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

        public Criteria andQlrIsNull() {
            addCriterion("QLR is null");
            return (Criteria) this;
        }

        public Criteria andQlrIsNotNull() {
            addCriterion("QLR is not null");
            return (Criteria) this;
        }

        public Criteria andQlrEqualTo(Object value) {
            addCriterion("QLR =", value, "qlr");
            return (Criteria) this;
        }

        public Criteria andQlrNotEqualTo(Object value) {
            addCriterion("QLR <>", value, "qlr");
            return (Criteria) this;
        }

        public Criteria andQlrGreaterThan(Object value) {
            addCriterion("QLR >", value, "qlr");
            return (Criteria) this;
        }

        public Criteria andQlrGreaterThanOrEqualTo(Object value) {
            addCriterion("QLR >=", value, "qlr");
            return (Criteria) this;
        }

        public Criteria andQlrLessThan(Object value) {
            addCriterion("QLR <", value, "qlr");
            return (Criteria) this;
        }

        public Criteria andQlrLessThanOrEqualTo(Object value) {
            addCriterion("QLR <=", value, "qlr");
            return (Criteria) this;
        }

        public Criteria andQlrIn(List<Object> values) {
            addCriterion("QLR in", values, "qlr");
            return (Criteria) this;
        }

        public Criteria andQlrNotIn(List<Object> values) {
            addCriterion("QLR not in", values, "qlr");
            return (Criteria) this;
        }

        public Criteria andQlrBetween(Object value1, Object value2) {
            addCriterion("QLR between", value1, value2, "qlr");
            return (Criteria) this;
        }

        public Criteria andQlrNotBetween(Object value1, Object value2) {
            addCriterion("QLR not between", value1, value2, "qlr");
            return (Criteria) this;
        }

        public Criteria andQlrzjzlIsNull() {
            addCriterion("QLRZJZL is null");
            return (Criteria) this;
        }

        public Criteria andQlrzjzlIsNotNull() {
            addCriterion("QLRZJZL is not null");
            return (Criteria) this;
        }

        public Criteria andQlrzjzlEqualTo(BigDecimal value) {
            addCriterion("QLRZJZL =", value, "qlrzjzl");
            return (Criteria) this;
        }

        public Criteria andQlrzjzlNotEqualTo(BigDecimal value) {
            addCriterion("QLRZJZL <>", value, "qlrzjzl");
            return (Criteria) this;
        }

        public Criteria andQlrzjzlGreaterThan(BigDecimal value) {
            addCriterion("QLRZJZL >", value, "qlrzjzl");
            return (Criteria) this;
        }

        public Criteria andQlrzjzlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QLRZJZL >=", value, "qlrzjzl");
            return (Criteria) this;
        }

        public Criteria andQlrzjzlLessThan(BigDecimal value) {
            addCriterion("QLRZJZL <", value, "qlrzjzl");
            return (Criteria) this;
        }

        public Criteria andQlrzjzlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QLRZJZL <=", value, "qlrzjzl");
            return (Criteria) this;
        }

        public Criteria andQlrzjzlIn(List<BigDecimal> values) {
            addCriterion("QLRZJZL in", values, "qlrzjzl");
            return (Criteria) this;
        }

        public Criteria andQlrzjzlNotIn(List<BigDecimal> values) {
            addCriterion("QLRZJZL not in", values, "qlrzjzl");
            return (Criteria) this;
        }

        public Criteria andQlrzjzlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QLRZJZL between", value1, value2, "qlrzjzl");
            return (Criteria) this;
        }

        public Criteria andQlrzjzlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QLRZJZL not between", value1, value2, "qlrzjzl");
            return (Criteria) this;
        }

        public Criteria andQlrzjbhIsNull() {
            addCriterion("QLRZJBH is null");
            return (Criteria) this;
        }

        public Criteria andQlrzjbhIsNotNull() {
            addCriterion("QLRZJBH is not null");
            return (Criteria) this;
        }

        public Criteria andQlrzjbhEqualTo(Object value) {
            addCriterion("QLRZJBH =", value, "qlrzjbh");
            return (Criteria) this;
        }

        public Criteria andQlrzjbhNotEqualTo(Object value) {
            addCriterion("QLRZJBH <>", value, "qlrzjbh");
            return (Criteria) this;
        }

        public Criteria andQlrzjbhGreaterThan(Object value) {
            addCriterion("QLRZJBH >", value, "qlrzjbh");
            return (Criteria) this;
        }

        public Criteria andQlrzjbhGreaterThanOrEqualTo(Object value) {
            addCriterion("QLRZJBH >=", value, "qlrzjbh");
            return (Criteria) this;
        }

        public Criteria andQlrzjbhLessThan(Object value) {
            addCriterion("QLRZJBH <", value, "qlrzjbh");
            return (Criteria) this;
        }

        public Criteria andQlrzjbhLessThanOrEqualTo(Object value) {
            addCriterion("QLRZJBH <=", value, "qlrzjbh");
            return (Criteria) this;
        }

        public Criteria andQlrzjbhIn(List<Object> values) {
            addCriterion("QLRZJBH in", values, "qlrzjbh");
            return (Criteria) this;
        }

        public Criteria andQlrzjbhNotIn(List<Object> values) {
            addCriterion("QLRZJBH not in", values, "qlrzjbh");
            return (Criteria) this;
        }

        public Criteria andQlrzjbhBetween(Object value1, Object value2) {
            addCriterion("QLRZJBH between", value1, value2, "qlrzjbh");
            return (Criteria) this;
        }

        public Criteria andQlrzjbhNotBetween(Object value1, Object value2) {
            addCriterion("QLRZJBH not between", value1, value2, "qlrzjbh");
            return (Criteria) this;
        }

        public Criteria andDjlxIsNull() {
            addCriterion("DJLX is null");
            return (Criteria) this;
        }

        public Criteria andDjlxIsNotNull() {
            addCriterion("DJLX is not null");
            return (Criteria) this;
        }

        public Criteria andDjlxEqualTo(Object value) {
            addCriterion("DJLX =", value, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjlxNotEqualTo(Object value) {
            addCriterion("DJLX <>", value, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjlxGreaterThan(Object value) {
            addCriterion("DJLX >", value, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjlxGreaterThanOrEqualTo(Object value) {
            addCriterion("DJLX >=", value, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjlxLessThan(Object value) {
            addCriterion("DJLX <", value, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjlxLessThanOrEqualTo(Object value) {
            addCriterion("DJLX <=", value, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjlxIn(List<Object> values) {
            addCriterion("DJLX in", values, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjlxNotIn(List<Object> values) {
            addCriterion("DJLX not in", values, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjlxBetween(Object value1, Object value2) {
            addCriterion("DJLX between", value1, value2, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjlxNotBetween(Object value1, Object value2) {
            addCriterion("DJLX not between", value1, value2, "djlx");
            return (Criteria) this;
        }

        public Criteria andDjyyIsNull() {
            addCriterion("DJYY is null");
            return (Criteria) this;
        }

        public Criteria andDjyyIsNotNull() {
            addCriterion("DJYY is not null");
            return (Criteria) this;
        }

        public Criteria andDjyyEqualTo(Object value) {
            addCriterion("DJYY =", value, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyNotEqualTo(Object value) {
            addCriterion("DJYY <>", value, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyGreaterThan(Object value) {
            addCriterion("DJYY >", value, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyGreaterThanOrEqualTo(Object value) {
            addCriterion("DJYY >=", value, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyLessThan(Object value) {
            addCriterion("DJYY <", value, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyLessThanOrEqualTo(Object value) {
            addCriterion("DJYY <=", value, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyIn(List<Object> values) {
            addCriterion("DJYY in", values, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyNotIn(List<Object> values) {
            addCriterion("DJYY not in", values, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyBetween(Object value1, Object value2) {
            addCriterion("DJYY between", value1, value2, "djyy");
            return (Criteria) this;
        }

        public Criteria andDjyyNotBetween(Object value1, Object value2) {
            addCriterion("DJYY not between", value1, value2, "djyy");
            return (Criteria) this;
        }

        public Criteria andGyqkIsNull() {
            addCriterion("GYQK is null");
            return (Criteria) this;
        }

        public Criteria andGyqkIsNotNull() {
            addCriterion("GYQK is not null");
            return (Criteria) this;
        }

        public Criteria andGyqkEqualTo(Object value) {
            addCriterion("GYQK =", value, "gyqk");
            return (Criteria) this;
        }

        public Criteria andGyqkNotEqualTo(Object value) {
            addCriterion("GYQK <>", value, "gyqk");
            return (Criteria) this;
        }

        public Criteria andGyqkGreaterThan(Object value) {
            addCriterion("GYQK >", value, "gyqk");
            return (Criteria) this;
        }

        public Criteria andGyqkGreaterThanOrEqualTo(Object value) {
            addCriterion("GYQK >=", value, "gyqk");
            return (Criteria) this;
        }

        public Criteria andGyqkLessThan(Object value) {
            addCriterion("GYQK <", value, "gyqk");
            return (Criteria) this;
        }

        public Criteria andGyqkLessThanOrEqualTo(Object value) {
            addCriterion("GYQK <=", value, "gyqk");
            return (Criteria) this;
        }

        public Criteria andGyqkIn(List<Object> values) {
            addCriterion("GYQK in", values, "gyqk");
            return (Criteria) this;
        }

        public Criteria andGyqkNotIn(List<Object> values) {
            addCriterion("GYQK not in", values, "gyqk");
            return (Criteria) this;
        }

        public Criteria andGyqkBetween(Object value1, Object value2) {
            addCriterion("GYQK between", value1, value2, "gyqk");
            return (Criteria) this;
        }

        public Criteria andGyqkNotBetween(Object value1, Object value2) {
            addCriterion("GYQK not between", value1, value2, "gyqk");
            return (Criteria) this;
        }

        public Criteria andSyqxqIsNull() {
            addCriterion("SYQXQ is null");
            return (Criteria) this;
        }

        public Criteria andSyqxqIsNotNull() {
            addCriterion("SYQXQ is not null");
            return (Criteria) this;
        }

        public Criteria andSyqxqEqualTo(Date value) {
            addCriterionForJDBCDate("SYQXQ =", value, "syqxq");
            return (Criteria) this;
        }

        public Criteria andSyqxqNotEqualTo(Date value) {
            addCriterionForJDBCDate("SYQXQ <>", value, "syqxq");
            return (Criteria) this;
        }

        public Criteria andSyqxqGreaterThan(Date value) {
            addCriterionForJDBCDate("SYQXQ >", value, "syqxq");
            return (Criteria) this;
        }

        public Criteria andSyqxqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SYQXQ >=", value, "syqxq");
            return (Criteria) this;
        }

        public Criteria andSyqxqLessThan(Date value) {
            addCriterionForJDBCDate("SYQXQ <", value, "syqxq");
            return (Criteria) this;
        }

        public Criteria andSyqxqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SYQXQ <=", value, "syqxq");
            return (Criteria) this;
        }

        public Criteria andSyqxqIn(List<Date> values) {
            addCriterionForJDBCDate("SYQXQ in", values, "syqxq");
            return (Criteria) this;
        }

        public Criteria andSyqxqNotIn(List<Date> values) {
            addCriterionForJDBCDate("SYQXQ not in", values, "syqxq");
            return (Criteria) this;
        }

        public Criteria andSyqxqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SYQXQ between", value1, value2, "syqxq");
            return (Criteria) this;
        }

        public Criteria andSyqxqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SYQXQ not between", value1, value2, "syqxq");
            return (Criteria) this;
        }

        public Criteria andSyqxzIsNull() {
            addCriterion("SYQXZ is null");
            return (Criteria) this;
        }

        public Criteria andSyqxzIsNotNull() {
            addCriterion("SYQXZ is not null");
            return (Criteria) this;
        }

        public Criteria andSyqxzEqualTo(Date value) {
            addCriterionForJDBCDate("SYQXZ =", value, "syqxz");
            return (Criteria) this;
        }

        public Criteria andSyqxzNotEqualTo(Date value) {
            addCriterionForJDBCDate("SYQXZ <>", value, "syqxz");
            return (Criteria) this;
        }

        public Criteria andSyqxzGreaterThan(Date value) {
            addCriterionForJDBCDate("SYQXZ >", value, "syqxz");
            return (Criteria) this;
        }

        public Criteria andSyqxzGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SYQXZ >=", value, "syqxz");
            return (Criteria) this;
        }

        public Criteria andSyqxzLessThan(Date value) {
            addCriterionForJDBCDate("SYQXZ <", value, "syqxz");
            return (Criteria) this;
        }

        public Criteria andSyqxzLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SYQXZ <=", value, "syqxz");
            return (Criteria) this;
        }

        public Criteria andSyqxzIn(List<Date> values) {
            addCriterionForJDBCDate("SYQXZ in", values, "syqxz");
            return (Criteria) this;
        }

        public Criteria andSyqxzNotIn(List<Date> values) {
            addCriterionForJDBCDate("SYQXZ not in", values, "syqxz");
            return (Criteria) this;
        }

        public Criteria andSyqxzBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SYQXZ between", value1, value2, "syqxz");
            return (Criteria) this;
        }

        public Criteria andSyqxzNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SYQXZ not between", value1, value2, "syqxz");
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

        public Criteria andCbhtbmIsNull() {
            addCriterion("CBHTBM is null");
            return (Criteria) this;
        }

        public Criteria andCbhtbmIsNotNull() {
            addCriterion("CBHTBM is not null");
            return (Criteria) this;
        }

        public Criteria andCbhtbmEqualTo(String value) {
            addCriterion("CBHTBM =", value, "cbhtbm");
            return (Criteria) this;
        }

        public Criteria andCbhtbmNotEqualTo(String value) {
            addCriterion("CBHTBM <>", value, "cbhtbm");
            return (Criteria) this;
        }

        public Criteria andCbhtbmGreaterThan(String value) {
            addCriterion("CBHTBM >", value, "cbhtbm");
            return (Criteria) this;
        }

        public Criteria andCbhtbmGreaterThanOrEqualTo(String value) {
            addCriterion("CBHTBM >=", value, "cbhtbm");
            return (Criteria) this;
        }

        public Criteria andCbhtbmLessThan(String value) {
            addCriterion("CBHTBM <", value, "cbhtbm");
            return (Criteria) this;
        }

        public Criteria andCbhtbmLessThanOrEqualTo(String value) {
            addCriterion("CBHTBM <=", value, "cbhtbm");
            return (Criteria) this;
        }

        public Criteria andCbhtbmLike(String value) {
            addCriterion("CBHTBM like", value, "cbhtbm");
            return (Criteria) this;
        }

        public Criteria andCbhtbmNotLike(String value) {
            addCriterion("CBHTBM not like", value, "cbhtbm");
            return (Criteria) this;
        }

        public Criteria andCbhtbmIn(List<String> values) {
            addCriterion("CBHTBM in", values, "cbhtbm");
            return (Criteria) this;
        }

        public Criteria andCbhtbmNotIn(List<String> values) {
            addCriterion("CBHTBM not in", values, "cbhtbm");
            return (Criteria) this;
        }

        public Criteria andCbhtbmBetween(String value1, String value2) {
            addCriterion("CBHTBM between", value1, value2, "cbhtbm");
            return (Criteria) this;
        }

        public Criteria andCbhtbmNotBetween(String value1, String value2) {
            addCriterion("CBHTBM not between", value1, value2, "cbhtbm");
            return (Criteria) this;
        }

        public Criteria andCbfsIsNull() {
            addCriterion("CBFS is null");
            return (Criteria) this;
        }

        public Criteria andCbfsIsNotNull() {
            addCriterion("CBFS is not null");
            return (Criteria) this;
        }

        public Criteria andCbfsEqualTo(String value) {
            addCriterion("CBFS =", value, "cbfs");
            return (Criteria) this;
        }

        public Criteria andCbfsNotEqualTo(String value) {
            addCriterion("CBFS <>", value, "cbfs");
            return (Criteria) this;
        }

        public Criteria andCbfsGreaterThan(String value) {
            addCriterion("CBFS >", value, "cbfs");
            return (Criteria) this;
        }

        public Criteria andCbfsGreaterThanOrEqualTo(String value) {
            addCriterion("CBFS >=", value, "cbfs");
            return (Criteria) this;
        }

        public Criteria andCbfsLessThan(String value) {
            addCriterion("CBFS <", value, "cbfs");
            return (Criteria) this;
        }

        public Criteria andCbfsLessThanOrEqualTo(String value) {
            addCriterion("CBFS <=", value, "cbfs");
            return (Criteria) this;
        }

        public Criteria andCbfsLike(String value) {
            addCriterion("CBFS like", value, "cbfs");
            return (Criteria) this;
        }

        public Criteria andCbfsNotLike(String value) {
            addCriterion("CBFS not like", value, "cbfs");
            return (Criteria) this;
        }

        public Criteria andCbfsIn(List<String> values) {
            addCriterion("CBFS in", values, "cbfs");
            return (Criteria) this;
        }

        public Criteria andCbfsNotIn(List<String> values) {
            addCriterion("CBFS not in", values, "cbfs");
            return (Criteria) this;
        }

        public Criteria andCbfsBetween(String value1, String value2) {
            addCriterion("CBFS between", value1, value2, "cbfs");
            return (Criteria) this;
        }

        public Criteria andCbfsNotBetween(String value1, String value2) {
            addCriterion("CBFS not between", value1, value2, "cbfs");
            return (Criteria) this;
        }

        public Criteria andFbfIsNull() {
            addCriterion("FBF is null");
            return (Criteria) this;
        }

        public Criteria andFbfIsNotNull() {
            addCriterion("FBF is not null");
            return (Criteria) this;
        }

        public Criteria andFbfEqualTo(Object value) {
            addCriterion("FBF =", value, "fbf");
            return (Criteria) this;
        }

        public Criteria andFbfNotEqualTo(Object value) {
            addCriterion("FBF <>", value, "fbf");
            return (Criteria) this;
        }

        public Criteria andFbfGreaterThan(Object value) {
            addCriterion("FBF >", value, "fbf");
            return (Criteria) this;
        }

        public Criteria andFbfGreaterThanOrEqualTo(Object value) {
            addCriterion("FBF >=", value, "fbf");
            return (Criteria) this;
        }

        public Criteria andFbfLessThan(Object value) {
            addCriterion("FBF <", value, "fbf");
            return (Criteria) this;
        }

        public Criteria andFbfLessThanOrEqualTo(Object value) {
            addCriterion("FBF <=", value, "fbf");
            return (Criteria) this;
        }

        public Criteria andFbfIn(List<Object> values) {
            addCriterion("FBF in", values, "fbf");
            return (Criteria) this;
        }

        public Criteria andFbfNotIn(List<Object> values) {
            addCriterion("FBF not in", values, "fbf");
            return (Criteria) this;
        }

        public Criteria andFbfBetween(Object value1, Object value2) {
            addCriterion("FBF between", value1, value2, "fbf");
            return (Criteria) this;
        }

        public Criteria andFbfNotBetween(Object value1, Object value2) {
            addCriterion("FBF not between", value1, value2, "fbf");
            return (Criteria) this;
        }

        public Criteria andCbsyqmjIsNull() {
            addCriterion("CBSYQMJ is null");
            return (Criteria) this;
        }

        public Criteria andCbsyqmjIsNotNull() {
            addCriterion("CBSYQMJ is not null");
            return (Criteria) this;
        }

        public Criteria andCbsyqmjEqualTo(Double value) {
            addCriterion("CBSYQMJ =", value, "cbsyqmj");
            return (Criteria) this;
        }

        public Criteria andCbsyqmjNotEqualTo(Double value) {
            addCriterion("CBSYQMJ <>", value, "cbsyqmj");
            return (Criteria) this;
        }

        public Criteria andCbsyqmjGreaterThan(Double value) {
            addCriterion("CBSYQMJ >", value, "cbsyqmj");
            return (Criteria) this;
        }

        public Criteria andCbsyqmjGreaterThanOrEqualTo(Double value) {
            addCriterion("CBSYQMJ >=", value, "cbsyqmj");
            return (Criteria) this;
        }

        public Criteria andCbsyqmjLessThan(Double value) {
            addCriterion("CBSYQMJ <", value, "cbsyqmj");
            return (Criteria) this;
        }

        public Criteria andCbsyqmjLessThanOrEqualTo(Double value) {
            addCriterion("CBSYQMJ <=", value, "cbsyqmj");
            return (Criteria) this;
        }

        public Criteria andCbsyqmjIn(List<Double> values) {
            addCriterion("CBSYQMJ in", values, "cbsyqmj");
            return (Criteria) this;
        }

        public Criteria andCbsyqmjNotIn(List<Double> values) {
            addCriterion("CBSYQMJ not in", values, "cbsyqmj");
            return (Criteria) this;
        }

        public Criteria andCbsyqmjBetween(Double value1, Double value2) {
            addCriterion("CBSYQMJ between", value1, value2, "cbsyqmj");
            return (Criteria) this;
        }

        public Criteria andCbsyqmjNotBetween(Double value1, Double value2) {
            addCriterion("CBSYQMJ not between", value1, value2, "cbsyqmj");
            return (Criteria) this;
        }

        public Criteria andFbfdmIsNull() {
            addCriterion("FBFDM is null");
            return (Criteria) this;
        }

        public Criteria andFbfdmIsNotNull() {
            addCriterion("FBFDM is not null");
            return (Criteria) this;
        }

        public Criteria andFbfdmEqualTo(String value) {
            addCriterion("FBFDM =", value, "fbfdm");
            return (Criteria) this;
        }

        public Criteria andFbfdmNotEqualTo(String value) {
            addCriterion("FBFDM <>", value, "fbfdm");
            return (Criteria) this;
        }

        public Criteria andFbfdmGreaterThan(String value) {
            addCriterion("FBFDM >", value, "fbfdm");
            return (Criteria) this;
        }

        public Criteria andFbfdmGreaterThanOrEqualTo(String value) {
            addCriterion("FBFDM >=", value, "fbfdm");
            return (Criteria) this;
        }

        public Criteria andFbfdmLessThan(String value) {
            addCriterion("FBFDM <", value, "fbfdm");
            return (Criteria) this;
        }

        public Criteria andFbfdmLessThanOrEqualTo(String value) {
            addCriterion("FBFDM <=", value, "fbfdm");
            return (Criteria) this;
        }

        public Criteria andFbfdmLike(String value) {
            addCriterion("FBFDM like", value, "fbfdm");
            return (Criteria) this;
        }

        public Criteria andFbfdmNotLike(String value) {
            addCriterion("FBFDM not like", value, "fbfdm");
            return (Criteria) this;
        }

        public Criteria andFbfdmIn(List<String> values) {
            addCriterion("FBFDM in", values, "fbfdm");
            return (Criteria) this;
        }

        public Criteria andFbfdmNotIn(List<String> values) {
            addCriterion("FBFDM not in", values, "fbfdm");
            return (Criteria) this;
        }

        public Criteria andFbfdmBetween(String value1, String value2) {
            addCriterion("FBFDM between", value1, value2, "fbfdm");
            return (Criteria) this;
        }

        public Criteria andFbfdmNotBetween(String value1, String value2) {
            addCriterion("FBFDM not between", value1, value2, "fbfdm");
            return (Criteria) this;
        }

        public Criteria andFbffzrIsNull() {
            addCriterion("FBFFZR is null");
            return (Criteria) this;
        }

        public Criteria andFbffzrIsNotNull() {
            addCriterion("FBFFZR is not null");
            return (Criteria) this;
        }

        public Criteria andFbffzrEqualTo(String value) {
            addCriterion("FBFFZR =", value, "fbffzr");
            return (Criteria) this;
        }

        public Criteria andFbffzrNotEqualTo(String value) {
            addCriterion("FBFFZR <>", value, "fbffzr");
            return (Criteria) this;
        }

        public Criteria andFbffzrGreaterThan(String value) {
            addCriterion("FBFFZR >", value, "fbffzr");
            return (Criteria) this;
        }

        public Criteria andFbffzrGreaterThanOrEqualTo(String value) {
            addCriterion("FBFFZR >=", value, "fbffzr");
            return (Criteria) this;
        }

        public Criteria andFbffzrLessThan(String value) {
            addCriterion("FBFFZR <", value, "fbffzr");
            return (Criteria) this;
        }

        public Criteria andFbffzrLessThanOrEqualTo(String value) {
            addCriterion("FBFFZR <=", value, "fbffzr");
            return (Criteria) this;
        }

        public Criteria andFbffzrLike(String value) {
            addCriterion("FBFFZR like", value, "fbffzr");
            return (Criteria) this;
        }

        public Criteria andFbffzrNotLike(String value) {
            addCriterion("FBFFZR not like", value, "fbffzr");
            return (Criteria) this;
        }

        public Criteria andFbffzrIn(List<String> values) {
            addCriterion("FBFFZR in", values, "fbffzr");
            return (Criteria) this;
        }

        public Criteria andFbffzrNotIn(List<String> values) {
            addCriterion("FBFFZR not in", values, "fbffzr");
            return (Criteria) this;
        }

        public Criteria andFbffzrBetween(String value1, String value2) {
            addCriterion("FBFFZR between", value1, value2, "fbffzr");
            return (Criteria) this;
        }

        public Criteria andFbffzrNotBetween(String value1, String value2) {
            addCriterion("FBFFZR not between", value1, value2, "fbffzr");
            return (Criteria) this;
        }

        public Criteria andCbfdmIsNull() {
            addCriterion("CBFDM is null");
            return (Criteria) this;
        }

        public Criteria andCbfdmIsNotNull() {
            addCriterion("CBFDM is not null");
            return (Criteria) this;
        }

        public Criteria andCbfdmEqualTo(String value) {
            addCriterion("CBFDM =", value, "cbfdm");
            return (Criteria) this;
        }

        public Criteria andCbfdmNotEqualTo(String value) {
            addCriterion("CBFDM <>", value, "cbfdm");
            return (Criteria) this;
        }

        public Criteria andCbfdmGreaterThan(String value) {
            addCriterion("CBFDM >", value, "cbfdm");
            return (Criteria) this;
        }

        public Criteria andCbfdmGreaterThanOrEqualTo(String value) {
            addCriterion("CBFDM >=", value, "cbfdm");
            return (Criteria) this;
        }

        public Criteria andCbfdmLessThan(String value) {
            addCriterion("CBFDM <", value, "cbfdm");
            return (Criteria) this;
        }

        public Criteria andCbfdmLessThanOrEqualTo(String value) {
            addCriterion("CBFDM <=", value, "cbfdm");
            return (Criteria) this;
        }

        public Criteria andCbfdmLike(String value) {
            addCriterion("CBFDM like", value, "cbfdm");
            return (Criteria) this;
        }

        public Criteria andCbfdmNotLike(String value) {
            addCriterion("CBFDM not like", value, "cbfdm");
            return (Criteria) this;
        }

        public Criteria andCbfdmIn(List<String> values) {
            addCriterion("CBFDM in", values, "cbfdm");
            return (Criteria) this;
        }

        public Criteria andCbfdmNotIn(List<String> values) {
            addCriterion("CBFDM not in", values, "cbfdm");
            return (Criteria) this;
        }

        public Criteria andCbfdmBetween(String value1, String value2) {
            addCriterion("CBFDM between", value1, value2, "cbfdm");
            return (Criteria) this;
        }

        public Criteria andCbfdmNotBetween(String value1, String value2) {
            addCriterion("CBFDM not between", value1, value2, "cbfdm");
            return (Criteria) this;
        }

        public Criteria andCbfdbIsNull() {
            addCriterion("CBFDB is null");
            return (Criteria) this;
        }

        public Criteria andCbfdbIsNotNull() {
            addCriterion("CBFDB is not null");
            return (Criteria) this;
        }

        public Criteria andCbfdbEqualTo(String value) {
            addCriterion("CBFDB =", value, "cbfdb");
            return (Criteria) this;
        }

        public Criteria andCbfdbNotEqualTo(String value) {
            addCriterion("CBFDB <>", value, "cbfdb");
            return (Criteria) this;
        }

        public Criteria andCbfdbGreaterThan(String value) {
            addCriterion("CBFDB >", value, "cbfdb");
            return (Criteria) this;
        }

        public Criteria andCbfdbGreaterThanOrEqualTo(String value) {
            addCriterion("CBFDB >=", value, "cbfdb");
            return (Criteria) this;
        }

        public Criteria andCbfdbLessThan(String value) {
            addCriterion("CBFDB <", value, "cbfdb");
            return (Criteria) this;
        }

        public Criteria andCbfdbLessThanOrEqualTo(String value) {
            addCriterion("CBFDB <=", value, "cbfdb");
            return (Criteria) this;
        }

        public Criteria andCbfdbLike(String value) {
            addCriterion("CBFDB like", value, "cbfdb");
            return (Criteria) this;
        }

        public Criteria andCbfdbNotLike(String value) {
            addCriterion("CBFDB not like", value, "cbfdb");
            return (Criteria) this;
        }

        public Criteria andCbfdbIn(List<String> values) {
            addCriterion("CBFDB in", values, "cbfdb");
            return (Criteria) this;
        }

        public Criteria andCbfdbNotIn(List<String> values) {
            addCriterion("CBFDB not in", values, "cbfdb");
            return (Criteria) this;
        }

        public Criteria andCbfdbBetween(String value1, String value2) {
            addCriterion("CBFDB between", value1, value2, "cbfdb");
            return (Criteria) this;
        }

        public Criteria andCbfdbNotBetween(String value1, String value2) {
            addCriterion("CBFDB not between", value1, value2, "cbfdb");
            return (Criteria) this;
        }

        public Criteria andCbfsfzhIsNull() {
            addCriterion("CBFSFZH is null");
            return (Criteria) this;
        }

        public Criteria andCbfsfzhIsNotNull() {
            addCriterion("CBFSFZH is not null");
            return (Criteria) this;
        }

        public Criteria andCbfsfzhEqualTo(String value) {
            addCriterion("CBFSFZH =", value, "cbfsfzh");
            return (Criteria) this;
        }

        public Criteria andCbfsfzhNotEqualTo(String value) {
            addCriterion("CBFSFZH <>", value, "cbfsfzh");
            return (Criteria) this;
        }

        public Criteria andCbfsfzhGreaterThan(String value) {
            addCriterion("CBFSFZH >", value, "cbfsfzh");
            return (Criteria) this;
        }

        public Criteria andCbfsfzhGreaterThanOrEqualTo(String value) {
            addCriterion("CBFSFZH >=", value, "cbfsfzh");
            return (Criteria) this;
        }

        public Criteria andCbfsfzhLessThan(String value) {
            addCriterion("CBFSFZH <", value, "cbfsfzh");
            return (Criteria) this;
        }

        public Criteria andCbfsfzhLessThanOrEqualTo(String value) {
            addCriterion("CBFSFZH <=", value, "cbfsfzh");
            return (Criteria) this;
        }

        public Criteria andCbfsfzhLike(String value) {
            addCriterion("CBFSFZH like", value, "cbfsfzh");
            return (Criteria) this;
        }

        public Criteria andCbfsfzhNotLike(String value) {
            addCriterion("CBFSFZH not like", value, "cbfsfzh");
            return (Criteria) this;
        }

        public Criteria andCbfsfzhIn(List<String> values) {
            addCriterion("CBFSFZH in", values, "cbfsfzh");
            return (Criteria) this;
        }

        public Criteria andCbfsfzhNotIn(List<String> values) {
            addCriterion("CBFSFZH not in", values, "cbfsfzh");
            return (Criteria) this;
        }

        public Criteria andCbfsfzhBetween(String value1, String value2) {
            addCriterion("CBFSFZH between", value1, value2, "cbfsfzh");
            return (Criteria) this;
        }

        public Criteria andCbfsfzhNotBetween(String value1, String value2) {
            addCriterion("CBFSFZH not between", value1, value2, "cbfsfzh");
            return (Criteria) this;
        }

        public Criteria andTdsyqxzIsNull() {
            addCriterion("TDSYQXZ is null");
            return (Criteria) this;
        }

        public Criteria andTdsyqxzIsNotNull() {
            addCriterion("TDSYQXZ is not null");
            return (Criteria) this;
        }

        public Criteria andTdsyqxzEqualTo(BigDecimal value) {
            addCriterion("TDSYQXZ =", value, "tdsyqxz");
            return (Criteria) this;
        }

        public Criteria andTdsyqxzNotEqualTo(BigDecimal value) {
            addCriterion("TDSYQXZ <>", value, "tdsyqxz");
            return (Criteria) this;
        }

        public Criteria andTdsyqxzGreaterThan(BigDecimal value) {
            addCriterion("TDSYQXZ >", value, "tdsyqxz");
            return (Criteria) this;
        }

        public Criteria andTdsyqxzGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TDSYQXZ >=", value, "tdsyqxz");
            return (Criteria) this;
        }

        public Criteria andTdsyqxzLessThan(BigDecimal value) {
            addCriterion("TDSYQXZ <", value, "tdsyqxz");
            return (Criteria) this;
        }

        public Criteria andTdsyqxzLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TDSYQXZ <=", value, "tdsyqxz");
            return (Criteria) this;
        }

        public Criteria andTdsyqxzIn(List<BigDecimal> values) {
            addCriterion("TDSYQXZ in", values, "tdsyqxz");
            return (Criteria) this;
        }

        public Criteria andTdsyqxzNotIn(List<BigDecimal> values) {
            addCriterion("TDSYQXZ not in", values, "tdsyqxz");
            return (Criteria) this;
        }

        public Criteria andTdsyqxzBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TDSYQXZ between", value1, value2, "tdsyqxz");
            return (Criteria) this;
        }

        public Criteria andTdsyqxzNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TDSYQXZ not between", value1, value2, "tdsyqxz");
            return (Criteria) this;
        }

        public Criteria andDkmcIsNull() {
            addCriterion("DKMC is null");
            return (Criteria) this;
        }

        public Criteria andDkmcIsNotNull() {
            addCriterion("DKMC is not null");
            return (Criteria) this;
        }

        public Criteria andDkmcEqualTo(String value) {
            addCriterion("DKMC =", value, "dkmc");
            return (Criteria) this;
        }

        public Criteria andDkmcNotEqualTo(String value) {
            addCriterion("DKMC <>", value, "dkmc");
            return (Criteria) this;
        }

        public Criteria andDkmcGreaterThan(String value) {
            addCriterion("DKMC >", value, "dkmc");
            return (Criteria) this;
        }

        public Criteria andDkmcGreaterThanOrEqualTo(String value) {
            addCriterion("DKMC >=", value, "dkmc");
            return (Criteria) this;
        }

        public Criteria andDkmcLessThan(String value) {
            addCriterion("DKMC <", value, "dkmc");
            return (Criteria) this;
        }

        public Criteria andDkmcLessThanOrEqualTo(String value) {
            addCriterion("DKMC <=", value, "dkmc");
            return (Criteria) this;
        }

        public Criteria andDkmcLike(String value) {
            addCriterion("DKMC like", value, "dkmc");
            return (Criteria) this;
        }

        public Criteria andDkmcNotLike(String value) {
            addCriterion("DKMC not like", value, "dkmc");
            return (Criteria) this;
        }

        public Criteria andDkmcIn(List<String> values) {
            addCriterion("DKMC in", values, "dkmc");
            return (Criteria) this;
        }

        public Criteria andDkmcNotIn(List<String> values) {
            addCriterion("DKMC not in", values, "dkmc");
            return (Criteria) this;
        }

        public Criteria andDkmcBetween(String value1, String value2) {
            addCriterion("DKMC between", value1, value2, "dkmc");
            return (Criteria) this;
        }

        public Criteria andDkmcNotBetween(String value1, String value2) {
            addCriterion("DKMC not between", value1, value2, "dkmc");
            return (Criteria) this;
        }

        public Criteria andDkdmIsNull() {
            addCriterion("DKDM is null");
            return (Criteria) this;
        }

        public Criteria andDkdmIsNotNull() {
            addCriterion("DKDM is not null");
            return (Criteria) this;
        }

        public Criteria andDkdmEqualTo(String value) {
            addCriterion("DKDM =", value, "dkdm");
            return (Criteria) this;
        }

        public Criteria andDkdmNotEqualTo(String value) {
            addCriterion("DKDM <>", value, "dkdm");
            return (Criteria) this;
        }

        public Criteria andDkdmGreaterThan(String value) {
            addCriterion("DKDM >", value, "dkdm");
            return (Criteria) this;
        }

        public Criteria andDkdmGreaterThanOrEqualTo(String value) {
            addCriterion("DKDM >=", value, "dkdm");
            return (Criteria) this;
        }

        public Criteria andDkdmLessThan(String value) {
            addCriterion("DKDM <", value, "dkdm");
            return (Criteria) this;
        }

        public Criteria andDkdmLessThanOrEqualTo(String value) {
            addCriterion("DKDM <=", value, "dkdm");
            return (Criteria) this;
        }

        public Criteria andDkdmLike(String value) {
            addCriterion("DKDM like", value, "dkdm");
            return (Criteria) this;
        }

        public Criteria andDkdmNotLike(String value) {
            addCriterion("DKDM not like", value, "dkdm");
            return (Criteria) this;
        }

        public Criteria andDkdmIn(List<String> values) {
            addCriterion("DKDM in", values, "dkdm");
            return (Criteria) this;
        }

        public Criteria andDkdmNotIn(List<String> values) {
            addCriterion("DKDM not in", values, "dkdm");
            return (Criteria) this;
        }

        public Criteria andDkdmBetween(String value1, String value2) {
            addCriterion("DKDM between", value1, value2, "dkdm");
            return (Criteria) this;
        }

        public Criteria andDkdmNotBetween(String value1, String value2) {
            addCriterion("DKDM not between", value1, value2, "dkdm");
            return (Criteria) this;
        }

        public Criteria andSfyjjbntIsNull() {
            addCriterion("SFYJJBNT is null");
            return (Criteria) this;
        }

        public Criteria andSfyjjbntIsNotNull() {
            addCriterion("SFYJJBNT is not null");
            return (Criteria) this;
        }

        public Criteria andSfyjjbntEqualTo(String value) {
            addCriterion("SFYJJBNT =", value, "sfyjjbnt");
            return (Criteria) this;
        }

        public Criteria andSfyjjbntNotEqualTo(String value) {
            addCriterion("SFYJJBNT <>", value, "sfyjjbnt");
            return (Criteria) this;
        }

        public Criteria andSfyjjbntGreaterThan(String value) {
            addCriterion("SFYJJBNT >", value, "sfyjjbnt");
            return (Criteria) this;
        }

        public Criteria andSfyjjbntGreaterThanOrEqualTo(String value) {
            addCriterion("SFYJJBNT >=", value, "sfyjjbnt");
            return (Criteria) this;
        }

        public Criteria andSfyjjbntLessThan(String value) {
            addCriterion("SFYJJBNT <", value, "sfyjjbnt");
            return (Criteria) this;
        }

        public Criteria andSfyjjbntLessThanOrEqualTo(String value) {
            addCriterion("SFYJJBNT <=", value, "sfyjjbnt");
            return (Criteria) this;
        }

        public Criteria andSfyjjbntLike(String value) {
            addCriterion("SFYJJBNT like", value, "sfyjjbnt");
            return (Criteria) this;
        }

        public Criteria andSfyjjbntNotLike(String value) {
            addCriterion("SFYJJBNT not like", value, "sfyjjbnt");
            return (Criteria) this;
        }

        public Criteria andSfyjjbntIn(List<String> values) {
            addCriterion("SFYJJBNT in", values, "sfyjjbnt");
            return (Criteria) this;
        }

        public Criteria andSfyjjbntNotIn(List<String> values) {
            addCriterion("SFYJJBNT not in", values, "sfyjjbnt");
            return (Criteria) this;
        }

        public Criteria andSfyjjbntBetween(String value1, String value2) {
            addCriterion("SFYJJBNT between", value1, value2, "sfyjjbnt");
            return (Criteria) this;
        }

        public Criteria andSfyjjbntNotBetween(String value1, String value2) {
            addCriterion("SFYJJBNT not between", value1, value2, "sfyjjbnt");
            return (Criteria) this;
        }

        public Criteria andDbrIsNull() {
            addCriterion("DBR is null");
            return (Criteria) this;
        }

        public Criteria andDbrIsNotNull() {
            addCriterion("DBR is not null");
            return (Criteria) this;
        }

        public Criteria andDbrEqualTo(Object value) {
            addCriterion("DBR =", value, "dbr");
            return (Criteria) this;
        }

        public Criteria andDbrNotEqualTo(Object value) {
            addCriterion("DBR <>", value, "dbr");
            return (Criteria) this;
        }

        public Criteria andDbrGreaterThan(Object value) {
            addCriterion("DBR >", value, "dbr");
            return (Criteria) this;
        }

        public Criteria andDbrGreaterThanOrEqualTo(Object value) {
            addCriterion("DBR >=", value, "dbr");
            return (Criteria) this;
        }

        public Criteria andDbrLessThan(Object value) {
            addCriterion("DBR <", value, "dbr");
            return (Criteria) this;
        }

        public Criteria andDbrLessThanOrEqualTo(Object value) {
            addCriterion("DBR <=", value, "dbr");
            return (Criteria) this;
        }

        public Criteria andDbrIn(List<Object> values) {
            addCriterion("DBR in", values, "dbr");
            return (Criteria) this;
        }

        public Criteria andDbrNotIn(List<Object> values) {
            addCriterion("DBR not in", values, "dbr");
            return (Criteria) this;
        }

        public Criteria andDbrBetween(Object value1, Object value2) {
            addCriterion("DBR between", value1, value2, "dbr");
            return (Criteria) this;
        }

        public Criteria andDbrNotBetween(Object value1, Object value2) {
            addCriterion("DBR not between", value1, value2, "dbr");
            return (Criteria) this;
        }

        public Criteria andDjsjIsNull() {
            addCriterion("DJSJ is null");
            return (Criteria) this;
        }

        public Criteria andDjsjIsNotNull() {
            addCriterion("DJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andDjsjEqualTo(Date value) {
            addCriterionForJDBCDate("DJSJ =", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("DJSJ <>", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjGreaterThan(Date value) {
            addCriterionForJDBCDate("DJSJ >", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DJSJ >=", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjLessThan(Date value) {
            addCriterionForJDBCDate("DJSJ <", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DJSJ <=", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjIn(List<Date> values) {
            addCriterionForJDBCDate("DJSJ in", values, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("DJSJ not in", values, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DJSJ between", value1, value2, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DJSJ not between", value1, value2, "djsj");
            return (Criteria) this;
        }

        public Criteria andDbyjIsNull() {
            addCriterion("DBYJ is null");
            return (Criteria) this;
        }

        public Criteria andDbyjIsNotNull() {
            addCriterion("DBYJ is not null");
            return (Criteria) this;
        }

        public Criteria andDbyjEqualTo(Object value) {
            addCriterion("DBYJ =", value, "dbyj");
            return (Criteria) this;
        }

        public Criteria andDbyjNotEqualTo(Object value) {
            addCriterion("DBYJ <>", value, "dbyj");
            return (Criteria) this;
        }

        public Criteria andDbyjGreaterThan(Object value) {
            addCriterion("DBYJ >", value, "dbyj");
            return (Criteria) this;
        }

        public Criteria andDbyjGreaterThanOrEqualTo(Object value) {
            addCriterion("DBYJ >=", value, "dbyj");
            return (Criteria) this;
        }

        public Criteria andDbyjLessThan(Object value) {
            addCriterion("DBYJ <", value, "dbyj");
            return (Criteria) this;
        }

        public Criteria andDbyjLessThanOrEqualTo(Object value) {
            addCriterion("DBYJ <=", value, "dbyj");
            return (Criteria) this;
        }

        public Criteria andDbyjIn(List<Object> values) {
            addCriterion("DBYJ in", values, "dbyj");
            return (Criteria) this;
        }

        public Criteria andDbyjNotIn(List<Object> values) {
            addCriterion("DBYJ not in", values, "dbyj");
            return (Criteria) this;
        }

        public Criteria andDbyjBetween(Object value1, Object value2) {
            addCriterion("DBYJ between", value1, value2, "dbyj");
            return (Criteria) this;
        }

        public Criteria andDbyjNotBetween(Object value1, Object value2) {
            addCriterion("DBYJ not between", value1, value2, "dbyj");
            return (Criteria) this;
        }

        public Criteria andDbyjqzIsNull() {
            addCriterion("DBYJQZ is null");
            return (Criteria) this;
        }

        public Criteria andDbyjqzIsNotNull() {
            addCriterion("DBYJQZ is not null");
            return (Criteria) this;
        }

        public Criteria andDbyjqzEqualTo(Object value) {
            addCriterion("DBYJQZ =", value, "dbyjqz");
            return (Criteria) this;
        }

        public Criteria andDbyjqzNotEqualTo(Object value) {
            addCriterion("DBYJQZ <>", value, "dbyjqz");
            return (Criteria) this;
        }

        public Criteria andDbyjqzGreaterThan(Object value) {
            addCriterion("DBYJQZ >", value, "dbyjqz");
            return (Criteria) this;
        }

        public Criteria andDbyjqzGreaterThanOrEqualTo(Object value) {
            addCriterion("DBYJQZ >=", value, "dbyjqz");
            return (Criteria) this;
        }

        public Criteria andDbyjqzLessThan(Object value) {
            addCriterion("DBYJQZ <", value, "dbyjqz");
            return (Criteria) this;
        }

        public Criteria andDbyjqzLessThanOrEqualTo(Object value) {
            addCriterion("DBYJQZ <=", value, "dbyjqz");
            return (Criteria) this;
        }

        public Criteria andDbyjqzIn(List<Object> values) {
            addCriterion("DBYJQZ in", values, "dbyjqz");
            return (Criteria) this;
        }

        public Criteria andDbyjqzNotIn(List<Object> values) {
            addCriterion("DBYJQZ not in", values, "dbyjqz");
            return (Criteria) this;
        }

        public Criteria andDbyjqzBetween(Object value1, Object value2) {
            addCriterion("DBYJQZ between", value1, value2, "dbyjqz");
            return (Criteria) this;
        }

        public Criteria andDbyjqzNotBetween(Object value1, Object value2) {
            addCriterion("DBYJQZ not between", value1, value2, "dbyjqz");
            return (Criteria) this;
        }

        public Criteria andMjdwIsNull() {
            addCriterion("MJDW is null");
            return (Criteria) this;
        }

        public Criteria andMjdwIsNotNull() {
            addCriterion("MJDW is not null");
            return (Criteria) this;
        }

        public Criteria andMjdwEqualTo(BigDecimal value) {
            addCriterion("MJDW =", value, "mjdw");
            return (Criteria) this;
        }

        public Criteria andMjdwNotEqualTo(BigDecimal value) {
            addCriterion("MJDW <>", value, "mjdw");
            return (Criteria) this;
        }

        public Criteria andMjdwGreaterThan(BigDecimal value) {
            addCriterion("MJDW >", value, "mjdw");
            return (Criteria) this;
        }

        public Criteria andMjdwGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MJDW >=", value, "mjdw");
            return (Criteria) this;
        }

        public Criteria andMjdwLessThan(BigDecimal value) {
            addCriterion("MJDW <", value, "mjdw");
            return (Criteria) this;
        }

        public Criteria andMjdwLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MJDW <=", value, "mjdw");
            return (Criteria) this;
        }

        public Criteria andMjdwIn(List<BigDecimal> values) {
            addCriterion("MJDW in", values, "mjdw");
            return (Criteria) this;
        }

        public Criteria andMjdwNotIn(List<BigDecimal> values) {
            addCriterion("MJDW not in", values, "mjdw");
            return (Criteria) this;
        }

        public Criteria andMjdwBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MJDW between", value1, value2, "mjdw");
            return (Criteria) this;
        }

        public Criteria andMjdwNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MJDW not between", value1, value2, "mjdw");
            return (Criteria) this;
        }

        public Criteria andGidIsNull() {
            addCriterion("GID is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("GID is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(String value) {
            addCriterion("GID =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(String value) {
            addCriterion("GID <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(String value) {
            addCriterion("GID >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(String value) {
            addCriterion("GID >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(String value) {
            addCriterion("GID <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(String value) {
            addCriterion("GID <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLike(String value) {
            addCriterion("GID like", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotLike(String value) {
            addCriterion("GID not like", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<String> values) {
            addCriterion("GID in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<String> values) {
            addCriterion("GID not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(String value1, String value2) {
            addCriterion("GID between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(String value1, String value2) {
            addCriterion("GID not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andCbfdbzjzlIsNull() {
            addCriterion("CBFDBZJZL is null");
            return (Criteria) this;
        }

        public Criteria andCbfdbzjzlIsNotNull() {
            addCriterion("CBFDBZJZL is not null");
            return (Criteria) this;
        }

        public Criteria andCbfdbzjzlEqualTo(BigDecimal value) {
            addCriterion("CBFDBZJZL =", value, "cbfdbzjzl");
            return (Criteria) this;
        }

        public Criteria andCbfdbzjzlNotEqualTo(BigDecimal value) {
            addCriterion("CBFDBZJZL <>", value, "cbfdbzjzl");
            return (Criteria) this;
        }

        public Criteria andCbfdbzjzlGreaterThan(BigDecimal value) {
            addCriterion("CBFDBZJZL >", value, "cbfdbzjzl");
            return (Criteria) this;
        }

        public Criteria andCbfdbzjzlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CBFDBZJZL >=", value, "cbfdbzjzl");
            return (Criteria) this;
        }

        public Criteria andCbfdbzjzlLessThan(BigDecimal value) {
            addCriterion("CBFDBZJZL <", value, "cbfdbzjzl");
            return (Criteria) this;
        }

        public Criteria andCbfdbzjzlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CBFDBZJZL <=", value, "cbfdbzjzl");
            return (Criteria) this;
        }

        public Criteria andCbfdbzjzlIn(List<BigDecimal> values) {
            addCriterion("CBFDBZJZL in", values, "cbfdbzjzl");
            return (Criteria) this;
        }

        public Criteria andCbfdbzjzlNotIn(List<BigDecimal> values) {
            addCriterion("CBFDBZJZL not in", values, "cbfdbzjzl");
            return (Criteria) this;
        }

        public Criteria andCbfdbzjzlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CBFDBZJZL between", value1, value2, "cbfdbzjzl");
            return (Criteria) this;
        }

        public Criteria andCbfdbzjzlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CBFDBZJZL not between", value1, value2, "cbfdbzjzl");
            return (Criteria) this;
        }

        public Criteria andYbdcdyhIsNull() {
            addCriterion("YBDCDYH is null");
            return (Criteria) this;
        }

        public Criteria andYbdcdyhIsNotNull() {
            addCriterion("YBDCDYH is not null");
            return (Criteria) this;
        }

        public Criteria andYbdcdyhEqualTo(Object value) {
            addCriterion("YBDCDYH =", value, "ybdcdyh");
            return (Criteria) this;
        }

        public Criteria andYbdcdyhNotEqualTo(Object value) {
            addCriterion("YBDCDYH <>", value, "ybdcdyh");
            return (Criteria) this;
        }

        public Criteria andYbdcdyhGreaterThan(Object value) {
            addCriterion("YBDCDYH >", value, "ybdcdyh");
            return (Criteria) this;
        }

        public Criteria andYbdcdyhGreaterThanOrEqualTo(Object value) {
            addCriterion("YBDCDYH >=", value, "ybdcdyh");
            return (Criteria) this;
        }

        public Criteria andYbdcdyhLessThan(Object value) {
            addCriterion("YBDCDYH <", value, "ybdcdyh");
            return (Criteria) this;
        }

        public Criteria andYbdcdyhLessThanOrEqualTo(Object value) {
            addCriterion("YBDCDYH <=", value, "ybdcdyh");
            return (Criteria) this;
        }

        public Criteria andYbdcdyhIn(List<Object> values) {
            addCriterion("YBDCDYH in", values, "ybdcdyh");
            return (Criteria) this;
        }

        public Criteria andYbdcdyhNotIn(List<Object> values) {
            addCriterion("YBDCDYH not in", values, "ybdcdyh");
            return (Criteria) this;
        }

        public Criteria andYbdcdyhBetween(Object value1, Object value2) {
            addCriterion("YBDCDYH between", value1, value2, "ybdcdyh");
            return (Criteria) this;
        }

        public Criteria andYbdcdyhNotBetween(Object value1, Object value2) {
            addCriterion("YBDCDYH not between", value1, value2, "ybdcdyh");
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

        public Criteria andTdytmcIsNull() {
            addCriterion("TDYTMC is null");
            return (Criteria) this;
        }

        public Criteria andTdytmcIsNotNull() {
            addCriterion("TDYTMC is not null");
            return (Criteria) this;
        }

        public Criteria andTdytmcEqualTo(String value) {
            addCriterion("TDYTMC =", value, "tdytmc");
            return (Criteria) this;
        }

        public Criteria andTdytmcNotEqualTo(String value) {
            addCriterion("TDYTMC <>", value, "tdytmc");
            return (Criteria) this;
        }

        public Criteria andTdytmcGreaterThan(String value) {
            addCriterion("TDYTMC >", value, "tdytmc");
            return (Criteria) this;
        }

        public Criteria andTdytmcGreaterThanOrEqualTo(String value) {
            addCriterion("TDYTMC >=", value, "tdytmc");
            return (Criteria) this;
        }

        public Criteria andTdytmcLessThan(String value) {
            addCriterion("TDYTMC <", value, "tdytmc");
            return (Criteria) this;
        }

        public Criteria andTdytmcLessThanOrEqualTo(String value) {
            addCriterion("TDYTMC <=", value, "tdytmc");
            return (Criteria) this;
        }

        public Criteria andTdytmcLike(String value) {
            addCriterion("TDYTMC like", value, "tdytmc");
            return (Criteria) this;
        }

        public Criteria andTdytmcNotLike(String value) {
            addCriterion("TDYTMC not like", value, "tdytmc");
            return (Criteria) this;
        }

        public Criteria andTdytmcIn(List<String> values) {
            addCriterion("TDYTMC in", values, "tdytmc");
            return (Criteria) this;
        }

        public Criteria andTdytmcNotIn(List<String> values) {
            addCriterion("TDYTMC not in", values, "tdytmc");
            return (Criteria) this;
        }

        public Criteria andTdytmcBetween(String value1, String value2) {
            addCriterion("TDYTMC between", value1, value2, "tdytmc");
            return (Criteria) this;
        }

        public Criteria andTdytmcNotBetween(String value1, String value2) {
            addCriterion("TDYTMC not between", value1, value2, "tdytmc");
            return (Criteria) this;
        }

        public Criteria andCbqxIsNull() {
            addCriterion("CBQX is null");
            return (Criteria) this;
        }

        public Criteria andCbqxIsNotNull() {
            addCriterion("CBQX is not null");
            return (Criteria) this;
        }

        public Criteria andCbqxEqualTo(Object value) {
            addCriterion("CBQX =", value, "cbqx");
            return (Criteria) this;
        }

        public Criteria andCbqxNotEqualTo(Object value) {
            addCriterion("CBQX <>", value, "cbqx");
            return (Criteria) this;
        }

        public Criteria andCbqxGreaterThan(Object value) {
            addCriterion("CBQX >", value, "cbqx");
            return (Criteria) this;
        }

        public Criteria andCbqxGreaterThanOrEqualTo(Object value) {
            addCriterion("CBQX >=", value, "cbqx");
            return (Criteria) this;
        }

        public Criteria andCbqxLessThan(Object value) {
            addCriterion("CBQX <", value, "cbqx");
            return (Criteria) this;
        }

        public Criteria andCbqxLessThanOrEqualTo(Object value) {
            addCriterion("CBQX <=", value, "cbqx");
            return (Criteria) this;
        }

        public Criteria andCbqxIn(List<Object> values) {
            addCriterion("CBQX in", values, "cbqx");
            return (Criteria) this;
        }

        public Criteria andCbqxNotIn(List<Object> values) {
            addCriterion("CBQX not in", values, "cbqx");
            return (Criteria) this;
        }

        public Criteria andCbqxBetween(Object value1, Object value2) {
            addCriterion("CBQX between", value1, value2, "cbqx");
            return (Criteria) this;
        }

        public Criteria andCbqxNotBetween(Object value1, Object value2) {
            addCriterion("CBQX not between", value1, value2, "cbqx");
            return (Criteria) this;
        }

        public Criteria andCcIsNull() {
            addCriterion("CC is null");
            return (Criteria) this;
        }

        public Criteria andCcIsNotNull() {
            addCriterion("CC is not null");
            return (Criteria) this;
        }

        public Criteria andCcEqualTo(Object value) {
            addCriterion("CC =", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcNotEqualTo(Object value) {
            addCriterion("CC <>", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcGreaterThan(Object value) {
            addCriterion("CC >", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcGreaterThanOrEqualTo(Object value) {
            addCriterion("CC >=", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcLessThan(Object value) {
            addCriterion("CC <", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcLessThanOrEqualTo(Object value) {
            addCriterion("CC <=", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcIn(List<Object> values) {
            addCriterion("CC in", values, "cc");
            return (Criteria) this;
        }

        public Criteria andCcNotIn(List<Object> values) {
            addCriterion("CC not in", values, "cc");
            return (Criteria) this;
        }

        public Criteria andCcBetween(Object value1, Object value2) {
            addCriterion("CC between", value1, value2, "cc");
            return (Criteria) this;
        }

        public Criteria andCcNotBetween(Object value1, Object value2) {
            addCriterion("CC not between", value1, value2, "cc");
            return (Criteria) this;
        }

        public Criteria andFjIsNull() {
            addCriterion("FJ is null");
            return (Criteria) this;
        }

        public Criteria andFjIsNotNull() {
            addCriterion("FJ is not null");
            return (Criteria) this;
        }

        public Criteria andFjEqualTo(Object value) {
            addCriterion("FJ =", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjNotEqualTo(Object value) {
            addCriterion("FJ <>", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjGreaterThan(Object value) {
            addCriterion("FJ >", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjGreaterThanOrEqualTo(Object value) {
            addCriterion("FJ >=", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjLessThan(Object value) {
            addCriterion("FJ <", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjLessThanOrEqualTo(Object value) {
            addCriterion("FJ <=", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjIn(List<Object> values) {
            addCriterion("FJ in", values, "fj");
            return (Criteria) this;
        }

        public Criteria andFjNotIn(List<Object> values) {
            addCriterion("FJ not in", values, "fj");
            return (Criteria) this;
        }

        public Criteria andFjBetween(Object value1, Object value2) {
            addCriterion("FJ between", value1, value2, "fj");
            return (Criteria) this;
        }

        public Criteria andFjNotBetween(Object value1, Object value2) {
            addCriterion("FJ not between", value1, value2, "fj");
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
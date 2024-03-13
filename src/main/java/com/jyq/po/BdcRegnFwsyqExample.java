package com.jyq.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BdcRegnFwsyqExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BdcRegnFwsyqExample() {
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

        public Criteria andGhytIsNull() {
            addCriterion("GHYT is null");
            return (Criteria) this;
        }

        public Criteria andGhytIsNotNull() {
            addCriterion("GHYT is not null");
            return (Criteria) this;
        }

        public Criteria andGhytEqualTo(Object value) {
            addCriterion("GHYT =", value, "ghyt");
            return (Criteria) this;
        }

        public Criteria andGhytNotEqualTo(Object value) {
            addCriterion("GHYT <>", value, "ghyt");
            return (Criteria) this;
        }

        public Criteria andGhytGreaterThan(Object value) {
            addCriterion("GHYT >", value, "ghyt");
            return (Criteria) this;
        }

        public Criteria andGhytGreaterThanOrEqualTo(Object value) {
            addCriterion("GHYT >=", value, "ghyt");
            return (Criteria) this;
        }

        public Criteria andGhytLessThan(Object value) {
            addCriterion("GHYT <", value, "ghyt");
            return (Criteria) this;
        }

        public Criteria andGhytLessThanOrEqualTo(Object value) {
            addCriterion("GHYT <=", value, "ghyt");
            return (Criteria) this;
        }

        public Criteria andGhytIn(List<Object> values) {
            addCriterion("GHYT in", values, "ghyt");
            return (Criteria) this;
        }

        public Criteria andGhytNotIn(List<Object> values) {
            addCriterion("GHYT not in", values, "ghyt");
            return (Criteria) this;
        }

        public Criteria andGhytBetween(Object value1, Object value2) {
            addCriterion("GHYT between", value1, value2, "ghyt");
            return (Criteria) this;
        }

        public Criteria andGhytNotBetween(Object value1, Object value2) {
            addCriterion("GHYT not between", value1, value2, "ghyt");
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

        public Criteria andFwxzIsNull() {
            addCriterion("FWXZ is null");
            return (Criteria) this;
        }

        public Criteria andFwxzIsNotNull() {
            addCriterion("FWXZ is not null");
            return (Criteria) this;
        }

        public Criteria andFwxzEqualTo(Object value) {
            addCriterion("FWXZ =", value, "fwxz");
            return (Criteria) this;
        }

        public Criteria andFwxzNotEqualTo(Object value) {
            addCriterion("FWXZ <>", value, "fwxz");
            return (Criteria) this;
        }

        public Criteria andFwxzGreaterThan(Object value) {
            addCriterion("FWXZ >", value, "fwxz");
            return (Criteria) this;
        }

        public Criteria andFwxzGreaterThanOrEqualTo(Object value) {
            addCriterion("FWXZ >=", value, "fwxz");
            return (Criteria) this;
        }

        public Criteria andFwxzLessThan(Object value) {
            addCriterion("FWXZ <", value, "fwxz");
            return (Criteria) this;
        }

        public Criteria andFwxzLessThanOrEqualTo(Object value) {
            addCriterion("FWXZ <=", value, "fwxz");
            return (Criteria) this;
        }

        public Criteria andFwxzIn(List<Object> values) {
            addCriterion("FWXZ in", values, "fwxz");
            return (Criteria) this;
        }

        public Criteria andFwxzNotIn(List<Object> values) {
            addCriterion("FWXZ not in", values, "fwxz");
            return (Criteria) this;
        }

        public Criteria andFwxzBetween(Object value1, Object value2) {
            addCriterion("FWXZ between", value1, value2, "fwxz");
            return (Criteria) this;
        }

        public Criteria andFwxzNotBetween(Object value1, Object value2) {
            addCriterion("FWXZ not between", value1, value2, "fwxz");
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

        public Criteria andFdcjyjgIsNull() {
            addCriterion("FDCJYJG is null");
            return (Criteria) this;
        }

        public Criteria andFdcjyjgIsNotNull() {
            addCriterion("FDCJYJG is not null");
            return (Criteria) this;
        }

        public Criteria andFdcjyjgEqualTo(Double value) {
            addCriterion("FDCJYJG =", value, "fdcjyjg");
            return (Criteria) this;
        }

        public Criteria andFdcjyjgNotEqualTo(Double value) {
            addCriterion("FDCJYJG <>", value, "fdcjyjg");
            return (Criteria) this;
        }

        public Criteria andFdcjyjgGreaterThan(Double value) {
            addCriterion("FDCJYJG >", value, "fdcjyjg");
            return (Criteria) this;
        }

        public Criteria andFdcjyjgGreaterThanOrEqualTo(Double value) {
            addCriterion("FDCJYJG >=", value, "fdcjyjg");
            return (Criteria) this;
        }

        public Criteria andFdcjyjgLessThan(Double value) {
            addCriterion("FDCJYJG <", value, "fdcjyjg");
            return (Criteria) this;
        }

        public Criteria andFdcjyjgLessThanOrEqualTo(Double value) {
            addCriterion("FDCJYJG <=", value, "fdcjyjg");
            return (Criteria) this;
        }

        public Criteria andFdcjyjgIn(List<Double> values) {
            addCriterion("FDCJYJG in", values, "fdcjyjg");
            return (Criteria) this;
        }

        public Criteria andFdcjyjgNotIn(List<Double> values) {
            addCriterion("FDCJYJG not in", values, "fdcjyjg");
            return (Criteria) this;
        }

        public Criteria andFdcjyjgBetween(Double value1, Double value2) {
            addCriterion("FDCJYJG between", value1, value2, "fdcjyjg");
            return (Criteria) this;
        }

        public Criteria andFdcjyjgNotBetween(Double value1, Double value2) {
            addCriterion("FDCJYJG not between", value1, value2, "fdcjyjg");
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

        public Criteria andZcsIsNull() {
            addCriterion("ZCS is null");
            return (Criteria) this;
        }

        public Criteria andZcsIsNotNull() {
            addCriterion("ZCS is not null");
            return (Criteria) this;
        }

        public Criteria andZcsEqualTo(BigDecimal value) {
            addCriterion("ZCS =", value, "zcs");
            return (Criteria) this;
        }

        public Criteria andZcsNotEqualTo(BigDecimal value) {
            addCriterion("ZCS <>", value, "zcs");
            return (Criteria) this;
        }

        public Criteria andZcsGreaterThan(BigDecimal value) {
            addCriterion("ZCS >", value, "zcs");
            return (Criteria) this;
        }

        public Criteria andZcsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZCS >=", value, "zcs");
            return (Criteria) this;
        }

        public Criteria andZcsLessThan(BigDecimal value) {
            addCriterion("ZCS <", value, "zcs");
            return (Criteria) this;
        }

        public Criteria andZcsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZCS <=", value, "zcs");
            return (Criteria) this;
        }

        public Criteria andZcsIn(List<BigDecimal> values) {
            addCriterion("ZCS in", values, "zcs");
            return (Criteria) this;
        }

        public Criteria andZcsNotIn(List<BigDecimal> values) {
            addCriterion("ZCS not in", values, "zcs");
            return (Criteria) this;
        }

        public Criteria andZcsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZCS between", value1, value2, "zcs");
            return (Criteria) this;
        }

        public Criteria andZcsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZCS not between", value1, value2, "zcs");
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

        public Criteria andFwjgIsNull() {
            addCriterion("FWJG is null");
            return (Criteria) this;
        }

        public Criteria andFwjgIsNotNull() {
            addCriterion("FWJG is not null");
            return (Criteria) this;
        }

        public Criteria andFwjgEqualTo(BigDecimal value) {
            addCriterion("FWJG =", value, "fwjg");
            return (Criteria) this;
        }

        public Criteria andFwjgNotEqualTo(BigDecimal value) {
            addCriterion("FWJG <>", value, "fwjg");
            return (Criteria) this;
        }

        public Criteria andFwjgGreaterThan(BigDecimal value) {
            addCriterion("FWJG >", value, "fwjg");
            return (Criteria) this;
        }

        public Criteria andFwjgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FWJG >=", value, "fwjg");
            return (Criteria) this;
        }

        public Criteria andFwjgLessThan(BigDecimal value) {
            addCriterion("FWJG <", value, "fwjg");
            return (Criteria) this;
        }

        public Criteria andFwjgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FWJG <=", value, "fwjg");
            return (Criteria) this;
        }

        public Criteria andFwjgIn(List<BigDecimal> values) {
            addCriterion("FWJG in", values, "fwjg");
            return (Criteria) this;
        }

        public Criteria andFwjgNotIn(List<BigDecimal> values) {
            addCriterion("FWJG not in", values, "fwjg");
            return (Criteria) this;
        }

        public Criteria andFwjgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FWJG between", value1, value2, "fwjg");
            return (Criteria) this;
        }

        public Criteria andFwjgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FWJG not between", value1, value2, "fwjg");
            return (Criteria) this;
        }

        public Criteria andSzcsIsNull() {
            addCriterion("SZCS is null");
            return (Criteria) this;
        }

        public Criteria andSzcsIsNotNull() {
            addCriterion("SZCS is not null");
            return (Criteria) this;
        }

        public Criteria andSzcsEqualTo(Object value) {
            addCriterion("SZCS =", value, "szcs");
            return (Criteria) this;
        }

        public Criteria andSzcsNotEqualTo(Object value) {
            addCriterion("SZCS <>", value, "szcs");
            return (Criteria) this;
        }

        public Criteria andSzcsGreaterThan(Object value) {
            addCriterion("SZCS >", value, "szcs");
            return (Criteria) this;
        }

        public Criteria andSzcsGreaterThanOrEqualTo(Object value) {
            addCriterion("SZCS >=", value, "szcs");
            return (Criteria) this;
        }

        public Criteria andSzcsLessThan(Object value) {
            addCriterion("SZCS <", value, "szcs");
            return (Criteria) this;
        }

        public Criteria andSzcsLessThanOrEqualTo(Object value) {
            addCriterion("SZCS <=", value, "szcs");
            return (Criteria) this;
        }

        public Criteria andSzcsIn(List<Object> values) {
            addCriterion("SZCS in", values, "szcs");
            return (Criteria) this;
        }

        public Criteria andSzcsNotIn(List<Object> values) {
            addCriterion("SZCS not in", values, "szcs");
            return (Criteria) this;
        }

        public Criteria andSzcsBetween(Object value1, Object value2) {
            addCriterion("SZCS between", value1, value2, "szcs");
            return (Criteria) this;
        }

        public Criteria andSzcsNotBetween(Object value1, Object value2) {
            addCriterion("SZCS not between", value1, value2, "szcs");
            return (Criteria) this;
        }

        public Criteria andFwsuoyqlrIsNull() {
            addCriterion("FWSUOYQLR is null");
            return (Criteria) this;
        }

        public Criteria andFwsuoyqlrIsNotNull() {
            addCriterion("FWSUOYQLR is not null");
            return (Criteria) this;
        }

        public Criteria andFwsuoyqlrEqualTo(Object value) {
            addCriterion("FWSUOYQLR =", value, "fwsuoyqlr");
            return (Criteria) this;
        }

        public Criteria andFwsuoyqlrNotEqualTo(Object value) {
            addCriterion("FWSUOYQLR <>", value, "fwsuoyqlr");
            return (Criteria) this;
        }

        public Criteria andFwsuoyqlrGreaterThan(Object value) {
            addCriterion("FWSUOYQLR >", value, "fwsuoyqlr");
            return (Criteria) this;
        }

        public Criteria andFwsuoyqlrGreaterThanOrEqualTo(Object value) {
            addCriterion("FWSUOYQLR >=", value, "fwsuoyqlr");
            return (Criteria) this;
        }

        public Criteria andFwsuoyqlrLessThan(Object value) {
            addCriterion("FWSUOYQLR <", value, "fwsuoyqlr");
            return (Criteria) this;
        }

        public Criteria andFwsuoyqlrLessThanOrEqualTo(Object value) {
            addCriterion("FWSUOYQLR <=", value, "fwsuoyqlr");
            return (Criteria) this;
        }

        public Criteria andFwsuoyqlrIn(List<Object> values) {
            addCriterion("FWSUOYQLR in", values, "fwsuoyqlr");
            return (Criteria) this;
        }

        public Criteria andFwsuoyqlrNotIn(List<Object> values) {
            addCriterion("FWSUOYQLR not in", values, "fwsuoyqlr");
            return (Criteria) this;
        }

        public Criteria andFwsuoyqlrBetween(Object value1, Object value2) {
            addCriterion("FWSUOYQLR between", value1, value2, "fwsuoyqlr");
            return (Criteria) this;
        }

        public Criteria andFwsuoyqlrNotBetween(Object value1, Object value2) {
            addCriterion("FWSUOYQLR not between", value1, value2, "fwsuoyqlr");
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

        public Criteria andFttdmjIsNull() {
            addCriterion("FTTDMJ is null");
            return (Criteria) this;
        }

        public Criteria andFttdmjIsNotNull() {
            addCriterion("FTTDMJ is not null");
            return (Criteria) this;
        }

        public Criteria andFttdmjEqualTo(Double value) {
            addCriterion("FTTDMJ =", value, "fttdmj");
            return (Criteria) this;
        }

        public Criteria andFttdmjNotEqualTo(Double value) {
            addCriterion("FTTDMJ <>", value, "fttdmj");
            return (Criteria) this;
        }

        public Criteria andFttdmjGreaterThan(Double value) {
            addCriterion("FTTDMJ >", value, "fttdmj");
            return (Criteria) this;
        }

        public Criteria andFttdmjGreaterThanOrEqualTo(Double value) {
            addCriterion("FTTDMJ >=", value, "fttdmj");
            return (Criteria) this;
        }

        public Criteria andFttdmjLessThan(Double value) {
            addCriterion("FTTDMJ <", value, "fttdmj");
            return (Criteria) this;
        }

        public Criteria andFttdmjLessThanOrEqualTo(Double value) {
            addCriterion("FTTDMJ <=", value, "fttdmj");
            return (Criteria) this;
        }

        public Criteria andFttdmjIn(List<Double> values) {
            addCriterion("FTTDMJ in", values, "fttdmj");
            return (Criteria) this;
        }

        public Criteria andFttdmjNotIn(List<Double> values) {
            addCriterion("FTTDMJ not in", values, "fttdmj");
            return (Criteria) this;
        }

        public Criteria andFttdmjBetween(Double value1, Double value2) {
            addCriterion("FTTDMJ between", value1, value2, "fttdmj");
            return (Criteria) this;
        }

        public Criteria andFttdmjNotBetween(Double value1, Double value2) {
            addCriterion("FTTDMJ not between", value1, value2, "fttdmj");
            return (Criteria) this;
        }

        public Criteria andDytdmjIsNull() {
            addCriterion("DYTDMJ is null");
            return (Criteria) this;
        }

        public Criteria andDytdmjIsNotNull() {
            addCriterion("DYTDMJ is not null");
            return (Criteria) this;
        }

        public Criteria andDytdmjEqualTo(Double value) {
            addCriterion("DYTDMJ =", value, "dytdmj");
            return (Criteria) this;
        }

        public Criteria andDytdmjNotEqualTo(Double value) {
            addCriterion("DYTDMJ <>", value, "dytdmj");
            return (Criteria) this;
        }

        public Criteria andDytdmjGreaterThan(Double value) {
            addCriterion("DYTDMJ >", value, "dytdmj");
            return (Criteria) this;
        }

        public Criteria andDytdmjGreaterThanOrEqualTo(Double value) {
            addCriterion("DYTDMJ >=", value, "dytdmj");
            return (Criteria) this;
        }

        public Criteria andDytdmjLessThan(Double value) {
            addCriterion("DYTDMJ <", value, "dytdmj");
            return (Criteria) this;
        }

        public Criteria andDytdmjLessThanOrEqualTo(Double value) {
            addCriterion("DYTDMJ <=", value, "dytdmj");
            return (Criteria) this;
        }

        public Criteria andDytdmjIn(List<Double> values) {
            addCriterion("DYTDMJ in", values, "dytdmj");
            return (Criteria) this;
        }

        public Criteria andDytdmjNotIn(List<Double> values) {
            addCriterion("DYTDMJ not in", values, "dytdmj");
            return (Criteria) this;
        }

        public Criteria andDytdmjBetween(Double value1, Double value2) {
            addCriterion("DYTDMJ between", value1, value2, "dytdmj");
            return (Criteria) this;
        }

        public Criteria andDytdmjNotBetween(Double value1, Double value2) {
            addCriterion("DYTDMJ not between", value1, value2, "dytdmj");
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

        public Criteria andFdzlIsNull() {
            addCriterion("FDZL is null");
            return (Criteria) this;
        }

        public Criteria andFdzlIsNotNull() {
            addCriterion("FDZL is not null");
            return (Criteria) this;
        }

        public Criteria andFdzlEqualTo(Object value) {
            addCriterion("FDZL =", value, "fdzl");
            return (Criteria) this;
        }

        public Criteria andFdzlNotEqualTo(Object value) {
            addCriterion("FDZL <>", value, "fdzl");
            return (Criteria) this;
        }

        public Criteria andFdzlGreaterThan(Object value) {
            addCriterion("FDZL >", value, "fdzl");
            return (Criteria) this;
        }

        public Criteria andFdzlGreaterThanOrEqualTo(Object value) {
            addCriterion("FDZL >=", value, "fdzl");
            return (Criteria) this;
        }

        public Criteria andFdzlLessThan(Object value) {
            addCriterion("FDZL <", value, "fdzl");
            return (Criteria) this;
        }

        public Criteria andFdzlLessThanOrEqualTo(Object value) {
            addCriterion("FDZL <=", value, "fdzl");
            return (Criteria) this;
        }

        public Criteria andFdzlIn(List<Object> values) {
            addCriterion("FDZL in", values, "fdzl");
            return (Criteria) this;
        }

        public Criteria andFdzlNotIn(List<Object> values) {
            addCriterion("FDZL not in", values, "fdzl");
            return (Criteria) this;
        }

        public Criteria andFdzlBetween(Object value1, Object value2) {
            addCriterion("FDZL between", value1, value2, "fdzl");
            return (Criteria) this;
        }

        public Criteria andFdzlNotBetween(Object value1, Object value2) {
            addCriterion("FDZL not between", value1, value2, "fdzl");
            return (Criteria) this;
        }

        public Criteria andFtjzmjIsNull() {
            addCriterion("FTJZMJ is null");
            return (Criteria) this;
        }

        public Criteria andFtjzmjIsNotNull() {
            addCriterion("FTJZMJ is not null");
            return (Criteria) this;
        }

        public Criteria andFtjzmjEqualTo(Double value) {
            addCriterion("FTJZMJ =", value, "ftjzmj");
            return (Criteria) this;
        }

        public Criteria andFtjzmjNotEqualTo(Double value) {
            addCriterion("FTJZMJ <>", value, "ftjzmj");
            return (Criteria) this;
        }

        public Criteria andFtjzmjGreaterThan(Double value) {
            addCriterion("FTJZMJ >", value, "ftjzmj");
            return (Criteria) this;
        }

        public Criteria andFtjzmjGreaterThanOrEqualTo(Double value) {
            addCriterion("FTJZMJ >=", value, "ftjzmj");
            return (Criteria) this;
        }

        public Criteria andFtjzmjLessThan(Double value) {
            addCriterion("FTJZMJ <", value, "ftjzmj");
            return (Criteria) this;
        }

        public Criteria andFtjzmjLessThanOrEqualTo(Double value) {
            addCriterion("FTJZMJ <=", value, "ftjzmj");
            return (Criteria) this;
        }

        public Criteria andFtjzmjIn(List<Double> values) {
            addCriterion("FTJZMJ in", values, "ftjzmj");
            return (Criteria) this;
        }

        public Criteria andFtjzmjNotIn(List<Double> values) {
            addCriterion("FTJZMJ not in", values, "ftjzmj");
            return (Criteria) this;
        }

        public Criteria andFtjzmjBetween(Double value1, Double value2) {
            addCriterion("FTJZMJ between", value1, value2, "ftjzmj");
            return (Criteria) this;
        }

        public Criteria andFtjzmjNotBetween(Double value1, Double value2) {
            addCriterion("FTJZMJ not between", value1, value2, "ftjzmj");
            return (Criteria) this;
        }

        public Criteria andZyjzmjIsNull() {
            addCriterion("ZYJZMJ is null");
            return (Criteria) this;
        }

        public Criteria andZyjzmjIsNotNull() {
            addCriterion("ZYJZMJ is not null");
            return (Criteria) this;
        }

        public Criteria andZyjzmjEqualTo(Double value) {
            addCriterion("ZYJZMJ =", value, "zyjzmj");
            return (Criteria) this;
        }

        public Criteria andZyjzmjNotEqualTo(Double value) {
            addCriterion("ZYJZMJ <>", value, "zyjzmj");
            return (Criteria) this;
        }

        public Criteria andZyjzmjGreaterThan(Double value) {
            addCriterion("ZYJZMJ >", value, "zyjzmj");
            return (Criteria) this;
        }

        public Criteria andZyjzmjGreaterThanOrEqualTo(Double value) {
            addCriterion("ZYJZMJ >=", value, "zyjzmj");
            return (Criteria) this;
        }

        public Criteria andZyjzmjLessThan(Double value) {
            addCriterion("ZYJZMJ <", value, "zyjzmj");
            return (Criteria) this;
        }

        public Criteria andZyjzmjLessThanOrEqualTo(Double value) {
            addCriterion("ZYJZMJ <=", value, "zyjzmj");
            return (Criteria) this;
        }

        public Criteria andZyjzmjIn(List<Double> values) {
            addCriterion("ZYJZMJ in", values, "zyjzmj");
            return (Criteria) this;
        }

        public Criteria andZyjzmjNotIn(List<Double> values) {
            addCriterion("ZYJZMJ not in", values, "zyjzmj");
            return (Criteria) this;
        }

        public Criteria andZyjzmjBetween(Double value1, Double value2) {
            addCriterion("ZYJZMJ between", value1, value2, "zyjzmj");
            return (Criteria) this;
        }

        public Criteria andZyjzmjNotBetween(Double value1, Double value2) {
            addCriterion("ZYJZMJ not between", value1, value2, "zyjzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjIsNull() {
            addCriterion("JZMJ is null");
            return (Criteria) this;
        }

        public Criteria andJzmjIsNotNull() {
            addCriterion("JZMJ is not null");
            return (Criteria) this;
        }

        public Criteria andJzmjEqualTo(Double value) {
            addCriterion("JZMJ =", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjNotEqualTo(Double value) {
            addCriterion("JZMJ <>", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjGreaterThan(Double value) {
            addCriterion("JZMJ >", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjGreaterThanOrEqualTo(Double value) {
            addCriterion("JZMJ >=", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjLessThan(Double value) {
            addCriterion("JZMJ <", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjLessThanOrEqualTo(Double value) {
            addCriterion("JZMJ <=", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjIn(List<Double> values) {
            addCriterion("JZMJ in", values, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjNotIn(List<Double> values) {
            addCriterion("JZMJ not in", values, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjBetween(Double value1, Double value2) {
            addCriterion("JZMJ between", value1, value2, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjNotBetween(Double value1, Double value2) {
            addCriterion("JZMJ not between", value1, value2, "jzmj");
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

        public Criteria andTdshiyqrIsNull() {
            addCriterion("TDSHIYQR is null");
            return (Criteria) this;
        }

        public Criteria andTdshiyqrIsNotNull() {
            addCriterion("TDSHIYQR is not null");
            return (Criteria) this;
        }

        public Criteria andTdshiyqrEqualTo(Object value) {
            addCriterion("TDSHIYQR =", value, "tdshiyqr");
            return (Criteria) this;
        }

        public Criteria andTdshiyqrNotEqualTo(Object value) {
            addCriterion("TDSHIYQR <>", value, "tdshiyqr");
            return (Criteria) this;
        }

        public Criteria andTdshiyqrGreaterThan(Object value) {
            addCriterion("TDSHIYQR >", value, "tdshiyqr");
            return (Criteria) this;
        }

        public Criteria andTdshiyqrGreaterThanOrEqualTo(Object value) {
            addCriterion("TDSHIYQR >=", value, "tdshiyqr");
            return (Criteria) this;
        }

        public Criteria andTdshiyqrLessThan(Object value) {
            addCriterion("TDSHIYQR <", value, "tdshiyqr");
            return (Criteria) this;
        }

        public Criteria andTdshiyqrLessThanOrEqualTo(Object value) {
            addCriterion("TDSHIYQR <=", value, "tdshiyqr");
            return (Criteria) this;
        }

        public Criteria andTdshiyqrIn(List<Object> values) {
            addCriterion("TDSHIYQR in", values, "tdshiyqr");
            return (Criteria) this;
        }

        public Criteria andTdshiyqrNotIn(List<Object> values) {
            addCriterion("TDSHIYQR not in", values, "tdshiyqr");
            return (Criteria) this;
        }

        public Criteria andTdshiyqrBetween(Object value1, Object value2) {
            addCriterion("TDSHIYQR between", value1, value2, "tdshiyqr");
            return (Criteria) this;
        }

        public Criteria andTdshiyqrNotBetween(Object value1, Object value2) {
            addCriterion("TDSHIYQR not between", value1, value2, "tdshiyqr");
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

        public Criteria andCqlyIsNull() {
            addCriterion("CQLY is null");
            return (Criteria) this;
        }

        public Criteria andCqlyIsNotNull() {
            addCriterion("CQLY is not null");
            return (Criteria) this;
        }

        public Criteria andCqlyEqualTo(BigDecimal value) {
            addCriterion("CQLY =", value, "cqly");
            return (Criteria) this;
        }

        public Criteria andCqlyNotEqualTo(BigDecimal value) {
            addCriterion("CQLY <>", value, "cqly");
            return (Criteria) this;
        }

        public Criteria andCqlyGreaterThan(BigDecimal value) {
            addCriterion("CQLY >", value, "cqly");
            return (Criteria) this;
        }

        public Criteria andCqlyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CQLY >=", value, "cqly");
            return (Criteria) this;
        }

        public Criteria andCqlyLessThan(BigDecimal value) {
            addCriterion("CQLY <", value, "cqly");
            return (Criteria) this;
        }

        public Criteria andCqlyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CQLY <=", value, "cqly");
            return (Criteria) this;
        }

        public Criteria andCqlyIn(List<BigDecimal> values) {
            addCriterion("CQLY in", values, "cqly");
            return (Criteria) this;
        }

        public Criteria andCqlyNotIn(List<BigDecimal> values) {
            addCriterion("CQLY not in", values, "cqly");
            return (Criteria) this;
        }

        public Criteria andCqlyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CQLY between", value1, value2, "cqly");
            return (Criteria) this;
        }

        public Criteria andCqlyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CQLY not between", value1, value2, "cqly");
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

        public Criteria andTddbsjIsNull() {
            addCriterion("TDDBSJ is null");
            return (Criteria) this;
        }

        public Criteria andTddbsjIsNotNull() {
            addCriterion("TDDBSJ is not null");
            return (Criteria) this;
        }

        public Criteria andTddbsjEqualTo(Date value) {
            addCriterionForJDBCDate("TDDBSJ =", value, "tddbsj");
            return (Criteria) this;
        }

        public Criteria andTddbsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("TDDBSJ <>", value, "tddbsj");
            return (Criteria) this;
        }

        public Criteria andTddbsjGreaterThan(Date value) {
            addCriterionForJDBCDate("TDDBSJ >", value, "tddbsj");
            return (Criteria) this;
        }

        public Criteria andTddbsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TDDBSJ >=", value, "tddbsj");
            return (Criteria) this;
        }

        public Criteria andTddbsjLessThan(Date value) {
            addCriterionForJDBCDate("TDDBSJ <", value, "tddbsj");
            return (Criteria) this;
        }

        public Criteria andTddbsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TDDBSJ <=", value, "tddbsj");
            return (Criteria) this;
        }

        public Criteria andTddbsjIn(List<Date> values) {
            addCriterionForJDBCDate("TDDBSJ in", values, "tddbsj");
            return (Criteria) this;
        }

        public Criteria andTddbsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("TDDBSJ not in", values, "tddbsj");
            return (Criteria) this;
        }

        public Criteria andTddbsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TDDBSJ between", value1, value2, "tddbsj");
            return (Criteria) this;
        }

        public Criteria andTddbsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TDDBSJ not between", value1, value2, "tddbsj");
            return (Criteria) this;
        }

        public Criteria andTddbrIsNull() {
            addCriterion("TDDBR is null");
            return (Criteria) this;
        }

        public Criteria andTddbrIsNotNull() {
            addCriterion("TDDBR is not null");
            return (Criteria) this;
        }

        public Criteria andTddbrEqualTo(Object value) {
            addCriterion("TDDBR =", value, "tddbr");
            return (Criteria) this;
        }

        public Criteria andTddbrNotEqualTo(Object value) {
            addCriterion("TDDBR <>", value, "tddbr");
            return (Criteria) this;
        }

        public Criteria andTddbrGreaterThan(Object value) {
            addCriterion("TDDBR >", value, "tddbr");
            return (Criteria) this;
        }

        public Criteria andTddbrGreaterThanOrEqualTo(Object value) {
            addCriterion("TDDBR >=", value, "tddbr");
            return (Criteria) this;
        }

        public Criteria andTddbrLessThan(Object value) {
            addCriterion("TDDBR <", value, "tddbr");
            return (Criteria) this;
        }

        public Criteria andTddbrLessThanOrEqualTo(Object value) {
            addCriterion("TDDBR <=", value, "tddbr");
            return (Criteria) this;
        }

        public Criteria andTddbrIn(List<Object> values) {
            addCriterion("TDDBR in", values, "tddbr");
            return (Criteria) this;
        }

        public Criteria andTddbrNotIn(List<Object> values) {
            addCriterion("TDDBR not in", values, "tddbr");
            return (Criteria) this;
        }

        public Criteria andTddbrBetween(Object value1, Object value2) {
            addCriterion("TDDBR between", value1, value2, "tddbr");
            return (Criteria) this;
        }

        public Criteria andTddbrNotBetween(Object value1, Object value2) {
            addCriterion("TDDBR not between", value1, value2, "tddbr");
            return (Criteria) this;
        }

        public Criteria andTdcqzhIsNull() {
            addCriterion("TDCQZH is null");
            return (Criteria) this;
        }

        public Criteria andTdcqzhIsNotNull() {
            addCriterion("TDCQZH is not null");
            return (Criteria) this;
        }

        public Criteria andTdcqzhEqualTo(Object value) {
            addCriterion("TDCQZH =", value, "tdcqzh");
            return (Criteria) this;
        }

        public Criteria andTdcqzhNotEqualTo(Object value) {
            addCriterion("TDCQZH <>", value, "tdcqzh");
            return (Criteria) this;
        }

        public Criteria andTdcqzhGreaterThan(Object value) {
            addCriterion("TDCQZH >", value, "tdcqzh");
            return (Criteria) this;
        }

        public Criteria andTdcqzhGreaterThanOrEqualTo(Object value) {
            addCriterion("TDCQZH >=", value, "tdcqzh");
            return (Criteria) this;
        }

        public Criteria andTdcqzhLessThan(Object value) {
            addCriterion("TDCQZH <", value, "tdcqzh");
            return (Criteria) this;
        }

        public Criteria andTdcqzhLessThanOrEqualTo(Object value) {
            addCriterion("TDCQZH <=", value, "tdcqzh");
            return (Criteria) this;
        }

        public Criteria andTdcqzhIn(List<Object> values) {
            addCriterion("TDCQZH in", values, "tdcqzh");
            return (Criteria) this;
        }

        public Criteria andTdcqzhNotIn(List<Object> values) {
            addCriterion("TDCQZH not in", values, "tdcqzh");
            return (Criteria) this;
        }

        public Criteria andTdcqzhBetween(Object value1, Object value2) {
            addCriterion("TDCQZH between", value1, value2, "tdcqzh");
            return (Criteria) this;
        }

        public Criteria andTdcqzhNotBetween(Object value1, Object value2) {
            addCriterion("TDCQZH not between", value1, value2, "tdcqzh");
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

        public Criteria andDjjgdmIsNull() {
            addCriterion("DJJGDM is null");
            return (Criteria) this;
        }

        public Criteria andDjjgdmIsNotNull() {
            addCriterion("DJJGDM is not null");
            return (Criteria) this;
        }

        public Criteria andDjjgdmEqualTo(String value) {
            addCriterion("DJJGDM =", value, "djjgdm");
            return (Criteria) this;
        }

        public Criteria andDjjgdmNotEqualTo(String value) {
            addCriterion("DJJGDM <>", value, "djjgdm");
            return (Criteria) this;
        }

        public Criteria andDjjgdmGreaterThan(String value) {
            addCriterion("DJJGDM >", value, "djjgdm");
            return (Criteria) this;
        }

        public Criteria andDjjgdmGreaterThanOrEqualTo(String value) {
            addCriterion("DJJGDM >=", value, "djjgdm");
            return (Criteria) this;
        }

        public Criteria andDjjgdmLessThan(String value) {
            addCriterion("DJJGDM <", value, "djjgdm");
            return (Criteria) this;
        }

        public Criteria andDjjgdmLessThanOrEqualTo(String value) {
            addCriterion("DJJGDM <=", value, "djjgdm");
            return (Criteria) this;
        }

        public Criteria andDjjgdmLike(String value) {
            addCriterion("DJJGDM like", value, "djjgdm");
            return (Criteria) this;
        }

        public Criteria andDjjgdmNotLike(String value) {
            addCriterion("DJJGDM not like", value, "djjgdm");
            return (Criteria) this;
        }

        public Criteria andDjjgdmIn(List<String> values) {
            addCriterion("DJJGDM in", values, "djjgdm");
            return (Criteria) this;
        }

        public Criteria andDjjgdmNotIn(List<String> values) {
            addCriterion("DJJGDM not in", values, "djjgdm");
            return (Criteria) this;
        }

        public Criteria andDjjgdmBetween(String value1, String value2) {
            addCriterion("DJJGDM between", value1, value2, "djjgdm");
            return (Criteria) this;
        }

        public Criteria andDjjgdmNotBetween(String value1, String value2) {
            addCriterion("DJJGDM not between", value1, value2, "djjgdm");
            return (Criteria) this;
        }

        public Criteria andDjjgmcIsNull() {
            addCriterion("DJJGMC is null");
            return (Criteria) this;
        }

        public Criteria andDjjgmcIsNotNull() {
            addCriterion("DJJGMC is not null");
            return (Criteria) this;
        }

        public Criteria andDjjgmcEqualTo(String value) {
            addCriterion("DJJGMC =", value, "djjgmc");
            return (Criteria) this;
        }

        public Criteria andDjjgmcNotEqualTo(String value) {
            addCriterion("DJJGMC <>", value, "djjgmc");
            return (Criteria) this;
        }

        public Criteria andDjjgmcGreaterThan(String value) {
            addCriterion("DJJGMC >", value, "djjgmc");
            return (Criteria) this;
        }

        public Criteria andDjjgmcGreaterThanOrEqualTo(String value) {
            addCriterion("DJJGMC >=", value, "djjgmc");
            return (Criteria) this;
        }

        public Criteria andDjjgmcLessThan(String value) {
            addCriterion("DJJGMC <", value, "djjgmc");
            return (Criteria) this;
        }

        public Criteria andDjjgmcLessThanOrEqualTo(String value) {
            addCriterion("DJJGMC <=", value, "djjgmc");
            return (Criteria) this;
        }

        public Criteria andDjjgmcLike(String value) {
            addCriterion("DJJGMC like", value, "djjgmc");
            return (Criteria) this;
        }

        public Criteria andDjjgmcNotLike(String value) {
            addCriterion("DJJGMC not like", value, "djjgmc");
            return (Criteria) this;
        }

        public Criteria andDjjgmcIn(List<String> values) {
            addCriterion("DJJGMC in", values, "djjgmc");
            return (Criteria) this;
        }

        public Criteria andDjjgmcNotIn(List<String> values) {
            addCriterion("DJJGMC not in", values, "djjgmc");
            return (Criteria) this;
        }

        public Criteria andDjjgmcBetween(String value1, String value2) {
            addCriterion("DJJGMC between", value1, value2, "djjgmc");
            return (Criteria) this;
        }

        public Criteria andDjjgmcNotBetween(String value1, String value2) {
            addCriterion("DJJGMC not between", value1, value2, "djjgmc");
            return (Criteria) this;
        }

        public Criteria andTdzhIsNull() {
            addCriterion("TDZH is null");
            return (Criteria) this;
        }

        public Criteria andTdzhIsNotNull() {
            addCriterion("TDZH is not null");
            return (Criteria) this;
        }

        public Criteria andTdzhEqualTo(Object value) {
            addCriterion("TDZH =", value, "tdzh");
            return (Criteria) this;
        }

        public Criteria andTdzhNotEqualTo(Object value) {
            addCriterion("TDZH <>", value, "tdzh");
            return (Criteria) this;
        }

        public Criteria andTdzhGreaterThan(Object value) {
            addCriterion("TDZH >", value, "tdzh");
            return (Criteria) this;
        }

        public Criteria andTdzhGreaterThanOrEqualTo(Object value) {
            addCriterion("TDZH >=", value, "tdzh");
            return (Criteria) this;
        }

        public Criteria andTdzhLessThan(Object value) {
            addCriterion("TDZH <", value, "tdzh");
            return (Criteria) this;
        }

        public Criteria andTdzhLessThanOrEqualTo(Object value) {
            addCriterion("TDZH <=", value, "tdzh");
            return (Criteria) this;
        }

        public Criteria andTdzhIn(List<Object> values) {
            addCriterion("TDZH in", values, "tdzh");
            return (Criteria) this;
        }

        public Criteria andTdzhNotIn(List<Object> values) {
            addCriterion("TDZH not in", values, "tdzh");
            return (Criteria) this;
        }

        public Criteria andTdzhBetween(Object value1, Object value2) {
            addCriterion("TDZH between", value1, value2, "tdzh");
            return (Criteria) this;
        }

        public Criteria andTdzhNotBetween(Object value1, Object value2) {
            addCriterion("TDZH not between", value1, value2, "tdzh");
            return (Criteria) this;
        }

        public Criteria andQsxzIsNull() {
            addCriterion("QSXZ is null");
            return (Criteria) this;
        }

        public Criteria andQsxzIsNotNull() {
            addCriterion("QSXZ is not null");
            return (Criteria) this;
        }

        public Criteria andQsxzEqualTo(Object value) {
            addCriterion("QSXZ =", value, "qsxz");
            return (Criteria) this;
        }

        public Criteria andQsxzNotEqualTo(Object value) {
            addCriterion("QSXZ <>", value, "qsxz");
            return (Criteria) this;
        }

        public Criteria andQsxzGreaterThan(Object value) {
            addCriterion("QSXZ >", value, "qsxz");
            return (Criteria) this;
        }

        public Criteria andQsxzGreaterThanOrEqualTo(Object value) {
            addCriterion("QSXZ >=", value, "qsxz");
            return (Criteria) this;
        }

        public Criteria andQsxzLessThan(Object value) {
            addCriterion("QSXZ <", value, "qsxz");
            return (Criteria) this;
        }

        public Criteria andQsxzLessThanOrEqualTo(Object value) {
            addCriterion("QSXZ <=", value, "qsxz");
            return (Criteria) this;
        }

        public Criteria andQsxzIn(List<Object> values) {
            addCriterion("QSXZ in", values, "qsxz");
            return (Criteria) this;
        }

        public Criteria andQsxzNotIn(List<Object> values) {
            addCriterion("QSXZ not in", values, "qsxz");
            return (Criteria) this;
        }

        public Criteria andQsxzBetween(Object value1, Object value2) {
            addCriterion("QSXZ between", value1, value2, "qsxz");
            return (Criteria) this;
        }

        public Criteria andQsxzNotBetween(Object value1, Object value2) {
            addCriterion("QSXZ not between", value1, value2, "qsxz");
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

        public Criteria andTdytEqualTo(Object value) {
            addCriterion("TDYT =", value, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytNotEqualTo(Object value) {
            addCriterion("TDYT <>", value, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytGreaterThan(Object value) {
            addCriterion("TDYT >", value, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytGreaterThanOrEqualTo(Object value) {
            addCriterion("TDYT >=", value, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytLessThan(Object value) {
            addCriterion("TDYT <", value, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytLessThanOrEqualTo(Object value) {
            addCriterion("TDYT <=", value, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytIn(List<Object> values) {
            addCriterion("TDYT in", values, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytNotIn(List<Object> values) {
            addCriterion("TDYT not in", values, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytBetween(Object value1, Object value2) {
            addCriterion("TDYT between", value1, value2, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdytNotBetween(Object value1, Object value2) {
            addCriterion("TDYT not between", value1, value2, "tdyt");
            return (Criteria) this;
        }

        public Criteria andTdfzrqIsNull() {
            addCriterion("TDFZRQ is null");
            return (Criteria) this;
        }

        public Criteria andTdfzrqIsNotNull() {
            addCriterion("TDFZRQ is not null");
            return (Criteria) this;
        }

        public Criteria andTdfzrqEqualTo(Date value) {
            addCriterionForJDBCDate("TDFZRQ =", value, "tdfzrq");
            return (Criteria) this;
        }

        public Criteria andTdfzrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("TDFZRQ <>", value, "tdfzrq");
            return (Criteria) this;
        }

        public Criteria andTdfzrqGreaterThan(Date value) {
            addCriterionForJDBCDate("TDFZRQ >", value, "tdfzrq");
            return (Criteria) this;
        }

        public Criteria andTdfzrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TDFZRQ >=", value, "tdfzrq");
            return (Criteria) this;
        }

        public Criteria andTdfzrqLessThan(Date value) {
            addCriterionForJDBCDate("TDFZRQ <", value, "tdfzrq");
            return (Criteria) this;
        }

        public Criteria andTdfzrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TDFZRQ <=", value, "tdfzrq");
            return (Criteria) this;
        }

        public Criteria andTdfzrqIn(List<Date> values) {
            addCriterionForJDBCDate("TDFZRQ in", values, "tdfzrq");
            return (Criteria) this;
        }

        public Criteria andTdfzrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("TDFZRQ not in", values, "tdfzrq");
            return (Criteria) this;
        }

        public Criteria andTdfzrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TDFZRQ between", value1, value2, "tdfzrq");
            return (Criteria) this;
        }

        public Criteria andTdfzrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TDFZRQ not between", value1, value2, "tdfzrq");
            return (Criteria) this;
        }

        public Criteria andQdfsIsNull() {
            addCriterion("QDFS is null");
            return (Criteria) this;
        }

        public Criteria andQdfsIsNotNull() {
            addCriterion("QDFS is not null");
            return (Criteria) this;
        }

        public Criteria andQdfsEqualTo(Object value) {
            addCriterion("QDFS =", value, "qdfs");
            return (Criteria) this;
        }

        public Criteria andQdfsNotEqualTo(Object value) {
            addCriterion("QDFS <>", value, "qdfs");
            return (Criteria) this;
        }

        public Criteria andQdfsGreaterThan(Object value) {
            addCriterion("QDFS >", value, "qdfs");
            return (Criteria) this;
        }

        public Criteria andQdfsGreaterThanOrEqualTo(Object value) {
            addCriterion("QDFS >=", value, "qdfs");
            return (Criteria) this;
        }

        public Criteria andQdfsLessThan(Object value) {
            addCriterion("QDFS <", value, "qdfs");
            return (Criteria) this;
        }

        public Criteria andQdfsLessThanOrEqualTo(Object value) {
            addCriterion("QDFS <=", value, "qdfs");
            return (Criteria) this;
        }

        public Criteria andQdfsIn(List<Object> values) {
            addCriterion("QDFS in", values, "qdfs");
            return (Criteria) this;
        }

        public Criteria andQdfsNotIn(List<Object> values) {
            addCriterion("QDFS not in", values, "qdfs");
            return (Criteria) this;
        }

        public Criteria andQdfsBetween(Object value1, Object value2) {
            addCriterion("QDFS between", value1, value2, "qdfs");
            return (Criteria) this;
        }

        public Criteria andQdfsNotBetween(Object value1, Object value2) {
            addCriterion("QDFS not between", value1, value2, "qdfs");
            return (Criteria) this;
        }

        public Criteria andTdsyqmjIsNull() {
            addCriterion("TDSYQMJ is null");
            return (Criteria) this;
        }

        public Criteria andTdsyqmjIsNotNull() {
            addCriterion("TDSYQMJ is not null");
            return (Criteria) this;
        }

        public Criteria andTdsyqmjEqualTo(BigDecimal value) {
            addCriterion("TDSYQMJ =", value, "tdsyqmj");
            return (Criteria) this;
        }

        public Criteria andTdsyqmjNotEqualTo(BigDecimal value) {
            addCriterion("TDSYQMJ <>", value, "tdsyqmj");
            return (Criteria) this;
        }

        public Criteria andTdsyqmjGreaterThan(BigDecimal value) {
            addCriterion("TDSYQMJ >", value, "tdsyqmj");
            return (Criteria) this;
        }

        public Criteria andTdsyqmjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TDSYQMJ >=", value, "tdsyqmj");
            return (Criteria) this;
        }

        public Criteria andTdsyqmjLessThan(BigDecimal value) {
            addCriterion("TDSYQMJ <", value, "tdsyqmj");
            return (Criteria) this;
        }

        public Criteria andTdsyqmjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TDSYQMJ <=", value, "tdsyqmj");
            return (Criteria) this;
        }

        public Criteria andTdsyqmjIn(List<BigDecimal> values) {
            addCriterion("TDSYQMJ in", values, "tdsyqmj");
            return (Criteria) this;
        }

        public Criteria andTdsyqmjNotIn(List<BigDecimal> values) {
            addCriterion("TDSYQMJ not in", values, "tdsyqmj");
            return (Criteria) this;
        }

        public Criteria andTdsyqmjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TDSYQMJ between", value1, value2, "tdsyqmj");
            return (Criteria) this;
        }

        public Criteria andTdsyqmjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TDSYQMJ not between", value1, value2, "tdsyqmj");
            return (Criteria) this;
        }

        public Criteria andJyrqIsNull() {
            addCriterion("JYRQ is null");
            return (Criteria) this;
        }

        public Criteria andJyrqIsNotNull() {
            addCriterion("JYRQ is not null");
            return (Criteria) this;
        }

        public Criteria andJyrqEqualTo(Date value) {
            addCriterionForJDBCDate("JYRQ =", value, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJyrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("JYRQ <>", value, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJyrqGreaterThan(Date value) {
            addCriterionForJDBCDate("JYRQ >", value, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJyrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JYRQ >=", value, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJyrqLessThan(Date value) {
            addCriterionForJDBCDate("JYRQ <", value, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJyrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JYRQ <=", value, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJyrqIn(List<Date> values) {
            addCriterionForJDBCDate("JYRQ in", values, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJyrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("JYRQ not in", values, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJyrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JYRQ between", value1, value2, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJyrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JYRQ not between", value1, value2, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJgndIsNull() {
            addCriterion("JGND is null");
            return (Criteria) this;
        }

        public Criteria andJgndIsNotNull() {
            addCriterion("JGND is not null");
            return (Criteria) this;
        }

        public Criteria andJgndEqualTo(Object value) {
            addCriterion("JGND =", value, "jgnd");
            return (Criteria) this;
        }

        public Criteria andJgndNotEqualTo(Object value) {
            addCriterion("JGND <>", value, "jgnd");
            return (Criteria) this;
        }

        public Criteria andJgndGreaterThan(Object value) {
            addCriterion("JGND >", value, "jgnd");
            return (Criteria) this;
        }

        public Criteria andJgndGreaterThanOrEqualTo(Object value) {
            addCriterion("JGND >=", value, "jgnd");
            return (Criteria) this;
        }

        public Criteria andJgndLessThan(Object value) {
            addCriterion("JGND <", value, "jgnd");
            return (Criteria) this;
        }

        public Criteria andJgndLessThanOrEqualTo(Object value) {
            addCriterion("JGND <=", value, "jgnd");
            return (Criteria) this;
        }

        public Criteria andJgndIn(List<Object> values) {
            addCriterion("JGND in", values, "jgnd");
            return (Criteria) this;
        }

        public Criteria andJgndNotIn(List<Object> values) {
            addCriterion("JGND not in", values, "jgnd");
            return (Criteria) this;
        }

        public Criteria andJgndBetween(Object value1, Object value2) {
            addCriterion("JGND between", value1, value2, "jgnd");
            return (Criteria) this;
        }

        public Criteria andJgndNotBetween(Object value1, Object value2) {
            addCriterion("JGND not between", value1, value2, "jgnd");
            return (Criteria) this;
        }

        public Criteria andZbkReceivenoIsNull() {
            addCriterion("ZBK_RECEIVENO is null");
            return (Criteria) this;
        }

        public Criteria andZbkReceivenoIsNotNull() {
            addCriterion("ZBK_RECEIVENO is not null");
            return (Criteria) this;
        }

        public Criteria andZbkReceivenoEqualTo(Object value) {
            addCriterion("ZBK_RECEIVENO =", value, "zbkReceiveno");
            return (Criteria) this;
        }

        public Criteria andZbkReceivenoNotEqualTo(Object value) {
            addCriterion("ZBK_RECEIVENO <>", value, "zbkReceiveno");
            return (Criteria) this;
        }

        public Criteria andZbkReceivenoGreaterThan(Object value) {
            addCriterion("ZBK_RECEIVENO >", value, "zbkReceiveno");
            return (Criteria) this;
        }

        public Criteria andZbkReceivenoGreaterThanOrEqualTo(Object value) {
            addCriterion("ZBK_RECEIVENO >=", value, "zbkReceiveno");
            return (Criteria) this;
        }

        public Criteria andZbkReceivenoLessThan(Object value) {
            addCriterion("ZBK_RECEIVENO <", value, "zbkReceiveno");
            return (Criteria) this;
        }

        public Criteria andZbkReceivenoLessThanOrEqualTo(Object value) {
            addCriterion("ZBK_RECEIVENO <=", value, "zbkReceiveno");
            return (Criteria) this;
        }

        public Criteria andZbkReceivenoIn(List<Object> values) {
            addCriterion("ZBK_RECEIVENO in", values, "zbkReceiveno");
            return (Criteria) this;
        }

        public Criteria andZbkReceivenoNotIn(List<Object> values) {
            addCriterion("ZBK_RECEIVENO not in", values, "zbkReceiveno");
            return (Criteria) this;
        }

        public Criteria andZbkReceivenoBetween(Object value1, Object value2) {
            addCriterion("ZBK_RECEIVENO between", value1, value2, "zbkReceiveno");
            return (Criteria) this;
        }

        public Criteria andZbkReceivenoNotBetween(Object value1, Object value2) {
            addCriterion("ZBK_RECEIVENO not between", value1, value2, "zbkReceiveno");
            return (Criteria) this;
        }

        public Criteria andZjfAfssjclztIsNull() {
            addCriterion("ZJF_AFSSJCLZT is null");
            return (Criteria) this;
        }

        public Criteria andZjfAfssjclztIsNotNull() {
            addCriterion("ZJF_AFSSJCLZT is not null");
            return (Criteria) this;
        }

        public Criteria andZjfAfssjclztEqualTo(Object value) {
            addCriterion("ZJF_AFSSJCLZT =", value, "zjfAfssjclzt");
            return (Criteria) this;
        }

        public Criteria andZjfAfssjclztNotEqualTo(Object value) {
            addCriterion("ZJF_AFSSJCLZT <>", value, "zjfAfssjclzt");
            return (Criteria) this;
        }

        public Criteria andZjfAfssjclztGreaterThan(Object value) {
            addCriterion("ZJF_AFSSJCLZT >", value, "zjfAfssjclzt");
            return (Criteria) this;
        }

        public Criteria andZjfAfssjclztGreaterThanOrEqualTo(Object value) {
            addCriterion("ZJF_AFSSJCLZT >=", value, "zjfAfssjclzt");
            return (Criteria) this;
        }

        public Criteria andZjfAfssjclztLessThan(Object value) {
            addCriterion("ZJF_AFSSJCLZT <", value, "zjfAfssjclzt");
            return (Criteria) this;
        }

        public Criteria andZjfAfssjclztLessThanOrEqualTo(Object value) {
            addCriterion("ZJF_AFSSJCLZT <=", value, "zjfAfssjclzt");
            return (Criteria) this;
        }

        public Criteria andZjfAfssjclztIn(List<Object> values) {
            addCriterion("ZJF_AFSSJCLZT in", values, "zjfAfssjclzt");
            return (Criteria) this;
        }

        public Criteria andZjfAfssjclztNotIn(List<Object> values) {
            addCriterion("ZJF_AFSSJCLZT not in", values, "zjfAfssjclzt");
            return (Criteria) this;
        }

        public Criteria andZjfAfssjclztBetween(Object value1, Object value2) {
            addCriterion("ZJF_AFSSJCLZT between", value1, value2, "zjfAfssjclzt");
            return (Criteria) this;
        }

        public Criteria andZjfAfssjclztNotBetween(Object value1, Object value2) {
            addCriterion("ZJF_AFSSJCLZT not between", value1, value2, "zjfAfssjclzt");
            return (Criteria) this;
        }

        public Criteria andZjfSjxgnameIsNull() {
            addCriterion("ZJF_SJXGNAME is null");
            return (Criteria) this;
        }

        public Criteria andZjfSjxgnameIsNotNull() {
            addCriterion("ZJF_SJXGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andZjfSjxgnameEqualTo(Object value) {
            addCriterion("ZJF_SJXGNAME =", value, "zjfSjxgname");
            return (Criteria) this;
        }

        public Criteria andZjfSjxgnameNotEqualTo(Object value) {
            addCriterion("ZJF_SJXGNAME <>", value, "zjfSjxgname");
            return (Criteria) this;
        }

        public Criteria andZjfSjxgnameGreaterThan(Object value) {
            addCriterion("ZJF_SJXGNAME >", value, "zjfSjxgname");
            return (Criteria) this;
        }

        public Criteria andZjfSjxgnameGreaterThanOrEqualTo(Object value) {
            addCriterion("ZJF_SJXGNAME >=", value, "zjfSjxgname");
            return (Criteria) this;
        }

        public Criteria andZjfSjxgnameLessThan(Object value) {
            addCriterion("ZJF_SJXGNAME <", value, "zjfSjxgname");
            return (Criteria) this;
        }

        public Criteria andZjfSjxgnameLessThanOrEqualTo(Object value) {
            addCriterion("ZJF_SJXGNAME <=", value, "zjfSjxgname");
            return (Criteria) this;
        }

        public Criteria andZjfSjxgnameIn(List<Object> values) {
            addCriterion("ZJF_SJXGNAME in", values, "zjfSjxgname");
            return (Criteria) this;
        }

        public Criteria andZjfSjxgnameNotIn(List<Object> values) {
            addCriterion("ZJF_SJXGNAME not in", values, "zjfSjxgname");
            return (Criteria) this;
        }

        public Criteria andZjfSjxgnameBetween(Object value1, Object value2) {
            addCriterion("ZJF_SJXGNAME between", value1, value2, "zjfSjxgname");
            return (Criteria) this;
        }

        public Criteria andZjfSjxgnameNotBetween(Object value1, Object value2) {
            addCriterion("ZJF_SJXGNAME not between", value1, value2, "zjfSjxgname");
            return (Criteria) this;
        }

        public Criteria andZjfSjxgjiluIsNull() {
            addCriterion("ZJF_SJXGJILU is null");
            return (Criteria) this;
        }

        public Criteria andZjfSjxgjiluIsNotNull() {
            addCriterion("ZJF_SJXGJILU is not null");
            return (Criteria) this;
        }

        public Criteria andZjfSjxgjiluEqualTo(Object value) {
            addCriterion("ZJF_SJXGJILU =", value, "zjfSjxgjilu");
            return (Criteria) this;
        }

        public Criteria andZjfSjxgjiluNotEqualTo(Object value) {
            addCriterion("ZJF_SJXGJILU <>", value, "zjfSjxgjilu");
            return (Criteria) this;
        }

        public Criteria andZjfSjxgjiluGreaterThan(Object value) {
            addCriterion("ZJF_SJXGJILU >", value, "zjfSjxgjilu");
            return (Criteria) this;
        }

        public Criteria andZjfSjxgjiluGreaterThanOrEqualTo(Object value) {
            addCriterion("ZJF_SJXGJILU >=", value, "zjfSjxgjilu");
            return (Criteria) this;
        }

        public Criteria andZjfSjxgjiluLessThan(Object value) {
            addCriterion("ZJF_SJXGJILU <", value, "zjfSjxgjilu");
            return (Criteria) this;
        }

        public Criteria andZjfSjxgjiluLessThanOrEqualTo(Object value) {
            addCriterion("ZJF_SJXGJILU <=", value, "zjfSjxgjilu");
            return (Criteria) this;
        }

        public Criteria andZjfSjxgjiluIn(List<Object> values) {
            addCriterion("ZJF_SJXGJILU in", values, "zjfSjxgjilu");
            return (Criteria) this;
        }

        public Criteria andZjfSjxgjiluNotIn(List<Object> values) {
            addCriterion("ZJF_SJXGJILU not in", values, "zjfSjxgjilu");
            return (Criteria) this;
        }

        public Criteria andZjfSjxgjiluBetween(Object value1, Object value2) {
            addCriterion("ZJF_SJXGJILU between", value1, value2, "zjfSjxgjilu");
            return (Criteria) this;
        }

        public Criteria andZjfSjxgjiluNotBetween(Object value1, Object value2) {
            addCriterion("ZJF_SJXGJILU not between", value1, value2, "zjfSjxgjilu");
            return (Criteria) this;
        }

        public Criteria andYwrIsNull() {
            addCriterion("YWR is null");
            return (Criteria) this;
        }

        public Criteria andYwrIsNotNull() {
            addCriterion("YWR is not null");
            return (Criteria) this;
        }

        public Criteria andYwrEqualTo(Object value) {
            addCriterion("YWR =", value, "ywr");
            return (Criteria) this;
        }

        public Criteria andYwrNotEqualTo(Object value) {
            addCriterion("YWR <>", value, "ywr");
            return (Criteria) this;
        }

        public Criteria andYwrGreaterThan(Object value) {
            addCriterion("YWR >", value, "ywr");
            return (Criteria) this;
        }

        public Criteria andYwrGreaterThanOrEqualTo(Object value) {
            addCriterion("YWR >=", value, "ywr");
            return (Criteria) this;
        }

        public Criteria andYwrLessThan(Object value) {
            addCriterion("YWR <", value, "ywr");
            return (Criteria) this;
        }

        public Criteria andYwrLessThanOrEqualTo(Object value) {
            addCriterion("YWR <=", value, "ywr");
            return (Criteria) this;
        }

        public Criteria andYwrIn(List<Object> values) {
            addCriterion("YWR in", values, "ywr");
            return (Criteria) this;
        }

        public Criteria andYwrNotIn(List<Object> values) {
            addCriterion("YWR not in", values, "ywr");
            return (Criteria) this;
        }

        public Criteria andYwrBetween(Object value1, Object value2) {
            addCriterion("YWR between", value1, value2, "ywr");
            return (Criteria) this;
        }

        public Criteria andYwrNotBetween(Object value1, Object value2) {
            addCriterion("YWR not between", value1, value2, "ywr");
            return (Criteria) this;
        }

        public Criteria andYwrzjbhIsNull() {
            addCriterion("YWRZJBH is null");
            return (Criteria) this;
        }

        public Criteria andYwrzjbhIsNotNull() {
            addCriterion("YWRZJBH is not null");
            return (Criteria) this;
        }

        public Criteria andYwrzjbhEqualTo(Object value) {
            addCriterion("YWRZJBH =", value, "ywrzjbh");
            return (Criteria) this;
        }

        public Criteria andYwrzjbhNotEqualTo(Object value) {
            addCriterion("YWRZJBH <>", value, "ywrzjbh");
            return (Criteria) this;
        }

        public Criteria andYwrzjbhGreaterThan(Object value) {
            addCriterion("YWRZJBH >", value, "ywrzjbh");
            return (Criteria) this;
        }

        public Criteria andYwrzjbhGreaterThanOrEqualTo(Object value) {
            addCriterion("YWRZJBH >=", value, "ywrzjbh");
            return (Criteria) this;
        }

        public Criteria andYwrzjbhLessThan(Object value) {
            addCriterion("YWRZJBH <", value, "ywrzjbh");
            return (Criteria) this;
        }

        public Criteria andYwrzjbhLessThanOrEqualTo(Object value) {
            addCriterion("YWRZJBH <=", value, "ywrzjbh");
            return (Criteria) this;
        }

        public Criteria andYwrzjbhIn(List<Object> values) {
            addCriterion("YWRZJBH in", values, "ywrzjbh");
            return (Criteria) this;
        }

        public Criteria andYwrzjbhNotIn(List<Object> values) {
            addCriterion("YWRZJBH not in", values, "ywrzjbh");
            return (Criteria) this;
        }

        public Criteria andYwrzjbhBetween(Object value1, Object value2) {
            addCriterion("YWRZJBH between", value1, value2, "ywrzjbh");
            return (Criteria) this;
        }

        public Criteria andYwrzjbhNotBetween(Object value1, Object value2) {
            addCriterion("YWRZJBH not between", value1, value2, "ywrzjbh");
            return (Criteria) this;
        }

        public Criteria andZjfDahIsNull() {
            addCriterion("ZJF_DAH is null");
            return (Criteria) this;
        }

        public Criteria andZjfDahIsNotNull() {
            addCriterion("ZJF_DAH is not null");
            return (Criteria) this;
        }

        public Criteria andZjfDahEqualTo(Object value) {
            addCriterion("ZJF_DAH =", value, "zjfDah");
            return (Criteria) this;
        }

        public Criteria andZjfDahNotEqualTo(Object value) {
            addCriterion("ZJF_DAH <>", value, "zjfDah");
            return (Criteria) this;
        }

        public Criteria andZjfDahGreaterThan(Object value) {
            addCriterion("ZJF_DAH >", value, "zjfDah");
            return (Criteria) this;
        }

        public Criteria andZjfDahGreaterThanOrEqualTo(Object value) {
            addCriterion("ZJF_DAH >=", value, "zjfDah");
            return (Criteria) this;
        }

        public Criteria andZjfDahLessThan(Object value) {
            addCriterion("ZJF_DAH <", value, "zjfDah");
            return (Criteria) this;
        }

        public Criteria andZjfDahLessThanOrEqualTo(Object value) {
            addCriterion("ZJF_DAH <=", value, "zjfDah");
            return (Criteria) this;
        }

        public Criteria andZjfDahIn(List<Object> values) {
            addCriterion("ZJF_DAH in", values, "zjfDah");
            return (Criteria) this;
        }

        public Criteria andZjfDahNotIn(List<Object> values) {
            addCriterion("ZJF_DAH not in", values, "zjfDah");
            return (Criteria) this;
        }

        public Criteria andZjfDahBetween(Object value1, Object value2) {
            addCriterion("ZJF_DAH between", value1, value2, "zjfDah");
            return (Criteria) this;
        }

        public Criteria andZjfDahNotBetween(Object value1, Object value2) {
            addCriterion("ZJF_DAH not between", value1, value2, "zjfDah");
            return (Criteria) this;
        }

        public Criteria andZjfBdcqzhIsNull() {
            addCriterion("ZJF_BDCQZH is null");
            return (Criteria) this;
        }

        public Criteria andZjfBdcqzhIsNotNull() {
            addCriterion("ZJF_BDCQZH is not null");
            return (Criteria) this;
        }

        public Criteria andZjfBdcqzhEqualTo(Object value) {
            addCriterion("ZJF_BDCQZH =", value, "zjfBdcqzh");
            return (Criteria) this;
        }

        public Criteria andZjfBdcqzhNotEqualTo(Object value) {
            addCriterion("ZJF_BDCQZH <>", value, "zjfBdcqzh");
            return (Criteria) this;
        }

        public Criteria andZjfBdcqzhGreaterThan(Object value) {
            addCriterion("ZJF_BDCQZH >", value, "zjfBdcqzh");
            return (Criteria) this;
        }

        public Criteria andZjfBdcqzhGreaterThanOrEqualTo(Object value) {
            addCriterion("ZJF_BDCQZH >=", value, "zjfBdcqzh");
            return (Criteria) this;
        }

        public Criteria andZjfBdcqzhLessThan(Object value) {
            addCriterion("ZJF_BDCQZH <", value, "zjfBdcqzh");
            return (Criteria) this;
        }

        public Criteria andZjfBdcqzhLessThanOrEqualTo(Object value) {
            addCriterion("ZJF_BDCQZH <=", value, "zjfBdcqzh");
            return (Criteria) this;
        }

        public Criteria andZjfBdcqzhIn(List<Object> values) {
            addCriterion("ZJF_BDCQZH in", values, "zjfBdcqzh");
            return (Criteria) this;
        }

        public Criteria andZjfBdcqzhNotIn(List<Object> values) {
            addCriterion("ZJF_BDCQZH not in", values, "zjfBdcqzh");
            return (Criteria) this;
        }

        public Criteria andZjfBdcqzhBetween(Object value1, Object value2) {
            addCriterion("ZJF_BDCQZH between", value1, value2, "zjfBdcqzh");
            return (Criteria) this;
        }

        public Criteria andZjfBdcqzhNotBetween(Object value1, Object value2) {
            addCriterion("ZJF_BDCQZH not between", value1, value2, "zjfBdcqzh");
            return (Criteria) this;
        }

        public Criteria andZjfFdzlIsNull() {
            addCriterion("ZJF_FDZL is null");
            return (Criteria) this;
        }

        public Criteria andZjfFdzlIsNotNull() {
            addCriterion("ZJF_FDZL is not null");
            return (Criteria) this;
        }

        public Criteria andZjfFdzlEqualTo(Object value) {
            addCriterion("ZJF_FDZL =", value, "zjfFdzl");
            return (Criteria) this;
        }

        public Criteria andZjfFdzlNotEqualTo(Object value) {
            addCriterion("ZJF_FDZL <>", value, "zjfFdzl");
            return (Criteria) this;
        }

        public Criteria andZjfFdzlGreaterThan(Object value) {
            addCriterion("ZJF_FDZL >", value, "zjfFdzl");
            return (Criteria) this;
        }

        public Criteria andZjfFdzlGreaterThanOrEqualTo(Object value) {
            addCriterion("ZJF_FDZL >=", value, "zjfFdzl");
            return (Criteria) this;
        }

        public Criteria andZjfFdzlLessThan(Object value) {
            addCriterion("ZJF_FDZL <", value, "zjfFdzl");
            return (Criteria) this;
        }

        public Criteria andZjfFdzlLessThanOrEqualTo(Object value) {
            addCriterion("ZJF_FDZL <=", value, "zjfFdzl");
            return (Criteria) this;
        }

        public Criteria andZjfFdzlIn(List<Object> values) {
            addCriterion("ZJF_FDZL in", values, "zjfFdzl");
            return (Criteria) this;
        }

        public Criteria andZjfFdzlNotIn(List<Object> values) {
            addCriterion("ZJF_FDZL not in", values, "zjfFdzl");
            return (Criteria) this;
        }

        public Criteria andZjfFdzlBetween(Object value1, Object value2) {
            addCriterion("ZJF_FDZL between", value1, value2, "zjfFdzl");
            return (Criteria) this;
        }

        public Criteria andZjfFdzlNotBetween(Object value1, Object value2) {
            addCriterion("ZJF_FDZL not between", value1, value2, "zjfFdzl");
            return (Criteria) this;
        }

        public Criteria andZjfQlrIsNull() {
            addCriterion("ZJF_QLR is null");
            return (Criteria) this;
        }

        public Criteria andZjfQlrIsNotNull() {
            addCriterion("ZJF_QLR is not null");
            return (Criteria) this;
        }

        public Criteria andZjfQlrEqualTo(Object value) {
            addCriterion("ZJF_QLR =", value, "zjfQlr");
            return (Criteria) this;
        }

        public Criteria andZjfQlrNotEqualTo(Object value) {
            addCriterion("ZJF_QLR <>", value, "zjfQlr");
            return (Criteria) this;
        }

        public Criteria andZjfQlrGreaterThan(Object value) {
            addCriterion("ZJF_QLR >", value, "zjfQlr");
            return (Criteria) this;
        }

        public Criteria andZjfQlrGreaterThanOrEqualTo(Object value) {
            addCriterion("ZJF_QLR >=", value, "zjfQlr");
            return (Criteria) this;
        }

        public Criteria andZjfQlrLessThan(Object value) {
            addCriterion("ZJF_QLR <", value, "zjfQlr");
            return (Criteria) this;
        }

        public Criteria andZjfQlrLessThanOrEqualTo(Object value) {
            addCriterion("ZJF_QLR <=", value, "zjfQlr");
            return (Criteria) this;
        }

        public Criteria andZjfQlrIn(List<Object> values) {
            addCriterion("ZJF_QLR in", values, "zjfQlr");
            return (Criteria) this;
        }

        public Criteria andZjfQlrNotIn(List<Object> values) {
            addCriterion("ZJF_QLR not in", values, "zjfQlr");
            return (Criteria) this;
        }

        public Criteria andZjfQlrBetween(Object value1, Object value2) {
            addCriterion("ZJF_QLR between", value1, value2, "zjfQlr");
            return (Criteria) this;
        }

        public Criteria andZjfQlrNotBetween(Object value1, Object value2) {
            addCriterion("ZJF_QLR not between", value1, value2, "zjfQlr");
            return (Criteria) this;
        }

        public Criteria andZjfQlrzjbhIsNull() {
            addCriterion("ZJF_QLRZJBH is null");
            return (Criteria) this;
        }

        public Criteria andZjfQlrzjbhIsNotNull() {
            addCriterion("ZJF_QLRZJBH is not null");
            return (Criteria) this;
        }

        public Criteria andZjfQlrzjbhEqualTo(Object value) {
            addCriterion("ZJF_QLRZJBH =", value, "zjfQlrzjbh");
            return (Criteria) this;
        }

        public Criteria andZjfQlrzjbhNotEqualTo(Object value) {
            addCriterion("ZJF_QLRZJBH <>", value, "zjfQlrzjbh");
            return (Criteria) this;
        }

        public Criteria andZjfQlrzjbhGreaterThan(Object value) {
            addCriterion("ZJF_QLRZJBH >", value, "zjfQlrzjbh");
            return (Criteria) this;
        }

        public Criteria andZjfQlrzjbhGreaterThanOrEqualTo(Object value) {
            addCriterion("ZJF_QLRZJBH >=", value, "zjfQlrzjbh");
            return (Criteria) this;
        }

        public Criteria andZjfQlrzjbhLessThan(Object value) {
            addCriterion("ZJF_QLRZJBH <", value, "zjfQlrzjbh");
            return (Criteria) this;
        }

        public Criteria andZjfQlrzjbhLessThanOrEqualTo(Object value) {
            addCriterion("ZJF_QLRZJBH <=", value, "zjfQlrzjbh");
            return (Criteria) this;
        }

        public Criteria andZjfQlrzjbhIn(List<Object> values) {
            addCriterion("ZJF_QLRZJBH in", values, "zjfQlrzjbh");
            return (Criteria) this;
        }

        public Criteria andZjfQlrzjbhNotIn(List<Object> values) {
            addCriterion("ZJF_QLRZJBH not in", values, "zjfQlrzjbh");
            return (Criteria) this;
        }

        public Criteria andZjfQlrzjbhBetween(Object value1, Object value2) {
            addCriterion("ZJF_QLRZJBH between", value1, value2, "zjfQlrzjbh");
            return (Criteria) this;
        }

        public Criteria andZjfQlrzjbhNotBetween(Object value1, Object value2) {
            addCriterion("ZJF_QLRZJBH not between", value1, value2, "zjfQlrzjbh");
            return (Criteria) this;
        }

        public Criteria andZjfSjblluIsNull() {
            addCriterion("ZJF_SJBLLU is null");
            return (Criteria) this;
        }

        public Criteria andZjfSjblluIsNotNull() {
            addCriterion("ZJF_SJBLLU is not null");
            return (Criteria) this;
        }

        public Criteria andZjfSjblluEqualTo(Object value) {
            addCriterion("ZJF_SJBLLU =", value, "zjfSjbllu");
            return (Criteria) this;
        }

        public Criteria andZjfSjblluNotEqualTo(Object value) {
            addCriterion("ZJF_SJBLLU <>", value, "zjfSjbllu");
            return (Criteria) this;
        }

        public Criteria andZjfSjblluGreaterThan(Object value) {
            addCriterion("ZJF_SJBLLU >", value, "zjfSjbllu");
            return (Criteria) this;
        }

        public Criteria andZjfSjblluGreaterThanOrEqualTo(Object value) {
            addCriterion("ZJF_SJBLLU >=", value, "zjfSjbllu");
            return (Criteria) this;
        }

        public Criteria andZjfSjblluLessThan(Object value) {
            addCriterion("ZJF_SJBLLU <", value, "zjfSjbllu");
            return (Criteria) this;
        }

        public Criteria andZjfSjblluLessThanOrEqualTo(Object value) {
            addCriterion("ZJF_SJBLLU <=", value, "zjfSjbllu");
            return (Criteria) this;
        }

        public Criteria andZjfSjblluIn(List<Object> values) {
            addCriterion("ZJF_SJBLLU in", values, "zjfSjbllu");
            return (Criteria) this;
        }

        public Criteria andZjfSjblluNotIn(List<Object> values) {
            addCriterion("ZJF_SJBLLU not in", values, "zjfSjbllu");
            return (Criteria) this;
        }

        public Criteria andZjfSjblluBetween(Object value1, Object value2) {
            addCriterion("ZJF_SJBLLU between", value1, value2, "zjfSjbllu");
            return (Criteria) this;
        }

        public Criteria andZjfSjblluNotBetween(Object value1, Object value2) {
            addCriterion("ZJF_SJBLLU not between", value1, value2, "zjfSjbllu");
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

        public Criteria andZyfghbbsIsNull() {
            addCriterion("ZYFGHBBS is null");
            return (Criteria) this;
        }

        public Criteria andZyfghbbsIsNotNull() {
            addCriterion("ZYFGHBBS is not null");
            return (Criteria) this;
        }

        public Criteria andZyfghbbsEqualTo(BigDecimal value) {
            addCriterion("ZYFGHBBS =", value, "zyfghbbs");
            return (Criteria) this;
        }

        public Criteria andZyfghbbsNotEqualTo(BigDecimal value) {
            addCriterion("ZYFGHBBS <>", value, "zyfghbbs");
            return (Criteria) this;
        }

        public Criteria andZyfghbbsGreaterThan(BigDecimal value) {
            addCriterion("ZYFGHBBS >", value, "zyfghbbs");
            return (Criteria) this;
        }

        public Criteria andZyfghbbsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZYFGHBBS >=", value, "zyfghbbs");
            return (Criteria) this;
        }

        public Criteria andZyfghbbsLessThan(BigDecimal value) {
            addCriterion("ZYFGHBBS <", value, "zyfghbbs");
            return (Criteria) this;
        }

        public Criteria andZyfghbbsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZYFGHBBS <=", value, "zyfghbbs");
            return (Criteria) this;
        }

        public Criteria andZyfghbbsIn(List<BigDecimal> values) {
            addCriterion("ZYFGHBBS in", values, "zyfghbbs");
            return (Criteria) this;
        }

        public Criteria andZyfghbbsNotIn(List<BigDecimal> values) {
            addCriterion("ZYFGHBBS not in", values, "zyfghbbs");
            return (Criteria) this;
        }

        public Criteria andZyfghbbsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZYFGHBBS between", value1, value2, "zyfghbbs");
            return (Criteria) this;
        }

        public Criteria andZyfghbbsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZYFGHBBS not between", value1, value2, "zyfghbbs");
            return (Criteria) this;
        }

        public Criteria andFwxzmcIsNull() {
            addCriterion("FWXZMC is null");
            return (Criteria) this;
        }

        public Criteria andFwxzmcIsNotNull() {
            addCriterion("FWXZMC is not null");
            return (Criteria) this;
        }

        public Criteria andFwxzmcEqualTo(String value) {
            addCriterion("FWXZMC =", value, "fwxzmc");
            return (Criteria) this;
        }

        public Criteria andFwxzmcNotEqualTo(String value) {
            addCriterion("FWXZMC <>", value, "fwxzmc");
            return (Criteria) this;
        }

        public Criteria andFwxzmcGreaterThan(String value) {
            addCriterion("FWXZMC >", value, "fwxzmc");
            return (Criteria) this;
        }

        public Criteria andFwxzmcGreaterThanOrEqualTo(String value) {
            addCriterion("FWXZMC >=", value, "fwxzmc");
            return (Criteria) this;
        }

        public Criteria andFwxzmcLessThan(String value) {
            addCriterion("FWXZMC <", value, "fwxzmc");
            return (Criteria) this;
        }

        public Criteria andFwxzmcLessThanOrEqualTo(String value) {
            addCriterion("FWXZMC <=", value, "fwxzmc");
            return (Criteria) this;
        }

        public Criteria andFwxzmcLike(String value) {
            addCriterion("FWXZMC like", value, "fwxzmc");
            return (Criteria) this;
        }

        public Criteria andFwxzmcNotLike(String value) {
            addCriterion("FWXZMC not like", value, "fwxzmc");
            return (Criteria) this;
        }

        public Criteria andFwxzmcIn(List<String> values) {
            addCriterion("FWXZMC in", values, "fwxzmc");
            return (Criteria) this;
        }

        public Criteria andFwxzmcNotIn(List<String> values) {
            addCriterion("FWXZMC not in", values, "fwxzmc");
            return (Criteria) this;
        }

        public Criteria andFwxzmcBetween(String value1, String value2) {
            addCriterion("FWXZMC between", value1, value2, "fwxzmc");
            return (Criteria) this;
        }

        public Criteria andFwxzmcNotBetween(String value1, String value2) {
            addCriterion("FWXZMC not between", value1, value2, "fwxzmc");
            return (Criteria) this;
        }

        public Criteria andJgsjIsNull() {
            addCriterion("JGSJ is null");
            return (Criteria) this;
        }

        public Criteria andJgsjIsNotNull() {
            addCriterion("JGSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJgsjEqualTo(String value) {
            addCriterion("JGSJ =", value, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjNotEqualTo(String value) {
            addCriterion("JGSJ <>", value, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjGreaterThan(String value) {
            addCriterion("JGSJ >", value, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjGreaterThanOrEqualTo(String value) {
            addCriterion("JGSJ >=", value, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjLessThan(String value) {
            addCriterion("JGSJ <", value, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjLessThanOrEqualTo(String value) {
            addCriterion("JGSJ <=", value, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjLike(String value) {
            addCriterion("JGSJ like", value, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjNotLike(String value) {
            addCriterion("JGSJ not like", value, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjIn(List<String> values) {
            addCriterion("JGSJ in", values, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjNotIn(List<String> values) {
            addCriterion("JGSJ not in", values, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjBetween(String value1, String value2) {
            addCriterion("JGSJ between", value1, value2, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjNotBetween(String value1, String value2) {
            addCriterion("JGSJ not between", value1, value2, "jgsj");
            return (Criteria) this;
        }

        public Criteria andCzhqbsIsNull() {
            addCriterion("CZHQBS is null");
            return (Criteria) this;
        }

        public Criteria andCzhqbsIsNotNull() {
            addCriterion("CZHQBS is not null");
            return (Criteria) this;
        }

        public Criteria andCzhqbsEqualTo(BigDecimal value) {
            addCriterion("CZHQBS =", value, "czhqbs");
            return (Criteria) this;
        }

        public Criteria andCzhqbsNotEqualTo(BigDecimal value) {
            addCriterion("CZHQBS <>", value, "czhqbs");
            return (Criteria) this;
        }

        public Criteria andCzhqbsGreaterThan(BigDecimal value) {
            addCriterion("CZHQBS >", value, "czhqbs");
            return (Criteria) this;
        }

        public Criteria andCzhqbsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CZHQBS >=", value, "czhqbs");
            return (Criteria) this;
        }

        public Criteria andCzhqbsLessThan(BigDecimal value) {
            addCriterion("CZHQBS <", value, "czhqbs");
            return (Criteria) this;
        }

        public Criteria andCzhqbsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CZHQBS <=", value, "czhqbs");
            return (Criteria) this;
        }

        public Criteria andCzhqbsIn(List<BigDecimal> values) {
            addCriterion("CZHQBS in", values, "czhqbs");
            return (Criteria) this;
        }

        public Criteria andCzhqbsNotIn(List<BigDecimal> values) {
            addCriterion("CZHQBS not in", values, "czhqbs");
            return (Criteria) this;
        }

        public Criteria andCzhqbsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CZHQBS between", value1, value2, "czhqbs");
            return (Criteria) this;
        }

        public Criteria andCzhqbsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CZHQBS not between", value1, value2, "czhqbs");
            return (Criteria) this;
        }

        public Criteria andCzhqsjIsNull() {
            addCriterion("CZHQSJ is null");
            return (Criteria) this;
        }

        public Criteria andCzhqsjIsNotNull() {
            addCriterion("CZHQSJ is not null");
            return (Criteria) this;
        }

        public Criteria andCzhqsjEqualTo(Date value) {
            addCriterionForJDBCDate("CZHQSJ =", value, "czhqsj");
            return (Criteria) this;
        }

        public Criteria andCzhqsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("CZHQSJ <>", value, "czhqsj");
            return (Criteria) this;
        }

        public Criteria andCzhqsjGreaterThan(Date value) {
            addCriterionForJDBCDate("CZHQSJ >", value, "czhqsj");
            return (Criteria) this;
        }

        public Criteria andCzhqsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CZHQSJ >=", value, "czhqsj");
            return (Criteria) this;
        }

        public Criteria andCzhqsjLessThan(Date value) {
            addCriterionForJDBCDate("CZHQSJ <", value, "czhqsj");
            return (Criteria) this;
        }

        public Criteria andCzhqsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CZHQSJ <=", value, "czhqsj");
            return (Criteria) this;
        }

        public Criteria andCzhqsjIn(List<Date> values) {
            addCriterionForJDBCDate("CZHQSJ in", values, "czhqsj");
            return (Criteria) this;
        }

        public Criteria andCzhqsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("CZHQSJ not in", values, "czhqsj");
            return (Criteria) this;
        }

        public Criteria andCzhqsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CZHQSJ between", value1, value2, "czhqsj");
            return (Criteria) this;
        }

        public Criteria andCzhqsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CZHQSJ not between", value1, value2, "czhqsj");
            return (Criteria) this;
        }

        public Criteria andBdcdyh1IsNull() {
            addCriterion("BDCDYH1 is null");
            return (Criteria) this;
        }

        public Criteria andBdcdyh1IsNotNull() {
            addCriterion("BDCDYH1 is not null");
            return (Criteria) this;
        }

        public Criteria andBdcdyh1EqualTo(Object value) {
            addCriterion("BDCDYH1 =", value, "bdcdyh1");
            return (Criteria) this;
        }

        public Criteria andBdcdyh1NotEqualTo(Object value) {
            addCriterion("BDCDYH1 <>", value, "bdcdyh1");
            return (Criteria) this;
        }

        public Criteria andBdcdyh1GreaterThan(Object value) {
            addCriterion("BDCDYH1 >", value, "bdcdyh1");
            return (Criteria) this;
        }

        public Criteria andBdcdyh1GreaterThanOrEqualTo(Object value) {
            addCriterion("BDCDYH1 >=", value, "bdcdyh1");
            return (Criteria) this;
        }

        public Criteria andBdcdyh1LessThan(Object value) {
            addCriterion("BDCDYH1 <", value, "bdcdyh1");
            return (Criteria) this;
        }

        public Criteria andBdcdyh1LessThanOrEqualTo(Object value) {
            addCriterion("BDCDYH1 <=", value, "bdcdyh1");
            return (Criteria) this;
        }

        public Criteria andBdcdyh1In(List<Object> values) {
            addCriterion("BDCDYH1 in", values, "bdcdyh1");
            return (Criteria) this;
        }

        public Criteria andBdcdyh1NotIn(List<Object> values) {
            addCriterion("BDCDYH1 not in", values, "bdcdyh1");
            return (Criteria) this;
        }

        public Criteria andBdcdyh1Between(Object value1, Object value2) {
            addCriterion("BDCDYH1 between", value1, value2, "bdcdyh1");
            return (Criteria) this;
        }

        public Criteria andBdcdyh1NotBetween(Object value1, Object value2) {
            addCriterion("BDCDYH1 not between", value1, value2, "bdcdyh1");
            return (Criteria) this;
        }

        public Criteria andPzytIsNull() {
            addCriterion("PZYT is null");
            return (Criteria) this;
        }

        public Criteria andPzytIsNotNull() {
            addCriterion("PZYT is not null");
            return (Criteria) this;
        }

        public Criteria andPzytEqualTo(Object value) {
            addCriterion("PZYT =", value, "pzyt");
            return (Criteria) this;
        }

        public Criteria andPzytNotEqualTo(Object value) {
            addCriterion("PZYT <>", value, "pzyt");
            return (Criteria) this;
        }

        public Criteria andPzytGreaterThan(Object value) {
            addCriterion("PZYT >", value, "pzyt");
            return (Criteria) this;
        }

        public Criteria andPzytGreaterThanOrEqualTo(Object value) {
            addCriterion("PZYT >=", value, "pzyt");
            return (Criteria) this;
        }

        public Criteria andPzytLessThan(Object value) {
            addCriterion("PZYT <", value, "pzyt");
            return (Criteria) this;
        }

        public Criteria andPzytLessThanOrEqualTo(Object value) {
            addCriterion("PZYT <=", value, "pzyt");
            return (Criteria) this;
        }

        public Criteria andPzytIn(List<Object> values) {
            addCriterion("PZYT in", values, "pzyt");
            return (Criteria) this;
        }

        public Criteria andPzytNotIn(List<Object> values) {
            addCriterion("PZYT not in", values, "pzyt");
            return (Criteria) this;
        }

        public Criteria andPzytBetween(Object value1, Object value2) {
            addCriterion("PZYT between", value1, value2, "pzyt");
            return (Criteria) this;
        }

        public Criteria andPzytNotBetween(Object value1, Object value2) {
            addCriterion("PZYT not between", value1, value2, "pzyt");
            return (Criteria) this;
        }

        public Criteria andSjytIsNull() {
            addCriterion("SJYT is null");
            return (Criteria) this;
        }

        public Criteria andSjytIsNotNull() {
            addCriterion("SJYT is not null");
            return (Criteria) this;
        }

        public Criteria andSjytEqualTo(Object value) {
            addCriterion("SJYT =", value, "sjyt");
            return (Criteria) this;
        }

        public Criteria andSjytNotEqualTo(Object value) {
            addCriterion("SJYT <>", value, "sjyt");
            return (Criteria) this;
        }

        public Criteria andSjytGreaterThan(Object value) {
            addCriterion("SJYT >", value, "sjyt");
            return (Criteria) this;
        }

        public Criteria andSjytGreaterThanOrEqualTo(Object value) {
            addCriterion("SJYT >=", value, "sjyt");
            return (Criteria) this;
        }

        public Criteria andSjytLessThan(Object value) {
            addCriterion("SJYT <", value, "sjyt");
            return (Criteria) this;
        }

        public Criteria andSjytLessThanOrEqualTo(Object value) {
            addCriterion("SJYT <=", value, "sjyt");
            return (Criteria) this;
        }

        public Criteria andSjytIn(List<Object> values) {
            addCriterion("SJYT in", values, "sjyt");
            return (Criteria) this;
        }

        public Criteria andSjytNotIn(List<Object> values) {
            addCriterion("SJYT not in", values, "sjyt");
            return (Criteria) this;
        }

        public Criteria andSjytBetween(Object value1, Object value2) {
            addCriterion("SJYT between", value1, value2, "sjyt");
            return (Criteria) this;
        }

        public Criteria andSjytNotBetween(Object value1, Object value2) {
            addCriterion("SJYT not between", value1, value2, "sjyt");
            return (Criteria) this;
        }

        public Criteria andYtmcIsNull() {
            addCriterion("YTMC is null");
            return (Criteria) this;
        }

        public Criteria andYtmcIsNotNull() {
            addCriterion("YTMC is not null");
            return (Criteria) this;
        }

        public Criteria andYtmcEqualTo(Object value) {
            addCriterion("YTMC =", value, "ytmc");
            return (Criteria) this;
        }

        public Criteria andYtmcNotEqualTo(Object value) {
            addCriterion("YTMC <>", value, "ytmc");
            return (Criteria) this;
        }

        public Criteria andYtmcGreaterThan(Object value) {
            addCriterion("YTMC >", value, "ytmc");
            return (Criteria) this;
        }

        public Criteria andYtmcGreaterThanOrEqualTo(Object value) {
            addCriterion("YTMC >=", value, "ytmc");
            return (Criteria) this;
        }

        public Criteria andYtmcLessThan(Object value) {
            addCriterion("YTMC <", value, "ytmc");
            return (Criteria) this;
        }

        public Criteria andYtmcLessThanOrEqualTo(Object value) {
            addCriterion("YTMC <=", value, "ytmc");
            return (Criteria) this;
        }

        public Criteria andYtmcIn(List<Object> values) {
            addCriterion("YTMC in", values, "ytmc");
            return (Criteria) this;
        }

        public Criteria andYtmcNotIn(List<Object> values) {
            addCriterion("YTMC not in", values, "ytmc");
            return (Criteria) this;
        }

        public Criteria andYtmcBetween(Object value1, Object value2) {
            addCriterion("YTMC between", value1, value2, "ytmc");
            return (Criteria) this;
        }

        public Criteria andYtmcNotBetween(Object value1, Object value2) {
            addCriterion("YTMC not between", value1, value2, "ytmc");
            return (Criteria) this;
        }

        public Criteria andSyqqxIsNull() {
            addCriterion("SYQQX is null");
            return (Criteria) this;
        }

        public Criteria andSyqqxIsNotNull() {
            addCriterion("SYQQX is not null");
            return (Criteria) this;
        }

        public Criteria andSyqqxEqualTo(Object value) {
            addCriterion("SYQQX =", value, "syqqx");
            return (Criteria) this;
        }

        public Criteria andSyqqxNotEqualTo(Object value) {
            addCriterion("SYQQX <>", value, "syqqx");
            return (Criteria) this;
        }

        public Criteria andSyqqxGreaterThan(Object value) {
            addCriterion("SYQQX >", value, "syqqx");
            return (Criteria) this;
        }

        public Criteria andSyqqxGreaterThanOrEqualTo(Object value) {
            addCriterion("SYQQX >=", value, "syqqx");
            return (Criteria) this;
        }

        public Criteria andSyqqxLessThan(Object value) {
            addCriterion("SYQQX <", value, "syqqx");
            return (Criteria) this;
        }

        public Criteria andSyqqxLessThanOrEqualTo(Object value) {
            addCriterion("SYQQX <=", value, "syqqx");
            return (Criteria) this;
        }

        public Criteria andSyqqxIn(List<Object> values) {
            addCriterion("SYQQX in", values, "syqqx");
            return (Criteria) this;
        }

        public Criteria andSyqqxNotIn(List<Object> values) {
            addCriterion("SYQQX not in", values, "syqqx");
            return (Criteria) this;
        }

        public Criteria andSyqqxBetween(Object value1, Object value2) {
            addCriterion("SYQQX between", value1, value2, "syqqx");
            return (Criteria) this;
        }

        public Criteria andSyqqxNotBetween(Object value1, Object value2) {
            addCriterion("SYQQX not between", value1, value2, "syqqx");
            return (Criteria) this;
        }

        public Criteria andJedwIsNull() {
            addCriterion("JEDW is null");
            return (Criteria) this;
        }

        public Criteria andJedwIsNotNull() {
            addCriterion("JEDW is not null");
            return (Criteria) this;
        }

        public Criteria andJedwEqualTo(Object value) {
            addCriterion("JEDW =", value, "jedw");
            return (Criteria) this;
        }

        public Criteria andJedwNotEqualTo(Object value) {
            addCriterion("JEDW <>", value, "jedw");
            return (Criteria) this;
        }

        public Criteria andJedwGreaterThan(Object value) {
            addCriterion("JEDW >", value, "jedw");
            return (Criteria) this;
        }

        public Criteria andJedwGreaterThanOrEqualTo(Object value) {
            addCriterion("JEDW >=", value, "jedw");
            return (Criteria) this;
        }

        public Criteria andJedwLessThan(Object value) {
            addCriterion("JEDW <", value, "jedw");
            return (Criteria) this;
        }

        public Criteria andJedwLessThanOrEqualTo(Object value) {
            addCriterion("JEDW <=", value, "jedw");
            return (Criteria) this;
        }

        public Criteria andJedwIn(List<Object> values) {
            addCriterion("JEDW in", values, "jedw");
            return (Criteria) this;
        }

        public Criteria andJedwNotIn(List<Object> values) {
            addCriterion("JEDW not in", values, "jedw");
            return (Criteria) this;
        }

        public Criteria andJedwBetween(Object value1, Object value2) {
            addCriterion("JEDW between", value1, value2, "jedw");
            return (Criteria) this;
        }

        public Criteria andJedwNotBetween(Object value1, Object value2) {
            addCriterion("JEDW not between", value1, value2, "jedw");
            return (Criteria) this;
        }

        public Criteria andFzhjIsNull() {
            addCriterion("FZHJ is null");
            return (Criteria) this;
        }

        public Criteria andFzhjIsNotNull() {
            addCriterion("FZHJ is not null");
            return (Criteria) this;
        }

        public Criteria andFzhjEqualTo(Object value) {
            addCriterion("FZHJ =", value, "fzhj");
            return (Criteria) this;
        }

        public Criteria andFzhjNotEqualTo(Object value) {
            addCriterion("FZHJ <>", value, "fzhj");
            return (Criteria) this;
        }

        public Criteria andFzhjGreaterThan(Object value) {
            addCriterion("FZHJ >", value, "fzhj");
            return (Criteria) this;
        }

        public Criteria andFzhjGreaterThanOrEqualTo(Object value) {
            addCriterion("FZHJ >=", value, "fzhj");
            return (Criteria) this;
        }

        public Criteria andFzhjLessThan(Object value) {
            addCriterion("FZHJ <", value, "fzhj");
            return (Criteria) this;
        }

        public Criteria andFzhjLessThanOrEqualTo(Object value) {
            addCriterion("FZHJ <=", value, "fzhj");
            return (Criteria) this;
        }

        public Criteria andFzhjIn(List<Object> values) {
            addCriterion("FZHJ in", values, "fzhj");
            return (Criteria) this;
        }

        public Criteria andFzhjNotIn(List<Object> values) {
            addCriterion("FZHJ not in", values, "fzhj");
            return (Criteria) this;
        }

        public Criteria andFzhjBetween(Object value1, Object value2) {
            addCriterion("FZHJ between", value1, value2, "fzhj");
            return (Criteria) this;
        }

        public Criteria andFzhjNotBetween(Object value1, Object value2) {
            addCriterion("FZHJ not between", value1, value2, "fzhj");
            return (Criteria) this;
        }

        public Criteria andZddmIsNull() {
            addCriterion("ZDDM is null");
            return (Criteria) this;
        }

        public Criteria andZddmIsNotNull() {
            addCriterion("ZDDM is not null");
            return (Criteria) this;
        }

        public Criteria andZddmEqualTo(Object value) {
            addCriterion("ZDDM =", value, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmNotEqualTo(Object value) {
            addCriterion("ZDDM <>", value, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmGreaterThan(Object value) {
            addCriterion("ZDDM >", value, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmGreaterThanOrEqualTo(Object value) {
            addCriterion("ZDDM >=", value, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmLessThan(Object value) {
            addCriterion("ZDDM <", value, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmLessThanOrEqualTo(Object value) {
            addCriterion("ZDDM <=", value, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmIn(List<Object> values) {
            addCriterion("ZDDM in", values, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmNotIn(List<Object> values) {
            addCriterion("ZDDM not in", values, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmBetween(Object value1, Object value2) {
            addCriterion("ZDDM between", value1, value2, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmNotBetween(Object value1, Object value2) {
            addCriterion("ZDDM not between", value1, value2, "zddm");
            return (Criteria) this;
        }

        public Criteria andBdcdyh2IsNull() {
            addCriterion("BDCDYH2 is null");
            return (Criteria) this;
        }

        public Criteria andBdcdyh2IsNotNull() {
            addCriterion("BDCDYH2 is not null");
            return (Criteria) this;
        }

        public Criteria andBdcdyh2EqualTo(Object value) {
            addCriterion("BDCDYH2 =", value, "bdcdyh2");
            return (Criteria) this;
        }

        public Criteria andBdcdyh2NotEqualTo(Object value) {
            addCriterion("BDCDYH2 <>", value, "bdcdyh2");
            return (Criteria) this;
        }

        public Criteria andBdcdyh2GreaterThan(Object value) {
            addCriterion("BDCDYH2 >", value, "bdcdyh2");
            return (Criteria) this;
        }

        public Criteria andBdcdyh2GreaterThanOrEqualTo(Object value) {
            addCriterion("BDCDYH2 >=", value, "bdcdyh2");
            return (Criteria) this;
        }

        public Criteria andBdcdyh2LessThan(Object value) {
            addCriterion("BDCDYH2 <", value, "bdcdyh2");
            return (Criteria) this;
        }

        public Criteria andBdcdyh2LessThanOrEqualTo(Object value) {
            addCriterion("BDCDYH2 <=", value, "bdcdyh2");
            return (Criteria) this;
        }

        public Criteria andBdcdyh2In(List<Object> values) {
            addCriterion("BDCDYH2 in", values, "bdcdyh2");
            return (Criteria) this;
        }

        public Criteria andBdcdyh2NotIn(List<Object> values) {
            addCriterion("BDCDYH2 not in", values, "bdcdyh2");
            return (Criteria) this;
        }

        public Criteria andBdcdyh2Between(Object value1, Object value2) {
            addCriterion("BDCDYH2 between", value1, value2, "bdcdyh2");
            return (Criteria) this;
        }

        public Criteria andBdcdyh2NotBetween(Object value1, Object value2) {
            addCriterion("BDCDYH2 not between", value1, value2, "bdcdyh2");
            return (Criteria) this;
        }

        public Criteria andXgbjIsNull() {
            addCriterion("XGBJ is null");
            return (Criteria) this;
        }

        public Criteria andXgbjIsNotNull() {
            addCriterion("XGBJ is not null");
            return (Criteria) this;
        }

        public Criteria andXgbjEqualTo(Object value) {
            addCriterion("XGBJ =", value, "xgbj");
            return (Criteria) this;
        }

        public Criteria andXgbjNotEqualTo(Object value) {
            addCriterion("XGBJ <>", value, "xgbj");
            return (Criteria) this;
        }

        public Criteria andXgbjGreaterThan(Object value) {
            addCriterion("XGBJ >", value, "xgbj");
            return (Criteria) this;
        }

        public Criteria andXgbjGreaterThanOrEqualTo(Object value) {
            addCriterion("XGBJ >=", value, "xgbj");
            return (Criteria) this;
        }

        public Criteria andXgbjLessThan(Object value) {
            addCriterion("XGBJ <", value, "xgbj");
            return (Criteria) this;
        }

        public Criteria andXgbjLessThanOrEqualTo(Object value) {
            addCriterion("XGBJ <=", value, "xgbj");
            return (Criteria) this;
        }

        public Criteria andXgbjIn(List<Object> values) {
            addCriterion("XGBJ in", values, "xgbj");
            return (Criteria) this;
        }

        public Criteria andXgbjNotIn(List<Object> values) {
            addCriterion("XGBJ not in", values, "xgbj");
            return (Criteria) this;
        }

        public Criteria andXgbjBetween(Object value1, Object value2) {
            addCriterion("XGBJ between", value1, value2, "xgbj");
            return (Criteria) this;
        }

        public Criteria andXgbjNotBetween(Object value1, Object value2) {
            addCriterion("XGBJ not between", value1, value2, "xgbj");
            return (Criteria) this;
        }

        public Criteria andFctsbsIsNull() {
            addCriterion("FCTSBS is null");
            return (Criteria) this;
        }

        public Criteria andFctsbsIsNotNull() {
            addCriterion("FCTSBS is not null");
            return (Criteria) this;
        }

        public Criteria andFctsbsEqualTo(BigDecimal value) {
            addCriterion("FCTSBS =", value, "fctsbs");
            return (Criteria) this;
        }

        public Criteria andFctsbsNotEqualTo(BigDecimal value) {
            addCriterion("FCTSBS <>", value, "fctsbs");
            return (Criteria) this;
        }

        public Criteria andFctsbsGreaterThan(BigDecimal value) {
            addCriterion("FCTSBS >", value, "fctsbs");
            return (Criteria) this;
        }

        public Criteria andFctsbsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FCTSBS >=", value, "fctsbs");
            return (Criteria) this;
        }

        public Criteria andFctsbsLessThan(BigDecimal value) {
            addCriterion("FCTSBS <", value, "fctsbs");
            return (Criteria) this;
        }

        public Criteria andFctsbsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FCTSBS <=", value, "fctsbs");
            return (Criteria) this;
        }

        public Criteria andFctsbsIn(List<BigDecimal> values) {
            addCriterion("FCTSBS in", values, "fctsbs");
            return (Criteria) this;
        }

        public Criteria andFctsbsNotIn(List<BigDecimal> values) {
            addCriterion("FCTSBS not in", values, "fctsbs");
            return (Criteria) this;
        }

        public Criteria andFctsbsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FCTSBS between", value1, value2, "fctsbs");
            return (Criteria) this;
        }

        public Criteria andFctsbsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FCTSBS not between", value1, value2, "fctsbs");
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
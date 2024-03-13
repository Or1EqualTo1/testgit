package com.jyq.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BdcRegnCbjyqNydJtcyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BdcRegnCbjyqNydJtcyExample() {
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

        public Criteria andXmIsNull() {
            addCriterion("XM is null");
            return (Criteria) this;
        }

        public Criteria andXmIsNotNull() {
            addCriterion("XM is not null");
            return (Criteria) this;
        }

        public Criteria andXmEqualTo(String value) {
            addCriterion("XM =", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotEqualTo(String value) {
            addCriterion("XM <>", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThan(String value) {
            addCriterion("XM >", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThanOrEqualTo(String value) {
            addCriterion("XM >=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThan(String value) {
            addCriterion("XM <", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThanOrEqualTo(String value) {
            addCriterion("XM <=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLike(String value) {
            addCriterion("XM like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotLike(String value) {
            addCriterion("XM not like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmIn(List<String> values) {
            addCriterion("XM in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotIn(List<String> values) {
            addCriterion("XM not in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmBetween(String value1, String value2) {
            addCriterion("XM between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotBetween(String value1, String value2) {
            addCriterion("XM not between", value1, value2, "xm");
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

        public Criteria andYcbfdbgxIsNull() {
            addCriterion("YCBFDBGX is null");
            return (Criteria) this;
        }

        public Criteria andYcbfdbgxIsNotNull() {
            addCriterion("YCBFDBGX is not null");
            return (Criteria) this;
        }

        public Criteria andYcbfdbgxEqualTo(String value) {
            addCriterion("YCBFDBGX =", value, "ycbfdbgx");
            return (Criteria) this;
        }

        public Criteria andYcbfdbgxNotEqualTo(String value) {
            addCriterion("YCBFDBGX <>", value, "ycbfdbgx");
            return (Criteria) this;
        }

        public Criteria andYcbfdbgxGreaterThan(String value) {
            addCriterion("YCBFDBGX >", value, "ycbfdbgx");
            return (Criteria) this;
        }

        public Criteria andYcbfdbgxGreaterThanOrEqualTo(String value) {
            addCriterion("YCBFDBGX >=", value, "ycbfdbgx");
            return (Criteria) this;
        }

        public Criteria andYcbfdbgxLessThan(String value) {
            addCriterion("YCBFDBGX <", value, "ycbfdbgx");
            return (Criteria) this;
        }

        public Criteria andYcbfdbgxLessThanOrEqualTo(String value) {
            addCriterion("YCBFDBGX <=", value, "ycbfdbgx");
            return (Criteria) this;
        }

        public Criteria andYcbfdbgxLike(String value) {
            addCriterion("YCBFDBGX like", value, "ycbfdbgx");
            return (Criteria) this;
        }

        public Criteria andYcbfdbgxNotLike(String value) {
            addCriterion("YCBFDBGX not like", value, "ycbfdbgx");
            return (Criteria) this;
        }

        public Criteria andYcbfdbgxIn(List<String> values) {
            addCriterion("YCBFDBGX in", values, "ycbfdbgx");
            return (Criteria) this;
        }

        public Criteria andYcbfdbgxNotIn(List<String> values) {
            addCriterion("YCBFDBGX not in", values, "ycbfdbgx");
            return (Criteria) this;
        }

        public Criteria andYcbfdbgxBetween(String value1, String value2) {
            addCriterion("YCBFDBGX between", value1, value2, "ycbfdbgx");
            return (Criteria) this;
        }

        public Criteria andYcbfdbgxNotBetween(String value1, String value2) {
            addCriterion("YCBFDBGX not between", value1, value2, "ycbfdbgx");
            return (Criteria) this;
        }

        public Criteria andSfzhmIsNull() {
            addCriterion("SFZHM is null");
            return (Criteria) this;
        }

        public Criteria andSfzhmIsNotNull() {
            addCriterion("SFZHM is not null");
            return (Criteria) this;
        }

        public Criteria andSfzhmEqualTo(String value) {
            addCriterion("SFZHM =", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmNotEqualTo(String value) {
            addCriterion("SFZHM <>", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmGreaterThan(String value) {
            addCriterion("SFZHM >", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmGreaterThanOrEqualTo(String value) {
            addCriterion("SFZHM >=", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmLessThan(String value) {
            addCriterion("SFZHM <", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmLessThanOrEqualTo(String value) {
            addCriterion("SFZHM <=", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmLike(String value) {
            addCriterion("SFZHM like", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmNotLike(String value) {
            addCriterion("SFZHM not like", value, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmIn(List<String> values) {
            addCriterion("SFZHM in", values, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmNotIn(List<String> values) {
            addCriterion("SFZHM not in", values, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmBetween(String value1, String value2) {
            addCriterion("SFZHM between", value1, value2, "sfzhm");
            return (Criteria) this;
        }

        public Criteria andSfzhmNotBetween(String value1, String value2) {
            addCriterion("SFZHM not between", value1, value2, "sfzhm");
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

        public Criteria andBzEqualTo(String value) {
            addCriterion("BZ =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("BZ <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("BZ >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("BZ >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("BZ <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("BZ <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("BZ like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("BZ not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("BZ in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("BZ not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("BZ between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("BZ not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andDjkidIsNull() {
            addCriterion("DJKID is null");
            return (Criteria) this;
        }

        public Criteria andDjkidIsNotNull() {
            addCriterion("DJKID is not null");
            return (Criteria) this;
        }

        public Criteria andDjkidEqualTo(String value) {
            addCriterion("DJKID =", value, "djkid");
            return (Criteria) this;
        }

        public Criteria andDjkidNotEqualTo(String value) {
            addCriterion("DJKID <>", value, "djkid");
            return (Criteria) this;
        }

        public Criteria andDjkidGreaterThan(String value) {
            addCriterion("DJKID >", value, "djkid");
            return (Criteria) this;
        }

        public Criteria andDjkidGreaterThanOrEqualTo(String value) {
            addCriterion("DJKID >=", value, "djkid");
            return (Criteria) this;
        }

        public Criteria andDjkidLessThan(String value) {
            addCriterion("DJKID <", value, "djkid");
            return (Criteria) this;
        }

        public Criteria andDjkidLessThanOrEqualTo(String value) {
            addCriterion("DJKID <=", value, "djkid");
            return (Criteria) this;
        }

        public Criteria andDjkidLike(String value) {
            addCriterion("DJKID like", value, "djkid");
            return (Criteria) this;
        }

        public Criteria andDjkidNotLike(String value) {
            addCriterion("DJKID not like", value, "djkid");
            return (Criteria) this;
        }

        public Criteria andDjkidIn(List<String> values) {
            addCriterion("DJKID in", values, "djkid");
            return (Criteria) this;
        }

        public Criteria andDjkidNotIn(List<String> values) {
            addCriterion("DJKID not in", values, "djkid");
            return (Criteria) this;
        }

        public Criteria andDjkidBetween(String value1, String value2) {
            addCriterion("DJKID between", value1, value2, "djkid");
            return (Criteria) this;
        }

        public Criteria andDjkidNotBetween(String value1, String value2) {
            addCriterion("DJKID not between", value1, value2, "djkid");
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
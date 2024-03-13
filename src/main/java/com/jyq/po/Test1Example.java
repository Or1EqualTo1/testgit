package com.jyq.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Test1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Test1Example() {
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


    public  Criteria createCriteria() {
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

        public Criteria andJIdIsNull() {
            addCriterion("J_ID is null");
            return (Criteria) this;
        }

        public Criteria andJIdIsNotNull() {
            addCriterion("J_ID is not null");
            return (Criteria) this;
        }

        public Criteria andJIdEqualTo(Integer value) {
            addCriterion("J_ID =", value, "jId");
            return (Criteria) this;
        }

        public Criteria andJIdNotEqualTo(BigDecimal value) {
            addCriterion("J_ID <>", value, "jId");
            return (Criteria) this;
        }

        public Criteria andJIdGreaterThan(BigDecimal value) {
            addCriterion("J_ID >", value, "jId");
            return (Criteria) this;
        }

        public Criteria andJIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("J_ID >=", value, "jId");
            return (Criteria) this;
        }

        public Criteria andJIdLessThan(BigDecimal value) {
            addCriterion("J_ID <", value, "jId");
            return (Criteria) this;
        }

        public Criteria andJIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("J_ID <=", value, "jId");
            return (Criteria) this;
        }

        public Criteria andJIdIn(List<BigDecimal> values) {
            addCriterion("J_ID in", values, "jId");
            return (Criteria) this;
        }

        public Criteria andJIdNotIn(List<BigDecimal> values) {
            addCriterion("J_ID not in", values, "jId");
            return (Criteria) this;
        }

        public Criteria andJIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("J_ID between", value1, value2, "jId");
            return (Criteria) this;
        }

        public Criteria andJIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("J_ID not between", value1, value2, "jId");
            return (Criteria) this;
        }

        public Criteria andJValueIsNull() {
            addCriterion("J_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andJValueIsNotNull() {
            addCriterion("J_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andJValueEqualTo(Object value) {
            addCriterion("J_VALUE =", value, "jValue");
            return (Criteria) this;
        }

        public Criteria andJValueNotEqualTo(Object value) {
            addCriterion("J_VALUE <>", value, "jValue");
            return (Criteria) this;
        }

        public Criteria andJValueGreaterThan(Object value) {
            addCriterion("J_VALUE >", value, "jValue");
            return (Criteria) this;
        }

        public Criteria andJValueGreaterThanOrEqualTo(Object value) {
            addCriterion("J_VALUE >=", value, "jValue");
            return (Criteria) this;
        }

        public Criteria andJValueLessThan(Object value) {
            addCriterion("J_VALUE <", value, "jValue");
            return (Criteria) this;
        }

        public Criteria andJValueLessThanOrEqualTo(Object value) {
            addCriterion("J_VALUE <=", value, "jValue");
            return (Criteria) this;
        }

        public Criteria andJValueIn(List<Object> values) {
            addCriterion("J_VALUE in", values, "jValue");
            return (Criteria) this;
        }

        public Criteria andJValueNotIn(List<Object> values) {
            addCriterion("J_VALUE not in", values, "jValue");
            return (Criteria) this;
        }

        public Criteria andJValueBetween(Object value1, Object value2) {
            addCriterion("J_VALUE between", value1, value2, "jValue");
            return (Criteria) this;
        }

        public Criteria andJValueNotBetween(Object value1, Object value2) {
            addCriterion("J_VALUE not between", value1, value2, "jValue");
            return (Criteria) this;
        }

        public Criteria andJImgIsNull() {
            addCriterion("J_IMG is null");
            return (Criteria) this;
        }

        public Criteria andJImgIsNotNull() {
            addCriterion("J_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andJImgEqualTo(Object value) {
            addCriterion("J_IMG =", value, "jImg");
            return (Criteria) this;
        }

        public Criteria andJImgNotEqualTo(Object value) {
            addCriterion("J_IMG <>", value, "jImg");
            return (Criteria) this;
        }

        public Criteria andJImgGreaterThan(Object value) {
            addCriterion("J_IMG >", value, "jImg");
            return (Criteria) this;
        }

        public Criteria andJImgGreaterThanOrEqualTo(Object value) {
            addCriterion("J_IMG >=", value, "jImg");
            return (Criteria) this;
        }

        public Criteria andJImgLessThan(Object value) {
            addCriterion("J_IMG <", value, "jImg");
            return (Criteria) this;
        }

        public Criteria andJImgLessThanOrEqualTo(Object value) {
            addCriterion("J_IMG <=", value, "jImg");
            return (Criteria) this;
        }

        public Criteria andJImgIn(List<Object> values) {
            addCriterion("J_IMG in", values, "jImg");
            return (Criteria) this;
        }

        public Criteria andJImgNotIn(List<Object> values) {
            addCriterion("J_IMG not in", values, "jImg");
            return (Criteria) this;
        }

        public Criteria andJImgBetween(Object value1, Object value2) {
            addCriterion("J_IMG between", value1, value2, "jImg");
            return (Criteria) this;
        }

        public Criteria andJImgNotBetween(Object value1, Object value2) {
            addCriterion("J_IMG not between", value1, value2, "jImg");
            return (Criteria) this;
        }

        public Criteria andJWIsNull() {
            addCriterion("J_W is null");
            return (Criteria) this;
        }

        public Criteria andJWIsNotNull() {
            addCriterion("J_W is not null");
            return (Criteria) this;
        }

        public Criteria andJWEqualTo(Object value) {
            addCriterion("J_W =", value, "jW");
            return (Criteria) this;
        }

        public Criteria andJWNotEqualTo(Object value) {
            addCriterion("J_W <>", value, "jW");
            return (Criteria) this;
        }

        public Criteria andJWGreaterThan(Object value) {
            addCriterion("J_W >", value, "jW");
            return (Criteria) this;
        }

        public Criteria andJWGreaterThanOrEqualTo(Object value) {
            addCriterion("J_W >=", value, "jW");
            return (Criteria) this;
        }

        public Criteria andJWLessThan(Object value) {
            addCriterion("J_W <", value, "jW");
            return (Criteria) this;
        }

        public Criteria andJWLessThanOrEqualTo(Object value) {
            addCriterion("J_W <=", value, "jW");
            return (Criteria) this;
        }
        public Criteria andJvalueLike(String value) {
            addCriterion("J_VALUE like", value, "jValue");
            return (Criteria) this;
        }
        public Criteria andJWIn(List<Object> values) {
            addCriterion("J_W in", values, "jW");
            return (Criteria) this;
        }

        public Criteria andJWNotIn(List<Object> values) {
            addCriterion("J_W not in", values, "jW");
            return (Criteria) this;
        }

        public Criteria andJWBetween(Object value1, Object value2) {
            addCriterion("J_W between", value1, value2, "jW");
            return (Criteria) this;
        }

        public Criteria andJWNotBetween(Object value1, Object value2) {
            addCriterion("J_W not between", value1, value2, "jW");
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
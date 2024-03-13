package com.jyq.po;

import java.util.ArrayList;
import java.util.List;

public class RsbdcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RsbdcExample() {
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

        public Criteria andYwhIsNull() {
            addCriterion("YWH is null");
            return (Criteria) this;
        }

        public Criteria andYwhIsNotNull() {
            addCriterion("YWH is not null");
            return (Criteria) this;
        }

        public Criteria andYwhEqualTo(Object value) {
            addCriterion("YWH =", value, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhNotEqualTo(Object value) {
            addCriterion("YWH <>", value, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhGreaterThan(Object value) {
            addCriterion("YWH >", value, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhGreaterThanOrEqualTo(Object value) {
            addCriterion("YWH >=", value, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhLessThan(Object value) {
            addCriterion("YWH <", value, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhLessThanOrEqualTo(Object value) {
            addCriterion("YWH <=", value, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhIn(List<Object> values) {
            addCriterion("YWH in", values, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhNotIn(List<Object> values) {
            addCriterion("YWH not in", values, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhBetween(Object value1, Object value2) {
            addCriterion("YWH between", value1, value2, "ywh");
            return (Criteria) this;
        }

        public Criteria andYwhNotBetween(Object value1, Object value2) {
            addCriterion("YWH not between", value1, value2, "ywh");
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

        public Criteria andGyfsIsNull() {
            addCriterion("GYFS is null");
            return (Criteria) this;
        }

        public Criteria andGyfsIsNotNull() {
            addCriterion("GYFS is not null");
            return (Criteria) this;
        }

        public Criteria andGyfsEqualTo(Object value) {
            addCriterion("GYFS =", value, "gyfs");
            return (Criteria) this;
        }

        public Criteria andGyfsNotEqualTo(Object value) {
            addCriterion("GYFS <>", value, "gyfs");
            return (Criteria) this;
        }

        public Criteria andGyfsGreaterThan(Object value) {
            addCriterion("GYFS >", value, "gyfs");
            return (Criteria) this;
        }

        public Criteria andGyfsGreaterThanOrEqualTo(Object value) {
            addCriterion("GYFS >=", value, "gyfs");
            return (Criteria) this;
        }

        public Criteria andGyfsLessThan(Object value) {
            addCriterion("GYFS <", value, "gyfs");
            return (Criteria) this;
        }

        public Criteria andGyfsLessThanOrEqualTo(Object value) {
            addCriterion("GYFS <=", value, "gyfs");
            return (Criteria) this;
        }

        public Criteria andGyfsIn(List<Object> values) {
            addCriterion("GYFS in", values, "gyfs");
            return (Criteria) this;
        }

        public Criteria andGyfsNotIn(List<Object> values) {
            addCriterion("GYFS not in", values, "gyfs");
            return (Criteria) this;
        }

        public Criteria andGyfsBetween(Object value1, Object value2) {
            addCriterion("GYFS between", value1, value2, "gyfs");
            return (Criteria) this;
        }

        public Criteria andGyfsNotBetween(Object value1, Object value2) {
            addCriterion("GYFS not between", value1, value2, "gyfs");
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

        public Criteria andJgIsNull() {
            addCriterion("JG is null");
            return (Criteria) this;
        }

        public Criteria andJgIsNotNull() {
            addCriterion("JG is not null");
            return (Criteria) this;
        }

        public Criteria andJgEqualTo(Object value) {
            addCriterion("JG =", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotEqualTo(Object value) {
            addCriterion("JG <>", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgGreaterThan(Object value) {
            addCriterion("JG >", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgGreaterThanOrEqualTo(Object value) {
            addCriterion("JG >=", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLessThan(Object value) {
            addCriterion("JG <", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLessThanOrEqualTo(Object value) {
            addCriterion("JG <=", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgIn(List<Object> values) {
            addCriterion("JG in", values, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotIn(List<Object> values) {
            addCriterion("JG not in", values, "jg");
            return (Criteria) this;
        }

        public Criteria andJgBetween(Object value1, Object value2) {
            addCriterion("JG between", value1, value2, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotBetween(Object value1, Object value2) {
            addCriterion("JG not between", value1, value2, "jg");
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

        public Criteria andJzmjEqualTo(Object value) {
            addCriterion("JZMJ =", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjNotEqualTo(Object value) {
            addCriterion("JZMJ <>", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjGreaterThan(Object value) {
            addCriterion("JZMJ >", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjGreaterThanOrEqualTo(Object value) {
            addCriterion("JZMJ >=", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjLessThan(Object value) {
            addCriterion("JZMJ <", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjLessThanOrEqualTo(Object value) {
            addCriterion("JZMJ <=", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjIn(List<Object> values) {
            addCriterion("JZMJ in", values, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjNotIn(List<Object> values) {
            addCriterion("JZMJ not in", values, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjBetween(Object value1, Object value2) {
            addCriterion("JZMJ between", value1, value2, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjNotBetween(Object value1, Object value2) {
            addCriterion("JZMJ not between", value1, value2, "jzmj");
            return (Criteria) this;
        }

        public Criteria andTnjzmjIsNull() {
            addCriterion("TNJZMJ is null");
            return (Criteria) this;
        }

        public Criteria andTnjzmjIsNotNull() {
            addCriterion("TNJZMJ is not null");
            return (Criteria) this;
        }

        public Criteria andTnjzmjEqualTo(Object value) {
            addCriterion("TNJZMJ =", value, "tnjzmj");
            return (Criteria) this;
        }

        public Criteria andTnjzmjNotEqualTo(Object value) {
            addCriterion("TNJZMJ <>", value, "tnjzmj");
            return (Criteria) this;
        }

        public Criteria andTnjzmjGreaterThan(Object value) {
            addCriterion("TNJZMJ >", value, "tnjzmj");
            return (Criteria) this;
        }

        public Criteria andTnjzmjGreaterThanOrEqualTo(Object value) {
            addCriterion("TNJZMJ >=", value, "tnjzmj");
            return (Criteria) this;
        }

        public Criteria andTnjzmjLessThan(Object value) {
            addCriterion("TNJZMJ <", value, "tnjzmj");
            return (Criteria) this;
        }

        public Criteria andTnjzmjLessThanOrEqualTo(Object value) {
            addCriterion("TNJZMJ <=", value, "tnjzmj");
            return (Criteria) this;
        }

        public Criteria andTnjzmjIn(List<Object> values) {
            addCriterion("TNJZMJ in", values, "tnjzmj");
            return (Criteria) this;
        }

        public Criteria andTnjzmjNotIn(List<Object> values) {
            addCriterion("TNJZMJ not in", values, "tnjzmj");
            return (Criteria) this;
        }

        public Criteria andTnjzmjBetween(Object value1, Object value2) {
            addCriterion("TNJZMJ between", value1, value2, "tnjzmj");
            return (Criteria) this;
        }

        public Criteria andTnjzmjNotBetween(Object value1, Object value2) {
            addCriterion("TNJZMJ not between", value1, value2, "tnjzmj");
            return (Criteria) this;
        }

        public Criteria andSfdyIsNull() {
            addCriterion("SFDY is null");
            return (Criteria) this;
        }

        public Criteria andSfdyIsNotNull() {
            addCriterion("SFDY is not null");
            return (Criteria) this;
        }

        public Criteria andSfdyEqualTo(Object value) {
            addCriterion("SFDY =", value, "sfdy");
            return (Criteria) this;
        }

        public Criteria andSfdyNotEqualTo(Object value) {
            addCriterion("SFDY <>", value, "sfdy");
            return (Criteria) this;
        }

        public Criteria andSfdyGreaterThan(Object value) {
            addCriterion("SFDY >", value, "sfdy");
            return (Criteria) this;
        }

        public Criteria andSfdyGreaterThanOrEqualTo(Object value) {
            addCriterion("SFDY >=", value, "sfdy");
            return (Criteria) this;
        }

        public Criteria andSfdyLessThan(Object value) {
            addCriterion("SFDY <", value, "sfdy");
            return (Criteria) this;
        }

        public Criteria andSfdyLessThanOrEqualTo(Object value) {
            addCriterion("SFDY <=", value, "sfdy");
            return (Criteria) this;
        }

        public Criteria andSfdyIn(List<Object> values) {
            addCriterion("SFDY in", values, "sfdy");
            return (Criteria) this;
        }

        public Criteria andSfdyNotIn(List<Object> values) {
            addCriterion("SFDY not in", values, "sfdy");
            return (Criteria) this;
        }

        public Criteria andSfdyBetween(Object value1, Object value2) {
            addCriterion("SFDY between", value1, value2, "sfdy");
            return (Criteria) this;
        }

        public Criteria andSfdyNotBetween(Object value1, Object value2) {
            addCriterion("SFDY not between", value1, value2, "sfdy");
            return (Criteria) this;
        }

        public Criteria andSfcfIsNull() {
            addCriterion("SFCF is null");
            return (Criteria) this;
        }

        public Criteria andSfcfIsNotNull() {
            addCriterion("SFCF is not null");
            return (Criteria) this;
        }

        public Criteria andSfcfEqualTo(Object value) {
            addCriterion("SFCF =", value, "sfcf");
            return (Criteria) this;
        }

        public Criteria andSfcfNotEqualTo(Object value) {
            addCriterion("SFCF <>", value, "sfcf");
            return (Criteria) this;
        }

        public Criteria andSfcfGreaterThan(Object value) {
            addCriterion("SFCF >", value, "sfcf");
            return (Criteria) this;
        }

        public Criteria andSfcfGreaterThanOrEqualTo(Object value) {
            addCriterion("SFCF >=", value, "sfcf");
            return (Criteria) this;
        }

        public Criteria andSfcfLessThan(Object value) {
            addCriterion("SFCF <", value, "sfcf");
            return (Criteria) this;
        }

        public Criteria andSfcfLessThanOrEqualTo(Object value) {
            addCriterion("SFCF <=", value, "sfcf");
            return (Criteria) this;
        }

        public Criteria andSfcfIn(List<Object> values) {
            addCriterion("SFCF in", values, "sfcf");
            return (Criteria) this;
        }

        public Criteria andSfcfNotIn(List<Object> values) {
            addCriterion("SFCF not in", values, "sfcf");
            return (Criteria) this;
        }

        public Criteria andSfcfBetween(Object value1, Object value2) {
            addCriterion("SFCF between", value1, value2, "sfcf");
            return (Criteria) this;
        }

        public Criteria andSfcfNotBetween(Object value1, Object value2) {
            addCriterion("SFCF not between", value1, value2, "sfcf");
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

        public Criteria andQlrzjhIsNull() {
            addCriterion("QLRZJH is null");
            return (Criteria) this;
        }

        public Criteria andQlrzjhIsNotNull() {
            addCriterion("QLRZJH is not null");
            return (Criteria) this;
        }

        public Criteria andQlrzjhEqualTo(Object value) {
            addCriterion("QLRZJH =", value, "qlrzjh");
            return (Criteria) this;
        }

        public Criteria andQlrzjhNotEqualTo(Object value) {
            addCriterion("QLRZJH <>", value, "qlrzjh");
            return (Criteria) this;
        }

        public Criteria andQlrzjhGreaterThan(Object value) {
            addCriterion("QLRZJH >", value, "qlrzjh");
            return (Criteria) this;
        }

        public Criteria andQlrzjhGreaterThanOrEqualTo(Object value) {
            addCriterion("QLRZJH >=", value, "qlrzjh");
            return (Criteria) this;
        }

        public Criteria andQlrzjhLessThan(Object value) {
            addCriterion("QLRZJH <", value, "qlrzjh");
            return (Criteria) this;
        }

        public Criteria andQlrzjhLessThanOrEqualTo(Object value) {
            addCriterion("QLRZJH <=", value, "qlrzjh");
            return (Criteria) this;
        }

        public Criteria andQlrzjhIn(List<Object> values) {
            addCriterion("QLRZJH in", values, "qlrzjh");
            return (Criteria) this;
        }

        public Criteria andQlrzjhNotIn(List<Object> values) {
            addCriterion("QLRZJH not in", values, "qlrzjh");
            return (Criteria) this;
        }

        public Criteria andQlrzjhBetween(Object value1, Object value2) {
            addCriterion("QLRZJH between", value1, value2, "qlrzjh");
            return (Criteria) this;
        }

        public Criteria andQlrzjhNotBetween(Object value1, Object value2) {
            addCriterion("QLRZJH not between", value1, value2, "qlrzjh");
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

        public Criteria andDjrqIsNull() {
            addCriterion("DJRQ is null");
            return (Criteria) this;
        }

        public Criteria andDjrqIsNotNull() {
            addCriterion("DJRQ is not null");
            return (Criteria) this;
        }

        public Criteria andDjrqEqualTo(Object value) {
            addCriterion("DJRQ =", value, "djrq");
            return (Criteria) this;
        }

        public Criteria andDjrqNotEqualTo(Object value) {
            addCriterion("DJRQ <>", value, "djrq");
            return (Criteria) this;
        }

        public Criteria andDjrqGreaterThan(Object value) {
            addCriterion("DJRQ >", value, "djrq");
            return (Criteria) this;
        }

        public Criteria andDjrqGreaterThanOrEqualTo(Object value) {
            addCriterion("DJRQ >=", value, "djrq");
            return (Criteria) this;
        }

        public Criteria andDjrqLessThan(Object value) {
            addCriterion("DJRQ <", value, "djrq");
            return (Criteria) this;
        }

        public Criteria andDjrqLessThanOrEqualTo(Object value) {
            addCriterion("DJRQ <=", value, "djrq");
            return (Criteria) this;
        }

        public Criteria andDjrqIn(List<Object> values) {
            addCriterion("DJRQ in", values, "djrq");
            return (Criteria) this;
        }

        public Criteria andDjrqNotIn(List<Object> values) {
            addCriterion("DJRQ not in", values, "djrq");
            return (Criteria) this;
        }

        public Criteria andDjrqBetween(Object value1, Object value2) {
            addCriterion("DJRQ between", value1, value2, "djrq");
            return (Criteria) this;
        }

        public Criteria andDjrqNotBetween(Object value1, Object value2) {
            addCriterion("DJRQ not between", value1, value2, "djrq");
            return (Criteria) this;
        }

        public Criteria andZtIsNull() {
            addCriterion("ZT is null");
            return (Criteria) this;
        }

        public Criteria andZtIsNotNull() {
            addCriterion("ZT is not null");
            return (Criteria) this;
        }

        public Criteria andZtEqualTo(Object value) {
            addCriterion("ZT =", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotEqualTo(Object value) {
            addCriterion("ZT <>", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThan(Object value) {
            addCriterion("ZT >", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThanOrEqualTo(Object value) {
            addCriterion("ZT >=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThan(Object value) {
            addCriterion("ZT <", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThanOrEqualTo(Object value) {
            addCriterion("ZT <=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtIn(List<Object> values) {
            addCriterion("ZT in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotIn(List<Object> values) {
            addCriterion("ZT not in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtBetween(Object value1, Object value2) {
            addCriterion("ZT between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotBetween(Object value1, Object value2) {
            addCriterion("ZT not between", value1, value2, "zt");
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
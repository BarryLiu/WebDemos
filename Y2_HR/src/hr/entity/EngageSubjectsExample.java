package hr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EngageSubjectsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public EngageSubjectsExample() {
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

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdIsNull() {
            addCriterion("first_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdIsNotNull() {
            addCriterion("first_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdEqualTo(String value) {
            addCriterion("first_kind_id =", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdNotEqualTo(String value) {
            addCriterion("first_kind_id <>", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdGreaterThan(String value) {
            addCriterion("first_kind_id >", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("first_kind_id >=", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdLessThan(String value) {
            addCriterion("first_kind_id <", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdLessThanOrEqualTo(String value) {
            addCriterion("first_kind_id <=", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdLike(String value) {
            addCriterion("first_kind_id like", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdNotLike(String value) {
            addCriterion("first_kind_id not like", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdIn(List<String> values) {
            addCriterion("first_kind_id in", values, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdNotIn(List<String> values) {
            addCriterion("first_kind_id not in", values, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdBetween(String value1, String value2) {
            addCriterion("first_kind_id between", value1, value2, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdNotBetween(String value1, String value2) {
            addCriterion("first_kind_id not between", value1, value2, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameIsNull() {
            addCriterion("first_kind_name is null");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameIsNotNull() {
            addCriterion("first_kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameEqualTo(String value) {
            addCriterion("first_kind_name =", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameNotEqualTo(String value) {
            addCriterion("first_kind_name <>", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameGreaterThan(String value) {
            addCriterion("first_kind_name >", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("first_kind_name >=", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameLessThan(String value) {
            addCriterion("first_kind_name <", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameLessThanOrEqualTo(String value) {
            addCriterion("first_kind_name <=", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameLike(String value) {
            addCriterion("first_kind_name like", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameNotLike(String value) {
            addCriterion("first_kind_name not like", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameIn(List<String> values) {
            addCriterion("first_kind_name in", values, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameNotIn(List<String> values) {
            addCriterion("first_kind_name not in", values, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameBetween(String value1, String value2) {
            addCriterion("first_kind_name between", value1, value2, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameNotBetween(String value1, String value2) {
            addCriterion("first_kind_name not between", value1, value2, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdIsNull() {
            addCriterion("second_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdIsNotNull() {
            addCriterion("second_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdEqualTo(String value) {
            addCriterion("second_kind_id =", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotEqualTo(String value) {
            addCriterion("second_kind_id <>", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdGreaterThan(String value) {
            addCriterion("second_kind_id >", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("second_kind_id >=", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdLessThan(String value) {
            addCriterion("second_kind_id <", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdLessThanOrEqualTo(String value) {
            addCriterion("second_kind_id <=", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdLike(String value) {
            addCriterion("second_kind_id like", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotLike(String value) {
            addCriterion("second_kind_id not like", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdIn(List<String> values) {
            addCriterion("second_kind_id in", values, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotIn(List<String> values) {
            addCriterion("second_kind_id not in", values, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdBetween(String value1, String value2) {
            addCriterion("second_kind_id between", value1, value2, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotBetween(String value1, String value2) {
            addCriterion("second_kind_id not between", value1, value2, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameIsNull() {
            addCriterion("second_kind_name is null");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameIsNotNull() {
            addCriterion("second_kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameEqualTo(String value) {
            addCriterion("second_kind_name =", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameNotEqualTo(String value) {
            addCriterion("second_kind_name <>", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameGreaterThan(String value) {
            addCriterion("second_kind_name >", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("second_kind_name >=", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameLessThan(String value) {
            addCriterion("second_kind_name <", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameLessThanOrEqualTo(String value) {
            addCriterion("second_kind_name <=", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameLike(String value) {
            addCriterion("second_kind_name like", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameNotLike(String value) {
            addCriterion("second_kind_name not like", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameIn(List<String> values) {
            addCriterion("second_kind_name in", values, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameNotIn(List<String> values) {
            addCriterion("second_kind_name not in", values, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameBetween(String value1, String value2) {
            addCriterion("second_kind_name between", value1, value2, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameNotBetween(String value1, String value2) {
            addCriterion("second_kind_name not between", value1, value2, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andRegisterIsNull() {
            addCriterion("register is null");
            return (Criteria) this;
        }

        public Criteria andRegisterIsNotNull() {
            addCriterion("register is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterEqualTo(String value) {
            addCriterion("register =", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotEqualTo(String value) {
            addCriterion("register <>", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterGreaterThan(String value) {
            addCriterion("register >", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterGreaterThanOrEqualTo(String value) {
            addCriterion("register >=", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLessThan(String value) {
            addCriterion("register <", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLessThanOrEqualTo(String value) {
            addCriterion("register <=", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLike(String value) {
            addCriterion("register like", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotLike(String value) {
            addCriterion("register not like", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterIn(List<String> values) {
            addCriterion("register in", values, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotIn(List<String> values) {
            addCriterion("register not in", values, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterBetween(String value1, String value2) {
            addCriterion("register between", value1, value2, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotBetween(String value1, String value2) {
            addCriterion("register not between", value1, value2, "register");
            return (Criteria) this;
        }

        public Criteria andRegistTimeIsNull() {
            addCriterion("regist_time is null");
            return (Criteria) this;
        }

        public Criteria andRegistTimeIsNotNull() {
            addCriterion("regist_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegistTimeEqualTo(Date value) {
            addCriterionForJDBCDate("regist_time =", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("regist_time <>", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("regist_time >", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("regist_time >=", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeLessThan(Date value) {
            addCriterionForJDBCDate("regist_time <", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("regist_time <=", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeIn(List<Date> values) {
            addCriterionForJDBCDate("regist_time in", values, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("regist_time not in", values, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("regist_time between", value1, value2, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("regist_time not between", value1, value2, "registTime");
            return (Criteria) this;
        }

        public Criteria andDerivationIsNull() {
            addCriterion("derivation is null");
            return (Criteria) this;
        }

        public Criteria andDerivationIsNotNull() {
            addCriterion("derivation is not null");
            return (Criteria) this;
        }

        public Criteria andDerivationEqualTo(String value) {
            addCriterion("derivation =", value, "derivation");
            return (Criteria) this;
        }

        public Criteria andDerivationNotEqualTo(String value) {
            addCriterion("derivation <>", value, "derivation");
            return (Criteria) this;
        }

        public Criteria andDerivationGreaterThan(String value) {
            addCriterion("derivation >", value, "derivation");
            return (Criteria) this;
        }

        public Criteria andDerivationGreaterThanOrEqualTo(String value) {
            addCriterion("derivation >=", value, "derivation");
            return (Criteria) this;
        }

        public Criteria andDerivationLessThan(String value) {
            addCriterion("derivation <", value, "derivation");
            return (Criteria) this;
        }

        public Criteria andDerivationLessThanOrEqualTo(String value) {
            addCriterion("derivation <=", value, "derivation");
            return (Criteria) this;
        }

        public Criteria andDerivationLike(String value) {
            addCriterion("derivation like", value, "derivation");
            return (Criteria) this;
        }

        public Criteria andDerivationNotLike(String value) {
            addCriterion("derivation not like", value, "derivation");
            return (Criteria) this;
        }

        public Criteria andDerivationIn(List<String> values) {
            addCriterion("derivation in", values, "derivation");
            return (Criteria) this;
        }

        public Criteria andDerivationNotIn(List<String> values) {
            addCriterion("derivation not in", values, "derivation");
            return (Criteria) this;
        }

        public Criteria andDerivationBetween(String value1, String value2) {
            addCriterion("derivation between", value1, value2, "derivation");
            return (Criteria) this;
        }

        public Criteria andDerivationNotBetween(String value1, String value2) {
            addCriterion("derivation not between", value1, value2, "derivation");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andKeyAIsNull() {
            addCriterion("key_a is null");
            return (Criteria) this;
        }

        public Criteria andKeyAIsNotNull() {
            addCriterion("key_a is not null");
            return (Criteria) this;
        }

        public Criteria andKeyAEqualTo(String value) {
            addCriterion("key_a =", value, "keyA");
            return (Criteria) this;
        }

        public Criteria andKeyANotEqualTo(String value) {
            addCriterion("key_a <>", value, "keyA");
            return (Criteria) this;
        }

        public Criteria andKeyAGreaterThan(String value) {
            addCriterion("key_a >", value, "keyA");
            return (Criteria) this;
        }

        public Criteria andKeyAGreaterThanOrEqualTo(String value) {
            addCriterion("key_a >=", value, "keyA");
            return (Criteria) this;
        }

        public Criteria andKeyALessThan(String value) {
            addCriterion("key_a <", value, "keyA");
            return (Criteria) this;
        }

        public Criteria andKeyALessThanOrEqualTo(String value) {
            addCriterion("key_a <=", value, "keyA");
            return (Criteria) this;
        }

        public Criteria andKeyALike(String value) {
            addCriterion("key_a like", value, "keyA");
            return (Criteria) this;
        }

        public Criteria andKeyANotLike(String value) {
            addCriterion("key_a not like", value, "keyA");
            return (Criteria) this;
        }

        public Criteria andKeyAIn(List<String> values) {
            addCriterion("key_a in", values, "keyA");
            return (Criteria) this;
        }

        public Criteria andKeyANotIn(List<String> values) {
            addCriterion("key_a not in", values, "keyA");
            return (Criteria) this;
        }

        public Criteria andKeyABetween(String value1, String value2) {
            addCriterion("key_a between", value1, value2, "keyA");
            return (Criteria) this;
        }

        public Criteria andKeyANotBetween(String value1, String value2) {
            addCriterion("key_a not between", value1, value2, "keyA");
            return (Criteria) this;
        }

        public Criteria andKeyBIsNull() {
            addCriterion("key_b is null");
            return (Criteria) this;
        }

        public Criteria andKeyBIsNotNull() {
            addCriterion("key_b is not null");
            return (Criteria) this;
        }

        public Criteria andKeyBEqualTo(String value) {
            addCriterion("key_b =", value, "keyB");
            return (Criteria) this;
        }

        public Criteria andKeyBNotEqualTo(String value) {
            addCriterion("key_b <>", value, "keyB");
            return (Criteria) this;
        }

        public Criteria andKeyBGreaterThan(String value) {
            addCriterion("key_b >", value, "keyB");
            return (Criteria) this;
        }

        public Criteria andKeyBGreaterThanOrEqualTo(String value) {
            addCriterion("key_b >=", value, "keyB");
            return (Criteria) this;
        }

        public Criteria andKeyBLessThan(String value) {
            addCriterion("key_b <", value, "keyB");
            return (Criteria) this;
        }

        public Criteria andKeyBLessThanOrEqualTo(String value) {
            addCriterion("key_b <=", value, "keyB");
            return (Criteria) this;
        }

        public Criteria andKeyBLike(String value) {
            addCriterion("key_b like", value, "keyB");
            return (Criteria) this;
        }

        public Criteria andKeyBNotLike(String value) {
            addCriterion("key_b not like", value, "keyB");
            return (Criteria) this;
        }

        public Criteria andKeyBIn(List<String> values) {
            addCriterion("key_b in", values, "keyB");
            return (Criteria) this;
        }

        public Criteria andKeyBNotIn(List<String> values) {
            addCriterion("key_b not in", values, "keyB");
            return (Criteria) this;
        }

        public Criteria andKeyBBetween(String value1, String value2) {
            addCriterion("key_b between", value1, value2, "keyB");
            return (Criteria) this;
        }

        public Criteria andKeyBNotBetween(String value1, String value2) {
            addCriterion("key_b not between", value1, value2, "keyB");
            return (Criteria) this;
        }

        public Criteria andKeyCIsNull() {
            addCriterion("key_c is null");
            return (Criteria) this;
        }

        public Criteria andKeyCIsNotNull() {
            addCriterion("key_c is not null");
            return (Criteria) this;
        }

        public Criteria andKeyCEqualTo(String value) {
            addCriterion("key_c =", value, "keyC");
            return (Criteria) this;
        }

        public Criteria andKeyCNotEqualTo(String value) {
            addCriterion("key_c <>", value, "keyC");
            return (Criteria) this;
        }

        public Criteria andKeyCGreaterThan(String value) {
            addCriterion("key_c >", value, "keyC");
            return (Criteria) this;
        }

        public Criteria andKeyCGreaterThanOrEqualTo(String value) {
            addCriterion("key_c >=", value, "keyC");
            return (Criteria) this;
        }

        public Criteria andKeyCLessThan(String value) {
            addCriterion("key_c <", value, "keyC");
            return (Criteria) this;
        }

        public Criteria andKeyCLessThanOrEqualTo(String value) {
            addCriterion("key_c <=", value, "keyC");
            return (Criteria) this;
        }

        public Criteria andKeyCLike(String value) {
            addCriterion("key_c like", value, "keyC");
            return (Criteria) this;
        }

        public Criteria andKeyCNotLike(String value) {
            addCriterion("key_c not like", value, "keyC");
            return (Criteria) this;
        }

        public Criteria andKeyCIn(List<String> values) {
            addCriterion("key_c in", values, "keyC");
            return (Criteria) this;
        }

        public Criteria andKeyCNotIn(List<String> values) {
            addCriterion("key_c not in", values, "keyC");
            return (Criteria) this;
        }

        public Criteria andKeyCBetween(String value1, String value2) {
            addCriterion("key_c between", value1, value2, "keyC");
            return (Criteria) this;
        }

        public Criteria andKeyCNotBetween(String value1, String value2) {
            addCriterion("key_c not between", value1, value2, "keyC");
            return (Criteria) this;
        }

        public Criteria andKeyDIsNull() {
            addCriterion("key_d is null");
            return (Criteria) this;
        }

        public Criteria andKeyDIsNotNull() {
            addCriterion("key_d is not null");
            return (Criteria) this;
        }

        public Criteria andKeyDEqualTo(String value) {
            addCriterion("key_d =", value, "keyD");
            return (Criteria) this;
        }

        public Criteria andKeyDNotEqualTo(String value) {
            addCriterion("key_d <>", value, "keyD");
            return (Criteria) this;
        }

        public Criteria andKeyDGreaterThan(String value) {
            addCriterion("key_d >", value, "keyD");
            return (Criteria) this;
        }

        public Criteria andKeyDGreaterThanOrEqualTo(String value) {
            addCriterion("key_d >=", value, "keyD");
            return (Criteria) this;
        }

        public Criteria andKeyDLessThan(String value) {
            addCriterion("key_d <", value, "keyD");
            return (Criteria) this;
        }

        public Criteria andKeyDLessThanOrEqualTo(String value) {
            addCriterion("key_d <=", value, "keyD");
            return (Criteria) this;
        }

        public Criteria andKeyDLike(String value) {
            addCriterion("key_d like", value, "keyD");
            return (Criteria) this;
        }

        public Criteria andKeyDNotLike(String value) {
            addCriterion("key_d not like", value, "keyD");
            return (Criteria) this;
        }

        public Criteria andKeyDIn(List<String> values) {
            addCriterion("key_d in", values, "keyD");
            return (Criteria) this;
        }

        public Criteria andKeyDNotIn(List<String> values) {
            addCriterion("key_d not in", values, "keyD");
            return (Criteria) this;
        }

        public Criteria andKeyDBetween(String value1, String value2) {
            addCriterion("key_d between", value1, value2, "keyD");
            return (Criteria) this;
        }

        public Criteria andKeyDNotBetween(String value1, String value2) {
            addCriterion("key_d not between", value1, value2, "keyD");
            return (Criteria) this;
        }

        public Criteria andKeyEIsNull() {
            addCriterion("key_e is null");
            return (Criteria) this;
        }

        public Criteria andKeyEIsNotNull() {
            addCriterion("key_e is not null");
            return (Criteria) this;
        }

        public Criteria andKeyEEqualTo(String value) {
            addCriterion("key_e =", value, "keyE");
            return (Criteria) this;
        }

        public Criteria andKeyENotEqualTo(String value) {
            addCriterion("key_e <>", value, "keyE");
            return (Criteria) this;
        }

        public Criteria andKeyEGreaterThan(String value) {
            addCriterion("key_e >", value, "keyE");
            return (Criteria) this;
        }

        public Criteria andKeyEGreaterThanOrEqualTo(String value) {
            addCriterion("key_e >=", value, "keyE");
            return (Criteria) this;
        }

        public Criteria andKeyELessThan(String value) {
            addCriterion("key_e <", value, "keyE");
            return (Criteria) this;
        }

        public Criteria andKeyELessThanOrEqualTo(String value) {
            addCriterion("key_e <=", value, "keyE");
            return (Criteria) this;
        }

        public Criteria andKeyELike(String value) {
            addCriterion("key_e like", value, "keyE");
            return (Criteria) this;
        }

        public Criteria andKeyENotLike(String value) {
            addCriterion("key_e not like", value, "keyE");
            return (Criteria) this;
        }

        public Criteria andKeyEIn(List<String> values) {
            addCriterion("key_e in", values, "keyE");
            return (Criteria) this;
        }

        public Criteria andKeyENotIn(List<String> values) {
            addCriterion("key_e not in", values, "keyE");
            return (Criteria) this;
        }

        public Criteria andKeyEBetween(String value1, String value2) {
            addCriterion("key_e between", value1, value2, "keyE");
            return (Criteria) this;
        }

        public Criteria andKeyENotBetween(String value1, String value2) {
            addCriterion("key_e not between", value1, value2, "keyE");
            return (Criteria) this;
        }

        public Criteria andCorrectKeyIsNull() {
            addCriterion("correct_key is null");
            return (Criteria) this;
        }

        public Criteria andCorrectKeyIsNotNull() {
            addCriterion("correct_key is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectKeyEqualTo(String value) {
            addCriterion("correct_key =", value, "correctKey");
            return (Criteria) this;
        }

        public Criteria andCorrectKeyNotEqualTo(String value) {
            addCriterion("correct_key <>", value, "correctKey");
            return (Criteria) this;
        }

        public Criteria andCorrectKeyGreaterThan(String value) {
            addCriterion("correct_key >", value, "correctKey");
            return (Criteria) this;
        }

        public Criteria andCorrectKeyGreaterThanOrEqualTo(String value) {
            addCriterion("correct_key >=", value, "correctKey");
            return (Criteria) this;
        }

        public Criteria andCorrectKeyLessThan(String value) {
            addCriterion("correct_key <", value, "correctKey");
            return (Criteria) this;
        }

        public Criteria andCorrectKeyLessThanOrEqualTo(String value) {
            addCriterion("correct_key <=", value, "correctKey");
            return (Criteria) this;
        }

        public Criteria andCorrectKeyLike(String value) {
            addCriterion("correct_key like", value, "correctKey");
            return (Criteria) this;
        }

        public Criteria andCorrectKeyNotLike(String value) {
            addCriterion("correct_key not like", value, "correctKey");
            return (Criteria) this;
        }

        public Criteria andCorrectKeyIn(List<String> values) {
            addCriterion("correct_key in", values, "correctKey");
            return (Criteria) this;
        }

        public Criteria andCorrectKeyNotIn(List<String> values) {
            addCriterion("correct_key not in", values, "correctKey");
            return (Criteria) this;
        }

        public Criteria andCorrectKeyBetween(String value1, String value2) {
            addCriterion("correct_key between", value1, value2, "correctKey");
            return (Criteria) this;
        }

        public Criteria andCorrectKeyNotBetween(String value1, String value2) {
            addCriterion("correct_key not between", value1, value2, "correctKey");
            return (Criteria) this;
        }

        public Criteria andChangerIsNull() {
            addCriterion("changer is null");
            return (Criteria) this;
        }

        public Criteria andChangerIsNotNull() {
            addCriterion("changer is not null");
            return (Criteria) this;
        }

        public Criteria andChangerEqualTo(String value) {
            addCriterion("changer =", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerNotEqualTo(String value) {
            addCriterion("changer <>", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerGreaterThan(String value) {
            addCriterion("changer >", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerGreaterThanOrEqualTo(String value) {
            addCriterion("changer >=", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerLessThan(String value) {
            addCriterion("changer <", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerLessThanOrEqualTo(String value) {
            addCriterion("changer <=", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerLike(String value) {
            addCriterion("changer like", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerNotLike(String value) {
            addCriterion("changer not like", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerIn(List<String> values) {
            addCriterion("changer in", values, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerNotIn(List<String> values) {
            addCriterion("changer not in", values, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerBetween(String value1, String value2) {
            addCriterion("changer between", value1, value2, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerNotBetween(String value1, String value2) {
            addCriterion("changer not between", value1, value2, "changer");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIsNull() {
            addCriterion("change_time is null");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIsNotNull() {
            addCriterion("change_time is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTimeEqualTo(Date value) {
            addCriterionForJDBCDate("change_time =", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("change_time <>", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("change_time >", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("change_time >=", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLessThan(Date value) {
            addCriterionForJDBCDate("change_time <", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("change_time <=", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIn(List<Date> values) {
            addCriterionForJDBCDate("change_time in", values, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("change_time not in", values, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("change_time between", value1, value2, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("change_time not between", value1, value2, "changeTime");
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
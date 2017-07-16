package hr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HumanFileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public HumanFileExample() {
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

        public Criteria andHumanIdIsNull() {
            addCriterion("human_id is null");
            return (Criteria) this;
        }

        public Criteria andHumanIdIsNotNull() {
            addCriterion("human_id is not null");
            return (Criteria) this;
        }

        public Criteria andHumanIdEqualTo(String value) {
            addCriterion("human_id =", value, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdNotEqualTo(String value) {
            addCriterion("human_id <>", value, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdGreaterThan(String value) {
            addCriterion("human_id >", value, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdGreaterThanOrEqualTo(String value) {
            addCriterion("human_id >=", value, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdLessThan(String value) {
            addCriterion("human_id <", value, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdLessThanOrEqualTo(String value) {
            addCriterion("human_id <=", value, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdLike(String value) {
            addCriterion("human_id like", value, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdNotLike(String value) {
            addCriterion("human_id not like", value, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdIn(List<String> values) {
            addCriterion("human_id in", values, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdNotIn(List<String> values) {
            addCriterion("human_id not in", values, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdBetween(String value1, String value2) {
            addCriterion("human_id between", value1, value2, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdNotBetween(String value1, String value2) {
            addCriterion("human_id not between", value1, value2, "humanId");
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

        public Criteria andThirdKindIdIsNull() {
            addCriterion("third_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdIsNotNull() {
            addCriterion("third_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdEqualTo(String value) {
            addCriterion("third_kind_id =", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdNotEqualTo(String value) {
            addCriterion("third_kind_id <>", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdGreaterThan(String value) {
            addCriterion("third_kind_id >", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("third_kind_id >=", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdLessThan(String value) {
            addCriterion("third_kind_id <", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdLessThanOrEqualTo(String value) {
            addCriterion("third_kind_id <=", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdLike(String value) {
            addCriterion("third_kind_id like", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdNotLike(String value) {
            addCriterion("third_kind_id not like", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdIn(List<String> values) {
            addCriterion("third_kind_id in", values, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdNotIn(List<String> values) {
            addCriterion("third_kind_id not in", values, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdBetween(String value1, String value2) {
            addCriterion("third_kind_id between", value1, value2, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdNotBetween(String value1, String value2) {
            addCriterion("third_kind_id not between", value1, value2, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameIsNull() {
            addCriterion("third_kind_name is null");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameIsNotNull() {
            addCriterion("third_kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameEqualTo(String value) {
            addCriterion("third_kind_name =", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameNotEqualTo(String value) {
            addCriterion("third_kind_name <>", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameGreaterThan(String value) {
            addCriterion("third_kind_name >", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("third_kind_name >=", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameLessThan(String value) {
            addCriterion("third_kind_name <", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameLessThanOrEqualTo(String value) {
            addCriterion("third_kind_name <=", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameLike(String value) {
            addCriterion("third_kind_name like", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameNotLike(String value) {
            addCriterion("third_kind_name not like", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameIn(List<String> values) {
            addCriterion("third_kind_name in", values, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameNotIn(List<String> values) {
            addCriterion("third_kind_name not in", values, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameBetween(String value1, String value2) {
            addCriterion("third_kind_name between", value1, value2, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameNotBetween(String value1, String value2) {
            addCriterion("third_kind_name not between", value1, value2, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andHumanNameIsNull() {
            addCriterion("human_name is null");
            return (Criteria) this;
        }

        public Criteria andHumanNameIsNotNull() {
            addCriterion("human_name is not null");
            return (Criteria) this;
        }

        public Criteria andHumanNameEqualTo(String value) {
            addCriterion("human_name =", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameNotEqualTo(String value) {
            addCriterion("human_name <>", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameGreaterThan(String value) {
            addCriterion("human_name >", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameGreaterThanOrEqualTo(String value) {
            addCriterion("human_name >=", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameLessThan(String value) {
            addCriterion("human_name <", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameLessThanOrEqualTo(String value) {
            addCriterion("human_name <=", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameLike(String value) {
            addCriterion("human_name like", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameNotLike(String value) {
            addCriterion("human_name not like", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameIn(List<String> values) {
            addCriterion("human_name in", values, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameNotIn(List<String> values) {
            addCriterion("human_name not in", values, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameBetween(String value1, String value2) {
            addCriterion("human_name between", value1, value2, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameNotBetween(String value1, String value2) {
            addCriterion("human_name not between", value1, value2, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanAddressIsNull() {
            addCriterion("human_address is null");
            return (Criteria) this;
        }

        public Criteria andHumanAddressIsNotNull() {
            addCriterion("human_address is not null");
            return (Criteria) this;
        }

        public Criteria andHumanAddressEqualTo(String value) {
            addCriterion("human_address =", value, "humanAddress");
            return (Criteria) this;
        }

        public Criteria andHumanAddressNotEqualTo(String value) {
            addCriterion("human_address <>", value, "humanAddress");
            return (Criteria) this;
        }

        public Criteria andHumanAddressGreaterThan(String value) {
            addCriterion("human_address >", value, "humanAddress");
            return (Criteria) this;
        }

        public Criteria andHumanAddressGreaterThanOrEqualTo(String value) {
            addCriterion("human_address >=", value, "humanAddress");
            return (Criteria) this;
        }

        public Criteria andHumanAddressLessThan(String value) {
            addCriterion("human_address <", value, "humanAddress");
            return (Criteria) this;
        }

        public Criteria andHumanAddressLessThanOrEqualTo(String value) {
            addCriterion("human_address <=", value, "humanAddress");
            return (Criteria) this;
        }

        public Criteria andHumanAddressLike(String value) {
            addCriterion("human_address like", value, "humanAddress");
            return (Criteria) this;
        }

        public Criteria andHumanAddressNotLike(String value) {
            addCriterion("human_address not like", value, "humanAddress");
            return (Criteria) this;
        }

        public Criteria andHumanAddressIn(List<String> values) {
            addCriterion("human_address in", values, "humanAddress");
            return (Criteria) this;
        }

        public Criteria andHumanAddressNotIn(List<String> values) {
            addCriterion("human_address not in", values, "humanAddress");
            return (Criteria) this;
        }

        public Criteria andHumanAddressBetween(String value1, String value2) {
            addCriterion("human_address between", value1, value2, "humanAddress");
            return (Criteria) this;
        }

        public Criteria andHumanAddressNotBetween(String value1, String value2) {
            addCriterion("human_address not between", value1, value2, "humanAddress");
            return (Criteria) this;
        }

        public Criteria andHumanPostcodeIsNull() {
            addCriterion("human_postcode is null");
            return (Criteria) this;
        }

        public Criteria andHumanPostcodeIsNotNull() {
            addCriterion("human_postcode is not null");
            return (Criteria) this;
        }

        public Criteria andHumanPostcodeEqualTo(String value) {
            addCriterion("human_postcode =", value, "humanPostcode");
            return (Criteria) this;
        }

        public Criteria andHumanPostcodeNotEqualTo(String value) {
            addCriterion("human_postcode <>", value, "humanPostcode");
            return (Criteria) this;
        }

        public Criteria andHumanPostcodeGreaterThan(String value) {
            addCriterion("human_postcode >", value, "humanPostcode");
            return (Criteria) this;
        }

        public Criteria andHumanPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("human_postcode >=", value, "humanPostcode");
            return (Criteria) this;
        }

        public Criteria andHumanPostcodeLessThan(String value) {
            addCriterion("human_postcode <", value, "humanPostcode");
            return (Criteria) this;
        }

        public Criteria andHumanPostcodeLessThanOrEqualTo(String value) {
            addCriterion("human_postcode <=", value, "humanPostcode");
            return (Criteria) this;
        }

        public Criteria andHumanPostcodeLike(String value) {
            addCriterion("human_postcode like", value, "humanPostcode");
            return (Criteria) this;
        }

        public Criteria andHumanPostcodeNotLike(String value) {
            addCriterion("human_postcode not like", value, "humanPostcode");
            return (Criteria) this;
        }

        public Criteria andHumanPostcodeIn(List<String> values) {
            addCriterion("human_postcode in", values, "humanPostcode");
            return (Criteria) this;
        }

        public Criteria andHumanPostcodeNotIn(List<String> values) {
            addCriterion("human_postcode not in", values, "humanPostcode");
            return (Criteria) this;
        }

        public Criteria andHumanPostcodeBetween(String value1, String value2) {
            addCriterion("human_postcode between", value1, value2, "humanPostcode");
            return (Criteria) this;
        }

        public Criteria andHumanPostcodeNotBetween(String value1, String value2) {
            addCriterion("human_postcode not between", value1, value2, "humanPostcode");
            return (Criteria) this;
        }

        public Criteria andHumanProDesignationIsNull() {
            addCriterion("human_pro_designation is null");
            return (Criteria) this;
        }

        public Criteria andHumanProDesignationIsNotNull() {
            addCriterion("human_pro_designation is not null");
            return (Criteria) this;
        }

        public Criteria andHumanProDesignationEqualTo(String value) {
            addCriterion("human_pro_designation =", value, "humanProDesignation");
            return (Criteria) this;
        }

        public Criteria andHumanProDesignationNotEqualTo(String value) {
            addCriterion("human_pro_designation <>", value, "humanProDesignation");
            return (Criteria) this;
        }

        public Criteria andHumanProDesignationGreaterThan(String value) {
            addCriterion("human_pro_designation >", value, "humanProDesignation");
            return (Criteria) this;
        }

        public Criteria andHumanProDesignationGreaterThanOrEqualTo(String value) {
            addCriterion("human_pro_designation >=", value, "humanProDesignation");
            return (Criteria) this;
        }

        public Criteria andHumanProDesignationLessThan(String value) {
            addCriterion("human_pro_designation <", value, "humanProDesignation");
            return (Criteria) this;
        }

        public Criteria andHumanProDesignationLessThanOrEqualTo(String value) {
            addCriterion("human_pro_designation <=", value, "humanProDesignation");
            return (Criteria) this;
        }

        public Criteria andHumanProDesignationLike(String value) {
            addCriterion("human_pro_designation like", value, "humanProDesignation");
            return (Criteria) this;
        }

        public Criteria andHumanProDesignationNotLike(String value) {
            addCriterion("human_pro_designation not like", value, "humanProDesignation");
            return (Criteria) this;
        }

        public Criteria andHumanProDesignationIn(List<String> values) {
            addCriterion("human_pro_designation in", values, "humanProDesignation");
            return (Criteria) this;
        }

        public Criteria andHumanProDesignationNotIn(List<String> values) {
            addCriterion("human_pro_designation not in", values, "humanProDesignation");
            return (Criteria) this;
        }

        public Criteria andHumanProDesignationBetween(String value1, String value2) {
            addCriterion("human_pro_designation between", value1, value2, "humanProDesignation");
            return (Criteria) this;
        }

        public Criteria andHumanProDesignationNotBetween(String value1, String value2) {
            addCriterion("human_pro_designation not between", value1, value2, "humanProDesignation");
            return (Criteria) this;
        }

        public Criteria andHumanMajorKindIdIsNull() {
            addCriterion("human_major_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andHumanMajorKindIdIsNotNull() {
            addCriterion("human_major_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andHumanMajorKindIdEqualTo(String value) {
            addCriterion("human_major_kind_id =", value, "humanMajorKindId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorKindIdNotEqualTo(String value) {
            addCriterion("human_major_kind_id <>", value, "humanMajorKindId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorKindIdGreaterThan(String value) {
            addCriterion("human_major_kind_id >", value, "humanMajorKindId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("human_major_kind_id >=", value, "humanMajorKindId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorKindIdLessThan(String value) {
            addCriterion("human_major_kind_id <", value, "humanMajorKindId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorKindIdLessThanOrEqualTo(String value) {
            addCriterion("human_major_kind_id <=", value, "humanMajorKindId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorKindIdLike(String value) {
            addCriterion("human_major_kind_id like", value, "humanMajorKindId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorKindIdNotLike(String value) {
            addCriterion("human_major_kind_id not like", value, "humanMajorKindId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorKindIdIn(List<String> values) {
            addCriterion("human_major_kind_id in", values, "humanMajorKindId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorKindIdNotIn(List<String> values) {
            addCriterion("human_major_kind_id not in", values, "humanMajorKindId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorKindIdBetween(String value1, String value2) {
            addCriterion("human_major_kind_id between", value1, value2, "humanMajorKindId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorKindIdNotBetween(String value1, String value2) {
            addCriterion("human_major_kind_id not between", value1, value2, "humanMajorKindId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorKindNameIsNull() {
            addCriterion("human_major_kind_name is null");
            return (Criteria) this;
        }

        public Criteria andHumanMajorKindNameIsNotNull() {
            addCriterion("human_major_kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andHumanMajorKindNameEqualTo(String value) {
            addCriterion("human_major_kind_name =", value, "humanMajorKindName");
            return (Criteria) this;
        }

        public Criteria andHumanMajorKindNameNotEqualTo(String value) {
            addCriterion("human_major_kind_name <>", value, "humanMajorKindName");
            return (Criteria) this;
        }

        public Criteria andHumanMajorKindNameGreaterThan(String value) {
            addCriterion("human_major_kind_name >", value, "humanMajorKindName");
            return (Criteria) this;
        }

        public Criteria andHumanMajorKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("human_major_kind_name >=", value, "humanMajorKindName");
            return (Criteria) this;
        }

        public Criteria andHumanMajorKindNameLessThan(String value) {
            addCriterion("human_major_kind_name <", value, "humanMajorKindName");
            return (Criteria) this;
        }

        public Criteria andHumanMajorKindNameLessThanOrEqualTo(String value) {
            addCriterion("human_major_kind_name <=", value, "humanMajorKindName");
            return (Criteria) this;
        }

        public Criteria andHumanMajorKindNameLike(String value) {
            addCriterion("human_major_kind_name like", value, "humanMajorKindName");
            return (Criteria) this;
        }

        public Criteria andHumanMajorKindNameNotLike(String value) {
            addCriterion("human_major_kind_name not like", value, "humanMajorKindName");
            return (Criteria) this;
        }

        public Criteria andHumanMajorKindNameIn(List<String> values) {
            addCriterion("human_major_kind_name in", values, "humanMajorKindName");
            return (Criteria) this;
        }

        public Criteria andHumanMajorKindNameNotIn(List<String> values) {
            addCriterion("human_major_kind_name not in", values, "humanMajorKindName");
            return (Criteria) this;
        }

        public Criteria andHumanMajorKindNameBetween(String value1, String value2) {
            addCriterion("human_major_kind_name between", value1, value2, "humanMajorKindName");
            return (Criteria) this;
        }

        public Criteria andHumanMajorKindNameNotBetween(String value1, String value2) {
            addCriterion("human_major_kind_name not between", value1, value2, "humanMajorKindName");
            return (Criteria) this;
        }

        public Criteria andHumanMajorIdIsNull() {
            addCriterion("human_major_id is null");
            return (Criteria) this;
        }

        public Criteria andHumanMajorIdIsNotNull() {
            addCriterion("human_major_id is not null");
            return (Criteria) this;
        }

        public Criteria andHumanMajorIdEqualTo(String value) {
            addCriterion("human_major_id =", value, "humanMajorId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorIdNotEqualTo(String value) {
            addCriterion("human_major_id <>", value, "humanMajorId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorIdGreaterThan(String value) {
            addCriterion("human_major_id >", value, "humanMajorId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorIdGreaterThanOrEqualTo(String value) {
            addCriterion("human_major_id >=", value, "humanMajorId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorIdLessThan(String value) {
            addCriterion("human_major_id <", value, "humanMajorId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorIdLessThanOrEqualTo(String value) {
            addCriterion("human_major_id <=", value, "humanMajorId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorIdLike(String value) {
            addCriterion("human_major_id like", value, "humanMajorId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorIdNotLike(String value) {
            addCriterion("human_major_id not like", value, "humanMajorId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorIdIn(List<String> values) {
            addCriterion("human_major_id in", values, "humanMajorId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorIdNotIn(List<String> values) {
            addCriterion("human_major_id not in", values, "humanMajorId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorIdBetween(String value1, String value2) {
            addCriterion("human_major_id between", value1, value2, "humanMajorId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorIdNotBetween(String value1, String value2) {
            addCriterion("human_major_id not between", value1, value2, "humanMajorId");
            return (Criteria) this;
        }

        public Criteria andHunmaMajorNameIsNull() {
            addCriterion("hunma_major_name is null");
            return (Criteria) this;
        }

        public Criteria andHunmaMajorNameIsNotNull() {
            addCriterion("hunma_major_name is not null");
            return (Criteria) this;
        }

        public Criteria andHunmaMajorNameEqualTo(String value) {
            addCriterion("hunma_major_name =", value, "hunmaMajorName");
            return (Criteria) this;
        }

        public Criteria andHunmaMajorNameNotEqualTo(String value) {
            addCriterion("hunma_major_name <>", value, "hunmaMajorName");
            return (Criteria) this;
        }

        public Criteria andHunmaMajorNameGreaterThan(String value) {
            addCriterion("hunma_major_name >", value, "hunmaMajorName");
            return (Criteria) this;
        }

        public Criteria andHunmaMajorNameGreaterThanOrEqualTo(String value) {
            addCriterion("hunma_major_name >=", value, "hunmaMajorName");
            return (Criteria) this;
        }

        public Criteria andHunmaMajorNameLessThan(String value) {
            addCriterion("hunma_major_name <", value, "hunmaMajorName");
            return (Criteria) this;
        }

        public Criteria andHunmaMajorNameLessThanOrEqualTo(String value) {
            addCriterion("hunma_major_name <=", value, "hunmaMajorName");
            return (Criteria) this;
        }

        public Criteria andHunmaMajorNameLike(String value) {
            addCriterion("hunma_major_name like", value, "hunmaMajorName");
            return (Criteria) this;
        }

        public Criteria andHunmaMajorNameNotLike(String value) {
            addCriterion("hunma_major_name not like", value, "hunmaMajorName");
            return (Criteria) this;
        }

        public Criteria andHunmaMajorNameIn(List<String> values) {
            addCriterion("hunma_major_name in", values, "hunmaMajorName");
            return (Criteria) this;
        }

        public Criteria andHunmaMajorNameNotIn(List<String> values) {
            addCriterion("hunma_major_name not in", values, "hunmaMajorName");
            return (Criteria) this;
        }

        public Criteria andHunmaMajorNameBetween(String value1, String value2) {
            addCriterion("hunma_major_name between", value1, value2, "hunmaMajorName");
            return (Criteria) this;
        }

        public Criteria andHunmaMajorNameNotBetween(String value1, String value2) {
            addCriterion("hunma_major_name not between", value1, value2, "hunmaMajorName");
            return (Criteria) this;
        }

        public Criteria andHumanTelephoneIsNull() {
            addCriterion("human_telephone is null");
            return (Criteria) this;
        }

        public Criteria andHumanTelephoneIsNotNull() {
            addCriterion("human_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andHumanTelephoneEqualTo(String value) {
            addCriterion("human_telephone =", value, "humanTelephone");
            return (Criteria) this;
        }

        public Criteria andHumanTelephoneNotEqualTo(String value) {
            addCriterion("human_telephone <>", value, "humanTelephone");
            return (Criteria) this;
        }

        public Criteria andHumanTelephoneGreaterThan(String value) {
            addCriterion("human_telephone >", value, "humanTelephone");
            return (Criteria) this;
        }

        public Criteria andHumanTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("human_telephone >=", value, "humanTelephone");
            return (Criteria) this;
        }

        public Criteria andHumanTelephoneLessThan(String value) {
            addCriterion("human_telephone <", value, "humanTelephone");
            return (Criteria) this;
        }

        public Criteria andHumanTelephoneLessThanOrEqualTo(String value) {
            addCriterion("human_telephone <=", value, "humanTelephone");
            return (Criteria) this;
        }

        public Criteria andHumanTelephoneLike(String value) {
            addCriterion("human_telephone like", value, "humanTelephone");
            return (Criteria) this;
        }

        public Criteria andHumanTelephoneNotLike(String value) {
            addCriterion("human_telephone not like", value, "humanTelephone");
            return (Criteria) this;
        }

        public Criteria andHumanTelephoneIn(List<String> values) {
            addCriterion("human_telephone in", values, "humanTelephone");
            return (Criteria) this;
        }

        public Criteria andHumanTelephoneNotIn(List<String> values) {
            addCriterion("human_telephone not in", values, "humanTelephone");
            return (Criteria) this;
        }

        public Criteria andHumanTelephoneBetween(String value1, String value2) {
            addCriterion("human_telephone between", value1, value2, "humanTelephone");
            return (Criteria) this;
        }

        public Criteria andHumanTelephoneNotBetween(String value1, String value2) {
            addCriterion("human_telephone not between", value1, value2, "humanTelephone");
            return (Criteria) this;
        }

        public Criteria andHumanMobilephoneIsNull() {
            addCriterion("human_mobilephone is null");
            return (Criteria) this;
        }

        public Criteria andHumanMobilephoneIsNotNull() {
            addCriterion("human_mobilephone is not null");
            return (Criteria) this;
        }

        public Criteria andHumanMobilephoneEqualTo(String value) {
            addCriterion("human_mobilephone =", value, "humanMobilephone");
            return (Criteria) this;
        }

        public Criteria andHumanMobilephoneNotEqualTo(String value) {
            addCriterion("human_mobilephone <>", value, "humanMobilephone");
            return (Criteria) this;
        }

        public Criteria andHumanMobilephoneGreaterThan(String value) {
            addCriterion("human_mobilephone >", value, "humanMobilephone");
            return (Criteria) this;
        }

        public Criteria andHumanMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("human_mobilephone >=", value, "humanMobilephone");
            return (Criteria) this;
        }

        public Criteria andHumanMobilephoneLessThan(String value) {
            addCriterion("human_mobilephone <", value, "humanMobilephone");
            return (Criteria) this;
        }

        public Criteria andHumanMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("human_mobilephone <=", value, "humanMobilephone");
            return (Criteria) this;
        }

        public Criteria andHumanMobilephoneLike(String value) {
            addCriterion("human_mobilephone like", value, "humanMobilephone");
            return (Criteria) this;
        }

        public Criteria andHumanMobilephoneNotLike(String value) {
            addCriterion("human_mobilephone not like", value, "humanMobilephone");
            return (Criteria) this;
        }

        public Criteria andHumanMobilephoneIn(List<String> values) {
            addCriterion("human_mobilephone in", values, "humanMobilephone");
            return (Criteria) this;
        }

        public Criteria andHumanMobilephoneNotIn(List<String> values) {
            addCriterion("human_mobilephone not in", values, "humanMobilephone");
            return (Criteria) this;
        }

        public Criteria andHumanMobilephoneBetween(String value1, String value2) {
            addCriterion("human_mobilephone between", value1, value2, "humanMobilephone");
            return (Criteria) this;
        }

        public Criteria andHumanMobilephoneNotBetween(String value1, String value2) {
            addCriterion("human_mobilephone not between", value1, value2, "humanMobilephone");
            return (Criteria) this;
        }

        public Criteria andHumanBankIsNull() {
            addCriterion("human_bank is null");
            return (Criteria) this;
        }

        public Criteria andHumanBankIsNotNull() {
            addCriterion("human_bank is not null");
            return (Criteria) this;
        }

        public Criteria andHumanBankEqualTo(String value) {
            addCriterion("human_bank =", value, "humanBank");
            return (Criteria) this;
        }

        public Criteria andHumanBankNotEqualTo(String value) {
            addCriterion("human_bank <>", value, "humanBank");
            return (Criteria) this;
        }

        public Criteria andHumanBankGreaterThan(String value) {
            addCriterion("human_bank >", value, "humanBank");
            return (Criteria) this;
        }

        public Criteria andHumanBankGreaterThanOrEqualTo(String value) {
            addCriterion("human_bank >=", value, "humanBank");
            return (Criteria) this;
        }

        public Criteria andHumanBankLessThan(String value) {
            addCriterion("human_bank <", value, "humanBank");
            return (Criteria) this;
        }

        public Criteria andHumanBankLessThanOrEqualTo(String value) {
            addCriterion("human_bank <=", value, "humanBank");
            return (Criteria) this;
        }

        public Criteria andHumanBankLike(String value) {
            addCriterion("human_bank like", value, "humanBank");
            return (Criteria) this;
        }

        public Criteria andHumanBankNotLike(String value) {
            addCriterion("human_bank not like", value, "humanBank");
            return (Criteria) this;
        }

        public Criteria andHumanBankIn(List<String> values) {
            addCriterion("human_bank in", values, "humanBank");
            return (Criteria) this;
        }

        public Criteria andHumanBankNotIn(List<String> values) {
            addCriterion("human_bank not in", values, "humanBank");
            return (Criteria) this;
        }

        public Criteria andHumanBankBetween(String value1, String value2) {
            addCriterion("human_bank between", value1, value2, "humanBank");
            return (Criteria) this;
        }

        public Criteria andHumanBankNotBetween(String value1, String value2) {
            addCriterion("human_bank not between", value1, value2, "humanBank");
            return (Criteria) this;
        }

        public Criteria andHumanAccountIsNull() {
            addCriterion("human_account is null");
            return (Criteria) this;
        }

        public Criteria andHumanAccountIsNotNull() {
            addCriterion("human_account is not null");
            return (Criteria) this;
        }

        public Criteria andHumanAccountEqualTo(String value) {
            addCriterion("human_account =", value, "humanAccount");
            return (Criteria) this;
        }

        public Criteria andHumanAccountNotEqualTo(String value) {
            addCriterion("human_account <>", value, "humanAccount");
            return (Criteria) this;
        }

        public Criteria andHumanAccountGreaterThan(String value) {
            addCriterion("human_account >", value, "humanAccount");
            return (Criteria) this;
        }

        public Criteria andHumanAccountGreaterThanOrEqualTo(String value) {
            addCriterion("human_account >=", value, "humanAccount");
            return (Criteria) this;
        }

        public Criteria andHumanAccountLessThan(String value) {
            addCriterion("human_account <", value, "humanAccount");
            return (Criteria) this;
        }

        public Criteria andHumanAccountLessThanOrEqualTo(String value) {
            addCriterion("human_account <=", value, "humanAccount");
            return (Criteria) this;
        }

        public Criteria andHumanAccountLike(String value) {
            addCriterion("human_account like", value, "humanAccount");
            return (Criteria) this;
        }

        public Criteria andHumanAccountNotLike(String value) {
            addCriterion("human_account not like", value, "humanAccount");
            return (Criteria) this;
        }

        public Criteria andHumanAccountIn(List<String> values) {
            addCriterion("human_account in", values, "humanAccount");
            return (Criteria) this;
        }

        public Criteria andHumanAccountNotIn(List<String> values) {
            addCriterion("human_account not in", values, "humanAccount");
            return (Criteria) this;
        }

        public Criteria andHumanAccountBetween(String value1, String value2) {
            addCriterion("human_account between", value1, value2, "humanAccount");
            return (Criteria) this;
        }

        public Criteria andHumanAccountNotBetween(String value1, String value2) {
            addCriterion("human_account not between", value1, value2, "humanAccount");
            return (Criteria) this;
        }

        public Criteria andHumanQqIsNull() {
            addCriterion("human_qq is null");
            return (Criteria) this;
        }

        public Criteria andHumanQqIsNotNull() {
            addCriterion("human_qq is not null");
            return (Criteria) this;
        }

        public Criteria andHumanQqEqualTo(String value) {
            addCriterion("human_qq =", value, "humanQq");
            return (Criteria) this;
        }

        public Criteria andHumanQqNotEqualTo(String value) {
            addCriterion("human_qq <>", value, "humanQq");
            return (Criteria) this;
        }

        public Criteria andHumanQqGreaterThan(String value) {
            addCriterion("human_qq >", value, "humanQq");
            return (Criteria) this;
        }

        public Criteria andHumanQqGreaterThanOrEqualTo(String value) {
            addCriterion("human_qq >=", value, "humanQq");
            return (Criteria) this;
        }

        public Criteria andHumanQqLessThan(String value) {
            addCriterion("human_qq <", value, "humanQq");
            return (Criteria) this;
        }

        public Criteria andHumanQqLessThanOrEqualTo(String value) {
            addCriterion("human_qq <=", value, "humanQq");
            return (Criteria) this;
        }

        public Criteria andHumanQqLike(String value) {
            addCriterion("human_qq like", value, "humanQq");
            return (Criteria) this;
        }

        public Criteria andHumanQqNotLike(String value) {
            addCriterion("human_qq not like", value, "humanQq");
            return (Criteria) this;
        }

        public Criteria andHumanQqIn(List<String> values) {
            addCriterion("human_qq in", values, "humanQq");
            return (Criteria) this;
        }

        public Criteria andHumanQqNotIn(List<String> values) {
            addCriterion("human_qq not in", values, "humanQq");
            return (Criteria) this;
        }

        public Criteria andHumanQqBetween(String value1, String value2) {
            addCriterion("human_qq between", value1, value2, "humanQq");
            return (Criteria) this;
        }

        public Criteria andHumanQqNotBetween(String value1, String value2) {
            addCriterion("human_qq not between", value1, value2, "humanQq");
            return (Criteria) this;
        }

        public Criteria andHumanEmailIsNull() {
            addCriterion("human_email is null");
            return (Criteria) this;
        }

        public Criteria andHumanEmailIsNotNull() {
            addCriterion("human_email is not null");
            return (Criteria) this;
        }

        public Criteria andHumanEmailEqualTo(String value) {
            addCriterion("human_email =", value, "humanEmail");
            return (Criteria) this;
        }

        public Criteria andHumanEmailNotEqualTo(String value) {
            addCriterion("human_email <>", value, "humanEmail");
            return (Criteria) this;
        }

        public Criteria andHumanEmailGreaterThan(String value) {
            addCriterion("human_email >", value, "humanEmail");
            return (Criteria) this;
        }

        public Criteria andHumanEmailGreaterThanOrEqualTo(String value) {
            addCriterion("human_email >=", value, "humanEmail");
            return (Criteria) this;
        }

        public Criteria andHumanEmailLessThan(String value) {
            addCriterion("human_email <", value, "humanEmail");
            return (Criteria) this;
        }

        public Criteria andHumanEmailLessThanOrEqualTo(String value) {
            addCriterion("human_email <=", value, "humanEmail");
            return (Criteria) this;
        }

        public Criteria andHumanEmailLike(String value) {
            addCriterion("human_email like", value, "humanEmail");
            return (Criteria) this;
        }

        public Criteria andHumanEmailNotLike(String value) {
            addCriterion("human_email not like", value, "humanEmail");
            return (Criteria) this;
        }

        public Criteria andHumanEmailIn(List<String> values) {
            addCriterion("human_email in", values, "humanEmail");
            return (Criteria) this;
        }

        public Criteria andHumanEmailNotIn(List<String> values) {
            addCriterion("human_email not in", values, "humanEmail");
            return (Criteria) this;
        }

        public Criteria andHumanEmailBetween(String value1, String value2) {
            addCriterion("human_email between", value1, value2, "humanEmail");
            return (Criteria) this;
        }

        public Criteria andHumanEmailNotBetween(String value1, String value2) {
            addCriterion("human_email not between", value1, value2, "humanEmail");
            return (Criteria) this;
        }

        public Criteria andHumanHobbyIsNull() {
            addCriterion("human_hobby is null");
            return (Criteria) this;
        }

        public Criteria andHumanHobbyIsNotNull() {
            addCriterion("human_hobby is not null");
            return (Criteria) this;
        }

        public Criteria andHumanHobbyEqualTo(String value) {
            addCriterion("human_hobby =", value, "humanHobby");
            return (Criteria) this;
        }

        public Criteria andHumanHobbyNotEqualTo(String value) {
            addCriterion("human_hobby <>", value, "humanHobby");
            return (Criteria) this;
        }

        public Criteria andHumanHobbyGreaterThan(String value) {
            addCriterion("human_hobby >", value, "humanHobby");
            return (Criteria) this;
        }

        public Criteria andHumanHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("human_hobby >=", value, "humanHobby");
            return (Criteria) this;
        }

        public Criteria andHumanHobbyLessThan(String value) {
            addCriterion("human_hobby <", value, "humanHobby");
            return (Criteria) this;
        }

        public Criteria andHumanHobbyLessThanOrEqualTo(String value) {
            addCriterion("human_hobby <=", value, "humanHobby");
            return (Criteria) this;
        }

        public Criteria andHumanHobbyLike(String value) {
            addCriterion("human_hobby like", value, "humanHobby");
            return (Criteria) this;
        }

        public Criteria andHumanHobbyNotLike(String value) {
            addCriterion("human_hobby not like", value, "humanHobby");
            return (Criteria) this;
        }

        public Criteria andHumanHobbyIn(List<String> values) {
            addCriterion("human_hobby in", values, "humanHobby");
            return (Criteria) this;
        }

        public Criteria andHumanHobbyNotIn(List<String> values) {
            addCriterion("human_hobby not in", values, "humanHobby");
            return (Criteria) this;
        }

        public Criteria andHumanHobbyBetween(String value1, String value2) {
            addCriterion("human_hobby between", value1, value2, "humanHobby");
            return (Criteria) this;
        }

        public Criteria andHumanHobbyNotBetween(String value1, String value2) {
            addCriterion("human_hobby not between", value1, value2, "humanHobby");
            return (Criteria) this;
        }

        public Criteria andHumanSpecialityIsNull() {
            addCriterion("human_speciality is null");
            return (Criteria) this;
        }

        public Criteria andHumanSpecialityIsNotNull() {
            addCriterion("human_speciality is not null");
            return (Criteria) this;
        }

        public Criteria andHumanSpecialityEqualTo(String value) {
            addCriterion("human_speciality =", value, "humanSpeciality");
            return (Criteria) this;
        }

        public Criteria andHumanSpecialityNotEqualTo(String value) {
            addCriterion("human_speciality <>", value, "humanSpeciality");
            return (Criteria) this;
        }

        public Criteria andHumanSpecialityGreaterThan(String value) {
            addCriterion("human_speciality >", value, "humanSpeciality");
            return (Criteria) this;
        }

        public Criteria andHumanSpecialityGreaterThanOrEqualTo(String value) {
            addCriterion("human_speciality >=", value, "humanSpeciality");
            return (Criteria) this;
        }

        public Criteria andHumanSpecialityLessThan(String value) {
            addCriterion("human_speciality <", value, "humanSpeciality");
            return (Criteria) this;
        }

        public Criteria andHumanSpecialityLessThanOrEqualTo(String value) {
            addCriterion("human_speciality <=", value, "humanSpeciality");
            return (Criteria) this;
        }

        public Criteria andHumanSpecialityLike(String value) {
            addCriterion("human_speciality like", value, "humanSpeciality");
            return (Criteria) this;
        }

        public Criteria andHumanSpecialityNotLike(String value) {
            addCriterion("human_speciality not like", value, "humanSpeciality");
            return (Criteria) this;
        }

        public Criteria andHumanSpecialityIn(List<String> values) {
            addCriterion("human_speciality in", values, "humanSpeciality");
            return (Criteria) this;
        }

        public Criteria andHumanSpecialityNotIn(List<String> values) {
            addCriterion("human_speciality not in", values, "humanSpeciality");
            return (Criteria) this;
        }

        public Criteria andHumanSpecialityBetween(String value1, String value2) {
            addCriterion("human_speciality between", value1, value2, "humanSpeciality");
            return (Criteria) this;
        }

        public Criteria andHumanSpecialityNotBetween(String value1, String value2) {
            addCriterion("human_speciality not between", value1, value2, "humanSpeciality");
            return (Criteria) this;
        }

        public Criteria andHumanSexIsNull() {
            addCriterion("human_sex is null");
            return (Criteria) this;
        }

        public Criteria andHumanSexIsNotNull() {
            addCriterion("human_sex is not null");
            return (Criteria) this;
        }

        public Criteria andHumanSexEqualTo(String value) {
            addCriterion("human_sex =", value, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexNotEqualTo(String value) {
            addCriterion("human_sex <>", value, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexGreaterThan(String value) {
            addCriterion("human_sex >", value, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexGreaterThanOrEqualTo(String value) {
            addCriterion("human_sex >=", value, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexLessThan(String value) {
            addCriterion("human_sex <", value, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexLessThanOrEqualTo(String value) {
            addCriterion("human_sex <=", value, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexLike(String value) {
            addCriterion("human_sex like", value, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexNotLike(String value) {
            addCriterion("human_sex not like", value, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexIn(List<String> values) {
            addCriterion("human_sex in", values, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexNotIn(List<String> values) {
            addCriterion("human_sex not in", values, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexBetween(String value1, String value2) {
            addCriterion("human_sex between", value1, value2, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexNotBetween(String value1, String value2) {
            addCriterion("human_sex not between", value1, value2, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanReligionIsNull() {
            addCriterion("human_religion is null");
            return (Criteria) this;
        }

        public Criteria andHumanReligionIsNotNull() {
            addCriterion("human_religion is not null");
            return (Criteria) this;
        }

        public Criteria andHumanReligionEqualTo(String value) {
            addCriterion("human_religion =", value, "humanReligion");
            return (Criteria) this;
        }

        public Criteria andHumanReligionNotEqualTo(String value) {
            addCriterion("human_religion <>", value, "humanReligion");
            return (Criteria) this;
        }

        public Criteria andHumanReligionGreaterThan(String value) {
            addCriterion("human_religion >", value, "humanReligion");
            return (Criteria) this;
        }

        public Criteria andHumanReligionGreaterThanOrEqualTo(String value) {
            addCriterion("human_religion >=", value, "humanReligion");
            return (Criteria) this;
        }

        public Criteria andHumanReligionLessThan(String value) {
            addCriterion("human_religion <", value, "humanReligion");
            return (Criteria) this;
        }

        public Criteria andHumanReligionLessThanOrEqualTo(String value) {
            addCriterion("human_religion <=", value, "humanReligion");
            return (Criteria) this;
        }

        public Criteria andHumanReligionLike(String value) {
            addCriterion("human_religion like", value, "humanReligion");
            return (Criteria) this;
        }

        public Criteria andHumanReligionNotLike(String value) {
            addCriterion("human_religion not like", value, "humanReligion");
            return (Criteria) this;
        }

        public Criteria andHumanReligionIn(List<String> values) {
            addCriterion("human_religion in", values, "humanReligion");
            return (Criteria) this;
        }

        public Criteria andHumanReligionNotIn(List<String> values) {
            addCriterion("human_religion not in", values, "humanReligion");
            return (Criteria) this;
        }

        public Criteria andHumanReligionBetween(String value1, String value2) {
            addCriterion("human_religion between", value1, value2, "humanReligion");
            return (Criteria) this;
        }

        public Criteria andHumanReligionNotBetween(String value1, String value2) {
            addCriterion("human_religion not between", value1, value2, "humanReligion");
            return (Criteria) this;
        }

        public Criteria andHumanPartyIsNull() {
            addCriterion("human_party is null");
            return (Criteria) this;
        }

        public Criteria andHumanPartyIsNotNull() {
            addCriterion("human_party is not null");
            return (Criteria) this;
        }

        public Criteria andHumanPartyEqualTo(String value) {
            addCriterion("human_party =", value, "humanParty");
            return (Criteria) this;
        }

        public Criteria andHumanPartyNotEqualTo(String value) {
            addCriterion("human_party <>", value, "humanParty");
            return (Criteria) this;
        }

        public Criteria andHumanPartyGreaterThan(String value) {
            addCriterion("human_party >", value, "humanParty");
            return (Criteria) this;
        }

        public Criteria andHumanPartyGreaterThanOrEqualTo(String value) {
            addCriterion("human_party >=", value, "humanParty");
            return (Criteria) this;
        }

        public Criteria andHumanPartyLessThan(String value) {
            addCriterion("human_party <", value, "humanParty");
            return (Criteria) this;
        }

        public Criteria andHumanPartyLessThanOrEqualTo(String value) {
            addCriterion("human_party <=", value, "humanParty");
            return (Criteria) this;
        }

        public Criteria andHumanPartyLike(String value) {
            addCriterion("human_party like", value, "humanParty");
            return (Criteria) this;
        }

        public Criteria andHumanPartyNotLike(String value) {
            addCriterion("human_party not like", value, "humanParty");
            return (Criteria) this;
        }

        public Criteria andHumanPartyIn(List<String> values) {
            addCriterion("human_party in", values, "humanParty");
            return (Criteria) this;
        }

        public Criteria andHumanPartyNotIn(List<String> values) {
            addCriterion("human_party not in", values, "humanParty");
            return (Criteria) this;
        }

        public Criteria andHumanPartyBetween(String value1, String value2) {
            addCriterion("human_party between", value1, value2, "humanParty");
            return (Criteria) this;
        }

        public Criteria andHumanPartyNotBetween(String value1, String value2) {
            addCriterion("human_party not between", value1, value2, "humanParty");
            return (Criteria) this;
        }

        public Criteria andHumanNationalityIsNull() {
            addCriterion("human_nationality is null");
            return (Criteria) this;
        }

        public Criteria andHumanNationalityIsNotNull() {
            addCriterion("human_nationality is not null");
            return (Criteria) this;
        }

        public Criteria andHumanNationalityEqualTo(String value) {
            addCriterion("human_nationality =", value, "humanNationality");
            return (Criteria) this;
        }

        public Criteria andHumanNationalityNotEqualTo(String value) {
            addCriterion("human_nationality <>", value, "humanNationality");
            return (Criteria) this;
        }

        public Criteria andHumanNationalityGreaterThan(String value) {
            addCriterion("human_nationality >", value, "humanNationality");
            return (Criteria) this;
        }

        public Criteria andHumanNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("human_nationality >=", value, "humanNationality");
            return (Criteria) this;
        }

        public Criteria andHumanNationalityLessThan(String value) {
            addCriterion("human_nationality <", value, "humanNationality");
            return (Criteria) this;
        }

        public Criteria andHumanNationalityLessThanOrEqualTo(String value) {
            addCriterion("human_nationality <=", value, "humanNationality");
            return (Criteria) this;
        }

        public Criteria andHumanNationalityLike(String value) {
            addCriterion("human_nationality like", value, "humanNationality");
            return (Criteria) this;
        }

        public Criteria andHumanNationalityNotLike(String value) {
            addCriterion("human_nationality not like", value, "humanNationality");
            return (Criteria) this;
        }

        public Criteria andHumanNationalityIn(List<String> values) {
            addCriterion("human_nationality in", values, "humanNationality");
            return (Criteria) this;
        }

        public Criteria andHumanNationalityNotIn(List<String> values) {
            addCriterion("human_nationality not in", values, "humanNationality");
            return (Criteria) this;
        }

        public Criteria andHumanNationalityBetween(String value1, String value2) {
            addCriterion("human_nationality between", value1, value2, "humanNationality");
            return (Criteria) this;
        }

        public Criteria andHumanNationalityNotBetween(String value1, String value2) {
            addCriterion("human_nationality not between", value1, value2, "humanNationality");
            return (Criteria) this;
        }

        public Criteria andHumanRaceIsNull() {
            addCriterion("human_race is null");
            return (Criteria) this;
        }

        public Criteria andHumanRaceIsNotNull() {
            addCriterion("human_race is not null");
            return (Criteria) this;
        }

        public Criteria andHumanRaceEqualTo(String value) {
            addCriterion("human_race =", value, "humanRace");
            return (Criteria) this;
        }

        public Criteria andHumanRaceNotEqualTo(String value) {
            addCriterion("human_race <>", value, "humanRace");
            return (Criteria) this;
        }

        public Criteria andHumanRaceGreaterThan(String value) {
            addCriterion("human_race >", value, "humanRace");
            return (Criteria) this;
        }

        public Criteria andHumanRaceGreaterThanOrEqualTo(String value) {
            addCriterion("human_race >=", value, "humanRace");
            return (Criteria) this;
        }

        public Criteria andHumanRaceLessThan(String value) {
            addCriterion("human_race <", value, "humanRace");
            return (Criteria) this;
        }

        public Criteria andHumanRaceLessThanOrEqualTo(String value) {
            addCriterion("human_race <=", value, "humanRace");
            return (Criteria) this;
        }

        public Criteria andHumanRaceLike(String value) {
            addCriterion("human_race like", value, "humanRace");
            return (Criteria) this;
        }

        public Criteria andHumanRaceNotLike(String value) {
            addCriterion("human_race not like", value, "humanRace");
            return (Criteria) this;
        }

        public Criteria andHumanRaceIn(List<String> values) {
            addCriterion("human_race in", values, "humanRace");
            return (Criteria) this;
        }

        public Criteria andHumanRaceNotIn(List<String> values) {
            addCriterion("human_race not in", values, "humanRace");
            return (Criteria) this;
        }

        public Criteria andHumanRaceBetween(String value1, String value2) {
            addCriterion("human_race between", value1, value2, "humanRace");
            return (Criteria) this;
        }

        public Criteria andHumanRaceNotBetween(String value1, String value2) {
            addCriterion("human_race not between", value1, value2, "humanRace");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayIsNull() {
            addCriterion("human_birthday is null");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayIsNotNull() {
            addCriterion("human_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("human_birthday =", value, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("human_birthday <>", value, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("human_birthday >", value, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("human_birthday >=", value, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("human_birthday <", value, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("human_birthday <=", value, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("human_birthday in", values, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("human_birthday not in", values, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("human_birthday between", value1, value2, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("human_birthday not between", value1, value2, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthplaceIsNull() {
            addCriterion("human_birthplace is null");
            return (Criteria) this;
        }

        public Criteria andHumanBirthplaceIsNotNull() {
            addCriterion("human_birthplace is not null");
            return (Criteria) this;
        }

        public Criteria andHumanBirthplaceEqualTo(String value) {
            addCriterion("human_birthplace =", value, "humanBirthplace");
            return (Criteria) this;
        }

        public Criteria andHumanBirthplaceNotEqualTo(String value) {
            addCriterion("human_birthplace <>", value, "humanBirthplace");
            return (Criteria) this;
        }

        public Criteria andHumanBirthplaceGreaterThan(String value) {
            addCriterion("human_birthplace >", value, "humanBirthplace");
            return (Criteria) this;
        }

        public Criteria andHumanBirthplaceGreaterThanOrEqualTo(String value) {
            addCriterion("human_birthplace >=", value, "humanBirthplace");
            return (Criteria) this;
        }

        public Criteria andHumanBirthplaceLessThan(String value) {
            addCriterion("human_birthplace <", value, "humanBirthplace");
            return (Criteria) this;
        }

        public Criteria andHumanBirthplaceLessThanOrEqualTo(String value) {
            addCriterion("human_birthplace <=", value, "humanBirthplace");
            return (Criteria) this;
        }

        public Criteria andHumanBirthplaceLike(String value) {
            addCriterion("human_birthplace like", value, "humanBirthplace");
            return (Criteria) this;
        }

        public Criteria andHumanBirthplaceNotLike(String value) {
            addCriterion("human_birthplace not like", value, "humanBirthplace");
            return (Criteria) this;
        }

        public Criteria andHumanBirthplaceIn(List<String> values) {
            addCriterion("human_birthplace in", values, "humanBirthplace");
            return (Criteria) this;
        }

        public Criteria andHumanBirthplaceNotIn(List<String> values) {
            addCriterion("human_birthplace not in", values, "humanBirthplace");
            return (Criteria) this;
        }

        public Criteria andHumanBirthplaceBetween(String value1, String value2) {
            addCriterion("human_birthplace between", value1, value2, "humanBirthplace");
            return (Criteria) this;
        }

        public Criteria andHumanBirthplaceNotBetween(String value1, String value2) {
            addCriterion("human_birthplace not between", value1, value2, "humanBirthplace");
            return (Criteria) this;
        }

        public Criteria andHumanAgeIsNull() {
            addCriterion("human_age is null");
            return (Criteria) this;
        }

        public Criteria andHumanAgeIsNotNull() {
            addCriterion("human_age is not null");
            return (Criteria) this;
        }

        public Criteria andHumanAgeEqualTo(Integer value) {
            addCriterion("human_age =", value, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanAgeNotEqualTo(Integer value) {
            addCriterion("human_age <>", value, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanAgeGreaterThan(Integer value) {
            addCriterion("human_age >", value, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("human_age >=", value, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanAgeLessThan(Integer value) {
            addCriterion("human_age <", value, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanAgeLessThanOrEqualTo(Integer value) {
            addCriterion("human_age <=", value, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanAgeIn(List<Integer> values) {
            addCriterion("human_age in", values, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanAgeNotIn(List<Integer> values) {
            addCriterion("human_age not in", values, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanAgeBetween(Integer value1, Integer value2) {
            addCriterion("human_age between", value1, value2, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("human_age not between", value1, value2, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedDegreeIsNull() {
            addCriterion("human_educated_degree is null");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedDegreeIsNotNull() {
            addCriterion("human_educated_degree is not null");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedDegreeEqualTo(String value) {
            addCriterion("human_educated_degree =", value, "humanEducatedDegree");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedDegreeNotEqualTo(String value) {
            addCriterion("human_educated_degree <>", value, "humanEducatedDegree");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedDegreeGreaterThan(String value) {
            addCriterion("human_educated_degree >", value, "humanEducatedDegree");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("human_educated_degree >=", value, "humanEducatedDegree");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedDegreeLessThan(String value) {
            addCriterion("human_educated_degree <", value, "humanEducatedDegree");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedDegreeLessThanOrEqualTo(String value) {
            addCriterion("human_educated_degree <=", value, "humanEducatedDegree");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedDegreeLike(String value) {
            addCriterion("human_educated_degree like", value, "humanEducatedDegree");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedDegreeNotLike(String value) {
            addCriterion("human_educated_degree not like", value, "humanEducatedDegree");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedDegreeIn(List<String> values) {
            addCriterion("human_educated_degree in", values, "humanEducatedDegree");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedDegreeNotIn(List<String> values) {
            addCriterion("human_educated_degree not in", values, "humanEducatedDegree");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedDegreeBetween(String value1, String value2) {
            addCriterion("human_educated_degree between", value1, value2, "humanEducatedDegree");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedDegreeNotBetween(String value1, String value2) {
            addCriterion("human_educated_degree not between", value1, value2, "humanEducatedDegree");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedYearsIsNull() {
            addCriterion("human_educated_years is null");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedYearsIsNotNull() {
            addCriterion("human_educated_years is not null");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedYearsEqualTo(Double value) {
            addCriterion("human_educated_years =", value, "humanEducatedYears");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedYearsNotEqualTo(Double value) {
            addCriterion("human_educated_years <>", value, "humanEducatedYears");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedYearsGreaterThan(Double value) {
            addCriterion("human_educated_years >", value, "humanEducatedYears");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedYearsGreaterThanOrEqualTo(Double value) {
            addCriterion("human_educated_years >=", value, "humanEducatedYears");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedYearsLessThan(Double value) {
            addCriterion("human_educated_years <", value, "humanEducatedYears");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedYearsLessThanOrEqualTo(Double value) {
            addCriterion("human_educated_years <=", value, "humanEducatedYears");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedYearsIn(List<Double> values) {
            addCriterion("human_educated_years in", values, "humanEducatedYears");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedYearsNotIn(List<Double> values) {
            addCriterion("human_educated_years not in", values, "humanEducatedYears");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedYearsBetween(Double value1, Double value2) {
            addCriterion("human_educated_years between", value1, value2, "humanEducatedYears");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedYearsNotBetween(Double value1, Double value2) {
            addCriterion("human_educated_years not between", value1, value2, "humanEducatedYears");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedMajorIsNull() {
            addCriterion("human_educated_major is null");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedMajorIsNotNull() {
            addCriterion("human_educated_major is not null");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedMajorEqualTo(String value) {
            addCriterion("human_educated_major =", value, "humanEducatedMajor");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedMajorNotEqualTo(String value) {
            addCriterion("human_educated_major <>", value, "humanEducatedMajor");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedMajorGreaterThan(String value) {
            addCriterion("human_educated_major >", value, "humanEducatedMajor");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedMajorGreaterThanOrEqualTo(String value) {
            addCriterion("human_educated_major >=", value, "humanEducatedMajor");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedMajorLessThan(String value) {
            addCriterion("human_educated_major <", value, "humanEducatedMajor");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedMajorLessThanOrEqualTo(String value) {
            addCriterion("human_educated_major <=", value, "humanEducatedMajor");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedMajorLike(String value) {
            addCriterion("human_educated_major like", value, "humanEducatedMajor");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedMajorNotLike(String value) {
            addCriterion("human_educated_major not like", value, "humanEducatedMajor");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedMajorIn(List<String> values) {
            addCriterion("human_educated_major in", values, "humanEducatedMajor");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedMajorNotIn(List<String> values) {
            addCriterion("human_educated_major not in", values, "humanEducatedMajor");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedMajorBetween(String value1, String value2) {
            addCriterion("human_educated_major between", value1, value2, "humanEducatedMajor");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedMajorNotBetween(String value1, String value2) {
            addCriterion("human_educated_major not between", value1, value2, "humanEducatedMajor");
            return (Criteria) this;
        }

        public Criteria andHumanSocietySecurityIdIsNull() {
            addCriterion("human_society_security_id is null");
            return (Criteria) this;
        }

        public Criteria andHumanSocietySecurityIdIsNotNull() {
            addCriterion("human_society_security_id is not null");
            return (Criteria) this;
        }

        public Criteria andHumanSocietySecurityIdEqualTo(String value) {
            addCriterion("human_society_security_id =", value, "humanSocietySecurityId");
            return (Criteria) this;
        }

        public Criteria andHumanSocietySecurityIdNotEqualTo(String value) {
            addCriterion("human_society_security_id <>", value, "humanSocietySecurityId");
            return (Criteria) this;
        }

        public Criteria andHumanSocietySecurityIdGreaterThan(String value) {
            addCriterion("human_society_security_id >", value, "humanSocietySecurityId");
            return (Criteria) this;
        }

        public Criteria andHumanSocietySecurityIdGreaterThanOrEqualTo(String value) {
            addCriterion("human_society_security_id >=", value, "humanSocietySecurityId");
            return (Criteria) this;
        }

        public Criteria andHumanSocietySecurityIdLessThan(String value) {
            addCriterion("human_society_security_id <", value, "humanSocietySecurityId");
            return (Criteria) this;
        }

        public Criteria andHumanSocietySecurityIdLessThanOrEqualTo(String value) {
            addCriterion("human_society_security_id <=", value, "humanSocietySecurityId");
            return (Criteria) this;
        }

        public Criteria andHumanSocietySecurityIdLike(String value) {
            addCriterion("human_society_security_id like", value, "humanSocietySecurityId");
            return (Criteria) this;
        }

        public Criteria andHumanSocietySecurityIdNotLike(String value) {
            addCriterion("human_society_security_id not like", value, "humanSocietySecurityId");
            return (Criteria) this;
        }

        public Criteria andHumanSocietySecurityIdIn(List<String> values) {
            addCriterion("human_society_security_id in", values, "humanSocietySecurityId");
            return (Criteria) this;
        }

        public Criteria andHumanSocietySecurityIdNotIn(List<String> values) {
            addCriterion("human_society_security_id not in", values, "humanSocietySecurityId");
            return (Criteria) this;
        }

        public Criteria andHumanSocietySecurityIdBetween(String value1, String value2) {
            addCriterion("human_society_security_id between", value1, value2, "humanSocietySecurityId");
            return (Criteria) this;
        }

        public Criteria andHumanSocietySecurityIdNotBetween(String value1, String value2) {
            addCriterion("human_society_security_id not between", value1, value2, "humanSocietySecurityId");
            return (Criteria) this;
        }

        public Criteria andHumanIdCardIsNull() {
            addCriterion("human_id_card is null");
            return (Criteria) this;
        }

        public Criteria andHumanIdCardIsNotNull() {
            addCriterion("human_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andHumanIdCardEqualTo(String value) {
            addCriterion("human_id_card =", value, "humanIdCard");
            return (Criteria) this;
        }

        public Criteria andHumanIdCardNotEqualTo(String value) {
            addCriterion("human_id_card <>", value, "humanIdCard");
            return (Criteria) this;
        }

        public Criteria andHumanIdCardGreaterThan(String value) {
            addCriterion("human_id_card >", value, "humanIdCard");
            return (Criteria) this;
        }

        public Criteria andHumanIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("human_id_card >=", value, "humanIdCard");
            return (Criteria) this;
        }

        public Criteria andHumanIdCardLessThan(String value) {
            addCriterion("human_id_card <", value, "humanIdCard");
            return (Criteria) this;
        }

        public Criteria andHumanIdCardLessThanOrEqualTo(String value) {
            addCriterion("human_id_card <=", value, "humanIdCard");
            return (Criteria) this;
        }

        public Criteria andHumanIdCardLike(String value) {
            addCriterion("human_id_card like", value, "humanIdCard");
            return (Criteria) this;
        }

        public Criteria andHumanIdCardNotLike(String value) {
            addCriterion("human_id_card not like", value, "humanIdCard");
            return (Criteria) this;
        }

        public Criteria andHumanIdCardIn(List<String> values) {
            addCriterion("human_id_card in", values, "humanIdCard");
            return (Criteria) this;
        }

        public Criteria andHumanIdCardNotIn(List<String> values) {
            addCriterion("human_id_card not in", values, "humanIdCard");
            return (Criteria) this;
        }

        public Criteria andHumanIdCardBetween(String value1, String value2) {
            addCriterion("human_id_card between", value1, value2, "humanIdCard");
            return (Criteria) this;
        }

        public Criteria andHumanIdCardNotBetween(String value1, String value2) {
            addCriterion("human_id_card not between", value1, value2, "humanIdCard");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdIsNull() {
            addCriterion("salary_standard_id is null");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdIsNotNull() {
            addCriterion("salary_standard_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdEqualTo(String value) {
            addCriterion("salary_standard_id =", value, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdNotEqualTo(String value) {
            addCriterion("salary_standard_id <>", value, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdGreaterThan(String value) {
            addCriterion("salary_standard_id >", value, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdGreaterThanOrEqualTo(String value) {
            addCriterion("salary_standard_id >=", value, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdLessThan(String value) {
            addCriterion("salary_standard_id <", value, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdLessThanOrEqualTo(String value) {
            addCriterion("salary_standard_id <=", value, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdLike(String value) {
            addCriterion("salary_standard_id like", value, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdNotLike(String value) {
            addCriterion("salary_standard_id not like", value, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdIn(List<String> values) {
            addCriterion("salary_standard_id in", values, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdNotIn(List<String> values) {
            addCriterion("salary_standard_id not in", values, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdBetween(String value1, String value2) {
            addCriterion("salary_standard_id between", value1, value2, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdNotBetween(String value1, String value2) {
            addCriterion("salary_standard_id not between", value1, value2, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardNameIsNull() {
            addCriterion("salary_standard_name is null");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardNameIsNotNull() {
            addCriterion("salary_standard_name is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardNameEqualTo(String value) {
            addCriterion("salary_standard_name =", value, "salaryStandardName");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardNameNotEqualTo(String value) {
            addCriterion("salary_standard_name <>", value, "salaryStandardName");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardNameGreaterThan(String value) {
            addCriterion("salary_standard_name >", value, "salaryStandardName");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardNameGreaterThanOrEqualTo(String value) {
            addCriterion("salary_standard_name >=", value, "salaryStandardName");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardNameLessThan(String value) {
            addCriterion("salary_standard_name <", value, "salaryStandardName");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardNameLessThanOrEqualTo(String value) {
            addCriterion("salary_standard_name <=", value, "salaryStandardName");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardNameLike(String value) {
            addCriterion("salary_standard_name like", value, "salaryStandardName");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardNameNotLike(String value) {
            addCriterion("salary_standard_name not like", value, "salaryStandardName");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardNameIn(List<String> values) {
            addCriterion("salary_standard_name in", values, "salaryStandardName");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardNameNotIn(List<String> values) {
            addCriterion("salary_standard_name not in", values, "salaryStandardName");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardNameBetween(String value1, String value2) {
            addCriterion("salary_standard_name between", value1, value2, "salaryStandardName");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardNameNotBetween(String value1, String value2) {
            addCriterion("salary_standard_name not between", value1, value2, "salaryStandardName");
            return (Criteria) this;
        }

        public Criteria andSalarySumIsNull() {
            addCriterion("salary_sum is null");
            return (Criteria) this;
        }

        public Criteria andSalarySumIsNotNull() {
            addCriterion("salary_sum is not null");
            return (Criteria) this;
        }

        public Criteria andSalarySumEqualTo(Double value) {
            addCriterion("salary_sum =", value, "salarySum");
            return (Criteria) this;
        }

        public Criteria andSalarySumNotEqualTo(Double value) {
            addCriterion("salary_sum <>", value, "salarySum");
            return (Criteria) this;
        }

        public Criteria andSalarySumGreaterThan(Double value) {
            addCriterion("salary_sum >", value, "salarySum");
            return (Criteria) this;
        }

        public Criteria andSalarySumGreaterThanOrEqualTo(Double value) {
            addCriterion("salary_sum >=", value, "salarySum");
            return (Criteria) this;
        }

        public Criteria andSalarySumLessThan(Double value) {
            addCriterion("salary_sum <", value, "salarySum");
            return (Criteria) this;
        }

        public Criteria andSalarySumLessThanOrEqualTo(Double value) {
            addCriterion("salary_sum <=", value, "salarySum");
            return (Criteria) this;
        }

        public Criteria andSalarySumIn(List<Double> values) {
            addCriterion("salary_sum in", values, "salarySum");
            return (Criteria) this;
        }

        public Criteria andSalarySumNotIn(List<Double> values) {
            addCriterion("salary_sum not in", values, "salarySum");
            return (Criteria) this;
        }

        public Criteria andSalarySumBetween(Double value1, Double value2) {
            addCriterion("salary_sum between", value1, value2, "salarySum");
            return (Criteria) this;
        }

        public Criteria andSalarySumNotBetween(Double value1, Double value2) {
            addCriterion("salary_sum not between", value1, value2, "salarySum");
            return (Criteria) this;
        }

        public Criteria andDemandSalaraySumIsNull() {
            addCriterion("demand_salaray_sum is null");
            return (Criteria) this;
        }

        public Criteria andDemandSalaraySumIsNotNull() {
            addCriterion("demand_salaray_sum is not null");
            return (Criteria) this;
        }

        public Criteria andDemandSalaraySumEqualTo(Double value) {
            addCriterion("demand_salaray_sum =", value, "demandSalaraySum");
            return (Criteria) this;
        }

        public Criteria andDemandSalaraySumNotEqualTo(Double value) {
            addCriterion("demand_salaray_sum <>", value, "demandSalaraySum");
            return (Criteria) this;
        }

        public Criteria andDemandSalaraySumGreaterThan(Double value) {
            addCriterion("demand_salaray_sum >", value, "demandSalaraySum");
            return (Criteria) this;
        }

        public Criteria andDemandSalaraySumGreaterThanOrEqualTo(Double value) {
            addCriterion("demand_salaray_sum >=", value, "demandSalaraySum");
            return (Criteria) this;
        }

        public Criteria andDemandSalaraySumLessThan(Double value) {
            addCriterion("demand_salaray_sum <", value, "demandSalaraySum");
            return (Criteria) this;
        }

        public Criteria andDemandSalaraySumLessThanOrEqualTo(Double value) {
            addCriterion("demand_salaray_sum <=", value, "demandSalaraySum");
            return (Criteria) this;
        }

        public Criteria andDemandSalaraySumIn(List<Double> values) {
            addCriterion("demand_salaray_sum in", values, "demandSalaraySum");
            return (Criteria) this;
        }

        public Criteria andDemandSalaraySumNotIn(List<Double> values) {
            addCriterion("demand_salaray_sum not in", values, "demandSalaraySum");
            return (Criteria) this;
        }

        public Criteria andDemandSalaraySumBetween(Double value1, Double value2) {
            addCriterion("demand_salaray_sum between", value1, value2, "demandSalaraySum");
            return (Criteria) this;
        }

        public Criteria andDemandSalaraySumNotBetween(Double value1, Double value2) {
            addCriterion("demand_salaray_sum not between", value1, value2, "demandSalaraySum");
            return (Criteria) this;
        }

        public Criteria andPaidSalarySumIsNull() {
            addCriterion("paid_salary_sum is null");
            return (Criteria) this;
        }

        public Criteria andPaidSalarySumIsNotNull() {
            addCriterion("paid_salary_sum is not null");
            return (Criteria) this;
        }

        public Criteria andPaidSalarySumEqualTo(Double value) {
            addCriterion("paid_salary_sum =", value, "paidSalarySum");
            return (Criteria) this;
        }

        public Criteria andPaidSalarySumNotEqualTo(Double value) {
            addCriterion("paid_salary_sum <>", value, "paidSalarySum");
            return (Criteria) this;
        }

        public Criteria andPaidSalarySumGreaterThan(Double value) {
            addCriterion("paid_salary_sum >", value, "paidSalarySum");
            return (Criteria) this;
        }

        public Criteria andPaidSalarySumGreaterThanOrEqualTo(Double value) {
            addCriterion("paid_salary_sum >=", value, "paidSalarySum");
            return (Criteria) this;
        }

        public Criteria andPaidSalarySumLessThan(Double value) {
            addCriterion("paid_salary_sum <", value, "paidSalarySum");
            return (Criteria) this;
        }

        public Criteria andPaidSalarySumLessThanOrEqualTo(Double value) {
            addCriterion("paid_salary_sum <=", value, "paidSalarySum");
            return (Criteria) this;
        }

        public Criteria andPaidSalarySumIn(List<Double> values) {
            addCriterion("paid_salary_sum in", values, "paidSalarySum");
            return (Criteria) this;
        }

        public Criteria andPaidSalarySumNotIn(List<Double> values) {
            addCriterion("paid_salary_sum not in", values, "paidSalarySum");
            return (Criteria) this;
        }

        public Criteria andPaidSalarySumBetween(Double value1, Double value2) {
            addCriterion("paid_salary_sum between", value1, value2, "paidSalarySum");
            return (Criteria) this;
        }

        public Criteria andPaidSalarySumNotBetween(Double value1, Double value2) {
            addCriterion("paid_salary_sum not between", value1, value2, "paidSalarySum");
            return (Criteria) this;
        }

        public Criteria andMajorChangeAmountIsNull() {
            addCriterion("major_change_amount is null");
            return (Criteria) this;
        }

        public Criteria andMajorChangeAmountIsNotNull() {
            addCriterion("major_change_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMajorChangeAmountEqualTo(Integer value) {
            addCriterion("major_change_amount =", value, "majorChangeAmount");
            return (Criteria) this;
        }

        public Criteria andMajorChangeAmountNotEqualTo(Integer value) {
            addCriterion("major_change_amount <>", value, "majorChangeAmount");
            return (Criteria) this;
        }

        public Criteria andMajorChangeAmountGreaterThan(Integer value) {
            addCriterion("major_change_amount >", value, "majorChangeAmount");
            return (Criteria) this;
        }

        public Criteria andMajorChangeAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("major_change_amount >=", value, "majorChangeAmount");
            return (Criteria) this;
        }

        public Criteria andMajorChangeAmountLessThan(Integer value) {
            addCriterion("major_change_amount <", value, "majorChangeAmount");
            return (Criteria) this;
        }

        public Criteria andMajorChangeAmountLessThanOrEqualTo(Integer value) {
            addCriterion("major_change_amount <=", value, "majorChangeAmount");
            return (Criteria) this;
        }

        public Criteria andMajorChangeAmountIn(List<Integer> values) {
            addCriterion("major_change_amount in", values, "majorChangeAmount");
            return (Criteria) this;
        }

        public Criteria andMajorChangeAmountNotIn(List<Integer> values) {
            addCriterion("major_change_amount not in", values, "majorChangeAmount");
            return (Criteria) this;
        }

        public Criteria andMajorChangeAmountBetween(Integer value1, Integer value2) {
            addCriterion("major_change_amount between", value1, value2, "majorChangeAmount");
            return (Criteria) this;
        }

        public Criteria andMajorChangeAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("major_change_amount not between", value1, value2, "majorChangeAmount");
            return (Criteria) this;
        }

        public Criteria andBonusAmountIsNull() {
            addCriterion("bonus_amount is null");
            return (Criteria) this;
        }

        public Criteria andBonusAmountIsNotNull() {
            addCriterion("bonus_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBonusAmountEqualTo(Integer value) {
            addCriterion("bonus_amount =", value, "bonusAmount");
            return (Criteria) this;
        }

        public Criteria andBonusAmountNotEqualTo(Integer value) {
            addCriterion("bonus_amount <>", value, "bonusAmount");
            return (Criteria) this;
        }

        public Criteria andBonusAmountGreaterThan(Integer value) {
            addCriterion("bonus_amount >", value, "bonusAmount");
            return (Criteria) this;
        }

        public Criteria andBonusAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("bonus_amount >=", value, "bonusAmount");
            return (Criteria) this;
        }

        public Criteria andBonusAmountLessThan(Integer value) {
            addCriterion("bonus_amount <", value, "bonusAmount");
            return (Criteria) this;
        }

        public Criteria andBonusAmountLessThanOrEqualTo(Integer value) {
            addCriterion("bonus_amount <=", value, "bonusAmount");
            return (Criteria) this;
        }

        public Criteria andBonusAmountIn(List<Integer> values) {
            addCriterion("bonus_amount in", values, "bonusAmount");
            return (Criteria) this;
        }

        public Criteria andBonusAmountNotIn(List<Integer> values) {
            addCriterion("bonus_amount not in", values, "bonusAmount");
            return (Criteria) this;
        }

        public Criteria andBonusAmountBetween(Integer value1, Integer value2) {
            addCriterion("bonus_amount between", value1, value2, "bonusAmount");
            return (Criteria) this;
        }

        public Criteria andBonusAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("bonus_amount not between", value1, value2, "bonusAmount");
            return (Criteria) this;
        }

        public Criteria andTrainingAmountIsNull() {
            addCriterion("training_amount is null");
            return (Criteria) this;
        }

        public Criteria andTrainingAmountIsNotNull() {
            addCriterion("training_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTrainingAmountEqualTo(Integer value) {
            addCriterion("training_amount =", value, "trainingAmount");
            return (Criteria) this;
        }

        public Criteria andTrainingAmountNotEqualTo(Integer value) {
            addCriterion("training_amount <>", value, "trainingAmount");
            return (Criteria) this;
        }

        public Criteria andTrainingAmountGreaterThan(Integer value) {
            addCriterion("training_amount >", value, "trainingAmount");
            return (Criteria) this;
        }

        public Criteria andTrainingAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("training_amount >=", value, "trainingAmount");
            return (Criteria) this;
        }

        public Criteria andTrainingAmountLessThan(Integer value) {
            addCriterion("training_amount <", value, "trainingAmount");
            return (Criteria) this;
        }

        public Criteria andTrainingAmountLessThanOrEqualTo(Integer value) {
            addCriterion("training_amount <=", value, "trainingAmount");
            return (Criteria) this;
        }

        public Criteria andTrainingAmountIn(List<Integer> values) {
            addCriterion("training_amount in", values, "trainingAmount");
            return (Criteria) this;
        }

        public Criteria andTrainingAmountNotIn(List<Integer> values) {
            addCriterion("training_amount not in", values, "trainingAmount");
            return (Criteria) this;
        }

        public Criteria andTrainingAmountBetween(Integer value1, Integer value2) {
            addCriterion("training_amount between", value1, value2, "trainingAmount");
            return (Criteria) this;
        }

        public Criteria andTrainingAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("training_amount not between", value1, value2, "trainingAmount");
            return (Criteria) this;
        }

        public Criteria andFileChangAmountIsNull() {
            addCriterion("file_chang_amount is null");
            return (Criteria) this;
        }

        public Criteria andFileChangAmountIsNotNull() {
            addCriterion("file_chang_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFileChangAmountEqualTo(Integer value) {
            addCriterion("file_chang_amount =", value, "fileChangAmount");
            return (Criteria) this;
        }

        public Criteria andFileChangAmountNotEqualTo(Integer value) {
            addCriterion("file_chang_amount <>", value, "fileChangAmount");
            return (Criteria) this;
        }

        public Criteria andFileChangAmountGreaterThan(Integer value) {
            addCriterion("file_chang_amount >", value, "fileChangAmount");
            return (Criteria) this;
        }

        public Criteria andFileChangAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_chang_amount >=", value, "fileChangAmount");
            return (Criteria) this;
        }

        public Criteria andFileChangAmountLessThan(Integer value) {
            addCriterion("file_chang_amount <", value, "fileChangAmount");
            return (Criteria) this;
        }

        public Criteria andFileChangAmountLessThanOrEqualTo(Integer value) {
            addCriterion("file_chang_amount <=", value, "fileChangAmount");
            return (Criteria) this;
        }

        public Criteria andFileChangAmountIn(List<Integer> values) {
            addCriterion("file_chang_amount in", values, "fileChangAmount");
            return (Criteria) this;
        }

        public Criteria andFileChangAmountNotIn(List<Integer> values) {
            addCriterion("file_chang_amount not in", values, "fileChangAmount");
            return (Criteria) this;
        }

        public Criteria andFileChangAmountBetween(Integer value1, Integer value2) {
            addCriterion("file_chang_amount between", value1, value2, "fileChangAmount");
            return (Criteria) this;
        }

        public Criteria andFileChangAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("file_chang_amount not between", value1, value2, "fileChangAmount");
            return (Criteria) this;
        }

        public Criteria andHumanHistroyRecordsIsNull() {
            addCriterion("human_histroy_records is null");
            return (Criteria) this;
        }

        public Criteria andHumanHistroyRecordsIsNotNull() {
            addCriterion("human_histroy_records is not null");
            return (Criteria) this;
        }

        public Criteria andHumanHistroyRecordsEqualTo(String value) {
            addCriterion("human_histroy_records =", value, "humanHistroyRecords");
            return (Criteria) this;
        }

        public Criteria andHumanHistroyRecordsNotEqualTo(String value) {
            addCriterion("human_histroy_records <>", value, "humanHistroyRecords");
            return (Criteria) this;
        }

        public Criteria andHumanHistroyRecordsGreaterThan(String value) {
            addCriterion("human_histroy_records >", value, "humanHistroyRecords");
            return (Criteria) this;
        }

        public Criteria andHumanHistroyRecordsGreaterThanOrEqualTo(String value) {
            addCriterion("human_histroy_records >=", value, "humanHistroyRecords");
            return (Criteria) this;
        }

        public Criteria andHumanHistroyRecordsLessThan(String value) {
            addCriterion("human_histroy_records <", value, "humanHistroyRecords");
            return (Criteria) this;
        }

        public Criteria andHumanHistroyRecordsLessThanOrEqualTo(String value) {
            addCriterion("human_histroy_records <=", value, "humanHistroyRecords");
            return (Criteria) this;
        }

        public Criteria andHumanHistroyRecordsLike(String value) {
            addCriterion("human_histroy_records like", value, "humanHistroyRecords");
            return (Criteria) this;
        }

        public Criteria andHumanHistroyRecordsNotLike(String value) {
            addCriterion("human_histroy_records not like", value, "humanHistroyRecords");
            return (Criteria) this;
        }

        public Criteria andHumanHistroyRecordsIn(List<String> values) {
            addCriterion("human_histroy_records in", values, "humanHistroyRecords");
            return (Criteria) this;
        }

        public Criteria andHumanHistroyRecordsNotIn(List<String> values) {
            addCriterion("human_histroy_records not in", values, "humanHistroyRecords");
            return (Criteria) this;
        }

        public Criteria andHumanHistroyRecordsBetween(String value1, String value2) {
            addCriterion("human_histroy_records between", value1, value2, "humanHistroyRecords");
            return (Criteria) this;
        }

        public Criteria andHumanHistroyRecordsNotBetween(String value1, String value2) {
            addCriterion("human_histroy_records not between", value1, value2, "humanHistroyRecords");
            return (Criteria) this;
        }

        public Criteria andHumanFamilyMembershipIsNull() {
            addCriterion("human_family_membership is null");
            return (Criteria) this;
        }

        public Criteria andHumanFamilyMembershipIsNotNull() {
            addCriterion("human_family_membership is not null");
            return (Criteria) this;
        }

        public Criteria andHumanFamilyMembershipEqualTo(String value) {
            addCriterion("human_family_membership =", value, "humanFamilyMembership");
            return (Criteria) this;
        }

        public Criteria andHumanFamilyMembershipNotEqualTo(String value) {
            addCriterion("human_family_membership <>", value, "humanFamilyMembership");
            return (Criteria) this;
        }

        public Criteria andHumanFamilyMembershipGreaterThan(String value) {
            addCriterion("human_family_membership >", value, "humanFamilyMembership");
            return (Criteria) this;
        }

        public Criteria andHumanFamilyMembershipGreaterThanOrEqualTo(String value) {
            addCriterion("human_family_membership >=", value, "humanFamilyMembership");
            return (Criteria) this;
        }

        public Criteria andHumanFamilyMembershipLessThan(String value) {
            addCriterion("human_family_membership <", value, "humanFamilyMembership");
            return (Criteria) this;
        }

        public Criteria andHumanFamilyMembershipLessThanOrEqualTo(String value) {
            addCriterion("human_family_membership <=", value, "humanFamilyMembership");
            return (Criteria) this;
        }

        public Criteria andHumanFamilyMembershipLike(String value) {
            addCriterion("human_family_membership like", value, "humanFamilyMembership");
            return (Criteria) this;
        }

        public Criteria andHumanFamilyMembershipNotLike(String value) {
            addCriterion("human_family_membership not like", value, "humanFamilyMembership");
            return (Criteria) this;
        }

        public Criteria andHumanFamilyMembershipIn(List<String> values) {
            addCriterion("human_family_membership in", values, "humanFamilyMembership");
            return (Criteria) this;
        }

        public Criteria andHumanFamilyMembershipNotIn(List<String> values) {
            addCriterion("human_family_membership not in", values, "humanFamilyMembership");
            return (Criteria) this;
        }

        public Criteria andHumanFamilyMembershipBetween(String value1, String value2) {
            addCriterion("human_family_membership between", value1, value2, "humanFamilyMembership");
            return (Criteria) this;
        }

        public Criteria andHumanFamilyMembershipNotBetween(String value1, String value2) {
            addCriterion("human_family_membership not between", value1, value2, "humanFamilyMembership");
            return (Criteria) this;
        }

        public Criteria andHumanPictureIsNull() {
            addCriterion("human_picture is null");
            return (Criteria) this;
        }

        public Criteria andHumanPictureIsNotNull() {
            addCriterion("human_picture is not null");
            return (Criteria) this;
        }

        public Criteria andHumanPictureEqualTo(String value) {
            addCriterion("human_picture =", value, "humanPicture");
            return (Criteria) this;
        }

        public Criteria andHumanPictureNotEqualTo(String value) {
            addCriterion("human_picture <>", value, "humanPicture");
            return (Criteria) this;
        }

        public Criteria andHumanPictureGreaterThan(String value) {
            addCriterion("human_picture >", value, "humanPicture");
            return (Criteria) this;
        }

        public Criteria andHumanPictureGreaterThanOrEqualTo(String value) {
            addCriterion("human_picture >=", value, "humanPicture");
            return (Criteria) this;
        }

        public Criteria andHumanPictureLessThan(String value) {
            addCriterion("human_picture <", value, "humanPicture");
            return (Criteria) this;
        }

        public Criteria andHumanPictureLessThanOrEqualTo(String value) {
            addCriterion("human_picture <=", value, "humanPicture");
            return (Criteria) this;
        }

        public Criteria andHumanPictureLike(String value) {
            addCriterion("human_picture like", value, "humanPicture");
            return (Criteria) this;
        }

        public Criteria andHumanPictureNotLike(String value) {
            addCriterion("human_picture not like", value, "humanPicture");
            return (Criteria) this;
        }

        public Criteria andHumanPictureIn(List<String> values) {
            addCriterion("human_picture in", values, "humanPicture");
            return (Criteria) this;
        }

        public Criteria andHumanPictureNotIn(List<String> values) {
            addCriterion("human_picture not in", values, "humanPicture");
            return (Criteria) this;
        }

        public Criteria andHumanPictureBetween(String value1, String value2) {
            addCriterion("human_picture between", value1, value2, "humanPicture");
            return (Criteria) this;
        }

        public Criteria andHumanPictureNotBetween(String value1, String value2) {
            addCriterion("human_picture not between", value1, value2, "humanPicture");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameIsNull() {
            addCriterion("attachment_name is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameIsNotNull() {
            addCriterion("attachment_name is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameEqualTo(String value) {
            addCriterion("attachment_name =", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameNotEqualTo(String value) {
            addCriterion("attachment_name <>", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameGreaterThan(String value) {
            addCriterion("attachment_name >", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("attachment_name >=", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameLessThan(String value) {
            addCriterion("attachment_name <", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameLessThanOrEqualTo(String value) {
            addCriterion("attachment_name <=", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameLike(String value) {
            addCriterion("attachment_name like", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameNotLike(String value) {
            addCriterion("attachment_name not like", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameIn(List<String> values) {
            addCriterion("attachment_name in", values, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameNotIn(List<String> values) {
            addCriterion("attachment_name not in", values, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameBetween(String value1, String value2) {
            addCriterion("attachment_name between", value1, value2, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameNotBetween(String value1, String value2) {
            addCriterion("attachment_name not between", value1, value2, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNull() {
            addCriterion("check_status is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("check_status is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(Integer value) {
            addCriterion("check_status =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(Integer value) {
            addCriterion("check_status <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(Integer value) {
            addCriterion("check_status >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_status >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(Integer value) {
            addCriterion("check_status <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(Integer value) {
            addCriterion("check_status <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<Integer> values) {
            addCriterion("check_status in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<Integer> values) {
            addCriterion("check_status not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(Integer value1, Integer value2) {
            addCriterion("check_status between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("check_status not between", value1, value2, "checkStatus");
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

        public Criteria andCheckerIsNull() {
            addCriterion("checker is null");
            return (Criteria) this;
        }

        public Criteria andCheckerIsNotNull() {
            addCriterion("checker is not null");
            return (Criteria) this;
        }

        public Criteria andCheckerEqualTo(String value) {
            addCriterion("checker =", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotEqualTo(String value) {
            addCriterion("checker <>", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThan(String value) {
            addCriterion("checker >", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThanOrEqualTo(String value) {
            addCriterion("checker >=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThan(String value) {
            addCriterion("checker <", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThanOrEqualTo(String value) {
            addCriterion("checker <=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLike(String value) {
            addCriterion("checker like", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotLike(String value) {
            addCriterion("checker not like", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerIn(List<String> values) {
            addCriterion("checker in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotIn(List<String> values) {
            addCriterion("checker not in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerBetween(String value1, String value2) {
            addCriterion("checker between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotBetween(String value1, String value2) {
            addCriterion("checker not between", value1, value2, "checker");
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

        public Criteria andCheckTimeIsNull() {
            addCriterion("check_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(Date value) {
            addCriterionForJDBCDate("check_time =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("check_time <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("check_time >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("check_time >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(Date value) {
            addCriterionForJDBCDate("check_time <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("check_time <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<Date> values) {
            addCriterionForJDBCDate("check_time in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("check_time not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("check_time between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("check_time not between", value1, value2, "checkTime");
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

        public Criteria andLastlyChangeTimeIsNull() {
            addCriterion("lastly_change_time is null");
            return (Criteria) this;
        }

        public Criteria andLastlyChangeTimeIsNotNull() {
            addCriterion("lastly_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastlyChangeTimeEqualTo(Date value) {
            addCriterionForJDBCDate("lastly_change_time =", value, "lastlyChangeTime");
            return (Criteria) this;
        }

        public Criteria andLastlyChangeTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("lastly_change_time <>", value, "lastlyChangeTime");
            return (Criteria) this;
        }

        public Criteria andLastlyChangeTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("lastly_change_time >", value, "lastlyChangeTime");
            return (Criteria) this;
        }

        public Criteria andLastlyChangeTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lastly_change_time >=", value, "lastlyChangeTime");
            return (Criteria) this;
        }

        public Criteria andLastlyChangeTimeLessThan(Date value) {
            addCriterionForJDBCDate("lastly_change_time <", value, "lastlyChangeTime");
            return (Criteria) this;
        }

        public Criteria andLastlyChangeTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lastly_change_time <=", value, "lastlyChangeTime");
            return (Criteria) this;
        }

        public Criteria andLastlyChangeTimeIn(List<Date> values) {
            addCriterionForJDBCDate("lastly_change_time in", values, "lastlyChangeTime");
            return (Criteria) this;
        }

        public Criteria andLastlyChangeTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("lastly_change_time not in", values, "lastlyChangeTime");
            return (Criteria) this;
        }

        public Criteria andLastlyChangeTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lastly_change_time between", value1, value2, "lastlyChangeTime");
            return (Criteria) this;
        }

        public Criteria andLastlyChangeTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lastly_change_time not between", value1, value2, "lastlyChangeTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNull() {
            addCriterion("delete_time is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("delete_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(Date value) {
            addCriterionForJDBCDate("delete_time =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("delete_time <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("delete_time >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("delete_time >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(Date value) {
            addCriterionForJDBCDate("delete_time <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("delete_time <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<Date> values) {
            addCriterionForJDBCDate("delete_time in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("delete_time not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("delete_time between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("delete_time not between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andRecoveryTimeIsNull() {
            addCriterion("recovery_time is null");
            return (Criteria) this;
        }

        public Criteria andRecoveryTimeIsNotNull() {
            addCriterion("recovery_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecoveryTimeEqualTo(Date value) {
            addCriterionForJDBCDate("recovery_time =", value, "recoveryTime");
            return (Criteria) this;
        }

        public Criteria andRecoveryTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("recovery_time <>", value, "recoveryTime");
            return (Criteria) this;
        }

        public Criteria andRecoveryTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("recovery_time >", value, "recoveryTime");
            return (Criteria) this;
        }

        public Criteria andRecoveryTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("recovery_time >=", value, "recoveryTime");
            return (Criteria) this;
        }

        public Criteria andRecoveryTimeLessThan(Date value) {
            addCriterionForJDBCDate("recovery_time <", value, "recoveryTime");
            return (Criteria) this;
        }

        public Criteria andRecoveryTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("recovery_time <=", value, "recoveryTime");
            return (Criteria) this;
        }

        public Criteria andRecoveryTimeIn(List<Date> values) {
            addCriterionForJDBCDate("recovery_time in", values, "recoveryTime");
            return (Criteria) this;
        }

        public Criteria andRecoveryTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("recovery_time not in", values, "recoveryTime");
            return (Criteria) this;
        }

        public Criteria andRecoveryTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("recovery_time between", value1, value2, "recoveryTime");
            return (Criteria) this;
        }

        public Criteria andRecoveryTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("recovery_time not between", value1, value2, "recoveryTime");
            return (Criteria) this;
        }

        public Criteria andHumanFileStatusIsNull() {
            addCriterion("human_file_status is null");
            return (Criteria) this;
        }

        public Criteria andHumanFileStatusIsNotNull() {
            addCriterion("human_file_status is not null");
            return (Criteria) this;
        }

        public Criteria andHumanFileStatusEqualTo(Integer value) {
            addCriterion("human_file_status =", value, "humanFileStatus");
            return (Criteria) this;
        }

        public Criteria andHumanFileStatusNotEqualTo(Integer value) {
            addCriterion("human_file_status <>", value, "humanFileStatus");
            return (Criteria) this;
        }

        public Criteria andHumanFileStatusGreaterThan(Integer value) {
            addCriterion("human_file_status >", value, "humanFileStatus");
            return (Criteria) this;
        }

        public Criteria andHumanFileStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("human_file_status >=", value, "humanFileStatus");
            return (Criteria) this;
        }

        public Criteria andHumanFileStatusLessThan(Integer value) {
            addCriterion("human_file_status <", value, "humanFileStatus");
            return (Criteria) this;
        }

        public Criteria andHumanFileStatusLessThanOrEqualTo(Integer value) {
            addCriterion("human_file_status <=", value, "humanFileStatus");
            return (Criteria) this;
        }

        public Criteria andHumanFileStatusIn(List<Integer> values) {
            addCriterion("human_file_status in", values, "humanFileStatus");
            return (Criteria) this;
        }

        public Criteria andHumanFileStatusNotIn(List<Integer> values) {
            addCriterion("human_file_status not in", values, "humanFileStatus");
            return (Criteria) this;
        }

        public Criteria andHumanFileStatusBetween(Integer value1, Integer value2) {
            addCriterion("human_file_status between", value1, value2, "humanFileStatus");
            return (Criteria) this;
        }

        public Criteria andHumanFileStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("human_file_status not between", value1, value2, "humanFileStatus");
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
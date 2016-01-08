package hr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MajorChangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public MajorChangeExample() {
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

        public Criteria andMajorKindIdIsNull() {
            addCriterion("major_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdIsNotNull() {
            addCriterion("major_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdEqualTo(String value) {
            addCriterion("major_kind_id =", value, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdNotEqualTo(String value) {
            addCriterion("major_kind_id <>", value, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdGreaterThan(String value) {
            addCriterion("major_kind_id >", value, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("major_kind_id >=", value, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdLessThan(String value) {
            addCriterion("major_kind_id <", value, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdLessThanOrEqualTo(String value) {
            addCriterion("major_kind_id <=", value, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdLike(String value) {
            addCriterion("major_kind_id like", value, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdNotLike(String value) {
            addCriterion("major_kind_id not like", value, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdIn(List<String> values) {
            addCriterion("major_kind_id in", values, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdNotIn(List<String> values) {
            addCriterion("major_kind_id not in", values, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdBetween(String value1, String value2) {
            addCriterion("major_kind_id between", value1, value2, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdNotBetween(String value1, String value2) {
            addCriterion("major_kind_id not between", value1, value2, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameIsNull() {
            addCriterion("major_kind_name is null");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameIsNotNull() {
            addCriterion("major_kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameEqualTo(String value) {
            addCriterion("major_kind_name =", value, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameNotEqualTo(String value) {
            addCriterion("major_kind_name <>", value, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameGreaterThan(String value) {
            addCriterion("major_kind_name >", value, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("major_kind_name >=", value, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameLessThan(String value) {
            addCriterion("major_kind_name <", value, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameLessThanOrEqualTo(String value) {
            addCriterion("major_kind_name <=", value, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameLike(String value) {
            addCriterion("major_kind_name like", value, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameNotLike(String value) {
            addCriterion("major_kind_name not like", value, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameIn(List<String> values) {
            addCriterion("major_kind_name in", values, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameNotIn(List<String> values) {
            addCriterion("major_kind_name not in", values, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameBetween(String value1, String value2) {
            addCriterion("major_kind_name between", value1, value2, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameNotBetween(String value1, String value2) {
            addCriterion("major_kind_name not between", value1, value2, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorIdIsNull() {
            addCriterion("major_id is null");
            return (Criteria) this;
        }

        public Criteria andMajorIdIsNotNull() {
            addCriterion("major_id is not null");
            return (Criteria) this;
        }

        public Criteria andMajorIdEqualTo(String value) {
            addCriterion("major_id =", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotEqualTo(String value) {
            addCriterion("major_id <>", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThan(String value) {
            addCriterion("major_id >", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThanOrEqualTo(String value) {
            addCriterion("major_id >=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThan(String value) {
            addCriterion("major_id <", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThanOrEqualTo(String value) {
            addCriterion("major_id <=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLike(String value) {
            addCriterion("major_id like", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotLike(String value) {
            addCriterion("major_id not like", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdIn(List<String> values) {
            addCriterion("major_id in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotIn(List<String> values) {
            addCriterion("major_id not in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdBetween(String value1, String value2) {
            addCriterion("major_id between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotBetween(String value1, String value2) {
            addCriterion("major_id not between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorNameIsNull() {
            addCriterion("major_name is null");
            return (Criteria) this;
        }

        public Criteria andMajorNameIsNotNull() {
            addCriterion("major_name is not null");
            return (Criteria) this;
        }

        public Criteria andMajorNameEqualTo(String value) {
            addCriterion("major_name =", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotEqualTo(String value) {
            addCriterion("major_name <>", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameGreaterThan(String value) {
            addCriterion("major_name >", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameGreaterThanOrEqualTo(String value) {
            addCriterion("major_name >=", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLessThan(String value) {
            addCriterion("major_name <", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLessThanOrEqualTo(String value) {
            addCriterion("major_name <=", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLike(String value) {
            addCriterion("major_name like", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotLike(String value) {
            addCriterion("major_name not like", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameIn(List<String> values) {
            addCriterion("major_name in", values, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotIn(List<String> values) {
            addCriterion("major_name not in", values, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameBetween(String value1, String value2) {
            addCriterion("major_name between", value1, value2, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotBetween(String value1, String value2) {
            addCriterion("major_name not between", value1, value2, "majorName");
            return (Criteria) this;
        }

        public Criteria andNewFirstKindIdIsNull() {
            addCriterion("new_first_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andNewFirstKindIdIsNotNull() {
            addCriterion("new_first_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewFirstKindIdEqualTo(String value) {
            addCriterion("new_first_kind_id =", value, "newFirstKindId");
            return (Criteria) this;
        }

        public Criteria andNewFirstKindIdNotEqualTo(String value) {
            addCriterion("new_first_kind_id <>", value, "newFirstKindId");
            return (Criteria) this;
        }

        public Criteria andNewFirstKindIdGreaterThan(String value) {
            addCriterion("new_first_kind_id >", value, "newFirstKindId");
            return (Criteria) this;
        }

        public Criteria andNewFirstKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("new_first_kind_id >=", value, "newFirstKindId");
            return (Criteria) this;
        }

        public Criteria andNewFirstKindIdLessThan(String value) {
            addCriterion("new_first_kind_id <", value, "newFirstKindId");
            return (Criteria) this;
        }

        public Criteria andNewFirstKindIdLessThanOrEqualTo(String value) {
            addCriterion("new_first_kind_id <=", value, "newFirstKindId");
            return (Criteria) this;
        }

        public Criteria andNewFirstKindIdLike(String value) {
            addCriterion("new_first_kind_id like", value, "newFirstKindId");
            return (Criteria) this;
        }

        public Criteria andNewFirstKindIdNotLike(String value) {
            addCriterion("new_first_kind_id not like", value, "newFirstKindId");
            return (Criteria) this;
        }

        public Criteria andNewFirstKindIdIn(List<String> values) {
            addCriterion("new_first_kind_id in", values, "newFirstKindId");
            return (Criteria) this;
        }

        public Criteria andNewFirstKindIdNotIn(List<String> values) {
            addCriterion("new_first_kind_id not in", values, "newFirstKindId");
            return (Criteria) this;
        }

        public Criteria andNewFirstKindIdBetween(String value1, String value2) {
            addCriterion("new_first_kind_id between", value1, value2, "newFirstKindId");
            return (Criteria) this;
        }

        public Criteria andNewFirstKindIdNotBetween(String value1, String value2) {
            addCriterion("new_first_kind_id not between", value1, value2, "newFirstKindId");
            return (Criteria) this;
        }

        public Criteria andNewFirstKindNameIsNull() {
            addCriterion("new_first_kind_name is null");
            return (Criteria) this;
        }

        public Criteria andNewFirstKindNameIsNotNull() {
            addCriterion("new_first_kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andNewFirstKindNameEqualTo(String value) {
            addCriterion("new_first_kind_name =", value, "newFirstKindName");
            return (Criteria) this;
        }

        public Criteria andNewFirstKindNameNotEqualTo(String value) {
            addCriterion("new_first_kind_name <>", value, "newFirstKindName");
            return (Criteria) this;
        }

        public Criteria andNewFirstKindNameGreaterThan(String value) {
            addCriterion("new_first_kind_name >", value, "newFirstKindName");
            return (Criteria) this;
        }

        public Criteria andNewFirstKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("new_first_kind_name >=", value, "newFirstKindName");
            return (Criteria) this;
        }

        public Criteria andNewFirstKindNameLessThan(String value) {
            addCriterion("new_first_kind_name <", value, "newFirstKindName");
            return (Criteria) this;
        }

        public Criteria andNewFirstKindNameLessThanOrEqualTo(String value) {
            addCriterion("new_first_kind_name <=", value, "newFirstKindName");
            return (Criteria) this;
        }

        public Criteria andNewFirstKindNameLike(String value) {
            addCriterion("new_first_kind_name like", value, "newFirstKindName");
            return (Criteria) this;
        }

        public Criteria andNewFirstKindNameNotLike(String value) {
            addCriterion("new_first_kind_name not like", value, "newFirstKindName");
            return (Criteria) this;
        }

        public Criteria andNewFirstKindNameIn(List<String> values) {
            addCriterion("new_first_kind_name in", values, "newFirstKindName");
            return (Criteria) this;
        }

        public Criteria andNewFirstKindNameNotIn(List<String> values) {
            addCriterion("new_first_kind_name not in", values, "newFirstKindName");
            return (Criteria) this;
        }

        public Criteria andNewFirstKindNameBetween(String value1, String value2) {
            addCriterion("new_first_kind_name between", value1, value2, "newFirstKindName");
            return (Criteria) this;
        }

        public Criteria andNewFirstKindNameNotBetween(String value1, String value2) {
            addCriterion("new_first_kind_name not between", value1, value2, "newFirstKindName");
            return (Criteria) this;
        }

        public Criteria andNewSecondKindIdIsNull() {
            addCriterion("new_second_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andNewSecondKindIdIsNotNull() {
            addCriterion("new_second_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewSecondKindIdEqualTo(String value) {
            addCriterion("new_second_kind_id =", value, "newSecondKindId");
            return (Criteria) this;
        }

        public Criteria andNewSecondKindIdNotEqualTo(String value) {
            addCriterion("new_second_kind_id <>", value, "newSecondKindId");
            return (Criteria) this;
        }

        public Criteria andNewSecondKindIdGreaterThan(String value) {
            addCriterion("new_second_kind_id >", value, "newSecondKindId");
            return (Criteria) this;
        }

        public Criteria andNewSecondKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("new_second_kind_id >=", value, "newSecondKindId");
            return (Criteria) this;
        }

        public Criteria andNewSecondKindIdLessThan(String value) {
            addCriterion("new_second_kind_id <", value, "newSecondKindId");
            return (Criteria) this;
        }

        public Criteria andNewSecondKindIdLessThanOrEqualTo(String value) {
            addCriterion("new_second_kind_id <=", value, "newSecondKindId");
            return (Criteria) this;
        }

        public Criteria andNewSecondKindIdLike(String value) {
            addCriterion("new_second_kind_id like", value, "newSecondKindId");
            return (Criteria) this;
        }

        public Criteria andNewSecondKindIdNotLike(String value) {
            addCriterion("new_second_kind_id not like", value, "newSecondKindId");
            return (Criteria) this;
        }

        public Criteria andNewSecondKindIdIn(List<String> values) {
            addCriterion("new_second_kind_id in", values, "newSecondKindId");
            return (Criteria) this;
        }

        public Criteria andNewSecondKindIdNotIn(List<String> values) {
            addCriterion("new_second_kind_id not in", values, "newSecondKindId");
            return (Criteria) this;
        }

        public Criteria andNewSecondKindIdBetween(String value1, String value2) {
            addCriterion("new_second_kind_id between", value1, value2, "newSecondKindId");
            return (Criteria) this;
        }

        public Criteria andNewSecondKindIdNotBetween(String value1, String value2) {
            addCriterion("new_second_kind_id not between", value1, value2, "newSecondKindId");
            return (Criteria) this;
        }

        public Criteria andNewSecondKindNameIsNull() {
            addCriterion("new_second_kind_name is null");
            return (Criteria) this;
        }

        public Criteria andNewSecondKindNameIsNotNull() {
            addCriterion("new_second_kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andNewSecondKindNameEqualTo(String value) {
            addCriterion("new_second_kind_name =", value, "newSecondKindName");
            return (Criteria) this;
        }

        public Criteria andNewSecondKindNameNotEqualTo(String value) {
            addCriterion("new_second_kind_name <>", value, "newSecondKindName");
            return (Criteria) this;
        }

        public Criteria andNewSecondKindNameGreaterThan(String value) {
            addCriterion("new_second_kind_name >", value, "newSecondKindName");
            return (Criteria) this;
        }

        public Criteria andNewSecondKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("new_second_kind_name >=", value, "newSecondKindName");
            return (Criteria) this;
        }

        public Criteria andNewSecondKindNameLessThan(String value) {
            addCriterion("new_second_kind_name <", value, "newSecondKindName");
            return (Criteria) this;
        }

        public Criteria andNewSecondKindNameLessThanOrEqualTo(String value) {
            addCriterion("new_second_kind_name <=", value, "newSecondKindName");
            return (Criteria) this;
        }

        public Criteria andNewSecondKindNameLike(String value) {
            addCriterion("new_second_kind_name like", value, "newSecondKindName");
            return (Criteria) this;
        }

        public Criteria andNewSecondKindNameNotLike(String value) {
            addCriterion("new_second_kind_name not like", value, "newSecondKindName");
            return (Criteria) this;
        }

        public Criteria andNewSecondKindNameIn(List<String> values) {
            addCriterion("new_second_kind_name in", values, "newSecondKindName");
            return (Criteria) this;
        }

        public Criteria andNewSecondKindNameNotIn(List<String> values) {
            addCriterion("new_second_kind_name not in", values, "newSecondKindName");
            return (Criteria) this;
        }

        public Criteria andNewSecondKindNameBetween(String value1, String value2) {
            addCriterion("new_second_kind_name between", value1, value2, "newSecondKindName");
            return (Criteria) this;
        }

        public Criteria andNewSecondKindNameNotBetween(String value1, String value2) {
            addCriterion("new_second_kind_name not between", value1, value2, "newSecondKindName");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindIdIsNull() {
            addCriterion("new_third_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindIdIsNotNull() {
            addCriterion("new_third_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindIdEqualTo(String value) {
            addCriterion("new_third_kind_id =", value, "newThirdKindId");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindIdNotEqualTo(String value) {
            addCriterion("new_third_kind_id <>", value, "newThirdKindId");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindIdGreaterThan(String value) {
            addCriterion("new_third_kind_id >", value, "newThirdKindId");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("new_third_kind_id >=", value, "newThirdKindId");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindIdLessThan(String value) {
            addCriterion("new_third_kind_id <", value, "newThirdKindId");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindIdLessThanOrEqualTo(String value) {
            addCriterion("new_third_kind_id <=", value, "newThirdKindId");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindIdLike(String value) {
            addCriterion("new_third_kind_id like", value, "newThirdKindId");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindIdNotLike(String value) {
            addCriterion("new_third_kind_id not like", value, "newThirdKindId");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindIdIn(List<String> values) {
            addCriterion("new_third_kind_id in", values, "newThirdKindId");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindIdNotIn(List<String> values) {
            addCriterion("new_third_kind_id not in", values, "newThirdKindId");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindIdBetween(String value1, String value2) {
            addCriterion("new_third_kind_id between", value1, value2, "newThirdKindId");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindIdNotBetween(String value1, String value2) {
            addCriterion("new_third_kind_id not between", value1, value2, "newThirdKindId");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindNameIsNull() {
            addCriterion("new_third_kind_name is null");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindNameIsNotNull() {
            addCriterion("new_third_kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindNameEqualTo(String value) {
            addCriterion("new_third_kind_name =", value, "newThirdKindName");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindNameNotEqualTo(String value) {
            addCriterion("new_third_kind_name <>", value, "newThirdKindName");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindNameGreaterThan(String value) {
            addCriterion("new_third_kind_name >", value, "newThirdKindName");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("new_third_kind_name >=", value, "newThirdKindName");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindNameLessThan(String value) {
            addCriterion("new_third_kind_name <", value, "newThirdKindName");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindNameLessThanOrEqualTo(String value) {
            addCriterion("new_third_kind_name <=", value, "newThirdKindName");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindNameLike(String value) {
            addCriterion("new_third_kind_name like", value, "newThirdKindName");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindNameNotLike(String value) {
            addCriterion("new_third_kind_name not like", value, "newThirdKindName");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindNameIn(List<String> values) {
            addCriterion("new_third_kind_name in", values, "newThirdKindName");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindNameNotIn(List<String> values) {
            addCriterion("new_third_kind_name not in", values, "newThirdKindName");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindNameBetween(String value1, String value2) {
            addCriterion("new_third_kind_name between", value1, value2, "newThirdKindName");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindNameNotBetween(String value1, String value2) {
            addCriterion("new_third_kind_name not between", value1, value2, "newThirdKindName");
            return (Criteria) this;
        }

        public Criteria andNewMajorKindIdIsNull() {
            addCriterion("new_major_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andNewMajorKindIdIsNotNull() {
            addCriterion("new_major_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewMajorKindIdEqualTo(String value) {
            addCriterion("new_major_kind_id =", value, "newMajorKindId");
            return (Criteria) this;
        }

        public Criteria andNewMajorKindIdNotEqualTo(String value) {
            addCriterion("new_major_kind_id <>", value, "newMajorKindId");
            return (Criteria) this;
        }

        public Criteria andNewMajorKindIdGreaterThan(String value) {
            addCriterion("new_major_kind_id >", value, "newMajorKindId");
            return (Criteria) this;
        }

        public Criteria andNewMajorKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("new_major_kind_id >=", value, "newMajorKindId");
            return (Criteria) this;
        }

        public Criteria andNewMajorKindIdLessThan(String value) {
            addCriterion("new_major_kind_id <", value, "newMajorKindId");
            return (Criteria) this;
        }

        public Criteria andNewMajorKindIdLessThanOrEqualTo(String value) {
            addCriterion("new_major_kind_id <=", value, "newMajorKindId");
            return (Criteria) this;
        }

        public Criteria andNewMajorKindIdLike(String value) {
            addCriterion("new_major_kind_id like", value, "newMajorKindId");
            return (Criteria) this;
        }

        public Criteria andNewMajorKindIdNotLike(String value) {
            addCriterion("new_major_kind_id not like", value, "newMajorKindId");
            return (Criteria) this;
        }

        public Criteria andNewMajorKindIdIn(List<String> values) {
            addCriterion("new_major_kind_id in", values, "newMajorKindId");
            return (Criteria) this;
        }

        public Criteria andNewMajorKindIdNotIn(List<String> values) {
            addCriterion("new_major_kind_id not in", values, "newMajorKindId");
            return (Criteria) this;
        }

        public Criteria andNewMajorKindIdBetween(String value1, String value2) {
            addCriterion("new_major_kind_id between", value1, value2, "newMajorKindId");
            return (Criteria) this;
        }

        public Criteria andNewMajorKindIdNotBetween(String value1, String value2) {
            addCriterion("new_major_kind_id not between", value1, value2, "newMajorKindId");
            return (Criteria) this;
        }

        public Criteria andNewMajorKindNameIsNull() {
            addCriterion("new_major_kind_name is null");
            return (Criteria) this;
        }

        public Criteria andNewMajorKindNameIsNotNull() {
            addCriterion("new_major_kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andNewMajorKindNameEqualTo(String value) {
            addCriterion("new_major_kind_name =", value, "newMajorKindName");
            return (Criteria) this;
        }

        public Criteria andNewMajorKindNameNotEqualTo(String value) {
            addCriterion("new_major_kind_name <>", value, "newMajorKindName");
            return (Criteria) this;
        }

        public Criteria andNewMajorKindNameGreaterThan(String value) {
            addCriterion("new_major_kind_name >", value, "newMajorKindName");
            return (Criteria) this;
        }

        public Criteria andNewMajorKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("new_major_kind_name >=", value, "newMajorKindName");
            return (Criteria) this;
        }

        public Criteria andNewMajorKindNameLessThan(String value) {
            addCriterion("new_major_kind_name <", value, "newMajorKindName");
            return (Criteria) this;
        }

        public Criteria andNewMajorKindNameLessThanOrEqualTo(String value) {
            addCriterion("new_major_kind_name <=", value, "newMajorKindName");
            return (Criteria) this;
        }

        public Criteria andNewMajorKindNameLike(String value) {
            addCriterion("new_major_kind_name like", value, "newMajorKindName");
            return (Criteria) this;
        }

        public Criteria andNewMajorKindNameNotLike(String value) {
            addCriterion("new_major_kind_name not like", value, "newMajorKindName");
            return (Criteria) this;
        }

        public Criteria andNewMajorKindNameIn(List<String> values) {
            addCriterion("new_major_kind_name in", values, "newMajorKindName");
            return (Criteria) this;
        }

        public Criteria andNewMajorKindNameNotIn(List<String> values) {
            addCriterion("new_major_kind_name not in", values, "newMajorKindName");
            return (Criteria) this;
        }

        public Criteria andNewMajorKindNameBetween(String value1, String value2) {
            addCriterion("new_major_kind_name between", value1, value2, "newMajorKindName");
            return (Criteria) this;
        }

        public Criteria andNewMajorKindNameNotBetween(String value1, String value2) {
            addCriterion("new_major_kind_name not between", value1, value2, "newMajorKindName");
            return (Criteria) this;
        }

        public Criteria andNewMajorIdIsNull() {
            addCriterion("new_major_id is null");
            return (Criteria) this;
        }

        public Criteria andNewMajorIdIsNotNull() {
            addCriterion("new_major_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewMajorIdEqualTo(String value) {
            addCriterion("new_major_id =", value, "newMajorId");
            return (Criteria) this;
        }

        public Criteria andNewMajorIdNotEqualTo(String value) {
            addCriterion("new_major_id <>", value, "newMajorId");
            return (Criteria) this;
        }

        public Criteria andNewMajorIdGreaterThan(String value) {
            addCriterion("new_major_id >", value, "newMajorId");
            return (Criteria) this;
        }

        public Criteria andNewMajorIdGreaterThanOrEqualTo(String value) {
            addCriterion("new_major_id >=", value, "newMajorId");
            return (Criteria) this;
        }

        public Criteria andNewMajorIdLessThan(String value) {
            addCriterion("new_major_id <", value, "newMajorId");
            return (Criteria) this;
        }

        public Criteria andNewMajorIdLessThanOrEqualTo(String value) {
            addCriterion("new_major_id <=", value, "newMajorId");
            return (Criteria) this;
        }

        public Criteria andNewMajorIdLike(String value) {
            addCriterion("new_major_id like", value, "newMajorId");
            return (Criteria) this;
        }

        public Criteria andNewMajorIdNotLike(String value) {
            addCriterion("new_major_id not like", value, "newMajorId");
            return (Criteria) this;
        }

        public Criteria andNewMajorIdIn(List<String> values) {
            addCriterion("new_major_id in", values, "newMajorId");
            return (Criteria) this;
        }

        public Criteria andNewMajorIdNotIn(List<String> values) {
            addCriterion("new_major_id not in", values, "newMajorId");
            return (Criteria) this;
        }

        public Criteria andNewMajorIdBetween(String value1, String value2) {
            addCriterion("new_major_id between", value1, value2, "newMajorId");
            return (Criteria) this;
        }

        public Criteria andNewMajorIdNotBetween(String value1, String value2) {
            addCriterion("new_major_id not between", value1, value2, "newMajorId");
            return (Criteria) this;
        }

        public Criteria andNewMajorNameIsNull() {
            addCriterion("new_major_name is null");
            return (Criteria) this;
        }

        public Criteria andNewMajorNameIsNotNull() {
            addCriterion("new_major_name is not null");
            return (Criteria) this;
        }

        public Criteria andNewMajorNameEqualTo(String value) {
            addCriterion("new_major_name =", value, "newMajorName");
            return (Criteria) this;
        }

        public Criteria andNewMajorNameNotEqualTo(String value) {
            addCriterion("new_major_name <>", value, "newMajorName");
            return (Criteria) this;
        }

        public Criteria andNewMajorNameGreaterThan(String value) {
            addCriterion("new_major_name >", value, "newMajorName");
            return (Criteria) this;
        }

        public Criteria andNewMajorNameGreaterThanOrEqualTo(String value) {
            addCriterion("new_major_name >=", value, "newMajorName");
            return (Criteria) this;
        }

        public Criteria andNewMajorNameLessThan(String value) {
            addCriterion("new_major_name <", value, "newMajorName");
            return (Criteria) this;
        }

        public Criteria andNewMajorNameLessThanOrEqualTo(String value) {
            addCriterion("new_major_name <=", value, "newMajorName");
            return (Criteria) this;
        }

        public Criteria andNewMajorNameLike(String value) {
            addCriterion("new_major_name like", value, "newMajorName");
            return (Criteria) this;
        }

        public Criteria andNewMajorNameNotLike(String value) {
            addCriterion("new_major_name not like", value, "newMajorName");
            return (Criteria) this;
        }

        public Criteria andNewMajorNameIn(List<String> values) {
            addCriterion("new_major_name in", values, "newMajorName");
            return (Criteria) this;
        }

        public Criteria andNewMajorNameNotIn(List<String> values) {
            addCriterion("new_major_name not in", values, "newMajorName");
            return (Criteria) this;
        }

        public Criteria andNewMajorNameBetween(String value1, String value2) {
            addCriterion("new_major_name between", value1, value2, "newMajorName");
            return (Criteria) this;
        }

        public Criteria andNewMajorNameNotBetween(String value1, String value2) {
            addCriterion("new_major_name not between", value1, value2, "newMajorName");
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

        public Criteria andNewSalaryStandardIdIsNull() {
            addCriterion("new_salary_standard_id is null");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardIdIsNotNull() {
            addCriterion("new_salary_standard_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardIdEqualTo(String value) {
            addCriterion("new_salary_standard_id =", value, "newSalaryStandardId");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardIdNotEqualTo(String value) {
            addCriterion("new_salary_standard_id <>", value, "newSalaryStandardId");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardIdGreaterThan(String value) {
            addCriterion("new_salary_standard_id >", value, "newSalaryStandardId");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardIdGreaterThanOrEqualTo(String value) {
            addCriterion("new_salary_standard_id >=", value, "newSalaryStandardId");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardIdLessThan(String value) {
            addCriterion("new_salary_standard_id <", value, "newSalaryStandardId");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardIdLessThanOrEqualTo(String value) {
            addCriterion("new_salary_standard_id <=", value, "newSalaryStandardId");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardIdLike(String value) {
            addCriterion("new_salary_standard_id like", value, "newSalaryStandardId");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardIdNotLike(String value) {
            addCriterion("new_salary_standard_id not like", value, "newSalaryStandardId");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardIdIn(List<String> values) {
            addCriterion("new_salary_standard_id in", values, "newSalaryStandardId");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardIdNotIn(List<String> values) {
            addCriterion("new_salary_standard_id not in", values, "newSalaryStandardId");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardIdBetween(String value1, String value2) {
            addCriterion("new_salary_standard_id between", value1, value2, "newSalaryStandardId");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardIdNotBetween(String value1, String value2) {
            addCriterion("new_salary_standard_id not between", value1, value2, "newSalaryStandardId");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardNameIsNull() {
            addCriterion("new_salary_standard_name is null");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardNameIsNotNull() {
            addCriterion("new_salary_standard_name is not null");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardNameEqualTo(String value) {
            addCriterion("new_salary_standard_name =", value, "newSalaryStandardName");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardNameNotEqualTo(String value) {
            addCriterion("new_salary_standard_name <>", value, "newSalaryStandardName");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardNameGreaterThan(String value) {
            addCriterion("new_salary_standard_name >", value, "newSalaryStandardName");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardNameGreaterThanOrEqualTo(String value) {
            addCriterion("new_salary_standard_name >=", value, "newSalaryStandardName");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardNameLessThan(String value) {
            addCriterion("new_salary_standard_name <", value, "newSalaryStandardName");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardNameLessThanOrEqualTo(String value) {
            addCriterion("new_salary_standard_name <=", value, "newSalaryStandardName");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardNameLike(String value) {
            addCriterion("new_salary_standard_name like", value, "newSalaryStandardName");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardNameNotLike(String value) {
            addCriterion("new_salary_standard_name not like", value, "newSalaryStandardName");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardNameIn(List<String> values) {
            addCriterion("new_salary_standard_name in", values, "newSalaryStandardName");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardNameNotIn(List<String> values) {
            addCriterion("new_salary_standard_name not in", values, "newSalaryStandardName");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardNameBetween(String value1, String value2) {
            addCriterion("new_salary_standard_name between", value1, value2, "newSalaryStandardName");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardNameNotBetween(String value1, String value2) {
            addCriterion("new_salary_standard_name not between", value1, value2, "newSalaryStandardName");
            return (Criteria) this;
        }

        public Criteria andNewSalarySumIsNull() {
            addCriterion("new_salary_sum is null");
            return (Criteria) this;
        }

        public Criteria andNewSalarySumIsNotNull() {
            addCriterion("new_salary_sum is not null");
            return (Criteria) this;
        }

        public Criteria andNewSalarySumEqualTo(Double value) {
            addCriterion("new_salary_sum =", value, "newSalarySum");
            return (Criteria) this;
        }

        public Criteria andNewSalarySumNotEqualTo(Double value) {
            addCriterion("new_salary_sum <>", value, "newSalarySum");
            return (Criteria) this;
        }

        public Criteria andNewSalarySumGreaterThan(Double value) {
            addCriterion("new_salary_sum >", value, "newSalarySum");
            return (Criteria) this;
        }

        public Criteria andNewSalarySumGreaterThanOrEqualTo(Double value) {
            addCriterion("new_salary_sum >=", value, "newSalarySum");
            return (Criteria) this;
        }

        public Criteria andNewSalarySumLessThan(Double value) {
            addCriterion("new_salary_sum <", value, "newSalarySum");
            return (Criteria) this;
        }

        public Criteria andNewSalarySumLessThanOrEqualTo(Double value) {
            addCriterion("new_salary_sum <=", value, "newSalarySum");
            return (Criteria) this;
        }

        public Criteria andNewSalarySumIn(List<Double> values) {
            addCriterion("new_salary_sum in", values, "newSalarySum");
            return (Criteria) this;
        }

        public Criteria andNewSalarySumNotIn(List<Double> values) {
            addCriterion("new_salary_sum not in", values, "newSalarySum");
            return (Criteria) this;
        }

        public Criteria andNewSalarySumBetween(Double value1, Double value2) {
            addCriterion("new_salary_sum between", value1, value2, "newSalarySum");
            return (Criteria) this;
        }

        public Criteria andNewSalarySumNotBetween(Double value1, Double value2) {
            addCriterion("new_salary_sum not between", value1, value2, "newSalarySum");
            return (Criteria) this;
        }

        public Criteria andChangeReasonIsNull() {
            addCriterion("change_reason is null");
            return (Criteria) this;
        }

        public Criteria andChangeReasonIsNotNull() {
            addCriterion("change_reason is not null");
            return (Criteria) this;
        }

        public Criteria andChangeReasonEqualTo(String value) {
            addCriterion("change_reason =", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonNotEqualTo(String value) {
            addCriterion("change_reason <>", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonGreaterThan(String value) {
            addCriterion("change_reason >", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonGreaterThanOrEqualTo(String value) {
            addCriterion("change_reason >=", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonLessThan(String value) {
            addCriterion("change_reason <", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonLessThanOrEqualTo(String value) {
            addCriterion("change_reason <=", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonLike(String value) {
            addCriterion("change_reason like", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonNotLike(String value) {
            addCriterion("change_reason not like", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonIn(List<String> values) {
            addCriterion("change_reason in", values, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonNotIn(List<String> values) {
            addCriterion("change_reason not in", values, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonBetween(String value1, String value2) {
            addCriterion("change_reason between", value1, value2, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonNotBetween(String value1, String value2) {
            addCriterion("change_reason not between", value1, value2, "changeReason");
            return (Criteria) this;
        }

        public Criteria andCheckReasonIsNull() {
            addCriterion("check_reason is null");
            return (Criteria) this;
        }

        public Criteria andCheckReasonIsNotNull() {
            addCriterion("check_reason is not null");
            return (Criteria) this;
        }

        public Criteria andCheckReasonEqualTo(String value) {
            addCriterion("check_reason =", value, "checkReason");
            return (Criteria) this;
        }

        public Criteria andCheckReasonNotEqualTo(String value) {
            addCriterion("check_reason <>", value, "checkReason");
            return (Criteria) this;
        }

        public Criteria andCheckReasonGreaterThan(String value) {
            addCriterion("check_reason >", value, "checkReason");
            return (Criteria) this;
        }

        public Criteria andCheckReasonGreaterThanOrEqualTo(String value) {
            addCriterion("check_reason >=", value, "checkReason");
            return (Criteria) this;
        }

        public Criteria andCheckReasonLessThan(String value) {
            addCriterion("check_reason <", value, "checkReason");
            return (Criteria) this;
        }

        public Criteria andCheckReasonLessThanOrEqualTo(String value) {
            addCriterion("check_reason <=", value, "checkReason");
            return (Criteria) this;
        }

        public Criteria andCheckReasonLike(String value) {
            addCriterion("check_reason like", value, "checkReason");
            return (Criteria) this;
        }

        public Criteria andCheckReasonNotLike(String value) {
            addCriterion("check_reason not like", value, "checkReason");
            return (Criteria) this;
        }

        public Criteria andCheckReasonIn(List<String> values) {
            addCriterion("check_reason in", values, "checkReason");
            return (Criteria) this;
        }

        public Criteria andCheckReasonNotIn(List<String> values) {
            addCriterion("check_reason not in", values, "checkReason");
            return (Criteria) this;
        }

        public Criteria andCheckReasonBetween(String value1, String value2) {
            addCriterion("check_reason between", value1, value2, "checkReason");
            return (Criteria) this;
        }

        public Criteria andCheckReasonNotBetween(String value1, String value2) {
            addCriterion("check_reason not between", value1, value2, "checkReason");
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
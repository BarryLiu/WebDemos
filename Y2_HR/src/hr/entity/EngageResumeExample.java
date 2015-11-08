package hr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EngageResumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public EngageResumeExample() {
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

        public Criteria andEngageTypeIsNull() {
            addCriterion("engage_type is null");
            return (Criteria) this;
        }

        public Criteria andEngageTypeIsNotNull() {
            addCriterion("engage_type is not null");
            return (Criteria) this;
        }

        public Criteria andEngageTypeEqualTo(String value) {
            addCriterion("engage_type =", value, "engageType");
            return (Criteria) this;
        }

        public Criteria andEngageTypeNotEqualTo(String value) {
            addCriterion("engage_type <>", value, "engageType");
            return (Criteria) this;
        }

        public Criteria andEngageTypeGreaterThan(String value) {
            addCriterion("engage_type >", value, "engageType");
            return (Criteria) this;
        }

        public Criteria andEngageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("engage_type >=", value, "engageType");
            return (Criteria) this;
        }

        public Criteria andEngageTypeLessThan(String value) {
            addCriterion("engage_type <", value, "engageType");
            return (Criteria) this;
        }

        public Criteria andEngageTypeLessThanOrEqualTo(String value) {
            addCriterion("engage_type <=", value, "engageType");
            return (Criteria) this;
        }

        public Criteria andEngageTypeLike(String value) {
            addCriterion("engage_type like", value, "engageType");
            return (Criteria) this;
        }

        public Criteria andEngageTypeNotLike(String value) {
            addCriterion("engage_type not like", value, "engageType");
            return (Criteria) this;
        }

        public Criteria andEngageTypeIn(List<String> values) {
            addCriterion("engage_type in", values, "engageType");
            return (Criteria) this;
        }

        public Criteria andEngageTypeNotIn(List<String> values) {
            addCriterion("engage_type not in", values, "engageType");
            return (Criteria) this;
        }

        public Criteria andEngageTypeBetween(String value1, String value2) {
            addCriterion("engage_type between", value1, value2, "engageType");
            return (Criteria) this;
        }

        public Criteria andEngageTypeNotBetween(String value1, String value2) {
            addCriterion("engage_type not between", value1, value2, "engageType");
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

        public Criteria andHumanMajorNameIsNull() {
            addCriterion("human_major_name is null");
            return (Criteria) this;
        }

        public Criteria andHumanMajorNameIsNotNull() {
            addCriterion("human_major_name is not null");
            return (Criteria) this;
        }

        public Criteria andHumanMajorNameEqualTo(String value) {
            addCriterion("human_major_name =", value, "humanMajorName");
            return (Criteria) this;
        }

        public Criteria andHumanMajorNameNotEqualTo(String value) {
            addCriterion("human_major_name <>", value, "humanMajorName");
            return (Criteria) this;
        }

        public Criteria andHumanMajorNameGreaterThan(String value) {
            addCriterion("human_major_name >", value, "humanMajorName");
            return (Criteria) this;
        }

        public Criteria andHumanMajorNameGreaterThanOrEqualTo(String value) {
            addCriterion("human_major_name >=", value, "humanMajorName");
            return (Criteria) this;
        }

        public Criteria andHumanMajorNameLessThan(String value) {
            addCriterion("human_major_name <", value, "humanMajorName");
            return (Criteria) this;
        }

        public Criteria andHumanMajorNameLessThanOrEqualTo(String value) {
            addCriterion("human_major_name <=", value, "humanMajorName");
            return (Criteria) this;
        }

        public Criteria andHumanMajorNameLike(String value) {
            addCriterion("human_major_name like", value, "humanMajorName");
            return (Criteria) this;
        }

        public Criteria andHumanMajorNameNotLike(String value) {
            addCriterion("human_major_name not like", value, "humanMajorName");
            return (Criteria) this;
        }

        public Criteria andHumanMajorNameIn(List<String> values) {
            addCriterion("human_major_name in", values, "humanMajorName");
            return (Criteria) this;
        }

        public Criteria andHumanMajorNameNotIn(List<String> values) {
            addCriterion("human_major_name not in", values, "humanMajorName");
            return (Criteria) this;
        }

        public Criteria andHumanMajorNameBetween(String value1, String value2) {
            addCriterion("human_major_name between", value1, value2, "humanMajorName");
            return (Criteria) this;
        }

        public Criteria andHumanMajorNameNotBetween(String value1, String value2) {
            addCriterion("human_major_name not between", value1, value2, "humanMajorName");
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

        public Criteria andHumanHomephoneIsNull() {
            addCriterion("human_homephone is null");
            return (Criteria) this;
        }

        public Criteria andHumanHomephoneIsNotNull() {
            addCriterion("human_homephone is not null");
            return (Criteria) this;
        }

        public Criteria andHumanHomephoneEqualTo(String value) {
            addCriterion("human_homephone =", value, "humanHomephone");
            return (Criteria) this;
        }

        public Criteria andHumanHomephoneNotEqualTo(String value) {
            addCriterion("human_homephone <>", value, "humanHomephone");
            return (Criteria) this;
        }

        public Criteria andHumanHomephoneGreaterThan(String value) {
            addCriterion("human_homephone >", value, "humanHomephone");
            return (Criteria) this;
        }

        public Criteria andHumanHomephoneGreaterThanOrEqualTo(String value) {
            addCriterion("human_homephone >=", value, "humanHomephone");
            return (Criteria) this;
        }

        public Criteria andHumanHomephoneLessThan(String value) {
            addCriterion("human_homephone <", value, "humanHomephone");
            return (Criteria) this;
        }

        public Criteria andHumanHomephoneLessThanOrEqualTo(String value) {
            addCriterion("human_homephone <=", value, "humanHomephone");
            return (Criteria) this;
        }

        public Criteria andHumanHomephoneLike(String value) {
            addCriterion("human_homephone like", value, "humanHomephone");
            return (Criteria) this;
        }

        public Criteria andHumanHomephoneNotLike(String value) {
            addCriterion("human_homephone not like", value, "humanHomephone");
            return (Criteria) this;
        }

        public Criteria andHumanHomephoneIn(List<String> values) {
            addCriterion("human_homephone in", values, "humanHomephone");
            return (Criteria) this;
        }

        public Criteria andHumanHomephoneNotIn(List<String> values) {
            addCriterion("human_homephone not in", values, "humanHomephone");
            return (Criteria) this;
        }

        public Criteria andHumanHomephoneBetween(String value1, String value2) {
            addCriterion("human_homephone between", value1, value2, "humanHomephone");
            return (Criteria) this;
        }

        public Criteria andHumanHomephoneNotBetween(String value1, String value2) {
            addCriterion("human_homephone not between", value1, value2, "humanHomephone");
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

        public Criteria andHumanSpecilityIsNull() {
            addCriterion("human_specility is null");
            return (Criteria) this;
        }

        public Criteria andHumanSpecilityIsNotNull() {
            addCriterion("human_specility is not null");
            return (Criteria) this;
        }

        public Criteria andHumanSpecilityEqualTo(String value) {
            addCriterion("human_specility =", value, "humanSpecility");
            return (Criteria) this;
        }

        public Criteria andHumanSpecilityNotEqualTo(String value) {
            addCriterion("human_specility <>", value, "humanSpecility");
            return (Criteria) this;
        }

        public Criteria andHumanSpecilityGreaterThan(String value) {
            addCriterion("human_specility >", value, "humanSpecility");
            return (Criteria) this;
        }

        public Criteria andHumanSpecilityGreaterThanOrEqualTo(String value) {
            addCriterion("human_specility >=", value, "humanSpecility");
            return (Criteria) this;
        }

        public Criteria andHumanSpecilityLessThan(String value) {
            addCriterion("human_specility <", value, "humanSpecility");
            return (Criteria) this;
        }

        public Criteria andHumanSpecilityLessThanOrEqualTo(String value) {
            addCriterion("human_specility <=", value, "humanSpecility");
            return (Criteria) this;
        }

        public Criteria andHumanSpecilityLike(String value) {
            addCriterion("human_specility like", value, "humanSpecility");
            return (Criteria) this;
        }

        public Criteria andHumanSpecilityNotLike(String value) {
            addCriterion("human_specility not like", value, "humanSpecility");
            return (Criteria) this;
        }

        public Criteria andHumanSpecilityIn(List<String> values) {
            addCriterion("human_specility in", values, "humanSpecility");
            return (Criteria) this;
        }

        public Criteria andHumanSpecilityNotIn(List<String> values) {
            addCriterion("human_specility not in", values, "humanSpecility");
            return (Criteria) this;
        }

        public Criteria andHumanSpecilityBetween(String value1, String value2) {
            addCriterion("human_specility between", value1, value2, "humanSpecility");
            return (Criteria) this;
        }

        public Criteria andHumanSpecilityNotBetween(String value1, String value2) {
            addCriterion("human_specility not between", value1, value2, "humanSpecility");
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

        public Criteria andHumanBirthdayEqualTo(String value) {
            addCriterion("human_birthday =", value, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayNotEqualTo(String value) {
            addCriterion("human_birthday <>", value, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayGreaterThan(String value) {
            addCriterion("human_birthday >", value, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("human_birthday >=", value, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayLessThan(String value) {
            addCriterion("human_birthday <", value, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayLessThanOrEqualTo(String value) {
            addCriterion("human_birthday <=", value, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayLike(String value) {
            addCriterion("human_birthday like", value, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayNotLike(String value) {
            addCriterion("human_birthday not like", value, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayIn(List<String> values) {
            addCriterion("human_birthday in", values, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayNotIn(List<String> values) {
            addCriterion("human_birthday not in", values, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayBetween(String value1, String value2) {
            addCriterion("human_birthday between", value1, value2, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayNotBetween(String value1, String value2) {
            addCriterion("human_birthday not between", value1, value2, "humanBirthday");
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

        public Criteria andHumanCollegeIsNull() {
            addCriterion("human_college is null");
            return (Criteria) this;
        }

        public Criteria andHumanCollegeIsNotNull() {
            addCriterion("human_college is not null");
            return (Criteria) this;
        }

        public Criteria andHumanCollegeEqualTo(String value) {
            addCriterion("human_college =", value, "humanCollege");
            return (Criteria) this;
        }

        public Criteria andHumanCollegeNotEqualTo(String value) {
            addCriterion("human_college <>", value, "humanCollege");
            return (Criteria) this;
        }

        public Criteria andHumanCollegeGreaterThan(String value) {
            addCriterion("human_college >", value, "humanCollege");
            return (Criteria) this;
        }

        public Criteria andHumanCollegeGreaterThanOrEqualTo(String value) {
            addCriterion("human_college >=", value, "humanCollege");
            return (Criteria) this;
        }

        public Criteria andHumanCollegeLessThan(String value) {
            addCriterion("human_college <", value, "humanCollege");
            return (Criteria) this;
        }

        public Criteria andHumanCollegeLessThanOrEqualTo(String value) {
            addCriterion("human_college <=", value, "humanCollege");
            return (Criteria) this;
        }

        public Criteria andHumanCollegeLike(String value) {
            addCriterion("human_college like", value, "humanCollege");
            return (Criteria) this;
        }

        public Criteria andHumanCollegeNotLike(String value) {
            addCriterion("human_college not like", value, "humanCollege");
            return (Criteria) this;
        }

        public Criteria andHumanCollegeIn(List<String> values) {
            addCriterion("human_college in", values, "humanCollege");
            return (Criteria) this;
        }

        public Criteria andHumanCollegeNotIn(List<String> values) {
            addCriterion("human_college not in", values, "humanCollege");
            return (Criteria) this;
        }

        public Criteria andHumanCollegeBetween(String value1, String value2) {
            addCriterion("human_college between", value1, value2, "humanCollege");
            return (Criteria) this;
        }

        public Criteria andHumanCollegeNotBetween(String value1, String value2) {
            addCriterion("human_college not between", value1, value2, "humanCollege");
            return (Criteria) this;
        }

        public Criteria andHumanIdcardIsNull() {
            addCriterion("human_idcard is null");
            return (Criteria) this;
        }

        public Criteria andHumanIdcardIsNotNull() {
            addCriterion("human_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andHumanIdcardEqualTo(String value) {
            addCriterion("human_idcard =", value, "humanIdcard");
            return (Criteria) this;
        }

        public Criteria andHumanIdcardNotEqualTo(String value) {
            addCriterion("human_idcard <>", value, "humanIdcard");
            return (Criteria) this;
        }

        public Criteria andHumanIdcardGreaterThan(String value) {
            addCriterion("human_idcard >", value, "humanIdcard");
            return (Criteria) this;
        }

        public Criteria andHumanIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("human_idcard >=", value, "humanIdcard");
            return (Criteria) this;
        }

        public Criteria andHumanIdcardLessThan(String value) {
            addCriterion("human_idcard <", value, "humanIdcard");
            return (Criteria) this;
        }

        public Criteria andHumanIdcardLessThanOrEqualTo(String value) {
            addCriterion("human_idcard <=", value, "humanIdcard");
            return (Criteria) this;
        }

        public Criteria andHumanIdcardLike(String value) {
            addCriterion("human_idcard like", value, "humanIdcard");
            return (Criteria) this;
        }

        public Criteria andHumanIdcardNotLike(String value) {
            addCriterion("human_idcard not like", value, "humanIdcard");
            return (Criteria) this;
        }

        public Criteria andHumanIdcardIn(List<String> values) {
            addCriterion("human_idcard in", values, "humanIdcard");
            return (Criteria) this;
        }

        public Criteria andHumanIdcardNotIn(List<String> values) {
            addCriterion("human_idcard not in", values, "humanIdcard");
            return (Criteria) this;
        }

        public Criteria andHumanIdcardBetween(String value1, String value2) {
            addCriterion("human_idcard between", value1, value2, "humanIdcard");
            return (Criteria) this;
        }

        public Criteria andHumanIdcardNotBetween(String value1, String value2) {
            addCriterion("human_idcard not between", value1, value2, "humanIdcard");
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

        public Criteria andDemandSalaryStandardIsNull() {
            addCriterion("demand_salary_standard is null");
            return (Criteria) this;
        }

        public Criteria andDemandSalaryStandardIsNotNull() {
            addCriterion("demand_salary_standard is not null");
            return (Criteria) this;
        }

        public Criteria andDemandSalaryStandardEqualTo(String value) {
            addCriterion("demand_salary_standard =", value, "demandSalaryStandard");
            return (Criteria) this;
        }

        public Criteria andDemandSalaryStandardNotEqualTo(String value) {
            addCriterion("demand_salary_standard <>", value, "demandSalaryStandard");
            return (Criteria) this;
        }

        public Criteria andDemandSalaryStandardGreaterThan(String value) {
            addCriterion("demand_salary_standard >", value, "demandSalaryStandard");
            return (Criteria) this;
        }

        public Criteria andDemandSalaryStandardGreaterThanOrEqualTo(String value) {
            addCriterion("demand_salary_standard >=", value, "demandSalaryStandard");
            return (Criteria) this;
        }

        public Criteria andDemandSalaryStandardLessThan(String value) {
            addCriterion("demand_salary_standard <", value, "demandSalaryStandard");
            return (Criteria) this;
        }

        public Criteria andDemandSalaryStandardLessThanOrEqualTo(String value) {
            addCriterion("demand_salary_standard <=", value, "demandSalaryStandard");
            return (Criteria) this;
        }

        public Criteria andDemandSalaryStandardLike(String value) {
            addCriterion("demand_salary_standard like", value, "demandSalaryStandard");
            return (Criteria) this;
        }

        public Criteria andDemandSalaryStandardNotLike(String value) {
            addCriterion("demand_salary_standard not like", value, "demandSalaryStandard");
            return (Criteria) this;
        }

        public Criteria andDemandSalaryStandardIn(List<String> values) {
            addCriterion("demand_salary_standard in", values, "demandSalaryStandard");
            return (Criteria) this;
        }

        public Criteria andDemandSalaryStandardNotIn(List<String> values) {
            addCriterion("demand_salary_standard not in", values, "demandSalaryStandard");
            return (Criteria) this;
        }

        public Criteria andDemandSalaryStandardBetween(String value1, String value2) {
            addCriterion("demand_salary_standard between", value1, value2, "demandSalaryStandard");
            return (Criteria) this;
        }

        public Criteria andDemandSalaryStandardNotBetween(String value1, String value2) {
            addCriterion("demand_salary_standard not between", value1, value2, "demandSalaryStandard");
            return (Criteria) this;
        }

        public Criteria andHumanHistoryRecordsIsNull() {
            addCriterion("human_history_records is null");
            return (Criteria) this;
        }

        public Criteria andHumanHistoryRecordsIsNotNull() {
            addCriterion("human_history_records is not null");
            return (Criteria) this;
        }

        public Criteria andHumanHistoryRecordsEqualTo(String value) {
            addCriterion("human_history_records =", value, "humanHistoryRecords");
            return (Criteria) this;
        }

        public Criteria andHumanHistoryRecordsNotEqualTo(String value) {
            addCriterion("human_history_records <>", value, "humanHistoryRecords");
            return (Criteria) this;
        }

        public Criteria andHumanHistoryRecordsGreaterThan(String value) {
            addCriterion("human_history_records >", value, "humanHistoryRecords");
            return (Criteria) this;
        }

        public Criteria andHumanHistoryRecordsGreaterThanOrEqualTo(String value) {
            addCriterion("human_history_records >=", value, "humanHistoryRecords");
            return (Criteria) this;
        }

        public Criteria andHumanHistoryRecordsLessThan(String value) {
            addCriterion("human_history_records <", value, "humanHistoryRecords");
            return (Criteria) this;
        }

        public Criteria andHumanHistoryRecordsLessThanOrEqualTo(String value) {
            addCriterion("human_history_records <=", value, "humanHistoryRecords");
            return (Criteria) this;
        }

        public Criteria andHumanHistoryRecordsLike(String value) {
            addCriterion("human_history_records like", value, "humanHistoryRecords");
            return (Criteria) this;
        }

        public Criteria andHumanHistoryRecordsNotLike(String value) {
            addCriterion("human_history_records not like", value, "humanHistoryRecords");
            return (Criteria) this;
        }

        public Criteria andHumanHistoryRecordsIn(List<String> values) {
            addCriterion("human_history_records in", values, "humanHistoryRecords");
            return (Criteria) this;
        }

        public Criteria andHumanHistoryRecordsNotIn(List<String> values) {
            addCriterion("human_history_records not in", values, "humanHistoryRecords");
            return (Criteria) this;
        }

        public Criteria andHumanHistoryRecordsBetween(String value1, String value2) {
            addCriterion("human_history_records between", value1, value2, "humanHistoryRecords");
            return (Criteria) this;
        }

        public Criteria andHumanHistoryRecordsNotBetween(String value1, String value2) {
            addCriterion("human_history_records not between", value1, value2, "humanHistoryRecords");
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

        public Criteria andRecomandationIsNull() {
            addCriterion("recomandation is null");
            return (Criteria) this;
        }

        public Criteria andRecomandationIsNotNull() {
            addCriterion("recomandation is not null");
            return (Criteria) this;
        }

        public Criteria andRecomandationEqualTo(String value) {
            addCriterion("recomandation =", value, "recomandation");
            return (Criteria) this;
        }

        public Criteria andRecomandationNotEqualTo(String value) {
            addCriterion("recomandation <>", value, "recomandation");
            return (Criteria) this;
        }

        public Criteria andRecomandationGreaterThan(String value) {
            addCriterion("recomandation >", value, "recomandation");
            return (Criteria) this;
        }

        public Criteria andRecomandationGreaterThanOrEqualTo(String value) {
            addCriterion("recomandation >=", value, "recomandation");
            return (Criteria) this;
        }

        public Criteria andRecomandationLessThan(String value) {
            addCriterion("recomandation <", value, "recomandation");
            return (Criteria) this;
        }

        public Criteria andRecomandationLessThanOrEqualTo(String value) {
            addCriterion("recomandation <=", value, "recomandation");
            return (Criteria) this;
        }

        public Criteria andRecomandationLike(String value) {
            addCriterion("recomandation like", value, "recomandation");
            return (Criteria) this;
        }

        public Criteria andRecomandationNotLike(String value) {
            addCriterion("recomandation not like", value, "recomandation");
            return (Criteria) this;
        }

        public Criteria andRecomandationIn(List<String> values) {
            addCriterion("recomandation in", values, "recomandation");
            return (Criteria) this;
        }

        public Criteria andRecomandationNotIn(List<String> values) {
            addCriterion("recomandation not in", values, "recomandation");
            return (Criteria) this;
        }

        public Criteria andRecomandationBetween(String value1, String value2) {
            addCriterion("recomandation between", value1, value2, "recomandation");
            return (Criteria) this;
        }

        public Criteria andRecomandationNotBetween(String value1, String value2) {
            addCriterion("recomandation not between", value1, value2, "recomandation");
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

        public Criteria andInterviewStatusIsNull() {
            addCriterion("interview_status is null");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusIsNotNull() {
            addCriterion("interview_status is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusEqualTo(Integer value) {
            addCriterion("interview_status =", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusNotEqualTo(Integer value) {
            addCriterion("interview_status <>", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusGreaterThan(Integer value) {
            addCriterion("interview_status >", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("interview_status >=", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusLessThan(Integer value) {
            addCriterion("interview_status <", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusLessThanOrEqualTo(Integer value) {
            addCriterion("interview_status <=", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusIn(List<Integer> values) {
            addCriterion("interview_status in", values, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusNotIn(List<Integer> values) {
            addCriterion("interview_status not in", values, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusBetween(Integer value1, Integer value2) {
            addCriterion("interview_status between", value1, value2, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("interview_status not between", value1, value2, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andTotalPointsIsNull() {
            addCriterion("total_points is null");
            return (Criteria) this;
        }

        public Criteria andTotalPointsIsNotNull() {
            addCriterion("total_points is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPointsEqualTo(Double value) {
            addCriterion("total_points =", value, "totalPoints");
            return (Criteria) this;
        }

        public Criteria andTotalPointsNotEqualTo(Double value) {
            addCriterion("total_points <>", value, "totalPoints");
            return (Criteria) this;
        }

        public Criteria andTotalPointsGreaterThan(Double value) {
            addCriterion("total_points >", value, "totalPoints");
            return (Criteria) this;
        }

        public Criteria andTotalPointsGreaterThanOrEqualTo(Double value) {
            addCriterion("total_points >=", value, "totalPoints");
            return (Criteria) this;
        }

        public Criteria andTotalPointsLessThan(Double value) {
            addCriterion("total_points <", value, "totalPoints");
            return (Criteria) this;
        }

        public Criteria andTotalPointsLessThanOrEqualTo(Double value) {
            addCriterion("total_points <=", value, "totalPoints");
            return (Criteria) this;
        }

        public Criteria andTotalPointsIn(List<Double> values) {
            addCriterion("total_points in", values, "totalPoints");
            return (Criteria) this;
        }

        public Criteria andTotalPointsNotIn(List<Double> values) {
            addCriterion("total_points not in", values, "totalPoints");
            return (Criteria) this;
        }

        public Criteria andTotalPointsBetween(Double value1, Double value2) {
            addCriterion("total_points between", value1, value2, "totalPoints");
            return (Criteria) this;
        }

        public Criteria andTotalPointsNotBetween(Double value1, Double value2) {
            addCriterion("total_points not between", value1, value2, "totalPoints");
            return (Criteria) this;
        }

        public Criteria andTestAmountIsNull() {
            addCriterion("test_amount is null");
            return (Criteria) this;
        }

        public Criteria andTestAmountIsNotNull() {
            addCriterion("test_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTestAmountEqualTo(Integer value) {
            addCriterion("test_amount =", value, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestAmountNotEqualTo(Integer value) {
            addCriterion("test_amount <>", value, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestAmountGreaterThan(Integer value) {
            addCriterion("test_amount >", value, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_amount >=", value, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestAmountLessThan(Integer value) {
            addCriterion("test_amount <", value, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestAmountLessThanOrEqualTo(Integer value) {
            addCriterion("test_amount <=", value, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestAmountIn(List<Integer> values) {
            addCriterion("test_amount in", values, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestAmountNotIn(List<Integer> values) {
            addCriterion("test_amount not in", values, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestAmountBetween(Integer value1, Integer value2) {
            addCriterion("test_amount between", value1, value2, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("test_amount not between", value1, value2, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestCheckerIsNull() {
            addCriterion("test_checker is null");
            return (Criteria) this;
        }

        public Criteria andTestCheckerIsNotNull() {
            addCriterion("test_checker is not null");
            return (Criteria) this;
        }

        public Criteria andTestCheckerEqualTo(String value) {
            addCriterion("test_checker =", value, "testChecker");
            return (Criteria) this;
        }

        public Criteria andTestCheckerNotEqualTo(String value) {
            addCriterion("test_checker <>", value, "testChecker");
            return (Criteria) this;
        }

        public Criteria andTestCheckerGreaterThan(String value) {
            addCriterion("test_checker >", value, "testChecker");
            return (Criteria) this;
        }

        public Criteria andTestCheckerGreaterThanOrEqualTo(String value) {
            addCriterion("test_checker >=", value, "testChecker");
            return (Criteria) this;
        }

        public Criteria andTestCheckerLessThan(String value) {
            addCriterion("test_checker <", value, "testChecker");
            return (Criteria) this;
        }

        public Criteria andTestCheckerLessThanOrEqualTo(String value) {
            addCriterion("test_checker <=", value, "testChecker");
            return (Criteria) this;
        }

        public Criteria andTestCheckerLike(String value) {
            addCriterion("test_checker like", value, "testChecker");
            return (Criteria) this;
        }

        public Criteria andTestCheckerNotLike(String value) {
            addCriterion("test_checker not like", value, "testChecker");
            return (Criteria) this;
        }

        public Criteria andTestCheckerIn(List<String> values) {
            addCriterion("test_checker in", values, "testChecker");
            return (Criteria) this;
        }

        public Criteria andTestCheckerNotIn(List<String> values) {
            addCriterion("test_checker not in", values, "testChecker");
            return (Criteria) this;
        }

        public Criteria andTestCheckerBetween(String value1, String value2) {
            addCriterion("test_checker between", value1, value2, "testChecker");
            return (Criteria) this;
        }

        public Criteria andTestCheckerNotBetween(String value1, String value2) {
            addCriterion("test_checker not between", value1, value2, "testChecker");
            return (Criteria) this;
        }

        public Criteria andTestCheckTimeIsNull() {
            addCriterion("test_check_time is null");
            return (Criteria) this;
        }

        public Criteria andTestCheckTimeIsNotNull() {
            addCriterion("test_check_time is not null");
            return (Criteria) this;
        }

        public Criteria andTestCheckTimeEqualTo(Date value) {
            addCriterionForJDBCDate("test_check_time =", value, "testCheckTime");
            return (Criteria) this;
        }

        public Criteria andTestCheckTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("test_check_time <>", value, "testCheckTime");
            return (Criteria) this;
        }

        public Criteria andTestCheckTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("test_check_time >", value, "testCheckTime");
            return (Criteria) this;
        }

        public Criteria andTestCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("test_check_time >=", value, "testCheckTime");
            return (Criteria) this;
        }

        public Criteria andTestCheckTimeLessThan(Date value) {
            addCriterionForJDBCDate("test_check_time <", value, "testCheckTime");
            return (Criteria) this;
        }

        public Criteria andTestCheckTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("test_check_time <=", value, "testCheckTime");
            return (Criteria) this;
        }

        public Criteria andTestCheckTimeIn(List<Date> values) {
            addCriterionForJDBCDate("test_check_time in", values, "testCheckTime");
            return (Criteria) this;
        }

        public Criteria andTestCheckTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("test_check_time not in", values, "testCheckTime");
            return (Criteria) this;
        }

        public Criteria andTestCheckTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("test_check_time between", value1, value2, "testCheckTime");
            return (Criteria) this;
        }

        public Criteria andTestCheckTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("test_check_time not between", value1, value2, "testCheckTime");
            return (Criteria) this;
        }

        public Criteria andPassRegisterIsNull() {
            addCriterion("pass_register is null");
            return (Criteria) this;
        }

        public Criteria andPassRegisterIsNotNull() {
            addCriterion("pass_register is not null");
            return (Criteria) this;
        }

        public Criteria andPassRegisterEqualTo(String value) {
            addCriterion("pass_register =", value, "passRegister");
            return (Criteria) this;
        }

        public Criteria andPassRegisterNotEqualTo(String value) {
            addCriterion("pass_register <>", value, "passRegister");
            return (Criteria) this;
        }

        public Criteria andPassRegisterGreaterThan(String value) {
            addCriterion("pass_register >", value, "passRegister");
            return (Criteria) this;
        }

        public Criteria andPassRegisterGreaterThanOrEqualTo(String value) {
            addCriterion("pass_register >=", value, "passRegister");
            return (Criteria) this;
        }

        public Criteria andPassRegisterLessThan(String value) {
            addCriterion("pass_register <", value, "passRegister");
            return (Criteria) this;
        }

        public Criteria andPassRegisterLessThanOrEqualTo(String value) {
            addCriterion("pass_register <=", value, "passRegister");
            return (Criteria) this;
        }

        public Criteria andPassRegisterLike(String value) {
            addCriterion("pass_register like", value, "passRegister");
            return (Criteria) this;
        }

        public Criteria andPassRegisterNotLike(String value) {
            addCriterion("pass_register not like", value, "passRegister");
            return (Criteria) this;
        }

        public Criteria andPassRegisterIn(List<String> values) {
            addCriterion("pass_register in", values, "passRegister");
            return (Criteria) this;
        }

        public Criteria andPassRegisterNotIn(List<String> values) {
            addCriterion("pass_register not in", values, "passRegister");
            return (Criteria) this;
        }

        public Criteria andPassRegisterBetween(String value1, String value2) {
            addCriterion("pass_register between", value1, value2, "passRegister");
            return (Criteria) this;
        }

        public Criteria andPassRegisterNotBetween(String value1, String value2) {
            addCriterion("pass_register not between", value1, value2, "passRegister");
            return (Criteria) this;
        }

        public Criteria andPassRegistTimeIsNull() {
            addCriterion("pass_regist_time is null");
            return (Criteria) this;
        }

        public Criteria andPassRegistTimeIsNotNull() {
            addCriterion("pass_regist_time is not null");
            return (Criteria) this;
        }

        public Criteria andPassRegistTimeEqualTo(Date value) {
            addCriterionForJDBCDate("pass_regist_time =", value, "passRegistTime");
            return (Criteria) this;
        }

        public Criteria andPassRegistTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("pass_regist_time <>", value, "passRegistTime");
            return (Criteria) this;
        }

        public Criteria andPassRegistTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("pass_regist_time >", value, "passRegistTime");
            return (Criteria) this;
        }

        public Criteria andPassRegistTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pass_regist_time >=", value, "passRegistTime");
            return (Criteria) this;
        }

        public Criteria andPassRegistTimeLessThan(Date value) {
            addCriterionForJDBCDate("pass_regist_time <", value, "passRegistTime");
            return (Criteria) this;
        }

        public Criteria andPassRegistTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pass_regist_time <=", value, "passRegistTime");
            return (Criteria) this;
        }

        public Criteria andPassRegistTimeIn(List<Date> values) {
            addCriterionForJDBCDate("pass_regist_time in", values, "passRegistTime");
            return (Criteria) this;
        }

        public Criteria andPassRegistTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("pass_regist_time not in", values, "passRegistTime");
            return (Criteria) this;
        }

        public Criteria andPassRegistTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pass_regist_time between", value1, value2, "passRegistTime");
            return (Criteria) this;
        }

        public Criteria andPassRegistTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pass_regist_time not between", value1, value2, "passRegistTime");
            return (Criteria) this;
        }

        public Criteria andPassCheckerIsNull() {
            addCriterion("pass_checker is null");
            return (Criteria) this;
        }

        public Criteria andPassCheckerIsNotNull() {
            addCriterion("pass_checker is not null");
            return (Criteria) this;
        }

        public Criteria andPassCheckerEqualTo(String value) {
            addCriterion("pass_checker =", value, "passChecker");
            return (Criteria) this;
        }

        public Criteria andPassCheckerNotEqualTo(String value) {
            addCriterion("pass_checker <>", value, "passChecker");
            return (Criteria) this;
        }

        public Criteria andPassCheckerGreaterThan(String value) {
            addCriterion("pass_checker >", value, "passChecker");
            return (Criteria) this;
        }

        public Criteria andPassCheckerGreaterThanOrEqualTo(String value) {
            addCriterion("pass_checker >=", value, "passChecker");
            return (Criteria) this;
        }

        public Criteria andPassCheckerLessThan(String value) {
            addCriterion("pass_checker <", value, "passChecker");
            return (Criteria) this;
        }

        public Criteria andPassCheckerLessThanOrEqualTo(String value) {
            addCriterion("pass_checker <=", value, "passChecker");
            return (Criteria) this;
        }

        public Criteria andPassCheckerLike(String value) {
            addCriterion("pass_checker like", value, "passChecker");
            return (Criteria) this;
        }

        public Criteria andPassCheckerNotLike(String value) {
            addCriterion("pass_checker not like", value, "passChecker");
            return (Criteria) this;
        }

        public Criteria andPassCheckerIn(List<String> values) {
            addCriterion("pass_checker in", values, "passChecker");
            return (Criteria) this;
        }

        public Criteria andPassCheckerNotIn(List<String> values) {
            addCriterion("pass_checker not in", values, "passChecker");
            return (Criteria) this;
        }

        public Criteria andPassCheckerBetween(String value1, String value2) {
            addCriterion("pass_checker between", value1, value2, "passChecker");
            return (Criteria) this;
        }

        public Criteria andPassCheckerNotBetween(String value1, String value2) {
            addCriterion("pass_checker not between", value1, value2, "passChecker");
            return (Criteria) this;
        }

        public Criteria andPassCheckTimeIsNull() {
            addCriterion("pass_check_time is null");
            return (Criteria) this;
        }

        public Criteria andPassCheckTimeIsNotNull() {
            addCriterion("pass_check_time is not null");
            return (Criteria) this;
        }

        public Criteria andPassCheckTimeEqualTo(Date value) {
            addCriterionForJDBCDate("pass_check_time =", value, "passCheckTime");
            return (Criteria) this;
        }

        public Criteria andPassCheckTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("pass_check_time <>", value, "passCheckTime");
            return (Criteria) this;
        }

        public Criteria andPassCheckTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("pass_check_time >", value, "passCheckTime");
            return (Criteria) this;
        }

        public Criteria andPassCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pass_check_time >=", value, "passCheckTime");
            return (Criteria) this;
        }

        public Criteria andPassCheckTimeLessThan(Date value) {
            addCriterionForJDBCDate("pass_check_time <", value, "passCheckTime");
            return (Criteria) this;
        }

        public Criteria andPassCheckTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pass_check_time <=", value, "passCheckTime");
            return (Criteria) this;
        }

        public Criteria andPassCheckTimeIn(List<Date> values) {
            addCriterionForJDBCDate("pass_check_time in", values, "passCheckTime");
            return (Criteria) this;
        }

        public Criteria andPassCheckTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("pass_check_time not in", values, "passCheckTime");
            return (Criteria) this;
        }

        public Criteria andPassCheckTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pass_check_time between", value1, value2, "passCheckTime");
            return (Criteria) this;
        }

        public Criteria andPassCheckTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pass_check_time not between", value1, value2, "passCheckTime");
            return (Criteria) this;
        }

        public Criteria andPassCheckStatusIsNull() {
            addCriterion("pass_check_status is null");
            return (Criteria) this;
        }

        public Criteria andPassCheckStatusIsNotNull() {
            addCriterion("pass_check_status is not null");
            return (Criteria) this;
        }

        public Criteria andPassCheckStatusEqualTo(Integer value) {
            addCriterion("pass_check_status =", value, "passCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPassCheckStatusNotEqualTo(Integer value) {
            addCriterion("pass_check_status <>", value, "passCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPassCheckStatusGreaterThan(Integer value) {
            addCriterion("pass_check_status >", value, "passCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPassCheckStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pass_check_status >=", value, "passCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPassCheckStatusLessThan(Integer value) {
            addCriterion("pass_check_status <", value, "passCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPassCheckStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pass_check_status <=", value, "passCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPassCheckStatusIn(List<Integer> values) {
            addCriterion("pass_check_status in", values, "passCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPassCheckStatusNotIn(List<Integer> values) {
            addCriterion("pass_check_status not in", values, "passCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPassCheckStatusBetween(Integer value1, Integer value2) {
            addCriterion("pass_check_status between", value1, value2, "passCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPassCheckStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pass_check_status not between", value1, value2, "passCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPassCheckcommentIsNull() {
            addCriterion("pass_checkComment is null");
            return (Criteria) this;
        }

        public Criteria andPassCheckcommentIsNotNull() {
            addCriterion("pass_checkComment is not null");
            return (Criteria) this;
        }

        public Criteria andPassCheckcommentEqualTo(String value) {
            addCriterion("pass_checkComment =", value, "passCheckcomment");
            return (Criteria) this;
        }

        public Criteria andPassCheckcommentNotEqualTo(String value) {
            addCriterion("pass_checkComment <>", value, "passCheckcomment");
            return (Criteria) this;
        }

        public Criteria andPassCheckcommentGreaterThan(String value) {
            addCriterion("pass_checkComment >", value, "passCheckcomment");
            return (Criteria) this;
        }

        public Criteria andPassCheckcommentGreaterThanOrEqualTo(String value) {
            addCriterion("pass_checkComment >=", value, "passCheckcomment");
            return (Criteria) this;
        }

        public Criteria andPassCheckcommentLessThan(String value) {
            addCriterion("pass_checkComment <", value, "passCheckcomment");
            return (Criteria) this;
        }

        public Criteria andPassCheckcommentLessThanOrEqualTo(String value) {
            addCriterion("pass_checkComment <=", value, "passCheckcomment");
            return (Criteria) this;
        }

        public Criteria andPassCheckcommentLike(String value) {
            addCriterion("pass_checkComment like", value, "passCheckcomment");
            return (Criteria) this;
        }

        public Criteria andPassCheckcommentNotLike(String value) {
            addCriterion("pass_checkComment not like", value, "passCheckcomment");
            return (Criteria) this;
        }

        public Criteria andPassCheckcommentIn(List<String> values) {
            addCriterion("pass_checkComment in", values, "passCheckcomment");
            return (Criteria) this;
        }

        public Criteria andPassCheckcommentNotIn(List<String> values) {
            addCriterion("pass_checkComment not in", values, "passCheckcomment");
            return (Criteria) this;
        }

        public Criteria andPassCheckcommentBetween(String value1, String value2) {
            addCriterion("pass_checkComment between", value1, value2, "passCheckcomment");
            return (Criteria) this;
        }

        public Criteria andPassCheckcommentNotBetween(String value1, String value2) {
            addCriterion("pass_checkComment not between", value1, value2, "passCheckcomment");
            return (Criteria) this;
        }

        public Criteria andPassPasscommentIsNull() {
            addCriterion("pass_passComment is null");
            return (Criteria) this;
        }

        public Criteria andPassPasscommentIsNotNull() {
            addCriterion("pass_passComment is not null");
            return (Criteria) this;
        }

        public Criteria andPassPasscommentEqualTo(String value) {
            addCriterion("pass_passComment =", value, "passPasscomment");
            return (Criteria) this;
        }

        public Criteria andPassPasscommentNotEqualTo(String value) {
            addCriterion("pass_passComment <>", value, "passPasscomment");
            return (Criteria) this;
        }

        public Criteria andPassPasscommentGreaterThan(String value) {
            addCriterion("pass_passComment >", value, "passPasscomment");
            return (Criteria) this;
        }

        public Criteria andPassPasscommentGreaterThanOrEqualTo(String value) {
            addCriterion("pass_passComment >=", value, "passPasscomment");
            return (Criteria) this;
        }

        public Criteria andPassPasscommentLessThan(String value) {
            addCriterion("pass_passComment <", value, "passPasscomment");
            return (Criteria) this;
        }

        public Criteria andPassPasscommentLessThanOrEqualTo(String value) {
            addCriterion("pass_passComment <=", value, "passPasscomment");
            return (Criteria) this;
        }

        public Criteria andPassPasscommentLike(String value) {
            addCriterion("pass_passComment like", value, "passPasscomment");
            return (Criteria) this;
        }

        public Criteria andPassPasscommentNotLike(String value) {
            addCriterion("pass_passComment not like", value, "passPasscomment");
            return (Criteria) this;
        }

        public Criteria andPassPasscommentIn(List<String> values) {
            addCriterion("pass_passComment in", values, "passPasscomment");
            return (Criteria) this;
        }

        public Criteria andPassPasscommentNotIn(List<String> values) {
            addCriterion("pass_passComment not in", values, "passPasscomment");
            return (Criteria) this;
        }

        public Criteria andPassPasscommentBetween(String value1, String value2) {
            addCriterion("pass_passComment between", value1, value2, "passPasscomment");
            return (Criteria) this;
        }

        public Criteria andPassPasscommentNotBetween(String value1, String value2) {
            addCriterion("pass_passComment not between", value1, value2, "passPasscomment");
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
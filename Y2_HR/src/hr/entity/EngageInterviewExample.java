package hr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EngageInterviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public EngageInterviewExample() {
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

        public Criteria andInterviewAmountIsNull() {
            addCriterion("interview_amount is null");
            return (Criteria) this;
        }

        public Criteria andInterviewAmountIsNotNull() {
            addCriterion("interview_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewAmountEqualTo(Integer value) {
            addCriterion("interview_amount =", value, "interviewAmount");
            return (Criteria) this;
        }

        public Criteria andInterviewAmountNotEqualTo(Integer value) {
            addCriterion("interview_amount <>", value, "interviewAmount");
            return (Criteria) this;
        }

        public Criteria andInterviewAmountGreaterThan(Integer value) {
            addCriterion("interview_amount >", value, "interviewAmount");
            return (Criteria) this;
        }

        public Criteria andInterviewAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("interview_amount >=", value, "interviewAmount");
            return (Criteria) this;
        }

        public Criteria andInterviewAmountLessThan(Integer value) {
            addCriterion("interview_amount <", value, "interviewAmount");
            return (Criteria) this;
        }

        public Criteria andInterviewAmountLessThanOrEqualTo(Integer value) {
            addCriterion("interview_amount <=", value, "interviewAmount");
            return (Criteria) this;
        }

        public Criteria andInterviewAmountIn(List<Integer> values) {
            addCriterion("interview_amount in", values, "interviewAmount");
            return (Criteria) this;
        }

        public Criteria andInterviewAmountNotIn(List<Integer> values) {
            addCriterion("interview_amount not in", values, "interviewAmount");
            return (Criteria) this;
        }

        public Criteria andInterviewAmountBetween(Integer value1, Integer value2) {
            addCriterion("interview_amount between", value1, value2, "interviewAmount");
            return (Criteria) this;
        }

        public Criteria andInterviewAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("interview_amount not between", value1, value2, "interviewAmount");
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

        public Criteria andImageDegreeIsNull() {
            addCriterion("image_degree is null");
            return (Criteria) this;
        }

        public Criteria andImageDegreeIsNotNull() {
            addCriterion("image_degree is not null");
            return (Criteria) this;
        }

        public Criteria andImageDegreeEqualTo(String value) {
            addCriterion("image_degree =", value, "imageDegree");
            return (Criteria) this;
        }

        public Criteria andImageDegreeNotEqualTo(String value) {
            addCriterion("image_degree <>", value, "imageDegree");
            return (Criteria) this;
        }

        public Criteria andImageDegreeGreaterThan(String value) {
            addCriterion("image_degree >", value, "imageDegree");
            return (Criteria) this;
        }

        public Criteria andImageDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("image_degree >=", value, "imageDegree");
            return (Criteria) this;
        }

        public Criteria andImageDegreeLessThan(String value) {
            addCriterion("image_degree <", value, "imageDegree");
            return (Criteria) this;
        }

        public Criteria andImageDegreeLessThanOrEqualTo(String value) {
            addCriterion("image_degree <=", value, "imageDegree");
            return (Criteria) this;
        }

        public Criteria andImageDegreeLike(String value) {
            addCriterion("image_degree like", value, "imageDegree");
            return (Criteria) this;
        }

        public Criteria andImageDegreeNotLike(String value) {
            addCriterion("image_degree not like", value, "imageDegree");
            return (Criteria) this;
        }

        public Criteria andImageDegreeIn(List<String> values) {
            addCriterion("image_degree in", values, "imageDegree");
            return (Criteria) this;
        }

        public Criteria andImageDegreeNotIn(List<String> values) {
            addCriterion("image_degree not in", values, "imageDegree");
            return (Criteria) this;
        }

        public Criteria andImageDegreeBetween(String value1, String value2) {
            addCriterion("image_degree between", value1, value2, "imageDegree");
            return (Criteria) this;
        }

        public Criteria andImageDegreeNotBetween(String value1, String value2) {
            addCriterion("image_degree not between", value1, value2, "imageDegree");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageDegreeIsNull() {
            addCriterion("native_language_degree is null");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageDegreeIsNotNull() {
            addCriterion("native_language_degree is not null");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageDegreeEqualTo(String value) {
            addCriterion("native_language_degree =", value, "nativeLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageDegreeNotEqualTo(String value) {
            addCriterion("native_language_degree <>", value, "nativeLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageDegreeGreaterThan(String value) {
            addCriterion("native_language_degree >", value, "nativeLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("native_language_degree >=", value, "nativeLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageDegreeLessThan(String value) {
            addCriterion("native_language_degree <", value, "nativeLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageDegreeLessThanOrEqualTo(String value) {
            addCriterion("native_language_degree <=", value, "nativeLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageDegreeLike(String value) {
            addCriterion("native_language_degree like", value, "nativeLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageDegreeNotLike(String value) {
            addCriterion("native_language_degree not like", value, "nativeLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageDegreeIn(List<String> values) {
            addCriterion("native_language_degree in", values, "nativeLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageDegreeNotIn(List<String> values) {
            addCriterion("native_language_degree not in", values, "nativeLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageDegreeBetween(String value1, String value2) {
            addCriterion("native_language_degree between", value1, value2, "nativeLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageDegreeNotBetween(String value1, String value2) {
            addCriterion("native_language_degree not between", value1, value2, "nativeLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageDegreeIsNull() {
            addCriterion("foreign_language_degree is null");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageDegreeIsNotNull() {
            addCriterion("foreign_language_degree is not null");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageDegreeEqualTo(String value) {
            addCriterion("foreign_language_degree =", value, "foreignLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageDegreeNotEqualTo(String value) {
            addCriterion("foreign_language_degree <>", value, "foreignLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageDegreeGreaterThan(String value) {
            addCriterion("foreign_language_degree >", value, "foreignLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("foreign_language_degree >=", value, "foreignLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageDegreeLessThan(String value) {
            addCriterion("foreign_language_degree <", value, "foreignLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageDegreeLessThanOrEqualTo(String value) {
            addCriterion("foreign_language_degree <=", value, "foreignLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageDegreeLike(String value) {
            addCriterion("foreign_language_degree like", value, "foreignLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageDegreeNotLike(String value) {
            addCriterion("foreign_language_degree not like", value, "foreignLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageDegreeIn(List<String> values) {
            addCriterion("foreign_language_degree in", values, "foreignLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageDegreeNotIn(List<String> values) {
            addCriterion("foreign_language_degree not in", values, "foreignLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageDegreeBetween(String value1, String value2) {
            addCriterion("foreign_language_degree between", value1, value2, "foreignLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageDegreeNotBetween(String value1, String value2) {
            addCriterion("foreign_language_degree not between", value1, value2, "foreignLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedDegreeIsNull() {
            addCriterion("response_speed_degree is null");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedDegreeIsNotNull() {
            addCriterion("response_speed_degree is not null");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedDegreeEqualTo(String value) {
            addCriterion("response_speed_degree =", value, "responseSpeedDegree");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedDegreeNotEqualTo(String value) {
            addCriterion("response_speed_degree <>", value, "responseSpeedDegree");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedDegreeGreaterThan(String value) {
            addCriterion("response_speed_degree >", value, "responseSpeedDegree");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("response_speed_degree >=", value, "responseSpeedDegree");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedDegreeLessThan(String value) {
            addCriterion("response_speed_degree <", value, "responseSpeedDegree");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedDegreeLessThanOrEqualTo(String value) {
            addCriterion("response_speed_degree <=", value, "responseSpeedDegree");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedDegreeLike(String value) {
            addCriterion("response_speed_degree like", value, "responseSpeedDegree");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedDegreeNotLike(String value) {
            addCriterion("response_speed_degree not like", value, "responseSpeedDegree");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedDegreeIn(List<String> values) {
            addCriterion("response_speed_degree in", values, "responseSpeedDegree");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedDegreeNotIn(List<String> values) {
            addCriterion("response_speed_degree not in", values, "responseSpeedDegree");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedDegreeBetween(String value1, String value2) {
            addCriterion("response_speed_degree between", value1, value2, "responseSpeedDegree");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedDegreeNotBetween(String value1, String value2) {
            addCriterion("response_speed_degree not between", value1, value2, "responseSpeedDegree");
            return (Criteria) this;
        }

        public Criteria andEqDegreeIsNull() {
            addCriterion("EQ_degree is null");
            return (Criteria) this;
        }

        public Criteria andEqDegreeIsNotNull() {
            addCriterion("EQ_degree is not null");
            return (Criteria) this;
        }

        public Criteria andEqDegreeEqualTo(String value) {
            addCriterion("EQ_degree =", value, "eqDegree");
            return (Criteria) this;
        }

        public Criteria andEqDegreeNotEqualTo(String value) {
            addCriterion("EQ_degree <>", value, "eqDegree");
            return (Criteria) this;
        }

        public Criteria andEqDegreeGreaterThan(String value) {
            addCriterion("EQ_degree >", value, "eqDegree");
            return (Criteria) this;
        }

        public Criteria andEqDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("EQ_degree >=", value, "eqDegree");
            return (Criteria) this;
        }

        public Criteria andEqDegreeLessThan(String value) {
            addCriterion("EQ_degree <", value, "eqDegree");
            return (Criteria) this;
        }

        public Criteria andEqDegreeLessThanOrEqualTo(String value) {
            addCriterion("EQ_degree <=", value, "eqDegree");
            return (Criteria) this;
        }

        public Criteria andEqDegreeLike(String value) {
            addCriterion("EQ_degree like", value, "eqDegree");
            return (Criteria) this;
        }

        public Criteria andEqDegreeNotLike(String value) {
            addCriterion("EQ_degree not like", value, "eqDegree");
            return (Criteria) this;
        }

        public Criteria andEqDegreeIn(List<String> values) {
            addCriterion("EQ_degree in", values, "eqDegree");
            return (Criteria) this;
        }

        public Criteria andEqDegreeNotIn(List<String> values) {
            addCriterion("EQ_degree not in", values, "eqDegree");
            return (Criteria) this;
        }

        public Criteria andEqDegreeBetween(String value1, String value2) {
            addCriterion("EQ_degree between", value1, value2, "eqDegree");
            return (Criteria) this;
        }

        public Criteria andEqDegreeNotBetween(String value1, String value2) {
            addCriterion("EQ_degree not between", value1, value2, "eqDegree");
            return (Criteria) this;
        }

        public Criteria andIqDegreeIsNull() {
            addCriterion("IQ_degree is null");
            return (Criteria) this;
        }

        public Criteria andIqDegreeIsNotNull() {
            addCriterion("IQ_degree is not null");
            return (Criteria) this;
        }

        public Criteria andIqDegreeEqualTo(String value) {
            addCriterion("IQ_degree =", value, "iqDegree");
            return (Criteria) this;
        }

        public Criteria andIqDegreeNotEqualTo(String value) {
            addCriterion("IQ_degree <>", value, "iqDegree");
            return (Criteria) this;
        }

        public Criteria andIqDegreeGreaterThan(String value) {
            addCriterion("IQ_degree >", value, "iqDegree");
            return (Criteria) this;
        }

        public Criteria andIqDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("IQ_degree >=", value, "iqDegree");
            return (Criteria) this;
        }

        public Criteria andIqDegreeLessThan(String value) {
            addCriterion("IQ_degree <", value, "iqDegree");
            return (Criteria) this;
        }

        public Criteria andIqDegreeLessThanOrEqualTo(String value) {
            addCriterion("IQ_degree <=", value, "iqDegree");
            return (Criteria) this;
        }

        public Criteria andIqDegreeLike(String value) {
            addCriterion("IQ_degree like", value, "iqDegree");
            return (Criteria) this;
        }

        public Criteria andIqDegreeNotLike(String value) {
            addCriterion("IQ_degree not like", value, "iqDegree");
            return (Criteria) this;
        }

        public Criteria andIqDegreeIn(List<String> values) {
            addCriterion("IQ_degree in", values, "iqDegree");
            return (Criteria) this;
        }

        public Criteria andIqDegreeNotIn(List<String> values) {
            addCriterion("IQ_degree not in", values, "iqDegree");
            return (Criteria) this;
        }

        public Criteria andIqDegreeBetween(String value1, String value2) {
            addCriterion("IQ_degree between", value1, value2, "iqDegree");
            return (Criteria) this;
        }

        public Criteria andIqDegreeNotBetween(String value1, String value2) {
            addCriterion("IQ_degree not between", value1, value2, "iqDegree");
            return (Criteria) this;
        }

        public Criteria andMultiQualityDegreeIsNull() {
            addCriterion("multi_quality_degree is null");
            return (Criteria) this;
        }

        public Criteria andMultiQualityDegreeIsNotNull() {
            addCriterion("multi_quality_degree is not null");
            return (Criteria) this;
        }

        public Criteria andMultiQualityDegreeEqualTo(String value) {
            addCriterion("multi_quality_degree =", value, "multiQualityDegree");
            return (Criteria) this;
        }

        public Criteria andMultiQualityDegreeNotEqualTo(String value) {
            addCriterion("multi_quality_degree <>", value, "multiQualityDegree");
            return (Criteria) this;
        }

        public Criteria andMultiQualityDegreeGreaterThan(String value) {
            addCriterion("multi_quality_degree >", value, "multiQualityDegree");
            return (Criteria) this;
        }

        public Criteria andMultiQualityDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("multi_quality_degree >=", value, "multiQualityDegree");
            return (Criteria) this;
        }

        public Criteria andMultiQualityDegreeLessThan(String value) {
            addCriterion("multi_quality_degree <", value, "multiQualityDegree");
            return (Criteria) this;
        }

        public Criteria andMultiQualityDegreeLessThanOrEqualTo(String value) {
            addCriterion("multi_quality_degree <=", value, "multiQualityDegree");
            return (Criteria) this;
        }

        public Criteria andMultiQualityDegreeLike(String value) {
            addCriterion("multi_quality_degree like", value, "multiQualityDegree");
            return (Criteria) this;
        }

        public Criteria andMultiQualityDegreeNotLike(String value) {
            addCriterion("multi_quality_degree not like", value, "multiQualityDegree");
            return (Criteria) this;
        }

        public Criteria andMultiQualityDegreeIn(List<String> values) {
            addCriterion("multi_quality_degree in", values, "multiQualityDegree");
            return (Criteria) this;
        }

        public Criteria andMultiQualityDegreeNotIn(List<String> values) {
            addCriterion("multi_quality_degree not in", values, "multiQualityDegree");
            return (Criteria) this;
        }

        public Criteria andMultiQualityDegreeBetween(String value1, String value2) {
            addCriterion("multi_quality_degree between", value1, value2, "multiQualityDegree");
            return (Criteria) this;
        }

        public Criteria andMultiQualityDegreeNotBetween(String value1, String value2) {
            addCriterion("multi_quality_degree not between", value1, value2, "multiQualityDegree");
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

        public Criteria andRegisteTimeIsNull() {
            addCriterion("registe_time is null");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeIsNotNull() {
            addCriterion("registe_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeEqualTo(Date value) {
            addCriterionForJDBCDate("registe_time =", value, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("registe_time <>", value, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("registe_time >", value, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("registe_time >=", value, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeLessThan(Date value) {
            addCriterionForJDBCDate("registe_time <", value, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("registe_time <=", value, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeIn(List<Date> values) {
            addCriterionForJDBCDate("registe_time in", values, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("registe_time not in", values, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("registe_time between", value1, value2, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("registe_time not between", value1, value2, "registeTime");
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

        public Criteria andResumeIdIsNull() {
            addCriterion("resume_id is null");
            return (Criteria) this;
        }

        public Criteria andResumeIdIsNotNull() {
            addCriterion("resume_id is not null");
            return (Criteria) this;
        }

        public Criteria andResumeIdEqualTo(Integer value) {
            addCriterion("resume_id =", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotEqualTo(Integer value) {
            addCriterion("resume_id <>", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdGreaterThan(Integer value) {
            addCriterion("resume_id >", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("resume_id >=", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdLessThan(Integer value) {
            addCriterion("resume_id <", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdLessThanOrEqualTo(Integer value) {
            addCriterion("resume_id <=", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdIn(List<Integer> values) {
            addCriterion("resume_id in", values, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotIn(List<Integer> values) {
            addCriterion("resume_id not in", values, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdBetween(Integer value1, Integer value2) {
            addCriterion("resume_id between", value1, value2, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("resume_id not between", value1, value2, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("`result` is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("`result` is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("`result` =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("`result` <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("`result` >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("`result` >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("`result` <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("`result` <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("`result` like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("`result` not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("`result` in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("`result` not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("`result` between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("`result` not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andInterviewCommentIsNull() {
            addCriterion("interview_comment is null");
            return (Criteria) this;
        }

        public Criteria andInterviewCommentIsNotNull() {
            addCriterion("interview_comment is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewCommentEqualTo(String value) {
            addCriterion("interview_comment =", value, "interviewComment");
            return (Criteria) this;
        }

        public Criteria andInterviewCommentNotEqualTo(String value) {
            addCriterion("interview_comment <>", value, "interviewComment");
            return (Criteria) this;
        }

        public Criteria andInterviewCommentGreaterThan(String value) {
            addCriterion("interview_comment >", value, "interviewComment");
            return (Criteria) this;
        }

        public Criteria andInterviewCommentGreaterThanOrEqualTo(String value) {
            addCriterion("interview_comment >=", value, "interviewComment");
            return (Criteria) this;
        }

        public Criteria andInterviewCommentLessThan(String value) {
            addCriterion("interview_comment <", value, "interviewComment");
            return (Criteria) this;
        }

        public Criteria andInterviewCommentLessThanOrEqualTo(String value) {
            addCriterion("interview_comment <=", value, "interviewComment");
            return (Criteria) this;
        }

        public Criteria andInterviewCommentLike(String value) {
            addCriterion("interview_comment like", value, "interviewComment");
            return (Criteria) this;
        }

        public Criteria andInterviewCommentNotLike(String value) {
            addCriterion("interview_comment not like", value, "interviewComment");
            return (Criteria) this;
        }

        public Criteria andInterviewCommentIn(List<String> values) {
            addCriterion("interview_comment in", values, "interviewComment");
            return (Criteria) this;
        }

        public Criteria andInterviewCommentNotIn(List<String> values) {
            addCriterion("interview_comment not in", values, "interviewComment");
            return (Criteria) this;
        }

        public Criteria andInterviewCommentBetween(String value1, String value2) {
            addCriterion("interview_comment between", value1, value2, "interviewComment");
            return (Criteria) this;
        }

        public Criteria andInterviewCommentNotBetween(String value1, String value2) {
            addCriterion("interview_comment not between", value1, value2, "interviewComment");
            return (Criteria) this;
        }

        public Criteria andCheckCommentIsNull() {
            addCriterion("check_comment is null");
            return (Criteria) this;
        }

        public Criteria andCheckCommentIsNotNull() {
            addCriterion("check_comment is not null");
            return (Criteria) this;
        }

        public Criteria andCheckCommentEqualTo(String value) {
            addCriterion("check_comment =", value, "checkComment");
            return (Criteria) this;
        }

        public Criteria andCheckCommentNotEqualTo(String value) {
            addCriterion("check_comment <>", value, "checkComment");
            return (Criteria) this;
        }

        public Criteria andCheckCommentGreaterThan(String value) {
            addCriterion("check_comment >", value, "checkComment");
            return (Criteria) this;
        }

        public Criteria andCheckCommentGreaterThanOrEqualTo(String value) {
            addCriterion("check_comment >=", value, "checkComment");
            return (Criteria) this;
        }

        public Criteria andCheckCommentLessThan(String value) {
            addCriterion("check_comment <", value, "checkComment");
            return (Criteria) this;
        }

        public Criteria andCheckCommentLessThanOrEqualTo(String value) {
            addCriterion("check_comment <=", value, "checkComment");
            return (Criteria) this;
        }

        public Criteria andCheckCommentLike(String value) {
            addCriterion("check_comment like", value, "checkComment");
            return (Criteria) this;
        }

        public Criteria andCheckCommentNotLike(String value) {
            addCriterion("check_comment not like", value, "checkComment");
            return (Criteria) this;
        }

        public Criteria andCheckCommentIn(List<String> values) {
            addCriterion("check_comment in", values, "checkComment");
            return (Criteria) this;
        }

        public Criteria andCheckCommentNotIn(List<String> values) {
            addCriterion("check_comment not in", values, "checkComment");
            return (Criteria) this;
        }

        public Criteria andCheckCommentBetween(String value1, String value2) {
            addCriterion("check_comment between", value1, value2, "checkComment");
            return (Criteria) this;
        }

        public Criteria andCheckCommentNotBetween(String value1, String value2) {
            addCriterion("check_comment not between", value1, value2, "checkComment");
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
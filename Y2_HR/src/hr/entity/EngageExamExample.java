package hr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EngageExamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public EngageExamExample() {
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

        public Criteria andExamNumberIsNull() {
            addCriterion("exam_number is null");
            return (Criteria) this;
        }

        public Criteria andExamNumberIsNotNull() {
            addCriterion("exam_number is not null");
            return (Criteria) this;
        }

        public Criteria andExamNumberEqualTo(String value) {
            addCriterion("exam_number =", value, "examNumber");
            return (Criteria) this;
        }

        public Criteria andExamNumberNotEqualTo(String value) {
            addCriterion("exam_number <>", value, "examNumber");
            return (Criteria) this;
        }

        public Criteria andExamNumberGreaterThan(String value) {
            addCriterion("exam_number >", value, "examNumber");
            return (Criteria) this;
        }

        public Criteria andExamNumberGreaterThanOrEqualTo(String value) {
            addCriterion("exam_number >=", value, "examNumber");
            return (Criteria) this;
        }

        public Criteria andExamNumberLessThan(String value) {
            addCriterion("exam_number <", value, "examNumber");
            return (Criteria) this;
        }

        public Criteria andExamNumberLessThanOrEqualTo(String value) {
            addCriterion("exam_number <=", value, "examNumber");
            return (Criteria) this;
        }

        public Criteria andExamNumberLike(String value) {
            addCriterion("exam_number like", value, "examNumber");
            return (Criteria) this;
        }

        public Criteria andExamNumberNotLike(String value) {
            addCriterion("exam_number not like", value, "examNumber");
            return (Criteria) this;
        }

        public Criteria andExamNumberIn(List<String> values) {
            addCriterion("exam_number in", values, "examNumber");
            return (Criteria) this;
        }

        public Criteria andExamNumberNotIn(List<String> values) {
            addCriterion("exam_number not in", values, "examNumber");
            return (Criteria) this;
        }

        public Criteria andExamNumberBetween(String value1, String value2) {
            addCriterion("exam_number between", value1, value2, "examNumber");
            return (Criteria) this;
        }

        public Criteria andExamNumberNotBetween(String value1, String value2) {
            addCriterion("exam_number not between", value1, value2, "examNumber");
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

        public Criteria andLimiteTimeIsNull() {
            addCriterion("limite_time is null");
            return (Criteria) this;
        }

        public Criteria andLimiteTimeIsNotNull() {
            addCriterion("limite_time is not null");
            return (Criteria) this;
        }

        public Criteria andLimiteTimeEqualTo(String value) {
            addCriterion("limite_time =", value, "limiteTime");
            return (Criteria) this;
        }

        public Criteria andLimiteTimeNotEqualTo(String value) {
            addCriterion("limite_time <>", value, "limiteTime");
            return (Criteria) this;
        }

        public Criteria andLimiteTimeGreaterThan(String value) {
            addCriterion("limite_time >", value, "limiteTime");
            return (Criteria) this;
        }

        public Criteria andLimiteTimeGreaterThanOrEqualTo(String value) {
            addCriterion("limite_time >=", value, "limiteTime");
            return (Criteria) this;
        }

        public Criteria andLimiteTimeLessThan(String value) {
            addCriterion("limite_time <", value, "limiteTime");
            return (Criteria) this;
        }

        public Criteria andLimiteTimeLessThanOrEqualTo(String value) {
            addCriterion("limite_time <=", value, "limiteTime");
            return (Criteria) this;
        }

        public Criteria andLimiteTimeLike(String value) {
            addCriterion("limite_time like", value, "limiteTime");
            return (Criteria) this;
        }

        public Criteria andLimiteTimeNotLike(String value) {
            addCriterion("limite_time not like", value, "limiteTime");
            return (Criteria) this;
        }

        public Criteria andLimiteTimeIn(List<String> values) {
            addCriterion("limite_time in", values, "limiteTime");
            return (Criteria) this;
        }

        public Criteria andLimiteTimeNotIn(List<String> values) {
            addCriterion("limite_time not in", values, "limiteTime");
            return (Criteria) this;
        }

        public Criteria andLimiteTimeBetween(String value1, String value2) {
            addCriterion("limite_time between", value1, value2, "limiteTime");
            return (Criteria) this;
        }

        public Criteria andLimiteTimeNotBetween(String value1, String value2) {
            addCriterion("limite_time not between", value1, value2, "limiteTime");
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
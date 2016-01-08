package hr.entity;

import java.util.ArrayList;
import java.util.List;

public class ConfigFileThirdKindExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ConfigFileThirdKindExample() {
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

        public Criteria andThirdKindSaleIdIsNull() {
            addCriterion("third_kind_sale_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdKindSaleIdIsNotNull() {
            addCriterion("third_kind_sale_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdKindSaleIdEqualTo(String value) {
            addCriterion("third_kind_sale_id =", value, "thirdKindSaleId");
            return (Criteria) this;
        }

        public Criteria andThirdKindSaleIdNotEqualTo(String value) {
            addCriterion("third_kind_sale_id <>", value, "thirdKindSaleId");
            return (Criteria) this;
        }

        public Criteria andThirdKindSaleIdGreaterThan(String value) {
            addCriterion("third_kind_sale_id >", value, "thirdKindSaleId");
            return (Criteria) this;
        }

        public Criteria andThirdKindSaleIdGreaterThanOrEqualTo(String value) {
            addCriterion("third_kind_sale_id >=", value, "thirdKindSaleId");
            return (Criteria) this;
        }

        public Criteria andThirdKindSaleIdLessThan(String value) {
            addCriterion("third_kind_sale_id <", value, "thirdKindSaleId");
            return (Criteria) this;
        }

        public Criteria andThirdKindSaleIdLessThanOrEqualTo(String value) {
            addCriterion("third_kind_sale_id <=", value, "thirdKindSaleId");
            return (Criteria) this;
        }

        public Criteria andThirdKindSaleIdLike(String value) {
            addCriterion("third_kind_sale_id like", value, "thirdKindSaleId");
            return (Criteria) this;
        }

        public Criteria andThirdKindSaleIdNotLike(String value) {
            addCriterion("third_kind_sale_id not like", value, "thirdKindSaleId");
            return (Criteria) this;
        }

        public Criteria andThirdKindSaleIdIn(List<String> values) {
            addCriterion("third_kind_sale_id in", values, "thirdKindSaleId");
            return (Criteria) this;
        }

        public Criteria andThirdKindSaleIdNotIn(List<String> values) {
            addCriterion("third_kind_sale_id not in", values, "thirdKindSaleId");
            return (Criteria) this;
        }

        public Criteria andThirdKindSaleIdBetween(String value1, String value2) {
            addCriterion("third_kind_sale_id between", value1, value2, "thirdKindSaleId");
            return (Criteria) this;
        }

        public Criteria andThirdKindSaleIdNotBetween(String value1, String value2) {
            addCriterion("third_kind_sale_id not between", value1, value2, "thirdKindSaleId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIsRetailIsNull() {
            addCriterion("third_kind_is_retail is null");
            return (Criteria) this;
        }

        public Criteria andThirdKindIsRetailIsNotNull() {
            addCriterion("third_kind_is_retail is not null");
            return (Criteria) this;
        }

        public Criteria andThirdKindIsRetailEqualTo(String value) {
            addCriterion("third_kind_is_retail =", value, "thirdKindIsRetail");
            return (Criteria) this;
        }

        public Criteria andThirdKindIsRetailNotEqualTo(String value) {
            addCriterion("third_kind_is_retail <>", value, "thirdKindIsRetail");
            return (Criteria) this;
        }

        public Criteria andThirdKindIsRetailGreaterThan(String value) {
            addCriterion("third_kind_is_retail >", value, "thirdKindIsRetail");
            return (Criteria) this;
        }

        public Criteria andThirdKindIsRetailGreaterThanOrEqualTo(String value) {
            addCriterion("third_kind_is_retail >=", value, "thirdKindIsRetail");
            return (Criteria) this;
        }

        public Criteria andThirdKindIsRetailLessThan(String value) {
            addCriterion("third_kind_is_retail <", value, "thirdKindIsRetail");
            return (Criteria) this;
        }

        public Criteria andThirdKindIsRetailLessThanOrEqualTo(String value) {
            addCriterion("third_kind_is_retail <=", value, "thirdKindIsRetail");
            return (Criteria) this;
        }

        public Criteria andThirdKindIsRetailLike(String value) {
            addCriterion("third_kind_is_retail like", value, "thirdKindIsRetail");
            return (Criteria) this;
        }

        public Criteria andThirdKindIsRetailNotLike(String value) {
            addCriterion("third_kind_is_retail not like", value, "thirdKindIsRetail");
            return (Criteria) this;
        }

        public Criteria andThirdKindIsRetailIn(List<String> values) {
            addCriterion("third_kind_is_retail in", values, "thirdKindIsRetail");
            return (Criteria) this;
        }

        public Criteria andThirdKindIsRetailNotIn(List<String> values) {
            addCriterion("third_kind_is_retail not in", values, "thirdKindIsRetail");
            return (Criteria) this;
        }

        public Criteria andThirdKindIsRetailBetween(String value1, String value2) {
            addCriterion("third_kind_is_retail between", value1, value2, "thirdKindIsRetail");
            return (Criteria) this;
        }

        public Criteria andThirdKindIsRetailNotBetween(String value1, String value2) {
            addCriterion("third_kind_is_retail not between", value1, value2, "thirdKindIsRetail");
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
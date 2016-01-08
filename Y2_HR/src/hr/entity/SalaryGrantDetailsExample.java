package hr.entity;

import java.util.ArrayList;
import java.util.List;

public class SalaryGrantDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SalaryGrantDetailsExample() {
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

        public Criteria andSalaryGrantIdIsNull() {
            addCriterion("salary_grant_id is null");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdIsNotNull() {
            addCriterion("salary_grant_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdEqualTo(String value) {
            addCriterion("salary_grant_id =", value, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdNotEqualTo(String value) {
            addCriterion("salary_grant_id <>", value, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdGreaterThan(String value) {
            addCriterion("salary_grant_id >", value, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdGreaterThanOrEqualTo(String value) {
            addCriterion("salary_grant_id >=", value, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdLessThan(String value) {
            addCriterion("salary_grant_id <", value, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdLessThanOrEqualTo(String value) {
            addCriterion("salary_grant_id <=", value, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdLike(String value) {
            addCriterion("salary_grant_id like", value, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdNotLike(String value) {
            addCriterion("salary_grant_id not like", value, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdIn(List<String> values) {
            addCriterion("salary_grant_id in", values, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdNotIn(List<String> values) {
            addCriterion("salary_grant_id not in", values, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdBetween(String value1, String value2) {
            addCriterion("salary_grant_id between", value1, value2, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdNotBetween(String value1, String value2) {
            addCriterion("salary_grant_id not between", value1, value2, "salaryGrantId");
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

        public Criteria andBounsSumIsNull() {
            addCriterion("bouns_sum is null");
            return (Criteria) this;
        }

        public Criteria andBounsSumIsNotNull() {
            addCriterion("bouns_sum is not null");
            return (Criteria) this;
        }

        public Criteria andBounsSumEqualTo(Double value) {
            addCriterion("bouns_sum =", value, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andBounsSumNotEqualTo(Double value) {
            addCriterion("bouns_sum <>", value, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andBounsSumGreaterThan(Double value) {
            addCriterion("bouns_sum >", value, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andBounsSumGreaterThanOrEqualTo(Double value) {
            addCriterion("bouns_sum >=", value, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andBounsSumLessThan(Double value) {
            addCriterion("bouns_sum <", value, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andBounsSumLessThanOrEqualTo(Double value) {
            addCriterion("bouns_sum <=", value, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andBounsSumIn(List<Double> values) {
            addCriterion("bouns_sum in", values, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andBounsSumNotIn(List<Double> values) {
            addCriterion("bouns_sum not in", values, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andBounsSumBetween(Double value1, Double value2) {
            addCriterion("bouns_sum between", value1, value2, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andBounsSumNotBetween(Double value1, Double value2) {
            addCriterion("bouns_sum not between", value1, value2, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumIsNull() {
            addCriterion("sale_sum is null");
            return (Criteria) this;
        }

        public Criteria andSaleSumIsNotNull() {
            addCriterion("sale_sum is not null");
            return (Criteria) this;
        }

        public Criteria andSaleSumEqualTo(Double value) {
            addCriterion("sale_sum =", value, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumNotEqualTo(Double value) {
            addCriterion("sale_sum <>", value, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumGreaterThan(Double value) {
            addCriterion("sale_sum >", value, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumGreaterThanOrEqualTo(Double value) {
            addCriterion("sale_sum >=", value, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumLessThan(Double value) {
            addCriterion("sale_sum <", value, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumLessThanOrEqualTo(Double value) {
            addCriterion("sale_sum <=", value, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumIn(List<Double> values) {
            addCriterion("sale_sum in", values, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumNotIn(List<Double> values) {
            addCriterion("sale_sum not in", values, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumBetween(Double value1, Double value2) {
            addCriterion("sale_sum between", value1, value2, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumNotBetween(Double value1, Double value2) {
            addCriterion("sale_sum not between", value1, value2, "saleSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumIsNull() {
            addCriterion("deduct_sum is null");
            return (Criteria) this;
        }

        public Criteria andDeductSumIsNotNull() {
            addCriterion("deduct_sum is not null");
            return (Criteria) this;
        }

        public Criteria andDeductSumEqualTo(Double value) {
            addCriterion("deduct_sum =", value, "deductSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumNotEqualTo(Double value) {
            addCriterion("deduct_sum <>", value, "deductSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumGreaterThan(Double value) {
            addCriterion("deduct_sum >", value, "deductSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumGreaterThanOrEqualTo(Double value) {
            addCriterion("deduct_sum >=", value, "deductSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumLessThan(Double value) {
            addCriterion("deduct_sum <", value, "deductSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumLessThanOrEqualTo(Double value) {
            addCriterion("deduct_sum <=", value, "deductSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumIn(List<Double> values) {
            addCriterion("deduct_sum in", values, "deductSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumNotIn(List<Double> values) {
            addCriterion("deduct_sum not in", values, "deductSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumBetween(Double value1, Double value2) {
            addCriterion("deduct_sum between", value1, value2, "deductSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumNotBetween(Double value1, Double value2) {
            addCriterion("deduct_sum not between", value1, value2, "deductSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumIsNull() {
            addCriterion("salary_standard_sum is null");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumIsNotNull() {
            addCriterion("salary_standard_sum is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumEqualTo(Double value) {
            addCriterion("salary_standard_sum =", value, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumNotEqualTo(Double value) {
            addCriterion("salary_standard_sum <>", value, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumGreaterThan(Double value) {
            addCriterion("salary_standard_sum >", value, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumGreaterThanOrEqualTo(Double value) {
            addCriterion("salary_standard_sum >=", value, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumLessThan(Double value) {
            addCriterion("salary_standard_sum <", value, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumLessThanOrEqualTo(Double value) {
            addCriterion("salary_standard_sum <=", value, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumIn(List<Double> values) {
            addCriterion("salary_standard_sum in", values, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumNotIn(List<Double> values) {
            addCriterion("salary_standard_sum not in", values, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumBetween(Double value1, Double value2) {
            addCriterion("salary_standard_sum between", value1, value2, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumNotBetween(Double value1, Double value2) {
            addCriterion("salary_standard_sum not between", value1, value2, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantDetailscolIsNull() {
            addCriterion("salary_grant_detailscol is null");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantDetailscolIsNotNull() {
            addCriterion("salary_grant_detailscol is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantDetailscolEqualTo(Double value) {
            addCriterion("salary_grant_detailscol =", value, "salaryGrantDetailscol");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantDetailscolNotEqualTo(Double value) {
            addCriterion("salary_grant_detailscol <>", value, "salaryGrantDetailscol");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantDetailscolGreaterThan(Double value) {
            addCriterion("salary_grant_detailscol >", value, "salaryGrantDetailscol");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantDetailscolGreaterThanOrEqualTo(Double value) {
            addCriterion("salary_grant_detailscol >=", value, "salaryGrantDetailscol");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantDetailscolLessThan(Double value) {
            addCriterion("salary_grant_detailscol <", value, "salaryGrantDetailscol");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantDetailscolLessThanOrEqualTo(Double value) {
            addCriterion("salary_grant_detailscol <=", value, "salaryGrantDetailscol");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantDetailscolIn(List<Double> values) {
            addCriterion("salary_grant_detailscol in", values, "salaryGrantDetailscol");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantDetailscolNotIn(List<Double> values) {
            addCriterion("salary_grant_detailscol not in", values, "salaryGrantDetailscol");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantDetailscolBetween(Double value1, Double value2) {
            addCriterion("salary_grant_detailscol between", value1, value2, "salaryGrantDetailscol");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantDetailscolNotBetween(Double value1, Double value2) {
            addCriterion("salary_grant_detailscol not between", value1, value2, "salaryGrantDetailscol");
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
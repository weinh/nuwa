package com.yongle.nuwa.model.demo;

import java.util.ArrayList;
import java.util.List;

public class DemoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table demo
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table demo
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table demo
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbg.generated
     */
    public DemoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table demo
     *
     * @mbg.generated
     */
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andRankIntIsNull() {
            addCriterion("rank_int is null");
            return (Criteria) this;
        }

        public Criteria andRankIntIsNotNull() {
            addCriterion("rank_int is not null");
            return (Criteria) this;
        }

        public Criteria andRankIntEqualTo(Integer value) {
            addCriterion("rank_int =", value, "rankInt");
            return (Criteria) this;
        }

        public Criteria andRankIntNotEqualTo(Integer value) {
            addCriterion("rank_int <>", value, "rankInt");
            return (Criteria) this;
        }

        public Criteria andRankIntGreaterThan(Integer value) {
            addCriterion("rank_int >", value, "rankInt");
            return (Criteria) this;
        }

        public Criteria andRankIntGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank_int >=", value, "rankInt");
            return (Criteria) this;
        }

        public Criteria andRankIntLessThan(Integer value) {
            addCriterion("rank_int <", value, "rankInt");
            return (Criteria) this;
        }

        public Criteria andRankIntLessThanOrEqualTo(Integer value) {
            addCriterion("rank_int <=", value, "rankInt");
            return (Criteria) this;
        }

        public Criteria andRankIntIn(List<Integer> values) {
            addCriterion("rank_int in", values, "rankInt");
            return (Criteria) this;
        }

        public Criteria andRankIntNotIn(List<Integer> values) {
            addCriterion("rank_int not in", values, "rankInt");
            return (Criteria) this;
        }

        public Criteria andRankIntBetween(Integer value1, Integer value2) {
            addCriterion("rank_int between", value1, value2, "rankInt");
            return (Criteria) this;
        }

        public Criteria andRankIntNotBetween(Integer value1, Integer value2) {
            addCriterion("rank_int not between", value1, value2, "rankInt");
            return (Criteria) this;
        }

        public Criteria andRankTinyintIsNull() {
            addCriterion("rank_tinyint is null");
            return (Criteria) this;
        }

        public Criteria andRankTinyintIsNotNull() {
            addCriterion("rank_tinyint is not null");
            return (Criteria) this;
        }

        public Criteria andRankTinyintEqualTo(Byte value) {
            addCriterion("rank_tinyint =", value, "rankTinyint");
            return (Criteria) this;
        }

        public Criteria andRankTinyintNotEqualTo(Byte value) {
            addCriterion("rank_tinyint <>", value, "rankTinyint");
            return (Criteria) this;
        }

        public Criteria andRankTinyintGreaterThan(Byte value) {
            addCriterion("rank_tinyint >", value, "rankTinyint");
            return (Criteria) this;
        }

        public Criteria andRankTinyintGreaterThanOrEqualTo(Byte value) {
            addCriterion("rank_tinyint >=", value, "rankTinyint");
            return (Criteria) this;
        }

        public Criteria andRankTinyintLessThan(Byte value) {
            addCriterion("rank_tinyint <", value, "rankTinyint");
            return (Criteria) this;
        }

        public Criteria andRankTinyintLessThanOrEqualTo(Byte value) {
            addCriterion("rank_tinyint <=", value, "rankTinyint");
            return (Criteria) this;
        }

        public Criteria andRankTinyintIn(List<Byte> values) {
            addCriterion("rank_tinyint in", values, "rankTinyint");
            return (Criteria) this;
        }

        public Criteria andRankTinyintNotIn(List<Byte> values) {
            addCriterion("rank_tinyint not in", values, "rankTinyint");
            return (Criteria) this;
        }

        public Criteria andRankTinyintBetween(Byte value1, Byte value2) {
            addCriterion("rank_tinyint between", value1, value2, "rankTinyint");
            return (Criteria) this;
        }

        public Criteria andRankTinyintNotBetween(Byte value1, Byte value2) {
            addCriterion("rank_tinyint not between", value1, value2, "rankTinyint");
            return (Criteria) this;
        }

        public Criteria andRankSmallintIsNull() {
            addCriterion("rank_smallint is null");
            return (Criteria) this;
        }

        public Criteria andRankSmallintIsNotNull() {
            addCriterion("rank_smallint is not null");
            return (Criteria) this;
        }

        public Criteria andRankSmallintEqualTo(Short value) {
            addCriterion("rank_smallint =", value, "rankSmallint");
            return (Criteria) this;
        }

        public Criteria andRankSmallintNotEqualTo(Short value) {
            addCriterion("rank_smallint <>", value, "rankSmallint");
            return (Criteria) this;
        }

        public Criteria andRankSmallintGreaterThan(Short value) {
            addCriterion("rank_smallint >", value, "rankSmallint");
            return (Criteria) this;
        }

        public Criteria andRankSmallintGreaterThanOrEqualTo(Short value) {
            addCriterion("rank_smallint >=", value, "rankSmallint");
            return (Criteria) this;
        }

        public Criteria andRankSmallintLessThan(Short value) {
            addCriterion("rank_smallint <", value, "rankSmallint");
            return (Criteria) this;
        }

        public Criteria andRankSmallintLessThanOrEqualTo(Short value) {
            addCriterion("rank_smallint <=", value, "rankSmallint");
            return (Criteria) this;
        }

        public Criteria andRankSmallintIn(List<Short> values) {
            addCriterion("rank_smallint in", values, "rankSmallint");
            return (Criteria) this;
        }

        public Criteria andRankSmallintNotIn(List<Short> values) {
            addCriterion("rank_smallint not in", values, "rankSmallint");
            return (Criteria) this;
        }

        public Criteria andRankSmallintBetween(Short value1, Short value2) {
            addCriterion("rank_smallint between", value1, value2, "rankSmallint");
            return (Criteria) this;
        }

        public Criteria andRankSmallintNotBetween(Short value1, Short value2) {
            addCriterion("rank_smallint not between", value1, value2, "rankSmallint");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table demo
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table demo
     *
     * @mbg.generated
     */
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
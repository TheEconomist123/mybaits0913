package com.zhouzz.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HuisbankCustAssetStatisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HuisbankCustAssetStatisticsExample() {
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

        public Criteria andCustAcctNoIsNull() {
            addCriterion("CUST_ACCT_NO is null");
            return (Criteria) this;
        }

        public Criteria andCustAcctNoIsNotNull() {
            addCriterion("CUST_ACCT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCustAcctNoEqualTo(String value) {
            addCriterion("CUST_ACCT_NO =", value, "custAcctNo");
            return (Criteria) this;
        }

        public Criteria andCustAcctNoNotEqualTo(String value) {
            addCriterion("CUST_ACCT_NO <>", value, "custAcctNo");
            return (Criteria) this;
        }

        public Criteria andCustAcctNoGreaterThan(String value) {
            addCriterion("CUST_ACCT_NO >", value, "custAcctNo");
            return (Criteria) this;
        }

        public Criteria andCustAcctNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_ACCT_NO >=", value, "custAcctNo");
            return (Criteria) this;
        }

        public Criteria andCustAcctNoLessThan(String value) {
            addCriterion("CUST_ACCT_NO <", value, "custAcctNo");
            return (Criteria) this;
        }

        public Criteria andCustAcctNoLessThanOrEqualTo(String value) {
            addCriterion("CUST_ACCT_NO <=", value, "custAcctNo");
            return (Criteria) this;
        }

        public Criteria andCustAcctNoLike(String value) {
            addCriterion("CUST_ACCT_NO like", value, "custAcctNo");
            return (Criteria) this;
        }

        public Criteria andCustAcctNoNotLike(String value) {
            addCriterion("CUST_ACCT_NO not like", value, "custAcctNo");
            return (Criteria) this;
        }

        public Criteria andCustAcctNoIn(List<String> values) {
            addCriterion("CUST_ACCT_NO in", values, "custAcctNo");
            return (Criteria) this;
        }

        public Criteria andCustAcctNoNotIn(List<String> values) {
            addCriterion("CUST_ACCT_NO not in", values, "custAcctNo");
            return (Criteria) this;
        }

        public Criteria andCustAcctNoBetween(String value1, String value2) {
            addCriterion("CUST_ACCT_NO between", value1, value2, "custAcctNo");
            return (Criteria) this;
        }

        public Criteria andCustAcctNoNotBetween(String value1, String value2) {
            addCriterion("CUST_ACCT_NO not between", value1, value2, "custAcctNo");
            return (Criteria) this;
        }

        public Criteria andMoney1IsNull() {
            addCriterion("MONEY1 is null");
            return (Criteria) this;
        }

        public Criteria andMoney1IsNotNull() {
            addCriterion("MONEY1 is not null");
            return (Criteria) this;
        }

        public Criteria andMoney1EqualTo(BigDecimal value) {
            addCriterion("MONEY1 =", value, "money1");
            return (Criteria) this;
        }

        public Criteria andMoney1NotEqualTo(BigDecimal value) {
            addCriterion("MONEY1 <>", value, "money1");
            return (Criteria) this;
        }

        public Criteria andMoney1GreaterThan(BigDecimal value) {
            addCriterion("MONEY1 >", value, "money1");
            return (Criteria) this;
        }

        public Criteria andMoney1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY1 >=", value, "money1");
            return (Criteria) this;
        }

        public Criteria andMoney1LessThan(BigDecimal value) {
            addCriterion("MONEY1 <", value, "money1");
            return (Criteria) this;
        }

        public Criteria andMoney1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY1 <=", value, "money1");
            return (Criteria) this;
        }

        public Criteria andMoney1In(List<BigDecimal> values) {
            addCriterion("MONEY1 in", values, "money1");
            return (Criteria) this;
        }

        public Criteria andMoney1NotIn(List<BigDecimal> values) {
            addCriterion("MONEY1 not in", values, "money1");
            return (Criteria) this;
        }

        public Criteria andMoney1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY1 between", value1, value2, "money1");
            return (Criteria) this;
        }

        public Criteria andMoney1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY1 not between", value1, value2, "money1");
            return (Criteria) this;
        }

        public Criteria andCount1IsNull() {
            addCriterion("COUNT1 is null");
            return (Criteria) this;
        }

        public Criteria andCount1IsNotNull() {
            addCriterion("COUNT1 is not null");
            return (Criteria) this;
        }

        public Criteria andCount1EqualTo(Integer value) {
            addCriterion("COUNT1 =", value, "count1");
            return (Criteria) this;
        }

        public Criteria andCount1NotEqualTo(Integer value) {
            addCriterion("COUNT1 <>", value, "count1");
            return (Criteria) this;
        }

        public Criteria andCount1GreaterThan(Integer value) {
            addCriterion("COUNT1 >", value, "count1");
            return (Criteria) this;
        }

        public Criteria andCount1GreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT1 >=", value, "count1");
            return (Criteria) this;
        }

        public Criteria andCount1LessThan(Integer value) {
            addCriterion("COUNT1 <", value, "count1");
            return (Criteria) this;
        }

        public Criteria andCount1LessThanOrEqualTo(Integer value) {
            addCriterion("COUNT1 <=", value, "count1");
            return (Criteria) this;
        }

        public Criteria andCount1In(List<Integer> values) {
            addCriterion("COUNT1 in", values, "count1");
            return (Criteria) this;
        }

        public Criteria andCount1NotIn(List<Integer> values) {
            addCriterion("COUNT1 not in", values, "count1");
            return (Criteria) this;
        }

        public Criteria andCount1Between(Integer value1, Integer value2) {
            addCriterion("COUNT1 between", value1, value2, "count1");
            return (Criteria) this;
        }

        public Criteria andCount1NotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT1 not between", value1, value2, "count1");
            return (Criteria) this;
        }

        public Criteria andMoney2IsNull() {
            addCriterion("MONEY2 is null");
            return (Criteria) this;
        }

        public Criteria andMoney2IsNotNull() {
            addCriterion("MONEY2 is not null");
            return (Criteria) this;
        }

        public Criteria andMoney2EqualTo(BigDecimal value) {
            addCriterion("MONEY2 =", value, "money2");
            return (Criteria) this;
        }

        public Criteria andMoney2NotEqualTo(BigDecimal value) {
            addCriterion("MONEY2 <>", value, "money2");
            return (Criteria) this;
        }

        public Criteria andMoney2GreaterThan(BigDecimal value) {
            addCriterion("MONEY2 >", value, "money2");
            return (Criteria) this;
        }

        public Criteria andMoney2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY2 >=", value, "money2");
            return (Criteria) this;
        }

        public Criteria andMoney2LessThan(BigDecimal value) {
            addCriterion("MONEY2 <", value, "money2");
            return (Criteria) this;
        }

        public Criteria andMoney2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY2 <=", value, "money2");
            return (Criteria) this;
        }

        public Criteria andMoney2In(List<BigDecimal> values) {
            addCriterion("MONEY2 in", values, "money2");
            return (Criteria) this;
        }

        public Criteria andMoney2NotIn(List<BigDecimal> values) {
            addCriterion("MONEY2 not in", values, "money2");
            return (Criteria) this;
        }

        public Criteria andMoney2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY2 between", value1, value2, "money2");
            return (Criteria) this;
        }

        public Criteria andMoney2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY2 not between", value1, value2, "money2");
            return (Criteria) this;
        }

        public Criteria andCount2IsNull() {
            addCriterion("COUNT2 is null");
            return (Criteria) this;
        }

        public Criteria andCount2IsNotNull() {
            addCriterion("COUNT2 is not null");
            return (Criteria) this;
        }

        public Criteria andCount2EqualTo(Integer value) {
            addCriterion("COUNT2 =", value, "count2");
            return (Criteria) this;
        }

        public Criteria andCount2NotEqualTo(Integer value) {
            addCriterion("COUNT2 <>", value, "count2");
            return (Criteria) this;
        }

        public Criteria andCount2GreaterThan(Integer value) {
            addCriterion("COUNT2 >", value, "count2");
            return (Criteria) this;
        }

        public Criteria andCount2GreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT2 >=", value, "count2");
            return (Criteria) this;
        }

        public Criteria andCount2LessThan(Integer value) {
            addCriterion("COUNT2 <", value, "count2");
            return (Criteria) this;
        }

        public Criteria andCount2LessThanOrEqualTo(Integer value) {
            addCriterion("COUNT2 <=", value, "count2");
            return (Criteria) this;
        }

        public Criteria andCount2In(List<Integer> values) {
            addCriterion("COUNT2 in", values, "count2");
            return (Criteria) this;
        }

        public Criteria andCount2NotIn(List<Integer> values) {
            addCriterion("COUNT2 not in", values, "count2");
            return (Criteria) this;
        }

        public Criteria andCount2Between(Integer value1, Integer value2) {
            addCriterion("COUNT2 between", value1, value2, "count2");
            return (Criteria) this;
        }

        public Criteria andCount2NotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT2 not between", value1, value2, "count2");
            return (Criteria) this;
        }

        public Criteria andMoney3IsNull() {
            addCriterion("MONEY3 is null");
            return (Criteria) this;
        }

        public Criteria andMoney3IsNotNull() {
            addCriterion("MONEY3 is not null");
            return (Criteria) this;
        }

        public Criteria andMoney3EqualTo(BigDecimal value) {
            addCriterion("MONEY3 =", value, "money3");
            return (Criteria) this;
        }

        public Criteria andMoney3NotEqualTo(BigDecimal value) {
            addCriterion("MONEY3 <>", value, "money3");
            return (Criteria) this;
        }

        public Criteria andMoney3GreaterThan(BigDecimal value) {
            addCriterion("MONEY3 >", value, "money3");
            return (Criteria) this;
        }

        public Criteria andMoney3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY3 >=", value, "money3");
            return (Criteria) this;
        }

        public Criteria andMoney3LessThan(BigDecimal value) {
            addCriterion("MONEY3 <", value, "money3");
            return (Criteria) this;
        }

        public Criteria andMoney3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY3 <=", value, "money3");
            return (Criteria) this;
        }

        public Criteria andMoney3In(List<BigDecimal> values) {
            addCriterion("MONEY3 in", values, "money3");
            return (Criteria) this;
        }

        public Criteria andMoney3NotIn(List<BigDecimal> values) {
            addCriterion("MONEY3 not in", values, "money3");
            return (Criteria) this;
        }

        public Criteria andMoney3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY3 between", value1, value2, "money3");
            return (Criteria) this;
        }

        public Criteria andMoney3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY3 not between", value1, value2, "money3");
            return (Criteria) this;
        }

        public Criteria andCount3IsNull() {
            addCriterion("COUNT3 is null");
            return (Criteria) this;
        }

        public Criteria andCount3IsNotNull() {
            addCriterion("COUNT3 is not null");
            return (Criteria) this;
        }

        public Criteria andCount3EqualTo(Integer value) {
            addCriterion("COUNT3 =", value, "count3");
            return (Criteria) this;
        }

        public Criteria andCount3NotEqualTo(Integer value) {
            addCriterion("COUNT3 <>", value, "count3");
            return (Criteria) this;
        }

        public Criteria andCount3GreaterThan(Integer value) {
            addCriterion("COUNT3 >", value, "count3");
            return (Criteria) this;
        }

        public Criteria andCount3GreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT3 >=", value, "count3");
            return (Criteria) this;
        }

        public Criteria andCount3LessThan(Integer value) {
            addCriterion("COUNT3 <", value, "count3");
            return (Criteria) this;
        }

        public Criteria andCount3LessThanOrEqualTo(Integer value) {
            addCriterion("COUNT3 <=", value, "count3");
            return (Criteria) this;
        }

        public Criteria andCount3In(List<Integer> values) {
            addCriterion("COUNT3 in", values, "count3");
            return (Criteria) this;
        }

        public Criteria andCount3NotIn(List<Integer> values) {
            addCriterion("COUNT3 not in", values, "count3");
            return (Criteria) this;
        }

        public Criteria andCount3Between(Integer value1, Integer value2) {
            addCriterion("COUNT3 between", value1, value2, "count3");
            return (Criteria) this;
        }

        public Criteria andCount3NotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT3 not between", value1, value2, "count3");
            return (Criteria) this;
        }

        public Criteria andMoney4IsNull() {
            addCriterion("MONEY4 is null");
            return (Criteria) this;
        }

        public Criteria andMoney4IsNotNull() {
            addCriterion("MONEY4 is not null");
            return (Criteria) this;
        }

        public Criteria andMoney4EqualTo(BigDecimal value) {
            addCriterion("MONEY4 =", value, "money4");
            return (Criteria) this;
        }

        public Criteria andMoney4NotEqualTo(BigDecimal value) {
            addCriterion("MONEY4 <>", value, "money4");
            return (Criteria) this;
        }

        public Criteria andMoney4GreaterThan(BigDecimal value) {
            addCriterion("MONEY4 >", value, "money4");
            return (Criteria) this;
        }

        public Criteria andMoney4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY4 >=", value, "money4");
            return (Criteria) this;
        }

        public Criteria andMoney4LessThan(BigDecimal value) {
            addCriterion("MONEY4 <", value, "money4");
            return (Criteria) this;
        }

        public Criteria andMoney4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY4 <=", value, "money4");
            return (Criteria) this;
        }

        public Criteria andMoney4In(List<BigDecimal> values) {
            addCriterion("MONEY4 in", values, "money4");
            return (Criteria) this;
        }

        public Criteria andMoney4NotIn(List<BigDecimal> values) {
            addCriterion("MONEY4 not in", values, "money4");
            return (Criteria) this;
        }

        public Criteria andMoney4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY4 between", value1, value2, "money4");
            return (Criteria) this;
        }

        public Criteria andMoney4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY4 not between", value1, value2, "money4");
            return (Criteria) this;
        }

        public Criteria andCount4IsNull() {
            addCriterion("COUNT4 is null");
            return (Criteria) this;
        }

        public Criteria andCount4IsNotNull() {
            addCriterion("COUNT4 is not null");
            return (Criteria) this;
        }

        public Criteria andCount4EqualTo(Integer value) {
            addCriterion("COUNT4 =", value, "count4");
            return (Criteria) this;
        }

        public Criteria andCount4NotEqualTo(Integer value) {
            addCriterion("COUNT4 <>", value, "count4");
            return (Criteria) this;
        }

        public Criteria andCount4GreaterThan(Integer value) {
            addCriterion("COUNT4 >", value, "count4");
            return (Criteria) this;
        }

        public Criteria andCount4GreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT4 >=", value, "count4");
            return (Criteria) this;
        }

        public Criteria andCount4LessThan(Integer value) {
            addCriterion("COUNT4 <", value, "count4");
            return (Criteria) this;
        }

        public Criteria andCount4LessThanOrEqualTo(Integer value) {
            addCriterion("COUNT4 <=", value, "count4");
            return (Criteria) this;
        }

        public Criteria andCount4In(List<Integer> values) {
            addCriterion("COUNT4 in", values, "count4");
            return (Criteria) this;
        }

        public Criteria andCount4NotIn(List<Integer> values) {
            addCriterion("COUNT4 not in", values, "count4");
            return (Criteria) this;
        }

        public Criteria andCount4Between(Integer value1, Integer value2) {
            addCriterion("COUNT4 between", value1, value2, "count4");
            return (Criteria) this;
        }

        public Criteria andCount4NotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT4 not between", value1, value2, "count4");
            return (Criteria) this;
        }

        public Criteria andMoney5IsNull() {
            addCriterion("MONEY5 is null");
            return (Criteria) this;
        }

        public Criteria andMoney5IsNotNull() {
            addCriterion("MONEY5 is not null");
            return (Criteria) this;
        }

        public Criteria andMoney5EqualTo(BigDecimal value) {
            addCriterion("MONEY5 =", value, "money5");
            return (Criteria) this;
        }

        public Criteria andMoney5NotEqualTo(BigDecimal value) {
            addCriterion("MONEY5 <>", value, "money5");
            return (Criteria) this;
        }

        public Criteria andMoney5GreaterThan(BigDecimal value) {
            addCriterion("MONEY5 >", value, "money5");
            return (Criteria) this;
        }

        public Criteria andMoney5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY5 >=", value, "money5");
            return (Criteria) this;
        }

        public Criteria andMoney5LessThan(BigDecimal value) {
            addCriterion("MONEY5 <", value, "money5");
            return (Criteria) this;
        }

        public Criteria andMoney5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY5 <=", value, "money5");
            return (Criteria) this;
        }

        public Criteria andMoney5In(List<BigDecimal> values) {
            addCriterion("MONEY5 in", values, "money5");
            return (Criteria) this;
        }

        public Criteria andMoney5NotIn(List<BigDecimal> values) {
            addCriterion("MONEY5 not in", values, "money5");
            return (Criteria) this;
        }

        public Criteria andMoney5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY5 between", value1, value2, "money5");
            return (Criteria) this;
        }

        public Criteria andMoney5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY5 not between", value1, value2, "money5");
            return (Criteria) this;
        }

        public Criteria andCount5IsNull() {
            addCriterion("COUNT5 is null");
            return (Criteria) this;
        }

        public Criteria andCount5IsNotNull() {
            addCriterion("COUNT5 is not null");
            return (Criteria) this;
        }

        public Criteria andCount5EqualTo(Integer value) {
            addCriterion("COUNT5 =", value, "count5");
            return (Criteria) this;
        }

        public Criteria andCount5NotEqualTo(Integer value) {
            addCriterion("COUNT5 <>", value, "count5");
            return (Criteria) this;
        }

        public Criteria andCount5GreaterThan(Integer value) {
            addCriterion("COUNT5 >", value, "count5");
            return (Criteria) this;
        }

        public Criteria andCount5GreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT5 >=", value, "count5");
            return (Criteria) this;
        }

        public Criteria andCount5LessThan(Integer value) {
            addCriterion("COUNT5 <", value, "count5");
            return (Criteria) this;
        }

        public Criteria andCount5LessThanOrEqualTo(Integer value) {
            addCriterion("COUNT5 <=", value, "count5");
            return (Criteria) this;
        }

        public Criteria andCount5In(List<Integer> values) {
            addCriterion("COUNT5 in", values, "count5");
            return (Criteria) this;
        }

        public Criteria andCount5NotIn(List<Integer> values) {
            addCriterion("COUNT5 not in", values, "count5");
            return (Criteria) this;
        }

        public Criteria andCount5Between(Integer value1, Integer value2) {
            addCriterion("COUNT5 between", value1, value2, "count5");
            return (Criteria) this;
        }

        public Criteria andCount5NotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT5 not between", value1, value2, "count5");
            return (Criteria) this;
        }

        public Criteria andMoney6IsNull() {
            addCriterion("MONEY6 is null");
            return (Criteria) this;
        }

        public Criteria andMoney6IsNotNull() {
            addCriterion("MONEY6 is not null");
            return (Criteria) this;
        }

        public Criteria andMoney6EqualTo(BigDecimal value) {
            addCriterion("MONEY6 =", value, "money6");
            return (Criteria) this;
        }

        public Criteria andMoney6NotEqualTo(BigDecimal value) {
            addCriterion("MONEY6 <>", value, "money6");
            return (Criteria) this;
        }

        public Criteria andMoney6GreaterThan(BigDecimal value) {
            addCriterion("MONEY6 >", value, "money6");
            return (Criteria) this;
        }

        public Criteria andMoney6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY6 >=", value, "money6");
            return (Criteria) this;
        }

        public Criteria andMoney6LessThan(BigDecimal value) {
            addCriterion("MONEY6 <", value, "money6");
            return (Criteria) this;
        }

        public Criteria andMoney6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY6 <=", value, "money6");
            return (Criteria) this;
        }

        public Criteria andMoney6In(List<BigDecimal> values) {
            addCriterion("MONEY6 in", values, "money6");
            return (Criteria) this;
        }

        public Criteria andMoney6NotIn(List<BigDecimal> values) {
            addCriterion("MONEY6 not in", values, "money6");
            return (Criteria) this;
        }

        public Criteria andMoney6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY6 between", value1, value2, "money6");
            return (Criteria) this;
        }

        public Criteria andMoney6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY6 not between", value1, value2, "money6");
            return (Criteria) this;
        }

        public Criteria andCount6IsNull() {
            addCriterion("COUNT6 is null");
            return (Criteria) this;
        }

        public Criteria andCount6IsNotNull() {
            addCriterion("COUNT6 is not null");
            return (Criteria) this;
        }

        public Criteria andCount6EqualTo(Integer value) {
            addCriterion("COUNT6 =", value, "count6");
            return (Criteria) this;
        }

        public Criteria andCount6NotEqualTo(Integer value) {
            addCriterion("COUNT6 <>", value, "count6");
            return (Criteria) this;
        }

        public Criteria andCount6GreaterThan(Integer value) {
            addCriterion("COUNT6 >", value, "count6");
            return (Criteria) this;
        }

        public Criteria andCount6GreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT6 >=", value, "count6");
            return (Criteria) this;
        }

        public Criteria andCount6LessThan(Integer value) {
            addCriterion("COUNT6 <", value, "count6");
            return (Criteria) this;
        }

        public Criteria andCount6LessThanOrEqualTo(Integer value) {
            addCriterion("COUNT6 <=", value, "count6");
            return (Criteria) this;
        }

        public Criteria andCount6In(List<Integer> values) {
            addCriterion("COUNT6 in", values, "count6");
            return (Criteria) this;
        }

        public Criteria andCount6NotIn(List<Integer> values) {
            addCriterion("COUNT6 not in", values, "count6");
            return (Criteria) this;
        }

        public Criteria andCount6Between(Integer value1, Integer value2) {
            addCriterion("COUNT6 between", value1, value2, "count6");
            return (Criteria) this;
        }

        public Criteria andCount6NotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT6 not between", value1, value2, "count6");
            return (Criteria) this;
        }

        public Criteria andMoney7IsNull() {
            addCriterion("MONEY7 is null");
            return (Criteria) this;
        }

        public Criteria andMoney7IsNotNull() {
            addCriterion("MONEY7 is not null");
            return (Criteria) this;
        }

        public Criteria andMoney7EqualTo(BigDecimal value) {
            addCriterion("MONEY7 =", value, "money7");
            return (Criteria) this;
        }

        public Criteria andMoney7NotEqualTo(BigDecimal value) {
            addCriterion("MONEY7 <>", value, "money7");
            return (Criteria) this;
        }

        public Criteria andMoney7GreaterThan(BigDecimal value) {
            addCriterion("MONEY7 >", value, "money7");
            return (Criteria) this;
        }

        public Criteria andMoney7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY7 >=", value, "money7");
            return (Criteria) this;
        }

        public Criteria andMoney7LessThan(BigDecimal value) {
            addCriterion("MONEY7 <", value, "money7");
            return (Criteria) this;
        }

        public Criteria andMoney7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY7 <=", value, "money7");
            return (Criteria) this;
        }

        public Criteria andMoney7In(List<BigDecimal> values) {
            addCriterion("MONEY7 in", values, "money7");
            return (Criteria) this;
        }

        public Criteria andMoney7NotIn(List<BigDecimal> values) {
            addCriterion("MONEY7 not in", values, "money7");
            return (Criteria) this;
        }

        public Criteria andMoney7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY7 between", value1, value2, "money7");
            return (Criteria) this;
        }

        public Criteria andMoney7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY7 not between", value1, value2, "money7");
            return (Criteria) this;
        }

        public Criteria andCount7IsNull() {
            addCriterion("COUNT7 is null");
            return (Criteria) this;
        }

        public Criteria andCount7IsNotNull() {
            addCriterion("COUNT7 is not null");
            return (Criteria) this;
        }

        public Criteria andCount7EqualTo(Integer value) {
            addCriterion("COUNT7 =", value, "count7");
            return (Criteria) this;
        }

        public Criteria andCount7NotEqualTo(Integer value) {
            addCriterion("COUNT7 <>", value, "count7");
            return (Criteria) this;
        }

        public Criteria andCount7GreaterThan(Integer value) {
            addCriterion("COUNT7 >", value, "count7");
            return (Criteria) this;
        }

        public Criteria andCount7GreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT7 >=", value, "count7");
            return (Criteria) this;
        }

        public Criteria andCount7LessThan(Integer value) {
            addCriterion("COUNT7 <", value, "count7");
            return (Criteria) this;
        }

        public Criteria andCount7LessThanOrEqualTo(Integer value) {
            addCriterion("COUNT7 <=", value, "count7");
            return (Criteria) this;
        }

        public Criteria andCount7In(List<Integer> values) {
            addCriterion("COUNT7 in", values, "count7");
            return (Criteria) this;
        }

        public Criteria andCount7NotIn(List<Integer> values) {
            addCriterion("COUNT7 not in", values, "count7");
            return (Criteria) this;
        }

        public Criteria andCount7Between(Integer value1, Integer value2) {
            addCriterion("COUNT7 between", value1, value2, "count7");
            return (Criteria) this;
        }

        public Criteria andCount7NotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT7 not between", value1, value2, "count7");
            return (Criteria) this;
        }

        public Criteria andMoney8IsNull() {
            addCriterion("MONEY8 is null");
            return (Criteria) this;
        }

        public Criteria andMoney8IsNotNull() {
            addCriterion("MONEY8 is not null");
            return (Criteria) this;
        }

        public Criteria andMoney8EqualTo(BigDecimal value) {
            addCriterion("MONEY8 =", value, "money8");
            return (Criteria) this;
        }

        public Criteria andMoney8NotEqualTo(BigDecimal value) {
            addCriterion("MONEY8 <>", value, "money8");
            return (Criteria) this;
        }

        public Criteria andMoney8GreaterThan(BigDecimal value) {
            addCriterion("MONEY8 >", value, "money8");
            return (Criteria) this;
        }

        public Criteria andMoney8GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY8 >=", value, "money8");
            return (Criteria) this;
        }

        public Criteria andMoney8LessThan(BigDecimal value) {
            addCriterion("MONEY8 <", value, "money8");
            return (Criteria) this;
        }

        public Criteria andMoney8LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY8 <=", value, "money8");
            return (Criteria) this;
        }

        public Criteria andMoney8In(List<BigDecimal> values) {
            addCriterion("MONEY8 in", values, "money8");
            return (Criteria) this;
        }

        public Criteria andMoney8NotIn(List<BigDecimal> values) {
            addCriterion("MONEY8 not in", values, "money8");
            return (Criteria) this;
        }

        public Criteria andMoney8Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY8 between", value1, value2, "money8");
            return (Criteria) this;
        }

        public Criteria andMoney8NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY8 not between", value1, value2, "money8");
            return (Criteria) this;
        }

        public Criteria andCount8IsNull() {
            addCriterion("COUNT8 is null");
            return (Criteria) this;
        }

        public Criteria andCount8IsNotNull() {
            addCriterion("COUNT8 is not null");
            return (Criteria) this;
        }

        public Criteria andCount8EqualTo(Integer value) {
            addCriterion("COUNT8 =", value, "count8");
            return (Criteria) this;
        }

        public Criteria andCount8NotEqualTo(Integer value) {
            addCriterion("COUNT8 <>", value, "count8");
            return (Criteria) this;
        }

        public Criteria andCount8GreaterThan(Integer value) {
            addCriterion("COUNT8 >", value, "count8");
            return (Criteria) this;
        }

        public Criteria andCount8GreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT8 >=", value, "count8");
            return (Criteria) this;
        }

        public Criteria andCount8LessThan(Integer value) {
            addCriterion("COUNT8 <", value, "count8");
            return (Criteria) this;
        }

        public Criteria andCount8LessThanOrEqualTo(Integer value) {
            addCriterion("COUNT8 <=", value, "count8");
            return (Criteria) this;
        }

        public Criteria andCount8In(List<Integer> values) {
            addCriterion("COUNT8 in", values, "count8");
            return (Criteria) this;
        }

        public Criteria andCount8NotIn(List<Integer> values) {
            addCriterion("COUNT8 not in", values, "count8");
            return (Criteria) this;
        }

        public Criteria andCount8Between(Integer value1, Integer value2) {
            addCriterion("COUNT8 between", value1, value2, "count8");
            return (Criteria) this;
        }

        public Criteria andCount8NotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT8 not between", value1, value2, "count8");
            return (Criteria) this;
        }

        public Criteria andMoney9IsNull() {
            addCriterion("MONEY9 is null");
            return (Criteria) this;
        }

        public Criteria andMoney9IsNotNull() {
            addCriterion("MONEY9 is not null");
            return (Criteria) this;
        }

        public Criteria andMoney9EqualTo(BigDecimal value) {
            addCriterion("MONEY9 =", value, "money9");
            return (Criteria) this;
        }

        public Criteria andMoney9NotEqualTo(BigDecimal value) {
            addCriterion("MONEY9 <>", value, "money9");
            return (Criteria) this;
        }

        public Criteria andMoney9GreaterThan(BigDecimal value) {
            addCriterion("MONEY9 >", value, "money9");
            return (Criteria) this;
        }

        public Criteria andMoney9GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY9 >=", value, "money9");
            return (Criteria) this;
        }

        public Criteria andMoney9LessThan(BigDecimal value) {
            addCriterion("MONEY9 <", value, "money9");
            return (Criteria) this;
        }

        public Criteria andMoney9LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY9 <=", value, "money9");
            return (Criteria) this;
        }

        public Criteria andMoney9In(List<BigDecimal> values) {
            addCriterion("MONEY9 in", values, "money9");
            return (Criteria) this;
        }

        public Criteria andMoney9NotIn(List<BigDecimal> values) {
            addCriterion("MONEY9 not in", values, "money9");
            return (Criteria) this;
        }

        public Criteria andMoney9Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY9 between", value1, value2, "money9");
            return (Criteria) this;
        }

        public Criteria andMoney9NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY9 not between", value1, value2, "money9");
            return (Criteria) this;
        }

        public Criteria andCount9IsNull() {
            addCriterion("COUNT9 is null");
            return (Criteria) this;
        }

        public Criteria andCount9IsNotNull() {
            addCriterion("COUNT9 is not null");
            return (Criteria) this;
        }

        public Criteria andCount9EqualTo(Integer value) {
            addCriterion("COUNT9 =", value, "count9");
            return (Criteria) this;
        }

        public Criteria andCount9NotEqualTo(Integer value) {
            addCriterion("COUNT9 <>", value, "count9");
            return (Criteria) this;
        }

        public Criteria andCount9GreaterThan(Integer value) {
            addCriterion("COUNT9 >", value, "count9");
            return (Criteria) this;
        }

        public Criteria andCount9GreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT9 >=", value, "count9");
            return (Criteria) this;
        }

        public Criteria andCount9LessThan(Integer value) {
            addCriterion("COUNT9 <", value, "count9");
            return (Criteria) this;
        }

        public Criteria andCount9LessThanOrEqualTo(Integer value) {
            addCriterion("COUNT9 <=", value, "count9");
            return (Criteria) this;
        }

        public Criteria andCount9In(List<Integer> values) {
            addCriterion("COUNT9 in", values, "count9");
            return (Criteria) this;
        }

        public Criteria andCount9NotIn(List<Integer> values) {
            addCriterion("COUNT9 not in", values, "count9");
            return (Criteria) this;
        }

        public Criteria andCount9Between(Integer value1, Integer value2) {
            addCriterion("COUNT9 between", value1, value2, "count9");
            return (Criteria) this;
        }

        public Criteria andCount9NotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT9 not between", value1, value2, "count9");
            return (Criteria) this;
        }

        public Criteria andMoney10IsNull() {
            addCriterion("MONEY10 is null");
            return (Criteria) this;
        }

        public Criteria andMoney10IsNotNull() {
            addCriterion("MONEY10 is not null");
            return (Criteria) this;
        }

        public Criteria andMoney10EqualTo(BigDecimal value) {
            addCriterion("MONEY10 =", value, "money10");
            return (Criteria) this;
        }

        public Criteria andMoney10NotEqualTo(BigDecimal value) {
            addCriterion("MONEY10 <>", value, "money10");
            return (Criteria) this;
        }

        public Criteria andMoney10GreaterThan(BigDecimal value) {
            addCriterion("MONEY10 >", value, "money10");
            return (Criteria) this;
        }

        public Criteria andMoney10GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY10 >=", value, "money10");
            return (Criteria) this;
        }

        public Criteria andMoney10LessThan(BigDecimal value) {
            addCriterion("MONEY10 <", value, "money10");
            return (Criteria) this;
        }

        public Criteria andMoney10LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY10 <=", value, "money10");
            return (Criteria) this;
        }

        public Criteria andMoney10In(List<BigDecimal> values) {
            addCriterion("MONEY10 in", values, "money10");
            return (Criteria) this;
        }

        public Criteria andMoney10NotIn(List<BigDecimal> values) {
            addCriterion("MONEY10 not in", values, "money10");
            return (Criteria) this;
        }

        public Criteria andMoney10Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY10 between", value1, value2, "money10");
            return (Criteria) this;
        }

        public Criteria andMoney10NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY10 not between", value1, value2, "money10");
            return (Criteria) this;
        }

        public Criteria andCount10IsNull() {
            addCriterion("COUNT10 is null");
            return (Criteria) this;
        }

        public Criteria andCount10IsNotNull() {
            addCriterion("COUNT10 is not null");
            return (Criteria) this;
        }

        public Criteria andCount10EqualTo(Integer value) {
            addCriterion("COUNT10 =", value, "count10");
            return (Criteria) this;
        }

        public Criteria andCount10NotEqualTo(Integer value) {
            addCriterion("COUNT10 <>", value, "count10");
            return (Criteria) this;
        }

        public Criteria andCount10GreaterThan(Integer value) {
            addCriterion("COUNT10 >", value, "count10");
            return (Criteria) this;
        }

        public Criteria andCount10GreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT10 >=", value, "count10");
            return (Criteria) this;
        }

        public Criteria andCount10LessThan(Integer value) {
            addCriterion("COUNT10 <", value, "count10");
            return (Criteria) this;
        }

        public Criteria andCount10LessThanOrEqualTo(Integer value) {
            addCriterion("COUNT10 <=", value, "count10");
            return (Criteria) this;
        }

        public Criteria andCount10In(List<Integer> values) {
            addCriterion("COUNT10 in", values, "count10");
            return (Criteria) this;
        }

        public Criteria andCount10NotIn(List<Integer> values) {
            addCriterion("COUNT10 not in", values, "count10");
            return (Criteria) this;
        }

        public Criteria andCount10Between(Integer value1, Integer value2) {
            addCriterion("COUNT10 between", value1, value2, "count10");
            return (Criteria) this;
        }

        public Criteria andCount10NotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT10 not between", value1, value2, "count10");
            return (Criteria) this;
        }

        public Criteria andMoney11IsNull() {
            addCriterion("MONEY11 is null");
            return (Criteria) this;
        }

        public Criteria andMoney11IsNotNull() {
            addCriterion("MONEY11 is not null");
            return (Criteria) this;
        }

        public Criteria andMoney11EqualTo(BigDecimal value) {
            addCriterion("MONEY11 =", value, "money11");
            return (Criteria) this;
        }

        public Criteria andMoney11NotEqualTo(BigDecimal value) {
            addCriterion("MONEY11 <>", value, "money11");
            return (Criteria) this;
        }

        public Criteria andMoney11GreaterThan(BigDecimal value) {
            addCriterion("MONEY11 >", value, "money11");
            return (Criteria) this;
        }

        public Criteria andMoney11GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY11 >=", value, "money11");
            return (Criteria) this;
        }

        public Criteria andMoney11LessThan(BigDecimal value) {
            addCriterion("MONEY11 <", value, "money11");
            return (Criteria) this;
        }

        public Criteria andMoney11LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY11 <=", value, "money11");
            return (Criteria) this;
        }

        public Criteria andMoney11In(List<BigDecimal> values) {
            addCriterion("MONEY11 in", values, "money11");
            return (Criteria) this;
        }

        public Criteria andMoney11NotIn(List<BigDecimal> values) {
            addCriterion("MONEY11 not in", values, "money11");
            return (Criteria) this;
        }

        public Criteria andMoney11Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY11 between", value1, value2, "money11");
            return (Criteria) this;
        }

        public Criteria andMoney11NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY11 not between", value1, value2, "money11");
            return (Criteria) this;
        }

        public Criteria andCount11IsNull() {
            addCriterion("COUNT11 is null");
            return (Criteria) this;
        }

        public Criteria andCount11IsNotNull() {
            addCriterion("COUNT11 is not null");
            return (Criteria) this;
        }

        public Criteria andCount11EqualTo(Integer value) {
            addCriterion("COUNT11 =", value, "count11");
            return (Criteria) this;
        }

        public Criteria andCount11NotEqualTo(Integer value) {
            addCriterion("COUNT11 <>", value, "count11");
            return (Criteria) this;
        }

        public Criteria andCount11GreaterThan(Integer value) {
            addCriterion("COUNT11 >", value, "count11");
            return (Criteria) this;
        }

        public Criteria andCount11GreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT11 >=", value, "count11");
            return (Criteria) this;
        }

        public Criteria andCount11LessThan(Integer value) {
            addCriterion("COUNT11 <", value, "count11");
            return (Criteria) this;
        }

        public Criteria andCount11LessThanOrEqualTo(Integer value) {
            addCriterion("COUNT11 <=", value, "count11");
            return (Criteria) this;
        }

        public Criteria andCount11In(List<Integer> values) {
            addCriterion("COUNT11 in", values, "count11");
            return (Criteria) this;
        }

        public Criteria andCount11NotIn(List<Integer> values) {
            addCriterion("COUNT11 not in", values, "count11");
            return (Criteria) this;
        }

        public Criteria andCount11Between(Integer value1, Integer value2) {
            addCriterion("COUNT11 between", value1, value2, "count11");
            return (Criteria) this;
        }

        public Criteria andCount11NotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT11 not between", value1, value2, "count11");
            return (Criteria) this;
        }

        public Criteria andMoney12IsNull() {
            addCriterion("MONEY12 is null");
            return (Criteria) this;
        }

        public Criteria andMoney12IsNotNull() {
            addCriterion("MONEY12 is not null");
            return (Criteria) this;
        }

        public Criteria andMoney12EqualTo(BigDecimal value) {
            addCriterion("MONEY12 =", value, "money12");
            return (Criteria) this;
        }

        public Criteria andMoney12NotEqualTo(BigDecimal value) {
            addCriterion("MONEY12 <>", value, "money12");
            return (Criteria) this;
        }

        public Criteria andMoney12GreaterThan(BigDecimal value) {
            addCriterion("MONEY12 >", value, "money12");
            return (Criteria) this;
        }

        public Criteria andMoney12GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY12 >=", value, "money12");
            return (Criteria) this;
        }

        public Criteria andMoney12LessThan(BigDecimal value) {
            addCriterion("MONEY12 <", value, "money12");
            return (Criteria) this;
        }

        public Criteria andMoney12LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY12 <=", value, "money12");
            return (Criteria) this;
        }

        public Criteria andMoney12In(List<BigDecimal> values) {
            addCriterion("MONEY12 in", values, "money12");
            return (Criteria) this;
        }

        public Criteria andMoney12NotIn(List<BigDecimal> values) {
            addCriterion("MONEY12 not in", values, "money12");
            return (Criteria) this;
        }

        public Criteria andMoney12Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY12 between", value1, value2, "money12");
            return (Criteria) this;
        }

        public Criteria andMoney12NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY12 not between", value1, value2, "money12");
            return (Criteria) this;
        }

        public Criteria andCount12IsNull() {
            addCriterion("COUNT12 is null");
            return (Criteria) this;
        }

        public Criteria andCount12IsNotNull() {
            addCriterion("COUNT12 is not null");
            return (Criteria) this;
        }

        public Criteria andCount12EqualTo(Integer value) {
            addCriterion("COUNT12 =", value, "count12");
            return (Criteria) this;
        }

        public Criteria andCount12NotEqualTo(Integer value) {
            addCriterion("COUNT12 <>", value, "count12");
            return (Criteria) this;
        }

        public Criteria andCount12GreaterThan(Integer value) {
            addCriterion("COUNT12 >", value, "count12");
            return (Criteria) this;
        }

        public Criteria andCount12GreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT12 >=", value, "count12");
            return (Criteria) this;
        }

        public Criteria andCount12LessThan(Integer value) {
            addCriterion("COUNT12 <", value, "count12");
            return (Criteria) this;
        }

        public Criteria andCount12LessThanOrEqualTo(Integer value) {
            addCriterion("COUNT12 <=", value, "count12");
            return (Criteria) this;
        }

        public Criteria andCount12In(List<Integer> values) {
            addCriterion("COUNT12 in", values, "count12");
            return (Criteria) this;
        }

        public Criteria andCount12NotIn(List<Integer> values) {
            addCriterion("COUNT12 not in", values, "count12");
            return (Criteria) this;
        }

        public Criteria andCount12Between(Integer value1, Integer value2) {
            addCriterion("COUNT12 between", value1, value2, "count12");
            return (Criteria) this;
        }

        public Criteria andCount12NotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT12 not between", value1, value2, "count12");
            return (Criteria) this;
        }

        public Criteria andMoney13IsNull() {
            addCriterion("MONEY13 is null");
            return (Criteria) this;
        }

        public Criteria andMoney13IsNotNull() {
            addCriterion("MONEY13 is not null");
            return (Criteria) this;
        }

        public Criteria andMoney13EqualTo(BigDecimal value) {
            addCriterion("MONEY13 =", value, "money13");
            return (Criteria) this;
        }

        public Criteria andMoney13NotEqualTo(BigDecimal value) {
            addCriterion("MONEY13 <>", value, "money13");
            return (Criteria) this;
        }

        public Criteria andMoney13GreaterThan(BigDecimal value) {
            addCriterion("MONEY13 >", value, "money13");
            return (Criteria) this;
        }

        public Criteria andMoney13GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY13 >=", value, "money13");
            return (Criteria) this;
        }

        public Criteria andMoney13LessThan(BigDecimal value) {
            addCriterion("MONEY13 <", value, "money13");
            return (Criteria) this;
        }

        public Criteria andMoney13LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY13 <=", value, "money13");
            return (Criteria) this;
        }

        public Criteria andMoney13In(List<BigDecimal> values) {
            addCriterion("MONEY13 in", values, "money13");
            return (Criteria) this;
        }

        public Criteria andMoney13NotIn(List<BigDecimal> values) {
            addCriterion("MONEY13 not in", values, "money13");
            return (Criteria) this;
        }

        public Criteria andMoney13Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY13 between", value1, value2, "money13");
            return (Criteria) this;
        }

        public Criteria andMoney13NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY13 not between", value1, value2, "money13");
            return (Criteria) this;
        }

        public Criteria andCount13IsNull() {
            addCriterion("COUNT13 is null");
            return (Criteria) this;
        }

        public Criteria andCount13IsNotNull() {
            addCriterion("COUNT13 is not null");
            return (Criteria) this;
        }

        public Criteria andCount13EqualTo(Integer value) {
            addCriterion("COUNT13 =", value, "count13");
            return (Criteria) this;
        }

        public Criteria andCount13NotEqualTo(Integer value) {
            addCriterion("COUNT13 <>", value, "count13");
            return (Criteria) this;
        }

        public Criteria andCount13GreaterThan(Integer value) {
            addCriterion("COUNT13 >", value, "count13");
            return (Criteria) this;
        }

        public Criteria andCount13GreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT13 >=", value, "count13");
            return (Criteria) this;
        }

        public Criteria andCount13LessThan(Integer value) {
            addCriterion("COUNT13 <", value, "count13");
            return (Criteria) this;
        }

        public Criteria andCount13LessThanOrEqualTo(Integer value) {
            addCriterion("COUNT13 <=", value, "count13");
            return (Criteria) this;
        }

        public Criteria andCount13In(List<Integer> values) {
            addCriterion("COUNT13 in", values, "count13");
            return (Criteria) this;
        }

        public Criteria andCount13NotIn(List<Integer> values) {
            addCriterion("COUNT13 not in", values, "count13");
            return (Criteria) this;
        }

        public Criteria andCount13Between(Integer value1, Integer value2) {
            addCriterion("COUNT13 between", value1, value2, "count13");
            return (Criteria) this;
        }

        public Criteria andCount13NotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT13 not between", value1, value2, "count13");
            return (Criteria) this;
        }

        public Criteria andMoney14IsNull() {
            addCriterion("MONEY14 is null");
            return (Criteria) this;
        }

        public Criteria andMoney14IsNotNull() {
            addCriterion("MONEY14 is not null");
            return (Criteria) this;
        }

        public Criteria andMoney14EqualTo(BigDecimal value) {
            addCriterion("MONEY14 =", value, "money14");
            return (Criteria) this;
        }

        public Criteria andMoney14NotEqualTo(BigDecimal value) {
            addCriterion("MONEY14 <>", value, "money14");
            return (Criteria) this;
        }

        public Criteria andMoney14GreaterThan(BigDecimal value) {
            addCriterion("MONEY14 >", value, "money14");
            return (Criteria) this;
        }

        public Criteria andMoney14GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY14 >=", value, "money14");
            return (Criteria) this;
        }

        public Criteria andMoney14LessThan(BigDecimal value) {
            addCriterion("MONEY14 <", value, "money14");
            return (Criteria) this;
        }

        public Criteria andMoney14LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY14 <=", value, "money14");
            return (Criteria) this;
        }

        public Criteria andMoney14In(List<BigDecimal> values) {
            addCriterion("MONEY14 in", values, "money14");
            return (Criteria) this;
        }

        public Criteria andMoney14NotIn(List<BigDecimal> values) {
            addCriterion("MONEY14 not in", values, "money14");
            return (Criteria) this;
        }

        public Criteria andMoney14Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY14 between", value1, value2, "money14");
            return (Criteria) this;
        }

        public Criteria andMoney14NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY14 not between", value1, value2, "money14");
            return (Criteria) this;
        }

        public Criteria andCount14IsNull() {
            addCriterion("COUNT14 is null");
            return (Criteria) this;
        }

        public Criteria andCount14IsNotNull() {
            addCriterion("COUNT14 is not null");
            return (Criteria) this;
        }

        public Criteria andCount14EqualTo(Integer value) {
            addCriterion("COUNT14 =", value, "count14");
            return (Criteria) this;
        }

        public Criteria andCount14NotEqualTo(Integer value) {
            addCriterion("COUNT14 <>", value, "count14");
            return (Criteria) this;
        }

        public Criteria andCount14GreaterThan(Integer value) {
            addCriterion("COUNT14 >", value, "count14");
            return (Criteria) this;
        }

        public Criteria andCount14GreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT14 >=", value, "count14");
            return (Criteria) this;
        }

        public Criteria andCount14LessThan(Integer value) {
            addCriterion("COUNT14 <", value, "count14");
            return (Criteria) this;
        }

        public Criteria andCount14LessThanOrEqualTo(Integer value) {
            addCriterion("COUNT14 <=", value, "count14");
            return (Criteria) this;
        }

        public Criteria andCount14In(List<Integer> values) {
            addCriterion("COUNT14 in", values, "count14");
            return (Criteria) this;
        }

        public Criteria andCount14NotIn(List<Integer> values) {
            addCriterion("COUNT14 not in", values, "count14");
            return (Criteria) this;
        }

        public Criteria andCount14Between(Integer value1, Integer value2) {
            addCriterion("COUNT14 between", value1, value2, "count14");
            return (Criteria) this;
        }

        public Criteria andCount14NotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT14 not between", value1, value2, "count14");
            return (Criteria) this;
        }

        public Criteria andMoney15IsNull() {
            addCriterion("MONEY15 is null");
            return (Criteria) this;
        }

        public Criteria andMoney15IsNotNull() {
            addCriterion("MONEY15 is not null");
            return (Criteria) this;
        }

        public Criteria andMoney15EqualTo(BigDecimal value) {
            addCriterion("MONEY15 =", value, "money15");
            return (Criteria) this;
        }

        public Criteria andMoney15NotEqualTo(BigDecimal value) {
            addCriterion("MONEY15 <>", value, "money15");
            return (Criteria) this;
        }

        public Criteria andMoney15GreaterThan(BigDecimal value) {
            addCriterion("MONEY15 >", value, "money15");
            return (Criteria) this;
        }

        public Criteria andMoney15GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY15 >=", value, "money15");
            return (Criteria) this;
        }

        public Criteria andMoney15LessThan(BigDecimal value) {
            addCriterion("MONEY15 <", value, "money15");
            return (Criteria) this;
        }

        public Criteria andMoney15LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY15 <=", value, "money15");
            return (Criteria) this;
        }

        public Criteria andMoney15In(List<BigDecimal> values) {
            addCriterion("MONEY15 in", values, "money15");
            return (Criteria) this;
        }

        public Criteria andMoney15NotIn(List<BigDecimal> values) {
            addCriterion("MONEY15 not in", values, "money15");
            return (Criteria) this;
        }

        public Criteria andMoney15Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY15 between", value1, value2, "money15");
            return (Criteria) this;
        }

        public Criteria andMoney15NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY15 not between", value1, value2, "money15");
            return (Criteria) this;
        }

        public Criteria andCount15IsNull() {
            addCriterion("COUNT15 is null");
            return (Criteria) this;
        }

        public Criteria andCount15IsNotNull() {
            addCriterion("COUNT15 is not null");
            return (Criteria) this;
        }

        public Criteria andCount15EqualTo(Integer value) {
            addCriterion("COUNT15 =", value, "count15");
            return (Criteria) this;
        }

        public Criteria andCount15NotEqualTo(Integer value) {
            addCriterion("COUNT15 <>", value, "count15");
            return (Criteria) this;
        }

        public Criteria andCount15GreaterThan(Integer value) {
            addCriterion("COUNT15 >", value, "count15");
            return (Criteria) this;
        }

        public Criteria andCount15GreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT15 >=", value, "count15");
            return (Criteria) this;
        }

        public Criteria andCount15LessThan(Integer value) {
            addCriterion("COUNT15 <", value, "count15");
            return (Criteria) this;
        }

        public Criteria andCount15LessThanOrEqualTo(Integer value) {
            addCriterion("COUNT15 <=", value, "count15");
            return (Criteria) this;
        }

        public Criteria andCount15In(List<Integer> values) {
            addCriterion("COUNT15 in", values, "count15");
            return (Criteria) this;
        }

        public Criteria andCount15NotIn(List<Integer> values) {
            addCriterion("COUNT15 not in", values, "count15");
            return (Criteria) this;
        }

        public Criteria andCount15Between(Integer value1, Integer value2) {
            addCriterion("COUNT15 between", value1, value2, "count15");
            return (Criteria) this;
        }

        public Criteria andCount15NotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT15 not between", value1, value2, "count15");
            return (Criteria) this;
        }

        public Criteria andMoney16IsNull() {
            addCriterion("MONEY16 is null");
            return (Criteria) this;
        }

        public Criteria andMoney16IsNotNull() {
            addCriterion("MONEY16 is not null");
            return (Criteria) this;
        }

        public Criteria andMoney16EqualTo(BigDecimal value) {
            addCriterion("MONEY16 =", value, "money16");
            return (Criteria) this;
        }

        public Criteria andMoney16NotEqualTo(BigDecimal value) {
            addCriterion("MONEY16 <>", value, "money16");
            return (Criteria) this;
        }

        public Criteria andMoney16GreaterThan(BigDecimal value) {
            addCriterion("MONEY16 >", value, "money16");
            return (Criteria) this;
        }

        public Criteria andMoney16GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY16 >=", value, "money16");
            return (Criteria) this;
        }

        public Criteria andMoney16LessThan(BigDecimal value) {
            addCriterion("MONEY16 <", value, "money16");
            return (Criteria) this;
        }

        public Criteria andMoney16LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY16 <=", value, "money16");
            return (Criteria) this;
        }

        public Criteria andMoney16In(List<BigDecimal> values) {
            addCriterion("MONEY16 in", values, "money16");
            return (Criteria) this;
        }

        public Criteria andMoney16NotIn(List<BigDecimal> values) {
            addCriterion("MONEY16 not in", values, "money16");
            return (Criteria) this;
        }

        public Criteria andMoney16Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY16 between", value1, value2, "money16");
            return (Criteria) this;
        }

        public Criteria andMoney16NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY16 not between", value1, value2, "money16");
            return (Criteria) this;
        }

        public Criteria andCount16IsNull() {
            addCriterion("COUNT16 is null");
            return (Criteria) this;
        }

        public Criteria andCount16IsNotNull() {
            addCriterion("COUNT16 is not null");
            return (Criteria) this;
        }

        public Criteria andCount16EqualTo(Integer value) {
            addCriterion("COUNT16 =", value, "count16");
            return (Criteria) this;
        }

        public Criteria andCount16NotEqualTo(Integer value) {
            addCriterion("COUNT16 <>", value, "count16");
            return (Criteria) this;
        }

        public Criteria andCount16GreaterThan(Integer value) {
            addCriterion("COUNT16 >", value, "count16");
            return (Criteria) this;
        }

        public Criteria andCount16GreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT16 >=", value, "count16");
            return (Criteria) this;
        }

        public Criteria andCount16LessThan(Integer value) {
            addCriterion("COUNT16 <", value, "count16");
            return (Criteria) this;
        }

        public Criteria andCount16LessThanOrEqualTo(Integer value) {
            addCriterion("COUNT16 <=", value, "count16");
            return (Criteria) this;
        }

        public Criteria andCount16In(List<Integer> values) {
            addCriterion("COUNT16 in", values, "count16");
            return (Criteria) this;
        }

        public Criteria andCount16NotIn(List<Integer> values) {
            addCriterion("COUNT16 not in", values, "count16");
            return (Criteria) this;
        }

        public Criteria andCount16Between(Integer value1, Integer value2) {
            addCriterion("COUNT16 between", value1, value2, "count16");
            return (Criteria) this;
        }

        public Criteria andCount16NotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT16 not between", value1, value2, "count16");
            return (Criteria) this;
        }

        public Criteria andMoney17IsNull() {
            addCriterion("MONEY17 is null");
            return (Criteria) this;
        }

        public Criteria andMoney17IsNotNull() {
            addCriterion("MONEY17 is not null");
            return (Criteria) this;
        }

        public Criteria andMoney17EqualTo(BigDecimal value) {
            addCriterion("MONEY17 =", value, "money17");
            return (Criteria) this;
        }

        public Criteria andMoney17NotEqualTo(BigDecimal value) {
            addCriterion("MONEY17 <>", value, "money17");
            return (Criteria) this;
        }

        public Criteria andMoney17GreaterThan(BigDecimal value) {
            addCriterion("MONEY17 >", value, "money17");
            return (Criteria) this;
        }

        public Criteria andMoney17GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY17 >=", value, "money17");
            return (Criteria) this;
        }

        public Criteria andMoney17LessThan(BigDecimal value) {
            addCriterion("MONEY17 <", value, "money17");
            return (Criteria) this;
        }

        public Criteria andMoney17LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY17 <=", value, "money17");
            return (Criteria) this;
        }

        public Criteria andMoney17In(List<BigDecimal> values) {
            addCriterion("MONEY17 in", values, "money17");
            return (Criteria) this;
        }

        public Criteria andMoney17NotIn(List<BigDecimal> values) {
            addCriterion("MONEY17 not in", values, "money17");
            return (Criteria) this;
        }

        public Criteria andMoney17Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY17 between", value1, value2, "money17");
            return (Criteria) this;
        }

        public Criteria andMoney17NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY17 not between", value1, value2, "money17");
            return (Criteria) this;
        }

        public Criteria andCount17IsNull() {
            addCriterion("COUNT17 is null");
            return (Criteria) this;
        }

        public Criteria andCount17IsNotNull() {
            addCriterion("COUNT17 is not null");
            return (Criteria) this;
        }

        public Criteria andCount17EqualTo(Integer value) {
            addCriterion("COUNT17 =", value, "count17");
            return (Criteria) this;
        }

        public Criteria andCount17NotEqualTo(Integer value) {
            addCriterion("COUNT17 <>", value, "count17");
            return (Criteria) this;
        }

        public Criteria andCount17GreaterThan(Integer value) {
            addCriterion("COUNT17 >", value, "count17");
            return (Criteria) this;
        }

        public Criteria andCount17GreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT17 >=", value, "count17");
            return (Criteria) this;
        }

        public Criteria andCount17LessThan(Integer value) {
            addCriterion("COUNT17 <", value, "count17");
            return (Criteria) this;
        }

        public Criteria andCount17LessThanOrEqualTo(Integer value) {
            addCriterion("COUNT17 <=", value, "count17");
            return (Criteria) this;
        }

        public Criteria andCount17In(List<Integer> values) {
            addCriterion("COUNT17 in", values, "count17");
            return (Criteria) this;
        }

        public Criteria andCount17NotIn(List<Integer> values) {
            addCriterion("COUNT17 not in", values, "count17");
            return (Criteria) this;
        }

        public Criteria andCount17Between(Integer value1, Integer value2) {
            addCriterion("COUNT17 between", value1, value2, "count17");
            return (Criteria) this;
        }

        public Criteria andCount17NotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT17 not between", value1, value2, "count17");
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
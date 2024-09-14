package com.zhouzz.pojo;

import java.util.ArrayList;
import java.util.List;

public class HuisbankMesgSignExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HuisbankMesgSignExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCustNoIsNull() {
            addCriterion("CUST_NO is null");
            return (Criteria) this;
        }

        public Criteria andCustNoIsNotNull() {
            addCriterion("CUST_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCustNoEqualTo(String value) {
            addCriterion("CUST_NO =", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotEqualTo(String value) {
            addCriterion("CUST_NO <>", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoGreaterThan(String value) {
            addCriterion("CUST_NO >", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_NO >=", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoLessThan(String value) {
            addCriterion("CUST_NO <", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoLessThanOrEqualTo(String value) {
            addCriterion("CUST_NO <=", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoLike(String value) {
            addCriterion("CUST_NO like", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotLike(String value) {
            addCriterion("CUST_NO not like", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoIn(List<String> values) {
            addCriterion("CUST_NO in", values, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotIn(List<String> values) {
            addCriterion("CUST_NO not in", values, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoBetween(String value1, String value2) {
            addCriterion("CUST_NO between", value1, value2, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotBetween(String value1, String value2) {
            addCriterion("CUST_NO not between", value1, value2, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNull() {
            addCriterion("CUST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("CUST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("CUST_NAME =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("CUST_NAME <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("CUST_NAME >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_NAME >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("CUST_NAME <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("CUST_NAME <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("CUST_NAME like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("CUST_NAME not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("CUST_NAME in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("CUST_NAME not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("CUST_NAME between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("CUST_NAME not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustBrchNoIsNull() {
            addCriterion("CUST_BRCH_NO is null");
            return (Criteria) this;
        }

        public Criteria andCustBrchNoIsNotNull() {
            addCriterion("CUST_BRCH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCustBrchNoEqualTo(String value) {
            addCriterion("CUST_BRCH_NO =", value, "custBrchNo");
            return (Criteria) this;
        }

        public Criteria andCustBrchNoNotEqualTo(String value) {
            addCriterion("CUST_BRCH_NO <>", value, "custBrchNo");
            return (Criteria) this;
        }

        public Criteria andCustBrchNoGreaterThan(String value) {
            addCriterion("CUST_BRCH_NO >", value, "custBrchNo");
            return (Criteria) this;
        }

        public Criteria andCustBrchNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_BRCH_NO >=", value, "custBrchNo");
            return (Criteria) this;
        }

        public Criteria andCustBrchNoLessThan(String value) {
            addCriterion("CUST_BRCH_NO <", value, "custBrchNo");
            return (Criteria) this;
        }

        public Criteria andCustBrchNoLessThanOrEqualTo(String value) {
            addCriterion("CUST_BRCH_NO <=", value, "custBrchNo");
            return (Criteria) this;
        }

        public Criteria andCustBrchNoLike(String value) {
            addCriterion("CUST_BRCH_NO like", value, "custBrchNo");
            return (Criteria) this;
        }

        public Criteria andCustBrchNoNotLike(String value) {
            addCriterion("CUST_BRCH_NO not like", value, "custBrchNo");
            return (Criteria) this;
        }

        public Criteria andCustBrchNoIn(List<String> values) {
            addCriterion("CUST_BRCH_NO in", values, "custBrchNo");
            return (Criteria) this;
        }

        public Criteria andCustBrchNoNotIn(List<String> values) {
            addCriterion("CUST_BRCH_NO not in", values, "custBrchNo");
            return (Criteria) this;
        }

        public Criteria andCustBrchNoBetween(String value1, String value2) {
            addCriterion("CUST_BRCH_NO between", value1, value2, "custBrchNo");
            return (Criteria) this;
        }

        public Criteria andCustBrchNoNotBetween(String value1, String value2) {
            addCriterion("CUST_BRCH_NO not between", value1, value2, "custBrchNo");
            return (Criteria) this;
        }

        public Criteria andOperPersonIsNull() {
            addCriterion("OPER_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andOperPersonIsNotNull() {
            addCriterion("OPER_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andOperPersonEqualTo(String value) {
            addCriterion("OPER_PERSON =", value, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonNotEqualTo(String value) {
            addCriterion("OPER_PERSON <>", value, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonGreaterThan(String value) {
            addCriterion("OPER_PERSON >", value, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonGreaterThanOrEqualTo(String value) {
            addCriterion("OPER_PERSON >=", value, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonLessThan(String value) {
            addCriterion("OPER_PERSON <", value, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonLessThanOrEqualTo(String value) {
            addCriterion("OPER_PERSON <=", value, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonLike(String value) {
            addCriterion("OPER_PERSON like", value, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonNotLike(String value) {
            addCriterion("OPER_PERSON not like", value, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonIn(List<String> values) {
            addCriterion("OPER_PERSON in", values, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonNotIn(List<String> values) {
            addCriterion("OPER_PERSON not in", values, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonBetween(String value1, String value2) {
            addCriterion("OPER_PERSON between", value1, value2, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonNotBetween(String value1, String value2) {
            addCriterion("OPER_PERSON not between", value1, value2, "operPerson");
            return (Criteria) this;
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

        public Criteria andCustAcctNameIsNull() {
            addCriterion("CUST_ACCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustAcctNameIsNotNull() {
            addCriterion("CUST_ACCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustAcctNameEqualTo(String value) {
            addCriterion("CUST_ACCT_NAME =", value, "custAcctName");
            return (Criteria) this;
        }

        public Criteria andCustAcctNameNotEqualTo(String value) {
            addCriterion("CUST_ACCT_NAME <>", value, "custAcctName");
            return (Criteria) this;
        }

        public Criteria andCustAcctNameGreaterThan(String value) {
            addCriterion("CUST_ACCT_NAME >", value, "custAcctName");
            return (Criteria) this;
        }

        public Criteria andCustAcctNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_ACCT_NAME >=", value, "custAcctName");
            return (Criteria) this;
        }

        public Criteria andCustAcctNameLessThan(String value) {
            addCriterion("CUST_ACCT_NAME <", value, "custAcctName");
            return (Criteria) this;
        }

        public Criteria andCustAcctNameLessThanOrEqualTo(String value) {
            addCriterion("CUST_ACCT_NAME <=", value, "custAcctName");
            return (Criteria) this;
        }

        public Criteria andCustAcctNameLike(String value) {
            addCriterion("CUST_ACCT_NAME like", value, "custAcctName");
            return (Criteria) this;
        }

        public Criteria andCustAcctNameNotLike(String value) {
            addCriterion("CUST_ACCT_NAME not like", value, "custAcctName");
            return (Criteria) this;
        }

        public Criteria andCustAcctNameIn(List<String> values) {
            addCriterion("CUST_ACCT_NAME in", values, "custAcctName");
            return (Criteria) this;
        }

        public Criteria andCustAcctNameNotIn(List<String> values) {
            addCriterion("CUST_ACCT_NAME not in", values, "custAcctName");
            return (Criteria) this;
        }

        public Criteria andCustAcctNameBetween(String value1, String value2) {
            addCriterion("CUST_ACCT_NAME between", value1, value2, "custAcctName");
            return (Criteria) this;
        }

        public Criteria andCustAcctNameNotBetween(String value1, String value2) {
            addCriterion("CUST_ACCT_NAME not between", value1, value2, "custAcctName");
            return (Criteria) this;
        }

        public Criteria andSignBrchNoIsNull() {
            addCriterion("SIGN_BRCH_NO is null");
            return (Criteria) this;
        }

        public Criteria andSignBrchNoIsNotNull() {
            addCriterion("SIGN_BRCH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSignBrchNoEqualTo(String value) {
            addCriterion("SIGN_BRCH_NO =", value, "signBrchNo");
            return (Criteria) this;
        }

        public Criteria andSignBrchNoNotEqualTo(String value) {
            addCriterion("SIGN_BRCH_NO <>", value, "signBrchNo");
            return (Criteria) this;
        }

        public Criteria andSignBrchNoGreaterThan(String value) {
            addCriterion("SIGN_BRCH_NO >", value, "signBrchNo");
            return (Criteria) this;
        }

        public Criteria andSignBrchNoGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_BRCH_NO >=", value, "signBrchNo");
            return (Criteria) this;
        }

        public Criteria andSignBrchNoLessThan(String value) {
            addCriterion("SIGN_BRCH_NO <", value, "signBrchNo");
            return (Criteria) this;
        }

        public Criteria andSignBrchNoLessThanOrEqualTo(String value) {
            addCriterion("SIGN_BRCH_NO <=", value, "signBrchNo");
            return (Criteria) this;
        }

        public Criteria andSignBrchNoLike(String value) {
            addCriterion("SIGN_BRCH_NO like", value, "signBrchNo");
            return (Criteria) this;
        }

        public Criteria andSignBrchNoNotLike(String value) {
            addCriterion("SIGN_BRCH_NO not like", value, "signBrchNo");
            return (Criteria) this;
        }

        public Criteria andSignBrchNoIn(List<String> values) {
            addCriterion("SIGN_BRCH_NO in", values, "signBrchNo");
            return (Criteria) this;
        }

        public Criteria andSignBrchNoNotIn(List<String> values) {
            addCriterion("SIGN_BRCH_NO not in", values, "signBrchNo");
            return (Criteria) this;
        }

        public Criteria andSignBrchNoBetween(String value1, String value2) {
            addCriterion("SIGN_BRCH_NO between", value1, value2, "signBrchNo");
            return (Criteria) this;
        }

        public Criteria andSignBrchNoNotBetween(String value1, String value2) {
            addCriterion("SIGN_BRCH_NO not between", value1, value2, "signBrchNo");
            return (Criteria) this;
        }

        public Criteria andSignBankNameIsNull() {
            addCriterion("SIGN_BANK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSignBankNameIsNotNull() {
            addCriterion("SIGN_BANK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSignBankNameEqualTo(String value) {
            addCriterion("SIGN_BANK_NAME =", value, "signBankName");
            return (Criteria) this;
        }

        public Criteria andSignBankNameNotEqualTo(String value) {
            addCriterion("SIGN_BANK_NAME <>", value, "signBankName");
            return (Criteria) this;
        }

        public Criteria andSignBankNameGreaterThan(String value) {
            addCriterion("SIGN_BANK_NAME >", value, "signBankName");
            return (Criteria) this;
        }

        public Criteria andSignBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_BANK_NAME >=", value, "signBankName");
            return (Criteria) this;
        }

        public Criteria andSignBankNameLessThan(String value) {
            addCriterion("SIGN_BANK_NAME <", value, "signBankName");
            return (Criteria) this;
        }

        public Criteria andSignBankNameLessThanOrEqualTo(String value) {
            addCriterion("SIGN_BANK_NAME <=", value, "signBankName");
            return (Criteria) this;
        }

        public Criteria andSignBankNameLike(String value) {
            addCriterion("SIGN_BANK_NAME like", value, "signBankName");
            return (Criteria) this;
        }

        public Criteria andSignBankNameNotLike(String value) {
            addCriterion("SIGN_BANK_NAME not like", value, "signBankName");
            return (Criteria) this;
        }

        public Criteria andSignBankNameIn(List<String> values) {
            addCriterion("SIGN_BANK_NAME in", values, "signBankName");
            return (Criteria) this;
        }

        public Criteria andSignBankNameNotIn(List<String> values) {
            addCriterion("SIGN_BANK_NAME not in", values, "signBankName");
            return (Criteria) this;
        }

        public Criteria andSignBankNameBetween(String value1, String value2) {
            addCriterion("SIGN_BANK_NAME between", value1, value2, "signBankName");
            return (Criteria) this;
        }

        public Criteria andSignBankNameNotBetween(String value1, String value2) {
            addCriterion("SIGN_BANK_NAME not between", value1, value2, "signBankName");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNull() {
            addCriterion("REMARK1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("REMARK1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("REMARK1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("REMARK1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("REMARK1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("REMARK1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("REMARK1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("REMARK1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("REMARK1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("REMARK1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("REMARK1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("REMARK1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("REMARK1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("REMARK1 not between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNull() {
            addCriterion("REMARK2 is null");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNotNull() {
            addCriterion("REMARK2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark2EqualTo(String value) {
            addCriterion("REMARK2 =", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotEqualTo(String value) {
            addCriterion("REMARK2 <>", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThan(String value) {
            addCriterion("REMARK2 >", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("REMARK2 >=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThan(String value) {
            addCriterion("REMARK2 <", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThanOrEqualTo(String value) {
            addCriterion("REMARK2 <=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Like(String value) {
            addCriterion("REMARK2 like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotLike(String value) {
            addCriterion("REMARK2 not like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2In(List<String> values) {
            addCriterion("REMARK2 in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotIn(List<String> values) {
            addCriterion("REMARK2 not in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Between(String value1, String value2) {
            addCriterion("REMARK2 between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotBetween(String value1, String value2) {
            addCriterion("REMARK2 not between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("AUDIT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("AUDIT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(String value) {
            addCriterion("AUDIT_STATUS =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(String value) {
            addCriterion("AUDIT_STATUS <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(String value) {
            addCriterion("AUDIT_STATUS >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_STATUS >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(String value) {
            addCriterion("AUDIT_STATUS <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_STATUS <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLike(String value) {
            addCriterion("AUDIT_STATUS like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotLike(String value) {
            addCriterion("AUDIT_STATUS not like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<String> values) {
            addCriterion("AUDIT_STATUS in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<String> values) {
            addCriterion("AUDIT_STATUS not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(String value1, String value2) {
            addCriterion("AUDIT_STATUS between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(String value1, String value2) {
            addCriterion("AUDIT_STATUS not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusIsNull() {
            addCriterion("SIGN_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSignStatusIsNotNull() {
            addCriterion("SIGN_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSignStatusEqualTo(String value) {
            addCriterion("SIGN_STATUS =", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusNotEqualTo(String value) {
            addCriterion("SIGN_STATUS <>", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusGreaterThan(String value) {
            addCriterion("SIGN_STATUS >", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_STATUS >=", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusLessThan(String value) {
            addCriterion("SIGN_STATUS <", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusLessThanOrEqualTo(String value) {
            addCriterion("SIGN_STATUS <=", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusLike(String value) {
            addCriterion("SIGN_STATUS like", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusNotLike(String value) {
            addCriterion("SIGN_STATUS not like", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusIn(List<String> values) {
            addCriterion("SIGN_STATUS in", values, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusNotIn(List<String> values) {
            addCriterion("SIGN_STATUS not in", values, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusBetween(String value1, String value2) {
            addCriterion("SIGN_STATUS between", value1, value2, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusNotBetween(String value1, String value2) {
            addCriterion("SIGN_STATUS not between", value1, value2, "signStatus");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Long value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Long value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Long value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Long value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Long> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Long> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("FLAG =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("FLAG <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("FLAG >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("FLAG >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("FLAG <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("FLAG <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("FLAG like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("FLAG not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("FLAG in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("FLAG not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("FLAG between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("FLAG not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andReserve1IsNull() {
            addCriterion("RESERVE1 is null");
            return (Criteria) this;
        }

        public Criteria andReserve1IsNotNull() {
            addCriterion("RESERVE1 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve1EqualTo(String value) {
            addCriterion("RESERVE1 =", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotEqualTo(String value) {
            addCriterion("RESERVE1 <>", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1GreaterThan(String value) {
            addCriterion("RESERVE1 >", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVE1 >=", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1LessThan(String value) {
            addCriterion("RESERVE1 <", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1LessThanOrEqualTo(String value) {
            addCriterion("RESERVE1 <=", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1Like(String value) {
            addCriterion("RESERVE1 like", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotLike(String value) {
            addCriterion("RESERVE1 not like", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1In(List<String> values) {
            addCriterion("RESERVE1 in", values, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotIn(List<String> values) {
            addCriterion("RESERVE1 not in", values, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1Between(String value1, String value2) {
            addCriterion("RESERVE1 between", value1, value2, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotBetween(String value1, String value2) {
            addCriterion("RESERVE1 not between", value1, value2, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve2IsNull() {
            addCriterion("RESERVE2 is null");
            return (Criteria) this;
        }

        public Criteria andReserve2IsNotNull() {
            addCriterion("RESERVE2 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve2EqualTo(String value) {
            addCriterion("RESERVE2 =", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotEqualTo(String value) {
            addCriterion("RESERVE2 <>", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2GreaterThan(String value) {
            addCriterion("RESERVE2 >", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVE2 >=", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2LessThan(String value) {
            addCriterion("RESERVE2 <", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2LessThanOrEqualTo(String value) {
            addCriterion("RESERVE2 <=", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2Like(String value) {
            addCriterion("RESERVE2 like", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotLike(String value) {
            addCriterion("RESERVE2 not like", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2In(List<String> values) {
            addCriterion("RESERVE2 in", values, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotIn(List<String> values) {
            addCriterion("RESERVE2 not in", values, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2Between(String value1, String value2) {
            addCriterion("RESERVE2 between", value1, value2, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotBetween(String value1, String value2) {
            addCriterion("RESERVE2 not between", value1, value2, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve3IsNull() {
            addCriterion("RESERVE3 is null");
            return (Criteria) this;
        }

        public Criteria andReserve3IsNotNull() {
            addCriterion("RESERVE3 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve3EqualTo(String value) {
            addCriterion("RESERVE3 =", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotEqualTo(String value) {
            addCriterion("RESERVE3 <>", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3GreaterThan(String value) {
            addCriterion("RESERVE3 >", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVE3 >=", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3LessThan(String value) {
            addCriterion("RESERVE3 <", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3LessThanOrEqualTo(String value) {
            addCriterion("RESERVE3 <=", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3Like(String value) {
            addCriterion("RESERVE3 like", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotLike(String value) {
            addCriterion("RESERVE3 not like", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3In(List<String> values) {
            addCriterion("RESERVE3 in", values, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotIn(List<String> values) {
            addCriterion("RESERVE3 not in", values, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3Between(String value1, String value2) {
            addCriterion("RESERVE3 between", value1, value2, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotBetween(String value1, String value2) {
            addCriterion("RESERVE3 not between", value1, value2, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve4IsNull() {
            addCriterion("RESERVE4 is null");
            return (Criteria) this;
        }

        public Criteria andReserve4IsNotNull() {
            addCriterion("RESERVE4 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve4EqualTo(String value) {
            addCriterion("RESERVE4 =", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4NotEqualTo(String value) {
            addCriterion("RESERVE4 <>", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4GreaterThan(String value) {
            addCriterion("RESERVE4 >", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVE4 >=", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4LessThan(String value) {
            addCriterion("RESERVE4 <", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4LessThanOrEqualTo(String value) {
            addCriterion("RESERVE4 <=", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4Like(String value) {
            addCriterion("RESERVE4 like", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4NotLike(String value) {
            addCriterion("RESERVE4 not like", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4In(List<String> values) {
            addCriterion("RESERVE4 in", values, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4NotIn(List<String> values) {
            addCriterion("RESERVE4 not in", values, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4Between(String value1, String value2) {
            addCriterion("RESERVE4 between", value1, value2, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4NotBetween(String value1, String value2) {
            addCriterion("RESERVE4 not between", value1, value2, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve5IsNull() {
            addCriterion("RESERVE5 is null");
            return (Criteria) this;
        }

        public Criteria andReserve5IsNotNull() {
            addCriterion("RESERVE5 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve5EqualTo(String value) {
            addCriterion("RESERVE5 =", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5NotEqualTo(String value) {
            addCriterion("RESERVE5 <>", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5GreaterThan(String value) {
            addCriterion("RESERVE5 >", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVE5 >=", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5LessThan(String value) {
            addCriterion("RESERVE5 <", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5LessThanOrEqualTo(String value) {
            addCriterion("RESERVE5 <=", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5Like(String value) {
            addCriterion("RESERVE5 like", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5NotLike(String value) {
            addCriterion("RESERVE5 not like", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5In(List<String> values) {
            addCriterion("RESERVE5 in", values, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5NotIn(List<String> values) {
            addCriterion("RESERVE5 not in", values, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5Between(String value1, String value2) {
            addCriterion("RESERVE5 between", value1, value2, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5NotBetween(String value1, String value2) {
            addCriterion("RESERVE5 not between", value1, value2, "reserve5");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIsNull() {
            addCriterion("PHONE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIsNotNull() {
            addCriterion("PHONE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumEqualTo(String value) {
            addCriterion("PHONE_NUM =", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotEqualTo(String value) {
            addCriterion("PHONE_NUM <>", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThan(String value) {
            addCriterion("PHONE_NUM >", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE_NUM >=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThan(String value) {
            addCriterion("PHONE_NUM <", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThanOrEqualTo(String value) {
            addCriterion("PHONE_NUM <=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLike(String value) {
            addCriterion("PHONE_NUM like", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotLike(String value) {
            addCriterion("PHONE_NUM not like", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIn(List<String> values) {
            addCriterion("PHONE_NUM in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotIn(List<String> values) {
            addCriterion("PHONE_NUM not in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumBetween(String value1, String value2) {
            addCriterion("PHONE_NUM between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotBetween(String value1, String value2) {
            addCriterion("PHONE_NUM not between", value1, value2, "phoneNum");
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
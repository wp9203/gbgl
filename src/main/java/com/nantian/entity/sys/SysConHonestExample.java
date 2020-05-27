package com.nantian.entity.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysConHonestExample {
    /**
     * 排序条件
     */
    protected String orderByClause;

    /**
     * 是否distinct
     */
    protected boolean distinct;

    /**
     * 条件集合
     */
    protected List<Criteria> oredCriteria;

    /**
     * 构造器 
     */
    public SysConHonestExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 设置 排序条件
     * @param orderByClause 排序条件
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 获取 排序条件
     * @return 排序条件
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 设置 是否distinct
     * @param distinct 是否distinct
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 获取 是否distinct
     * @return 是否distinct
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 获取 所有条件规则
     * @return 所有条件规则
     */
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

        public Criteria andCandidateNameIsNull() {
            addCriterion("CANDIDATE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCandidateNameIsNotNull() {
            addCriterion("CANDIDATE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCandidateNameEqualTo(String value) {
            addCriterion("CANDIDATE_NAME =", value, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameNotEqualTo(String value) {
            addCriterion("CANDIDATE_NAME <>", value, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameGreaterThan(String value) {
            addCriterion("CANDIDATE_NAME >", value, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameGreaterThanOrEqualTo(String value) {
            addCriterion("CANDIDATE_NAME >=", value, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameLessThan(String value) {
            addCriterion("CANDIDATE_NAME <", value, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameLessThanOrEqualTo(String value) {
            addCriterion("CANDIDATE_NAME <=", value, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameLike(String value) {
            addCriterion("CANDIDATE_NAME like", value, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameNotLike(String value) {
            addCriterion("CANDIDATE_NAME not like", value, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameIn(List<String> values) {
            addCriterion("CANDIDATE_NAME in", values, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameNotIn(List<String> values) {
            addCriterion("CANDIDATE_NAME not in", values, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameBetween(String value1, String value2) {
            addCriterion("CANDIDATE_NAME between", value1, value2, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameNotBetween(String value1, String value2) {
            addCriterion("CANDIDATE_NAME not between", value1, value2, "candidateName");
            return (Criteria) this;
        }

        public Criteria andConversationDateIsNull() {
            addCriterion("CONVERSATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andConversationDateIsNotNull() {
            addCriterion("CONVERSATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andConversationDateEqualTo(Date value) {
            addCriterion("CONVERSATION_DATE =", value, "conversationDate");
            return (Criteria) this;
        }

        public Criteria andConversationDateNotEqualTo(Date value) {
            addCriterion("CONVERSATION_DATE <>", value, "conversationDate");
            return (Criteria) this;
        }

        public Criteria andConversationDateGreaterThan(Date value) {
            addCriterion("CONVERSATION_DATE >", value, "conversationDate");
            return (Criteria) this;
        }

        public Criteria andConversationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CONVERSATION_DATE >=", value, "conversationDate");
            return (Criteria) this;
        }

        public Criteria andConversationDateLessThan(Date value) {
            addCriterion("CONVERSATION_DATE <", value, "conversationDate");
            return (Criteria) this;
        }

        public Criteria andConversationDateLessThanOrEqualTo(Date value) {
            addCriterion("CONVERSATION_DATE <=", value, "conversationDate");
            return (Criteria) this;
        }

        public Criteria andConversationDateIn(List<Date> values) {
            addCriterion("CONVERSATION_DATE in", values, "conversationDate");
            return (Criteria) this;
        }

        public Criteria andConversationDateNotIn(List<Date> values) {
            addCriterion("CONVERSATION_DATE not in", values, "conversationDate");
            return (Criteria) this;
        }

        public Criteria andConversationDateBetween(Date value1, Date value2) {
            addCriterion("CONVERSATION_DATE between", value1, value2, "conversationDate");
            return (Criteria) this;
        }

        public Criteria andConversationDateNotBetween(Date value1, Date value2) {
            addCriterion("CONVERSATION_DATE not between", value1, value2, "conversationDate");
            return (Criteria) this;
        }

        public Criteria andConversationPersonIsNull() {
            addCriterion("CONVERSATION_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andConversationPersonIsNotNull() {
            addCriterion("CONVERSATION_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andConversationPersonEqualTo(String value) {
            addCriterion("CONVERSATION_PERSON =", value, "conversationPerson");
            return (Criteria) this;
        }

        public Criteria andConversationPersonNotEqualTo(String value) {
            addCriterion("CONVERSATION_PERSON <>", value, "conversationPerson");
            return (Criteria) this;
        }

        public Criteria andConversationPersonGreaterThan(String value) {
            addCriterion("CONVERSATION_PERSON >", value, "conversationPerson");
            return (Criteria) this;
        }

        public Criteria andConversationPersonGreaterThanOrEqualTo(String value) {
            addCriterion("CONVERSATION_PERSON >=", value, "conversationPerson");
            return (Criteria) this;
        }

        public Criteria andConversationPersonLessThan(String value) {
            addCriterion("CONVERSATION_PERSON <", value, "conversationPerson");
            return (Criteria) this;
        }

        public Criteria andConversationPersonLessThanOrEqualTo(String value) {
            addCriterion("CONVERSATION_PERSON <=", value, "conversationPerson");
            return (Criteria) this;
        }

        public Criteria andConversationPersonLike(String value) {
            addCriterion("CONVERSATION_PERSON like", value, "conversationPerson");
            return (Criteria) this;
        }

        public Criteria andConversationPersonNotLike(String value) {
            addCriterion("CONVERSATION_PERSON not like", value, "conversationPerson");
            return (Criteria) this;
        }

        public Criteria andConversationPersonIn(List<String> values) {
            addCriterion("CONVERSATION_PERSON in", values, "conversationPerson");
            return (Criteria) this;
        }

        public Criteria andConversationPersonNotIn(List<String> values) {
            addCriterion("CONVERSATION_PERSON not in", values, "conversationPerson");
            return (Criteria) this;
        }

        public Criteria andConversationPersonBetween(String value1, String value2) {
            addCriterion("CONVERSATION_PERSON between", value1, value2, "conversationPerson");
            return (Criteria) this;
        }

        public Criteria andConversationPersonNotBetween(String value1, String value2) {
            addCriterion("CONVERSATION_PERSON not between", value1, value2, "conversationPerson");
            return (Criteria) this;
        }

        public Criteria andConversationDataIsNull() {
            addCriterion("CONVERSATION_DATA is null");
            return (Criteria) this;
        }

        public Criteria andConversationDataIsNotNull() {
            addCriterion("CONVERSATION_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andConversationDataEqualTo(String value) {
            addCriterion("CONVERSATION_DATA =", value, "conversationData");
            return (Criteria) this;
        }

        public Criteria andConversationDataNotEqualTo(String value) {
            addCriterion("CONVERSATION_DATA <>", value, "conversationData");
            return (Criteria) this;
        }

        public Criteria andConversationDataGreaterThan(String value) {
            addCriterion("CONVERSATION_DATA >", value, "conversationData");
            return (Criteria) this;
        }

        public Criteria andConversationDataGreaterThanOrEqualTo(String value) {
            addCriterion("CONVERSATION_DATA >=", value, "conversationData");
            return (Criteria) this;
        }

        public Criteria andConversationDataLessThan(String value) {
            addCriterion("CONVERSATION_DATA <", value, "conversationData");
            return (Criteria) this;
        }

        public Criteria andConversationDataLessThanOrEqualTo(String value) {
            addCriterion("CONVERSATION_DATA <=", value, "conversationData");
            return (Criteria) this;
        }

        public Criteria andConversationDataLike(String value) {
            addCriterion("CONVERSATION_DATA like", value, "conversationData");
            return (Criteria) this;
        }

        public Criteria andConversationDataNotLike(String value) {
            addCriterion("CONVERSATION_DATA not like", value, "conversationData");
            return (Criteria) this;
        }

        public Criteria andConversationDataIn(List<String> values) {
            addCriterion("CONVERSATION_DATA in", values, "conversationData");
            return (Criteria) this;
        }

        public Criteria andConversationDataNotIn(List<String> values) {
            addCriterion("CONVERSATION_DATA not in", values, "conversationData");
            return (Criteria) this;
        }

        public Criteria andConversationDataBetween(String value1, String value2) {
            addCriterion("CONVERSATION_DATA between", value1, value2, "conversationData");
            return (Criteria) this;
        }

        public Criteria andConversationDataNotBetween(String value1, String value2) {
            addCriterion("CONVERSATION_DATA not between", value1, value2, "conversationData");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNull() {
            addCriterion("CREATION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNotNull() {
            addCriterion("CREATION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeEqualTo(Date value) {
            addCriterion("CREATION_TIME =", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotEqualTo(Date value) {
            addCriterion("CREATION_TIME <>", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThan(Date value) {
            addCriterion("CREATION_TIME >", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATION_TIME >=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThan(Date value) {
            addCriterion("CREATION_TIME <", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATION_TIME <=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIn(List<Date> values) {
            addCriterion("CREATION_TIME in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotIn(List<Date> values) {
            addCriterion("CREATION_TIME not in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeBetween(Date value1, Date value2) {
            addCriterion("CREATION_TIME between", value1, value2, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATION_TIME not between", value1, value2, "creationTime");
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

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
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
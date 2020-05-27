package com.nantian.entity.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysPubBeforeInOfficeExample {
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
    public SysPubBeforeInOfficeExample() {
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

        public Criteria andUnitIsNull() {
            addCriterion("UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("UNIT like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("UNIT not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("UNIT not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andPublicStartTimeIsNull() {
            addCriterion("PUBLIC_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPublicStartTimeIsNotNull() {
            addCriterion("PUBLIC_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPublicStartTimeEqualTo(Date value) {
            addCriterion("PUBLIC_START_TIME =", value, "publicStartTime");
            return (Criteria) this;
        }

        public Criteria andPublicStartTimeNotEqualTo(Date value) {
            addCriterion("PUBLIC_START_TIME <>", value, "publicStartTime");
            return (Criteria) this;
        }

        public Criteria andPublicStartTimeGreaterThan(Date value) {
            addCriterion("PUBLIC_START_TIME >", value, "publicStartTime");
            return (Criteria) this;
        }

        public Criteria andPublicStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PUBLIC_START_TIME >=", value, "publicStartTime");
            return (Criteria) this;
        }

        public Criteria andPublicStartTimeLessThan(Date value) {
            addCriterion("PUBLIC_START_TIME <", value, "publicStartTime");
            return (Criteria) this;
        }

        public Criteria andPublicStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("PUBLIC_START_TIME <=", value, "publicStartTime");
            return (Criteria) this;
        }

        public Criteria andPublicStartTimeIn(List<Date> values) {
            addCriterion("PUBLIC_START_TIME in", values, "publicStartTime");
            return (Criteria) this;
        }

        public Criteria andPublicStartTimeNotIn(List<Date> values) {
            addCriterion("PUBLIC_START_TIME not in", values, "publicStartTime");
            return (Criteria) this;
        }

        public Criteria andPublicStartTimeBetween(Date value1, Date value2) {
            addCriterion("PUBLIC_START_TIME between", value1, value2, "publicStartTime");
            return (Criteria) this;
        }

        public Criteria andPublicStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("PUBLIC_START_TIME not between", value1, value2, "publicStartTime");
            return (Criteria) this;
        }

        public Criteria andPublicEndTimeIsNull() {
            addCriterion("PUBLIC_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPublicEndTimeIsNotNull() {
            addCriterion("PUBLIC_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPublicEndTimeEqualTo(Date value) {
            addCriterion("PUBLIC_END_TIME =", value, "publicEndTime");
            return (Criteria) this;
        }

        public Criteria andPublicEndTimeNotEqualTo(Date value) {
            addCriterion("PUBLIC_END_TIME <>", value, "publicEndTime");
            return (Criteria) this;
        }

        public Criteria andPublicEndTimeGreaterThan(Date value) {
            addCriterion("PUBLIC_END_TIME >", value, "publicEndTime");
            return (Criteria) this;
        }

        public Criteria andPublicEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PUBLIC_END_TIME >=", value, "publicEndTime");
            return (Criteria) this;
        }

        public Criteria andPublicEndTimeLessThan(Date value) {
            addCriterion("PUBLIC_END_TIME <", value, "publicEndTime");
            return (Criteria) this;
        }

        public Criteria andPublicEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("PUBLIC_END_TIME <=", value, "publicEndTime");
            return (Criteria) this;
        }

        public Criteria andPublicEndTimeIn(List<Date> values) {
            addCriterion("PUBLIC_END_TIME in", values, "publicEndTime");
            return (Criteria) this;
        }

        public Criteria andPublicEndTimeNotIn(List<Date> values) {
            addCriterion("PUBLIC_END_TIME not in", values, "publicEndTime");
            return (Criteria) this;
        }

        public Criteria andPublicEndTimeBetween(Date value1, Date value2) {
            addCriterion("PUBLIC_END_TIME between", value1, value2, "publicEndTime");
            return (Criteria) this;
        }

        public Criteria andPublicEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("PUBLIC_END_TIME not between", value1, value2, "publicEndTime");
            return (Criteria) this;
        }

        public Criteria andPublicTypeIsNull() {
            addCriterion("PUBLIC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPublicTypeIsNotNull() {
            addCriterion("PUBLIC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPublicTypeEqualTo(String value) {
            addCriterion("PUBLIC_TYPE =", value, "publicType");
            return (Criteria) this;
        }

        public Criteria andPublicTypeNotEqualTo(String value) {
            addCriterion("PUBLIC_TYPE <>", value, "publicType");
            return (Criteria) this;
        }

        public Criteria andPublicTypeGreaterThan(String value) {
            addCriterion("PUBLIC_TYPE >", value, "publicType");
            return (Criteria) this;
        }

        public Criteria andPublicTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PUBLIC_TYPE >=", value, "publicType");
            return (Criteria) this;
        }

        public Criteria andPublicTypeLessThan(String value) {
            addCriterion("PUBLIC_TYPE <", value, "publicType");
            return (Criteria) this;
        }

        public Criteria andPublicTypeLessThanOrEqualTo(String value) {
            addCriterion("PUBLIC_TYPE <=", value, "publicType");
            return (Criteria) this;
        }

        public Criteria andPublicTypeLike(String value) {
            addCriterion("PUBLIC_TYPE like", value, "publicType");
            return (Criteria) this;
        }

        public Criteria andPublicTypeNotLike(String value) {
            addCriterion("PUBLIC_TYPE not like", value, "publicType");
            return (Criteria) this;
        }

        public Criteria andPublicTypeIn(List<String> values) {
            addCriterion("PUBLIC_TYPE in", values, "publicType");
            return (Criteria) this;
        }

        public Criteria andPublicTypeNotIn(List<String> values) {
            addCriterion("PUBLIC_TYPE not in", values, "publicType");
            return (Criteria) this;
        }

        public Criteria andPublicTypeBetween(String value1, String value2) {
            addCriterion("PUBLIC_TYPE between", value1, value2, "publicType");
            return (Criteria) this;
        }

        public Criteria andPublicTypeNotBetween(String value1, String value2) {
            addCriterion("PUBLIC_TYPE not between", value1, value2, "publicType");
            return (Criteria) this;
        }

        public Criteria andPublicResultIsNull() {
            addCriterion("PUBLIC_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andPublicResultIsNotNull() {
            addCriterion("PUBLIC_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andPublicResultEqualTo(String value) {
            addCriterion("PUBLIC_RESULT =", value, "publicResult");
            return (Criteria) this;
        }

        public Criteria andPublicResultNotEqualTo(String value) {
            addCriterion("PUBLIC_RESULT <>", value, "publicResult");
            return (Criteria) this;
        }

        public Criteria andPublicResultGreaterThan(String value) {
            addCriterion("PUBLIC_RESULT >", value, "publicResult");
            return (Criteria) this;
        }

        public Criteria andPublicResultGreaterThanOrEqualTo(String value) {
            addCriterion("PUBLIC_RESULT >=", value, "publicResult");
            return (Criteria) this;
        }

        public Criteria andPublicResultLessThan(String value) {
            addCriterion("PUBLIC_RESULT <", value, "publicResult");
            return (Criteria) this;
        }

        public Criteria andPublicResultLessThanOrEqualTo(String value) {
            addCriterion("PUBLIC_RESULT <=", value, "publicResult");
            return (Criteria) this;
        }

        public Criteria andPublicResultLike(String value) {
            addCriterion("PUBLIC_RESULT like", value, "publicResult");
            return (Criteria) this;
        }

        public Criteria andPublicResultNotLike(String value) {
            addCriterion("PUBLIC_RESULT not like", value, "publicResult");
            return (Criteria) this;
        }

        public Criteria andPublicResultIn(List<String> values) {
            addCriterion("PUBLIC_RESULT in", values, "publicResult");
            return (Criteria) this;
        }

        public Criteria andPublicResultNotIn(List<String> values) {
            addCriterion("PUBLIC_RESULT not in", values, "publicResult");
            return (Criteria) this;
        }

        public Criteria andPublicResultBetween(String value1, String value2) {
            addCriterion("PUBLIC_RESULT between", value1, value2, "publicResult");
            return (Criteria) this;
        }

        public Criteria andPublicResultNotBetween(String value1, String value2) {
            addCriterion("PUBLIC_RESULT not between", value1, value2, "publicResult");
            return (Criteria) this;
        }

        public Criteria andPublicDataIsNull() {
            addCriterion("PUBLIC_DATA is null");
            return (Criteria) this;
        }

        public Criteria andPublicDataIsNotNull() {
            addCriterion("PUBLIC_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andPublicDataEqualTo(String value) {
            addCriterion("PUBLIC_DATA =", value, "publicData");
            return (Criteria) this;
        }

        public Criteria andPublicDataNotEqualTo(String value) {
            addCriterion("PUBLIC_DATA <>", value, "publicData");
            return (Criteria) this;
        }

        public Criteria andPublicDataGreaterThan(String value) {
            addCriterion("PUBLIC_DATA >", value, "publicData");
            return (Criteria) this;
        }

        public Criteria andPublicDataGreaterThanOrEqualTo(String value) {
            addCriterion("PUBLIC_DATA >=", value, "publicData");
            return (Criteria) this;
        }

        public Criteria andPublicDataLessThan(String value) {
            addCriterion("PUBLIC_DATA <", value, "publicData");
            return (Criteria) this;
        }

        public Criteria andPublicDataLessThanOrEqualTo(String value) {
            addCriterion("PUBLIC_DATA <=", value, "publicData");
            return (Criteria) this;
        }

        public Criteria andPublicDataLike(String value) {
            addCriterion("PUBLIC_DATA like", value, "publicData");
            return (Criteria) this;
        }

        public Criteria andPublicDataNotLike(String value) {
            addCriterion("PUBLIC_DATA not like", value, "publicData");
            return (Criteria) this;
        }

        public Criteria andPublicDataIn(List<String> values) {
            addCriterion("PUBLIC_DATA in", values, "publicData");
            return (Criteria) this;
        }

        public Criteria andPublicDataNotIn(List<String> values) {
            addCriterion("PUBLIC_DATA not in", values, "publicData");
            return (Criteria) this;
        }

        public Criteria andPublicDataBetween(String value1, String value2) {
            addCriterion("PUBLIC_DATA between", value1, value2, "publicData");
            return (Criteria) this;
        }

        public Criteria andPublicDataNotBetween(String value1, String value2) {
            addCriterion("PUBLIC_DATA not between", value1, value2, "publicData");
            return (Criteria) this;
        }

        public Criteria andPublicProVerConIsNull() {
            addCriterion("PUBLIC_PRO_VER_CON is null");
            return (Criteria) this;
        }

        public Criteria andPublicProVerConIsNotNull() {
            addCriterion("PUBLIC_PRO_VER_CON is not null");
            return (Criteria) this;
        }

        public Criteria andPublicProVerConEqualTo(String value) {
            addCriterion("PUBLIC_PRO_VER_CON =", value, "publicProVerCon");
            return (Criteria) this;
        }

        public Criteria andPublicProVerConNotEqualTo(String value) {
            addCriterion("PUBLIC_PRO_VER_CON <>", value, "publicProVerCon");
            return (Criteria) this;
        }

        public Criteria andPublicProVerConGreaterThan(String value) {
            addCriterion("PUBLIC_PRO_VER_CON >", value, "publicProVerCon");
            return (Criteria) this;
        }

        public Criteria andPublicProVerConGreaterThanOrEqualTo(String value) {
            addCriterion("PUBLIC_PRO_VER_CON >=", value, "publicProVerCon");
            return (Criteria) this;
        }

        public Criteria andPublicProVerConLessThan(String value) {
            addCriterion("PUBLIC_PRO_VER_CON <", value, "publicProVerCon");
            return (Criteria) this;
        }

        public Criteria andPublicProVerConLessThanOrEqualTo(String value) {
            addCriterion("PUBLIC_PRO_VER_CON <=", value, "publicProVerCon");
            return (Criteria) this;
        }

        public Criteria andPublicProVerConLike(String value) {
            addCriterion("PUBLIC_PRO_VER_CON like", value, "publicProVerCon");
            return (Criteria) this;
        }

        public Criteria andPublicProVerConNotLike(String value) {
            addCriterion("PUBLIC_PRO_VER_CON not like", value, "publicProVerCon");
            return (Criteria) this;
        }

        public Criteria andPublicProVerConIn(List<String> values) {
            addCriterion("PUBLIC_PRO_VER_CON in", values, "publicProVerCon");
            return (Criteria) this;
        }

        public Criteria andPublicProVerConNotIn(List<String> values) {
            addCriterion("PUBLIC_PRO_VER_CON not in", values, "publicProVerCon");
            return (Criteria) this;
        }

        public Criteria andPublicProVerConBetween(String value1, String value2) {
            addCriterion("PUBLIC_PRO_VER_CON between", value1, value2, "publicProVerCon");
            return (Criteria) this;
        }

        public Criteria andPublicProVerConNotBetween(String value1, String value2) {
            addCriterion("PUBLIC_PRO_VER_CON not between", value1, value2, "publicProVerCon");
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

        public Criteria andProstionRecuperativeIsNull() {
            addCriterion("PROSTION_RECUPERATIVE is null");
            return (Criteria) this;
        }

        public Criteria andProstionRecuperativeIsNotNull() {
            addCriterion("PROSTION_RECUPERATIVE is not null");
            return (Criteria) this;
        }

        public Criteria andProstionRecuperativeEqualTo(String value) {
            addCriterion("PROSTION_RECUPERATIVE =", value, "prostionRecuperative");
            return (Criteria) this;
        }

        public Criteria andProstionRecuperativeNotEqualTo(String value) {
            addCriterion("PROSTION_RECUPERATIVE <>", value, "prostionRecuperative");
            return (Criteria) this;
        }

        public Criteria andProstionRecuperativeGreaterThan(String value) {
            addCriterion("PROSTION_RECUPERATIVE >", value, "prostionRecuperative");
            return (Criteria) this;
        }

        public Criteria andProstionRecuperativeGreaterThanOrEqualTo(String value) {
            addCriterion("PROSTION_RECUPERATIVE >=", value, "prostionRecuperative");
            return (Criteria) this;
        }

        public Criteria andProstionRecuperativeLessThan(String value) {
            addCriterion("PROSTION_RECUPERATIVE <", value, "prostionRecuperative");
            return (Criteria) this;
        }

        public Criteria andProstionRecuperativeLessThanOrEqualTo(String value) {
            addCriterion("PROSTION_RECUPERATIVE <=", value, "prostionRecuperative");
            return (Criteria) this;
        }

        public Criteria andProstionRecuperativeLike(String value) {
            addCriterion("PROSTION_RECUPERATIVE like", value, "prostionRecuperative");
            return (Criteria) this;
        }

        public Criteria andProstionRecuperativeNotLike(String value) {
            addCriterion("PROSTION_RECUPERATIVE not like", value, "prostionRecuperative");
            return (Criteria) this;
        }

        public Criteria andProstionRecuperativeIn(List<String> values) {
            addCriterion("PROSTION_RECUPERATIVE in", values, "prostionRecuperative");
            return (Criteria) this;
        }

        public Criteria andProstionRecuperativeNotIn(List<String> values) {
            addCriterion("PROSTION_RECUPERATIVE not in", values, "prostionRecuperative");
            return (Criteria) this;
        }

        public Criteria andProstionRecuperativeBetween(String value1, String value2) {
            addCriterion("PROSTION_RECUPERATIVE between", value1, value2, "prostionRecuperative");
            return (Criteria) this;
        }

        public Criteria andProstionRecuperativeNotBetween(String value1, String value2) {
            addCriterion("PROSTION_RECUPERATIVE not between", value1, value2, "prostionRecuperative");
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
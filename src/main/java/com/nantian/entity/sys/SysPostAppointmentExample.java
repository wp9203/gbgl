package com.nantian.entity.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SysPostAppointmentExample {
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
    public SysPostAppointmentExample() {
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

        public Criteria andPositionIsNull() {
            addCriterion("POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("POSITION =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("POSITION <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("POSITION >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("POSITION <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("POSITION <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("POSITION like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("POSITION not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("POSITION in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("POSITION not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("POSITION between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("POSITION not between", value1, value2, "position");
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

        public Criteria andNewPositionIsNull() {
            addCriterion("NEW_POSITION is null");
            return (Criteria) this;
        }

        public Criteria andNewPositionIsNotNull() {
            addCriterion("NEW_POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andNewPositionEqualTo(String value) {
            addCriterion("NEW_POSITION =", value, "newPosition");
            return (Criteria) this;
        }

        public Criteria andNewPositionNotEqualTo(String value) {
            addCriterion("NEW_POSITION <>", value, "newPosition");
            return (Criteria) this;
        }

        public Criteria andNewPositionGreaterThan(String value) {
            addCriterion("NEW_POSITION >", value, "newPosition");
            return (Criteria) this;
        }

        public Criteria andNewPositionGreaterThanOrEqualTo(String value) {
            addCriterion("NEW_POSITION >=", value, "newPosition");
            return (Criteria) this;
        }

        public Criteria andNewPositionLessThan(String value) {
            addCriterion("NEW_POSITION <", value, "newPosition");
            return (Criteria) this;
        }

        public Criteria andNewPositionLessThanOrEqualTo(String value) {
            addCriterion("NEW_POSITION <=", value, "newPosition");
            return (Criteria) this;
        }

        public Criteria andNewPositionLike(String value) {
            addCriterion("NEW_POSITION like", value, "newPosition");
            return (Criteria) this;
        }

        public Criteria andNewPositionNotLike(String value) {
            addCriterion("NEW_POSITION not like", value, "newPosition");
            return (Criteria) this;
        }

        public Criteria andNewPositionIn(List<String> values) {
            addCriterion("NEW_POSITION in", values, "newPosition");
            return (Criteria) this;
        }

        public Criteria andNewPositionNotIn(List<String> values) {
            addCriterion("NEW_POSITION not in", values, "newPosition");
            return (Criteria) this;
        }

        public Criteria andNewPositionBetween(String value1, String value2) {
            addCriterion("NEW_POSITION between", value1, value2, "newPosition");
            return (Criteria) this;
        }

        public Criteria andNewPositionNotBetween(String value1, String value2) {
            addCriterion("NEW_POSITION not between", value1, value2, "newPosition");
            return (Criteria) this;
        }

        public Criteria andNewUnitIsNull() {
            addCriterion("NEW_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andNewUnitIsNotNull() {
            addCriterion("NEW_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andNewUnitEqualTo(String value) {
            addCriterion("NEW_UNIT =", value, "newUnit");
            return (Criteria) this;
        }

        public Criteria andNewUnitNotEqualTo(String value) {
            addCriterion("NEW_UNIT <>", value, "newUnit");
            return (Criteria) this;
        }

        public Criteria andNewUnitGreaterThan(String value) {
            addCriterion("NEW_UNIT >", value, "newUnit");
            return (Criteria) this;
        }

        public Criteria andNewUnitGreaterThanOrEqualTo(String value) {
            addCriterion("NEW_UNIT >=", value, "newUnit");
            return (Criteria) this;
        }

        public Criteria andNewUnitLessThan(String value) {
            addCriterion("NEW_UNIT <", value, "newUnit");
            return (Criteria) this;
        }

        public Criteria andNewUnitLessThanOrEqualTo(String value) {
            addCriterion("NEW_UNIT <=", value, "newUnit");
            return (Criteria) this;
        }

        public Criteria andNewUnitLike(String value) {
            addCriterion("NEW_UNIT like", value, "newUnit");
            return (Criteria) this;
        }

        public Criteria andNewUnitNotLike(String value) {
            addCriterion("NEW_UNIT not like", value, "newUnit");
            return (Criteria) this;
        }

        public Criteria andNewUnitIn(List<String> values) {
            addCriterion("NEW_UNIT in", values, "newUnit");
            return (Criteria) this;
        }

        public Criteria andNewUnitNotIn(List<String> values) {
            addCriterion("NEW_UNIT not in", values, "newUnit");
            return (Criteria) this;
        }

        public Criteria andNewUnitBetween(String value1, String value2) {
            addCriterion("NEW_UNIT between", value1, value2, "newUnit");
            return (Criteria) this;
        }

        public Criteria andNewUnitNotBetween(String value1, String value2) {
            addCriterion("NEW_UNIT not between", value1, value2, "newUnit");
            return (Criteria) this;
        }

        public Criteria andAppointmentNumberIsNull() {
            addCriterion("APPOINTMENT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentNumberIsNotNull() {
            addCriterion("APPOINTMENT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentNumberEqualTo(String value) {
            addCriterion("APPOINTMENT_NUMBER =", value, "appointmentNumber");
            return (Criteria) this;
        }

        public Criteria andAppointmentNumberNotEqualTo(String value) {
            addCriterion("APPOINTMENT_NUMBER <>", value, "appointmentNumber");
            return (Criteria) this;
        }

        public Criteria andAppointmentNumberGreaterThan(String value) {
            addCriterion("APPOINTMENT_NUMBER >", value, "appointmentNumber");
            return (Criteria) this;
        }

        public Criteria andAppointmentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("APPOINTMENT_NUMBER >=", value, "appointmentNumber");
            return (Criteria) this;
        }

        public Criteria andAppointmentNumberLessThan(String value) {
            addCriterion("APPOINTMENT_NUMBER <", value, "appointmentNumber");
            return (Criteria) this;
        }

        public Criteria andAppointmentNumberLessThanOrEqualTo(String value) {
            addCriterion("APPOINTMENT_NUMBER <=", value, "appointmentNumber");
            return (Criteria) this;
        }

        public Criteria andAppointmentNumberLike(String value) {
            addCriterion("APPOINTMENT_NUMBER like", value, "appointmentNumber");
            return (Criteria) this;
        }

        public Criteria andAppointmentNumberNotLike(String value) {
            addCriterion("APPOINTMENT_NUMBER not like", value, "appointmentNumber");
            return (Criteria) this;
        }

        public Criteria andAppointmentNumberIn(List<String> values) {
            addCriterion("APPOINTMENT_NUMBER in", values, "appointmentNumber");
            return (Criteria) this;
        }

        public Criteria andAppointmentNumberNotIn(List<String> values) {
            addCriterion("APPOINTMENT_NUMBER not in", values, "appointmentNumber");
            return (Criteria) this;
        }

        public Criteria andAppointmentNumberBetween(String value1, String value2) {
            addCriterion("APPOINTMENT_NUMBER between", value1, value2, "appointmentNumber");
            return (Criteria) this;
        }

        public Criteria andAppointmentNumberNotBetween(String value1, String value2) {
            addCriterion("APPOINTMENT_NUMBER not between", value1, value2, "appointmentNumber");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateIsNull() {
            addCriterion("APPOINTMENT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateIsNotNull() {
            addCriterion("APPOINTMENT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateEqualTo(Date value) {
            addCriterion("APPOINTMENT_DATE =", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateNotEqualTo(Date value) {
            addCriterion("APPOINTMENT_DATE <>", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateGreaterThan(Date value) {
            addCriterion("APPOINTMENT_DATE >", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("APPOINTMENT_DATE >=", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateLessThan(Date value) {
            addCriterion("APPOINTMENT_DATE <", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateLessThanOrEqualTo(Date value) {
            addCriterion("APPOINTMENT_DATE <=", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateIn(List<Date> values) {
            addCriterion("APPOINTMENT_DATE in", values, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateNotIn(List<Date> values) {
            addCriterion("APPOINTMENT_DATE not in", values, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateBetween(Date value1, Date value2) {
            addCriterion("APPOINTMENT_DATE between", value1, value2, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateNotBetween(Date value1, Date value2) {
            addCriterion("APPOINTMENT_DATE not between", value1, value2, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andDismissalNumberIsNull() {
            addCriterion("DISMISSAL_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andDismissalNumberIsNotNull() {
            addCriterion("DISMISSAL_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andDismissalNumberEqualTo(String value) {
            addCriterion("DISMISSAL_NUMBER =", value, "dismissalNumber");
            return (Criteria) this;
        }

        public Criteria andDismissalNumberNotEqualTo(String value) {
            addCriterion("DISMISSAL_NUMBER <>", value, "dismissalNumber");
            return (Criteria) this;
        }

        public Criteria andDismissalNumberGreaterThan(String value) {
            addCriterion("DISMISSAL_NUMBER >", value, "dismissalNumber");
            return (Criteria) this;
        }

        public Criteria andDismissalNumberGreaterThanOrEqualTo(String value) {
            addCriterion("DISMISSAL_NUMBER >=", value, "dismissalNumber");
            return (Criteria) this;
        }

        public Criteria andDismissalNumberLessThan(String value) {
            addCriterion("DISMISSAL_NUMBER <", value, "dismissalNumber");
            return (Criteria) this;
        }

        public Criteria andDismissalNumberLessThanOrEqualTo(String value) {
            addCriterion("DISMISSAL_NUMBER <=", value, "dismissalNumber");
            return (Criteria) this;
        }

        public Criteria andDismissalNumberLike(String value) {
            addCriterion("DISMISSAL_NUMBER like", value, "dismissalNumber");
            return (Criteria) this;
        }

        public Criteria andDismissalNumberNotLike(String value) {
            addCriterion("DISMISSAL_NUMBER not like", value, "dismissalNumber");
            return (Criteria) this;
        }

        public Criteria andDismissalNumberIn(List<String> values) {
            addCriterion("DISMISSAL_NUMBER in", values, "dismissalNumber");
            return (Criteria) this;
        }

        public Criteria andDismissalNumberNotIn(List<String> values) {
            addCriterion("DISMISSAL_NUMBER not in", values, "dismissalNumber");
            return (Criteria) this;
        }

        public Criteria andDismissalNumberBetween(String value1, String value2) {
            addCriterion("DISMISSAL_NUMBER between", value1, value2, "dismissalNumber");
            return (Criteria) this;
        }

        public Criteria andDismissalNumberNotBetween(String value1, String value2) {
            addCriterion("DISMISSAL_NUMBER not between", value1, value2, "dismissalNumber");
            return (Criteria) this;
        }

        public Criteria andDismissalDateIsNull() {
            addCriterion("DISMISSAL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDismissalDateIsNotNull() {
            addCriterion("DISMISSAL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDismissalDateEqualTo(Date value) {
            addCriterion("DISMISSAL_DATE =", value, "dismissalDate");
            return (Criteria) this;
        }

        public Criteria andDismissalDateNotEqualTo(Date value) {
            addCriterion("DISMISSAL_DATE <>", value, "dismissalDate");
            return (Criteria) this;
        }

        public Criteria andDismissalDateGreaterThan(Date value) {
            addCriterion("DISMISSAL_DATE >", value, "dismissalDate");
            return (Criteria) this;
        }

        public Criteria andDismissalDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DISMISSAL_DATE >=", value, "dismissalDate");
            return (Criteria) this;
        }

        public Criteria andDismissalDateLessThan(Date value) {
            addCriterion("DISMISSAL_DATE <", value, "dismissalDate");
            return (Criteria) this;
        }

        public Criteria andDismissalDateLessThanOrEqualTo(Date value) {
            addCriterion("DISMISSAL_DATE <=", value, "dismissalDate");
            return (Criteria) this;
        }

        public Criteria andDismissalDateIn(List<Date> values) {
            addCriterion("DISMISSAL_DATE in", values, "dismissalDate");
            return (Criteria) this;
        }

        public Criteria andDismissalDateNotIn(List<Date> values) {
            addCriterion("DISMISSAL_DATE not in", values, "dismissalDate");
            return (Criteria) this;
        }

        public Criteria andDismissalDateBetween(Date value1, Date value2) {
            addCriterion("DISMISSAL_DATE between", value1, value2, "dismissalDate");
            return (Criteria) this;
        }

        public Criteria andDismissalDateNotBetween(Date value1, Date value2) {
            addCriterion("DISMISSAL_DATE not between", value1, value2, "dismissalDate");
            return (Criteria) this;
        }

        public Criteria andEmploymentNumberIsNull() {
            addCriterion("EMPLOYMENT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andEmploymentNumberIsNotNull() {
            addCriterion("EMPLOYMENT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andEmploymentNumberEqualTo(String value) {
            addCriterion("EMPLOYMENT_NUMBER =", value, "employmentNumber");
            return (Criteria) this;
        }

        public Criteria andEmploymentNumberNotEqualTo(String value) {
            addCriterion("EMPLOYMENT_NUMBER <>", value, "employmentNumber");
            return (Criteria) this;
        }

        public Criteria andEmploymentNumberGreaterThan(String value) {
            addCriterion("EMPLOYMENT_NUMBER >", value, "employmentNumber");
            return (Criteria) this;
        }

        public Criteria andEmploymentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYMENT_NUMBER >=", value, "employmentNumber");
            return (Criteria) this;
        }

        public Criteria andEmploymentNumberLessThan(String value) {
            addCriterion("EMPLOYMENT_NUMBER <", value, "employmentNumber");
            return (Criteria) this;
        }

        public Criteria andEmploymentNumberLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYMENT_NUMBER <=", value, "employmentNumber");
            return (Criteria) this;
        }

        public Criteria andEmploymentNumberLike(String value) {
            addCriterion("EMPLOYMENT_NUMBER like", value, "employmentNumber");
            return (Criteria) this;
        }

        public Criteria andEmploymentNumberNotLike(String value) {
            addCriterion("EMPLOYMENT_NUMBER not like", value, "employmentNumber");
            return (Criteria) this;
        }

        public Criteria andEmploymentNumberIn(List<String> values) {
            addCriterion("EMPLOYMENT_NUMBER in", values, "employmentNumber");
            return (Criteria) this;
        }

        public Criteria andEmploymentNumberNotIn(List<String> values) {
            addCriterion("EMPLOYMENT_NUMBER not in", values, "employmentNumber");
            return (Criteria) this;
        }

        public Criteria andEmploymentNumberBetween(String value1, String value2) {
            addCriterion("EMPLOYMENT_NUMBER between", value1, value2, "employmentNumber");
            return (Criteria) this;
        }

        public Criteria andEmploymentNumberNotBetween(String value1, String value2) {
            addCriterion("EMPLOYMENT_NUMBER not between", value1, value2, "employmentNumber");
            return (Criteria) this;
        }

        public Criteria andEmploymentDateIsNull() {
            addCriterion("EMPLOYMENT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEmploymentDateIsNotNull() {
            addCriterion("EMPLOYMENT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEmploymentDateEqualTo(Date value) {
            addCriterion("EMPLOYMENT_DATE =", value, "employmentDate");
            return (Criteria) this;
        }

        public Criteria andEmploymentDateNotEqualTo(Date value) {
            addCriterion("EMPLOYMENT_DATE <>", value, "employmentDate");
            return (Criteria) this;
        }

        public Criteria andEmploymentDateGreaterThan(Date value) {
            addCriterion("EMPLOYMENT_DATE >", value, "employmentDate");
            return (Criteria) this;
        }

        public Criteria andEmploymentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("EMPLOYMENT_DATE >=", value, "employmentDate");
            return (Criteria) this;
        }

        public Criteria andEmploymentDateLessThan(Date value) {
            addCriterion("EMPLOYMENT_DATE <", value, "employmentDate");
            return (Criteria) this;
        }

        public Criteria andEmploymentDateLessThanOrEqualTo(Date value) {
            addCriterion("EMPLOYMENT_DATE <=", value, "employmentDate");
            return (Criteria) this;
        }

        public Criteria andEmploymentDateIn(List<Date> values) {
            addCriterion("EMPLOYMENT_DATE in", values, "employmentDate");
            return (Criteria) this;
        }

        public Criteria andEmploymentDateNotIn(List<Date> values) {
            addCriterion("EMPLOYMENT_DATE not in", values, "employmentDate");
            return (Criteria) this;
        }

        public Criteria andEmploymentDateBetween(Date value1, Date value2) {
            addCriterion("EMPLOYMENT_DATE between", value1, value2, "employmentDate");
            return (Criteria) this;
        }

        public Criteria andEmploymentDateNotBetween(Date value1, Date value2) {
            addCriterion("EMPLOYMENT_DATE not between", value1, value2, "employmentDate");
            return (Criteria) this;
        }

        public Criteria andFiredNumberIsNull() {
            addCriterion("FIRED_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andFiredNumberIsNotNull() {
            addCriterion("FIRED_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andFiredNumberEqualTo(String value) {
            addCriterion("FIRED_NUMBER =", value, "firedNumber");
            return (Criteria) this;
        }

        public Criteria andFiredNumberNotEqualTo(String value) {
            addCriterion("FIRED_NUMBER <>", value, "firedNumber");
            return (Criteria) this;
        }

        public Criteria andFiredNumberGreaterThan(String value) {
            addCriterion("FIRED_NUMBER >", value, "firedNumber");
            return (Criteria) this;
        }

        public Criteria andFiredNumberGreaterThanOrEqualTo(String value) {
            addCriterion("FIRED_NUMBER >=", value, "firedNumber");
            return (Criteria) this;
        }

        public Criteria andFiredNumberLessThan(String value) {
            addCriterion("FIRED_NUMBER <", value, "firedNumber");
            return (Criteria) this;
        }

        public Criteria andFiredNumberLessThanOrEqualTo(String value) {
            addCriterion("FIRED_NUMBER <=", value, "firedNumber");
            return (Criteria) this;
        }

        public Criteria andFiredNumberLike(String value) {
            addCriterion("FIRED_NUMBER like", value, "firedNumber");
            return (Criteria) this;
        }

        public Criteria andFiredNumberNotLike(String value) {
            addCriterion("FIRED_NUMBER not like", value, "firedNumber");
            return (Criteria) this;
        }

        public Criteria andFiredNumberIn(List<String> values) {
            addCriterion("FIRED_NUMBER in", values, "firedNumber");
            return (Criteria) this;
        }

        public Criteria andFiredNumberNotIn(List<String> values) {
            addCriterion("FIRED_NUMBER not in", values, "firedNumber");
            return (Criteria) this;
        }

        public Criteria andFiredNumberBetween(String value1, String value2) {
            addCriterion("FIRED_NUMBER between", value1, value2, "firedNumber");
            return (Criteria) this;
        }

        public Criteria andFiredNumberNotBetween(String value1, String value2) {
            addCriterion("FIRED_NUMBER not between", value1, value2, "firedNumber");
            return (Criteria) this;
        }

        public Criteria andFiredDateIsNull() {
            addCriterion("FIRED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFiredDateIsNotNull() {
            addCriterion("FIRED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFiredDateEqualTo(Date value) {
            addCriterionForJDBCDate("FIRED_DATE =", value, "firedDate");
            return (Criteria) this;
        }

        public Criteria andFiredDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("FIRED_DATE <>", value, "firedDate");
            return (Criteria) this;
        }

        public Criteria andFiredDateGreaterThan(Date value) {
            addCriterionForJDBCDate("FIRED_DATE >", value, "firedDate");
            return (Criteria) this;
        }

        public Criteria andFiredDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FIRED_DATE >=", value, "firedDate");
            return (Criteria) this;
        }

        public Criteria andFiredDateLessThan(Date value) {
            addCriterionForJDBCDate("FIRED_DATE <", value, "firedDate");
            return (Criteria) this;
        }

        public Criteria andFiredDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FIRED_DATE <=", value, "firedDate");
            return (Criteria) this;
        }

        public Criteria andFiredDateIn(List<Date> values) {
            addCriterionForJDBCDate("FIRED_DATE in", values, "firedDate");
            return (Criteria) this;
        }

        public Criteria andFiredDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("FIRED_DATE not in", values, "firedDate");
            return (Criteria) this;
        }

        public Criteria andFiredDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FIRED_DATE between", value1, value2, "firedDate");
            return (Criteria) this;
        }

        public Criteria andFiredDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FIRED_DATE not between", value1, value2, "firedDate");
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

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
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
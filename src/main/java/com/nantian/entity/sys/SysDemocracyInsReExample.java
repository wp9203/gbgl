package com.nantian.entity.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysDemocracyInsReExample {
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
    public SysDemocracyInsReExample() {
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

        public Criteria andInspectTimeIsNull() {
            addCriterion("INSPECT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInspectTimeIsNotNull() {
            addCriterion("INSPECT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInspectTimeEqualTo(Date value) {
            addCriterion("INSPECT_TIME =", value, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeNotEqualTo(Date value) {
            addCriterion("INSPECT_TIME <>", value, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeGreaterThan(Date value) {
            addCriterion("INSPECT_TIME >", value, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("INSPECT_TIME >=", value, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeLessThan(Date value) {
            addCriterion("INSPECT_TIME <", value, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeLessThanOrEqualTo(Date value) {
            addCriterion("INSPECT_TIME <=", value, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeIn(List<Date> values) {
            addCriterion("INSPECT_TIME in", values, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeNotIn(List<Date> values) {
            addCriterion("INSPECT_TIME not in", values, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeBetween(Date value1, Date value2) {
            addCriterion("INSPECT_TIME between", value1, value2, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeNotBetween(Date value1, Date value2) {
            addCriterion("INSPECT_TIME not between", value1, value2, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTeamMemberIsNull() {
            addCriterion("INSPECT_TEAM_MEMBER is null");
            return (Criteria) this;
        }

        public Criteria andInspectTeamMemberIsNotNull() {
            addCriterion("INSPECT_TEAM_MEMBER is not null");
            return (Criteria) this;
        }

        public Criteria andInspectTeamMemberEqualTo(String value) {
            addCriterion("INSPECT_TEAM_MEMBER =", value, "inspectTeamMember");
            return (Criteria) this;
        }

        public Criteria andInspectTeamMemberNotEqualTo(String value) {
            addCriterion("INSPECT_TEAM_MEMBER <>", value, "inspectTeamMember");
            return (Criteria) this;
        }

        public Criteria andInspectTeamMemberGreaterThan(String value) {
            addCriterion("INSPECT_TEAM_MEMBER >", value, "inspectTeamMember");
            return (Criteria) this;
        }

        public Criteria andInspectTeamMemberGreaterThanOrEqualTo(String value) {
            addCriterion("INSPECT_TEAM_MEMBER >=", value, "inspectTeamMember");
            return (Criteria) this;
        }

        public Criteria andInspectTeamMemberLessThan(String value) {
            addCriterion("INSPECT_TEAM_MEMBER <", value, "inspectTeamMember");
            return (Criteria) this;
        }

        public Criteria andInspectTeamMemberLessThanOrEqualTo(String value) {
            addCriterion("INSPECT_TEAM_MEMBER <=", value, "inspectTeamMember");
            return (Criteria) this;
        }

        public Criteria andInspectTeamMemberLike(String value) {
            addCriterion("INSPECT_TEAM_MEMBER like", value, "inspectTeamMember");
            return (Criteria) this;
        }

        public Criteria andInspectTeamMemberNotLike(String value) {
            addCriterion("INSPECT_TEAM_MEMBER not like", value, "inspectTeamMember");
            return (Criteria) this;
        }

        public Criteria andInspectTeamMemberIn(List<String> values) {
            addCriterion("INSPECT_TEAM_MEMBER in", values, "inspectTeamMember");
            return (Criteria) this;
        }

        public Criteria andInspectTeamMemberNotIn(List<String> values) {
            addCriterion("INSPECT_TEAM_MEMBER not in", values, "inspectTeamMember");
            return (Criteria) this;
        }

        public Criteria andInspectTeamMemberBetween(String value1, String value2) {
            addCriterion("INSPECT_TEAM_MEMBER between", value1, value2, "inspectTeamMember");
            return (Criteria) this;
        }

        public Criteria andInspectTeamMemberNotBetween(String value1, String value2) {
            addCriterion("INSPECT_TEAM_MEMBER not between", value1, value2, "inspectTeamMember");
            return (Criteria) this;
        }

        public Criteria andMeetingScopeIsNull() {
            addCriterion("MEETING_SCOPE is null");
            return (Criteria) this;
        }

        public Criteria andMeetingScopeIsNotNull() {
            addCriterion("MEETING_SCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingScopeEqualTo(String value) {
            addCriterion("MEETING_SCOPE =", value, "meetingScope");
            return (Criteria) this;
        }

        public Criteria andMeetingScopeNotEqualTo(String value) {
            addCriterion("MEETING_SCOPE <>", value, "meetingScope");
            return (Criteria) this;
        }

        public Criteria andMeetingScopeGreaterThan(String value) {
            addCriterion("MEETING_SCOPE >", value, "meetingScope");
            return (Criteria) this;
        }

        public Criteria andMeetingScopeGreaterThanOrEqualTo(String value) {
            addCriterion("MEETING_SCOPE >=", value, "meetingScope");
            return (Criteria) this;
        }

        public Criteria andMeetingScopeLessThan(String value) {
            addCriterion("MEETING_SCOPE <", value, "meetingScope");
            return (Criteria) this;
        }

        public Criteria andMeetingScopeLessThanOrEqualTo(String value) {
            addCriterion("MEETING_SCOPE <=", value, "meetingScope");
            return (Criteria) this;
        }

        public Criteria andMeetingScopeLike(String value) {
            addCriterion("MEETING_SCOPE like", value, "meetingScope");
            return (Criteria) this;
        }

        public Criteria andMeetingScopeNotLike(String value) {
            addCriterion("MEETING_SCOPE not like", value, "meetingScope");
            return (Criteria) this;
        }

        public Criteria andMeetingScopeIn(List<String> values) {
            addCriterion("MEETING_SCOPE in", values, "meetingScope");
            return (Criteria) this;
        }

        public Criteria andMeetingScopeNotIn(List<String> values) {
            addCriterion("MEETING_SCOPE not in", values, "meetingScope");
            return (Criteria) this;
        }

        public Criteria andMeetingScopeBetween(String value1, String value2) {
            addCriterion("MEETING_SCOPE between", value1, value2, "meetingScope");
            return (Criteria) this;
        }

        public Criteria andMeetingScopeNotBetween(String value1, String value2) {
            addCriterion("MEETING_SCOPE not between", value1, value2, "meetingScope");
            return (Criteria) this;
        }

        public Criteria andDueNumberIsNull() {
            addCriterion("DUE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andDueNumberIsNotNull() {
            addCriterion("DUE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andDueNumberEqualTo(String value) {
            addCriterion("DUE_NUMBER =", value, "dueNumber");
            return (Criteria) this;
        }

        public Criteria andDueNumberNotEqualTo(String value) {
            addCriterion("DUE_NUMBER <>", value, "dueNumber");
            return (Criteria) this;
        }

        public Criteria andDueNumberGreaterThan(String value) {
            addCriterion("DUE_NUMBER >", value, "dueNumber");
            return (Criteria) this;
        }

        public Criteria andDueNumberGreaterThanOrEqualTo(String value) {
            addCriterion("DUE_NUMBER >=", value, "dueNumber");
            return (Criteria) this;
        }

        public Criteria andDueNumberLessThan(String value) {
            addCriterion("DUE_NUMBER <", value, "dueNumber");
            return (Criteria) this;
        }

        public Criteria andDueNumberLessThanOrEqualTo(String value) {
            addCriterion("DUE_NUMBER <=", value, "dueNumber");
            return (Criteria) this;
        }

        public Criteria andDueNumberLike(String value) {
            addCriterion("DUE_NUMBER like", value, "dueNumber");
            return (Criteria) this;
        }

        public Criteria andDueNumberNotLike(String value) {
            addCriterion("DUE_NUMBER not like", value, "dueNumber");
            return (Criteria) this;
        }

        public Criteria andDueNumberIn(List<String> values) {
            addCriterion("DUE_NUMBER in", values, "dueNumber");
            return (Criteria) this;
        }

        public Criteria andDueNumberNotIn(List<String> values) {
            addCriterion("DUE_NUMBER not in", values, "dueNumber");
            return (Criteria) this;
        }

        public Criteria andDueNumberBetween(String value1, String value2) {
            addCriterion("DUE_NUMBER between", value1, value2, "dueNumber");
            return (Criteria) this;
        }

        public Criteria andDueNumberNotBetween(String value1, String value2) {
            addCriterion("DUE_NUMBER not between", value1, value2, "dueNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberIsNull() {
            addCriterion("ACTUAL_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andActualNumberIsNotNull() {
            addCriterion("ACTUAL_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andActualNumberEqualTo(String value) {
            addCriterion("ACTUAL_NUMBER =", value, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberNotEqualTo(String value) {
            addCriterion("ACTUAL_NUMBER <>", value, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberGreaterThan(String value) {
            addCriterion("ACTUAL_NUMBER >", value, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ACTUAL_NUMBER >=", value, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberLessThan(String value) {
            addCriterion("ACTUAL_NUMBER <", value, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberLessThanOrEqualTo(String value) {
            addCriterion("ACTUAL_NUMBER <=", value, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberLike(String value) {
            addCriterion("ACTUAL_NUMBER like", value, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberNotLike(String value) {
            addCriterion("ACTUAL_NUMBER not like", value, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberIn(List<String> values) {
            addCriterion("ACTUAL_NUMBER in", values, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberNotIn(List<String> values) {
            addCriterion("ACTUAL_NUMBER not in", values, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberBetween(String value1, String value2) {
            addCriterion("ACTUAL_NUMBER between", value1, value2, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberNotBetween(String value1, String value2) {
            addCriterion("ACTUAL_NUMBER not between", value1, value2, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andTotalValidVotesIsNull() {
            addCriterion("TOTAL_VALID_VOTES is null");
            return (Criteria) this;
        }

        public Criteria andTotalValidVotesIsNotNull() {
            addCriterion("TOTAL_VALID_VOTES is not null");
            return (Criteria) this;
        }

        public Criteria andTotalValidVotesEqualTo(String value) {
            addCriterion("TOTAL_VALID_VOTES =", value, "totalValidVotes");
            return (Criteria) this;
        }

        public Criteria andTotalValidVotesNotEqualTo(String value) {
            addCriterion("TOTAL_VALID_VOTES <>", value, "totalValidVotes");
            return (Criteria) this;
        }

        public Criteria andTotalValidVotesGreaterThan(String value) {
            addCriterion("TOTAL_VALID_VOTES >", value, "totalValidVotes");
            return (Criteria) this;
        }

        public Criteria andTotalValidVotesGreaterThanOrEqualTo(String value) {
            addCriterion("TOTAL_VALID_VOTES >=", value, "totalValidVotes");
            return (Criteria) this;
        }

        public Criteria andTotalValidVotesLessThan(String value) {
            addCriterion("TOTAL_VALID_VOTES <", value, "totalValidVotes");
            return (Criteria) this;
        }

        public Criteria andTotalValidVotesLessThanOrEqualTo(String value) {
            addCriterion("TOTAL_VALID_VOTES <=", value, "totalValidVotes");
            return (Criteria) this;
        }

        public Criteria andTotalValidVotesLike(String value) {
            addCriterion("TOTAL_VALID_VOTES like", value, "totalValidVotes");
            return (Criteria) this;
        }

        public Criteria andTotalValidVotesNotLike(String value) {
            addCriterion("TOTAL_VALID_VOTES not like", value, "totalValidVotes");
            return (Criteria) this;
        }

        public Criteria andTotalValidVotesIn(List<String> values) {
            addCriterion("TOTAL_VALID_VOTES in", values, "totalValidVotes");
            return (Criteria) this;
        }

        public Criteria andTotalValidVotesNotIn(List<String> values) {
            addCriterion("TOTAL_VALID_VOTES not in", values, "totalValidVotes");
            return (Criteria) this;
        }

        public Criteria andTotalValidVotesBetween(String value1, String value2) {
            addCriterion("TOTAL_VALID_VOTES between", value1, value2, "totalValidVotes");
            return (Criteria) this;
        }

        public Criteria andTotalValidVotesNotBetween(String value1, String value2) {
            addCriterion("TOTAL_VALID_VOTES not between", value1, value2, "totalValidVotes");
            return (Criteria) this;
        }

        public Criteria andVoteIsNull() {
            addCriterion("VOTE is null");
            return (Criteria) this;
        }

        public Criteria andVoteIsNotNull() {
            addCriterion("VOTE is not null");
            return (Criteria) this;
        }

        public Criteria andVoteEqualTo(String value) {
            addCriterion("VOTE =", value, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteNotEqualTo(String value) {
            addCriterion("VOTE <>", value, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteGreaterThan(String value) {
            addCriterion("VOTE >", value, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteGreaterThanOrEqualTo(String value) {
            addCriterion("VOTE >=", value, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteLessThan(String value) {
            addCriterion("VOTE <", value, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteLessThanOrEqualTo(String value) {
            addCriterion("VOTE <=", value, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteLike(String value) {
            addCriterion("VOTE like", value, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteNotLike(String value) {
            addCriterion("VOTE not like", value, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteIn(List<String> values) {
            addCriterion("VOTE in", values, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteNotIn(List<String> values) {
            addCriterion("VOTE not in", values, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteBetween(String value1, String value2) {
            addCriterion("VOTE between", value1, value2, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteNotBetween(String value1, String value2) {
            addCriterion("VOTE not between", value1, value2, "vote");
            return (Criteria) this;
        }

        public Criteria andConScopeIsNull() {
            addCriterion("CON_SCOPE is null");
            return (Criteria) this;
        }

        public Criteria andConScopeIsNotNull() {
            addCriterion("CON_SCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andConScopeEqualTo(String value) {
            addCriterion("CON_SCOPE =", value, "conScope");
            return (Criteria) this;
        }

        public Criteria andConScopeNotEqualTo(String value) {
            addCriterion("CON_SCOPE <>", value, "conScope");
            return (Criteria) this;
        }

        public Criteria andConScopeGreaterThan(String value) {
            addCriterion("CON_SCOPE >", value, "conScope");
            return (Criteria) this;
        }

        public Criteria andConScopeGreaterThanOrEqualTo(String value) {
            addCriterion("CON_SCOPE >=", value, "conScope");
            return (Criteria) this;
        }

        public Criteria andConScopeLessThan(String value) {
            addCriterion("CON_SCOPE <", value, "conScope");
            return (Criteria) this;
        }

        public Criteria andConScopeLessThanOrEqualTo(String value) {
            addCriterion("CON_SCOPE <=", value, "conScope");
            return (Criteria) this;
        }

        public Criteria andConScopeLike(String value) {
            addCriterion("CON_SCOPE like", value, "conScope");
            return (Criteria) this;
        }

        public Criteria andConScopeNotLike(String value) {
            addCriterion("CON_SCOPE not like", value, "conScope");
            return (Criteria) this;
        }

        public Criteria andConScopeIn(List<String> values) {
            addCriterion("CON_SCOPE in", values, "conScope");
            return (Criteria) this;
        }

        public Criteria andConScopeNotIn(List<String> values) {
            addCriterion("CON_SCOPE not in", values, "conScope");
            return (Criteria) this;
        }

        public Criteria andConScopeBetween(String value1, String value2) {
            addCriterion("CON_SCOPE between", value1, value2, "conScope");
            return (Criteria) this;
        }

        public Criteria andConScopeNotBetween(String value1, String value2) {
            addCriterion("CON_SCOPE not between", value1, value2, "conScope");
            return (Criteria) this;
        }

        public Criteria andConDueNumberIsNull() {
            addCriterion("CON_DUE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andConDueNumberIsNotNull() {
            addCriterion("CON_DUE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andConDueNumberEqualTo(String value) {
            addCriterion("CON_DUE_NUMBER =", value, "conDueNumber");
            return (Criteria) this;
        }

        public Criteria andConDueNumberNotEqualTo(String value) {
            addCriterion("CON_DUE_NUMBER <>", value, "conDueNumber");
            return (Criteria) this;
        }

        public Criteria andConDueNumberGreaterThan(String value) {
            addCriterion("CON_DUE_NUMBER >", value, "conDueNumber");
            return (Criteria) this;
        }

        public Criteria andConDueNumberGreaterThanOrEqualTo(String value) {
            addCriterion("CON_DUE_NUMBER >=", value, "conDueNumber");
            return (Criteria) this;
        }

        public Criteria andConDueNumberLessThan(String value) {
            addCriterion("CON_DUE_NUMBER <", value, "conDueNumber");
            return (Criteria) this;
        }

        public Criteria andConDueNumberLessThanOrEqualTo(String value) {
            addCriterion("CON_DUE_NUMBER <=", value, "conDueNumber");
            return (Criteria) this;
        }

        public Criteria andConDueNumberLike(String value) {
            addCriterion("CON_DUE_NUMBER like", value, "conDueNumber");
            return (Criteria) this;
        }

        public Criteria andConDueNumberNotLike(String value) {
            addCriterion("CON_DUE_NUMBER not like", value, "conDueNumber");
            return (Criteria) this;
        }

        public Criteria andConDueNumberIn(List<String> values) {
            addCriterion("CON_DUE_NUMBER in", values, "conDueNumber");
            return (Criteria) this;
        }

        public Criteria andConDueNumberNotIn(List<String> values) {
            addCriterion("CON_DUE_NUMBER not in", values, "conDueNumber");
            return (Criteria) this;
        }

        public Criteria andConDueNumberBetween(String value1, String value2) {
            addCriterion("CON_DUE_NUMBER between", value1, value2, "conDueNumber");
            return (Criteria) this;
        }

        public Criteria andConDueNumberNotBetween(String value1, String value2) {
            addCriterion("CON_DUE_NUMBER not between", value1, value2, "conDueNumber");
            return (Criteria) this;
        }

        public Criteria andConActualNumberIsNull() {
            addCriterion("CON_ACTUAL_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andConActualNumberIsNotNull() {
            addCriterion("CON_ACTUAL_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andConActualNumberEqualTo(String value) {
            addCriterion("CON_ACTUAL_NUMBER =", value, "conActualNumber");
            return (Criteria) this;
        }

        public Criteria andConActualNumberNotEqualTo(String value) {
            addCriterion("CON_ACTUAL_NUMBER <>", value, "conActualNumber");
            return (Criteria) this;
        }

        public Criteria andConActualNumberGreaterThan(String value) {
            addCriterion("CON_ACTUAL_NUMBER >", value, "conActualNumber");
            return (Criteria) this;
        }

        public Criteria andConActualNumberGreaterThanOrEqualTo(String value) {
            addCriterion("CON_ACTUAL_NUMBER >=", value, "conActualNumber");
            return (Criteria) this;
        }

        public Criteria andConActualNumberLessThan(String value) {
            addCriterion("CON_ACTUAL_NUMBER <", value, "conActualNumber");
            return (Criteria) this;
        }

        public Criteria andConActualNumberLessThanOrEqualTo(String value) {
            addCriterion("CON_ACTUAL_NUMBER <=", value, "conActualNumber");
            return (Criteria) this;
        }

        public Criteria andConActualNumberLike(String value) {
            addCriterion("CON_ACTUAL_NUMBER like", value, "conActualNumber");
            return (Criteria) this;
        }

        public Criteria andConActualNumberNotLike(String value) {
            addCriterion("CON_ACTUAL_NUMBER not like", value, "conActualNumber");
            return (Criteria) this;
        }

        public Criteria andConActualNumberIn(List<String> values) {
            addCriterion("CON_ACTUAL_NUMBER in", values, "conActualNumber");
            return (Criteria) this;
        }

        public Criteria andConActualNumberNotIn(List<String> values) {
            addCriterion("CON_ACTUAL_NUMBER not in", values, "conActualNumber");
            return (Criteria) this;
        }

        public Criteria andConActualNumberBetween(String value1, String value2) {
            addCriterion("CON_ACTUAL_NUMBER between", value1, value2, "conActualNumber");
            return (Criteria) this;
        }

        public Criteria andConActualNumberNotBetween(String value1, String value2) {
            addCriterion("CON_ACTUAL_NUMBER not between", value1, value2, "conActualNumber");
            return (Criteria) this;
        }

        public Criteria andRecommendNumberIsNull() {
            addCriterion("RECOMMEND_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andRecommendNumberIsNotNull() {
            addCriterion("RECOMMEND_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendNumberEqualTo(String value) {
            addCriterion("RECOMMEND_NUMBER =", value, "recommendNumber");
            return (Criteria) this;
        }

        public Criteria andRecommendNumberNotEqualTo(String value) {
            addCriterion("RECOMMEND_NUMBER <>", value, "recommendNumber");
            return (Criteria) this;
        }

        public Criteria andRecommendNumberGreaterThan(String value) {
            addCriterion("RECOMMEND_NUMBER >", value, "recommendNumber");
            return (Criteria) this;
        }

        public Criteria andRecommendNumberGreaterThanOrEqualTo(String value) {
            addCriterion("RECOMMEND_NUMBER >=", value, "recommendNumber");
            return (Criteria) this;
        }

        public Criteria andRecommendNumberLessThan(String value) {
            addCriterion("RECOMMEND_NUMBER <", value, "recommendNumber");
            return (Criteria) this;
        }

        public Criteria andRecommendNumberLessThanOrEqualTo(String value) {
            addCriterion("RECOMMEND_NUMBER <=", value, "recommendNumber");
            return (Criteria) this;
        }

        public Criteria andRecommendNumberLike(String value) {
            addCriterion("RECOMMEND_NUMBER like", value, "recommendNumber");
            return (Criteria) this;
        }

        public Criteria andRecommendNumberNotLike(String value) {
            addCriterion("RECOMMEND_NUMBER not like", value, "recommendNumber");
            return (Criteria) this;
        }

        public Criteria andRecommendNumberIn(List<String> values) {
            addCriterion("RECOMMEND_NUMBER in", values, "recommendNumber");
            return (Criteria) this;
        }

        public Criteria andRecommendNumberNotIn(List<String> values) {
            addCriterion("RECOMMEND_NUMBER not in", values, "recommendNumber");
            return (Criteria) this;
        }

        public Criteria andRecommendNumberBetween(String value1, String value2) {
            addCriterion("RECOMMEND_NUMBER between", value1, value2, "recommendNumber");
            return (Criteria) this;
        }

        public Criteria andRecommendNumberNotBetween(String value1, String value2) {
            addCriterion("RECOMMEND_NUMBER not between", value1, value2, "recommendNumber");
            return (Criteria) this;
        }

        public Criteria andInspectDataIsNull() {
            addCriterion("INSPECT_DATA is null");
            return (Criteria) this;
        }

        public Criteria andInspectDataIsNotNull() {
            addCriterion("INSPECT_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andInspectDataEqualTo(String value) {
            addCriterion("INSPECT_DATA =", value, "inspectData");
            return (Criteria) this;
        }

        public Criteria andInspectDataNotEqualTo(String value) {
            addCriterion("INSPECT_DATA <>", value, "inspectData");
            return (Criteria) this;
        }

        public Criteria andInspectDataGreaterThan(String value) {
            addCriterion("INSPECT_DATA >", value, "inspectData");
            return (Criteria) this;
        }

        public Criteria andInspectDataGreaterThanOrEqualTo(String value) {
            addCriterion("INSPECT_DATA >=", value, "inspectData");
            return (Criteria) this;
        }

        public Criteria andInspectDataLessThan(String value) {
            addCriterion("INSPECT_DATA <", value, "inspectData");
            return (Criteria) this;
        }

        public Criteria andInspectDataLessThanOrEqualTo(String value) {
            addCriterion("INSPECT_DATA <=", value, "inspectData");
            return (Criteria) this;
        }

        public Criteria andInspectDataLike(String value) {
            addCriterion("INSPECT_DATA like", value, "inspectData");
            return (Criteria) this;
        }

        public Criteria andInspectDataNotLike(String value) {
            addCriterion("INSPECT_DATA not like", value, "inspectData");
            return (Criteria) this;
        }

        public Criteria andInspectDataIn(List<String> values) {
            addCriterion("INSPECT_DATA in", values, "inspectData");
            return (Criteria) this;
        }

        public Criteria andInspectDataNotIn(List<String> values) {
            addCriterion("INSPECT_DATA not in", values, "inspectData");
            return (Criteria) this;
        }

        public Criteria andInspectDataBetween(String value1, String value2) {
            addCriterion("INSPECT_DATA between", value1, value2, "inspectData");
            return (Criteria) this;
        }

        public Criteria andInspectDataNotBetween(String value1, String value2) {
            addCriterion("INSPECT_DATA not between", value1, value2, "inspectData");
            return (Criteria) this;
        }

        public Criteria andDelayInspectDataIsNull() {
            addCriterion("DELAY_INSPECT_DATA is null");
            return (Criteria) this;
        }

        public Criteria andDelayInspectDataIsNotNull() {
            addCriterion("DELAY_INSPECT_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andDelayInspectDataEqualTo(String value) {
            addCriterion("DELAY_INSPECT_DATA =", value, "delayInspectData");
            return (Criteria) this;
        }

        public Criteria andDelayInspectDataNotEqualTo(String value) {
            addCriterion("DELAY_INSPECT_DATA <>", value, "delayInspectData");
            return (Criteria) this;
        }

        public Criteria andDelayInspectDataGreaterThan(String value) {
            addCriterion("DELAY_INSPECT_DATA >", value, "delayInspectData");
            return (Criteria) this;
        }

        public Criteria andDelayInspectDataGreaterThanOrEqualTo(String value) {
            addCriterion("DELAY_INSPECT_DATA >=", value, "delayInspectData");
            return (Criteria) this;
        }

        public Criteria andDelayInspectDataLessThan(String value) {
            addCriterion("DELAY_INSPECT_DATA <", value, "delayInspectData");
            return (Criteria) this;
        }

        public Criteria andDelayInspectDataLessThanOrEqualTo(String value) {
            addCriterion("DELAY_INSPECT_DATA <=", value, "delayInspectData");
            return (Criteria) this;
        }

        public Criteria andDelayInspectDataLike(String value) {
            addCriterion("DELAY_INSPECT_DATA like", value, "delayInspectData");
            return (Criteria) this;
        }

        public Criteria andDelayInspectDataNotLike(String value) {
            addCriterion("DELAY_INSPECT_DATA not like", value, "delayInspectData");
            return (Criteria) this;
        }

        public Criteria andDelayInspectDataIn(List<String> values) {
            addCriterion("DELAY_INSPECT_DATA in", values, "delayInspectData");
            return (Criteria) this;
        }

        public Criteria andDelayInspectDataNotIn(List<String> values) {
            addCriterion("DELAY_INSPECT_DATA not in", values, "delayInspectData");
            return (Criteria) this;
        }

        public Criteria andDelayInspectDataBetween(String value1, String value2) {
            addCriterion("DELAY_INSPECT_DATA between", value1, value2, "delayInspectData");
            return (Criteria) this;
        }

        public Criteria andDelayInspectDataNotBetween(String value1, String value2) {
            addCriterion("DELAY_INSPECT_DATA not between", value1, value2, "delayInspectData");
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
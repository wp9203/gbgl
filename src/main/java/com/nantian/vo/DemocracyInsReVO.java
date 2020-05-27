package com.nantian.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.util.Date;

public class DemocracyInsReVO {

    /**
     * ID
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    /**
     * 竞聘者
     */
    private String candidateName;

    /**
     * 考察时间
     */
    private Date inspectTime;

    /**
     * 考察组成员人数
     */
    private String inspectTeamMember;

    /**
     * 考察会议范围
     */
    private String meetingScope;

    /**
     * 会议应到人数
     */
    private String dueNumber;

    /**
     * 会议实到人数
     */
    private String actualNumber;

    /**
     * 有效总票数
     */
    private String totalValidVotes;

    /**
     * 得票数
     */
    private String vote;

    /**
     * 谈话范围
     */
    private String conScope;

    /**
     * 谈话应到人数
     */
    private String conDueNumber;

    /**
     * 谈话实到人数
     */
    private String conActualNumber;

    /**
     * 推荐人数
     */
    private String recommendNumber;

    /**
     * 考察材料
     */
    private String inspectData;

    /**
     * 延生考察材料
     */
    private String delayInspectData;

    /**
     * 创建时间
     */
    private Date creationTime;

    /**
     * 修改时间
     */
    private Date updateTime;


    /**
     * 民主推荐ID
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long democracyInsReid;

    /**
     * 流程ID
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long flowid;

    public Long getDemocracyInsReid() {
        return democracyInsReid;
    }

    public void setDemocracyInsReid(Long democracyInsReid) {
        this.democracyInsReid = democracyInsReid;
    }

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public Date getInspectTime() {
        return inspectTime;
    }

    public void setInspectTime(Date inspectTime) {
        this.inspectTime = inspectTime;
    }

    public String getInspectTeamMember() {
        return inspectTeamMember;
    }

    public void setInspectTeamMember(String inspectTeamMember) {
        this.inspectTeamMember = inspectTeamMember;
    }

    public String getMeetingScope() {
        return meetingScope;
    }

    public void setMeetingScope(String meetingScope) {
        this.meetingScope = meetingScope;
    }

    public String getDueNumber() {
        return dueNumber;
    }

    public void setDueNumber(String dueNumber) {
        this.dueNumber = dueNumber;
    }

    public String getActualNumber() {
        return actualNumber;
    }

    public void setActualNumber(String actualNumber) {
        this.actualNumber = actualNumber;
    }

    public String getTotalValidVotes() {
        return totalValidVotes;
    }

    public void setTotalValidVotes(String totalValidVotes) {
        this.totalValidVotes = totalValidVotes;
    }

    public String getVote() {
        return vote;
    }

    public void setVote(String vote) {
        this.vote = vote;
    }

    public String getConScope() {
        return conScope;
    }

    public void setConScope(String conScope) {
        this.conScope = conScope;
    }

    public String getConDueNumber() {
        return conDueNumber;
    }

    public void setConDueNumber(String conDueNumber) {
        this.conDueNumber = conDueNumber;
    }

    public String getConActualNumber() {
        return conActualNumber;
    }

    public void setConActualNumber(String conActualNumber) {
        this.conActualNumber = conActualNumber;
    }

    public String getRecommendNumber() {
        return recommendNumber;
    }

    public void setRecommendNumber(String recommendNumber) {
        this.recommendNumber = recommendNumber;
    }

    public String getInspectData() {
        return inspectData;
    }

    public void setInspectData(String inspectData) {
        this.inspectData = inspectData;
    }

    public String getDelayInspectData() {
        return delayInspectData;
    }

    public void setDelayInspectData(String delayInspectData) {
        this.delayInspectData = delayInspectData;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "DemocracyInsReVO{" +
                "id=" + id +
                ", candidateName='" + candidateName + '\'' +
                ", inspectTime=" + inspectTime +
                ", inspectTeamMember='" + inspectTeamMember + '\'' +
                ", meetingScope='" + meetingScope + '\'' +
                ", dueNumber='" + dueNumber + '\'' +
                ", actualNumber='" + actualNumber + '\'' +
                ", totalValidVotes='" + totalValidVotes + '\'' +
                ", vote='" + vote + '\'' +
                ", conScope='" + conScope + '\'' +
                ", conDueNumber='" + conDueNumber + '\'' +
                ", conActualNumber='" + conActualNumber + '\'' +
                ", recommendNumber='" + recommendNumber + '\'' +
                ", inspectData='" + inspectData + '\'' +
                ", delayInspectData='" + delayInspectData + '\'' +
                ", creationTime=" + creationTime +
                ", updateTime=" + updateTime +
                ", democracyInsReid=" + democracyInsReid +
                ", flowid=" + flowid +
                '}';
    }
}

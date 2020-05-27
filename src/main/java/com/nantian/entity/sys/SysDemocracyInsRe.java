package com.nantian.entity.sys;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.io.Serializable;
import java.util.Date;

public class SysDemocracyInsRe implements Serializable {
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
     * 序列化版本号
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 ID
     * @return ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 ID
     * @param id ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 竞聘者
     * @return 竞聘者
     */
    public String getCandidateName() {
        return candidateName;
    }

    /**
     * 设置 竞聘者
     * @param candidateName 竞聘者
     */
    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    /**
     * 获取 考察时间
     * @return 考察时间
     */
    public Date getInspectTime() {
        return inspectTime;
    }

    /**
     * 设置 考察时间
     * @param inspectTime 考察时间
     */
    public void setInspectTime(Date inspectTime) {
        this.inspectTime = inspectTime;
    }

    /**
     * 获取 考察组成员人数
     * @return 考察组成员人数
     */
    public String getInspectTeamMember() {
        return inspectTeamMember;
    }

    /**
     * 设置 考察组成员人数
     * @param inspectTeamMember 考察组成员人数
     */
    public void setInspectTeamMember(String inspectTeamMember) {
        this.inspectTeamMember = inspectTeamMember;
    }

    /**
     * 获取 考察会议范围
     * @return 考察会议范围
     */
    public String getMeetingScope() {
        return meetingScope;
    }

    /**
     * 设置 考察会议范围
     * @param meetingScope 考察会议范围
     */
    public void setMeetingScope(String meetingScope) {
        this.meetingScope = meetingScope;
    }

    /**
     * 获取 会议应到人数
     * @return 会议应到人数
     */
    public String getDueNumber() {
        return dueNumber;
    }

    /**
     * 设置 会议应到人数
     * @param dueNumber 会议应到人数
     */
    public void setDueNumber(String dueNumber) {
        this.dueNumber = dueNumber;
    }

    /**
     * 获取 会议实到人数
     * @return 会议实到人数
     */
    public String getActualNumber() {
        return actualNumber;
    }

    /**
     * 设置 会议实到人数
     * @param actualNumber 会议实到人数
     */
    public void setActualNumber(String actualNumber) {
        this.actualNumber = actualNumber;
    }

    /**
     * 获取 有效总票数
     * @return 有效总票数
     */
    public String getTotalValidVotes() {
        return totalValidVotes;
    }

    /**
     * 设置 有效总票数
     * @param totalValidVotes 有效总票数
     */
    public void setTotalValidVotes(String totalValidVotes) {
        this.totalValidVotes = totalValidVotes;
    }

    /**
     * 获取 得票数
     * @return 得票数
     */
    public String getVote() {
        return vote;
    }

    /**
     * 设置 得票数
     * @param vote 得票数
     */
    public void setVote(String vote) {
        this.vote = vote;
    }

    /**
     * 获取 谈话范围
     * @return 谈话范围
     */
    public String getConScope() {
        return conScope;
    }

    /**
     * 设置 谈话范围
     * @param conScope 谈话范围
     */
    public void setConScope(String conScope) {
        this.conScope = conScope;
    }

    /**
     * 获取 谈话应到人数
     * @return 谈话应到人数
     */
    public String getConDueNumber() {
        return conDueNumber;
    }

    /**
     * 设置 谈话应到人数
     * @param conDueNumber 谈话应到人数
     */
    public void setConDueNumber(String conDueNumber) {
        this.conDueNumber = conDueNumber;
    }

    /**
     * 获取 谈话实到人数
     * @return 谈话实到人数
     */
    public String getConActualNumber() {
        return conActualNumber;
    }

    /**
     * 设置 谈话实到人数
     * @param conActualNumber 谈话实到人数
     */
    public void setConActualNumber(String conActualNumber) {
        this.conActualNumber = conActualNumber;
    }

    /**
     * 获取 推荐人数
     * @return 推荐人数
     */
    public String getRecommendNumber() {
        return recommendNumber;
    }

    /**
     * 设置 推荐人数
     * @param recommendNumber 推荐人数
     */
    public void setRecommendNumber(String recommendNumber) {
        this.recommendNumber = recommendNumber;
    }

    /**
     * 获取 考察材料
     * @return 考察材料
     */
    public String getInspectData() {
        return inspectData;
    }

    /**
     * 设置 考察材料
     * @param inspectData 考察材料
     */
    public void setInspectData(String inspectData) {
        this.inspectData = inspectData;
    }

    /**
     * 获取 延生考察材料
     * @return 延生考察材料
     */
    public String getDelayInspectData() {
        return delayInspectData;
    }

    /**
     * 设置 延生考察材料
     * @param delayInspectData 延生考察材料
     */
    public void setDelayInspectData(String delayInspectData) {
        this.delayInspectData = delayInspectData;
    }

    /**
     * 获取 创建时间
     * @return 创建时间
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * 设置 创建时间
     * @param creationTime 创建时间
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * 获取 修改时间
     * @return 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 修改时间
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", candidateName=").append(candidateName);
        sb.append(", inspectTime=").append(inspectTime);
        sb.append(", inspectTeamMember=").append(inspectTeamMember);
        sb.append(", meetingScope=").append(meetingScope);
        sb.append(", dueNumber=").append(dueNumber);
        sb.append(", actualNumber=").append(actualNumber);
        sb.append(", totalValidVotes=").append(totalValidVotes);
        sb.append(", vote=").append(vote);
        sb.append(", conScope=").append(conScope);
        sb.append(", conDueNumber=").append(conDueNumber);
        sb.append(", conActualNumber=").append(conActualNumber);
        sb.append(", recommendNumber=").append(recommendNumber);
        sb.append(", inspectData=").append(inspectData);
        sb.append(", delayInspectData=").append(delayInspectData);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
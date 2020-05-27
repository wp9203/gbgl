package com.nantian.entity.sys;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.io.Serializable;
import java.util.Date;

public class SysThirdMotion implements Serializable {

    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    /**
     * 会议时间
     */
    private Date meetingDate;

    /**
     * 主持人
     */
    private String host;

    /**
     * 应到人数
     */
    private String dueNumber;

    /**
     * 实到人数
     */
    private String actualNumber;

    /**
     * 竞聘者
     */
    private String candidateName;

    /**
     * 单位
     */
    private String unit;

    /**
     * 职务
     */
    private String position;

    /**
     * 职等
     */
    private String positionLevel;

    /**
     * 备注
     */
    private String note;

    /**
     * 是否通过
     */
    private String pass;

    /**
     * 创建时间
     */
    private Date creationTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 纪要文号
     */
    private String summaryNumber;

    /**
     * 签报
     */
    private String signFileName;

    /**
     * 纪要
     */
    private String summaryFileName;

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 会议时间
     * @return 会议时间
     */
    public Date getMeetingDate() {
        return meetingDate;
    }

    /**
     * 设置 会议时间
     * @param meetingDate 会议时间
     */
    public void setMeetingDate(Date meetingDate) {
        this.meetingDate = meetingDate;
    }

    /**
     * 获取 主持人
     * @return 主持人
     */
    public String getHost() {
        return host;
    }

    /**
     * 设置 主持人
     * @param host 主持人
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * 获取 应到人数
     * @return 应到人数
     */
    public String getDueNumber() {
        return dueNumber;
    }

    /**
     * 设置 应到人数
     * @param dueNumber 应到人数
     */
    public void setDueNumber(String dueNumber) {
        this.dueNumber = dueNumber;
    }

    /**
     * 获取 实到人数
     * @return 实到人数
     */
    public String getActualNumber() {
        return actualNumber;
    }

    /**
     * 设置 实到人数
     * @param actualNumber 实到人数
     */
    public void setActualNumber(String actualNumber) {
        this.actualNumber = actualNumber;
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
     * 获取 单位
     * @return 单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置 单位
     * @param unit 单位
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 获取 职务
     * @return 职务
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置 职务
     * @param position 职务
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取 职等
     * @return 职等
     */
    public String getPositionLevel() {
        return positionLevel;
    }

    /**
     * 设置 职等
     * @param positionLevel 职等
     */
    public void setPositionLevel(String positionLevel) {
        this.positionLevel = positionLevel;
    }

    /**
     * 获取 备注
     * @return 备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置 备注
     * @param note 备注
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * 获取 是否通过
     * @return 是否通过
     */
    public String getPass() {
        return pass;
    }

    /**
     * 设置 是否通过
     * @param pass 是否通过
     */
    public void setPass(String pass) {
        this.pass = pass;
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

    /**
     * 获取 纪要文号
     * @return 纪要文号
     */
    public String getSummaryNumber() {
        return summaryNumber;
    }

    /**
     * 设置 纪要文号
     * @param summaryNumber 纪要文号
     */
    public void setSummaryNumber(String summaryNumber) {
        this.summaryNumber = summaryNumber;
    }

    /**
     * 获取 签报
     * @return 签报
     */
    public String getSignFileName() {
        return signFileName;
    }

    /**
     * 设置 签报
     * @param signFileName 签报
     */
    public void setSignFileName(String signFileName) {
        this.signFileName = signFileName;
    }

    /**
     * 获取 纪要
     * @return 纪要
     */
    public String getSummaryFileName() {
        return summaryFileName;
    }

    /**
     * 设置 纪要
     * @param summaryFileName 纪要
     */
    public void setSummaryFileName(String summaryFileName) {
        this.summaryFileName = summaryFileName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", meetingDate=").append(meetingDate);
        sb.append(", host=").append(host);
        sb.append(", dueNumber=").append(dueNumber);
        sb.append(", actualNumber=").append(actualNumber);
        sb.append(", candidateName=").append(candidateName);
        sb.append(", unit=").append(unit);
        sb.append(", position=").append(position);
        sb.append(", positionLevel=").append(positionLevel);
        sb.append(", note=").append(note);
        sb.append(", pass=").append(pass);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", summaryNumber=").append(summaryNumber);
        sb.append(", signFileName=").append(signFileName);
        sb.append(", summaryFileName=").append(summaryFileName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
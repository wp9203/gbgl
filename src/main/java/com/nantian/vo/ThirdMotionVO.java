package com.nantian.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ThirdMotionVO {

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

    List<FirstMotionVO> infos;

    private List<Long> ids;

    FirstMotionVO  req;


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

    public String getSummaryNumber() {
        return summaryNumber;
    }

    public void setSummaryNumber(String summaryNumber) {
        this.summaryNumber = summaryNumber;
    }

    public String getSignFileName() {
        return signFileName;
    }

    public void setSignFileName(String signFileName) {
        this.signFileName = signFileName;
    }

    public String getSummaryFileName() {
        return summaryFileName;
    }

    public void setSummaryFileName(String summaryFileName) {
        this.summaryFileName = summaryFileName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(Date meetingDate) {
        this.meetingDate = meetingDate;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
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

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPositionLevel() {
        return positionLevel;
    }

    public void setPositionLevel(String positionLevel) {
        this.positionLevel = positionLevel;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
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

    public List<FirstMotionVO> getInfos() {
        return infos;
    }

    public void setInfos(List<FirstMotionVO> infos) {
        this.infos = infos;
    }

    public FirstMotionVO getReq() {
        return req;
    }

    public void setReq(FirstMotionVO req) {
        this.req = req;
    }

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "ThirdMotionVO{" +
                "id=" + id +
                ", meetingDate=" + meetingDate +
                ", host='" + host + '\'' +
                ", dueNumber='" + dueNumber + '\'' +
                ", actualNumber='" + actualNumber + '\'' +
                ", candidateName='" + candidateName + '\'' +
                ", unit='" + unit + '\'' +
                ", position='" + position + '\'' +
                ", positionLevel='" + positionLevel + '\'' +
                ", note='" + note + '\'' +
                ", pass='" + pass + '\'' +
                ", creationTime=" + creationTime +
                ", updateTime=" + updateTime +
                ", infos=" + infos +
                ", ids=" + ids +
                ", req=" + req +
                ", summaryNumber='" + summaryNumber + '\'' +
                ", signFileName='" + signFileName + '\'' +
                ", summaryFileName='" + summaryFileName + '\'' +
                '}';
    }
}

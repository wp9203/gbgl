package com.nantian.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;
import com.nantian.entity.sys.SysAppBeforeInOffice;

import java.util.Date;
import java.util.List;

public class AppBeforeInOfficeVO {

    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    private List<Long> ids;

    private List<AppBeforeInOfficeVO> infos;

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
     * 报批时间
     */
    private Date approvalDate;

    /**
     * 报批文号
     */
    private String approvalNumber;

    /**
     * 批复日期
     */
    private Date replyDate;

    /**
     * 是否通过
     */
    private String pass;

    /**
     * 批复文号
     */
    private String replyNumber;

    /**
     * 批复材料
     */
    private String replyData;

    /**
     * 创建时间
     */
    private Date creationTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public List<AppBeforeInOfficeVO> getInfos() {
        return infos;
    }

    public void setInfos(List<AppBeforeInOfficeVO> infos) {
        this.infos = infos;
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

    public Date getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(Date approvalDate) {
        this.approvalDate = approvalDate;
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    public Date getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(Date replyDate) {
        this.replyDate = replyDate;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getReplyNumber() {
        return replyNumber;
    }

    public void setReplyNumber(String replyNumber) {
        this.replyNumber = replyNumber;
    }

    public String getReplyData() {
        return replyData;
    }

    public void setReplyData(String replyData) {
        this.replyData = replyData;
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
        return "AppBeforeInOfficeVO{" +
                "id=" + id +
                ", ids=" + ids +
                ", infos=" + infos +
                ", candidateName='" + candidateName + '\'' +
                ", unit='" + unit + '\'' +
                ", position='" + position + '\'' +
                ", approvalDate=" + approvalDate +
                ", approvalNumber='" + approvalNumber + '\'' +
                ", replyDate=" + replyDate +
                ", pass='" + pass + '\'' +
                ", replyNumber='" + replyNumber + '\'' +
                ", replyData='" + replyData + '\'' +
                ", creationTime=" + creationTime +
                ", updateTime=" + updateTime +
                '}';
    }
}

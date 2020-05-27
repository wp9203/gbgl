package com.nantian.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.util.Date;
import java.util.List;

public class PostAppointmentVO {
    /**
     * id
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    private List<Long> ids;

    private List<PostAppointmentVO> infos;

    /**
     * 姓名
     */
    private String candidateName;

    /**
     * 原职务
     */
    private String position;

    /**
     * 原单位
     */
    private String unit;

    /**
     * 新职务
     */
    private String newPosition;

    /**
     * 新单位
     */
    private String newUnit;

    /**
     * 任职文件文号
     */
    private String appointmentNumber;

    /**
     * 任职文件时间
     */
    private Date appointmentDate;

    /**
     * 免职文号
     */
    private String dismissalNumber;

    /**
     * 免职文件时间
     */
    private Date dismissalDate;

    /**
     * 聘任文号
     */
    private String employmentNumber;

    /**
     * 聘任文件时间
     */
    private Date employmentDate;

    /**
     * 解聘文号
     */
    private String firedNumber;

    /**
     * 解聘时间
     */
    private Date firedDate;

    /**
     * 创建时间
     */
    private Date createTime;

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

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getNewPosition() {
        return newPosition;
    }

    public void setNewPosition(String newPosition) {
        this.newPosition = newPosition;
    }

    public String getNewUnit() {
        return newUnit;
    }

    public void setNewUnit(String newUnit) {
        this.newUnit = newUnit;
    }

    public String getAppointmentNumber() {
        return appointmentNumber;
    }

    public void setAppointmentNumber(String appointmentNumber) {
        this.appointmentNumber = appointmentNumber;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getDismissalNumber() {
        return dismissalNumber;
    }

    public void setDismissalNumber(String dismissalNumber) {
        this.dismissalNumber = dismissalNumber;
    }

    public Date getDismissalDate() {
        return dismissalDate;
    }

    public void setDismissalDate(Date dismissalDate) {
        this.dismissalDate = dismissalDate;
    }

    public String getEmploymentNumber() {
        return employmentNumber;
    }

    public void setEmploymentNumber(String employmentNumber) {
        this.employmentNumber = employmentNumber;
    }

    public Date getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(Date employmentDate) {
        this.employmentDate = employmentDate;
    }

    public String getFiredNumber() {
        return firedNumber;
    }

    public void setFiredNumber(String firedNumber) {
        this.firedNumber = firedNumber;
    }

    public Date getFiredDate() {
        return firedDate;
    }

    public void setFiredDate(Date firedDate) {
        this.firedDate = firedDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public List<PostAppointmentVO> getInfos() {
        return infos;
    }

    public void setInfos(List<PostAppointmentVO> infos) {
        this.infos = infos;
    }

    @Override
    public String toString() {
        return "PostAppointmentVO{" +
                "id=" + id +
                ", ids=" + ids +
                ", infos=" + infos +
                ", candidateName='" + candidateName + '\'' +
                ", position='" + position + '\'' +
                ", unit='" + unit + '\'' +
                ", newPosition='" + newPosition + '\'' +
                ", newUnit='" + newUnit + '\'' +
                ", appointmentNumber='" + appointmentNumber + '\'' +
                ", appointmentDate=" + appointmentDate +
                ", dismissalNumber='" + dismissalNumber + '\'' +
                ", dismissalDate=" + dismissalDate +
                ", employmentNumber='" + employmentNumber + '\'' +
                ", employmentDate=" + employmentDate +
                ", firedNumber='" + firedNumber + '\'' +
                ", firedDate=" + firedDate +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}

package com.nantian.entity.sys;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.io.Serializable;
import java.util.Date;

public class SysPostAppointment implements Serializable {
    /**
     * id
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

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

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 id
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 id
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 姓名
     * @return 姓名
     */
    public String getCandidateName() {
        return candidateName;
    }

    /**
     * 设置 姓名
     * @param candidateName 姓名
     */
    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    /**
     * 获取 原职务
     * @return 原职务
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置 原职务
     * @param position 原职务
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取 原单位
     * @return 原单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置 原单位
     * @param unit 原单位
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 获取 新职务
     * @return 新职务
     */
    public String getNewPosition() {
        return newPosition;
    }

    /**
     * 设置 新职务
     * @param newPosition 新职务
     */
    public void setNewPosition(String newPosition) {
        this.newPosition = newPosition;
    }

    /**
     * 获取 新单位
     * @return 新单位
     */
    public String getNewUnit() {
        return newUnit;
    }

    /**
     * 设置 新单位
     * @param newUnit 新单位
     */
    public void setNewUnit(String newUnit) {
        this.newUnit = newUnit;
    }

    /**
     * 获取 任职文件文号
     * @return 任职文件文号
     */
    public String getAppointmentNumber() {
        return appointmentNumber;
    }

    /**
     * 设置 任职文件文号
     * @param appointmentNumber 任职文件文号
     */
    public void setAppointmentNumber(String appointmentNumber) {
        this.appointmentNumber = appointmentNumber;
    }

    /**
     * 获取 任职文件时间
     * @return 任职文件时间
     */
    public Date getAppointmentDate() {
        return appointmentDate;
    }

    /**
     * 设置 任职文件时间
     * @param appointmentDate 任职文件时间
     */
    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    /**
     * 获取 免职文号
     * @return 免职文号
     */
    public String getDismissalNumber() {
        return dismissalNumber;
    }

    /**
     * 设置 免职文号
     * @param dismissalNumber 免职文号
     */
    public void setDismissalNumber(String dismissalNumber) {
        this.dismissalNumber = dismissalNumber;
    }

    /**
     * 获取 免职文件时间
     * @return 免职文件时间
     */
    public Date getDismissalDate() {
        return dismissalDate;
    }

    /**
     * 设置 免职文件时间
     * @param dismissalDate 免职文件时间
     */
    public void setDismissalDate(Date dismissalDate) {
        this.dismissalDate = dismissalDate;
    }

    /**
     * 获取 聘任文号
     * @return 聘任文号
     */
    public String getEmploymentNumber() {
        return employmentNumber;
    }

    /**
     * 设置 聘任文号
     * @param employmentNumber 聘任文号
     */
    public void setEmploymentNumber(String employmentNumber) {
        this.employmentNumber = employmentNumber;
    }

    /**
     * 获取 聘任文件时间
     * @return 聘任文件时间
     */
    public Date getEmploymentDate() {
        return employmentDate;
    }

    /**
     * 设置 聘任文件时间
     * @param employmentDate 聘任文件时间
     */
    public void setEmploymentDate(Date employmentDate) {
        this.employmentDate = employmentDate;
    }

    /**
     * 获取 解聘文号
     * @return 解聘文号
     */
    public String getFiredNumber() {
        return firedNumber;
    }

    /**
     * 设置 解聘文号
     * @param firedNumber 解聘文号
     */
    public void setFiredNumber(String firedNumber) {
        this.firedNumber = firedNumber;
    }

    /**
     * 获取 解聘时间
     * @return 解聘时间
     */
    public Date getFiredDate() {
        return firedDate;
    }

    /**
     * 设置 解聘时间
     * @param firedDate 解聘时间
     */
    public void setFiredDate(Date firedDate) {
        this.firedDate = firedDate;
    }

    /**
     * 获取 创建时间
     * @return 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        sb.append(", position=").append(position);
        sb.append(", unit=").append(unit);
        sb.append(", newPosition=").append(newPosition);
        sb.append(", newUnit=").append(newUnit);
        sb.append(", appointmentNumber=").append(appointmentNumber);
        sb.append(", appointmentDate=").append(appointmentDate);
        sb.append(", dismissalNumber=").append(dismissalNumber);
        sb.append(", dismissalDate=").append(dismissalDate);
        sb.append(", employmentNumber=").append(employmentNumber);
        sb.append(", employmentDate=").append(employmentDate);
        sb.append(", firedNumber=").append(firedNumber);
        sb.append(", firedDate=").append(firedDate);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
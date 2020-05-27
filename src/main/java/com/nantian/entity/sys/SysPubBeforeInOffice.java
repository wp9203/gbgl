package com.nantian.entity.sys;



import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.io.Serializable;
import java.util.Date;

public class SysPubBeforeInOffice implements Serializable {


    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    /**
     * 竞聘者
     */
    private String candidateName;

    /**
     * 单位
     */
    private String unit;

    /**
     * 公示开始时间
     */
    private Date publicStartTime;

    /**
     * 公示结束时间
     */
    private Date publicEndTime;

    /**
     * 公示类型
     */
    private String publicType;

    /**
     * 公示结果
     */
    private String publicResult;

    /**
     * 公示材料
     */
    private String publicData;

    /**
     * 公示问题核查结论
     */
    private String publicProVerCon;

    /**
     * 创建时间
     */
    private Date creationTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 问题反馈 1：有  0：无
     */
    private String prostionRecuperative;

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
     * 获取 公示开始时间
     * @return 公示开始时间
     */
    public Date getPublicStartTime() {
        return publicStartTime;
    }

    /**
     * 设置 公示开始时间
     * @param publicStartTime 公示开始时间
     */
    public void setPublicStartTime(Date publicStartTime) {
        this.publicStartTime = publicStartTime;
    }

    /**
     * 获取 公示结束时间
     * @return 公示结束时间
     */
    public Date getPublicEndTime() {
        return publicEndTime;
    }

    /**
     * 设置 公示结束时间
     * @param publicEndTime 公示结束时间
     */
    public void setPublicEndTime(Date publicEndTime) {
        this.publicEndTime = publicEndTime;
    }

    /**
     * 获取 公示类型
     * @return 公示类型
     */
    public String getPublicType() {
        return publicType;
    }

    /**
     * 设置 公示类型
     * @param publicType 公示类型
     */
    public void setPublicType(String publicType) {
        this.publicType = publicType;
    }

    /**
     * 获取 公示结果
     * @return 公示结果
     */
    public String getPublicResult() {
        return publicResult;
    }

    /**
     * 设置 公示结果
     * @param publicResult 公示结果
     */
    public void setPublicResult(String publicResult) {
        this.publicResult = publicResult;
    }

    /**
     * 获取 公示材料
     * @return 公示材料
     */
    public String getPublicData() {
        return publicData;
    }

    /**
     * 设置 公示材料
     * @param publicData 公示材料
     */
    public void setPublicData(String publicData) {
        this.publicData = publicData;
    }

    /**
     * 获取 公示问题核查结论
     * @return 公示问题核查结论
     */
    public String getPublicProVerCon() {
        return publicProVerCon;
    }

    /**
     * 设置 公示问题核查结论
     * @param publicProVerCon 公示问题核查结论
     */
    public void setPublicProVerCon(String publicProVerCon) {
        this.publicProVerCon = publicProVerCon;
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
     * 获取 问题反馈 1：有  0：无
     * @return 问题反馈 1：有  0：无
     */
    public String getProstionRecuperative() {
        return prostionRecuperative;
    }

    /**
     * 设置 问题反馈 1：有  0：无
     * @param prostionRecuperative 问题反馈 1：有  0：无
     */
    public void setProstionRecuperative(String prostionRecuperative) {
        this.prostionRecuperative = prostionRecuperative;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", candidateName=").append(candidateName);
        sb.append(", unit=").append(unit);
        sb.append(", publicStartTime=").append(publicStartTime);
        sb.append(", publicEndTime=").append(publicEndTime);
        sb.append(", publicType=").append(publicType);
        sb.append(", publicResult=").append(publicResult);
        sb.append(", publicData=").append(publicData);
        sb.append(", publicProVerCon=").append(publicProVerCon);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", prostionRecuperative=").append(prostionRecuperative);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
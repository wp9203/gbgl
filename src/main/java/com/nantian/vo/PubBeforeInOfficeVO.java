package com.nantian.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.util.Date;
import java.util.List;

public class PubBeforeInOfficeVO {

    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    private List<Long> ids;

    private List<PubBeforeInOfficeVO> infos;


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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Date getPublicStartTime() {
        return publicStartTime;
    }

    public void setPublicStartTime(Date publicStartTime) {
        this.publicStartTime = publicStartTime;
    }

    public Date getPublicEndTime() {
        return publicEndTime;
    }

    public void setPublicEndTime(Date publicEndTime) {
        this.publicEndTime = publicEndTime;
    }

    public String getPublicType() {
        return publicType;
    }

    public void setPublicType(String publicType) {
        this.publicType = publicType;
    }

    public String getPublicResult() {
        return publicResult;
    }

    public void setPublicResult(String publicResult) {
        this.publicResult = publicResult;
    }

    public String getPublicData() {
        return publicData;
    }

    public void setPublicData(String publicData) {
        this.publicData = publicData;
    }

    public String getPublicProVerCon() {
        return publicProVerCon;
    }

    public void setPublicProVerCon(String publicProVerCon) {
        this.publicProVerCon = publicProVerCon;
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

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public List<PubBeforeInOfficeVO> getInfos() {
        return infos;
    }

    public void setInfos(List<PubBeforeInOfficeVO> infos) {
        this.infos = infos;
    }

    public String getProstionRecuperative() {
        return prostionRecuperative;
    }

    public void setProstionRecuperative(String prostionRecuperative) {
        this.prostionRecuperative = prostionRecuperative;
    }

    @Override
    public String toString() {
        return "PubBeforeInOfficeVO{" +
                "id=" + id +
                ", ids=" + ids +
                ", infos=" + infos +
                ", candidateName='" + candidateName + '\'' +
                ", unit='" + unit + '\'' +
                ", publicStartTime=" + publicStartTime +
                ", publicEndTime=" + publicEndTime +
                ", publicType='" + publicType + '\'' +
                ", publicResult='" + publicResult + '\'' +
                ", publicData='" + publicData + '\'' +
                ", publicProVerCon='" + publicProVerCon + '\'' +
                ", creationTime=" + creationTime +
                ", updateTime=" + updateTime +
                ", prostionRecuperative='" + prostionRecuperative + '\'' +
                '}';
    }
}

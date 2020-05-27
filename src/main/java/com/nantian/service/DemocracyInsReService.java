package com.nantian.service;

import com.nantian.entity.sys.SysDemocracyInsRe;
import com.nantian.exception.DemocracyInsReException;
import com.nantian.vo.DemocracyInsReVO;
import com.nantian.vo.OrgVO;

public interface DemocracyInsReService {

    /**
     * 民主推荐与考察新增
     * @param democracyInsReVO 民主推荐与考察信息
     */
    void add(DemocracyInsReVO democracyInsReVO) throws DemocracyInsReException;

    /**
     * 更新民主推荐信息
     * @param democracyInsReVO 机构信息
     */
    void update(DemocracyInsReVO democracyInsReVO);

    /**
     * 更新流程表（民主推荐相关字段）
     * @param democracyInsReVO 机构信息
     */
    void updateflow(DemocracyInsReVO democracyInsReVO);

    /**
     * 根据民主推荐与考察ID，获取相关信息
     * @param Id 考察人id
     * @return 民主推荐与考察信息
     */
    SysDemocracyInsRe getDemocracyInsRe(Long Id);


    /**
     * 根据民主推荐与考察人姓名，获取相关信息
     * @param name 考察人姓名
     * @return 民主推荐与考察信息
     */
    SysDemocracyInsRe getDemocracyInsReByname(String name);
}

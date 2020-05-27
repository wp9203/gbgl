package com.nantian.service;

import com.nantian.entity.sys.SysPubBeforeInOffice;
import com.nantian.exception.PubBeforeInOfficeException;
import com.nantian.vo.PubBeforeInOfficeVO;

public interface PubBeforeInOfficeService {

    /**
     * 保存
     * @param pubBeforeInOfficeVO 需要添加的信息 集合
     */
    void add(PubBeforeInOfficeVO pubBeforeInOfficeVO) throws PubBeforeInOfficeException;

    void updateflow(PubBeforeInOfficeVO pubBeforeInOfficeVO);

    /**
     * 根据主键查询 档案
     * @param id
     * @return
     */
    SysPubBeforeInOffice queryById(Long id) throws PubBeforeInOfficeException;
}

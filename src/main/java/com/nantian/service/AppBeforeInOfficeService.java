package com.nantian.service;

import com.nantian.entity.sys.SysAppBeforeInOffice;
import com.nantian.exception.AppBeforeInOfficeException;
import com.nantian.vo.AppBeforeInOfficeVO;

import java.util.List;

public interface AppBeforeInOfficeService {

    /**
     * 根据主键查询 任前报批
     * @param id
     * @return
     */
    SysAppBeforeInOffice queryById(Long id) throws AppBeforeInOfficeException;

    /**
     * 保存
     * @param appBeforeInOfficeVO 需要添加的信息 集合
     */
    void add(AppBeforeInOfficeVO appBeforeInOfficeVO) throws AppBeforeInOfficeException;

    /**
     * 提交
     * @param appBeforeInOfficeVOList
     * @throws AppBeforeInOfficeException
     */
    void updateflow(List<AppBeforeInOfficeVO> appBeforeInOfficeVOList) throws AppBeforeInOfficeException;

    /**
     * 根据主键查询 档案
     * @param id
     * @return
     */
    SysAppBeforeInOffice queryAppBeforeInOffice(Long id) throws AppBeforeInOfficeException;
}

package com.nantian.service;


import com.nantian.entity.sys.SysComDisInsReOp;
import com.nantian.exception.SysComDisInsReOpException;
import com.nantian.vo.ComDisInsReOpVO;

public interface ComDisInsReOpService {

    void add(ComDisInsReOpVO comDisInsReOpVO) throws SysComDisInsReOpException;

    void update(ComDisInsReOpVO comDisInsReOpVO);

    void updateflow(ComDisInsReOpVO comDisInsReOpVO);

    /**
     * 根据主键查询
     * @param id
     * @return
     */
    SysComDisInsReOp queryById(Long id) throws SysComDisInsReOpException;


}

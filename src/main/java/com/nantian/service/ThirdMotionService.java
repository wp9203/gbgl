package com.nantian.service;

import com.nantian.entity.sys.SysThirdMotion;
import com.nantian.exception.ThirdMotionException;
import com.nantian.vo.ThirdMotionVO;

import java.util.List;

public interface ThirdMotionService {

    /**
     * 根据主键查询 三次上会
     * @param id
     * @return
     */
    SysThirdMotion queryById(Long id) throws ThirdMotionException;

    /**
     * 保存
     * @param thirdMotionVO 需要添加的信息 集合
     */
    void add(ThirdMotionVO thirdMotionVO) throws ThirdMotionException;

    /**
     * g更新
     * @param thirdMotionVO 需要添加的信息 集合
     */
    void update(ThirdMotionVO thirdMotionVO) throws ThirdMotionException;

    /**
     * 提交
     * @param thirdMotionVO
     * @throws ThirdMotionException
     */
    void updateflow(ThirdMotionVO thirdMotionVO) throws ThirdMotionException;

    /**
     * 根据主键查询 档案
     * @param id
     * @return
     */
    SysThirdMotion querySysThirdMotion(Long id) throws ThirdMotionException;
}

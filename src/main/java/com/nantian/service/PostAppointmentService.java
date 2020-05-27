package com.nantian.service;

import com.nantian.entity.sys.SysPostAppointment;
import com.nantian.exception.PostAppointmentException;
import com.nantian.vo.PostAppointmentVO;

import java.util.List;

public interface PostAppointmentService {

    /**
     * 根据主键查询 发文任免
     * @param id
     * @return
     */
    SysPostAppointment queryById(Long id) throws PostAppointmentException;

    /**
     * 插入数据
     * @param postAppointmentVO 需要添加的信息 集合
     */
    void add(PostAppointmentVO postAppointmentVO) throws PostAppointmentException;

    void updateflow(List<PostAppointmentVO> postAppointmentVOList)throws PostAppointmentException;

    /**
     * 根据id获取表中存在的所有字段
     * @param id
     * @return
     */
    SysPostAppointment queryPostAppointment(Long id) throws PostAppointmentException;
}

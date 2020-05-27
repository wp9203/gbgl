package com.nantian.service.impl;

import com.nantian.entity.sys.SysFlow;
import com.nantian.entity.sys.SysPostAppointment;
import com.nantian.entity.sys.SysPostAppointmentExample;
import com.nantian.exception.PostAppointmentException;
import com.nantian.mapper.sys.SysPostAppointmentMapper;
import com.nantian.service.PostAppointmentService;
import com.nantian.vo.PostAppointmentVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class PostAppointmentServiceImpl implements PostAppointmentService {

    private static Logger log= LoggerFactory.getLogger(PostAppointmentServiceImpl.class);

    @Autowired
    SysPostAppointmentMapper sysPostAppointmentMapper;

    @Override
    public SysPostAppointment queryById(Long id) throws PostAppointmentException {
        return sysPostAppointmentMapper.selectByPrimaryKey(id);
    }

    @Override
    public void add(PostAppointmentVO postAppointmentVO) throws PostAppointmentException {

        SysPostAppointment sysPostAppointment=new SysPostAppointment();
        sysPostAppointment.setId(postAppointmentVO.getId());
        sysPostAppointment.setCandidateName(postAppointmentVO.getCandidateName());
        sysPostAppointment.setUnit(postAppointmentVO.getUnit());
        sysPostAppointment.setPosition(postAppointmentVO.getPosition());
        sysPostAppointment.setNewUnit(postAppointmentVO.getNewUnit());
        sysPostAppointment.setNewPosition(postAppointmentVO.getNewPosition());
        sysPostAppointment.setAppointmentNumber(postAppointmentVO.getAppointmentNumber());
        sysPostAppointment.setAppointmentDate(postAppointmentVO.getAppointmentDate());
        sysPostAppointment.setDismissalNumber(postAppointmentVO.getDismissalNumber());
        sysPostAppointment.setDismissalDate(postAppointmentVO.getDismissalDate());
        sysPostAppointment.setEmploymentNumber(postAppointmentVO.getEmploymentNumber());
        sysPostAppointment.setEmploymentDate(postAppointmentVO.getEmploymentDate());
        sysPostAppointment.setFiredNumber(postAppointmentVO.getFiredNumber());
        sysPostAppointment.setFiredDate(postAppointmentVO.getFiredDate());

        //判断是否在数据已经存在该数据记录的ID
        SysPostAppointmentExample sysPostAppointmentExample=new SysPostAppointmentExample();
        sysPostAppointmentExample.createCriteria().andIdEqualTo(postAppointmentVO.getId());
        Long count=sysPostAppointmentMapper.countByExample(sysPostAppointmentExample);

        if(count >0){//更新
            sysPostAppointment.setUpdateTime(new Date());
            sysPostAppointmentMapper.updateByPrimaryKeySelective(sysPostAppointment);
        }else {//插入
            sysPostAppointment.setCreateTime(new Date());

            sysPostAppointmentMapper.insertSelective(sysPostAppointment);
        }

    }

    @Override
    public void updateflow(List<PostAppointmentVO> postAppointmentVOList) throws PostAppointmentException {

        for(int i=0;i<postAppointmentVOList.size();i++){
            SysPostAppointment sysPostAppointment=queryPostAppointment(postAppointmentVOList.get(i).getId());
            SysFlow sysFlow = new SysFlow();
            sysFlow.setPostAppointId(sysPostAppointment.getId());
            sysFlow.setStep18("18");
            sysFlow.setFlowStatus("1");
            if(sysPostAppointment.getUpdateTime()==null){
                sysFlow.setPostAppointResult(new SimpleDateFormat("yyyy-MM-dd").format(sysPostAppointment.getCreateTime()));
            }else{
                sysFlow.setPostAppointResult(new SimpleDateFormat("yyyy-MM-dd").format(sysPostAppointment.getUpdateTime()));
            }
            sysPostAppointmentMapper.updateflow(sysFlow);
        }
    }

    @Override
    public SysPostAppointment queryPostAppointment(Long id) throws PostAppointmentException {
        return sysPostAppointmentMapper.selectByPrimaryKey(id);
    }
}

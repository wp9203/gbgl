package com.nantian.service.impl;

import com.nantian.common.util.StringUtils;
import com.nantian.entity.sys.SysFirstMotion;
import com.nantian.entity.sys.SysFlow;
import com.nantian.enumeration.ErrorCodeEnum;
import com.nantian.exception.FirstMotionException;
import com.nantian.mapper.sys.SysFirstMotionMapper;
import com.nantian.service.FirstMotionService;
import com.nantian.vo.FirstMotionVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class FirstMotionServiceImpl implements FirstMotionService {

    private static Logger log = LoggerFactory.getLogger(FirstMotionServiceImpl.class);

    @Autowired
    SysFirstMotionMapper sysFirstMotionMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void add(FirstMotionVO firstMotionVO) throws FirstMotionException {

        SysFirstMotion sysFirstMotion=new SysFirstMotion();

        sysFirstMotion.setId(firstMotionVO.getId());
        sysFirstMotion.setCandidateName(firstMotionVO.getCandidateName());
        sysFirstMotion.setAdjustType(firstMotionVO.getAdjustType());
        sysFirstMotion.setAspiringPosition(firstMotionVO.getAspiringPosition());
        sysFirstMotion.setAspiringPositionLevel(firstMotionVO.getAspiringPositionLevel());
        sysFirstMotion.setNote(firstMotionVO.getNote());
        sysFirstMotion.setPass(firstMotionVO.getPass());

        sysFirstMotion.setMeetingDate(firstMotionVO.getMeetingDate());
        sysFirstMotion.setHost(firstMotionVO.getHost());
        sysFirstMotion.setDueNumber(firstMotionVO.getDueNumber());
        sysFirstMotion.setActualNumber(firstMotionVO.getActualNumber());
        sysFirstMotion.setSummaryNumber(firstMotionVO.getSummaryNumber());
        sysFirstMotion.setSummaryFilename(firstMotionVO.getSummaryFileName());
        sysFirstMotion.setSignFilename(firstMotionVO.getSignFileName());

        sysFirstMotion.setCreationTime(new Date());

        System.out.println(sysFirstMotion+"&&&&&&&&&&");

        sysFirstMotionMapper.insertSelective(sysFirstMotion);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void update(FirstMotionVO firstMotionVO) {

        SysFirstMotion sysFirstMotion = new SysFirstMotion();

        sysFirstMotion.setId(firstMotionVO.getId());
        sysFirstMotion.setCandidateName(firstMotionVO.getCandidateName());
        sysFirstMotion.setAdjustType(firstMotionVO.getAdjustType());
        sysFirstMotion.setAspiringPosition(firstMotionVO.getAspiringPosition());
        sysFirstMotion.setAspiringPositionLevel(firstMotionVO.getAspiringPositionLevel());
        sysFirstMotion.setNote(firstMotionVO.getNote());
        sysFirstMotion.setPass(firstMotionVO.getPass());
        sysFirstMotion.setMeetingDate(firstMotionVO.getMeetingDate());
        sysFirstMotion.setHost(firstMotionVO.getHost());
        sysFirstMotion.setDueNumber(firstMotionVO.getDueNumber());
        sysFirstMotion.setActualNumber(firstMotionVO.getActualNumber());
        sysFirstMotion.setSummaryNumber(firstMotionVO.getSummaryNumber());
        sysFirstMotion.setSummaryFilename(firstMotionVO.getSummaryFileName());
        sysFirstMotion.setSignFilename(firstMotionVO.getSignFileName());

        sysFirstMotion.setUpdateTime(new Date());

        sysFirstMotionMapper.updateByPrimaryKeySelective(sysFirstMotion);
    }




    @Override
    public SysFlow getFlowById(Long id) {
        return sysFirstMotionMapper.getFlowById(id);
    }

    @Override
    public SysFirstMotion getFirstMotion(Long Id) {
        return sysFirstMotionMapper.selectByPrimaryKey(Id);
    }

    @Override
    public void updateflow(FirstMotionVO firstMotionVO) {
        SysFirstMotion sysFirstMotion1=sysFirstMotionMapper.selectByPrimaryKey(firstMotionVO.getId());

        System.out.println(sysFirstMotion1+"&*&*&");

        SysFlow sysFlow=new SysFlow();

        sysFlow.setFirstMotionId(sysFirstMotion1.getId());

        if (sysFirstMotion1.getUpdateTime()==null||"".equals(sysFirstMotion1.getUpdateTime())){
            sysFlow.setFirstMotionResult(new SimpleDateFormat("yyyy-MM-dd").format(sysFirstMotion1.getCreationTime()));
        }else {
            sysFlow.setFirstMotionResult(new SimpleDateFormat("yyyy-MM-dd").format(sysFirstMotion1.getUpdateTime()));
        }
        sysFlow.setStep3("3");

        sysFirstMotionMapper.updateflow(sysFlow);

    }

    @Override
    public SysFirstMotion queryFirstMotion(Long id) throws FirstMotionException {
        return sysFirstMotionMapper.selectByPrimaryKey(id);
    }
}

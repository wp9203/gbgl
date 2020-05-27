package com.nantian.service.impl;

import com.nantian.entity.sys.SysFlow;
import com.nantian.entity.sys.SysThirdMotion;
import com.nantian.exception.ThirdMotionException;
import com.nantian.mapper.sys.SysThirdMotionMapper;
import com.nantian.service.ThirdMotionService;
import com.nantian.vo.ThirdMotionVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ThirdMotionServiceImpl implements ThirdMotionService {

    private static Logger log= LoggerFactory.getLogger(ThirdMotionServiceImpl.class);

    @Autowired
    SysThirdMotionMapper sysThirdMotionMapper;

    @Override
    public SysThirdMotion queryById(Long id) throws ThirdMotionException {
        return null;
    }

    @Override
    public void add(ThirdMotionVO thirdMotionVO) throws ThirdMotionException {



        SysThirdMotion sysThirdMotion=new SysThirdMotion();
        sysThirdMotion.setId(thirdMotionVO.getId());
        sysThirdMotion.setCandidateName(thirdMotionVO.getCandidateName());
        sysThirdMotion.setUnit(thirdMotionVO.getUnit());
        sysThirdMotion.setPosition(thirdMotionVO.getPosition());
        sysThirdMotion.setPositionLevel(thirdMotionVO.getPositionLevel());
        sysThirdMotion.setNote(thirdMotionVO.getNote());
        sysThirdMotion.setPass(thirdMotionVO.getPass());
        sysThirdMotion.setMeetingDate(thirdMotionVO.getMeetingDate());
        sysThirdMotion.setHost(thirdMotionVO.getHost());
        sysThirdMotion.setDueNumber(thirdMotionVO.getDueNumber());
        sysThirdMotion.setActualNumber(thirdMotionVO.getActualNumber());
        sysThirdMotion.setSummaryNumber(thirdMotionVO.getSummaryNumber());
        sysThirdMotion.setSignFileName(thirdMotionVO.getSignFileName());
        sysThirdMotion.setSummaryFileName(thirdMotionVO.getSummaryFileName());

        sysThirdMotion.setCreationTime(new Date());

        System.out.println(sysThirdMotion+"新增999");

        sysThirdMotionMapper.insertSelective(sysThirdMotion);

    }

    @Override
    public void update(ThirdMotionVO thirdMotionVO) throws ThirdMotionException {

        SysThirdMotion sysThirdMotion=new SysThirdMotion();
        sysThirdMotion.setId(thirdMotionVO.getId());
        sysThirdMotion.setCandidateName(thirdMotionVO.getCandidateName());
        sysThirdMotion.setUnit(thirdMotionVO.getUnit());
        sysThirdMotion.setPosition(thirdMotionVO.getPosition());
        sysThirdMotion.setPositionLevel(thirdMotionVO.getPositionLevel());
        sysThirdMotion.setNote(thirdMotionVO.getNote());
        sysThirdMotion.setPass(thirdMotionVO.getPass());
        sysThirdMotion.setMeetingDate(thirdMotionVO.getMeetingDate());
        sysThirdMotion.setHost(thirdMotionVO.getHost());
        sysThirdMotion.setDueNumber(thirdMotionVO.getDueNumber());
        sysThirdMotion.setActualNumber(thirdMotionVO.getActualNumber());
        sysThirdMotion.setSummaryNumber(thirdMotionVO.getSummaryNumber());
        sysThirdMotion.setSignFileName(thirdMotionVO.getSignFileName());
        sysThirdMotion.setSummaryFileName(thirdMotionVO.getSummaryFileName());

        sysThirdMotion.setUpdateTime(new Date());

        System.out.println(sysThirdMotion+"修改999");

        sysThirdMotionMapper.updateByPrimaryKeySelective(sysThirdMotion);

    }

    @Override
    public void updateflow(ThirdMotionVO thirdMotionVO) throws ThirdMotionException {

        SysThirdMotion sysThirdMotion=querySysThirdMotion(thirdMotionVO.getId());

        SysFlow sysFlow=new SysFlow();
        sysFlow.setThirdMotionId(sysThirdMotion.getId());
        sysFlow.setStep11("11");
        if(sysThirdMotion.getUpdateTime()==null){
            sysFlow.setThirdMotionResult(new SimpleDateFormat("yyyy-MM-dd").format(sysThirdMotion.getCreationTime()));
        }else{
            sysFlow.setThirdMotionResult(new SimpleDateFormat("yyyy-MM-dd").format(sysThirdMotion.getUpdateTime()));
        }
        sysThirdMotionMapper.updateflow(sysFlow);

    }


    @Override
    public SysThirdMotion querySysThirdMotion(Long id) throws ThirdMotionException {
        return sysThirdMotionMapper.selectByPrimaryKey(id);
    }
}

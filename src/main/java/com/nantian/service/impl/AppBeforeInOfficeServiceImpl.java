package com.nantian.service.impl;

import com.nantian.common.util.CollectionUtils;
import com.nantian.entity.sys.SysAppBeforeInOffice;
import com.nantian.entity.sys.SysAppBeforeInOfficeExample;
import com.nantian.entity.sys.SysFlow;
import com.nantian.exception.AppBeforeInOfficeException;
import com.nantian.mapper.sys.SysAppBeforeInOfficeMapper;
import com.nantian.service.AppBeforeInOfficeService;
import com.nantian.vo.AppBeforeInOfficeVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class AppBeforeInOfficeServiceImpl implements AppBeforeInOfficeService {

    private static Logger log= LoggerFactory.getLogger(AppBeforeInOfficeServiceImpl.class);

    @Autowired
    SysAppBeforeInOfficeMapper sysAppBeforeInOfficeMapper;


    @Override
    public SysAppBeforeInOffice queryById(Long id) throws AppBeforeInOfficeException {
        SysAppBeforeInOfficeExample example=new SysAppBeforeInOfficeExample();
        example.createCriteria().andIdEqualTo(id);
        List<SysAppBeforeInOffice> sysAppBeforeInOfficeList = sysAppBeforeInOfficeMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(sysAppBeforeInOfficeList)) {
            return null;
        }
        return sysAppBeforeInOfficeList.get(0);
    }

    @Override
    public void add(AppBeforeInOfficeVO appBeforeInOfficeVO) throws AppBeforeInOfficeException {

        SysAppBeforeInOffice sysAppBeforeInOffice=new SysAppBeforeInOffice();
        sysAppBeforeInOffice.setId(appBeforeInOfficeVO.getId());
        sysAppBeforeInOffice.setCandidateName(appBeforeInOfficeVO.getCandidateName());
        sysAppBeforeInOffice.setUnit(appBeforeInOfficeVO.getUnit());
        sysAppBeforeInOffice.setPosition(appBeforeInOfficeVO.getPosition());
        sysAppBeforeInOffice.setApprovalDate(appBeforeInOfficeVO.getApprovalDate());
        sysAppBeforeInOffice.setApprovalNumber(appBeforeInOfficeVO.getApprovalNumber());
        sysAppBeforeInOffice.setReplyDate(appBeforeInOfficeVO.getReplyDate());
        sysAppBeforeInOffice.setPass(appBeforeInOfficeVO.getPass());
        sysAppBeforeInOffice.setReplyNumber(appBeforeInOfficeVO.getReplyNumber());
        sysAppBeforeInOffice.setReplyData(appBeforeInOfficeVO.getReplyData());

        System.out.println("7777"+appBeforeInOfficeVO.getPosition()+"888"+appBeforeInOfficeVO.getReplyDate());
        System.out.println("$$$$"+sysAppBeforeInOffice);

        //判断是否在数据已经存在该数据记录的ID
        SysAppBeforeInOfficeExample sysAppBeforeInOfficeExample = new SysAppBeforeInOfficeExample();
        sysAppBeforeInOfficeExample.createCriteria().andIdEqualTo(appBeforeInOfficeVO.getId());
        Long count = sysAppBeforeInOfficeMapper.countByExample(sysAppBeforeInOfficeExample);
        if(count >0){//更新
            sysAppBeforeInOffice.setUpdateTime(new Date());
            sysAppBeforeInOfficeMapper.updateByPrimaryKeySelective(sysAppBeforeInOffice);
        }else {//插入
            sysAppBeforeInOffice.setCreationTime(new Date());

            sysAppBeforeInOfficeMapper.insertSelective(sysAppBeforeInOffice);
        }
    }

    @Override
    public void updateflow(List<AppBeforeInOfficeVO> appBeforeInOfficeVOList) throws AppBeforeInOfficeException {

        for(int i=0;i<appBeforeInOfficeVOList.size();i++){
            SysAppBeforeInOffice sysAppBeforeInOffice = queryAppBeforeInOffice(appBeforeInOfficeVOList.get(i).getId());
            SysFlow sysFlow = new SysFlow();
            sysFlow.setAppBeforeInOfficeId(sysAppBeforeInOffice.getId());
            sysFlow.setStep12("12");
            if(sysAppBeforeInOffice.getUpdateTime()==null){
                sysFlow.setAppBeforeInOfficeResult(new SimpleDateFormat("yyyy-MM-dd").format(sysAppBeforeInOffice.getCreationTime()));
            }else{
                sysFlow.setAppBeforeInOfficeResult(new SimpleDateFormat("yyyy-MM-dd").format(sysAppBeforeInOffice.getUpdateTime()));
            }
            sysAppBeforeInOfficeMapper.updateflow(sysFlow);
        }
    }

    @Override
    public SysAppBeforeInOffice queryAppBeforeInOffice(Long id) throws AppBeforeInOfficeException {
        return sysAppBeforeInOfficeMapper.selectByPrimaryKey(id);
    }

}

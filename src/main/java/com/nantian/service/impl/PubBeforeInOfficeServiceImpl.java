package com.nantian.service.impl;


import com.nantian.common.util.CollectionUtils;
import com.nantian.entity.sys.SysFlow;
import com.nantian.entity.sys.SysPubBeforeInOffice;
import com.nantian.entity.sys.SysPubBeforeInOfficeExample;
import com.nantian.exception.PubBeforeInOfficeException;
import com.nantian.mapper.sys.SysPubBeforeInOfficeMapper;
import com.nantian.service.PubBeforeInOfficeService;
import com.nantian.vo.PubBeforeInOfficeVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class PubBeforeInOfficeServiceImpl implements PubBeforeInOfficeService {

    private static Logger log= LoggerFactory.getLogger(PubBeforeInOfficeServiceImpl.class);

    @Autowired
    SysPubBeforeInOfficeMapper sysPubBeforeInOfficeMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void add(PubBeforeInOfficeVO pubBeforeInOfficeVO) throws PubBeforeInOfficeException {

        SysPubBeforeInOffice sysPubBeforeInOffice=new SysPubBeforeInOffice();

        sysPubBeforeInOffice.setId(pubBeforeInOfficeVO.getId());
        sysPubBeforeInOffice.setCandidateName(pubBeforeInOfficeVO.getCandidateName());
        sysPubBeforeInOffice.setUnit(pubBeforeInOfficeVO.getUnit());
        sysPubBeforeInOffice.setPublicStartTime(pubBeforeInOfficeVO.getPublicStartTime());
        sysPubBeforeInOffice.setPublicEndTime(pubBeforeInOfficeVO.getPublicEndTime());
        sysPubBeforeInOffice.setPublicType(pubBeforeInOfficeVO.getPublicType());
        sysPubBeforeInOffice.setPublicResult(pubBeforeInOfficeVO.getPublicResult());
        sysPubBeforeInOffice.setPublicData(pubBeforeInOfficeVO.getPublicData());
        sysPubBeforeInOffice.setPublicProVerCon(pubBeforeInOfficeVO.getPublicProVerCon());
        sysPubBeforeInOffice.setProstionRecuperative(pubBeforeInOfficeVO.getProstionRecuperative());

        //判断是否在数据已经存在该数据记录的ID
        SysPubBeforeInOfficeExample sysPubBeforeInOfficeExample = new SysPubBeforeInOfficeExample();
        sysPubBeforeInOfficeExample.createCriteria().andIdEqualTo(pubBeforeInOfficeVO.getId());
        Long count = sysPubBeforeInOfficeMapper.countByExample(sysPubBeforeInOfficeExample);
        if(count >0){//更新
            sysPubBeforeInOffice.setUpdateTime(new Date());
            sysPubBeforeInOfficeMapper.updateByPrimaryKeySelective(sysPubBeforeInOffice);
        }else {//插入
            sysPubBeforeInOffice.setCreationTime(new Date());

            sysPubBeforeInOfficeMapper.insertSelective(sysPubBeforeInOffice);
        }

    }



    @Transactional(rollbackFor = Exception.class)
    @Override
    public void updateflow(PubBeforeInOfficeVO pubBeforeInOfficeVO) {


        SysPubBeforeInOffice sysPubBeforeInOffice=sysPubBeforeInOfficeMapper.selectByPrimaryKey(pubBeforeInOfficeVO.getId());


        SysFlow sysFlow = new SysFlow();

        sysFlow.setPubBeforeInOfficeId(sysPubBeforeInOffice.getId());

        if(sysPubBeforeInOffice.getUpdateTime()==null||"".equals(sysPubBeforeInOffice.getUpdateTime())){
            sysFlow.setPubBeforeInOfficeResult(new SimpleDateFormat("yyyy-MM-dd").format(sysPubBeforeInOffice.getCreationTime()));
        }else {
            sysFlow.setPubBeforeInOfficeResult(new SimpleDateFormat("yyyy-MM-dd").format(sysPubBeforeInOffice.getUpdateTime()));
        }

        sysFlow.setStep10("10");

        sysPubBeforeInOfficeMapper.updateflow(sysFlow);

    }

    @Override
    public SysPubBeforeInOffice queryById(Long id) throws PubBeforeInOfficeException {

        SysPubBeforeInOfficeExample example=new SysPubBeforeInOfficeExample();
        example.createCriteria().andIdEqualTo(id);
        List<SysPubBeforeInOffice> sysPubBeforeInOfficeList = sysPubBeforeInOfficeMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(sysPubBeforeInOfficeList)) {
            return null;
        }
        return sysPubBeforeInOfficeList.get(0);

    }
}

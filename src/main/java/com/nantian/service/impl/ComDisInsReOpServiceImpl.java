package com.nantian.service.impl;

import com.nantian.common.util.CollectionUtils;
import com.nantian.entity.sys.SysComDisInsReOp;
import com.nantian.entity.sys.SysComDisInsReOpExample;
import com.nantian.entity.sys.SysFlow;
import com.nantian.exception.SysComDisInsReOpException;
import com.nantian.mapper.sys.SysComDisInsReOpMapper;
import com.nantian.service.ComDisInsReOpService;
import com.nantian.vo.ComDisInsReOpVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ComDisInsReOpServiceImpl implements ComDisInsReOpService {

    private static Logger log = LoggerFactory.getLogger(ComDisInsReOpServiceImpl.class);

    @Autowired
    SysComDisInsReOpMapper sysComDisInsReOpMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void add(ComDisInsReOpVO comDisInsReOpVO) throws SysComDisInsReOpException {

        SysComDisInsReOp sysComDisInsReOp = new SysComDisInsReOp();

        sysComDisInsReOp.setId(comDisInsReOpVO.getId());
        sysComDisInsReOp.setCandidateName(comDisInsReOpVO.getCandidateName());
        sysComDisInsReOp.setReplyTime(comDisInsReOpVO.getReplyTime());
        sysComDisInsReOp.setReplyOpinion(comDisInsReOpVO.getReplyOpinion());
        sysComDisInsReOp.setReplyNumber(comDisInsReOpVO.getReplyNumber());
        sysComDisInsReOp.setReplyData(comDisInsReOpVO.getReplyData());

        sysComDisInsReOp.setCreationTime(new Date());

        sysComDisInsReOpMapper.insertSelective(sysComDisInsReOp);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void update(ComDisInsReOpVO comDisInsReOpVO) {

        SysComDisInsReOp sysComDisInsReOp = new SysComDisInsReOp();

        sysComDisInsReOp.setId(comDisInsReOpVO.getId());
        sysComDisInsReOp.setCandidateName(comDisInsReOpVO.getCandidateName());
        sysComDisInsReOp.setReplyTime(comDisInsReOpVO.getReplyTime());
        sysComDisInsReOp.setReplyOpinion(comDisInsReOpVO.getReplyOpinion());
        sysComDisInsReOp.setReplyNumber(comDisInsReOpVO.getReplyNumber());
        sysComDisInsReOp.setReplyData(comDisInsReOpVO.getReplyData());

        sysComDisInsReOp.setUpdateTime(new Date());

        sysComDisInsReOpMapper.updateByPrimaryKeySelective(sysComDisInsReOp);


    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void updateflow(ComDisInsReOpVO comDisInsReOpVO) {

        SysComDisInsReOp sysComDisInsReOp = sysComDisInsReOpMapper.selectByPrimaryKey(comDisInsReOpVO.getId());

        SysFlow sysFlow = new SysFlow();

        sysFlow.setComDisInsReOpId(sysComDisInsReOp.getId());

        if (sysComDisInsReOp.getUpdateTime() == null || "".equals(sysComDisInsReOp.getUpdateTime())) {
            sysFlow.setComDisInsReOpResult(new SimpleDateFormat("yyyy-MM-dd").format(sysComDisInsReOp.getCreationTime()));
        } else {
            sysFlow.setComDisInsReOpResult(new SimpleDateFormat("yyyy-MM-dd").format(sysComDisInsReOp.getUpdateTime()));
        }
        sysFlow.setStep7("7");

        sysComDisInsReOpMapper.updateflow(sysFlow);

    }

    @Override
    public SysComDisInsReOp queryById(Long id) throws SysComDisInsReOpException {
        SysComDisInsReOpExample example = new SysComDisInsReOpExample();
        example.createCriteria().andIdEqualTo(id);
        List<SysComDisInsReOp> inspectArchivesList = sysComDisInsReOpMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(inspectArchivesList)) {
            return null;
        }
        return inspectArchivesList.get(0);
    }

}

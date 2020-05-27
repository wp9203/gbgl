package com.nantian.service.impl;

import com.nantian.entity.sys.SysDemocracyInsRe;
import com.nantian.entity.sys.SysDemocracyInsReExample;
import com.nantian.entity.sys.SysFlow;
import com.nantian.entity.sys.SysUser;
import com.nantian.exception.DemocracyInsReException;
import com.nantian.mapper.sys.SysDemocracyInsReMapper;
import com.nantian.mapper.sys.SysFlowMapper;
import com.nantian.mapper.sys.SysUserMapper;
import com.nantian.service.DemocracyInsReService;
import com.nantian.service.UserService;
import com.nantian.util.SnowflakeIdUtils;
import com.nantian.vo.DemocracyInsReVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class DemocracyInsReServiceImpl implements DemocracyInsReService {

    private static Logger log = LoggerFactory.getLogger(DemocracyInsReServiceImpl.class);

    @Autowired
    SysDemocracyInsReMapper sysDemocracyInsReMapper;

    @Autowired
    SysFlowMapper sysFlowMapper;

    @Autowired
    UserService userService;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void add(DemocracyInsReVO democracyInsReVO) throws DemocracyInsReException {

        String username=democracyInsReVO.getCandidateName();

        System.out.println(username+"修改￥￥￥");


        SysDemocracyInsReExample sysDemocracyInsReExample=new SysDemocracyInsReExample();
        sysDemocracyInsReExample.createCriteria().andCandidateNameEqualTo(username);
        Long count=sysDemocracyInsReMapper.countByExample(sysDemocracyInsReExample);
        SysDemocracyInsRe sysDemocracyInsRe=new SysDemocracyInsRe();
        if (count > 0) {
            SysDemocracyInsRe sysDemocracyInsRe_1=getDemocracyInsReByname(username);
            sysDemocracyInsRe.setId(sysDemocracyInsRe_1.getId());

            sysDemocracyInsRe.setCandidateName(democracyInsReVO.getCandidateName());
            sysDemocracyInsRe.setInspectTime(democracyInsReVO.getInspectTime());
            sysDemocracyInsRe.setInspectTeamMember(democracyInsReVO.getInspectTeamMember());
            sysDemocracyInsRe.setMeetingScope(democracyInsReVO.getMeetingScope());
            sysDemocracyInsRe.setDueNumber(democracyInsReVO.getDueNumber());
            sysDemocracyInsRe.setActualNumber(democracyInsReVO.getActualNumber());
            sysDemocracyInsRe.setTotalValidVotes(democracyInsReVO.getTotalValidVotes());
            sysDemocracyInsRe.setVote(democracyInsReVO.getVote());
            sysDemocracyInsRe.setConScope(democracyInsReVO.getConScope());
            sysDemocracyInsRe.setConDueNumber(democracyInsReVO.getConDueNumber());
            sysDemocracyInsRe.setConActualNumber(democracyInsReVO.getConActualNumber());
            sysDemocracyInsRe.setRecommendNumber(democracyInsReVO.getRecommendNumber());
            sysDemocracyInsRe.setInspectData(democracyInsReVO.getInspectData());
            sysDemocracyInsRe.setDelayInspectData(democracyInsReVO.getDelayInspectData());

            sysDemocracyInsRe.setUpdateTime(new Date());

            System.out.println(sysDemocracyInsRe+"修改888");

            sysDemocracyInsReMapper.updateByPrimaryKeySelective(sysDemocracyInsRe);
        }else {
            SysUser user = userService.getUserByname(username);
            System.out.println(user + "999");
            Long id = user.getId();
            sysDemocracyInsRe.setId(id);
            sysDemocracyInsRe.setCandidateName(democracyInsReVO.getCandidateName());
            sysDemocracyInsRe.setInspectTime(democracyInsReVO.getInspectTime());
            sysDemocracyInsRe.setInspectTeamMember(democracyInsReVO.getInspectTeamMember());
            sysDemocracyInsRe.setMeetingScope(democracyInsReVO.getMeetingScope());
            sysDemocracyInsRe.setDueNumber(democracyInsReVO.getDueNumber());
            sysDemocracyInsRe.setActualNumber(democracyInsReVO.getActualNumber());
            sysDemocracyInsRe.setTotalValidVotes(democracyInsReVO.getTotalValidVotes());
            sysDemocracyInsRe.setVote(democracyInsReVO.getVote());
            sysDemocracyInsRe.setConScope(democracyInsReVO.getConScope());
            sysDemocracyInsRe.setConDueNumber(democracyInsReVO.getConDueNumber());
            sysDemocracyInsRe.setConActualNumber(democracyInsReVO.getConActualNumber());
            sysDemocracyInsRe.setRecommendNumber(democracyInsReVO.getRecommendNumber());
            sysDemocracyInsRe.setInspectData(democracyInsReVO.getInspectData());
            sysDemocracyInsRe.setDelayInspectData(democracyInsReVO.getDelayInspectData());

            sysDemocracyInsRe.setCreationTime(new Date());
            System.out.println(sysDemocracyInsRe + "777");
            sysDemocracyInsReMapper.insertSelective(sysDemocracyInsRe);
        }

    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void update(DemocracyInsReVO democracyInsReVO) {

        SysDemocracyInsRe sysDemocracyInsRe=new SysDemocracyInsRe();
        sysDemocracyInsRe.setId(democracyInsReVO.getId());
        sysDemocracyInsRe.setCandidateName(democracyInsReVO.getCandidateName());
        sysDemocracyInsRe.setInspectTime(democracyInsReVO.getInspectTime());
        sysDemocracyInsRe.setInspectTeamMember(democracyInsReVO.getInspectTeamMember());
        sysDemocracyInsRe.setMeetingScope(democracyInsReVO.getMeetingScope());
        sysDemocracyInsRe.setDueNumber(democracyInsReVO.getDueNumber());
        sysDemocracyInsRe.setActualNumber(democracyInsReVO.getActualNumber());
        sysDemocracyInsRe.setTotalValidVotes(democracyInsReVO.getTotalValidVotes());
        sysDemocracyInsRe.setVote(democracyInsReVO.getVote());
        sysDemocracyInsRe.setConScope(democracyInsReVO.getConScope());
        sysDemocracyInsRe.setConDueNumber(democracyInsReVO.getConDueNumber());
        sysDemocracyInsRe.setConActualNumber(democracyInsReVO.getConActualNumber());
        sysDemocracyInsRe.setRecommendNumber(democracyInsReVO.getRecommendNumber());
        sysDemocracyInsRe.setInspectData(democracyInsReVO.getInspectData());
        sysDemocracyInsRe.setDelayInspectData(democracyInsReVO.getDelayInspectData());

        sysDemocracyInsRe.setUpdateTime(new Date());

        System.out.println(sysDemocracyInsRe+"888");

        sysDemocracyInsReMapper.updateByPrimaryKeySelective(sysDemocracyInsRe);

    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void updateflow(DemocracyInsReVO democracyInsReVO) {

        SysDemocracyInsRe sysDemocracyInsRe=sysDemocracyInsReMapper.selectByPrimaryKey(democracyInsReVO.getId());

        SysFlow sysFlow=new SysFlow();
        sysFlow.setId(democracyInsReVO.getFlowid());
        sysFlow.setDemocracyInsReId(sysDemocracyInsRe.getId());
        if(sysDemocracyInsRe.getUpdateTime()==null||"".equals(sysDemocracyInsRe.getUpdateTime())){
            sysFlow.setDemocracyInsReResult(new SimpleDateFormat("yyyy-MM-dd").format(sysDemocracyInsRe.getCreationTime()));
        }else{
            sysFlow.setDemocracyInsReResult(new SimpleDateFormat("yyyy-MM-dd").format(sysDemocracyInsRe.getUpdateTime()));
        }
        sysFlow.setStep5("5");

        sysDemocracyInsReMapper.updateflow(sysFlow);

    }

    @Override
    public SysDemocracyInsRe getDemocracyInsRe(Long Id) {

        return sysDemocracyInsReMapper.selectByPrimaryKey(Id);
    }

    @Override
    public SysDemocracyInsRe getDemocracyInsReByname(String name) {

        SysDemocracyInsReExample sysDemocracyInsRe=new SysDemocracyInsReExample();
        sysDemocracyInsRe.createCriteria().andCandidateNameEqualTo(name);

        List<SysDemocracyInsRe> sysDemocracyInsRes =sysDemocracyInsReMapper.selectByExample(sysDemocracyInsRe);

        SysDemocracyInsRe sysDemocracyInsRe1=sysDemocracyInsRes.get(0);

        return sysDemocracyInsRe1;
    }
}

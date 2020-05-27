package com.nantian.controller;


import com.nantian.common.util.StringUtils;
import com.nantian.easytrade.annotation.ParameterObject;
import com.nantian.easytrade.annotation.Push;
import com.nantian.easytrade.annotation.Trade;
import com.nantian.easytrade.enumeration.ParamFormatEnum;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.entity.sys.*;
import com.nantian.enumeration.ErrorCodeEnum;
import com.nantian.exception.FirstMotionException;
import com.nantian.mapper.sys.SysFirstMotionMapper;
import com.nantian.service.FirstMotionService;
import com.nantian.service.FlowService;
import com.nantian.service.UserService;
import com.nantian.vo.FirstMotionVO;
import com.nantian.vo.ListFirstMotionVO;
import com.nantian.vo.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

@Trade(channel = "api", transCode = "firstmotion")
public class FirstMotionController {

    private static Logger log= LoggerFactory.getLogger(FirstMotionController.class);

    @Autowired
    FirstMotionService firstMotionService;

    @Autowired
    UserService userService;

    @Autowired
    SysFirstMotionMapper sysFirstMotionMapper;


    /**
     * 添加一个动议
     * @param context 应用上下文
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void add(ApplicationContext context, @ParameterObject ListFirstMotionVO listFirstMotionVO ) throws FirstMotionException {
        System.out.println(listFirstMotionVO+"&&&&&&&&");
        System.out.println(listFirstMotionVO.getReq()+"%%%%%");
//        if (StringUtils.isNotBlank(listFirstMotionVO.getReq().getSignFileName())){
//            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(),"签报未上传");
//            return;
//        }
//        if(StringUtils.isNotBlank(listFirstMotionVO.getReq().getSummaryFileName())){
//            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(),"纪要未上传");
//        }
        FirstMotionVO firstMotionVO=new FirstMotionVO();
        for (int i=0;i<listFirstMotionVO.getInfos().size();i++){
            //查询是否存在记录
            SysFirstMotionExample sysFirstMotionExample=new SysFirstMotionExample();
            sysFirstMotionExample.createCriteria().andIdEqualTo(listFirstMotionVO.getInfos().get(i).getId());
            Long count=sysFirstMotionMapper.countByExample(sysFirstMotionExample);
            if(count>0){
                firstMotionVO.setId(listFirstMotionVO.getInfos().get(i).getId());
                firstMotionVO.setCandidateName(listFirstMotionVO.getInfos().get(i).getCandidateName());
                firstMotionVO.setAdjustType(listFirstMotionVO.getInfos().get(i).getAdjustType());
                firstMotionVO.setAspiringUnit(listFirstMotionVO.getInfos().get(i).getAspiringUnit());
                firstMotionVO.setAspiringPosition(listFirstMotionVO.getInfos().get(i).getAspiringPosition());
                firstMotionVO.setAspiringPositionLevel(listFirstMotionVO.getInfos().get(i).getAspiringPositionLevel());
                firstMotionVO.setNote(listFirstMotionVO.getInfos().get(i).getNote());
                firstMotionVO.setPass(listFirstMotionVO.getInfos().get(i).getPass());
                firstMotionVO.setMeetingDate(listFirstMotionVO.getReq().getMeetingDate());
                firstMotionVO.setHost(listFirstMotionVO.getReq().getHost());
                firstMotionVO.setDueNumber(listFirstMotionVO.getReq().getDueNumber());
                firstMotionVO.setActualNumber(listFirstMotionVO.getReq().getActualNumber());
                firstMotionVO.setSummaryNumber(listFirstMotionVO.getReq().getSummaryNumber());
                firstMotionVO.setSignFileName(listFirstMotionVO.getReq().getSignFileName());
                firstMotionVO.setSummaryFileName(listFirstMotionVO.getReq().getSummaryFileName());
                System.out.println(firstMotionVO+"修改777");
                firstMotionService.update(firstMotionVO);
            }else {
                firstMotionVO.setId(listFirstMotionVO.getInfos().get(i).getId());
                firstMotionVO.setCandidateName(listFirstMotionVO.getInfos().get(i).getCandidateName());
                firstMotionVO.setAdjustType(listFirstMotionVO.getInfos().get(i).getAdjustType());
                firstMotionVO.setAspiringUnit(listFirstMotionVO.getInfos().get(i).getAspiringUnit());
                firstMotionVO.setAspiringPosition(listFirstMotionVO.getInfos().get(i).getAspiringPosition());
                firstMotionVO.setAspiringPositionLevel(listFirstMotionVO.getInfos().get(i).getAspiringPositionLevel());
                firstMotionVO.setNote(listFirstMotionVO.getInfos().get(i).getNote());
                firstMotionVO.setPass(listFirstMotionVO.getInfos().get(i).getPass());
                firstMotionVO.setMeetingDate(listFirstMotionVO.getReq().getMeetingDate());
                firstMotionVO.setHost(listFirstMotionVO.getReq().getHost());
                firstMotionVO.setDueNumber(listFirstMotionVO.getReq().getDueNumber());
                firstMotionVO.setActualNumber(listFirstMotionVO.getReq().getActualNumber());
                firstMotionVO.setSummaryNumber(listFirstMotionVO.getReq().getSummaryNumber());
                firstMotionVO.setSignFileName(listFirstMotionVO.getReq().getSignFileName());
                firstMotionVO.setSummaryFileName(listFirstMotionVO.getReq().getSummaryFileName());
//                System.out.println(firstMotionVO+"新增777");
                try {
                    firstMotionService.add(firstMotionVO);
                } catch (FirstMotionException e) {
                    context.setErrorMsg(ErrorCodeEnum.ERROR.getErrcode(), ErrorCodeEnum.ERROR.getErrmsg());
                    log.error(e.getMessage(), e);
                }
            }
        }
    }

    /**
     * 获取指定动议的信息
     * @param context 应用上下文
     * @param Id 动议id
     */
    @Push
    public void getFirstMotion(ApplicationContext context, Long Id) {
        if (Id == null || Id == 0) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "动议的id不能为空");
            return;
        }
        SysFirstMotion sysFirstMotion=firstMotionService.getFirstMotion(Id);
        if (sysFirstMotion == null) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "指不到指定的动议");
            return;
        }
        context.setRstObject("data", sysFirstMotion);

    }

    /**
     * 提交动议
     * @param context 应用上下文
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void update(ApplicationContext context, @ParameterObject ListFirstMotionVO listFirstMotionVO ) throws FirstMotionException {
        System.out.println(listFirstMotionVO + "&&&&&&&&");
        System.out.println(listFirstMotionVO.getReq() + "%%%%%");

        FirstMotionVO firstMotionVO=new FirstMotionVO();
        for (int i=0;i<listFirstMotionVO.getInfos().size();i++){
            firstMotionVO.setId(listFirstMotionVO.getInfos().get(i).getId());
//            firstMotionVO.setCandidateName(listFirstMotionVO.getInfos().get(i).getCandidateName());
//            firstMotionVO.setAdjustType(listFirstMotionVO.getInfos().get(i).getAdjustType());
//            firstMotionVO.setAspiringUnit(listFirstMotionVO.getInfos().get(i).getAspiringUnit());
//            firstMotionVO.setAspiringPosition(listFirstMotionVO.getInfos().get(i).getAspiringPosition());
//            firstMotionVO.setAspiringPositionLevel(listFirstMotionVO.getInfos().get(i).getAspiringPositionLevel());
//            firstMotionVO.setNote(listFirstMotionVO.getInfos().get(i).getNote());
//            firstMotionVO.setPass(listFirstMotionVO.getInfos().get(i).getPass());
//            firstMotionVO.setMeetingDate(listFirstMotionVO.getReq().getMeetingDate());
//            firstMotionVO.setHost(listFirstMotionVO.getReq().getHost());
//            firstMotionVO.setDueNumber(listFirstMotionVO.getReq().getDueNumber());
//            firstMotionVO.setActualNumber(listFirstMotionVO.getReq().getActualNumber());
//            firstMotionVO.setSummaryNumber(listFirstMotionVO.getReq().getSummaryNumber());
//            firstMotionVO.setSignFileName(listFirstMotionVO.getReq().getSignFileName());
//            firstMotionVO.setSummaryFileName(listFirstMotionVO.getReq().getSummaryFileName());
            firstMotionService.updateflow(firstMotionVO);
        }

    }

    @Push(requestFormat = ParamFormatEnum.JSON)
    public void queryByIds(ApplicationContext context, @ParameterObject FirstMotionVO firstMotionVO)throws FirstMotionException {

        List<SysFirstMotion> sysFirstMotionList=new ArrayList<>();
        List<SysFirstMotion> sysFirstMotionList1=new ArrayList<>();

        List<Long> ids = firstMotionVO.getIds();
        for(int i = 0 ;i<ids.size();i++) {
            Long id = ids.get(i);
            SysFirstMotion sysFirstMotion=firstMotionService.getFirstMotion(id);
            if(sysFirstMotion!=null){
                sysFirstMotionList1.add(sysFirstMotion);
            }
        }

        List<SysFirstMotion> sysFirstMotionList2=new ArrayList<>();
        for(int i = 0 ;i<ids.size();i++) {
            Long id = ids.get(i);
            SysUser user = userService.getUser(id);

            SysFirstMotion sysFirstMotion=new SysFirstMotion();

            sysFirstMotion.setId(user.getId());
            sysFirstMotion.setCandidateName(user.getName());
            sysFirstMotion.setAspiringUnit(user.getCompany());
            sysFirstMotion.setAspiringPosition(user.getPosition());
            sysFirstMotion.setAspiringPosition(user.getPositionLevel());
            sysFirstMotion.setNote(user.getNote());

            System.out.println("sysFirstMotion:"+sysFirstMotion);
            sysFirstMotionList2.add(sysFirstMotion);

        }
        System.out.println("sysFirstMotionList1:"+sysFirstMotionList1+"size():"+sysFirstMotionList1.size());
        if(sysFirstMotionList1.size()>0){
            for(int i =0; i<sysFirstMotionList1.size();i++){//根据集合1 元素的id去删除集合2 中相同id 的元素
                Long id1 = sysFirstMotionList1.get(i).getId();
                for(int k = 0 ;k<sysFirstMotionList1.size();k++){
                    Long id2 = sysFirstMotionList1.get(k).getId();
                    if(id2.equals(id1)){
                        sysFirstMotionList1.remove(k);
                        k--;
                    }
                }
            }

            System.out.println("集合2的长度："+sysFirstMotionList2.size());
            //合并两个集合 list2 与 sysInspectArchivesList;
            sysFirstMotionList.addAll(sysFirstMotionList1);
            if(sysFirstMotionList2.size()>0){
                sysFirstMotionList.addAll(sysFirstMotionList2);
            }
            System.out.println("合并："+sysFirstMotionList);
        }else{
            sysFirstMotionList.addAll(sysFirstMotionList2);

        }
        System.out.println(sysFirstMotionList);
        context.setRstObject("data", sysFirstMotionList);
    }

    /**
     * 获取指定流程的信息
     * @param context 应用上下文
     * @param id 动议id
     */
    @Push
    public void getFlowById(ApplicationContext context, Long id) {
        if (id == null || id == 0) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "动议id不能为空");
            return;
        }
        SysFlow sysFlow=firstMotionService.getFlowById(id);
        if (sysFlow == null) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "指不到指定的流程");
            return;
        }
        context.setRstObject("data", sysFlow);
    }
}

package com.nantian.controller;

import com.nantian.common.util.StringUtils;
import com.nantian.easytrade.annotation.ParameterObject;
import com.nantian.easytrade.annotation.Push;
import com.nantian.easytrade.annotation.Trade;
import com.nantian.easytrade.enumeration.ParamFormatEnum;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.entity.sys.SysDemocracyInsRe;
import com.nantian.entity.sys.SysFlow;
import com.nantian.entity.sys.SysUser;
import com.nantian.enumeration.ErrorCodeEnum;
import com.nantian.exception.DemocracyInsReException;

import com.nantian.service.DemocracyInsReService;
import com.nantian.service.FlowService;
import com.nantian.service.UserService;
import com.nantian.vo.DemocracyInsReVO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


@Trade(channel = "api", transCode = "democracyinsre")
public class DemocracyInsReController {

    private static Logger log= LoggerFactory.getLogger(DemocracyInsReController.class);

    @Autowired
    DemocracyInsReService democracyInsReService;

    @Autowired
    FlowService flowService;

    @Autowired
    UserService userService;

    /**
     * 民主推荐与考察新增
     * @param context 应用上下文
     * @param democracyInsReVO 民主推荐与考察信息
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void add(ApplicationContext context, @ParameterObject DemocracyInsReVO democracyInsReVO) throws DemocracyInsReException {

        System.out.println(democracyInsReVO + "&&&");

        try {
            democracyInsReService.add(democracyInsReVO);
        } catch (DemocracyInsReException e) {
            context.setErrorMsg(ErrorCodeEnum.ERROR.getErrcode(), ErrorCodeEnum.ERROR.getErrmsg());
            log.error(e.getMessage(), e);
        }
    }
        //当输入的名字为用户表的用户时 不会报错
//        if (democracyInsReVO.getId() == null ||"".equals(democracyInsReVO.getId()) ) {
//
//            if (StringUtils.isBlank(democracyInsReVO.getCandidateName())) {
//                context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "竞聘者不能为空");
//                return;
//            }


//        if (StringUtils.isBlank(democracyInsReVO.getInspectData())) {
//            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "考察材料未上传");
//            return;
//        }
//        if(StringUtils.isNotBlank(democracyInsReVO.getDelayInspectData())){
//            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(),"延生考察材料未上传");
//            return;
//        }


//            try {
//                democracyInsReService.add(democracyInsReVO);
//            } catch (DemocracyInsReException e) {
//                context.setErrorMsg(ErrorCodeEnum.ERROR.getErrcode(), ErrorCodeEnum.ERROR.getErrmsg());
//                log.error(e.getMessage(), e);
//            }
//
//        } else {

//       if (StringUtils.isBlank(democracyInsReVO.getInspectData())) {
//            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "考察材料未上传");
//            return;
//        }
//        if(StringUtils.isNotBlank(democracyInsReVO.getDelayInspectData())){
//            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(),"延生考察材料未上传");
//            return;
//        }
//            democracyInsReService.update(democracyInsReVO);
//
//        }
//    }

    /**
     * 更新流程信息
     * @param context 应用上下文
     * @param democracyInsReVO 需要更新的用户信息
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void updateflow(ApplicationContext context , @ParameterObject DemocracyInsReVO democracyInsReVO) {
        System.out.println(democracyInsReVO+"&&&");
        if (democracyInsReVO.getFlowid() == null || democracyInsReVO.getFlowid() <= 0) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "需要更新的流程id不能为空");
            return;
        }

        String name=democracyInsReVO.getCandidateName();
        SysDemocracyInsRe sysDemocracyInsRe=democracyInsReService.getDemocracyInsReByname(name);
        democracyInsReVO.setId(sysDemocracyInsRe.getId());
        System.out.println(democracyInsReVO+"*************");
        if(democracyInsReVO.getId()==null||democracyInsReVO.getId()<=0){
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "需要更新的民主推荐id不能为空");
            return;
        }
        democracyInsReService.updateflow(democracyInsReVO);
    }

    /**
     * 获取民主推荐人信息
     * @param context 应用上下文
     * @param id 流程iD
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void getDem(ApplicationContext context, Long id) {
        System.out.println(id+"**********");
        if(id==null||id<=0){
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "流程的id为空");
            return;
        }
        SysFlow sysFlow=flowService.getFlow(id);

        Long DemocracyInsReId=sysFlow.getDemocracyInsReId();
        SysDemocracyInsRe sysDemocracyInsRe=new SysDemocracyInsRe();
        if(DemocracyInsReId==null||DemocracyInsReId==0){
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "民主推荐与考察的id为空");
            return;
        }else {
            sysDemocracyInsRe=democracyInsReService.getDemocracyInsRe(DemocracyInsReId);
        }
        System.out.println(sysDemocracyInsRe+"&&&&&&&&&&&");
        context.setRstObject("data", sysDemocracyInsRe);
    }

    /**
     * 获取指定民主推荐与考察的信息
     * @param context 应用上下文
     * @param id 民主推荐与考察id
     */
    @Push
    public void getDemocracyInsRe(ApplicationContext context, Long id) {
        if (id == null || id == 0) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "民族推荐与考察id不能为空");
            return;
        }
        SysDemocracyInsRe sysDemocracyInsRe=democracyInsReService.getDemocracyInsRe(id);
        if (sysDemocracyInsRe == null) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "指不到指定的民族推荐与考察信息");
            return;
        }
        context.setRstObject("data", sysDemocracyInsRe);

    }

    /**
     * 获取指定民主推荐与考察的信息
     * @param context 应用上下文
     * @param name 民主推荐与考察人姓名
     */
    @Push
    public void getDemocracyInsReByname(ApplicationContext context, String name) {
        if (StringUtils.isNotBlank(name) ||"".equals(name)) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "民族推荐与考察姓名不能为空");
            return;
        }
        SysDemocracyInsRe sysDemocracyInsRe=democracyInsReService.getDemocracyInsReByname(name);
        if (sysDemocracyInsRe == null) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "指不到指定的民族推荐与考察信息");
            return;
        }
        context.setRstObject("data", sysDemocracyInsRe);

    }

    /**
     * 根据ID查询表中数据
     * @param context
     * @param democracyInsReVO
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void queryByIds(ApplicationContext context,@ParameterObject DemocracyInsReVO democracyInsReVO)throws DemocracyInsReException {

        Long id=democracyInsReVO.getId();
        System.out.println(id+"*****");

        SysDemocracyInsRe sysDemocracyInsRe=new SysDemocracyInsRe();
        sysDemocracyInsRe=democracyInsReService.getDemocracyInsRe(id);
        System.out.println("sysDemocracyInsRe:777"+sysDemocracyInsRe);

        if (sysDemocracyInsRe!=null){
            context.setRstObject("data", sysDemocracyInsRe);
        }else{
            SysUser sysUser=userService.queryByIds(id);
            System.out.println("sysUser:777"+sysUser);

            SysDemocracyInsRe sysDemocracyInsRe1=new SysDemocracyInsRe();
            sysDemocracyInsRe1.setId(sysUser.getId());
            sysDemocracyInsRe1.setCandidateName(sysUser.getName());
            context.setRstObject("data", sysDemocracyInsRe1);

        }
        }

}

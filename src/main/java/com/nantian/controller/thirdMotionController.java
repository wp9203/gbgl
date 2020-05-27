package com.nantian.controller;


import com.nantian.common.util.StringUtils;
import com.nantian.easytrade.annotation.ParameterObject;
import com.nantian.easytrade.annotation.Push;
import com.nantian.easytrade.annotation.Trade;
import com.nantian.easytrade.enumeration.ParamFormatEnum;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.entity.sys.SysThirdMotion;
import com.nantian.entity.sys.SysThirdMotionExample;
import com.nantian.entity.sys.SysUser;
import com.nantian.enumeration.ErrorCodeEnum;
import com.nantian.exception.ThirdMotionException;
import com.nantian.mapper.sys.SysThirdMotionMapper;
import com.nantian.service.ThirdMotionService;
import com.nantian.service.UserService;
import com.nantian.vo.ThirdMotionVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>ClassName: UserController</p>
 * <p>Description: 三次上会</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2020-05-13</p>
 *
 * @author
 * @version 1.0
 */

@Trade(channel = "api", transCode = "thirdmotion")
public class thirdMotionController {

    private static Logger log= LoggerFactory.getLogger(thirdMotionController.class);

    @Autowired
    ThirdMotionService thirdMotionService;

    @Autowired
    UserService userService;

    @Autowired
    SysThirdMotionMapper sysThirdMotionMapper;

    @Push(requestFormat = ParamFormatEnum.JSON)
    public void queryByIds(ApplicationContext context, @ParameterObject ThirdMotionVO thirdMotionVO)throws ThirdMotionException {

        List<SysThirdMotion> sysThirdMotionList=new ArrayList<>();
        List<SysThirdMotion> sysThirdMotionList1=new ArrayList<>();

        List<Long> ids = thirdMotionVO.getIds();
        for(int i = 0 ;i<ids.size();i++) {
            Long id = ids.get(i);
            SysThirdMotion sysThirdMotion=thirdMotionService.queryById(id);
            if(sysThirdMotion!=null){
                sysThirdMotionList1.add(sysThirdMotion);
            }
        }

        List<SysThirdMotion> sysThirdMotionList2=new ArrayList<>();
        for(int i = 0 ;i<ids.size();i++) {
            Long id = ids.get(i);
            SysUser user = userService.getUser(id);
            SysThirdMotion sysThirdMotion=new SysThirdMotion();

            sysThirdMotion.setId(user.getId());
            sysThirdMotion.setCandidateName(user.getName());
            sysThirdMotion.setUnit(user.getCompany());
            sysThirdMotion.setPosition(user.getPosition());
            sysThirdMotion.setPositionLevel(user.getPositionLevel());

            System.out.println("sysThirdMotion:"+sysThirdMotion);
            sysThirdMotionList2.add(sysThirdMotion);

        }
        System.out.println("sysThirdMotionList1:"+sysThirdMotionList1+"size():"+sysThirdMotionList1.size());
        if(sysThirdMotionList1.size()>0){
            for(int i =0; i<sysThirdMotionList1.size();i++){//根据集合1 元素的id去删除集合2 中相同id 的元素
                Long id1 = sysThirdMotionList1.get(i).getId();
                for(int k = 0 ;k<sysThirdMotionList2.size();k++){
                    Long id2 = sysThirdMotionList2.get(k).getId();
                    if(id2.equals(id1)){
                        sysThirdMotionList2.remove(k);
                        k--;
                    }
                }
            }

            System.out.println("集合2的长度："+sysThirdMotionList2.size());
            //合并两个集合 list2 与 sysInspectArchivesList;
            sysThirdMotionList.addAll(sysThirdMotionList1);
            if(sysThirdMotionList2.size()>0){
                sysThirdMotionList.addAll(sysThirdMotionList2);
            }
            System.out.println("合并："+sysThirdMotionList);
        }else{
            sysThirdMotionList.addAll(sysThirdMotionList2);

        }
        System.out.println(sysThirdMotionList);
        context.setRstObject("data", sysThirdMotionList);
    }

    /**
     * 三次次上会保存
     * @param context 应用上下文
     * @param thirdMotionVO 新增的三次次上会信息
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void add(ApplicationContext context, @ParameterObject ThirdMotionVO thirdMotionVO) throws ThirdMotionException {
        System.out.println("进入方法");
        System.out.println("thirdMotionVO"+thirdMotionVO);
        //1.获取前端传递的参数集合
        ThirdMotionVO thirdMotionVO1=new ThirdMotionVO();
        for (int i=0;i<thirdMotionVO.getInfos().size();i++){
            //查询是否存在记录
            SysThirdMotionExample sysThirdMotionExample=new SysThirdMotionExample();
            sysThirdMotionExample.createCriteria().andIdEqualTo(thirdMotionVO.getInfos().get(i).getId());
            Long count=sysThirdMotionMapper.countByExample(sysThirdMotionExample);

            thirdMotionVO1.setId(thirdMotionVO.getInfos().get(i).getId());
            thirdMotionVO1.setCandidateName(thirdMotionVO.getInfos().get(i).getCandidateName());
            thirdMotionVO1.setUnit(thirdMotionVO.getInfos().get(i).getAspiringUnit());
            thirdMotionVO1.setPosition(thirdMotionVO.getInfos().get(i).getAspiringPosition());
            thirdMotionVO1.setPositionLevel(thirdMotionVO.getInfos().get(i).getAspiringPositionLevel());

            if(StringUtils.isNotBlank(thirdMotionVO.getInfos().get(i).getNote())) {
                thirdMotionVO1.setNote(thirdMotionVO1.getInfos().get(i).getNote());
            }
            if(StringUtils.isNotBlank(thirdMotionVO.getInfos().get(i).getPass())) {
                thirdMotionVO1.setPass(thirdMotionVO.getInfos().get(i).getPass());
            }


            thirdMotionVO1.setMeetingDate(thirdMotionVO.getReq().getMeetingDate());
            thirdMotionVO1.setHost(thirdMotionVO.getReq().getHost());
            thirdMotionVO1.setDueNumber(thirdMotionVO.getReq().getDueNumber());
            thirdMotionVO1.setActualNumber(thirdMotionVO.getReq().getActualNumber());
            thirdMotionVO1.setSummaryNumber(thirdMotionVO.getReq().getSummaryNumber());
            thirdMotionVO1.setSignFileName(thirdMotionVO.getReq().getSignFileName());
            thirdMotionVO1.setSummaryFileName(thirdMotionVO.getReq().getSummaryFileName());

            if(count>0){

                System.out.println(thirdMotionVO1+"修改777");
                thirdMotionService.update(thirdMotionVO1);
            }else {

                System.out.println(thirdMotionVO1+"新增777");
                try {
                    thirdMotionService.add(thirdMotionVO1);
                } catch (ThirdMotionException e) {
                    context.setErrorMsg(ErrorCodeEnum.ERROR.getErrcode(), ErrorCodeEnum.ERROR.getErrmsg());
                    log.error(e.getMessage(), e);
                }
            }
        }


    }

    /**
     * 提交
     * @param context 应用上下文
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void update(ApplicationContext context, @ParameterObject ThirdMotionVO thirdMotionVO ) throws ThirdMotionException {
        System.out.println(thirdMotionVO + "&&&&&&&&");
        System.out.println(thirdMotionVO.getReq() + "%%%%%");



          ThirdMotionVO thirdMotionVO1=new ThirdMotionVO();
        for (int i = 0; i < thirdMotionVO.getInfos().size(); i++) {
            thirdMotionVO1.setId(thirdMotionVO.getInfos().get(i).getId());
            thirdMotionService.updateflow(thirdMotionVO1);
        }
    }

}

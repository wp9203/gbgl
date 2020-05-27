package com.nantian.controller;

import com.nantian.easytrade.annotation.ParameterObject;
import com.nantian.easytrade.annotation.Push;
import com.nantian.easytrade.annotation.Trade;
import com.nantian.easytrade.enumeration.ParamFormatEnum;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.entity.sys.SysPostAppointment;
import com.nantian.entity.sys.SysUser;
import com.nantian.exception.PostAppointmentException;
import com.nantian.service.PostAppointmentService;
import com.nantian.service.UserService;
import com.nantian.vo.PostAppointmentVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>ClassName: PostAppointmentController</p>
 * <p>Description: 发文任免</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2020-05-15</p>
 *
 * @author
 * @version 1.0
 */

@Trade(channel = "api", transCode = "postappointment")
public class PostAppointmentController {

    private static Logger log = LoggerFactory.getLogger(PostAppointmentController.class);

    @Autowired
    PostAppointmentService postAppointmentService;

    @Autowired
    UserService userService;

    @Push(requestFormat = ParamFormatEnum.JSON)
    public void queryByIds(ApplicationContext context, @ParameterObject PostAppointmentVO postAppointmentVO) throws PostAppointmentException {

        System.out.println("***" + postAppointmentVO);
        System.out.println("%%%%%" + postAppointmentVO.getIds());

        List<SysPostAppointment> sysPostAppointmentList = new ArrayList<>();
        List<SysPostAppointment> sysPostAppointmentList1 = new ArrayList<>();

        List<Long> ids = postAppointmentVO.getIds();
        for (int i = 0; i < ids.size(); i++) {
            Long id = ids.get(i);
            SysPostAppointment sysPostAppointment = postAppointmentService.queryById(id);

            if (sysPostAppointment != null) {
                sysPostAppointmentList1.add(sysPostAppointment);
            }
        }

        List<SysPostAppointment> sysPostAppointmentList2 = new ArrayList<>();
        for (int i = 0; i < ids.size(); i++) {
            Long id = ids.get(i);
            SysUser user = userService.getUser(id);

            SysPostAppointment sysPostAppointment = new SysPostAppointment();

            sysPostAppointment.setId(user.getId());
            sysPostAppointment.setCandidateName(user.getName());
            sysPostAppointment.setUnit(user.getCompany());
            sysPostAppointment.setPosition(user.getPosition());
            sysPostAppointment.setNewPosition(user.getAspiringPosition());

            System.out.println("sysPostAppointment:" + sysPostAppointment);
            sysPostAppointmentList2.add(sysPostAppointment);

        }
        System.out.println("sysPostAppointmentList1:" + sysPostAppointmentList1 + "size():" + sysPostAppointmentList1.size());
        if(sysPostAppointmentList1.size()>0){
            for(int i =0; i<sysPostAppointmentList1.size();i++){//根据集合1 元素的id去删除集合2 中相同id 的元素
                Long id1 = sysPostAppointmentList1.get(i).getId();
                for(int k = 0 ;k<sysPostAppointmentList2.size();k++){
                    Long id2 = sysPostAppointmentList2.get(k).getId();
                    if(id2.equals(id1)){
                        sysPostAppointmentList2.remove(k);
                        k--;
                    }
                }
            }

            System.out.println("集合2的长度：" + sysPostAppointmentList2.size());
            //合并两个集合 list2 与 sysInspectArchivesList;
            sysPostAppointmentList.addAll(sysPostAppointmentList1);
            if (sysPostAppointmentList2.size() > 0) {
                sysPostAppointmentList.addAll(sysPostAppointmentList2);
            }
            System.out.println("合并：" + sysPostAppointmentList);
        } else {
            sysPostAppointmentList.addAll(sysPostAppointmentList2);

        }
        System.out.println(sysPostAppointmentList);
        context.setRstObject("data", sysPostAppointmentList);

    }

    /**
     * 发文任免保存
     *
     * @param context           应用上下文
     * @param postAppointmentVO 新增的发文任免信息
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void add(ApplicationContext context, @ParameterObject PostAppointmentVO postAppointmentVO) throws PostAppointmentException {

        System.out.println("postAppointmentVO777" + postAppointmentVO.getInfos());
//        //1.获取前端传递的参数集合
        List<PostAppointmentVO> list = postAppointmentVO.getInfos();
        for (PostAppointmentVO postAppointmentVO1 : list) {
            postAppointmentService.add(postAppointmentVO1);
        }
    }

    /**
     * 提交
     * @param context
     * @param postAppointmentVO
     * @throws PostAppointmentException
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void updateflow(ApplicationContext context, @ParameterObject PostAppointmentVO postAppointmentVO)throws PostAppointmentException {

        System.out.println("postAppointmentVO777" + postAppointmentVO.getInfos());

        //获取前端传递的参数集合
        List<PostAppointmentVO> list = postAppointmentVO.getInfos();

        //1.判断所有选择人员是否提交材料 且其他字段不为空
        List<SysPostAppointment> sysPostAppointmentList = new ArrayList<>();
        for(PostAppointmentVO postAppointmentVO1:list) {

            //2没有保存直接提交
            for(PostAppointmentVO inspectArchivesVO:list){
                postAppointmentService.add(inspectArchivesVO);
            }
            //更新sys_flow
            postAppointmentService.updateflow(list);
        }

    }
}
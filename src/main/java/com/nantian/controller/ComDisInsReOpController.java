package com.nantian.controller;

import com.nantian.easytrade.annotation.ParameterObject;
import com.nantian.easytrade.annotation.Push;
import com.nantian.easytrade.annotation.Trade;
import com.nantian.easytrade.enumeration.ParamFormatEnum;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.entity.sys.*;
import com.nantian.enumeration.ErrorCodeEnum;

import com.nantian.exception.SysComDisInsReOpException;
import com.nantian.mapper.sys.SysComDisInsReOpMapper;
import com.nantian.service.ComDisInsReOpService;
import com.nantian.service.UserService;
import com.nantian.vo.ComDisInsReOpVO;

import com.nantian.vo.ListComVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

import java.util.List;

/**
 * <p>ClassName: UserController</p>
 * <p>Description: 征求纪委意见 管理控制器</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2020-05-08</p>
 *
 * @author 唐剑波
 * @version 1.0
 */

@Trade(channel = "api", transCode = "comdisinsreop")
public class ComDisInsReOpController {

    private static Logger log = LoggerFactory.getLogger(ComDisInsReOpController.class);

    @Autowired
    SysComDisInsReOpMapper sysComDisInsReOpMapper;

    @Autowired
    ComDisInsReOpService comDisInsReOpService;

    @Autowired
    UserService userService;

    /**
     * 征求纪委意见保存
     * 新增或修改
     *
     * @param context   应用上下文
     * @param listComVO 待保存的信息
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void add(ApplicationContext context, @ParameterObject ListComVO listComVO) throws SysComDisInsReOpException {

        System.out.println("listComVO:777" + listComVO);

        for (int i = 0; i < listComVO.getInfos().size(); i++) {

            ComDisInsReOpVO comDisInsReOpVO = new ComDisInsReOpVO();

            SysComDisInsReOpExample sysComDisInsReOpExample = new SysComDisInsReOpExample();
            sysComDisInsReOpExample.createCriteria().andIdEqualTo(listComVO.getInfos().get(i).getId());
            Long count = sysComDisInsReOpMapper.countByExample(sysComDisInsReOpExample);
            if (count > 0) {
                comDisInsReOpVO.setId(listComVO.getInfos().get(i).getId());
                comDisInsReOpVO.setCandidateName(listComVO.getInfos().get(i).getCandidateName());
                comDisInsReOpVO.setReplyTime(listComVO.getInfos().get(i).getReplyTime());
                comDisInsReOpVO.setReplyOpinion(listComVO.getInfos().get(i).getReplyOpinion());
                comDisInsReOpVO.setReplyNumber(listComVO.getInfos().get(i).getReplyNumber());
                comDisInsReOpVO.setReplyData(listComVO.getInfos().get(i).getReplyData());

                comDisInsReOpService.update(comDisInsReOpVO);
            } else {
                comDisInsReOpVO.setId(listComVO.getInfos().get(i).getId());
                comDisInsReOpVO.setCandidateName(listComVO.getInfos().get(i).getCandidateName());
                comDisInsReOpVO.setReplyTime(listComVO.getInfos().get(i).getReplyTime());
                comDisInsReOpVO.setReplyOpinion(listComVO.getInfos().get(i).getReplyOpinion());
                comDisInsReOpVO.setReplyNumber(listComVO.getInfos().get(i).getReplyNumber());
                comDisInsReOpVO.setReplyData(listComVO.getInfos().get(i).getReplyData());
                try {
                    comDisInsReOpService.add(comDisInsReOpVO);
                } catch (SysComDisInsReOpException e) {
                    context.setErrorMsg(ErrorCodeEnum.ERROR.getErrcode(), ErrorCodeEnum.ERROR.getErrmsg());
                    log.error(e.getMessage(), e);
                }
            }
        }

    }

    /**
     * 征求纪委意见提交
     *
     * @param context   应用上下文
     * @param listComVO 待提交的信息
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void updateflow(ApplicationContext context, @ParameterObject ListComVO listComVO) throws SysComDisInsReOpException {
        System.out.println(listComVO + "&&&&&&&&");

        ComDisInsReOpVO comDisInsReOpVO = new ComDisInsReOpVO();
        for (int i = 0; i < listComVO.getInfos().size(); i++) {
            comDisInsReOpVO.setId(listComVO.getInfos().get(i).getId());
            comDisInsReOpService.updateflow(comDisInsReOpVO);
        }
    }

    /**
     * 根据ID查询表中数据
     *
     * @param context
     * @param comDisInsReOpVO
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void queryByIds(ApplicationContext context, @ParameterObject ComDisInsReOpVO comDisInsReOpVO) throws SysComDisInsReOpException {

        List<SysComDisInsReOp> sysComDisInsReOpList = new ArrayList<>();
        List<SysComDisInsReOp> sysComDisInsReOpList1 = new ArrayList<>();
        List<Long> ids = comDisInsReOpVO.getIds();

        for (int i = 0; i < ids.size(); i++) {
            Long id = ids.get(i);
            SysComDisInsReOp sysComDisInsReOp = comDisInsReOpService.queryById(id);

            System.out.println("sysComDisInsReOp:777" + sysComDisInsReOp);
            if (sysComDisInsReOp != null) {
                sysComDisInsReOpList1.add(sysComDisInsReOp);
            }
        }

        List<SysComDisInsReOp> sysComDisInsReOpList2 = new ArrayList<>();
        for (int i = 0; i < ids.size(); i++) {
            Long id = ids.get(i);
            SysUser sysUser = userService.queryByIds(id);
            System.out.println("sysUser:777" + sysUser.getName());

            SysComDisInsReOp sysComDisInsReOp1 = new SysComDisInsReOp();
            sysComDisInsReOp1.setId(sysUser.getId());
            sysComDisInsReOp1.setCandidateName(sysUser.getName());
            sysComDisInsReOpList2.add(sysComDisInsReOp1);
        }
        if (sysComDisInsReOpList1.size() > 0) {
            for (int i = 0; i < sysComDisInsReOpList1.size(); i++) {//根据集合1 元素的id去删除集合2 中相同id 的元素
                Long id1 = sysComDisInsReOpList1.get(i).getId();
                for (int k = 0; k < sysComDisInsReOpList2.size(); k++) {
                    Long id2 = sysComDisInsReOpList2.get(k).getId();
                    if (id2.equals(id1)) {
                        sysComDisInsReOpList2.remove(k);
                        k--;
                    }
                }
            }
            //            //合并两个集合 list2 与 sysInspectArchivesList;
            System.out.println("集合2的长度111：" + sysComDisInsReOpList2.size());
            sysComDisInsReOpList.addAll(sysComDisInsReOpList1);
            if (sysComDisInsReOpList2.size() > 0) {
                sysComDisInsReOpList.addAll(sysComDisInsReOpList2);
            }
            System.out.println("合并222：" + sysComDisInsReOpList);
        } else {
            sysComDisInsReOpList.addAll(sysComDisInsReOpList2);

        }
        System.out.println(sysComDisInsReOpList);
        context.setRstObject("data", sysComDisInsReOpList);
    }
}




package com.nantian.controller;


import com.nantian.easytrade.annotation.ParameterObject;
import com.nantian.easytrade.annotation.Push;
import com.nantian.easytrade.annotation.Trade;
import com.nantian.easytrade.enumeration.ParamFormatEnum;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.entity.sys.SysPubBeforeInOffice;
import com.nantian.entity.sys.SysPubBeforeInOfficeExample;
import com.nantian.entity.sys.SysUser;
import com.nantian.exception.PubBeforeInOfficeException;
import com.nantian.exception.SysComDisInsReOpException;
import com.nantian.mapper.sys.SysPubBeforeInOfficeMapper;
import com.nantian.service.PubBeforeInOfficeService;
import com.nantian.service.UserService;
import com.nantian.vo.ListPubVO;
import com.nantian.vo.PubBeforeInOfficeVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>ClassName: UserController</p>
 * <p>Description: 任前公示 管理控制器</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2020-05-09</p>
 *
 * @author 唐剑波
 * @version 1.0
 */

@Trade(channel = "api", transCode = "pubbeforeinoffice")
public class PubBeforeInOfficeController {

    private static Logger log= LoggerFactory.getLogger(PubBeforeInOfficeController.class);

    @Autowired
    SysPubBeforeInOfficeMapper sysPubBeforeInOfficeMapper;

    @Autowired
    PubBeforeInOfficeService pubBeforeInOfficeService;

    @Autowired
    UserService userService;

    /**
     * 任前公示保存
     * 新增或修改
     * @param context 应用上下文
     * @param pubBeforeInOfficeVO 待保存的信息
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void add(ApplicationContext context, @ParameterObject PubBeforeInOfficeVO pubBeforeInOfficeVO) throws PubBeforeInOfficeException {

        System.out.println("listPubVO:777" + pubBeforeInOfficeVO);

        List<PubBeforeInOfficeVO> list=pubBeforeInOfficeVO.getInfos();
        for(int i=0;i<list.size();i++){
            PubBeforeInOfficeVO pubBeforeInOfficeVO1=list.get(i);
            pubBeforeInOfficeService.add(pubBeforeInOfficeVO1);
        }
    }

    /**
     * 任前公示提交
     * @param context 应用上下文
     * @param listPubVO 待提交的信息
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void updateflow(ApplicationContext context, @ParameterObject ListPubVO listPubVO ) throws PubBeforeInOfficeException {
        System.out.println(listPubVO + "&&&&&&&&");

        PubBeforeInOfficeVO pubBeforeInOfficeVO=new PubBeforeInOfficeVO();

        for(int i=0;i<listPubVO.getInfos().size();i++){
            PubBeforeInOfficeVO pubBeforeInOfficeVO1=listPubVO.getInfos().get(i);
            pubBeforeInOfficeService.add(pubBeforeInOfficeVO1);
        }

        for (int i = 0; i < listPubVO.getInfos().size(); i++) {
            pubBeforeInOfficeVO.setId(listPubVO.getInfos().get(i).getId());
            pubBeforeInOfficeService.updateflow(pubBeforeInOfficeVO);
        }
    }

    /**
     * 根据ID查询表中数据
     * @param context
     * @param pubBeforeInOfficeVO
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void queryByIds(ApplicationContext context,@ParameterObject PubBeforeInOfficeVO pubBeforeInOfficeVO)throws PubBeforeInOfficeException {

        List<SysPubBeforeInOffice> pubBeforeInOfficeVOList = new ArrayList<>();
        List<SysPubBeforeInOffice> pubBeforeInOfficeVOList1 = new ArrayList<>();
        List<Long> ids = pubBeforeInOfficeVO.getIds();

        for (int i = 0; i < ids.size(); i++) {
            Long id = ids.get(i);
            SysPubBeforeInOffice sysPubBeforeInOffice = pubBeforeInOfficeService.queryById(id);

            System.out.println("sysPubBeforeInOffice:777"+sysPubBeforeInOffice);

            if(sysPubBeforeInOffice != null){
                pubBeforeInOfficeVOList1.add(sysPubBeforeInOffice);
            }
        }
        List<SysPubBeforeInOffice> pubBeforeInOfficeVOList2 = new ArrayList<>();
        for (int i = 0; i < ids.size(); i++){
                Long id = ids.get(i);
                SysUser sysUser=userService.queryByIds(id);
                System.out.println("sysUser:777"+sysUser);

                SysPubBeforeInOffice sysPubBeforeInOffice1=new SysPubBeforeInOffice();
                sysPubBeforeInOffice1.setId(sysUser.getId());
                sysPubBeforeInOffice1.setCandidateName(sysUser.getName());
                sysPubBeforeInOffice1.setUnit(sysUser.getCompany());
                pubBeforeInOfficeVOList2.add(sysPubBeforeInOffice1);
            }
        if(pubBeforeInOfficeVOList1.size()>0){
            for(int i =0; i<pubBeforeInOfficeVOList1.size();i++){//根据集合1 元素的id去删除集合2 中相同id 的元素
                Long id1 = pubBeforeInOfficeVOList1.get(i).getId();
                for(int k = 0 ;k<pubBeforeInOfficeVOList2.size();k++){
                    Long id2 = pubBeforeInOfficeVOList2.get(k).getId();
                    if(id2.equals(id1)){
                        pubBeforeInOfficeVOList2.remove(k);
                        k--;
                    }
                }
            }

            System.out.println("集合2的长度："+pubBeforeInOfficeVOList2.size());
            //合并两个集合 list2 与 sysInspectArchivesList;
            pubBeforeInOfficeVOList.addAll(pubBeforeInOfficeVOList1);
            if(pubBeforeInOfficeVOList2.size()>0){
                pubBeforeInOfficeVOList.addAll(pubBeforeInOfficeVOList2);
            }
            System.out.println("合并："+pubBeforeInOfficeVOList);
        }else{
            pubBeforeInOfficeVOList.addAll(pubBeforeInOfficeVOList2);
        }
            context.setRstObject("data", pubBeforeInOfficeVOList);
        }

}

package com.nantian.controller;

import com.nantian.easytrade.annotation.ParameterObject;
import com.nantian.easytrade.annotation.Push;
import com.nantian.easytrade.annotation.Trade;
import com.nantian.easytrade.enumeration.ParamFormatEnum;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.entity.sys.SysAppBeforeInOffice;
import com.nantian.entity.sys.SysUser;
import com.nantian.exception.AppBeforeInOfficeException;
import com.nantian.service.AppBeforeInOfficeService;
import com.nantian.service.UserService;
import com.nantian.vo.AppBeforeInOfficeVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>ClassName: UserController</p>
 * <p>Description: 任前报批控制器</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2020-05-12</p>
 *
 * @author wp
 * @version 1.0
 */

@Trade(channel = "api", transCode = "appbeforeinoffice")
public class AppBeforeInOfficeController {

    private static Logger log= LoggerFactory.getLogger(AppBeforeInOfficeController.class);

    @Autowired
    AppBeforeInOfficeService appBeforeInOfficeService;

    @Autowired
    UserService userService;

    /**
     * 根据ID查询表中数据
     * @param context
     * @param appBeforeInOfficeVO
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void queryByIds(ApplicationContext context,@ParameterObject AppBeforeInOfficeVO appBeforeInOfficeVO)throws AppBeforeInOfficeException {

        List<SysAppBeforeInOffice> sysAppBeforeInOfficeList=new ArrayList<>();
        List<SysAppBeforeInOffice> sysAppBeforeInOfficeList1=new ArrayList<>();
        List<Long> ids = appBeforeInOfficeVO.getIds();

        System.out.println("ids"+ids);

        for(int i = 0 ;i<ids.size();i++) {
            Long id = ids.get(i);
            SysAppBeforeInOffice sysAppBeforeInOffice=appBeforeInOfficeService.queryById(id);
            System.out.println("sysAppBeforeInOffice:777"+sysAppBeforeInOffice);
            if(sysAppBeforeInOffice!=null){
                sysAppBeforeInOfficeList1.add(sysAppBeforeInOffice);
            }
        }
        List<SysAppBeforeInOffice> sysAppBeforeInOfficeList2=new ArrayList<>();
        for(int i=0;i<ids.size();i++){
            Long id=ids.get(i);
            SysUser user = userService.getUser(id);
            SysAppBeforeInOffice sysAppBeforeInOffice=new SysAppBeforeInOffice();
            sysAppBeforeInOffice.setId(user.getId());
            sysAppBeforeInOffice.setCandidateName(user.getName());
            sysAppBeforeInOffice.setUnit(user.getCompany());
            sysAppBeforeInOffice.setPosition(user.getPosition());

            System.out.println("sysAppBeforeInOffice:888"+sysAppBeforeInOffice);

            sysAppBeforeInOfficeList2.add(sysAppBeforeInOffice);
        }

        System.out.println("sysAppBeforeInOfficeList1:"+sysAppBeforeInOfficeList1+"size():"+sysAppBeforeInOfficeList1.size());
        if(sysAppBeforeInOfficeList1.size()>0){
            for(int i =0; i<sysAppBeforeInOfficeList1.size();i++){//根据集合1 元素的id去删除集合2 中相同id 的元素
                Long id1 = sysAppBeforeInOfficeList1.get(i).getId();
                for(int k = 0 ;k<sysAppBeforeInOfficeList2.size();k++){
                    Long id2 = sysAppBeforeInOfficeList2.get(k).getId();
                    if(id2.equals(id1)){
                        sysAppBeforeInOfficeList2.remove(k);
                        k--;
                    }
                }
            }
            //            //合并两个集合 list2 与 sysInspectArchivesList;
            System.out.println("集合2的长度111："+sysAppBeforeInOfficeList2.size());
            sysAppBeforeInOfficeList.addAll(sysAppBeforeInOfficeList1);
            if(sysAppBeforeInOfficeList2.size()>0){
                sysAppBeforeInOfficeList.addAll(sysAppBeforeInOfficeList2);
            }
            System.out.println("合并222："+sysAppBeforeInOfficeList);
        }else{
            sysAppBeforeInOfficeList.addAll(sysAppBeforeInOfficeList2);

        }
        System.out.println(sysAppBeforeInOfficeList);
        context.setRstObject("data", sysAppBeforeInOfficeList);
    }


    /**
     * 任前报批保存
     * @param context 应用上下文
     * @param appBeforeInOfficeVO 新增的任前报批信息
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void add(ApplicationContext context, @ParameterObject AppBeforeInOfficeVO appBeforeInOfficeVO) throws AppBeforeInOfficeException {

        System.out.println("inspectArchivesVOs" + appBeforeInOfficeVO.getInfos());

        List<AppBeforeInOfficeVO> list=appBeforeInOfficeVO.getInfos();
        for(int i=0;i<list.size();i++){
            AppBeforeInOfficeVO appBeforeInOfficeVO1=list.get(i);
            appBeforeInOfficeService.add(appBeforeInOfficeVO1);
        }
    }

    /**
     * 任前报批提交
     * @param context 应用上下文
     * @param appBeforeInOfficeVO 新增的任前报批信息
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void updateflow(ApplicationContext context, @ParameterObject AppBeforeInOfficeVO appBeforeInOfficeVO) throws AppBeforeInOfficeException {
        //获取前端传递的参数集合
        List<AppBeforeInOfficeVO> list = appBeforeInOfficeVO.getInfos();

        //1.判断所有选择人员是否提交材料 且其他字段不为空
        List<SysAppBeforeInOffice> sysAppBeforeInOfficeList = new ArrayList<>();
        //2没有保存直接提交
        for(int i=0;i<list.size();i++){
            AppBeforeInOfficeVO appBeforeInOfficeVO1=list.get(i);
            appBeforeInOfficeService.add(appBeforeInOfficeVO1);
        }
        //更新sys_flow
        appBeforeInOfficeService.updateflow(list);
    }
}

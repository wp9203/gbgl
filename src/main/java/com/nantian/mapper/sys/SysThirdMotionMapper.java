package com.nantian.mapper.sys;

import com.nantian.entity.sys.SysFlow;
import com.nantian.entity.sys.SysThirdMotion;
import com.nantian.entity.sys.SysThirdMotionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysThirdMotionMapper {
    /**
     * 根据条件统计数据
     * @param example 条件
     * @return 统计的数量
     */
    long countByExample(SysThirdMotionExample example);

    /**
     * 根据条件删除数据
     * @param example 条件
     * @return 删除的条数
     */
    int deleteByExample(SysThirdMotionExample example);

    /**
     * 根据主键删除数据
     * @param id 主键
     * @return 删除的条数
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入一条数据
     * @param record Po对象
     * @return 插入的条数
     */
    int insert(SysThirdMotion record);

    /**
     * 根据条件插入数据（字段值为null时，该字段不插入）
     * @param record Po对象
     * @return 插入的条数
     */
    int insertSelective(SysThirdMotion record);

    /**
     * 根据条件查询数据
     * @param example 条件
     * @return 查询的集合
     */
    List<SysThirdMotion> selectByExample(SysThirdMotionExample example);

    /**
     * 根据主键查询数据
     * @param id 主键
     * @return 查询的集合
     */
    SysThirdMotion selectByPrimaryKey(Long id);

    /**
     * 根据条件更新字段数据（字段值为null时，该字段不更新）
     * @param record Po对象
     * @param example 条件
     * @return 更新的条数
     */
    int updateByExampleSelective(@Param("record") SysThirdMotion record, @Param("example") SysThirdMotionExample example);

    /**
     * 根据条件更新所有字段数据
     * @param record Po对象
     * @param example 条件
     * @return 更新的条数
     */
    int updateByExample(@Param("record") SysThirdMotion record, @Param("example") SysThirdMotionExample example);

    /**
     * 根据主键更新字段数据（字段值为null时，该字段不更新）
     * @param record Po对象
     * @return 更新的条数
     */
    int updateByPrimaryKeySelective(SysThirdMotion record);

    /**
     * 根据主键更新所有字段数据
     * @param record Po对象
     * @return 更新的条数
     */
    int updateByPrimaryKey(SysThirdMotion record);

    /**
     * 根据主键更新所有字段数据
     * @param sysFlow Po对象
     * @return 更新的条数
     */
    int updateflow(SysFlow sysFlow);
}
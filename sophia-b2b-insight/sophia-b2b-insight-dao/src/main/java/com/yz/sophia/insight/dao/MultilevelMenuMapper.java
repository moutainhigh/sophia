package com.yz.sophia.insight.dao;

import com.yz.sophia.insight.model.po.ApplyApplicationRel;
import com.yz.sophia.insight.model.po.MultilevelMenu;
import com.yz.sophia.insight.model.po.MultilevelMenuExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MultilevelMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multilevel_menu
     *
     * @mbggenerated
     */
    int countByExample(MultilevelMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multilevel_menu
     *
     * @mbggenerated
     */
    int deleteByExample(MultilevelMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multilevel_menu
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multilevel_menu
     *
     * @mbggenerated
     */
    int insert(MultilevelMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multilevel_menu
     *
     * @mbggenerated
     */
    int insertSelective(MultilevelMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multilevel_menu
     *
     * @mbggenerated
     */
    List<MultilevelMenu> selectByExample(MultilevelMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multilevel_menu
     *
     * @mbggenerated
     */
    MultilevelMenu selectByPrimaryKey(String menusCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multilevel_menu
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MultilevelMenu record, @Param("example") MultilevelMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multilevel_menu
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MultilevelMenu record, @Param("example") MultilevelMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multilevel_menu
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MultilevelMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multilevel_menu
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MultilevelMenu record);

    List<Map<String, Object>> selectByList(@Param("relList") List relList);

    List<Map<String, Object>> selectByParentList(@Param("parList") List parList);
}
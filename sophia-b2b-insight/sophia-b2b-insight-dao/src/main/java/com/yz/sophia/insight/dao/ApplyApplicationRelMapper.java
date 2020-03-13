package com.yz.sophia.insight.dao;

import com.yz.sophia.insight.model.po.ApplyApplicationRel;
import com.yz.sophia.insight.model.po.ApplyApplicationRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplyApplicationRelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply_application_rel
     *
     * @mbggenerated
     */
    int countByExample(ApplyApplicationRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply_application_rel
     *
     * @mbggenerated
     */
    int deleteByExample(ApplyApplicationRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply_application_rel
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply_application_rel
     *
     * @mbggenerated
     */
    int insert(ApplyApplicationRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply_application_rel
     *
     * @mbggenerated
     */
    int insertSelective(ApplyApplicationRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply_application_rel
     *
     * @mbggenerated
     */
    List<ApplyApplicationRel> selectByExample(ApplyApplicationRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply_application_rel
     *
     * @mbggenerated
     */
    ApplyApplicationRel selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply_application_rel
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ApplyApplicationRel record, @Param("example") ApplyApplicationRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply_application_rel
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ApplyApplicationRel record, @Param("example") ApplyApplicationRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply_application_rel
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ApplyApplicationRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply_application_rel
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ApplyApplicationRel record);

    /**
     * 批量新增
     * @param list
     * @return
     */
    int insertBatch(List<ApplyApplicationRel> list);
}
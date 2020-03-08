package com.yz.sophia.stargaze.dao;

import com.yz.sophia.stargaze.model.po.CockpitStatisticalCharts;
import com.yz.sophia.stargaze.model.po.CockpitStatisticalChartsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CockpitStatisticalChartsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cockpit_statistical_charts
     *
     * @mbggenerated
     */
    int countByExample(CockpitStatisticalChartsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cockpit_statistical_charts
     *
     * @mbggenerated
     */
    int deleteByExample(CockpitStatisticalChartsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cockpit_statistical_charts
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cockpit_statistical_charts
     *
     * @mbggenerated
     */
    int insert(CockpitStatisticalCharts record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cockpit_statistical_charts
     *
     * @mbggenerated
     */
    int insertSelective(CockpitStatisticalCharts record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cockpit_statistical_charts
     *
     * @mbggenerated
     */
    List<CockpitStatisticalCharts> selectByExample(CockpitStatisticalChartsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cockpit_statistical_charts
     *
     * @mbggenerated
     */
    CockpitStatisticalCharts selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cockpit_statistical_charts
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CockpitStatisticalCharts record, @Param("example") CockpitStatisticalChartsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cockpit_statistical_charts
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CockpitStatisticalCharts record, @Param("example") CockpitStatisticalChartsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cockpit_statistical_charts
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CockpitStatisticalCharts record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cockpit_statistical_charts
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CockpitStatisticalCharts record);
}
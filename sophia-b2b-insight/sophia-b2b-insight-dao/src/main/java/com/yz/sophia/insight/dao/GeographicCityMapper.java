package com.yz.sophia.insight.dao;

import com.yz.sophia.insight.model.po.GeographicCity;
import com.yz.sophia.insight.model.po.GeographicCityExample;
import java.util.List;

import com.yz.sophia.insight.model.response.GeographicCityResp;
import org.apache.ibatis.annotations.Param;

public interface GeographicCityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geographic_city
     *
     * @mbggenerated
     */
    int countByExample(GeographicCityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geographic_city
     *
     * @mbggenerated
     */
    int deleteByExample(GeographicCityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geographic_city
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geographic_city
     *
     * @mbggenerated
     */
    int insert(GeographicCity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geographic_city
     *
     * @mbggenerated
     */
    int insertSelective(GeographicCity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geographic_city
     *
     * @mbggenerated
     */
    List<GeographicCity> selectByExample(GeographicCityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geographic_city
     *
     * @mbggenerated
     */
    List<GeographicCityResp> selectListByExample(GeographicCityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geographic_city
     *
     * @mbggenerated
     */
    GeographicCity selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geographic_city
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") GeographicCity record, @Param("example") GeographicCityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geographic_city
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") GeographicCity record, @Param("example") GeographicCityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geographic_city
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GeographicCity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geographic_city
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GeographicCity record);
}
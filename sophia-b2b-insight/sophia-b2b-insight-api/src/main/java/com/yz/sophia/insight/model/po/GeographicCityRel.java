package com.yz.sophia.insight.model.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel("地理统计信息对象")
public class GeographicCityRel {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column geographic_city_rel.id
     *
     * @mbggenerated
     */
    @ApiModelProperty("主键id")
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column geographic_city_rel.city_id
     *
     * @mbggenerated
     */
    @ApiModelProperty("城市id")
    private String cityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column geographic_city_rel.statistics_month
     *
     * @mbggenerated
     */
    @ApiModelProperty("月份")
    private String statisticsMonth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column geographic_city_rel.rainfall_month
     *
     * @mbggenerated
     */
    @ApiModelProperty("每月降雨量（毫米）")
    private Double rainfallMonth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column geographic_city_rel.sunlight_month
     *
     * @mbggenerated
     */
    @ApiModelProperty("每月日照量（小时）")
    private Double sunlightMonth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column geographic_city_rel.statistics_year
     *
     * @mbggenerated
     */
    @ApiModelProperty("统计年份")
    private Integer statisticsYear;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column geographic_city_rel.create_time
     *
     * @mbggenerated
     */
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column geographic_city_rel.id
     *
     * @return the value of geographic_city_rel.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column geographic_city_rel.id
     *
     * @param id the value for geographic_city_rel.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column geographic_city_rel.city_id
     *
     * @return the value of geographic_city_rel.city_id
     *
     * @mbggenerated
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column geographic_city_rel.city_id
     *
     * @param cityId the value for geographic_city_rel.city_id
     *
     * @mbggenerated
     */
    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column geographic_city_rel.statistics_month
     *
     * @return the value of geographic_city_rel.statistics_month
     *
     * @mbggenerated
     */
    public String getStatisticsMonth() {
        return statisticsMonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column geographic_city_rel.statistics_month
     *
     * @param statisticsMonth the value for geographic_city_rel.statistics_month
     *
     * @mbggenerated
     */
    public void setStatisticsMonth(String statisticsMonth) {
        this.statisticsMonth = statisticsMonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column geographic_city_rel.rainfall_month
     *
     * @return the value of geographic_city_rel.rainfall_month
     *
     * @mbggenerated
     */
    public Double getRainfallMonth() {
        return rainfallMonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column geographic_city_rel.rainfall_month
     *
     * @param rainfallMonth the value for geographic_city_rel.rainfall_month
     *
     * @mbggenerated
     */
    public void setRainfallMonth(Double rainfallMonth) {
        this.rainfallMonth = rainfallMonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column geographic_city_rel.sunlight_month
     *
     * @return the value of geographic_city_rel.sunlight_month
     *
     * @mbggenerated
     */
    public Double getSunlightMonth() {
        return sunlightMonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column geographic_city_rel.sunlight_month
     *
     * @param sunlightMonth the value for geographic_city_rel.sunlight_month
     *
     * @mbggenerated
     */
    public void setSunlightMonth(Double sunlightMonth) {
        this.sunlightMonth = sunlightMonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column geographic_city_rel.statistics_year
     *
     * @return the value of geographic_city_rel.statistics_year
     *
     * @mbggenerated
     */
    public Integer getStatisticsYear() {
        return statisticsYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column geographic_city_rel.statistics_year
     *
     * @param statisticsYear the value for geographic_city_rel.statistics_year
     *
     * @mbggenerated
     */
    public void setStatisticsYear(Integer statisticsYear) {
        this.statisticsYear = statisticsYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column geographic_city_rel.create_time
     *
     * @return the value of geographic_city_rel.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column geographic_city_rel.create_time
     *
     * @param createTime the value for geographic_city_rel.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "GeographicCityRel{" +
                "id=" + id +
                ", cityId='" + cityId + '\'' +
                ", statisticsMonth='" + statisticsMonth + '\'' +
                ", rainfallMonth=" + rainfallMonth +
                ", sunlightMonth=" + sunlightMonth +
                ", statisticsYear=" + statisticsYear +
                ", createTime=" + createTime +
                '}';
    }
}
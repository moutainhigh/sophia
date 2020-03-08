package com.yz.sophia.stargaze.model.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel("驾驶舱图表统计所关联数据实体类")
public class CockpitStaChartData {
    /**
     * 主键id
     */
    @ApiModelProperty("主键id")
    private Long id;

    /**
     * 图表数据code
     */
    @ApiModelProperty("图表数据code")
    private String dataCode;

    /**
     * 图表编号code
     */
    @ApiModelProperty("图表编号code")
    private String chartCode;

    /**
     * 统计指标
     */
    @ApiModelProperty("统计指标")
    private String statisticalIndicator;

    /**
     * 第一项统计内容
     */
    @ApiModelProperty("第一项统计内容")
    private String firstStatisticalContent;

    /**
     * 第一项数据类型(1=数字，2=百分比)
     */
    @ApiModelProperty("第一项数据类型(1=数字，2=百分比)")
    private int firstDataType;

    /**
     * 第一项描述
     */
    @ApiModelProperty("第一项描述")
    private String firstDescription;

    /**
     * 第二项统计内容
     */
    @ApiModelProperty("第二项统计内容")
    private String secondStatisticalContent;

    /**
     * 第二项数据类型(1=数字，2=百分比)
     */
    @ApiModelProperty("第二项数据类型(1=数字，2=百分比)")
    private int secondDataType;

    /**
     * 第二项描述
     */
    @ApiModelProperty("第二项描述")
    private String secondDescription;

    /**
     * 第三项统计内容
     */
    @ApiModelProperty("第三项统计内容")
    private String thirdStatisticalContent;

    /**
     * 第三项数据类型(1=数字，2=百分比)
     */
    @ApiModelProperty("第三项数据类型(1=数字，2=百分比)")
    private int thirdDataType;

    /**
     * 第三项描述
     */
    @ApiModelProperty("第三项描述")
    private String thirdDescription;

    /**
     * 所统计年份（地域图，饼状图适用）
     */
    @ApiModelProperty("所统计年份")
    private String statisticsYear;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cockpit_sta_chart_data.id
     *
     * @return the value of cockpit_sta_chart_data.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cockpit_sta_chart_data.id
     *
     * @param id the value for cockpit_sta_chart_data.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cockpit_sta_chart_data.data_code
     *
     * @return the value of cockpit_sta_chart_data.data_code
     *
     * @mbggenerated
     */
    public String getDataCode() {
        return dataCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cockpit_sta_chart_data.data_code
     *
     * @param dataCode the value for cockpit_sta_chart_data.data_code
     *
     * @mbggenerated
     */
    public void setDataCode(String dataCode) {
        this.dataCode = dataCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cockpit_sta_chart_data.chart_code
     *
     * @return the value of cockpit_sta_chart_data.chart_code
     *
     * @mbggenerated
     */
    public String getChartCode() {
        return chartCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cockpit_sta_chart_data.chart_code
     *
     * @param chartCode the value for cockpit_sta_chart_data.chart_code
     *
     * @mbggenerated
     */
    public void setChartCode(String chartCode) {
        this.chartCode = chartCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cockpit_sta_chart_data.statistical_indicator
     *
     * @return the value of cockpit_sta_chart_data.statistical_indicator
     *
     * @mbggenerated
     */
    public String getStatisticalIndicator() {
        return statisticalIndicator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cockpit_sta_chart_data.statistical_indicator
     *
     * @param statisticalIndicator the value for cockpit_sta_chart_data.statistical_indicator
     *
     * @mbggenerated
     */
    public void setStatisticalIndicator(String statisticalIndicator) {
        this.statisticalIndicator = statisticalIndicator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cockpit_sta_chart_data.first_statistical_content
     *
     * @return the value of cockpit_sta_chart_data.first_statistical_content
     *
     * @mbggenerated
     */
    public String getFirstStatisticalContent() {
        return firstStatisticalContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cockpit_sta_chart_data.first_statistical_content
     *
     * @param firstStatisticalContent the value for cockpit_sta_chart_data.first_statistical_content
     *
     * @mbggenerated
     */
    public void setFirstStatisticalContent(String firstStatisticalContent) {
        this.firstStatisticalContent = firstStatisticalContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cockpit_sta_chart_data.first_data_type
     *
     * @return the value of cockpit_sta_chart_data.first_data_type
     *
     * @mbggenerated
     */
    public int getFirstDataType() {
        return firstDataType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cockpit_sta_chart_data.first_data_type
     *
     * @param firstDataType the value for cockpit_sta_chart_data.first_data_type
     *
     * @mbggenerated
     */
    public void setFirstDataType(int firstDataType) {
        this.firstDataType = firstDataType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cockpit_sta_chart_data.first_description
     *
     * @return the value of cockpit_sta_chart_data.first_description
     *
     * @mbggenerated
     */
    public String getFirstDescription() {
        return firstDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cockpit_sta_chart_data.first_description
     *
     * @param firstDescription the value for cockpit_sta_chart_data.first_description
     *
     * @mbggenerated
     */
    public void setFirstDescription(String firstDescription) {
        this.firstDescription = firstDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cockpit_sta_chart_data.second_statistical_content
     *
     * @return the value of cockpit_sta_chart_data.second_statistical_content
     *
     * @mbggenerated
     */
    public String getSecondStatisticalContent() {
        return secondStatisticalContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cockpit_sta_chart_data.second_statistical_content
     *
     * @param secondStatisticalContent the value for cockpit_sta_chart_data.second_statistical_content
     *
     * @mbggenerated
     */
    public void setSecondStatisticalContent(String secondStatisticalContent) {
        this.secondStatisticalContent = secondStatisticalContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cockpit_sta_chart_data.second_data_type
     *
     * @return the value of cockpit_sta_chart_data.second_data_type
     *
     * @mbggenerated
     */
    public int getSecondDataType() {
        return secondDataType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cockpit_sta_chart_data.second_data_type
     *
     * @param secondDataType the value for cockpit_sta_chart_data.second_data_type
     *
     * @mbggenerated
     */
    public void setSecondDataType(int secondDataType) {
        this.secondDataType = secondDataType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cockpit_sta_chart_data.second_description
     *
     * @return the value of cockpit_sta_chart_data.second_description
     *
     * @mbggenerated
     */
    public String getSecondDescription() {
        return secondDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cockpit_sta_chart_data.second_description
     *
     * @param secondDescription the value for cockpit_sta_chart_data.second_description
     *
     * @mbggenerated
     */
    public void setSecondDescription(String secondDescription) {
        this.secondDescription = secondDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cockpit_sta_chart_data.third_statistical_content
     *
     * @return the value of cockpit_sta_chart_data.third_statistical_content
     *
     * @mbggenerated
     */
    public String getThirdStatisticalContent() {
        return thirdStatisticalContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cockpit_sta_chart_data.third_statistical_content
     *
     * @param thirdStatisticalContent the value for cockpit_sta_chart_data.third_statistical_content
     *
     * @mbggenerated
     */
    public void setThirdStatisticalContent(String thirdStatisticalContent) {
        this.thirdStatisticalContent = thirdStatisticalContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cockpit_sta_chart_data.third_data_type
     *
     * @return the value of cockpit_sta_chart_data.third_data_type
     *
     * @mbggenerated
     */
    public int getThirdDataType() {
        return thirdDataType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cockpit_sta_chart_data.third_data_type
     *
     * @param thirdDataType the value for cockpit_sta_chart_data.third_data_type
     *
     * @mbggenerated
     */
    public void setThirdDataType(int thirdDataType) {
        this.thirdDataType = thirdDataType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cockpit_sta_chart_data.third_description
     *
     * @return the value of cockpit_sta_chart_data.third_description
     *
     * @mbggenerated
     */
    public String getThirdDescription() {
        return thirdDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cockpit_sta_chart_data.third_description
     *
     * @param thirdDescription the value for cockpit_sta_chart_data.third_description
     *
     * @mbggenerated
     */
    public void setThirdDescription(String thirdDescription) {
        this.thirdDescription = thirdDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cockpit_sta_chart_data.statistics_year
     *
     * @return the value of cockpit_sta_chart_data.statistics_year
     *
     * @mbggenerated
     */
    public String getStatisticsYear() {
        return statisticsYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cockpit_sta_chart_data.statistics_year
     *
     * @param statisticsYear the value for cockpit_sta_chart_data.statistics_year
     *
     * @mbggenerated
     */
    public void setStatisticsYear(String statisticsYear) {
        this.statisticsYear = statisticsYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cockpit_sta_chart_data.create_time
     *
     * @return the value of cockpit_sta_chart_data.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cockpit_sta_chart_data.create_time
     *
     * @param createTime the value for cockpit_sta_chart_data.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "CockpitStaChartData{" +
                "id=" + id +
                ", dataCode='" + dataCode + '\'' +
                ", chartCode='" + chartCode + '\'' +
                ", statisticalIndicator='" + statisticalIndicator + '\'' +
                ", firstStatisticalContent='" + firstStatisticalContent + '\'' +
                ", firstDataType=" + firstDataType +
                ", firstDescription='" + firstDescription + '\'' +
                ", secondStatisticalContent='" + secondStatisticalContent + '\'' +
                ", secondDataType=" + secondDataType +
                ", secondDescription='" + secondDescription + '\'' +
                ", thirdStatisticalContent='" + thirdStatisticalContent + '\'' +
                ", thirdDataType=" + thirdDataType +
                ", thirdDescription='" + thirdDescription + '\'' +
                ", statisticsYear='" + statisticsYear + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
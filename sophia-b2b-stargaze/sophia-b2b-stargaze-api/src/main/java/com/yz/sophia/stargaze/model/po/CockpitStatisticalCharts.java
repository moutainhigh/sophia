package com.yz.sophia.stargaze.model.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
@ApiModel("驾驶舱图标数据统计实体类")
public class CockpitStatisticalCharts {
    /**
     * 主键id
     */
    @ApiModelProperty("主键id")
    private Long id;

    /**
     * 图表编号code
     */
    @ApiModelProperty("图表编号code")
    private String chartCode;

    /**
     * 图表名称
     */
    @ApiModelProperty("图表名称")
    private String chartName;

    /**
     * 图表类型(1=柱状，2=饼状，3=地图)
     */
    @ApiModelProperty("图表类型(1=柱状，2=饼状，3=地图)")
    private int chartType;

    /**
     * 数据来源（出处）
     */
    @ApiModelProperty("数据来源（出处）")
    private String dataSource;

    /**
     * 图表位置(1=左上，2=左中，3=左下，4=中间，5=右上，6=右中，7=右下)
     */
    @ApiModelProperty("图表位置(1=左上，2=左中，3=左下，4=中间，5=右上，6=右中，7=右下)")
    private int chartLocation;

    /**
     * 图标一级菜单（1=文化类，2=政治类，3=社会类，4=经济类）
     */
    @ApiModelProperty("图标一级菜单（1=文化类，2=政治类，3=社会类，4=经济类）")
    private int parentTitle;

    /**
     * 图标二级菜单code
     */
    @ApiModelProperty("图标二级菜单code")
    private String subTitleCode;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cockpit_statistical_charts.id
     *
     * @return the value of cockpit_statistical_charts.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cockpit_statistical_charts.id
     *
     * @param id the value for cockpit_statistical_charts.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cockpit_statistical_charts.chart_code
     *
     * @return the value of cockpit_statistical_charts.chart_code
     *
     * @mbggenerated
     */
    public String getChartCode() {
        return chartCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cockpit_statistical_charts.chart_code
     *
     * @param chartCode the value for cockpit_statistical_charts.chart_code
     *
     * @mbggenerated
     */
    public void setChartCode(String chartCode) {
        this.chartCode = chartCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cockpit_statistical_charts.chart_name
     *
     * @return the value of cockpit_statistical_charts.chart_name
     *
     * @mbggenerated
     */
    public String getChartName() {
        return chartName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cockpit_statistical_charts.chart_name
     *
     * @param chartName the value for cockpit_statistical_charts.chart_name
     *
     * @mbggenerated
     */
    public void setChartName(String chartName) {
        this.chartName = chartName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cockpit_statistical_charts.chart_type
     *
     * @return the value of cockpit_statistical_charts.chart_type
     *
     * @mbggenerated
     */
    public int getChartType() {
        return chartType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cockpit_statistical_charts.chart_type
     *
     * @param chartType the value for cockpit_statistical_charts.chart_type
     *
     * @mbggenerated
     */
    public void setChartType(int chartType) {
        this.chartType = chartType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cockpit_statistical_charts.data_source
     *
     * @return the value of cockpit_statistical_charts.data_source
     *
     * @mbggenerated
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cockpit_statistical_charts.data_source
     *
     * @param dataSource the value for cockpit_statistical_charts.data_source
     *
     * @mbggenerated
     */
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cockpit_statistical_charts.chart_location
     *
     * @return the value of cockpit_statistical_charts.chart_location
     *
     * @mbggenerated
     */
    public int getChartLocation() {
        return chartLocation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cockpit_statistical_charts.chart_location
     *
     * @param chartLocation the value for cockpit_statistical_charts.chart_location
     *
     * @mbggenerated
     */
    public void setChartLocation(int chartLocation) {
        this.chartLocation = chartLocation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cockpit_statistical_charts.parent_title
     *
     * @return the value of cockpit_statistical_charts.parent_title
     *
     * @mbggenerated
     */
    public int getParentTitle() {
        return parentTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cockpit_statistical_charts.parent_title
     *
     * @param parentTitle the value for cockpit_statistical_charts.parent_title
     *
     * @mbggenerated
     */
    public void setParentTitle(int parentTitle) {
        this.parentTitle = parentTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cockpit_statistical_charts.sub_title_code
     *
     * @return the value of cockpit_statistical_charts.sub_title_code
     *
     * @mbggenerated
     */
    public String getSubTitleCode() {
        return subTitleCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cockpit_statistical_charts.sub_title_code
     *
     * @param subTitleCode the value for cockpit_statistical_charts.sub_title_code
     *
     * @mbggenerated
     */
    public void setSubTitleCode(String subTitleCode) {
        this.subTitleCode = subTitleCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cockpit_statistical_charts.create_time
     *
     * @return the value of cockpit_statistical_charts.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cockpit_statistical_charts.create_time
     *
     * @param createTime the value for cockpit_statistical_charts.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "CockpitStatisticalCharts{" +
                "id=" + id +
                ", chartCode='" + chartCode + '\'' +
                ", chartName='" + chartName + '\'' +
                ", chartType=" + chartType +
                ", dataSource='" + dataSource + '\'' +
                ", chartLocation=" + chartLocation +
                ", parentTitle=" + parentTitle +
                ", subTitleCode='" + subTitleCode + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
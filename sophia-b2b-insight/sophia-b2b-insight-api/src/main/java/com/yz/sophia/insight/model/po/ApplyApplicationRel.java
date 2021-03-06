package com.yz.sophia.insight.model.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("应用申请接口选择关联表")
public class ApplyApplicationRel {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column apply_application_rel.id
     *
     * @mbggenerated
     */
    @ApiModelProperty("主键id")
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column apply_application_rel.application_code
     *
     * @mbggenerated
     */
    @ApiModelProperty("应用code")
    private String applicationCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column apply_application_rel.menus_code
     *
     * @mbggenerated
     */
    @ApiModelProperty("所选接口code")
    private String menusCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column apply_application_rel.id
     *
     * @return the value of apply_application_rel.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column apply_application_rel.id
     *
     * @param id the value for apply_application_rel.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column apply_application_rel.application_code
     *
     * @return the value of apply_application_rel.application_code
     *
     * @mbggenerated
     */
    public String getApplicationCode() {
        return applicationCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column apply_application_rel.application_code
     *
     * @param applicationCode the value for apply_application_rel.application_code
     *
     * @mbggenerated
     */
    public void setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column apply_application_rel.menus_code
     *
     * @return the value of apply_application_rel.menus_code
     *
     * @mbggenerated
     */
    public String getMenusCode() {
        return menusCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column apply_application_rel.menus_code
     *
     * @param menusCode the value for apply_application_rel.menus_code
     *
     * @mbggenerated
     */
    public void setMenusCode(String menusCode) {
        this.menusCode = menusCode;
    }
}
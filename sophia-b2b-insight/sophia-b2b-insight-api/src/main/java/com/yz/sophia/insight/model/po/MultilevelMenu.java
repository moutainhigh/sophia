package com.yz.sophia.insight.model.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("多级菜单表")
public class MultilevelMenu {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column multilevel_menu.id
     *
     * @mbggenerated
     */
    @ApiModelProperty("主键id")
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column multilevel_menu.menus_code
     *
     * @mbggenerated
     */
    @ApiModelProperty("菜单code")
    private String menusCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column multilevel_menu.menus_name
     *
     * @mbggenerated
     */
    @ApiModelProperty("菜单名称")
    private String menusName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column multilevel_menu.menus_rank
     *
     * @mbggenerated
     */
    @ApiModelProperty("菜单级别(1=一级，2=二级，3=三级)")
    private Integer menusRank;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column multilevel_menu.parent_menus_code
     *
     * @mbggenerated
     */
    @ApiModelProperty("父级菜单")
    private String parentMenusCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column multilevel_menu.id
     *
     * @return the value of multilevel_menu.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column multilevel_menu.id
     *
     * @param id the value for multilevel_menu.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column multilevel_menu.menus_code
     *
     * @return the value of multilevel_menu.menus_code
     *
     * @mbggenerated
     */
    public String getMenusCode() {
        return menusCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column multilevel_menu.menus_code
     *
     * @param menusCode the value for multilevel_menu.menus_code
     *
     * @mbggenerated
     */
    public void setMenusCode(String menusCode) {
        this.menusCode = menusCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column multilevel_menu.menus_name
     *
     * @return the value of multilevel_menu.menus_name
     *
     * @mbggenerated
     */
    public String getMenusName() {
        return menusName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column multilevel_menu.menus_name
     *
     * @param menusName the value for multilevel_menu.menus_name
     *
     * @mbggenerated
     */
    public void setMenusName(String menusName) {
        this.menusName = menusName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column multilevel_menu.menus_rank
     *
     * @return the value of multilevel_menu.menus_rank
     *
     * @mbggenerated
     */
    public Integer getMenusRank() {
        return menusRank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column multilevel_menu.menus_rank
     *
     * @param menusRank the value for multilevel_menu.menus_rank
     *
     * @mbggenerated
     */
    public void setMenusRank(Integer menusRank) {
        this.menusRank = menusRank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column multilevel_menu.parent_menus_code
     *
     * @return the value of multilevel_menu.parent_menus_code
     *
     * @mbggenerated
     */
    public String getParentMenusCode() {
        return parentMenusCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column multilevel_menu.parent_menus_code
     *
     * @param parentMenusCode the value for multilevel_menu.parent_menus_code
     *
     * @mbggenerated
     */
    public void setParentMenusCode(String parentMenusCode) {
        this.parentMenusCode = parentMenusCode;
    }
}
package com.yz.sophia.insight.dao;

import com.yz.sophia.insight.model.po.LegalInstrumentInfo;
import com.yz.sophia.insight.model.po.LegalInstrumentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LegalInstrumentInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table legal_instrument_info
     *
     * @mbggenerated
     */
    int countByExample(LegalInstrumentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table legal_instrument_info
     *
     * @mbggenerated
     */
    int deleteByExample(LegalInstrumentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table legal_instrument_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table legal_instrument_info
     *
     * @mbggenerated
     */
    int insert(LegalInstrumentInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table legal_instrument_info
     *
     * @mbggenerated
     */
    int insertSelective(LegalInstrumentInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table legal_instrument_info
     *
     * @mbggenerated
     */
    List<LegalInstrumentInfo> selectByExampleWithBLOBs(LegalInstrumentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table legal_instrument_info
     *
     * @mbggenerated
     */
    List<LegalInstrumentInfo> selectByExample(LegalInstrumentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table legal_instrument_info
     *
     * @mbggenerated
     */
    LegalInstrumentInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table legal_instrument_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") LegalInstrumentInfo record, @Param("example") LegalInstrumentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table legal_instrument_info
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") LegalInstrumentInfo record, @Param("example") LegalInstrumentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table legal_instrument_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") LegalInstrumentInfo record, @Param("example") LegalInstrumentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table legal_instrument_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(LegalInstrumentInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table legal_instrument_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(LegalInstrumentInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table legal_instrument_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(LegalInstrumentInfo record);

}
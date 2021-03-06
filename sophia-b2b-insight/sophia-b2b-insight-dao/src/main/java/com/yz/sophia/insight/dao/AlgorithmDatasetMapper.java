package com.yz.sophia.insight.dao;

import com.yz.sophia.insight.model.po.AlgorithmDataset;
import com.yz.sophia.insight.model.po.AlgorithmDatasetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AlgorithmDatasetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algorithm_dataset
     *
     * @mbggenerated
     */
    int countByExample(AlgorithmDatasetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algorithm_dataset
     *
     * @mbggenerated
     */
    int deleteByExample(AlgorithmDatasetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algorithm_dataset
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algorithm_dataset
     *
     * @mbggenerated
     */
    int insert(AlgorithmDataset record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algorithm_dataset
     *
     * @mbggenerated
     */
    int insertSelective(AlgorithmDataset record);

    List<AlgorithmDataset> selectPageByExample(AlgorithmDatasetExample example);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algorithm_dataset
     *
     * @mbggenerated
     */
    List<AlgorithmDataset> selectByExample(AlgorithmDatasetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algorithm_dataset
     *
     * @mbggenerated
     */
    AlgorithmDataset selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algorithm_dataset
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AlgorithmDataset record, @Param("example") AlgorithmDatasetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algorithm_dataset
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AlgorithmDataset record, @Param("example") AlgorithmDatasetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algorithm_dataset
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AlgorithmDataset record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algorithm_dataset
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AlgorithmDataset record);
}
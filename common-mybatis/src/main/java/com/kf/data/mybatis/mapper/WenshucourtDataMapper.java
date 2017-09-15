package com.kf.data.mybatis.mapper;

import com.kf.data.mybatis.entity.WenshucourtData;
import com.kf.data.mybatis.entity.WenshucourtDataExample;
import com.kf.data.mybatis.entity.WenshucourtDataWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WenshucourtDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wenshucourt_data
     *
     * @mbggenerated Thu Sep 14 13:53:49 CST 2017
     */
    int countByExample(WenshucourtDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wenshucourt_data
     *
     * @mbggenerated Thu Sep 14 13:53:49 CST 2017
     */
    int deleteByExample(WenshucourtDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wenshucourt_data
     *
     * @mbggenerated Thu Sep 14 13:53:49 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wenshucourt_data
     *
     * @mbggenerated Thu Sep 14 13:53:49 CST 2017
     */
    int insert(WenshucourtDataWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wenshucourt_data
     *
     * @mbggenerated Thu Sep 14 13:53:49 CST 2017
     */
    int insertSelective(WenshucourtDataWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wenshucourt_data
     *
     * @mbggenerated Thu Sep 14 13:53:49 CST 2017
     */
    List<WenshucourtDataWithBLOBs> selectByExampleWithBLOBs(WenshucourtDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wenshucourt_data
     *
     * @mbggenerated Thu Sep 14 13:53:49 CST 2017
     */
    List<WenshucourtData> selectByExample(WenshucourtDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wenshucourt_data
     *
     * @mbggenerated Thu Sep 14 13:53:49 CST 2017
     */
    WenshucourtDataWithBLOBs selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wenshucourt_data
     *
     * @mbggenerated Thu Sep 14 13:53:49 CST 2017
     */
    int updateByExampleSelective(@Param("record") WenshucourtDataWithBLOBs record, @Param("example") WenshucourtDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wenshucourt_data
     *
     * @mbggenerated Thu Sep 14 13:53:49 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") WenshucourtDataWithBLOBs record, @Param("example") WenshucourtDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wenshucourt_data
     *
     * @mbggenerated Thu Sep 14 13:53:49 CST 2017
     */
    int updateByExample(@Param("record") WenshucourtData record, @Param("example") WenshucourtDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wenshucourt_data
     *
     * @mbggenerated Thu Sep 14 13:53:49 CST 2017
     */
    int updateByPrimaryKeySelective(WenshucourtDataWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wenshucourt_data
     *
     * @mbggenerated Thu Sep 14 13:53:49 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(WenshucourtDataWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wenshucourt_data
     *
     * @mbggenerated Thu Sep 14 13:53:49 CST 2017
     */
    int updateByPrimaryKey(WenshucourtData record);
}
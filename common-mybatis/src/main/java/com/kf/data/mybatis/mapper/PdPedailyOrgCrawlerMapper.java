package com.kf.data.mybatis.mapper;

import com.kf.data.mybatis.entity.PdPedailyOrgCrawler;
import com.kf.data.mybatis.entity.PdPedailyOrgCrawlerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdPedailyOrgCrawlerMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pd_pedaily_org
	 * @mbggenerated  Fri Nov 03 17:28:53 CST 2017
	 */
	int countByExample(PdPedailyOrgCrawlerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pd_pedaily_org
	 * @mbggenerated  Fri Nov 03 17:28:53 CST 2017
	 */
	int deleteByExample(PdPedailyOrgCrawlerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pd_pedaily_org
	 * @mbggenerated  Fri Nov 03 17:28:53 CST 2017
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pd_pedaily_org
	 * @mbggenerated  Fri Nov 03 17:28:53 CST 2017
	 */
	int insert(PdPedailyOrgCrawler record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pd_pedaily_org
	 * @mbggenerated  Fri Nov 03 17:28:53 CST 2017
	 */
	int insertSelective(PdPedailyOrgCrawler record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pd_pedaily_org
	 * @mbggenerated  Fri Nov 03 17:28:53 CST 2017
	 */
	List<PdPedailyOrgCrawler> selectByExample(PdPedailyOrgCrawlerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pd_pedaily_org
	 * @mbggenerated  Fri Nov 03 17:28:53 CST 2017
	 */
	PdPedailyOrgCrawler selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pd_pedaily_org
	 * @mbggenerated  Fri Nov 03 17:28:53 CST 2017
	 */
	int updateByExampleSelective(@Param("record") PdPedailyOrgCrawler record,
			@Param("example") PdPedailyOrgCrawlerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pd_pedaily_org
	 * @mbggenerated  Fri Nov 03 17:28:53 CST 2017
	 */
	int updateByExample(@Param("record") PdPedailyOrgCrawler record,
			@Param("example") PdPedailyOrgCrawlerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pd_pedaily_org
	 * @mbggenerated  Fri Nov 03 17:28:53 CST 2017
	 */
	int updateByPrimaryKeySelective(PdPedailyOrgCrawler record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pd_pedaily_org
	 * @mbggenerated  Fri Nov 03 17:28:53 CST 2017
	 */
	int updateByPrimaryKey(PdPedailyOrgCrawler record);
}
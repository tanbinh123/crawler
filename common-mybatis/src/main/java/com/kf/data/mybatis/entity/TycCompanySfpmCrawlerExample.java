package com.kf.data.mybatis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TycCompanySfpmCrawlerExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tyc_company_sfpm
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tyc_company_sfpm
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tyc_company_sfpm
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_sfpm
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    public TycCompanySfpmCrawlerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_sfpm
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_sfpm
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_sfpm
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_sfpm
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_sfpm
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_sfpm
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_sfpm
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_sfpm
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_sfpm
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tyc_company_sfpm
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tyc_company_sfpm
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAuctionNameIsNull() {
            addCriterion("auction_name is null");
            return (Criteria) this;
        }

        public Criteria andAuctionNameIsNotNull() {
            addCriterion("auction_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionNameEqualTo(String value) {
            addCriterion("auction_name =", value, "auctionName");
            return (Criteria) this;
        }

        public Criteria andAuctionNameNotEqualTo(String value) {
            addCriterion("auction_name <>", value, "auctionName");
            return (Criteria) this;
        }

        public Criteria andAuctionNameGreaterThan(String value) {
            addCriterion("auction_name >", value, "auctionName");
            return (Criteria) this;
        }

        public Criteria andAuctionNameGreaterThanOrEqualTo(String value) {
            addCriterion("auction_name >=", value, "auctionName");
            return (Criteria) this;
        }

        public Criteria andAuctionNameLessThan(String value) {
            addCriterion("auction_name <", value, "auctionName");
            return (Criteria) this;
        }

        public Criteria andAuctionNameLessThanOrEqualTo(String value) {
            addCriterion("auction_name <=", value, "auctionName");
            return (Criteria) this;
        }

        public Criteria andAuctionNameLike(String value) {
            addCriterion("auction_name like", value, "auctionName");
            return (Criteria) this;
        }

        public Criteria andAuctionNameNotLike(String value) {
            addCriterion("auction_name not like", value, "auctionName");
            return (Criteria) this;
        }

        public Criteria andAuctionNameIn(List<String> values) {
            addCriterion("auction_name in", values, "auctionName");
            return (Criteria) this;
        }

        public Criteria andAuctionNameNotIn(List<String> values) {
            addCriterion("auction_name not in", values, "auctionName");
            return (Criteria) this;
        }

        public Criteria andAuctionNameBetween(String value1, String value2) {
            addCriterion("auction_name between", value1, value2, "auctionName");
            return (Criteria) this;
        }

        public Criteria andAuctionNameNotBetween(String value1, String value2) {
            addCriterion("auction_name not between", value1, value2, "auctionName");
            return (Criteria) this;
        }

        public Criteria andAuctionDateIsNull() {
            addCriterion("auction_date is null");
            return (Criteria) this;
        }

        public Criteria andAuctionDateIsNotNull() {
            addCriterion("auction_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionDateEqualTo(Date value) {
            addCriterion("auction_date =", value, "auctionDate");
            return (Criteria) this;
        }

        public Criteria andAuctionDateNotEqualTo(Date value) {
            addCriterion("auction_date <>", value, "auctionDate");
            return (Criteria) this;
        }

        public Criteria andAuctionDateGreaterThan(Date value) {
            addCriterion("auction_date >", value, "auctionDate");
            return (Criteria) this;
        }

        public Criteria andAuctionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("auction_date >=", value, "auctionDate");
            return (Criteria) this;
        }

        public Criteria andAuctionDateLessThan(Date value) {
            addCriterion("auction_date <", value, "auctionDate");
            return (Criteria) this;
        }

        public Criteria andAuctionDateLessThanOrEqualTo(Date value) {
            addCriterion("auction_date <=", value, "auctionDate");
            return (Criteria) this;
        }

        public Criteria andAuctionDateIn(List<Date> values) {
            addCriterion("auction_date in", values, "auctionDate");
            return (Criteria) this;
        }

        public Criteria andAuctionDateNotIn(List<Date> values) {
            addCriterion("auction_date not in", values, "auctionDate");
            return (Criteria) this;
        }

        public Criteria andAuctionDateBetween(Date value1, Date value2) {
            addCriterion("auction_date between", value1, value2, "auctionDate");
            return (Criteria) this;
        }

        public Criteria andAuctionDateNotBetween(Date value1, Date value2) {
            addCriterion("auction_date not between", value1, value2, "auctionDate");
            return (Criteria) this;
        }

        public Criteria andAuctionOrgIsNull() {
            addCriterion("auction_org is null");
            return (Criteria) this;
        }

        public Criteria andAuctionOrgIsNotNull() {
            addCriterion("auction_org is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionOrgEqualTo(String value) {
            addCriterion("auction_org =", value, "auctionOrg");
            return (Criteria) this;
        }

        public Criteria andAuctionOrgNotEqualTo(String value) {
            addCriterion("auction_org <>", value, "auctionOrg");
            return (Criteria) this;
        }

        public Criteria andAuctionOrgGreaterThan(String value) {
            addCriterion("auction_org >", value, "auctionOrg");
            return (Criteria) this;
        }

        public Criteria andAuctionOrgGreaterThanOrEqualTo(String value) {
            addCriterion("auction_org >=", value, "auctionOrg");
            return (Criteria) this;
        }

        public Criteria andAuctionOrgLessThan(String value) {
            addCriterion("auction_org <", value, "auctionOrg");
            return (Criteria) this;
        }

        public Criteria andAuctionOrgLessThanOrEqualTo(String value) {
            addCriterion("auction_org <=", value, "auctionOrg");
            return (Criteria) this;
        }

        public Criteria andAuctionOrgLike(String value) {
            addCriterion("auction_org like", value, "auctionOrg");
            return (Criteria) this;
        }

        public Criteria andAuctionOrgNotLike(String value) {
            addCriterion("auction_org not like", value, "auctionOrg");
            return (Criteria) this;
        }

        public Criteria andAuctionOrgIn(List<String> values) {
            addCriterion("auction_org in", values, "auctionOrg");
            return (Criteria) this;
        }

        public Criteria andAuctionOrgNotIn(List<String> values) {
            addCriterion("auction_org not in", values, "auctionOrg");
            return (Criteria) this;
        }

        public Criteria andAuctionOrgBetween(String value1, String value2) {
            addCriterion("auction_org between", value1, value2, "auctionOrg");
            return (Criteria) this;
        }

        public Criteria andAuctionOrgNotBetween(String value1, String value2) {
            addCriterion("auction_org not between", value1, value2, "auctionOrg");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andStartPriceIsNull() {
            addCriterion("start_price is null");
            return (Criteria) this;
        }

        public Criteria andStartPriceIsNotNull() {
            addCriterion("start_price is not null");
            return (Criteria) this;
        }

        public Criteria andStartPriceEqualTo(Double value) {
            addCriterion("start_price =", value, "startPrice");
            return (Criteria) this;
        }

        public Criteria andStartPriceNotEqualTo(Double value) {
            addCriterion("start_price <>", value, "startPrice");
            return (Criteria) this;
        }

        public Criteria andStartPriceGreaterThan(Double value) {
            addCriterion("start_price >", value, "startPrice");
            return (Criteria) this;
        }

        public Criteria andStartPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("start_price >=", value, "startPrice");
            return (Criteria) this;
        }

        public Criteria andStartPriceLessThan(Double value) {
            addCriterion("start_price <", value, "startPrice");
            return (Criteria) this;
        }

        public Criteria andStartPriceLessThanOrEqualTo(Double value) {
            addCriterion("start_price <=", value, "startPrice");
            return (Criteria) this;
        }

        public Criteria andStartPriceIn(List<Double> values) {
            addCriterion("start_price in", values, "startPrice");
            return (Criteria) this;
        }

        public Criteria andStartPriceNotIn(List<Double> values) {
            addCriterion("start_price not in", values, "startPrice");
            return (Criteria) this;
        }

        public Criteria andStartPriceBetween(Double value1, Double value2) {
            addCriterion("start_price between", value1, value2, "startPrice");
            return (Criteria) this;
        }

        public Criteria andStartPriceNotBetween(Double value1, Double value2) {
            addCriterion("start_price not between", value1, value2, "startPrice");
            return (Criteria) this;
        }

        public Criteria andValuationIsNull() {
            addCriterion("valuation is null");
            return (Criteria) this;
        }

        public Criteria andValuationIsNotNull() {
            addCriterion("valuation is not null");
            return (Criteria) this;
        }

        public Criteria andValuationEqualTo(Double value) {
            addCriterion("valuation =", value, "valuation");
            return (Criteria) this;
        }

        public Criteria andValuationNotEqualTo(Double value) {
            addCriterion("valuation <>", value, "valuation");
            return (Criteria) this;
        }

        public Criteria andValuationGreaterThan(Double value) {
            addCriterion("valuation >", value, "valuation");
            return (Criteria) this;
        }

        public Criteria andValuationGreaterThanOrEqualTo(Double value) {
            addCriterion("valuation >=", value, "valuation");
            return (Criteria) this;
        }

        public Criteria andValuationLessThan(Double value) {
            addCriterion("valuation <", value, "valuation");
            return (Criteria) this;
        }

        public Criteria andValuationLessThanOrEqualTo(Double value) {
            addCriterion("valuation <=", value, "valuation");
            return (Criteria) this;
        }

        public Criteria andValuationIn(List<Double> values) {
            addCriterion("valuation in", values, "valuation");
            return (Criteria) this;
        }

        public Criteria andValuationNotIn(List<Double> values) {
            addCriterion("valuation not in", values, "valuation");
            return (Criteria) this;
        }

        public Criteria andValuationBetween(Double value1, Double value2) {
            addCriterion("valuation between", value1, value2, "valuation");
            return (Criteria) this;
        }

        public Criteria andValuationNotBetween(Double value1, Double value2) {
            addCriterion("valuation not between", value1, value2, "valuation");
            return (Criteria) this;
        }

        public Criteria andDetailLinkIsNull() {
            addCriterion("detail_link is null");
            return (Criteria) this;
        }

        public Criteria andDetailLinkIsNotNull() {
            addCriterion("detail_link is not null");
            return (Criteria) this;
        }

        public Criteria andDetailLinkEqualTo(String value) {
            addCriterion("detail_link =", value, "detailLink");
            return (Criteria) this;
        }

        public Criteria andDetailLinkNotEqualTo(String value) {
            addCriterion("detail_link <>", value, "detailLink");
            return (Criteria) this;
        }

        public Criteria andDetailLinkGreaterThan(String value) {
            addCriterion("detail_link >", value, "detailLink");
            return (Criteria) this;
        }

        public Criteria andDetailLinkGreaterThanOrEqualTo(String value) {
            addCriterion("detail_link >=", value, "detailLink");
            return (Criteria) this;
        }

        public Criteria andDetailLinkLessThan(String value) {
            addCriterion("detail_link <", value, "detailLink");
            return (Criteria) this;
        }

        public Criteria andDetailLinkLessThanOrEqualTo(String value) {
            addCriterion("detail_link <=", value, "detailLink");
            return (Criteria) this;
        }

        public Criteria andDetailLinkLike(String value) {
            addCriterion("detail_link like", value, "detailLink");
            return (Criteria) this;
        }

        public Criteria andDetailLinkNotLike(String value) {
            addCriterion("detail_link not like", value, "detailLink");
            return (Criteria) this;
        }

        public Criteria andDetailLinkIn(List<String> values) {
            addCriterion("detail_link in", values, "detailLink");
            return (Criteria) this;
        }

        public Criteria andDetailLinkNotIn(List<String> values) {
            addCriterion("detail_link not in", values, "detailLink");
            return (Criteria) this;
        }

        public Criteria andDetailLinkBetween(String value1, String value2) {
            addCriterion("detail_link between", value1, value2, "detailLink");
            return (Criteria) this;
        }

        public Criteria andDetailLinkNotBetween(String value1, String value2) {
            addCriterion("detail_link not between", value1, value2, "detailLink");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNull() {
            addCriterion("goods is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNotNull() {
            addCriterion("goods is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsEqualTo(String value) {
            addCriterion("goods =", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotEqualTo(String value) {
            addCriterion("goods <>", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsGreaterThan(String value) {
            addCriterion("goods >", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsGreaterThanOrEqualTo(String value) {
            addCriterion("goods >=", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsLessThan(String value) {
            addCriterion("goods <", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsLessThanOrEqualTo(String value) {
            addCriterion("goods <=", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsLike(String value) {
            addCriterion("goods like", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotLike(String value) {
            addCriterion("goods not like", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsIn(List<String> values) {
            addCriterion("goods in", values, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotIn(List<String> values) {
            addCriterion("goods not in", values, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsBetween(String value1, String value2) {
            addCriterion("goods between", value1, value2, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotBetween(String value1, String value2) {
            addCriterion("goods not between", value1, value2, "goods");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tyc_company_sfpm
     *
     * @mbggenerated do_not_delete_during_merge Sat Sep 30 13:38:40 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tyc_company_sfpm
     *
     * @mbggenerated Sat Sep 30 13:38:40 CST 2017
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
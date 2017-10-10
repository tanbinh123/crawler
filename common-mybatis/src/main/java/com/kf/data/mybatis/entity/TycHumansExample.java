package com.kf.data.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

public class TycHumansExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tyc_humans
	 * @mbggenerated  Tue Sep 26 14:22:49 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tyc_humans
	 * @mbggenerated  Tue Sep 26 14:22:49 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tyc_humans
	 * @mbggenerated  Tue Sep 26 14:22:49 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tyc_humans
	 * @mbggenerated  Tue Sep 26 14:22:49 CST 2017
	 */
	public TycHumansExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tyc_humans
	 * @mbggenerated  Tue Sep 26 14:22:49 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tyc_humans
	 * @mbggenerated  Tue Sep 26 14:22:49 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tyc_humans
	 * @mbggenerated  Tue Sep 26 14:22:49 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tyc_humans
	 * @mbggenerated  Tue Sep 26 14:22:49 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tyc_humans
	 * @mbggenerated  Tue Sep 26 14:22:49 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tyc_humans
	 * @mbggenerated  Tue Sep 26 14:22:49 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tyc_humans
	 * @mbggenerated  Tue Sep 26 14:22:49 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tyc_humans
	 * @mbggenerated  Tue Sep 26 14:22:49 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tyc_humans
	 * @mbggenerated  Tue Sep 26 14:22:49 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tyc_humans
	 * @mbggenerated  Tue Sep 26 14:22:49 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tyc_humans
	 * @mbggenerated  Tue Sep 26 14:22:49 CST 2017
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

		public Criteria andSurnameIsNull() {
			addCriterion("surname is null");
			return (Criteria) this;
		}

		public Criteria andSurnameIsNotNull() {
			addCriterion("surname is not null");
			return (Criteria) this;
		}

		public Criteria andSurnameEqualTo(String value) {
			addCriterion("surname =", value, "surname");
			return (Criteria) this;
		}

		public Criteria andSurnameNotEqualTo(String value) {
			addCriterion("surname <>", value, "surname");
			return (Criteria) this;
		}

		public Criteria andSurnameGreaterThan(String value) {
			addCriterion("surname >", value, "surname");
			return (Criteria) this;
		}

		public Criteria andSurnameGreaterThanOrEqualTo(String value) {
			addCriterion("surname >=", value, "surname");
			return (Criteria) this;
		}

		public Criteria andSurnameLessThan(String value) {
			addCriterion("surname <", value, "surname");
			return (Criteria) this;
		}

		public Criteria andSurnameLessThanOrEqualTo(String value) {
			addCriterion("surname <=", value, "surname");
			return (Criteria) this;
		}

		public Criteria andSurnameLike(String value) {
			addCriterion("surname like", value, "surname");
			return (Criteria) this;
		}

		public Criteria andSurnameNotLike(String value) {
			addCriterion("surname not like", value, "surname");
			return (Criteria) this;
		}

		public Criteria andSurnameIn(List<String> values) {
			addCriterion("surname in", values, "surname");
			return (Criteria) this;
		}

		public Criteria andSurnameNotIn(List<String> values) {
			addCriterion("surname not in", values, "surname");
			return (Criteria) this;
		}

		public Criteria andSurnameBetween(String value1, String value2) {
			addCriterion("surname between", value1, value2, "surname");
			return (Criteria) this;
		}

		public Criteria andSurnameNotBetween(String value1, String value2) {
			addCriterion("surname not between", value1, value2, "surname");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("`name` is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("`name` is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("`name` =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("`name` <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("`name` >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("`name` >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("`name` <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("`name` <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("`name` like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("`name` not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("`name` in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("`name` not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("`name` between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("`name` not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andTycLinkIsNull() {
			addCriterion("tyc_link is null");
			return (Criteria) this;
		}

		public Criteria andTycLinkIsNotNull() {
			addCriterion("tyc_link is not null");
			return (Criteria) this;
		}

		public Criteria andTycLinkEqualTo(String value) {
			addCriterion("tyc_link =", value, "tycLink");
			return (Criteria) this;
		}

		public Criteria andTycLinkNotEqualTo(String value) {
			addCriterion("tyc_link <>", value, "tycLink");
			return (Criteria) this;
		}

		public Criteria andTycLinkGreaterThan(String value) {
			addCriterion("tyc_link >", value, "tycLink");
			return (Criteria) this;
		}

		public Criteria andTycLinkGreaterThanOrEqualTo(String value) {
			addCriterion("tyc_link >=", value, "tycLink");
			return (Criteria) this;
		}

		public Criteria andTycLinkLessThan(String value) {
			addCriterion("tyc_link <", value, "tycLink");
			return (Criteria) this;
		}

		public Criteria andTycLinkLessThanOrEqualTo(String value) {
			addCriterion("tyc_link <=", value, "tycLink");
			return (Criteria) this;
		}

		public Criteria andTycLinkLike(String value) {
			addCriterion("tyc_link like", value, "tycLink");
			return (Criteria) this;
		}

		public Criteria andTycLinkNotLike(String value) {
			addCriterion("tyc_link not like", value, "tycLink");
			return (Criteria) this;
		}

		public Criteria andTycLinkIn(List<String> values) {
			addCriterion("tyc_link in", values, "tycLink");
			return (Criteria) this;
		}

		public Criteria andTycLinkNotIn(List<String> values) {
			addCriterion("tyc_link not in", values, "tycLink");
			return (Criteria) this;
		}

		public Criteria andTycLinkBetween(String value1, String value2) {
			addCriterion("tyc_link between", value1, value2, "tycLink");
			return (Criteria) this;
		}

		public Criteria andTycLinkNotBetween(String value1, String value2) {
			addCriterion("tyc_link not between", value1, value2, "tycLink");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tyc_humans
	 * @mbggenerated  Tue Sep 26 14:22:49 CST 2017
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tyc_humans
     *
     * @mbggenerated do_not_delete_during_merge Tue Sep 26 14:06:37 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}
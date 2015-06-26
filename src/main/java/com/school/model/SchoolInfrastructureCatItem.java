package com.school.model;

// Generated Jun 26, 2015 2:39:37 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SchoolInfrastructureCatItem generated by hbm2java
 */
@Entity
@Table(name = "school_infrastructure_cat_item", catalog = "school_db")
public class SchoolInfrastructureCatItem implements java.io.Serializable {

	private Integer id;
	private InfrastructureCategoryItem infrastructureCategoryItem;
	private School school;
	private Byte isOptional;
	private Integer countItemValue;
	private String description;
	private Double charges;
	private Byte isDeleted;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;

	public SchoolInfrastructureCatItem() {
	}

	public SchoolInfrastructureCatItem(
			InfrastructureCategoryItem infrastructureCategoryItem,
			School school, Byte isOptional, Integer countItemValue,
			String description, Double charges, Byte isDeleted,
			Date lastUpdatedOn, Integer lastUpdatedBy) {
		this.infrastructureCategoryItem = infrastructureCategoryItem;
		this.school = school;
		this.isOptional = isOptional;
		this.countItemValue = countItemValue;
		this.description = description;
		this.charges = charges;
		this.isDeleted = isDeleted;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "infra_cat_id")
	public InfrastructureCategoryItem getInfrastructureCategoryItem() {
		return this.infrastructureCategoryItem;
	}

	public void setInfrastructureCategoryItem(
			InfrastructureCategoryItem infrastructureCategoryItem) {
		this.infrastructureCategoryItem = infrastructureCategoryItem;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "school_id")
	public School getSchool() {
		return this.school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@Column(name = "is_optional")
	public Byte getIsOptional() {
		return this.isOptional;
	}

	public void setIsOptional(Byte isOptional) {
		this.isOptional = isOptional;
	}

	@Column(name = "count_item_value")
	public Integer getCountItemValue() {
		return this.countItemValue;
	}

	public void setCountItemValue(Integer countItemValue) {
		this.countItemValue = countItemValue;
	}

	@Column(name = "description", length = 200)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "charges", precision = 22, scale = 0)
	public Double getCharges() {
		return this.charges;
	}

	public void setCharges(Double charges) {
		this.charges = charges;
	}

	@Column(name = "is_deleted")
	public Byte getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Byte isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_updated_on", length = 19)
	public Date getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	@Column(name = "last_updated_by")
	public Integer getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}

	public void setLastUpdatedBy(Integer lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

}

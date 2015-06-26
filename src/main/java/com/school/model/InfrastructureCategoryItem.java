package com.school.model;

// Generated Jun 26, 2015 2:39:37 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * InfrastructureCategoryItem generated by hbm2java
 */
@Entity
@Table(name = "infrastructure_category_item", catalog = "school_db")
public class InfrastructureCategoryItem implements java.io.Serializable {

	private Integer id;
	private InfrastructureCategory infrastructureCategory;
	private String name;
	private Byte status;
	private String description;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;
	private Byte isOptional;
	private String countItemName;
	private Set<SchoolInfrastructureCatItem> schoolInfrastructureCatItems = new HashSet<SchoolInfrastructureCatItem>(
			0);

	public InfrastructureCategoryItem() {
	}

	public InfrastructureCategoryItem(
			InfrastructureCategory infrastructureCategory, String name,
			Byte status, String description, Date lastUpdatedOn,
			Integer lastUpdatedBy, Byte isOptional, String countItemName,
			Set<SchoolInfrastructureCatItem> schoolInfrastructureCatItems) {
		this.infrastructureCategory = infrastructureCategory;
		this.name = name;
		this.status = status;
		this.description = description;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.isOptional = isOptional;
		this.countItemName = countItemName;
		this.schoolInfrastructureCatItems = schoolInfrastructureCatItems;
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
	public InfrastructureCategory getInfrastructureCategory() {
		return this.infrastructureCategory;
	}

	public void setInfrastructureCategory(
			InfrastructureCategory infrastructureCategory) {
		this.infrastructureCategory = infrastructureCategory;
	}

	@Column(name = "name", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "status")
	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	@Column(name = "description", length = 100)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	@Column(name = "is_optional")
	public Byte getIsOptional() {
		return this.isOptional;
	}

	public void setIsOptional(Byte isOptional) {
		this.isOptional = isOptional;
	}

	@Column(name = "count_item_name", length = 50)
	public String getCountItemName() {
		return this.countItemName;
	}

	public void setCountItemName(String countItemName) {
		this.countItemName = countItemName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "infrastructureCategoryItem")
	public Set<SchoolInfrastructureCatItem> getSchoolInfrastructureCatItems() {
		return this.schoolInfrastructureCatItems;
	}

	public void setSchoolInfrastructureCatItems(
			Set<SchoolInfrastructureCatItem> schoolInfrastructureCatItems) {
		this.schoolInfrastructureCatItems = schoolInfrastructureCatItems;
	}

}

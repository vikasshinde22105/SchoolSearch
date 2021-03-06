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
 * SafetyCategoryItem generated by hbm2java
 */
@Entity
@Table(name = "safety_category_item")
public class SafetyCategoryItem implements java.io.Serializable {

	private Integer id;
	private SafetyCategory safetyCategory;
	private String name;
	private String description;
	private Byte status;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;
	private Set<SchoolSafetyCatItem> schoolSafetyCatItems = new HashSet<SchoolSafetyCatItem>(
			0);

	public SafetyCategoryItem() {
	}

	public SafetyCategoryItem(SafetyCategory safetyCategory, String name,
			String description, Byte status, Date lastUpdatedOn,
			Integer lastUpdatedBy, Set<SchoolSafetyCatItem> schoolSafetyCatItems) {
		this.safetyCategory = safetyCategory;
		this.name = name;
		this.description = description;
		this.status = status;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.schoolSafetyCatItems = schoolSafetyCatItems;
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
	@JoinColumn(name = "safety_category_id")
	public SafetyCategory getSafetyCategory() {
		return this.safetyCategory;
	}

	public void setSafetyCategory(SafetyCategory safetyCategory) {
		this.safetyCategory = safetyCategory;
	}

	@Column(name = "name", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", length = 200)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "status")
	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "safetyCategoryItem")
	public Set<SchoolSafetyCatItem> getSchoolSafetyCatItems() {
		return this.schoolSafetyCatItems;
	}

	public void setSchoolSafetyCatItems(
			Set<SchoolSafetyCatItem> schoolSafetyCatItems) {
		this.schoolSafetyCatItems = schoolSafetyCatItems;
	}

}

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
 * ActivityCategoryItem generated by hbm2java
 */
@Entity
@Table(name = "activity_category_item")
public class ActivityCategoryItem implements java.io.Serializable {

	private Integer id;
	private ActivityCategory activityCategory;
	private String name;
	private String description;
	private Byte status;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;
	private Set<SchoolActivityCatItem> schoolActivityCatItems = new HashSet<SchoolActivityCatItem>(
			0);

	public ActivityCategoryItem() {
	}

	public ActivityCategoryItem(ActivityCategory activityCategory, String name,
			String description, Byte status, Date lastUpdatedOn,
			Integer lastUpdatedBy,
			Set<SchoolActivityCatItem> schoolActivityCatItems) {
		this.activityCategory = activityCategory;
		this.name = name;
		this.description = description;
		this.status = status;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.schoolActivityCatItems = schoolActivityCatItems;
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
	@JoinColumn(name = "activity_cat_id")
	public ActivityCategory getActivityCategory() {
		return this.activityCategory;
	}

	public void setActivityCategory(ActivityCategory activityCategory) {
		this.activityCategory = activityCategory;
	}

	@Column(name = "name", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", length = 150)
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "activityCategoryItem")
	public Set<SchoolActivityCatItem> getSchoolActivityCatItems() {
		return this.schoolActivityCatItems;
	}

	public void setSchoolActivityCatItems(
			Set<SchoolActivityCatItem> schoolActivityCatItems) {
		this.schoolActivityCatItems = schoolActivityCatItems;
	}

}

package com.school.model;

// Generated Jun 16, 2015 4:57:47 PM by Hibernate Tools 4.0.0

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
import javax.persistence.UniqueConstraint;

/**
 * ReviewRatingCategory generated by hbm2java
 */
@Entity
@Table(name = "review_rating_category", catalog = "school_db", uniqueConstraints = @UniqueConstraint(columnNames = "last_updated_on"))
public class ReviewRatingCategory implements java.io.Serializable {

	private Short id;
	private ParentInfo parentInfo;
	private String title;
	private Short sortOrder;
	private Integer status;
	private Integer description;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;

	public ReviewRatingCategory() {
	}

	public ReviewRatingCategory(ParentInfo parentInfo, String title,
			Short sortOrder, Integer status, Integer description,
			Date lastUpdatedOn, Integer lastUpdatedBy) {
		this.parentInfo = parentInfo;
		this.title = title;
		this.sortOrder = sortOrder;
		this.status = status;
		this.description = description;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_id")
	public ParentInfo getParentInfo() {
		return this.parentInfo;
	}

	public void setParentInfo(ParentInfo parentInfo) {
		this.parentInfo = parentInfo;
	}

	@Column(name = "title", length = 200)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "sort_order")
	public Short getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Short sortOrder) {
		this.sortOrder = sortOrder;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Column(name = "description")
	public Integer getDescription() {
		return this.description;
	}

	public void setDescription(Integer description) {
		this.description = description;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_updated_on", unique = true, length = 19)
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

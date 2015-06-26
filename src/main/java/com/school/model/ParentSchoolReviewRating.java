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
 * ParentSchoolReviewRating generated by hbm2java
 */
@Entity
@Table(name = "parent_school_review_rating", catalog = "school_db")
public class ParentSchoolReviewRating implements java.io.Serializable {

	private Integer id;
	private School school;
	private ParentInfo parentInfo;
	private Short reviewRatingCategoryId;
	private Integer ratingPoints;
	private Date ratedOn;
	private Byte status;
	private String description;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;

	public ParentSchoolReviewRating() {
	}

	public ParentSchoolReviewRating(School school, ParentInfo parentInfo,
			Short reviewRatingCategoryId, Integer ratingPoints, Date ratedOn,
			Byte status, String description, Date lastUpdatedOn,
			Integer lastUpdatedBy) {
		this.school = school;
		this.parentInfo = parentInfo;
		this.reviewRatingCategoryId = reviewRatingCategoryId;
		this.ratingPoints = ratingPoints;
		this.ratedOn = ratedOn;
		this.status = status;
		this.description = description;
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
	@JoinColumn(name = "school_id")
	public School getSchool() {
		return this.school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_id")
	public ParentInfo getParentInfo() {
		return this.parentInfo;
	}

	public void setParentInfo(ParentInfo parentInfo) {
		this.parentInfo = parentInfo;
	}

	@Column(name = "review_rating_category_id")
	public Short getReviewRatingCategoryId() {
		return this.reviewRatingCategoryId;
	}

	public void setReviewRatingCategoryId(Short reviewRatingCategoryId) {
		this.reviewRatingCategoryId = reviewRatingCategoryId;
	}

	@Column(name = "rating_points")
	public Integer getRatingPoints() {
		return this.ratingPoints;
	}

	public void setRatingPoints(Integer ratingPoints) {
		this.ratingPoints = ratingPoints;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "rated_on", length = 10)
	public Date getRatedOn() {
		return this.ratedOn;
	}

	public void setRatedOn(Date ratedOn) {
		this.ratedOn = ratedOn;
	}

	@Column(name = "status")
	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	@Column(name = "description")
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

}

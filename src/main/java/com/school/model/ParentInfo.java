package com.school.model;

// Generated Jun 16, 2015 4:57:47 PM by Hibernate Tools 4.0.0

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
 * ParentInfo generated by hbm2java
 */
@Entity
@Table(name = "parent_info", catalog = "school_db")
public class ParentInfo implements java.io.Serializable {

	private Integer id;
	private UserRegistrationInfo userRegistrationInfo;
	private OccupationType occupationType;
	private Boolean userType;
	private String emergencyMobileNo;
	private String organizationName;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;
	private Set<ParentSchoolReviewRating> parentSchoolReviewRatings = new HashSet<ParentSchoolReviewRating>(
			0);
	private Set<ReviewRatingCategory> reviewRatingCategories = new HashSet<ReviewRatingCategory>(
			0);
	private Set<StudentParent> studentParents = new HashSet<StudentParent>(0);
	private Set<ParentSchoolReviewDesc> parentSchoolReviewDescs = new HashSet<ParentSchoolReviewDesc>(
			0);
	private Set<StudentSchoolFeeInfo> studentSchoolFeeInfos = new HashSet<StudentSchoolFeeInfo>(
			0);

	public ParentInfo() {
	}

	public ParentInfo(UserRegistrationInfo userRegistrationInfo,
			OccupationType occupationType, Boolean userType,
			String emergencyMobileNo, String organizationName,
			Date lastUpdatedOn, Integer lastUpdatedBy,
			Set<ParentSchoolReviewRating> parentSchoolReviewRatings,
			Set<ReviewRatingCategory> reviewRatingCategories,
			Set<StudentParent> studentParents,
			Set<ParentSchoolReviewDesc> parentSchoolReviewDescs,
			Set<StudentSchoolFeeInfo> studentSchoolFeeInfos) {
		this.userRegistrationInfo = userRegistrationInfo;
		this.occupationType = occupationType;
		this.userType = userType;
		this.emergencyMobileNo = emergencyMobileNo;
		this.organizationName = organizationName;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.parentSchoolReviewRatings = parentSchoolReviewRatings;
		this.reviewRatingCategories = reviewRatingCategories;
		this.studentParents = studentParents;
		this.parentSchoolReviewDescs = parentSchoolReviewDescs;
		this.studentSchoolFeeInfos = studentSchoolFeeInfos;
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
	@JoinColumn(name = "user_id")
	public UserRegistrationInfo getUserRegistrationInfo() {
		return this.userRegistrationInfo;
	}

	public void setUserRegistrationInfo(
			UserRegistrationInfo userRegistrationInfo) {
		this.userRegistrationInfo = userRegistrationInfo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "occupation_type_id")
	public OccupationType getOccupationType() {
		return this.occupationType;
	}

	public void setOccupationType(OccupationType occupationType) {
		this.occupationType = occupationType;
	}

	@Column(name = "user_type")
	public Boolean getUserType() {
		return this.userType;
	}

	public void setUserType(Boolean userType) {
		this.userType = userType;
	}

	@Column(name = "emergency_mobile_no", length = 15)
	public String getEmergencyMobileNo() {
		return this.emergencyMobileNo;
	}

	public void setEmergencyMobileNo(String emergencyMobileNo) {
		this.emergencyMobileNo = emergencyMobileNo;
	}

	@Column(name = "organization_name", length = 200)
	public String getOrganizationName() {
		return this.organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "parentInfo")
	public Set<ParentSchoolReviewRating> getParentSchoolReviewRatings() {
		return this.parentSchoolReviewRatings;
	}

	public void setParentSchoolReviewRatings(
			Set<ParentSchoolReviewRating> parentSchoolReviewRatings) {
		this.parentSchoolReviewRatings = parentSchoolReviewRatings;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "parentInfo")
	public Set<ReviewRatingCategory> getReviewRatingCategories() {
		return this.reviewRatingCategories;
	}

	public void setReviewRatingCategories(
			Set<ReviewRatingCategory> reviewRatingCategories) {
		this.reviewRatingCategories = reviewRatingCategories;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "parentInfo")
	public Set<StudentParent> getStudentParents() {
		return this.studentParents;
	}

	public void setStudentParents(Set<StudentParent> studentParents) {
		this.studentParents = studentParents;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "parentInfo")
	public Set<ParentSchoolReviewDesc> getParentSchoolReviewDescs() {
		return this.parentSchoolReviewDescs;
	}

	public void setParentSchoolReviewDescs(
			Set<ParentSchoolReviewDesc> parentSchoolReviewDescs) {
		this.parentSchoolReviewDescs = parentSchoolReviewDescs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "parentInfo")
	public Set<StudentSchoolFeeInfo> getStudentSchoolFeeInfos() {
		return this.studentSchoolFeeInfos;
	}

	public void setStudentSchoolFeeInfos(
			Set<StudentSchoolFeeInfo> studentSchoolFeeInfos) {
		this.studentSchoolFeeInfos = studentSchoolFeeInfos;
	}

}

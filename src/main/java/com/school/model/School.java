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
 * School generated by hbm2java
 */
@Entity
@Table(name = "school", catalog = "school_db")
public class School implements java.io.Serializable {

	private Integer id;
	private Locality locality;
	private String name;
	private String plotNo;
	private String streetName;
	private String landmark;
	private String pincode;
	private String longitude;
	private String latitude;
	private String alias;
	private String tagLine;
	private String aboutSchool;
	private String logo;
	private Byte establishmentType;
	private Byte status;
	private Byte isFreeListing;
	private Date trialStartDate;
	private Date trialEndDate;
	private Date liveDate;
	private Date createdOn;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;
	private Integer createdBy;
	private Set<SchoolExam> schoolExams = new HashSet<SchoolExam>(0);
	private Set<SchoolSafetyCatItem> schoolSafetyCatItems = new HashSet<SchoolSafetyCatItem>(
			0);
	private Set<SchoolTimeline> schoolTimelines = new HashSet<SchoolTimeline>(0);
	private Set<Event> events = new HashSet<Event>(0);
	private Set<SchoolFeeDetail> schoolFeeDetails = new HashSet<SchoolFeeDetail>(
			0);
	private Set<ParentSchoolReviewRating> parentSchoolReviewRatings = new HashSet<ParentSchoolReviewRating>(
			0);
	private Set<SchoolPaymentMode> schoolPaymentModes = new HashSet<SchoolPaymentMode>(
			0);
	private Set<SchoolTeacher> schoolTeachers = new HashSet<SchoolTeacher>(0);
	private Set<SchoolActivityCatItem> schoolActivityCatItems = new HashSet<SchoolActivityCatItem>(
			0);
	private Set<SchoolMedium> schoolMediums = new HashSet<SchoolMedium>(0);
	private Set<SchoolEmergencyContact> schoolEmergencyContacts = new HashSet<SchoolEmergencyContact>(
			0);
	private Set<SchoolHighlight> schoolHighlights = new HashSet<SchoolHighlight>(
			0);
	private Set<AttendanceInfo> attendanceInfos = new HashSet<AttendanceInfo>(0);
	private Set<SchoolBankAccountDetails> schoolBankAccountDetailses = new HashSet<SchoolBankAccountDetails>(
			0);
	private Set<SchoolInfrastructureCatItem> schoolInfrastructureCatItems = new HashSet<SchoolInfrastructureCatItem>(
			0);
	private Set<ClassInfo> classInfos = new HashSet<ClassInfo>(0);
	private Set<SchoolBoard> schoolBoards = new HashSet<SchoolBoard>(0);
	private Set<SchoolRating> schoolRatings = new HashSet<SchoolRating>(0);
	private Set<StudentPrevSchoolDetail> studentPrevSchoolDetails = new HashSet<StudentPrevSchoolDetail>(
			0);
	private Set<StudentSchoolInfo> studentSchoolInfos = new HashSet<StudentSchoolInfo>(
			0);
	private Set<UserRating> userRatings = new HashSet<UserRating>(0);
	private Set<SchoolInfo> schoolInfos = new HashSet<SchoolInfo>(0);
	private Set<ContactInfo> contactInfos = new HashSet<ContactInfo>(0);
	private Set<SchoolBus> schoolBuses = new HashSet<SchoolBus>(0);
	private Set<TimeTable> timeTables = new HashSet<TimeTable>(0);
	private Set<StudentProfile> studentProfiles = new HashSet<StudentProfile>(0);
	private Set<CampusInfo> campusInfos = new HashSet<CampusInfo>(0);
	private Set<ParentSchoolReviewDesc> parentSchoolReviewDescs = new HashSet<ParentSchoolReviewDesc>(
			0);
	private Set<RoleLeaveTracking> roleLeaveTrackings = new HashSet<RoleLeaveTracking>(
			0);
	private Set<SalesInfo> salesInfos = new HashSet<SalesInfo>(0);
	private Set<ClassSubjects> classSubjectses = new HashSet<ClassSubjects>(0);

	public School() {
	}

	public School(Locality locality, String name, String plotNo,
			String streetName, String landmark, String pincode,
			String longitude, String latitude, String alias, String tagLine,
			String aboutSchool, String logo, Byte establishmentType,
			Byte status, Byte isFreeListing, Date trialStartDate,
			Date trialEndDate, Date liveDate, Date createdOn,
			Date lastUpdatedOn, Integer lastUpdatedBy, Integer createdBy,
			Set<SchoolExam> schoolExams,
			Set<SchoolSafetyCatItem> schoolSafetyCatItems,
			Set<SchoolTimeline> schoolTimelines, Set<Event> events,
			Set<SchoolFeeDetail> schoolFeeDetails,
			Set<ParentSchoolReviewRating> parentSchoolReviewRatings,
			Set<SchoolPaymentMode> schoolPaymentModes,
			Set<SchoolTeacher> schoolTeachers,
			Set<SchoolActivityCatItem> schoolActivityCatItems,
			Set<SchoolMedium> schoolMediums,
			Set<SchoolEmergencyContact> schoolEmergencyContacts,
			Set<SchoolHighlight> schoolHighlights,
			Set<AttendanceInfo> attendanceInfos,
			Set<SchoolBankAccountDetails> schoolBankAccountDetailses,
			Set<SchoolInfrastructureCatItem> schoolInfrastructureCatItems,
			Set<ClassInfo> classInfos, Set<SchoolBoard> schoolBoards,
			Set<SchoolRating> schoolRatings,
			Set<StudentPrevSchoolDetail> studentPrevSchoolDetails,
			Set<StudentSchoolInfo> studentSchoolInfos,
			Set<UserRating> userRatings, Set<SchoolInfo> schoolInfos,
			Set<ContactInfo> contactInfos, Set<SchoolBus> schoolBuses,
			Set<TimeTable> timeTables, Set<StudentProfile> studentProfiles,
			Set<CampusInfo> campusInfos,
			Set<ParentSchoolReviewDesc> parentSchoolReviewDescs,
			Set<RoleLeaveTracking> roleLeaveTrackings,
			Set<SalesInfo> salesInfos, Set<ClassSubjects> classSubjectses) {
		this.locality = locality;
		this.name = name;
		this.plotNo = plotNo;
		this.streetName = streetName;
		this.landmark = landmark;
		this.pincode = pincode;
		this.longitude = longitude;
		this.latitude = latitude;
		this.alias = alias;
		this.tagLine = tagLine;
		this.aboutSchool = aboutSchool;
		this.logo = logo;
		this.establishmentType = establishmentType;
		this.status = status;
		this.isFreeListing = isFreeListing;
		this.trialStartDate = trialStartDate;
		this.trialEndDate = trialEndDate;
		this.liveDate = liveDate;
		this.createdOn = createdOn;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.createdBy = createdBy;
		this.schoolExams = schoolExams;
		this.schoolSafetyCatItems = schoolSafetyCatItems;
		this.schoolTimelines = schoolTimelines;
		this.events = events;
		this.schoolFeeDetails = schoolFeeDetails;
		this.parentSchoolReviewRatings = parentSchoolReviewRatings;
		this.schoolPaymentModes = schoolPaymentModes;
		this.schoolTeachers = schoolTeachers;
		this.schoolActivityCatItems = schoolActivityCatItems;
		this.schoolMediums = schoolMediums;
		this.schoolEmergencyContacts = schoolEmergencyContacts;
		this.schoolHighlights = schoolHighlights;
		this.attendanceInfos = attendanceInfos;
		this.schoolBankAccountDetailses = schoolBankAccountDetailses;
		this.schoolInfrastructureCatItems = schoolInfrastructureCatItems;
		this.classInfos = classInfos;
		this.schoolBoards = schoolBoards;
		this.schoolRatings = schoolRatings;
		this.studentPrevSchoolDetails = studentPrevSchoolDetails;
		this.studentSchoolInfos = studentSchoolInfos;
		this.userRatings = userRatings;
		this.schoolInfos = schoolInfos;
		this.contactInfos = contactInfos;
		this.schoolBuses = schoolBuses;
		this.timeTables = timeTables;
		this.studentProfiles = studentProfiles;
		this.campusInfos = campusInfos;
		this.parentSchoolReviewDescs = parentSchoolReviewDescs;
		this.roleLeaveTrackings = roleLeaveTrackings;
		this.salesInfos = salesInfos;
		this.classSubjectses = classSubjectses;
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
	@JoinColumn(name = "locality_id")
	public Locality getLocality() {
		return this.locality;
	}

	public void setLocality(Locality locality) {
		this.locality = locality;
	}

	@Column(name = "name", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "plot_no", length = 100)
	public String getPlotNo() {
		return this.plotNo;
	}

	public void setPlotNo(String plotNo) {
		this.plotNo = plotNo;
	}

	@Column(name = "street_name", length = 500)
	public String getStreetName() {
		return this.streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	@Column(name = "landmark", length = 150)
	public String getLandmark() {
		return this.landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	@Column(name = "pincode", length = 100)
	public String getPincode() {
		return this.pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Column(name = "longitude", length = 15)
	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@Column(name = "latitude", length = 15)
	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@Column(name = "alias", length = 200)
	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	@Column(name = "tag_line", length = 200)
	public String getTagLine() {
		return this.tagLine;
	}

	public void setTagLine(String tagLine) {
		this.tagLine = tagLine;
	}

	@Column(name = "about_school", length = 65535)
	public String getAboutSchool() {
		return this.aboutSchool;
	}

	public void setAboutSchool(String aboutSchool) {
		this.aboutSchool = aboutSchool;
	}

	@Column(name = "logo", length = 200)
	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	@Column(name = "establishment_type")
	public Byte getEstablishmentType() {
		return this.establishmentType;
	}

	public void setEstablishmentType(Byte establishmentType) {
		this.establishmentType = establishmentType;
	}

	@Column(name = "status")
	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	@Column(name = "is_free_listing")
	public Byte getIsFreeListing() {
		return this.isFreeListing;
	}

	public void setIsFreeListing(Byte isFreeListing) {
		this.isFreeListing = isFreeListing;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "trial_start_date", length = 10)
	public Date getTrialStartDate() {
		return this.trialStartDate;
	}

	public void setTrialStartDate(Date trialStartDate) {
		this.trialStartDate = trialStartDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "trial_end_date", length = 10)
	public Date getTrialEndDate() {
		return this.trialEndDate;
	}

	public void setTrialEndDate(Date trialEndDate) {
		this.trialEndDate = trialEndDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "live_date", length = 19)
	public Date getLiveDate() {
		return this.liveDate;
	}

	public void setLiveDate(Date liveDate) {
		this.liveDate = liveDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_on", length = 19)
	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
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

	@Column(name = "created_by")
	public Integer getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<SchoolExam> getSchoolExams() {
		return this.schoolExams;
	}

	public void setSchoolExams(Set<SchoolExam> schoolExams) {
		this.schoolExams = schoolExams;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<SchoolSafetyCatItem> getSchoolSafetyCatItems() {
		return this.schoolSafetyCatItems;
	}

	public void setSchoolSafetyCatItems(
			Set<SchoolSafetyCatItem> schoolSafetyCatItems) {
		this.schoolSafetyCatItems = schoolSafetyCatItems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<SchoolTimeline> getSchoolTimelines() {
		return this.schoolTimelines;
	}

	public void setSchoolTimelines(Set<SchoolTimeline> schoolTimelines) {
		this.schoolTimelines = schoolTimelines;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<Event> getEvents() {
		return this.events;
	}

	public void setEvents(Set<Event> events) {
		this.events = events;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<SchoolFeeDetail> getSchoolFeeDetails() {
		return this.schoolFeeDetails;
	}

	public void setSchoolFeeDetails(Set<SchoolFeeDetail> schoolFeeDetails) {
		this.schoolFeeDetails = schoolFeeDetails;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<ParentSchoolReviewRating> getParentSchoolReviewRatings() {
		return this.parentSchoolReviewRatings;
	}

	public void setParentSchoolReviewRatings(
			Set<ParentSchoolReviewRating> parentSchoolReviewRatings) {
		this.parentSchoolReviewRatings = parentSchoolReviewRatings;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<SchoolPaymentMode> getSchoolPaymentModes() {
		return this.schoolPaymentModes;
	}

	public void setSchoolPaymentModes(Set<SchoolPaymentMode> schoolPaymentModes) {
		this.schoolPaymentModes = schoolPaymentModes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<SchoolTeacher> getSchoolTeachers() {
		return this.schoolTeachers;
	}

	public void setSchoolTeachers(Set<SchoolTeacher> schoolTeachers) {
		this.schoolTeachers = schoolTeachers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<SchoolActivityCatItem> getSchoolActivityCatItems() {
		return this.schoolActivityCatItems;
	}

	public void setSchoolActivityCatItems(
			Set<SchoolActivityCatItem> schoolActivityCatItems) {
		this.schoolActivityCatItems = schoolActivityCatItems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<SchoolMedium> getSchoolMediums() {
		return this.schoolMediums;
	}

	public void setSchoolMediums(Set<SchoolMedium> schoolMediums) {
		this.schoolMediums = schoolMediums;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<SchoolEmergencyContact> getSchoolEmergencyContacts() {
		return this.schoolEmergencyContacts;
	}

	public void setSchoolEmergencyContacts(
			Set<SchoolEmergencyContact> schoolEmergencyContacts) {
		this.schoolEmergencyContacts = schoolEmergencyContacts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<SchoolHighlight> getSchoolHighlights() {
		return this.schoolHighlights;
	}

	public void setSchoolHighlights(Set<SchoolHighlight> schoolHighlights) {
		this.schoolHighlights = schoolHighlights;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<AttendanceInfo> getAttendanceInfos() {
		return this.attendanceInfos;
	}

	public void setAttendanceInfos(Set<AttendanceInfo> attendanceInfos) {
		this.attendanceInfos = attendanceInfos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<SchoolBankAccountDetails> getSchoolBankAccountDetailses() {
		return this.schoolBankAccountDetailses;
	}

	public void setSchoolBankAccountDetailses(
			Set<SchoolBankAccountDetails> schoolBankAccountDetailses) {
		this.schoolBankAccountDetailses = schoolBankAccountDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<SchoolInfrastructureCatItem> getSchoolInfrastructureCatItems() {
		return this.schoolInfrastructureCatItems;
	}

	public void setSchoolInfrastructureCatItems(
			Set<SchoolInfrastructureCatItem> schoolInfrastructureCatItems) {
		this.schoolInfrastructureCatItems = schoolInfrastructureCatItems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<ClassInfo> getClassInfos() {
		return this.classInfos;
	}

	public void setClassInfos(Set<ClassInfo> classInfos) {
		this.classInfos = classInfos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<SchoolBoard> getSchoolBoards() {
		return this.schoolBoards;
	}

	public void setSchoolBoards(Set<SchoolBoard> schoolBoards) {
		this.schoolBoards = schoolBoards;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<SchoolRating> getSchoolRatings() {
		return this.schoolRatings;
	}

	public void setSchoolRatings(Set<SchoolRating> schoolRatings) {
		this.schoolRatings = schoolRatings;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<StudentPrevSchoolDetail> getStudentPrevSchoolDetails() {
		return this.studentPrevSchoolDetails;
	}

	public void setStudentPrevSchoolDetails(
			Set<StudentPrevSchoolDetail> studentPrevSchoolDetails) {
		this.studentPrevSchoolDetails = studentPrevSchoolDetails;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<StudentSchoolInfo> getStudentSchoolInfos() {
		return this.studentSchoolInfos;
	}

	public void setStudentSchoolInfos(Set<StudentSchoolInfo> studentSchoolInfos) {
		this.studentSchoolInfos = studentSchoolInfos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<UserRating> getUserRatings() {
		return this.userRatings;
	}

	public void setUserRatings(Set<UserRating> userRatings) {
		this.userRatings = userRatings;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<SchoolInfo> getSchoolInfos() {
		return this.schoolInfos;
	}

	public void setSchoolInfos(Set<SchoolInfo> schoolInfos) {
		this.schoolInfos = schoolInfos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<ContactInfo> getContactInfos() {
		return this.contactInfos;
	}

	public void setContactInfos(Set<ContactInfo> contactInfos) {
		this.contactInfos = contactInfos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<SchoolBus> getSchoolBuses() {
		return this.schoolBuses;
	}

	public void setSchoolBuses(Set<SchoolBus> schoolBuses) {
		this.schoolBuses = schoolBuses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<TimeTable> getTimeTables() {
		return this.timeTables;
	}

	public void setTimeTables(Set<TimeTable> timeTables) {
		this.timeTables = timeTables;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<StudentProfile> getStudentProfiles() {
		return this.studentProfiles;
	}

	public void setStudentProfiles(Set<StudentProfile> studentProfiles) {
		this.studentProfiles = studentProfiles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<CampusInfo> getCampusInfos() {
		return this.campusInfos;
	}

	public void setCampusInfos(Set<CampusInfo> campusInfos) {
		this.campusInfos = campusInfos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<ParentSchoolReviewDesc> getParentSchoolReviewDescs() {
		return this.parentSchoolReviewDescs;
	}

	public void setParentSchoolReviewDescs(
			Set<ParentSchoolReviewDesc> parentSchoolReviewDescs) {
		this.parentSchoolReviewDescs = parentSchoolReviewDescs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<RoleLeaveTracking> getRoleLeaveTrackings() {
		return this.roleLeaveTrackings;
	}

	public void setRoleLeaveTrackings(Set<RoleLeaveTracking> roleLeaveTrackings) {
		this.roleLeaveTrackings = roleLeaveTrackings;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<SalesInfo> getSalesInfos() {
		return this.salesInfos;
	}

	public void setSalesInfos(Set<SalesInfo> salesInfos) {
		this.salesInfos = salesInfos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
	public Set<ClassSubjects> getClassSubjectses() {
		return this.classSubjectses;
	}

	public void setClassSubjectses(Set<ClassSubjects> classSubjectses) {
		this.classSubjectses = classSubjectses;
	}

}
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
 * TeacherStaffInfo generated by hbm2java
 */
@Entity
@Table(name = "teacher_staff_info")
public class TeacherStaffInfo implements java.io.Serializable {

	private Integer id;
	private UserRegistrationInfo userRegistrationInfo;
	private Boolean isStaff;
	private Date dateOfJoining;
	private Byte experience;
	private String educationQualifiction;
	private String awardDesc;
	private String extraCurricularActivity;
	private String labName;
	private String deptName;
	private String drivingLicenseNo;
	private Date drivingLicenseValidTill;
	private Date lastUpdatedOn;
	private int lastUpdatedBy;
	private Set<TeacherExperience> teacherExperiences = new HashSet<TeacherExperience>(
			0);
	private Set<StudentAttendance> studentAttendances = new HashSet<StudentAttendance>(
			0);
	private Set<SchoolTeacher> schoolTeachers = new HashSet<SchoolTeacher>(0);
	private Set<TeacherClassSkill> teacherClassSkills = new HashSet<TeacherClassSkill>(
			0);
	private Set<TeacherEducationInfo> teacherEducationInfos = new HashSet<TeacherEducationInfo>(
			0);
	private Set<TeacherAttendance> teacherAttendances = new HashSet<TeacherAttendance>(
			0);
	private Set<TeacherTimeTable> teacherTimeTables = new HashSet<TeacherTimeTable>(
			0);
	private Set<TeacherSubject> teacherSubjects = new HashSet<TeacherSubject>(0);
	private Set<TeacherClass> teacherClasses = new HashSet<TeacherClass>(0);

	public TeacherStaffInfo() {
	}

	public TeacherStaffInfo(int lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public TeacherStaffInfo(UserRegistrationInfo userRegistrationInfo,
			Boolean isStaff, Date dateOfJoining, Byte experience,
			String educationQualifiction, String awardDesc,
			String extraCurricularActivity, String labName, String deptName,
			String drivingLicenseNo, Date drivingLicenseValidTill,
			Date lastUpdatedOn, int lastUpdatedBy,
			Set<TeacherExperience> teacherExperiences,
			Set<StudentAttendance> studentAttendances,
			Set<SchoolTeacher> schoolTeachers,
			Set<TeacherClassSkill> teacherClassSkills,
			Set<TeacherEducationInfo> teacherEducationInfos,
			Set<TeacherAttendance> teacherAttendances,
			Set<TeacherTimeTable> teacherTimeTables,
			Set<TeacherSubject> teacherSubjects,
			Set<TeacherClass> teacherClasses) {
		this.userRegistrationInfo = userRegistrationInfo;
		this.isStaff = isStaff;
		this.dateOfJoining = dateOfJoining;
		this.experience = experience;
		this.educationQualifiction = educationQualifiction;
		this.awardDesc = awardDesc;
		this.extraCurricularActivity = extraCurricularActivity;
		this.labName = labName;
		this.deptName = deptName;
		this.drivingLicenseNo = drivingLicenseNo;
		this.drivingLicenseValidTill = drivingLicenseValidTill;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.teacherExperiences = teacherExperiences;
		this.studentAttendances = studentAttendances;
		this.schoolTeachers = schoolTeachers;
		this.teacherClassSkills = teacherClassSkills;
		this.teacherEducationInfos = teacherEducationInfos;
		this.teacherAttendances = teacherAttendances;
		this.teacherTimeTables = teacherTimeTables;
		this.teacherSubjects = teacherSubjects;
		this.teacherClasses = teacherClasses;
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

	@Column(name = "is_staff")
	public Boolean getIsStaff() {
		return this.isStaff;
	}

	public void setIsStaff(Boolean isStaff) {
		this.isStaff = isStaff;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_of_joining", length = 10)
	public Date getDateOfJoining() {
		return this.dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	@Column(name = "experience")
	public Byte getExperience() {
		return this.experience;
	}

	public void setExperience(Byte experience) {
		this.experience = experience;
	}

	@Column(name = "education_qualifiction", length = 400)
	public String getEducationQualifiction() {
		return this.educationQualifiction;
	}

	public void setEducationQualifiction(String educationQualifiction) {
		this.educationQualifiction = educationQualifiction;
	}

	@Column(name = "award_desc", length = 16777215)
	public String getAwardDesc() {
		return this.awardDesc;
	}

	public void setAwardDesc(String awardDesc) {
		this.awardDesc = awardDesc;
	}

	@Column(name = "extra_curricular_activity", length = 200)
	public String getExtraCurricularActivity() {
		return this.extraCurricularActivity;
	}

	public void setExtraCurricularActivity(String extraCurricularActivity) {
		this.extraCurricularActivity = extraCurricularActivity;
	}

	@Column(name = "lab_name", length = 200)
	public String getLabName() {
		return this.labName;
	}

	public void setLabName(String labName) {
		this.labName = labName;
	}

	@Column(name = "dept_name", length = 200)
	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Column(name = "driving_license_no", length = 20)
	public String getDrivingLicenseNo() {
		return this.drivingLicenseNo;
	}

	public void setDrivingLicenseNo(String drivingLicenseNo) {
		this.drivingLicenseNo = drivingLicenseNo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "driving_license_valid_till", length = 10)
	public Date getDrivingLicenseValidTill() {
		return this.drivingLicenseValidTill;
	}

	public void setDrivingLicenseValidTill(Date drivingLicenseValidTill) {
		this.drivingLicenseValidTill = drivingLicenseValidTill;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_updated_on", length = 19)
	public Date getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	@Column(name = "last_updated_by", nullable = false)
	public int getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}

	public void setLastUpdatedBy(int lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "teacherStaffInfo")
	public Set<TeacherExperience> getTeacherExperiences() {
		return this.teacherExperiences;
	}

	public void setTeacherExperiences(Set<TeacherExperience> teacherExperiences) {
		this.teacherExperiences = teacherExperiences;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "teacherStaffInfo")
	public Set<StudentAttendance> getStudentAttendances() {
		return this.studentAttendances;
	}

	public void setStudentAttendances(Set<StudentAttendance> studentAttendances) {
		this.studentAttendances = studentAttendances;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "teacherStaffInfo")
	public Set<SchoolTeacher> getSchoolTeachers() {
		return this.schoolTeachers;
	}

	public void setSchoolTeachers(Set<SchoolTeacher> schoolTeachers) {
		this.schoolTeachers = schoolTeachers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "teacherStaffInfo")
	public Set<TeacherClassSkill> getTeacherClassSkills() {
		return this.teacherClassSkills;
	}

	public void setTeacherClassSkills(Set<TeacherClassSkill> teacherClassSkills) {
		this.teacherClassSkills = teacherClassSkills;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "teacherStaffInfo")
	public Set<TeacherEducationInfo> getTeacherEducationInfos() {
		return this.teacherEducationInfos;
	}

	public void setTeacherEducationInfos(
			Set<TeacherEducationInfo> teacherEducationInfos) {
		this.teacherEducationInfos = teacherEducationInfos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "teacherStaffInfo")
	public Set<TeacherAttendance> getTeacherAttendances() {
		return this.teacherAttendances;
	}

	public void setTeacherAttendances(Set<TeacherAttendance> teacherAttendances) {
		this.teacherAttendances = teacherAttendances;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "teacherStaffInfo")
	public Set<TeacherTimeTable> getTeacherTimeTables() {
		return this.teacherTimeTables;
	}

	public void setTeacherTimeTables(Set<TeacherTimeTable> teacherTimeTables) {
		this.teacherTimeTables = teacherTimeTables;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "teacherStaffInfo")
	public Set<TeacherSubject> getTeacherSubjects() {
		return this.teacherSubjects;
	}

	public void setTeacherSubjects(Set<TeacherSubject> teacherSubjects) {
		this.teacherSubjects = teacherSubjects;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "teacherStaffInfo")
	public Set<TeacherClass> getTeacherClasses() {
		return this.teacherClasses;
	}

	public void setTeacherClasses(Set<TeacherClass> teacherClasses) {
		this.teacherClasses = teacherClasses;
	}

}

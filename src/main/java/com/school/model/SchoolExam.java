package com.school.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

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
 * SchoolExam generated by hbm2java
 */
@Entity
@Table(name = "school_exam", catalog = "school_db")
public class SchoolExam implements java.io.Serializable {

	private Integer id;
	private School school;
	private Integer classId;
	private Integer sectionId;
	private Short examTypeId;
	private String title;
	private Date fromDate;
	private Date toDate;
	private Float totalMarks;
	private Byte isDeleted;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;
	private Set schoolExamSubjects = new HashSet(0);

	public SchoolExam() {
	}

	public SchoolExam(School school, Integer classId, Integer sectionId,
			Short examTypeId, String title, Date fromDate, Date toDate,
			Float totalMarks, Byte isDeleted, Date lastUpdatedOn,
			Integer lastUpdatedBy, Set schoolExamSubjects) {
		this.school = school;
		this.classId = classId;
		this.sectionId = sectionId;
		this.examTypeId = examTypeId;
		this.title = title;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.totalMarks = totalMarks;
		this.isDeleted = isDeleted;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.schoolExamSubjects = schoolExamSubjects;
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

	@Column(name = "class_id")
	public Integer getClassId() {
		return this.classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	@Column(name = "section_id")
	public Integer getSectionId() {
		return this.sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

	@Column(name = "exam_type_id")
	public Short getExamTypeId() {
		return this.examTypeId;
	}

	public void setExamTypeId(Short examTypeId) {
		this.examTypeId = examTypeId;
	}

	@Column(name = "title", length = 50)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "from_date", length = 10)
	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "to_date", length = 10)
	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	@Column(name = "total_marks", precision = 9, scale = 3)
	public Float getTotalMarks() {
		return this.totalMarks;
	}

	public void setTotalMarks(Float totalMarks) {
		this.totalMarks = totalMarks;
	}

	@Column(name = "is_deleted")
	public Byte getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Byte isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "last_updated_on", length = 10)
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "schoolExam")
	public Set getSchoolExamSubjects() {
		return this.schoolExamSubjects;
	}

	public void setSchoolExamSubjects(Set schoolExamSubjects) {
		this.schoolExamSubjects = schoolExamSubjects;
	}

}

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
 * SchoolTimelineMilestone generated by hbm2java
 */
@Entity
@Table(name = "school_timeline_milestone")
public class SchoolTimelineMilestone implements java.io.Serializable {

	private Integer id;
	private SchoolTimeline schoolTimeline;
	private String title;
	private String milestoneDesc;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;

	public SchoolTimelineMilestone() {
	}

	public SchoolTimelineMilestone(SchoolTimeline schoolTimeline, String title,
			String milestoneDesc, Date lastUpdatedOn, Integer lastUpdatedBy) {
		this.schoolTimeline = schoolTimeline;
		this.title = title;
		this.milestoneDesc = milestoneDesc;
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
	@JoinColumn(name = "school_timeline_id")
	public SchoolTimeline getSchoolTimeline() {
		return this.schoolTimeline;
	}

	public void setSchoolTimeline(SchoolTimeline schoolTimeline) {
		this.schoolTimeline = schoolTimeline;
	}

	@Column(name = "title", length = 100)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "milestone_desc")
	public String getMilestoneDesc() {
		return this.milestoneDesc;
	}

	public void setMilestoneDesc(String milestoneDesc) {
		this.milestoneDesc = milestoneDesc;
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

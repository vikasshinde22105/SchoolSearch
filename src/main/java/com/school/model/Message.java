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
 * Message generated by hbm2java
 */
@Entity
@Table(name = "message", catalog = "school_db")
public class Message implements java.io.Serializable {

	private Integer id;
	private UserRegistrationInfo userRegistrationInfoByFromUserId;
	private UserRegistrationInfo userRegistrationInfoByToUserId;
	private String subject;
	private Byte messageType;
	private String description;
	private Date messageSentDate;
	private Date messageReadDate;
	private Boolean isRead;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;

	public Message() {
	}

	public Message(UserRegistrationInfo userRegistrationInfoByFromUserId,
			UserRegistrationInfo userRegistrationInfoByToUserId,
			String subject, Byte messageType, String description,
			Date messageSentDate, Date messageReadDate, Boolean isRead,
			Date lastUpdatedOn, Integer lastUpdatedBy) {
		this.userRegistrationInfoByFromUserId = userRegistrationInfoByFromUserId;
		this.userRegistrationInfoByToUserId = userRegistrationInfoByToUserId;
		this.subject = subject;
		this.messageType = messageType;
		this.description = description;
		this.messageSentDate = messageSentDate;
		this.messageReadDate = messageReadDate;
		this.isRead = isRead;
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
	@JoinColumn(name = "from_user_id")
	public UserRegistrationInfo getUserRegistrationInfoByFromUserId() {
		return this.userRegistrationInfoByFromUserId;
	}

	public void setUserRegistrationInfoByFromUserId(
			UserRegistrationInfo userRegistrationInfoByFromUserId) {
		this.userRegistrationInfoByFromUserId = userRegistrationInfoByFromUserId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "to_user_id")
	public UserRegistrationInfo getUserRegistrationInfoByToUserId() {
		return this.userRegistrationInfoByToUserId;
	}

	public void setUserRegistrationInfoByToUserId(
			UserRegistrationInfo userRegistrationInfoByToUserId) {
		this.userRegistrationInfoByToUserId = userRegistrationInfoByToUserId;
	}

	@Column(name = "subject", length = 250)
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Column(name = "message_type")
	public Byte getMessageType() {
		return this.messageType;
	}

	public void setMessageType(Byte messageType) {
		this.messageType = messageType;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "message_sent_date", length = 10)
	public Date getMessageSentDate() {
		return this.messageSentDate;
	}

	public void setMessageSentDate(Date messageSentDate) {
		this.messageSentDate = messageSentDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "message_read_date", length = 10)
	public Date getMessageReadDate() {
		return this.messageReadDate;
	}

	public void setMessageReadDate(Date messageReadDate) {
		this.messageReadDate = messageReadDate;
	}

	@Column(name = "is_read")
	public Boolean getIsRead() {
		return this.isRead;
	}

	public void setIsRead(Boolean isRead) {
		this.isRead = isRead;
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
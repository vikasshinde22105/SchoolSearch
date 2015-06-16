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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NotificationType generated by hbm2java
 */
@Entity
@Table(name = "notification_type", catalog = "school_db")
public class NotificationType implements java.io.Serializable {

	private Short id;
	private String name;
	private Byte status;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;
	private Set<Notification> notifications = new HashSet<Notification>(0);
	private Set<UserNotificationSettings> userNotificationSettingses = new HashSet<UserNotificationSettings>(
			0);

	public NotificationType() {
	}

	public NotificationType(String name, Byte status, Date lastUpdatedOn,
			Integer lastUpdatedBy, Set<Notification> notifications,
			Set<UserNotificationSettings> userNotificationSettingses) {
		this.name = name;
		this.status = status;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.notifications = notifications;
		this.userNotificationSettingses = userNotificationSettingses;
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

	@Column(name = "name", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "notificationType")
	public Set<Notification> getNotifications() {
		return this.notifications;
	}

	public void setNotifications(Set<Notification> notifications) {
		this.notifications = notifications;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "notificationType")
	public Set<UserNotificationSettings> getUserNotificationSettingses() {
		return this.userNotificationSettingses;
	}

	public void setUserNotificationSettingses(
			Set<UserNotificationSettings> userNotificationSettingses) {
		this.userNotificationSettingses = userNotificationSettingses;
	}

}

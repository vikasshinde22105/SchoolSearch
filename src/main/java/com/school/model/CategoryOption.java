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
 * CategoryOption generated by hbm2java
 */
@Entity
@Table(name = "category_option")
public class CategoryOption implements java.io.Serializable {

	private Integer id;
	private Category category;
	private Boolean hasOption;
	private Integer parentId;
	private String optionLabel1;
	private String optionLabel2;
	private Short sortOrder;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;
	private Set<CategoryOptionFeature> categoryOptionFeatures = new HashSet<CategoryOptionFeature>(
			0);

	public CategoryOption() {
	}

	public CategoryOption(Category category) {
		this.category = category;
	}

	public CategoryOption(Category category, Boolean hasOption,
			Integer parentId, String optionLabel1, String optionLabel2,
			Short sortOrder, Date lastUpdatedOn, Integer lastUpdatedBy,
			Set<CategoryOptionFeature> categoryOptionFeatures) {
		this.category = category;
		this.hasOption = hasOption;
		this.parentId = parentId;
		this.optionLabel1 = optionLabel1;
		this.optionLabel2 = optionLabel2;
		this.sortOrder = sortOrder;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.categoryOptionFeatures = categoryOptionFeatures;
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
	@JoinColumn(name = "category_id", nullable = false)
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Column(name = "has_option")
	public Boolean getHasOption() {
		return this.hasOption;
	}

	public void setHasOption(Boolean hasOption) {
		this.hasOption = hasOption;
	}

	@Column(name = "parent_id")
	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	@Column(name = "option_label1", length = 200)
	public String getOptionLabel1() {
		return this.optionLabel1;
	}

	public void setOptionLabel1(String optionLabel1) {
		this.optionLabel1 = optionLabel1;
	}

	@Column(name = "option_label2", length = 200)
	public String getOptionLabel2() {
		return this.optionLabel2;
	}

	public void setOptionLabel2(String optionLabel2) {
		this.optionLabel2 = optionLabel2;
	}

	@Column(name = "sort_order")
	public Short getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Short sortOrder) {
		this.sortOrder = sortOrder;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoryOption")
	public Set<CategoryOptionFeature> getCategoryOptionFeatures() {
		return this.categoryOptionFeatures;
	}

	public void setCategoryOptionFeatures(
			Set<CategoryOptionFeature> categoryOptionFeatures) {
		this.categoryOptionFeatures = categoryOptionFeatures;
	}

}

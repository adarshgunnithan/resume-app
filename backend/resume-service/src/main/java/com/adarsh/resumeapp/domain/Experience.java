package com.adarsh.resumeapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "experience")
public class Experience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private String experienceId;
	private String designation;
	private String companyName;
	private String logoUrl;
	private String companyWebSiteUrl;
	private String fromDate;
	private String toDate;
	private String descriptionText;
	private boolean isPresentCompany;
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getLogoUrl() {
		return logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	public String getCompanyWebSiteUrl() {
		return companyWebSiteUrl;
	}
	public void setCompanyWebSiteUrl(String companyWebSiteUrl) {
		this.companyWebSiteUrl = companyWebSiteUrl;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public String getDescriptionText() {
		return descriptionText;
	}
	public void setDescriptionText(String descriptionText) {
		this.descriptionText = descriptionText;
	}
	public boolean isPresentCompany() {
		return isPresentCompany;
	}
	public void setPresentCompany(boolean isPresentCompany) {
		this.isPresentCompany = isPresentCompany;
	}
	public String getExperienceId() {
		return experienceId;
	}
	public void setExperienceId(String experienceId) {
		this.experienceId = experienceId;
	}
	
	
	

}

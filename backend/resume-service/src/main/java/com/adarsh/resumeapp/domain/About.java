package com.adarsh.resumeapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 660186
 *
 */
@Entity
@Table(name = "news")
public class About {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
private Long aboutKeyID;
@Column(name="key")
private String aboutKeyName;
@Column(name="value")
private String aboutValueText;

public Long getAboutKeyID() {
	return aboutKeyID;
}
public void setAboutKeyID(Long aboutKeyID) {
	this.aboutKeyID = aboutKeyID;
}
public String getAboutKeyName() {
	return aboutKeyName;
}
public void setAboutKeyName(String aboutKeyName) {
	this.aboutKeyName = aboutKeyName;
}
public String getAboutValueText() {
	return aboutValueText;
}
public void setAboutValueText(String aboutValueText) {
	this.aboutValueText = aboutValueText;
}




}

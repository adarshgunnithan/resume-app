package com.adarsh.resumeapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @author 660186- Adarsh G Unnithan
 *Entity for skill entry
 */
@Entity
@Table(name = "skills")
public class Skill {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
private Long skillID;
private String skillIcon;
private String skillName;
private int skillGrade;

public Long getSkillID() {
	return skillID;
}
public void setSkillID(Long skillID) {
	this.skillID = skillID;
}
public String getSkillIcon() {
	return skillIcon;
}
public void setSkillIcon(String skillIcon) {
	this.skillIcon = skillIcon;
}

public String getSkillName() {
	return skillName;
}
public void setSkillName(String skillName) {
	this.skillName = skillName;
}
public int getSkillGrade() {
	return skillGrade;
}
public void setSkillGrade(int skillGrade) {
	this.skillGrade = skillGrade;
}


}

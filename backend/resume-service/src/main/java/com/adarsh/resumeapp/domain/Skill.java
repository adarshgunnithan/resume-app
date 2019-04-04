package com.adarsh.resumeapp.domain;

public class Skill {

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

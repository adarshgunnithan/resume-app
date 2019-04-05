package com.adarsh.resumeapp.service;

import java.util.List;

import com.adarsh.resumeapp.domain.About;
import com.adarsh.resumeapp.domain.Experience;
import com.adarsh.resumeapp.domain.Qualification;
import com.adarsh.resumeapp.domain.Skill;

public interface ResumeService {
	//
	public List<About> getAboutData();
	
	public List<Experience>  getExperience();
	
	public List<Qualification> getQualifications();
	
	public List<Skill> getSkills();
	
	
	public boolean saveAboutEntry(About aboutEntry);
	
	public boolean saveExperienceEntry(Experience experienceEntry);
	
	public boolean saveQualificationEntry(Qualification qualificationEntry);
	
	public boolean saveSkill(Skill skill);
}

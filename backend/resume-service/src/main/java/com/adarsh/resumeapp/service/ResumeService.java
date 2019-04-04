package com.adarsh.resumeapp.service;

import java.util.List;

import com.adarsh.resumeapp.domain.About;
import com.adarsh.resumeapp.domain.Experience;
import com.adarsh.resumeapp.domain.Qualification;
import com.adarsh.resumeapp.domain.Skill;

public interface ResumeService {
	
	public About getAboutData();
	
	public List<Experience>  getExperience();
	
	public List<Qualification> getQualifications();
	
	public List<Skill> getSkills();
}

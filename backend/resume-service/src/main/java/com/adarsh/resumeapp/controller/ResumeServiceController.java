package com.adarsh.resumeapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adarsh.resumeapp.domain.About;
import com.adarsh.resumeapp.domain.Experience;
import com.adarsh.resumeapp.domain.Qualification;
import com.adarsh.resumeapp.domain.Skill;

@RestController
@RequestMapping("api/v1/resume-service")
@CrossOrigin(origins = "http://localhost:4200")
public class ResumeServiceController {
	
	@RequestMapping("/about")
	public About getAboutPageContent(){
		return null;
		
	}
	
	@RequestMapping("/experience")
	public List<Experience>  getExperience(){
		return null;
		
	}
	
	@RequestMapping("/qualifications")
	public List<Qualification> getQualifications(){
		return null;
		
	}
	
	@RequestMapping("/skills")
	public List<Skill> getSkills(){
		return null;
		
	}
	@RequestMapping("/health-check")
	public String healthCheckService(){
		return "Welcome to Resume Service !!!";
		
	}


}

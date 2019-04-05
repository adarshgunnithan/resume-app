package com.adarsh.resumeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adarsh.resumeapp.domain.About;
import com.adarsh.resumeapp.domain.Experience;
import com.adarsh.resumeapp.domain.Qualification;
import com.adarsh.resumeapp.domain.Skill;
import com.adarsh.resumeapp.service.ResumeService;

@RestController
@RequestMapping("api/v1/resume-service")
@CrossOrigin(origins = "http://localhost:4200")
public class ResumeServiceController {
	
	@Autowired
	ResumeService resumeService;
	
	@GetMapping("/about")
	public List<About> getAboutPageContent(){
		return resumeService.getAboutData();
		
	}
	
	@GetMapping("/experience")
	public List<Experience>  getExperience(){
		return resumeService.getExperience();
		
	}
	
	@GetMapping("/qualifications")
	public List<Qualification> getQualifications(){
		return resumeService.getQualifications();
		
	}
	
	@GetMapping("/skills")
	public List<Skill> getSkills(){
		return resumeService.getSkills();
		
	}
	@GetMapping("/health-check")
	public String healthCheckService(){
		return "Welcome to Resume Service !!!";
		
	}
	
	
	//utility services
	@PostMapping("/about")
	public boolean addAboutInfo(List<About> aboutList){
		boolean isSuccess= false;
		for(About aboutEntry :aboutList){
			resumeService.saveAboutEntry(aboutEntry);
		}
		
		return isSuccess;
	}
	
	@PostMapping("/skills")
	public boolean addSkills(List<Skill> skillList){
		boolean isSuccess= false;
		for(Skill skillEntry :skillList){
			resumeService.saveSkill(skillEntry);
		}
		return isSuccess;
	}
	@PostMapping("/experience")
	public boolean addExperience(List<Experience> experienceList){
		
		for(Experience experienceEntry :experienceList){
			resumeService.saveExperienceEntry(experienceEntry);
		}
		return true;
	}

	//("/qualifications")
	@PostMapping("/qualifications")
	public boolean addQualifications(List<Qualification> qualifications){
		for(Qualification qualificationEntry :qualifications){
			resumeService.saveQualificationEntry(qualificationEntry);
		}
		return true;
	}
}

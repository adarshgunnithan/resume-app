package com.adarsh.resumeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public ResponseEntity<?> getAboutPageContent() {
		List<About> aboutList = resumeService.getAboutData();
		return  new ResponseEntity<List<About>>(aboutList, HttpStatus.OK);
	}

	@GetMapping("/experience")
	public  ResponseEntity<?> getExperience(){
		List<Experience> experienceList = resumeService.getExperience();
		return new ResponseEntity<List<Experience>>(experienceList, HttpStatus.OK);
		
	}
	
	@GetMapping("/qualifications")
	public ResponseEntity<?> getQualifications() {
		List<Qualification> qualifications = resumeService.getQualifications();
		return new ResponseEntity<List<Qualification>>(qualifications, HttpStatus.OK);

	}
	
	@GetMapping("/skills")
	public ResponseEntity<?> getSkills() {
		List<Skill> skills = resumeService.getSkills();
		return new ResponseEntity<List<Skill>>(skills, HttpStatus.OK);
	}
	
	@GetMapping("/health-check")
	public String healthCheckService(){
		return "Welcome to Resume Service !!!";
		
	}
	
	
	//utility services
	@PostMapping("/about")
	public boolean addAboutInfo(@RequestBody List<About> aboutList){
		boolean isSuccess= false;
		for(About aboutEntry :aboutList){
			resumeService.saveAboutEntry(aboutEntry);
		}
		
		return isSuccess;
	}
	
	@PostMapping("/skills")
	public boolean addSkills(@RequestBody List<Skill> skillList){
		boolean isSuccess= false;
		for(Skill skillEntry :skillList){
			resumeService.saveSkill(skillEntry);
		}
		return isSuccess;
	}
	@PostMapping("/experience")
	public boolean addExperience(@RequestBody List<Experience> experienceList){
		
		for(Experience experienceEntry :experienceList){
			resumeService.saveExperienceEntry(experienceEntry);
		}
		return true;
	}

	@PostMapping("/qualifications")
	public boolean addQualifications(@RequestBody  List<Qualification> qualifications){
		for(Qualification qualificationEntry :qualifications){
			resumeService.saveQualificationEntry(qualificationEntry);
		}
		return true;
	}
}

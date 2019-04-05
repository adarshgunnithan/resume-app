package com.adarsh.resumeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adarsh.resumeapp.domain.About;
import com.adarsh.resumeapp.domain.Experience;
import com.adarsh.resumeapp.domain.Qualification;
import com.adarsh.resumeapp.domain.Skill;
import com.adarsh.resumeapp.repo.AboutRepo;
import com.adarsh.resumeapp.repo.ExperienceRepo;
import com.adarsh.resumeapp.repo.QualificationRepo;
import com.adarsh.resumeapp.repo.SkillRepo;

@Service("resumeService")
public class ResumeServiceImpl implements ResumeService {
	@Autowired
	private AboutRepo aboutRepo;
	@Autowired
	private ExperienceRepo experienceRepo;
	@Autowired
	private QualificationRepo qualificationRepo;
	@Autowired
	private SkillRepo skillRepo;
	
	@Override
	public List<About> getAboutData() {
		return aboutRepo.findAll();
	}

	@Override
	public List<Experience> getExperience() {
		return experienceRepo.findAll();
	}

	@Override
	public List<Qualification> getQualifications() {
		return qualificationRepo.findAll();
	}

	@Override
	public List<Skill> getSkills() {
		// TODO Auto-generated method stub
		return skillRepo.findAll();
	}

	@Override
	public boolean saveAboutEntry(About aboutEntry) {
		aboutRepo.save(aboutEntry);
		return true;
	}

	@Override
	public boolean saveExperienceEntry(Experience experienceEntry) {
		experienceRepo.save(experienceEntry);
		return true;
	}

	@Override
	public boolean saveQualificationEntry(Qualification qualificationEntry) {
		qualificationRepo.save(qualificationEntry);
		return true;
	}

	@Override
	public boolean saveSkill(Skill skill) {
		skillRepo.save(skill);
		return true;
	}
	



}

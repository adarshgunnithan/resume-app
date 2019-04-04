package com.adarsh.resumeapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adarsh.resumeapp.domain.Skill;

public interface SkillRepo  extends JpaRepository<Skill, Integer>{

}

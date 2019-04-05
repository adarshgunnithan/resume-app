package com.adarsh.resumeapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adarsh.resumeapp.domain.Skill;

@Repository
public interface SkillRepo  extends JpaRepository<Skill, Integer>{

}

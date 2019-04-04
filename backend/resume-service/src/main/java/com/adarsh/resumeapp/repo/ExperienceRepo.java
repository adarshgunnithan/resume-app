package com.adarsh.resumeapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adarsh.resumeapp.domain.Experience;

public interface ExperienceRepo extends JpaRepository<Experience, Integer>{

}

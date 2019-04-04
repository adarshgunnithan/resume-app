package com.adarsh.resumeapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adarsh.resumeapp.domain.Qualification;

public interface QualificationRepo  extends JpaRepository<Qualification, Integer>{

}

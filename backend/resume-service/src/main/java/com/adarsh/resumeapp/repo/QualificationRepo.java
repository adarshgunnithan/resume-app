package com.adarsh.resumeapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adarsh.resumeapp.domain.Qualification;

@Repository
public interface QualificationRepo  extends JpaRepository<Qualification, Integer>{

}

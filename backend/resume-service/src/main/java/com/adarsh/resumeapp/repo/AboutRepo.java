package com.adarsh.resumeapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adarsh.resumeapp.domain.About;

public interface AboutRepo   extends JpaRepository<About, Integer>{

}

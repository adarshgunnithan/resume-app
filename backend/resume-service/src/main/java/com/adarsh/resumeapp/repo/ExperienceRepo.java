package com.adarsh.resumeapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;

import com.adarsh.resumeapp.domain.Experience;

/**
 * @author 660186- Adarsh G Unnithan
 *
 */
@Repository
public interface ExperienceRepo extends JpaRepository<Experience, Integer>{

}

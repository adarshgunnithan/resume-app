package com.adarsh.resumeapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adarsh.resumeapp.domain.About;

/**
 * @author 660186- Adarsh G Unnithan
 *About domain repo 
 */
@Repository
public interface AboutRepo   extends JpaRepository<About, Integer>{

}

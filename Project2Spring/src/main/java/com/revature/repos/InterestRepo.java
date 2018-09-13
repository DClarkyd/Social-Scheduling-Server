package com.revature.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Interests;

@Repository
public interface InterestRepo extends JpaRepository<Interests, Integer>{

}

package com.revature.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Event;

@Repository
public interface EventRepo extends JpaRepository<Event, Integer>{

	List<Event> findByAuthorId(int id);
	
	Event findByName(String name);

}

package com.revature.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Attendees;

@Repository
public interface AttendeesRepo extends JpaRepository<Attendees, Integer> {

	List<Attendees> findByStatusId(int statusId);

}

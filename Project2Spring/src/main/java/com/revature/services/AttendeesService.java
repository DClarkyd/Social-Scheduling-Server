package com.revature.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Attendees;
import com.revature.repos.AttendeesRepo;

@Service
public class AttendeesService {
	
	@Autowired
	private AttendeesRepo ar;
	
	public List<Attendees> findAll(){
		return ar.findAll();
	}

	public Attendees findOne(int id) {
		return ar.getOne(id);
	}

	

//	public Attendees replaceStatus(int id, Attendees newStatus) {
//		Attendees a = ar.findById(id).get();
//		a.getStatusId().add(newStatus);
//		ar.save(a);
//		return a;
//	}

}

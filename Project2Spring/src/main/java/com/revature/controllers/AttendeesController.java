package com.revature.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Attendees;
import com.revature.services.AttendeesService;

@RestController
@CrossOrigin
@RequestMapping("attendees")
public class AttendeesController {
	
	@Autowired
	private AttendeesService as;
	
	//Find All Users
	@GetMapping
	public List<Attendees> findAll(){
		System.out.println("Finding all Invitations");
		List<Attendees> attendees = new ArrayList<>();
		return as.findAll();
	}
	
	@CrossOrigin
	@GetMapping("{id}")
	public Attendees findById(@PathVariable int id) {
		Attendees attendees = as.findOne(id);
		return attendees;
	}
	
	@GetMapping("acceptedDenied/{id}")
	public List<Attendees> findAttendees(@PathVariable int id){
		Attendees attendees = as.findOne(id);
		return attendees.getAttendees();
	}
	
	
//	//Update Invitation Status
//	@PutMapping("/status/{id}")
//	Attendees replaceStatus( @PathVariable int id, @RequestBody Attendees newStatus) {
//		Attendees attendees = as.replaceStatus(id, newStatus);
//		return attendees;
//	}

}

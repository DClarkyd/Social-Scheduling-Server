package com.revature.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Invitations;
import com.revature.services.InvitationsService;

@RestController
@CrossOrigin
@RequestMapping("invitations")
public class InvitationsController {

	@Autowired
	private InvitationsService is;

	// Find All Users
	@GetMapping
	public List<Invitations> findAll() {
		System.out.println("Finding all Invitations");
		List<Invitations> invitations = new ArrayList<>();
		return is.findAll();
	}

	@CrossOrigin
	@GetMapping("{id}")
	public Invitations findById(@PathVariable int id) {
		Invitations invitations = is.findOne(id);
		return invitations;
	}

	@GetMapping("event/{id}")
	public List<Invitations> findEventInvitations(@PathVariable int id) {
		List<Invitations> invitations = is.findByEventId(id);
//		return invitations.getInvitations();
		return invitations;
	}
	
	//displays all of a user's event invitations
	@GetMapping("user/{id}")
	public List<Invitations> findUserInvitations(@PathVariable int id) {
		List<Invitations> invitations = is.findByUserId(id);
		return invitations;
	}

	@GetMapping("event/{eventId}/status/{statusId}")
	public List<Invitations> findAttendees(@PathVariable int eventId, @PathVariable int statusId) {
		List<Invitations> invitations = is.findByEventAndStatusId(eventId, statusId);
		return invitations;
	}

	//Update Invitation Status
	@Transactional
	@CrossOrigin
	@PutMapping("editStatus/{id}")
	public Invitations updateStatus(@PathVariable int id, @RequestBody Invitations invitations) {
		Invitations status = is.updateStatus(id, invitations);
		return status;
	}

}

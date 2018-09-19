package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Invitations;
import com.revature.repos.InvitationsRepo;

@Service
public class InvitationsService {
	
	@Autowired
	private InvitationsRepo ir;
	
	public List<Invitations> findAll(){
		return ir.findAll();
	}

	public Invitations findOne(int id) {
		return ir.getOne(id);
	}

	public List<Invitations> findByEventId(int id) {
		return ir.findByeventId(id);
	}

	public List<Invitations> findByEventAndStatusId(int eventId, int statusId) {
		return ir.findByeventIdAndStatusId(eventId, statusId);
	}

	

//	public Attendees replaceStatus(int id, Attendees newStatus) {
//		Attendees a = ar.findById(id).get();
//		a.getStatusId().add(newStatus);
//		ar.save(a);
//		return a;
//	}

}

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
		return ir.findByEventId(id);
	}
	
	public List<Invitations> findByUserId(int id) {
		return ir.findByUserId(id);
	}

	public List<Invitations> findByEventAndStatusId(int eventId, int statusId) {
		return ir.findByEventIdAndStatusId(eventId, statusId);
	}

	public Invitations updateStatus(int id, Invitations invitations) {
		Invitations i = ir.findById(id).get();
		i.setStatusId(invitations.getStatusId());
		ir.save(i);
		return i;
	}

	public Invitations findByUserIdAndEventId(int eventId, int userId) {
		return ir.findByEventIdAndUserId(eventId, userId);
	}
	
}

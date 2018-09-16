package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.AppUser;
import com.revature.model.Event;
import com.revature.repos.EventRepo;

@Service
public class EventServices {

	@Autowired
	private EventRepo er;

	public Event save(Event e) {
		return er.saveAndFlush(e);
	}

	public Event inviteUser(int id, AppUser friends) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

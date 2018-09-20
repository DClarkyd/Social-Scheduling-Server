package com.revature.services;

import java.util.List;

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

	public Event inviteUser(Event e) {
		return er.saveAndFlush(e);
	}

	public List<Event> findAll() {
		return er.findAll();
	}

	public Event findOne(int id) {
		return er.getOne(id);
	}

	public List<Event> findByAuthorId(int id) {
		return er.findByAuthorId(id);
	}
	
}

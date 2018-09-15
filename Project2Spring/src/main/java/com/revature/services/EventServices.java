package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Event;
import com.revature.repos.EventRepo;

@Service
public class EventServices {

	@Autowired
	private EventRepo eventRepo;

	public Event save(Event e) {
		return eventRepo.saveAndFlush(e);
	}
	
}

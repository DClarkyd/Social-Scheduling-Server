package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Event;
import com.revature.model.Interests;
import com.revature.services.EventServices;

@RestController
@CrossOrigin
@RequestMapping("events")
public class EventController {

	@Autowired
	private EventServices es;
	
	@CrossOrigin
	@PostMapping("create")
	public Event create(@RequestBody Event e) {
	return es.save(e);
	}
	
	@PostMapping
	public ResponseEntity<Interests> save(@RequestBody Interests i) {

		ResponseEntity<Interests> RE = new ResponseEntity<Interests>(i, HttpStatus.CREATED);

		return RE;
	}
}

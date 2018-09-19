package com.revature.controllers;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	// create an event
	@CrossOrigin
	@PostMapping("create")
	public Event create(@RequestBody Event e) {
		return es.save(e);
	}

	// find event by id
	@CrossOrigin
	@GetMapping("{id}")
	public Event findById(@PathVariable int id) {
		Event event = es.findOne(id);
		return event;
	}
<<<<<<< HEAD
		
=======

<<<<<<< HEAD
	
=======
	//find all events
		@GetMapping
		public List<Event> findAll() {
			System.out.println("finding all events");
			List<Event> events = new ArrayList<>();
			return es.findAll();
		}
>>>>>>> 8358c4fe9aa6337eb58b37a7f407bc7ff9e6fcf0
	
>>>>>>> 16ce44025a1b552fb02192bf902115e090fc61c1
	//Find Event by Author ID
	@GetMapping("author/{id}")
	public List<Event> eventAuthor(@PathVariable int id){
		List<Event> event = es.findByAuthorId(id);
		return event;
<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
>>>>>>> 8358c4fe9aa6337eb58b37a7f407bc7ff9e6fcf0
>>>>>>> 16ce44025a1b552fb02192bf902115e090fc61c1
	}

	@PostMapping
	public ResponseEntity<Interests> save(@RequestBody Interests i) {

		ResponseEntity<Interests> RE = new ResponseEntity<Interests>(i, HttpStatus.CREATED);

		return RE;
	}
}

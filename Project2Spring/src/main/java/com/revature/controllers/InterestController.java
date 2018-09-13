package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Interests;
import com.revature.services.InterestServices;

@RestController
@RequestMapping("interests")
public class InterestController {

	@Autowired
	private InterestServices is;
	

	@CrossOrigin
	@PostMapping("create")
	public Interests create(@RequestBody Interests i) {
	return is.save(i);
	}
	
	@PostMapping
	public ResponseEntity<Interests> save(@RequestBody Interests i) {

		ResponseEntity<Interests> RE = new ResponseEntity<Interests>(i, HttpStatus.CREATED);

		return RE;
	}
}

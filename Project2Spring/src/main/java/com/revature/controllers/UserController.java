package com.revature.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.AppUser;
import com.revature.model.Event;
import com.revature.model.Interests;
import com.revature.services.UserServices;

@RestController
@CrossOrigin
@RequestMapping("users")
public class UserController {

	@Autowired
	private UserServices us;
	
	//find all users
	@GetMapping
	public List<AppUser> findAll() {
		System.out.println("finding all users");
		List<AppUser> users = new ArrayList<>();
		return us.findAll();
	}

	//find user by id
	@CrossOrigin
	@GetMapping("{id}")
	public AppUser findById(@PathVariable int id) {
		AppUser user = us.findOne(id);
		return user;
	}
	

	//lets you add an interest
	@Transactional
	@CrossOrigin
	@PostMapping("{id}/addInterest")
	public AppUser addInterest(@PathVariable int id, @RequestBody Interests interest) {
		AppUser user = us.addInterest(id, interest);
		return user;
	}

	// invite a user to an event
	@Transactional
	@CrossOrigin
	@PostMapping("{id}/addInvitation")
	public AppUser createInvitation(@PathVariable int id, @RequestBody Event event) {
		AppUser user = us.addInvitation(id, event);
		return user;
	}

	// removes interest id2 from the user id
	@Transactional
	@CrossOrigin
	@DeleteMapping("{id}/removeInterest")
	public AppUser removeInterest(@PathVariable int id, @RequestBody Interests interest) {
		AppUser user = us.removeUsersInterest(id, interest);
//		AppUser user = us.findOne(id);
//		us.findByInterestIdAndUserId();
		return user;
	}

	// changes interest id2 at the user id
	@Transactional
	@CrossOrigin
	@PatchMapping("{id}/change-interest")
	public void updateInterest(@PathVariable int id, @RequestBody Interests interest) {
//			AppUser user = us.removeInterestById(id, interest);
//			AppUser user = us.findOne(id);
//			us.findByInterestIdAndUserId();
	}

	//lets you add a friend
	@Transactional
	@CrossOrigin
	@PostMapping("{id}/addFriend")
	public AppUser addUser(@PathVariable int id, @RequestBody AppUser friends) {
		AppUser user = us.addFriend(id, friends);
		return user;
	}

	//lets you login
	@CrossOrigin
	@PostMapping("login")
	public AppUser login(@RequestBody AppUser u) {
		return us.login(u.getUsername(), u.getPassword());
	}

	//creates the user
	@CrossOrigin
	@PostMapping("register")
	public AppUser register(@RequestBody AppUser u) {
		return us.save(u);
	}

	// this finds who has a common interest
	@CrossOrigin
	@GetMapping("interests/{id}")
	public List<AppUser> interestWithId(@PathVariable int id) {
		return us.findByInterestsId(id);
	}

	//finds the friends
	@GetMapping("{id}/friends")
	public List<AppUser> findFriends(@PathVariable int id) {
		AppUser user = us.findOne(id);
		return user.getFriends();
	}

	
	//displays the interest of the user with userid id
	@GetMapping("{id}/interests")
	public List<Interests> findInterests(@PathVariable int id) {
		AppUser user = us.findOne(id);
		return user.getInterests();
	}

	@PostMapping
	public ResponseEntity<AppUser> save(@RequestBody AppUser u) {
		ResponseEntity<AppUser> RE = new ResponseEntity<AppUser>(u, HttpStatus.CREATED);
		return RE;
	}
}

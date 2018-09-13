//package com.revature.controllers;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.revature.model.AppUser;
//import com.revature.services.EventServices;
//import com.revature.services.UserServices;
//
//@RestController
//@RequestMapping("users/interests")
//public class EventController {
//
//	@Autowired
//	private EventServices es;
//
//	@GetMapping
//	public List<AppUser> findAll() {
//		System.out.println("finding all interests");
//		List<AppUser> events = new ArrayList<>();
//		return es.findAll();
//	}
//
//	@CrossOrigin
//	@PostMapping("register")
//	public AppUser register(@RequestBody AppUser u) {
//		return es.save(u);
//	}
//}

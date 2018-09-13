package com.revature.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.UserHasInterests;
import com.revature.services.UserHasInterestsServices;
import com.revature.services.UserServices;



@RestController
@RequestMapping("UserInterests")
public class UserHasInterestsController{
	
	@Autowired
	private UserHasInterestsServices uhis;
	
	@Autowired
	private UserServices us;
	
	@GetMapping
	public List<UserHasInterests> findAll(){
		System.out.println("finding all interests");
		List<UserHasInterests> userHasInterests = new ArrayList<>();
		return uhis.findAll();
	}
	
	@CrossOrigin
	@PostMapping("create")
	public UserHasInterests create(@RequestBody UserHasInterests uhi) {
		return uhis.save(uhi);
	}
}
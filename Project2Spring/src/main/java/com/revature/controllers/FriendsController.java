
	package com.revature.controllers;
	import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.AppUser;
import com.revature.model.Friends;
import com.revature.services.FriendServices;
import com.revature.services.UserServices;

	@RestController
	@RequestMapping("friends")
	public class FriendsController {
	    
	    @Autowired
	    private FriendServices fr;
	    
	    @Autowired
	    private UserServices ur;
	    
	    @GetMapping
	    public List<Friends> findAll(){
	        System.out.println("Finding All Friends");
	        List<Friends> friends = new ArrayList<>();
	        return fr.findAll();
	    }
	    
//	    @GetMapping("{id}")
//	    public Friends findById(@PathVariable int id) {
//	        Friends userFriend = ur.findOne(id);
//	        return userFriend; 
//	    }
	    
	    @CrossOrigin
	    @PostMapping("create")
	    public Friends create(@RequestBody Friends f) {
	        return fr.save(f);
	    }
	    
	    @CrossOrigin
	    @DeleteMapping("/delete")
	    public void deleteFriend(@PathVariable int id) {
	    	fr.deleteById(id);
	    }
	}


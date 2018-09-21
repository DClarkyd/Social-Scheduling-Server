package com.revature.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.FriendRequests;
import com.revature.model.Invitations;
import com.revature.services.FriendRequestServices;

@RestController
@CrossOrigin
@RequestMapping("requests")
public class FriendRequestController {

	@Autowired
	private FriendRequestServices frs;

	// Find All friend requests
	@GetMapping
	public List<FriendRequests> findAll() {
		System.out.println("Finding all Friend Requests");
		List<FriendRequests> requests = new ArrayList<>();
		return frs.findAll();
	}

	@CrossOrigin
	@GetMapping("{id}")
	public FriendRequests findById(@PathVariable int id) {
		FriendRequests requests = frs.findOne(id);
		return requests;
	}

	@GetMapping("user/{id}")
	public List<FriendRequests> findAllFriendRequests(@PathVariable int id) {
		List<FriendRequests> requests = frs.findByRequestId(id);
		return requests;
	}

	@GetMapping("friend/{friendId}/status/{statusId}")
	public List<FriendRequests> findRequestees(@PathVariable int friendId, @PathVariable int statusId) {
		List<FriendRequests> requests = frs.findByFriendAndStatusId(friendId, statusId);
		return requests;
	}

	// Update friend request Status
	@Transactional
	@CrossOrigin
	@PutMapping("editStatus/{id}")
	public FriendRequests updateStatus(@PathVariable int id, @RequestBody FriendRequests requests) {
		FriendRequests status = frs.updateStatus(id, requests);
		return status;
	}

	@CrossOrigin
	@GetMapping("friend/{friendId}/fr/{userId}")
	public List<FriendRequests> findByFriendAndUserId(@PathVariable int friendId,  @PathVariable int userId) {
		List<FriendRequests> requests = frs.findByFriendIdAndUserId(friendId, userId);
		return requests;
	}
}

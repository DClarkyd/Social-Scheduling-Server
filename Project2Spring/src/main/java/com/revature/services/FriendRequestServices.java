package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.FriendRequests;
import com.revature.model.Invitations;
import com.revature.repos.FriendRequestRepo;

@Service
public class FriendRequestServices {

	@Autowired
	private FriendRequestRepo frr;

	public List<FriendRequests> findAll() {
		return frr.findAll();
	}

	public FriendRequests findOne(int id) {
		return frr.getOne(id);
	}

	public List<FriendRequests> findByFriendAndStatusId(int friendId, int statusId) {
		return frr.findByfriendIdAndStatusId(friendId, statusId);
	}

	public FriendRequests updateStatus(int id, FriendRequests requests) {
		FriendRequests i = frr.findById(id).get();
		i.setStatusId(requests.getStatusId());
		frr.save(i);
		return i;
	}

	public List<FriendRequests> findByRequestId(int id) {
		return frr.findByfriendId(id);
	}

}

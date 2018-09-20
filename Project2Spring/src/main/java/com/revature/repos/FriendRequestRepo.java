package com.revature.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.FriendRequests;

@Repository
public interface FriendRequestRepo extends JpaRepository<FriendRequests, Integer> {
	
	List<FriendRequests> findByfriendIdAndStatusId(int friendId, int statudId);

	List<FriendRequests> findByfriendId(int id);

	

}

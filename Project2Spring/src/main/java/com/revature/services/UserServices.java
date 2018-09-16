package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.AppUser;
import com.revature.model.Event;
import com.revature.model.Interests;
import com.revature.repos.UserRepo;

@Service
public class UserServices {
	
	@Autowired
	private UserRepo ur;	
	
	public List<AppUser> findAll() {
		return ur.findAll();
	}
	
	public AppUser addFriend(int id, AppUser friends) {
		AppUser u = ur.findById(id).get();
		u.getFriends().add(friends);
		ur.save(u);
		return u;
	}
	
	public AppUser login(String username, String password) {
		return ur.findByUsernameAndPassword(username, password);
	}

	public AppUser save(AppUser u) {
		return ur.saveAndFlush(u);
	}

	public List<AppUser> findByInterestsId(int id) {
		return ur.findByInterestsId(id);
	}

	public AppUser findOne(int id) {
		return ur.getOne(id);
	}
	
//	give someone an invitation
	public AppUser addInvitation(int id, Event event) {
		AppUser u = ur.findById(id).get();
		u.getInvitations().add(event);
		ur.saveAndFlush(u);
		return u;
	}

	//give someone an interest
	public AppUser addInterest(int id, Interests interest) {
		AppUser u = ur.findById(id).get();
		u.getInterests().add(interest);
		ur.save(u);
		return u;
	}

	//removes interest
	public void removeInterestById(int id, Interests interest) {
		AppUser u = ur.findById(id).get();
		u.getInterests().remove(interest);
		ur.save(u);
	}
}

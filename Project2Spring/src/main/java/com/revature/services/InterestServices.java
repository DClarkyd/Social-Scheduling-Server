package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Interests;
import com.revature.repos.InterestRepo;

@Service
public class InterestServices {

	@Autowired
	private InterestRepo interestRepo;

	public Interests save(Interests i) {
		return interestRepo.saveAndFlush(i);
	}

}

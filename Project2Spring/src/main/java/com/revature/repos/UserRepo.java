package com.revature.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.AppUser;

@Repository
public interface UserRepo extends JpaRepository<AppUser, Integer>{

	AppUser findByUsernameAndPassword(String username, String password);

	List<AppUser> findByInterestsId(int id);
}

package com.revature.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.AppUser;

@Repository
public interface UserRepo extends JpaRepository<AppUser, Integer>{

	AppUser findByUsernameAndPassword(String username, String password);

	List<AppUser> findByInterestsId(int id);

	AppUser findByInterestsAndUsername(int id, String username);
//	Optional<AppUser> findByFriend(int id);

<<<<<<< HEAD
	AppUser findByUsername(String username);
=======
>>>>>>> b2667921144acc1fc3ad62115548d4a474824e30
}

package com.revature.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Friends;

@Repository
public interface FriendsRepo extends JpaRepository<Friends, Integer>{

}

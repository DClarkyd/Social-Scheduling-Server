package com.revature.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Invitations;

@Repository
public interface InvitationsRepo extends JpaRepository<Invitations, Integer> {

	List<Invitations> findByEventId(int id);
	
	List<Invitations> findByEventIdAndStatusId(int eventId, int statudId);
	
	List<Invitations> findByUserId(int id);

	Invitations findByEventIdAndUserId(int eventId, int userId);

}

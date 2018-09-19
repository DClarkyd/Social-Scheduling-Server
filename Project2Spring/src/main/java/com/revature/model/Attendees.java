package com.revature.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Entity
@Table(name = "user_has_invitations")
public class Attendees {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "invitation_id")
	private int invitationId;
	
	@Column(name = "event_id")
	private int eventId;
	
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "status_id")
	private int statusId;
	
	@ManyToMany
    @JoinTable(name = "user_has_invitations", joinColumns = @JoinColumn(name = "event_id"), inverseJoinColumns = @JoinColumn(name = "invitation_id"))
    @JsonIgnore
	private List<Attendees> invitations;
	
	@ManyToMany
    @JoinTable(name = "user_has_invitations", joinColumns = @JoinColumn(name = "status_id"), inverseJoinColumns = @JoinColumn(name = "invitation_id"))
    @JsonIgnore
	private List<Attendees> attendees;

	public Attendees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Attendees(int invitationId, int eventId, int userId, int statusId, List<Attendees> invitations,
			List<Attendees> attendees) {
		super();
		this.invitationId = invitationId;
		this.eventId = eventId;
		this.userId = userId;
		this.statusId = statusId;
		this.invitations = invitations;
		this.attendees = attendees;
	}

	public int getInvitationId() {
		return invitationId;
	}

	public void setInvitationId(int invitationId) {
		this.invitationId = invitationId;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public List<Attendees> getInvitations() {
		return invitations;
	}

	public void setInvitations(List<Attendees> invitations) {
		this.invitations = invitations;
	}

	public List<Attendees> getAttendees() {
		return attendees;
	}

	public void setAttendees(List<Attendees> attendees) {
		this.attendees = attendees;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attendees == null) ? 0 : attendees.hashCode());
		result = prime * result + eventId;
		result = prime * result + invitationId;
		result = prime * result + ((invitations == null) ? 0 : invitations.hashCode());
		result = prime * result + statusId;
		result = prime * result + userId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Attendees other = (Attendees) obj;
		if (attendees == null) {
			if (other.attendees != null)
				return false;
		} else if (!attendees.equals(other.attendees))
			return false;
		if (eventId != other.eventId)
			return false;
		if (invitationId != other.invitationId)
			return false;
		if (invitations == null) {
			if (other.invitations != null)
				return false;
		} else if (!invitations.equals(other.invitations))
			return false;
		if (statusId != other.statusId)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Attendees [invitationId=" + invitationId + ", eventId=" + eventId + ", userId=" + userId + ", statusId="
				+ statusId + ", invitations=" + invitations + ", attendees=" + attendees + "]";
	}
	
	
	
}

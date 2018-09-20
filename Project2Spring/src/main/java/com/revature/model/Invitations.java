package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Entity
@Table(name = "user_has_invitations")
public class Invitations {

	@Id
	@Column(name = "invitation_id")
	private int invitationId;

	@Column(name = "event_id")
	private int eventId;

	@Column(name = "user_id")
	private int userId;

	@Column(name = "status_id")
	private int statusId;

	public Invitations() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Invitations(int invitationId, int eventId, int userId, int statusId) {
		super();
		this.invitationId = invitationId;
		this.eventId = eventId;
		this.userId = userId;
		this.statusId = statusId;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eventId;
		result = prime * result + invitationId;
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
		Invitations other = (Invitations) obj;
		if (eventId != other.eventId)
			return false;
		if (invitationId != other.invitationId)
			return false;
		if (statusId != other.statusId)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Invitations [invitationId=" + invitationId + ", eventId=" + eventId + ", userId=" + userId
				+ ", statusId=" + statusId + "]";
	}

}

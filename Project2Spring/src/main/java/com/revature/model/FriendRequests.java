package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Entity
@Table(name = "user_has_friend_requests")
public class FriendRequests {

	@Id
	@Column(name = "request_id")
	private int requestId;

	@Column(name = "friend_id")
	private int friendId;

	@Column(name = "user_id")
	private int userId;

	@Column(name = "status_id")
	private int statusId;

	public FriendRequests() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FriendRequests(int requestId, int friendId, int userId, int statusId) {
		super();
		this.requestId = requestId;
		this.friendId = friendId;
		this.userId = userId;
		this.statusId = statusId;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public int getFriendId() {
		return friendId;
	}

	public void setFriendId(int friendId) {
		this.friendId = friendId;
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
		result = prime * result + friendId;
		result = prime * result + requestId;
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
		FriendRequests other = (FriendRequests) obj;
		if (friendId != other.friendId)
			return false;
		if (requestId != other.requestId)
			return false;
		if (statusId != other.statusId)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FriendRequests [requestId=" + requestId + ", friendId=" + friendId + ", userId=" + userId
				+ ", statusId=" + statusId + "]";
	}
}
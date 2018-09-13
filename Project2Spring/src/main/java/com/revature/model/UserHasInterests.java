package com.revature.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "user_has_interest")
public class UserHasInterests implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8474343581023031893L;

//	@Id
	@Column(name = "user_id")
	private int userId;
	
	@Id
	@Column(name = "interest_id")
	private int interestId;

	public UserHasInterests() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserHasInterests(int userId, int interestId) {
		super();
		this.userId = userId;
		this.interestId = interestId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getInterestId() {
		return interestId;
	}

	public void setInterestId(int interestId) {
		this.interestId = interestId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + interestId;
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
		UserHasInterests other = (UserHasInterests) obj;
		if (interestId != other.interestId)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserHasInterests [userId=" + userId + ", interestId=" + interestId + "]";
	}

}

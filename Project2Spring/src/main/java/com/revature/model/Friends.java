package com.revature.model;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Entity
@Table(name = "user_has_friends")
public class Friends implements Serializable {
    
/**
     * 
     */
    private static final long serialVersionUID = -3779131646759562248L;
    
//  @Id
    @Column(name = "user_id")
    private int userId;
    
    @Id
    @Column(name = "friend_id")
    private int friendId;
    
    public Friends() {
        super();
        // TODO Auto-generated constructor stub
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getFriendId() {
        return friendId;
    }
    public void setFriendId(int friendId) {
        this.friendId = friendId;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + friendId;
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
        Friends other = (Friends) obj;
        if (friendId != other.friendId)
            return false;
        if (userId != other.userId)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Friends [userId=" + userId + ", friendId=" + friendId + "]";
    }
    
    
    
}

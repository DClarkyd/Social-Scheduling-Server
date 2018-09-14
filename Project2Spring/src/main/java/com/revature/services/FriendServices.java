package com.revature.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Friends;
import com.revature.repos.FriendsRepo;
@Service
public class FriendServices {
    
    @Autowired
    private FriendsRepo fr;
    
    public List<Friends> findAll(){
        return fr.findAll();
    }
    
    public Friends findOne(int id) {
        return fr.findById(id).get();
    }
    
    public Friends save(Friends f) {
        return fr.saveAndFlush(f);
    }
    
}
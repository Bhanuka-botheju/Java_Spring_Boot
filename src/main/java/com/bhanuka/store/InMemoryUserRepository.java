package com.bhanuka.store;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class InMemoryUserRepository implements UserRepository {
    @Override
    public void save(User user){
        HashMap<String , User> user_details = new HashMap<>();
        System.out.println("Registration Successful");
        user_details.put(user.email , user);
        System.out.println("User Details Save in DataBse");
    }
}

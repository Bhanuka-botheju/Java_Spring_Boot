package com.bhanuka.store;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class UserService {
    public int userID = 1;
    public NotificationService notificationService;
    public UserRepository userRepository;

    public UserService(NotificationService notificationService,UserRepository userRepository){
        this.notificationService = notificationService;
        this.userRepository = userRepository;
    }

    public void signin(){
       }

    public int generateID(){
        return userID++;

    }

}

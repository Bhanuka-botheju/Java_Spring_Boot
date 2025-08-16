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
        Scanner scanner = new Scanner(System.in);
        System.out.println("get User Name");
        String userName = scanner.nextLine();
        System.out.println("get Password");
        String password = scanner.nextLine();
        System.out.println("get Email");
        String email = scanner.nextLine();

        User user = new User(generateID(),email,password,userName);

        userRepository.save(user);

        notificationService.sendNotification("Successfluy",email);
    }

    public int generateID(){
        return userID++;

    }

}

package com.bhanuka.store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationManager {
    public final NotificationService notificationService;

    @Autowired
    public NotificationManager(@Qualifier("email") NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public void sendNotification(String message) {
        notificationService.sendNotification(message);
    }
}

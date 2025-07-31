package com.bhanuka.store;
import org.springframework.stereotype.Service;

@Service("sms")
public class SMSNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("This is a SMS Notification Service" + message);
    }
}

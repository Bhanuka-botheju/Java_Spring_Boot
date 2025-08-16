package com.bhanuka.store;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements NotificationService {
    @Value("${email.Host}")
    public String HostName;

    @Value("${email.port}")
    public int PortName;

    @Override
    public void sendNotification(String message , String recipientEmail) {
        System.out.println("initializing...");
        System.out.println("PortName configering... Done");
        System.out.println("HostName configering... Done");
        System.out.println("Sending email to " + recipientEmail);
    }
}

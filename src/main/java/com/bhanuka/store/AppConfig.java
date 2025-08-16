package com.bhanuka.store;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Value("${payment}")
    private String paymentmethod;

    @Bean
    public PaymentService stripe(){
        return new StripePaymentService();
    }
    @Bean
    public PaymentService paypal(){
        return new PayPalPaymentService();
    }
    @Bean
    public OrderService orderService(){
        if(paymentmethod.equals("paypal")){
            return new OrderService(paypal());
        }
        return new OrderService(stripe());
    }

    @Bean
    public NotificationService email(){
        return new EmailNotificationService();
    }

    @Bean
    public UserRepository save(){
        return new InMemoryUserRepository();
    }

    @Bean
    public UserService userService(){
        return new UserService(email(),save());
    }
}

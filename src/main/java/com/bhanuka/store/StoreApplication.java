package com.bhanuka.store;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {
 
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
//		var orderService = context.getBean(OrderService.class);


		// var userService = context.getBean(UserService.class);
		// userService.signin();

//		var orderService2 = context.getBean(OrderService.class);
//		var notificationManager =  context.getBean(NotificationManager.class);

 
//		var orderService = new OrderService();
//		orderService.setPaymentService(new PayPalPaymentService());

//		orderService.placeOrder();
//		notificationManager.sendNotification(" Hii Bhanuka");

	}

}


package com.bhanuka.store;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("Order Service Created");
    }

    @PostConstruct
    public void init(){
        System.out.println("OrderService postConstructor");
    }

    @PreDestroy
    public void cleanup(){
        System.out.println("OrderService cleanup");
    }

    public void placeOrder(){
        paymentService.processOrder(10);
    }


}

package com.bhanuka.store;
import org.springframework.stereotype.Service;

//@Service("paypal")
public class PayPalPaymentService implements PaymentService{

    @Override
    public void processOrder(double amount) {
        System.out.println("PAYPAL");
        System.out.println("Amount : "+amount);
    }
}

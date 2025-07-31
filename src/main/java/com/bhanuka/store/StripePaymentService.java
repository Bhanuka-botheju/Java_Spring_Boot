package com.bhanuka.store;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("stripe")
//@Primary
public class StripePaymentService implements PaymentService {

//    @Value("${strip.apiURL}")
//    private String apiURL;
//
//    @Value("${strip.enabled}")
//    private Boolean enabled;
//
//    @Value("${strip.timeout:3000}")
//    private int timeout;
//
//    @Value("${strip.supported-currencies}")
//    private List<String> currency;

    @Override
    public void processOrder(double amount){

//        System.out.println(this.apiURL);
//        System.out.println(enabled);
//        System.out.println(timeout);
//        System.out.println(currency);

        System.out.println("STRIPE");
        System.out.println("Amount" + amount);
    }
}

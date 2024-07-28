package com.mg.js_payment_service.payment.impl;

import com.mg.js_payment_service.payment.PaymentProcessor;
import org.springframework.stereotype.Component;

@Component
public class CreditCardPayment implements PaymentProcessor {
    @Override
    public boolean pay(String details) {
        System.out.println("CreditCard payment for " + details);
        return true;
    }
}

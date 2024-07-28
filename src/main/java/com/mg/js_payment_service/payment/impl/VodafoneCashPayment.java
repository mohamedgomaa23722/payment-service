package com.mg.js_payment_service.payment.impl;

import com.mg.js_payment_service.payment.PaymentProcessor;
import org.springframework.stereotype.Component;

@Component
public class VodafoneCashPayment implements PaymentProcessor {
    @Override
    public boolean pay(String details) {
        System.out.println("VodafoneCash payment for " + details);
        return true;
    }
}

package com.mg.js_payment_service.payment;

public class PaymentManager {

    private final PaymentProcessor paymentProcessor;

    public PaymentManager(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public boolean pay(String details) {
       return paymentProcessor.pay(details);
    }
}

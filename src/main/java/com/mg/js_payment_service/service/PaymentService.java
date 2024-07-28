package com.mg.js_payment_service.service;

import com.mg.js_payment_service.payment.PaymentManager;
import com.mg.js_user_service.model.PaymentMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    ApplicationContext context;

    public boolean pay(PaymentMethod paymentMethod, String cardDetails) {
        PaymentManager paymentManager = (PaymentManager) context.getBean(paymentMethod.getValue());
        return paymentManager.pay(cardDetails);
    }
}

package com.mg.js_payment_service.controller;

import com.mg.js_payment_service.service.PaymentService;
import com.mg.js_user_service.api.PaymentApi;
import com.mg.js_user_service.model.PaymentMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController implements PaymentApi {

    @Autowired
    PaymentService paymentService;

    @Override
    public ResponseEntity<Void> pay(PaymentMethod paymentMethod, String cardDetails) {
        paymentService.pay(paymentMethod, cardDetails);
        return ResponseEntity.noContent().build();
    }
}

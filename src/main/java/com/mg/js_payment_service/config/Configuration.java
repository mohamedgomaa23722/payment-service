package com.mg.js_payment_service.config;

import com.mg.js_payment_service.payment.PaymentManager;
import com.mg.js_payment_service.payment.impl.CreditCardPayment;
import com.mg.js_payment_service.payment.impl.FawryPayment;
import com.mg.js_payment_service.payment.impl.MasterCardPayment;
import com.mg.js_payment_service.payment.impl.VodafoneCashPayment;
import com.mg.js_user_service.model.PaymentMethod;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {


    @Bean("CreditCard")
    public PaymentManager creditCardPaymentManager(CreditCardPayment creditCardPayment) {
        return new PaymentManager(creditCardPayment);
    }

    @Bean("MasterCard")
    public PaymentManager masterCardPaymentManager(MasterCardPayment masterCardPayment) {
        return new PaymentManager(masterCardPayment);
    }

    @Bean("Fawry")
    public PaymentManager fawryPaymentManager(FawryPayment fawryPayment) {
        return new PaymentManager(fawryPayment);
    }

    @Bean("VodafoneCash")
    public PaymentManager vodafoneCashPaymentManager(VodafoneCashPayment vodafoneCashPayment) {
        return new PaymentManager(vodafoneCashPayment);
    }

}

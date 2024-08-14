package com.mg.js_payment_service.generator.impl;

import com.mg.js_payment_service.generator.TemplateGenerator;

public interface UserGenerator extends TemplateGenerator {

    default String generate(String obj) {
        System.out.println(generateAtt(obj));
        return "test";
    }

    String generateAtt(String obj);
}

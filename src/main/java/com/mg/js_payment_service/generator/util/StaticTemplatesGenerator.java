package com.mg.js_payment_service.generator;

import com.mg.js_payment_service.generator.impl.ProductGenerator;

import static com.mg.js_payment_service.generator.StaticProductGenerators.vfGenerator;
import static com.mg.js_payment_service.generator.StaticUserGenerators.vfUser;

public class StaticTemplatesGenerator {

    public static TemplateGenerator vfTmp = (input) -> {
        vfUser.generate(input);
        vfGenerator.generate(input);
        return "Done";
    };
}

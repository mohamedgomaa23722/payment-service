package com.mg.js_payment_service.generator.util;

import com.mg.js_payment_service.generator.TemplateGenerator;

import static com.mg.js_payment_service.generator.util.StaticProductGenerators.vfGenerator;
import static com.mg.js_payment_service.generator.util.StaticUserGenerators.vfUser;

public class StaticTemplatesGenerator {

    public static TemplateGenerator vfTmp = (input) -> {
        vfUser.generate(input);
        vfGenerator.generate(input);
        return "Done";
    };
}

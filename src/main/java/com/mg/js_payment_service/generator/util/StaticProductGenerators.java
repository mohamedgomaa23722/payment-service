package com.mg.js_payment_service.generator;

import com.mg.js_payment_service.generator.impl.ProductGenerator;

public class StaticProductGenerators {

    public static ProductGenerator vfGenerator = (input) -> input + "vfProduct";
    public static ProductGenerator dslGenerator = (input) -> input + "DslProduct";
}

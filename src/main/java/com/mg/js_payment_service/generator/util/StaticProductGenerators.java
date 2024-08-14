package com.mg.js_payment_service.generator.util;

import com.mg.js_payment_service.generator.mint.product.ProductGenerator;

public class StaticProductGenerators {

    public static ProductGenerator vfGenerator = (input) -> input + "vfProduct";
    public static ProductGenerator dslGenerator = (input) -> input + "DslProduct";
}

package com.mg.js_payment_service.generator;

import com.mg.js_payment_service.generator.impl.UserGenerator;

public class StaticUserGenerators {

    public static UserGenerator vfUser = (input) -> input + "vfUser";
    public static UserGenerator dslUser = (input) -> input + "dslUser";
    public static UserGenerator mobileUser = (input) -> input + "mobileUser";
    public static UserGenerator anyUser = (input) -> input + "anyUser";
}

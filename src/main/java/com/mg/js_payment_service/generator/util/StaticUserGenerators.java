package com.mg.js_payment_service.generator.util;

import com.mg.js_payment_service.generator.mint.user.UserGenerator;

public class StaticUserGenerators {

    public static UserGenerator vfUser = (input) -> input + "vfUser";
    public static UserGenerator dslUser = (input) -> input + "dslUser";
    public static UserGenerator mobileUser = (input) -> input + "mobileUser";
    public static UserGenerator anyUser = (input) -> input + "anyUser";
}

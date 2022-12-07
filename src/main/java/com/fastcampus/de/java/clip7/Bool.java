package com.fastcampus.de.java.clip7;

import java.util.Arrays;

public class Bool {
    public static void main(String[] args) {
        boolean fact = true;
        System.out.println(fact);
        System.out.println("true");

        Defaults defaults = new Defaults();
        System.out.println(defaults.booleanDefault);

    }


    static class Defaults {
        boolean booleanDefault;
    }
}

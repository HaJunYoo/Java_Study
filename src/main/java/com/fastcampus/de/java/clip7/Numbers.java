package com.fastcampus.de.java.clip7;

public class Numbers {
    public static void main(String[] args){
        short s = 1;
        System.out.println(s);

        int a = 3; // 정수형 변수 선언
        System.out.println(a);

        long b = 1234567890L; // Long 정수형 변수 선언
        System.out.println(b);

        float c = 5.5F; // float 실수형 변수 선언
        System.out.println(c);

        double d = 9.12345678901234567890d; // double 실수형 변수 선언
        System.out.println(d);

        // 다음처럼 각 자료형의 MAX, MIN 값을 가져올 수 있습니다.
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        // 모든 number type의 default value는 0(또는 0.0) 입니다.

        System.out.println("----------default-----------");

        Defaults defaults = new Defaults();
        System.out.println(defaults.shortDefault);
        System.out.println(defaults.intDefault);

        System.out.println("====char======");

        char alphabet = 'A'; // 문자형 변수 선언
        System.out.println(alphabet);
        char defaultValue ;
        // 값을 할당하지 않고 선언만 하면, default 값은 '\u0000' (null character) 입니다.
        // System.out.println(defaultValue);


    }


    static class Defaults {
        short shortDefault;
        int intDefault;
    }

}

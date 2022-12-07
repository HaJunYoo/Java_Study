package com.fastcampus.de.java.clip7;

public class Byte {
    public static void main(String[] args) {
        byte data = 'd';
        System.out.println(data);

        Defaults defaults = new Defaults();
        System.out.println(defaults.defaultByte);// 값을 할당하지 않고 선언만 하면, default 값은 0 입니다.
    }

    static class Defaults{
        byte defaultByte;
    }
}

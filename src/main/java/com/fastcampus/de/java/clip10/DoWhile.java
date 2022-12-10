package com.fastcampus.de.java.clip10;

public class DoWhile {

    public static void main(String[] args) {

        int i = 1;
        int result = 0;

        do {
            result += i;
            i += 1;
        } while (i < 2);

        System.out.println(result);

    }
}

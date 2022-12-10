package com.fastcampus.de.java.clip10;

public class Quiz {

    public static void main(String[] args) {

        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println(sumOdd);
        System.out.println(sumEven);

    }
}

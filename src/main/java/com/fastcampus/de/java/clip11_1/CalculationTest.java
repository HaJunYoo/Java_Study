package com.fastcampus.de.java.clip11_1;

public class CalculationTest {
    static class Calculation{
        int extra = 1;
        // 정적 메소드
        static int add(int x, int y){
            return x + y;
        }
        // 인스턴스 메소드
        int subtract(int x, int y){
            return x - y - extra;
        }

    }

    public static void main(String[] args) {

        Calculation calculation = new Calculation();

        int addResult = calculation.add(100, 90);
        int subResult = calculation.subtract(90, 70);
        // 정적 메소드
        System.out.println("두 개를 더한 값은 " + Calculation.add(100, 100));
        // 인스턴스 메소드
        System.out.println("두 개를 더한 값은 " + addResult);
        System.out.println("두 개를 뺀 값은 " + subResult);

    }
}

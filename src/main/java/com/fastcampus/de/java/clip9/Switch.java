package com.fastcampus.de.java.clip9;

public class Switch {
    enum Score {
        A, B, C, D, E;
    }
    public static void main(String[] args) {
//        char score = 'A';
//        switch (score) {
//            case 'A':
//                System.out.println("A등급입니다.");
//                break;
//            case 'B':
//                System.out.println("B등급입니다.");
//                break;
//            case 'C':
//                System.out.println("C등급입니다.");
//                break;
//            default:
//                System.out.println("C등급보다 낮은 등급입니다.");
//                break;
//
        Score input = Score.A;
        switch (input) {
            case A:
                System.out.println("A등급입니다.");
                break;
            case B:
                System.out.println("B등급입니다.");
                break;
            case C:
                System.out.println("C등급입니다.");
                break;
            default:
                System.out.println("C등급보다 낮은 등급입니다.");
                break;
        }
    }
}

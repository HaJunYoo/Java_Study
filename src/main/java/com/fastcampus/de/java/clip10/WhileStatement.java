package com.fastcampus.de.java.clip10;

public class WhileStatement {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        while (i < 10) {
            i += 1;
            sum += i;
        }
        System.out.println(sum);

        for(int j =0 ; j<10 ; j++){
            if (j == 5){
                continue;
            }
        System.out.println(j);
        }
    }
}

package com.fastcampus.de.java.clip11_1;

public class Main {
    static class Person {
        String name;
        String country;
        int age;

        // 생성자
        Person(String name, String country, int age) {
            this.name = name;
            this.country = country;

            if("대한민국".equals(country)) {
                this.age = age + 1; }
            else {
                this.age = age;
            }
        }

        Person() {
        }
    }
    public static void main(String[] args) {
        Person minsoo = new Person("민수", "대한민국",10);
//        minsoo.name = "민수";
//        minsoo.country = "대한민국";
//        minsoo.age = 10;

        Person paul = new Person();
        paul.name = "Paul";
        paul.country = "America";
        paul.age = 10;

        Person[] persons = { minsoo, paul };

        for(Person cur : persons) {
            System.out.println("<자기소개>");
            System.out.println("안녕하세요. " + cur.name + " 입니다.");
            System.out.println("저는 "+ cur.country + "에서 태어났습니다.");
            System.out.println("현재 "+ cur.age + "살 입니다.");
        }

        int[] heights = new int[5]; // 키가 들어가 있는 배열

//        initHeight(heights); // 1. 키에 대한 초기화
//        sortHeight(heights); // 2. 키를 오름차순으로 정렬
//        printHeight(heights); // 3. 정렬된 키를 출력


    }
}

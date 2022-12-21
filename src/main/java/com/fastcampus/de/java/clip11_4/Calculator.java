package com.fastcampus.de.java.clip11_4;

public class Calculator {
    static class Animal {
        String name;
        Animal(String name) {
            this.name = name;
        }
        public void cry() {
            System.out.println(name + " is crying.");
        }
    }
    static class Giraffe extends Animal {
        Giraffe(String name) {
            super(name);
        }
        @Override
        public void cry() {
            System.out.println(name + " cannot cry.");
        }
    }
    public static void main(String[] args) {
        Animal giraffe = new Giraffe("기린이");
        giraffe.cry();
    }
}

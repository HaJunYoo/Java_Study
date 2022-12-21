package com.fastcampus.de.java.clip11_4;

public class Main {
    static class Animal {
        String name;

        public void cry () {
            System.out.println(name + "is crying.");
        }
    }

    static class Dog extends Animal {
        Dog(String name) {
            this.name = name;
        }
        public void bark() {
            System.out.println(name + "is barking.");
        }
    }
    static class Cat extends Animal {}

    public void main(String[] args) {
        Dog dog = new Dog("코코");
        dog.cry();
        dog.bark();
    }

}

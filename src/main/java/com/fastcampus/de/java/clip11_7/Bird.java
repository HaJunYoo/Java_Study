package com.fastcampus.de.java.clip11_7;

// 명세서
public interface Bird {
    String STATIC_VARIABLE = "STATIC";
    void fly(int x, int y, int z);
    default void printBreed() {
        System.out.println("나는 새 중에 " + getBreed() + " 입니다.");
    }
    String getBreed();
    static void staticMethod() {
        System.out.println("This is static method");
    }
    abstract void abstractMethod();
}
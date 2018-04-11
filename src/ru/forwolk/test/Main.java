package ru.forwolk.test;

public class Main {
    public static void main(String[] args) {
        JNIHelloWorld p = new JNIHelloWorld();
        System.out.println(p.multiply(2, 2));
        p.printHelloWorld();
    }
}

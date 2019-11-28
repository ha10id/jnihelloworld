package ru.forwolk.test;

public class JNIHelloWorld {
    native void printHelloWorld();

    native int multiply(int a, int b);

    static {
        System.load("/Users/ha10id/bin/helloworld.so"); // Absolute path!
    }
}

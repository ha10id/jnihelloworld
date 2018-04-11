package ru.forwolk.test;

public class JNIHelloWorld {
    native void printHelloWorld();
    native int multiply(int a, int b);
    static {
        System.load(System.getProperty("PROJECT_ROOT") + "/bin/helloworld.so"); //Absolute path!
    }
}



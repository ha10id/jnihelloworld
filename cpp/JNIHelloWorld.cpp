#include <iostream>
#include "JNIHelloWorld.h"

JNIEXPORT void JNICALL Java_ru_forwolk_test_JNIHelloWorld_printHelloWorld
        (JNIEnv *, jobject) {
    std::cout << "Hello world!";
}

JNIEXPORT jint JNICALL Java_ru_forwolk_test_JNIHelloWorld_multiply
        (JNIEnv *, jobject, jint a, jint b) {
    return a * b;
}
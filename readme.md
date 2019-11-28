javac -d bin/ src/ru/forwolk/test/JNIHelloWorld.java

g++ -I"$JAVA_HOME/include" -I"$JAVA_HOME/include/darwin" -fPIC JNIHelloWorld.cpp -shared -o helloworld.so
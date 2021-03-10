package test;

import main.HelloWorld;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void printHelloWorld() {
        HelloWorld hw = new HelloWorld();
        assertEquals("Hello, World!", hw.PrintHelloWorld());
    }
}
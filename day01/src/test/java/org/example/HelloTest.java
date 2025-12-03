package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloTest {

    @Test
    void sayHi() {
        Hello hello = new Hello();
        String expected = "Hello somkiat";
        String actual = hello.sayHi("somkiat");
        assertEquals(expected, actual);
    }
}
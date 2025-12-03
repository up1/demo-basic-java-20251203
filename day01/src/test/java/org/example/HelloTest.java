package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloTest {

    @Test
    @DisplayName("say hi with somkiat => Hello somkiat")
    void sayHi() {
        Hello hello = new Hello();
        String expected = "Hello somkiat";
        String actual = hello.sayHi("somkiat");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("say hi with xxx => xxx")
    void sayHi2() {
        Hello hello = new Hello();
        String expected = "xxx";
        String actual = hello.sayHi("xxx");
        assertEquals(expected, actual);
    }
}
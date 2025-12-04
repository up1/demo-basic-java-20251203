package org.example.quiz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void caseAll() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("1", fb.say(1));
        assertEquals("Fizz", fb.say(3));
        assertEquals("Fizz", fb.say(6));
        assertEquals("FizzBuzz", fb.say(15));
        assertEquals("Buzz", fb.say(5));
        assertEquals("Buzz", fb.say(10));
    }
}
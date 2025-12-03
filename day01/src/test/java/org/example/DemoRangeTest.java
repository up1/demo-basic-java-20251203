package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoRangeTest {

    @Test
    @DisplayName("ตัวอย่าง test case นะ 03")
    void case03() {
        DemoRange demoRange = new DemoRange();
        String result = demoRange.get("(1,5]");
        assertEquals("2345", result);
    }

    @Test
    @DisplayName("ตัวอย่าง test case นะ 02")
    void case02() {
        DemoRange demoRange = new DemoRange();
        String result = demoRange.get("[1,5)");
        assertEquals("1234", result);
    }

    @Test
    @DisplayName("ตัวอย่าง test case นะ 01")
    void case01() {
        DemoRange demoRange = new DemoRange();
        String result = demoRange.get("[1,5]");
        assertEquals("12345", result);
    }
}
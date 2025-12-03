package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoRangeTest {

    @Test
    @DisplayName("ตัวอย่าง test case นะ")
    void case01() {
        DemoRange demoRange = new DemoRange();
        String result = demoRange.get("");
        assertEquals("", result);
    }
}
package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorTest {

    @Test
    void case07() {
        PrimeFactor p = new PrimeFactor();
        List<Integer> result = p.find(6);
        assertEquals(list(2,3), result);
    }

    @Test
    void case06() {
        PrimeFactor p = new PrimeFactor();
        List<Integer> result = p.find(27);
        assertEquals(list(3,3,3), result);
    }

    @Test
    void case05() {
        PrimeFactor p = new PrimeFactor();
        List<Integer> result = p.find(9);
        assertEquals(list(3,3), result);
    }

    @Test
    void case04() {
        PrimeFactor p = new PrimeFactor();
        List<Integer> result = p.find(3);
        assertEquals(list(3), result);
    }

    @Test
    void case03() {
        PrimeFactor p = new PrimeFactor();
        List<Integer> result = p.find(8);
        assertEquals(list(2,2,2), result);
    }

    @Test
    void case02() {
        PrimeFactor p = new PrimeFactor();
        List<Integer> result = p.find(4);
        assertEquals(list(2,2), result);
    }

    @Test
    void case01() {
        PrimeFactor p = new PrimeFactor();
        List<Integer> result = p.find(2);
        assertEquals(list(2), result);
    }

    private List<Integer> list(int... inputs){
        List<Integer> result = new ArrayList<>();
        for (int input : inputs) {
            result.add(input);
        }
        return result;
    }
}
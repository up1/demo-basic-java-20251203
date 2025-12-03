package org.example;

import java.math.BigDecimal;

public class DemoFloating {

    static final int ZERO = 0;

    public static void main(String[] args) {
        System.out.println(DemoFloating.ZERO);
        solution3();
    }

    void xxx(){
        System.out.println(DemoFloating.ZERO);
    }


    // Floating point errors
    static void problem01() {
        double val = 1.00;
        for (int i = 0; i < 10; i++) {
            val += 0.10;
        }
        System.out.println(val);
    }

    // Floating point errors
    static void problem02() {
        double first = 0.1;
        double second = 0.2;
        double result = first + second;
        System.out.println(result);
    }

    // Floating point errors
    static void problem03() {
        double a = 1.0000001;
        double b = 2.0000002;
        double c = 3.0000003;

        System.out.println((a + b) + c);
        System.out.println(a + (b + c));
    }

    static void solution1() {
        BigDecimal value = new BigDecimal("1.00");
        for (int i = 0; i < 10; i++) {
            value = value.add(new BigDecimal("0.10"));
        }
        System.out.println(value);
    }

    static void solution2() {
        BigDecimal first = new BigDecimal("0.1");
        BigDecimal second = new BigDecimal("0.2");
        BigDecimal result = first.add(second);
        System.out.println(result);
    }

    static void solution3() {
        BigDecimal a = new BigDecimal("1.0000001");
        BigDecimal b = new BigDecimal("2.0000002");
        BigDecimal c = new BigDecimal("3.0000003");

        System.out.println((a.add(b)).add(c));
        System.out.println(a.add(b.add(c)));
    }

}

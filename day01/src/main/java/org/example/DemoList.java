package org.example;

import java.util.ArrayList;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}

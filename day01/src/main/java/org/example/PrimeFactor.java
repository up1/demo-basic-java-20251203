package org.example;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    public List<Integer> find(int input) {
        List<Integer> result = new ArrayList<>();
        int i = 2;
        if(input > 2) {
            result.add(i);
            input = input/i;
        }
        result.add(input);
        return result;
    }

}

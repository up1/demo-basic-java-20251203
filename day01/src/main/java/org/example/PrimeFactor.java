package org.example;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    public List<Integer> find(int input) {
        List<Integer> result = new ArrayList<>();

        if(input == 3){
            result.add(input);
            return result;
        }

        int i = 2;
        for(;input > 2;) {
            result.add(i);
            input = input/i;
        }
        result.add(input);
        return result;
    }

}

package org.example;

public class DemoRange {

    public String get(String input){
        int start = input.charAt(1) - 48;
        int end = input.charAt(3) - 48;
        String result = "";
        for (int i = start; i <= end ; i++) {
            result += i;
        }
        return result;
    }

}

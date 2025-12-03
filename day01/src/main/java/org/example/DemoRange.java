package org.example;

public class DemoRange {

    public String get(String input){
        int start = Integer.parseInt(input.charAt(1) + "") + 1;
        if(input.startsWith("[")) {
            start = Integer.parseInt(input.charAt(1) + "");
        }
        int end = Integer.parseInt(input.charAt(3) + "") - 1;
        if(input.endsWith("]")) {
            end = Integer.parseInt(input.charAt(3) + "");
        }
        String result = "";
        for (int i = start; i <= end ; i++) {
            result = result + i;
        }
        return result;
    }

}

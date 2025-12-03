package org.example;

public class DemoRange {

    public String get(String input){
        int start = Integer.parseInt(input.charAt(1) + "");
        int end;
        if(input.endsWith("]")) {
            end = Integer.parseInt(input.charAt(3) + "");
        } else {
            end = Integer.parseInt(input.charAt(3) + "") - 1;
        }
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end ; i++) {
            result.append(i);
        }
        return result.toString();
    }

}

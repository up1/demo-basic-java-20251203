package org.example;

public class DemoRange {

    public String get(String input){
        int start = getAnInt(input, 1) + 1;
        if(input.startsWith("[")) {
            start = getAnInt(input, 1);
        }
        int end = getAnInt(input, 3) - 1;
        if(input.endsWith("]")) {
            end = getAnInt(input, 3);
        }
        String result = "";
        for (int i = start; i <= end ; i++) {
            result = result + i;
        }
        return result;
    }

    private static int getAnInt(String input, int index) {
        return Integer.parseInt(input.charAt(index) + "");
    }

}

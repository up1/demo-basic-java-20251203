package org.example;

public class DemoRange {

    public String get(String input){
        int start = getStartNumber(input);
        int end = getEndNumber(input);
        return generateResult(start, end);
    }

    private static String generateResult(int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result = result + i;
        }
        return result;
    }

    private static int getEndNumber(String input) {
        int end = Integer.parseInt(input.charAt(3) + "") - 1;
        if(input.endsWith("]")) {
            end = Integer.parseInt(input.charAt(3) + "");
        }
        return end;
    }

    private static int getStartNumber(String input) {
        int start = Integer.parseInt(input.charAt(1) + "") + 1;
        if(input.startsWith("[")) {
            start = Integer.parseInt(input.charAt(1) + "");
        }
        return start;
    }

}

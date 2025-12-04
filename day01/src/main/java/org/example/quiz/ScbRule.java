package org.example.quiz;

public class ScbRule implements MyRule {

    public boolean check(int input) {
        return input % 7 == 0;
    }

    public String say(){
        return "SCB";
    }

}

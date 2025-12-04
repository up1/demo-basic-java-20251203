package org.example.quiz;

public class FizzRuleV2 implements MyRule {

    public boolean check(int input) {
        return input % 3 == 0;
    }

    public String say(){
        return "Fizz";
    }

}

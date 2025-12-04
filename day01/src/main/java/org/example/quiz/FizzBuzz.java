package org.example.quiz;

public class FizzBuzz {

    public String say(int input) {

        // 1.หาร 3 และ 5 ลงตัว จะพูดว่า FizzBuzz
        if(input % 15 == 0) {
            return "FizzBuzz";
        }
        // 2.หาร 3 ลงตัว จะพูดว่า Fizz
        MyRule[] rules = new MyRule[]{
                new FizzRuleV2(),
                new BuzzRule(),
                new ScbRule()
        };
        for (MyRule rule : rules) {
            if(rule.check(input)) {
                return rule.say();
            }
        }
        // 4. อื่น ๆ
        return input + "";
    }

}

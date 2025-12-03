package org.example;

public class Hello {

    public String sayHi(String name){
        String xxx = "xxx";

        // Fail fast
        if(name == null) {
            return "Error";
        }

        // Success

        if(name.equals(xxx)) {
            return "xxx";
        }
        return "Hello " + name;
    }

}

package org.example;


import java.util.Objects;

record User(int id, String name){
}

public class DemoObject {

    static void main(String[] args) {
        User u1 = new User(1, ""); // Default constructor
        User u2 = new User(1, "");
        System.out.println(u1.equals(u2));
        System.out.println(u1.toString());
        System.out.println(u2.toString());
    }

}

package org.example;


import java.util.Objects;

class User {
    int id;
    String name;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class DemoObject {

    static void main(String[] args) {
        User u1 = new User(); // Default constructor
        User u2 = new User();
        System.out.println(u1.equals(u2));
        System.out.println(u1.toString());
        System.out.println(u2.toString());
    }

}

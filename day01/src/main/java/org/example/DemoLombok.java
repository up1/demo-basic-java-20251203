package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Employee {
    private int id;
    private String name;
}

public class DemoLombok {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "");
        Employee e2 = new Employee(1, "");
        System.out.println(e1.equals(e2));
    }
}

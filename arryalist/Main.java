package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Employee> emp = new ArrayList<>();

        emp.add(new Employee("Ryan","Dall",568));
        emp.add(new Employee("Butch","scott",89));

        emp.forEach(employee -> System.out.println(employee));
    }
}

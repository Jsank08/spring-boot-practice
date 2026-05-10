package com.example.spring_boot_practice.DSAPrcatice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeProblems {

    static class Employee {
        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() { return name; }
        public double getSalary() { return salary; }
    }


    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("John", 50000),
                new Employee("Alice", 75000),
                new Employee("Bob", 60000),
                new Employee("Charlie", 90000),
                new Employee("David", 55000)
        );

        List<Employee> top = employees.stream().filter(e -> e.getSalary() > 55000).toList();
//        top.forEach(e -> System.out.println("Salary greater than 5500 -" + e.getSalary()));

        Optional<Employee> max = employees.stream().max(Comparator.comparingDouble(Employee::getSalary));

        if (max.isPresent()) System.out.println(max.get().getSalary());


        List<Employee> sorterList = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).toList();

        sorterList.forEach(e -> System.out.println("Salary greater than 5500 -" + e.getName()));





    }
}

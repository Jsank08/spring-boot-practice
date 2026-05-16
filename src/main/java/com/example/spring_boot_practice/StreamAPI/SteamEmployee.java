package com.example.spring_boot_practice.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class SteamEmployee {

    static List<Employee> employeeList = new ArrayList<>();

    static {


        employeeList.add(new Employee(
                101,
                "Sanket",
                "Jadhav",
                85000,
                "IT",
                Arrays.asList("Banking App", "CRM System")
        ));

        employeeList.add(new Employee(
                102,
                "Rahul",
                "Sharma",
                65000,
                "HR",
                Arrays.asList("Employee Portal", "Payroll System")
        ));

        employeeList.add(new Employee(
                103,
                "Priya",
                "Patil",
                95000,
                "Finance",
                Arrays.asList("Accounting Tool", "Invoice System")
        ));

        employeeList.add(new Employee(
                104,
                "Amit",
                "Verma",
                72000,
                "IT",
                Arrays.asList("E-Commerce Platform", "Inventory System")
        ));

        employeeList.add(new Employee(
                107,
                "Anjali",
                "D",
                99000,
                "Finance",
                Arrays.asList("E-Commerce Platform", "Inventory System")
        ));

        employeeList.add(new Employee(
                104,
                "Sushil",
                "Shinde",
                87000,
                "HR",
                Arrays.asList("E-Commerce Platform", "Inventory System")
        ));

        employeeList.add(new Employee(
                105,
                "Neha",
                "Kulkarni",
                88000,
                "HR",
                Arrays.asList("Automation Framework", "Bug Tracker")
        ));

    }

    // Print all employees

    public static void main(String[] args) throws NoSuchFieldException {

        //foreach
//            employeeList.stream().forEach(employee -> System.out.println(employee));

        //map
        //collect
        Set<Employee> increasedSalary = employeeList.stream().map(employee -> new Employee(
                        employee.getId(),
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getSalary() * 1.10,
                        employee.getDepartment(),
                        employee.getProjects()
                ))
                .collect(Collectors.toSet());


        //filter
        List<Employee> filterEmployee = employeeList.stream().filter(employee -> employee.getSalary() > 80000.0).map(employee -> new Employee(
                        employee.getId(),
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getSalary() * 1.10,
                        employee.getDepartment(),
                        employee.getProjects()
                ))
                .collect(Collectors.toList());

        //findFirst
        Employee firstEmployee = employeeList.stream().map(employee -> new Employee(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getSalary() * 1.10,
                employee.getDepartment(),
                employee.getProjects()
        )).findFirst().orElse(null);

        //flatMap
        String projects = employeeList.stream().map(Employee::getProjects).flatMap(strings -> strings.stream()).collect(Collectors.joining(","));


        //shorcircuit operatorations
        List<Employee> shortCircuit = employeeList.stream().skip(1).limit(2).collect(Collectors.toList());

        //max or min
        employeeList.stream().max(Comparator.comparing(Employee::getSalary)).orElseThrow(NoSuchFieldException::new);

        //reduce


        //2nd highest salary
        Optional<Double> highestSalary = employeeList.stream().map(employee -> employee.getSalary()).sorted(Comparator.reverseOrder()).limit(1).findFirst();

        Employee highestSalEmpl = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).limit(1).findFirst().get();

        //groupBy
        Map<String, Optional<Employee>> salaryByDept = new HashMap<>();
        salaryByDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

//        salaryByDept.forEach((dept, emp) -> {
//                    System.out.println(" department is : " + dept + " , " + emp.get().getSalary());
//                }
//        );

        //employee with longest name
        Map<String, Optional<Employee>> longestNameEmployee =
                employeeList
                        .stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingInt(employeeList -> employeeList.getFirstName().length()))));


        Set<String> deptCount = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())).entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());


        System.out.println(" Hello StreamAPI : " +  deptCount);
    }

}

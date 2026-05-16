package com.example.spring_boot_practice.StreamAPI;
import java.util.List;

public class Employee {

    // Fields
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private String department;
    private List<String> projects;

    // Default Constructor
    public Employee() {
    }

    // Parameterized Constructor
    public Employee(int id,
                    String firstName,
                    String lastName,
                    double salary,
                    String department,
                    List<String> projects) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
        this.projects = projects;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for firstName
    public String getFirstName() {
        return firstName;
    }

    // Setter for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter for lastName
    public String getLastName() {
        return lastName;
    }

    // Setter for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Getter for projects
    public List<String> getProjects() {
        return projects;
    }

    // Setter for projects
    public void setProjects(List<String> projects) {
        this.projects = projects;
    }

    // toString Method
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", projects=" + projects +
                '}';
    }
}
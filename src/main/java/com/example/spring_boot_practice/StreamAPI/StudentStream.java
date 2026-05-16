package com.example.spring_boot_practice.StreamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

 class StudentStream {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Sanket", 95),
                new Student("Rahul", 82),
                new Student("Priya", 91),
                new Student("Amit", 76),
                new Student("Neha", 98)
        );

        // Print student names whose marks are greater than 90
        List<String> topStudent = students.stream().filter(student -> student.getMarks() > 90).map(student -> student.getName()).collect(Collectors.toList());

       System.out.println(topStudent.toString());
    }
}
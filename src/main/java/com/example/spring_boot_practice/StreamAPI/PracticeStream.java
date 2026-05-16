package com.example.spring_boot_practice.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeStream {
    static List<String> listOfStrings = Arrays.asList("Java","Python","C#","HTML","Kotlin","C++","COBOL","C");

    static List<String> sortedString = listOfStrings.stream().sorted(Comparator.comparingInt(str -> str.length())).collect(Collectors.toList());
    public static void main(String[] args){
        System.out.println(" Hello World : " + sortedString);
    };
}

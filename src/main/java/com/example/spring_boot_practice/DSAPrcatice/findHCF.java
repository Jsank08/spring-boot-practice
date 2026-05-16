package com.example.spring_boot_practice.DSAPrcatice;

import java.util.ArrayList;

public class findHCF {

    public static int calculateHcf(int num1, int num2){

        if (num2 == 0) {
            return num1;
        }

        ArrayList<Integer> arr1 = new ArrayList<>();

        System.out.println(" capacity : " + arr1.size());

        return calculateHcf(num2, num1 % num2);
    }

    public static void main(String[] arg){

        int num1 = 24, num2 = 36;

        int result = calculateHcf(num1, num2);
        System.out.println("HCF of given number is : " + result);
    }
}

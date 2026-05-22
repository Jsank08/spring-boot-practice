package com.example.spring_boot_practice.Exceptions;

public class TryCatch {

    public static int method(int num) {
        int x = 5;

        try {
            int result = 7/num;
            return x;
        } catch (Exception e){
            return x;
        } finally {
            x = 10;
            System.out.println("x = " + x);
            return x;
        }

    }


    public static void main(String[] args){
        System.out.println(" Hello There : " + method(0));
    }
}

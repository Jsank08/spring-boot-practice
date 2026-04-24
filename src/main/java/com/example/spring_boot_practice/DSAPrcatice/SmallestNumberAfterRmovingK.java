package com.example.spring_boot_practice.DSAPrcatice;

import java.util.ArrayDeque;
import java.util.Deque;

public class SmallestNumberAfterRmovingK {

    public static String removeKDigits(String num, int k){

        Deque<Character> stack = new ArrayDeque<>();

        for( char digit : num.toCharArray()){

            if (!stack.isEmpty() && k > 0 && stack.peek() > digit){
                stack.pop();
                k--;
            }

            stack.push(digit);

        }



    }

    public static void main(String[] args){

        System.out.println();

    }
}

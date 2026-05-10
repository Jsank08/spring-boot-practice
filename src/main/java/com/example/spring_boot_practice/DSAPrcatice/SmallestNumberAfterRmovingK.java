package com.example.spring_boot_practice.DSAPrcatice;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class SmallestNumberAfterRmovingK {

    public static String removeKDigits(String num, int k) {

        Deque<Character> stack = new ArrayDeque<>();

        for (char digit : num.toCharArray()) {

            if (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }

            stack.push(digit);

        }
        ;


        if (k > 0) {
            while (k > 0) {
                stack.pop();
                k--;
            }
        }

        StringBuilder strBld = new StringBuilder();

        while (!(stack.isEmpty())) {
            strBld.append(stack.peek());
            stack.pop();
        }

        strBld.reverse().toString();

        int idx = 0;

        for (int i = 0; i < strBld.length(); i++){
            if (strBld.charAt(i) == '0'){
                idx++;
            } else {
                break;
            }
        }


        return strBld.substring(idx);


    }

    public static void main(String[] args) {

        System.out.println(removeKDigits("1432219", 3));  // Output: "1219"
        System.out.println(removeKDigits("10200", 1));    // Output: "200"
        System.out.println(removeKDigits("123456", 2));   // Output: "1234"

    }
}

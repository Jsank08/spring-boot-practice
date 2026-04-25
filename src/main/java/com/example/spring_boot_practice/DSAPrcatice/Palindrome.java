package com.example.spring_boot_practice.DSAPrcatice;

public class Palindrome {

    public static String longestPalindrom(String str){

        boolean isPalindrome = false;

        String longestString = "";

        for(int i = 0; i < str.length(); i++){

            for (int j = i; j < str.length(); j++){
                String substring = str.substring(i, j + 1);

   if (isPalindrome(substring)) {
       if(substring.length() > longestString.length()){
           longestString = str.substring(i, j + 1);
       }
                    isPalindrome = true;
                }
            }
        }

        return isPalindrome ? "Longest substring is - " + longestString : "no palindrome substring found";

    }

    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length() - 1;

        boolean isPalindrome = false;

        while(i < j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            } else {
                break;
            }
            isPalindrome = true;
        }

        return isPalindrome;

    }

    public static void main (String[] args){

        System.out.println("longest palindrom :- " + longestPalindrom("racecar"));
    }
}

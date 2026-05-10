package com.example.spring_boot_practice.DSAPrcatice;

import java.util.HashMap;

public class maxCharacterCount {

    public static char maxCharacterCount( String str){

        char[] chars = str.toCharArray();

        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();

        int count = 0;
        char highestCountChar = 0;

        for (char c: chars){
            if (characterIntegerHashMap.containsKey(c)){
                Integer val = characterIntegerHashMap.get(c);
                characterIntegerHashMap.put(c, val + 1);
            } else {
                characterIntegerHashMap.put(c, 1);
            }
            if(count < characterIntegerHashMap.get(c)){
                count = characterIntegerHashMap.get(c);
                highestCountChar = c;
            }
        }


        System.out.println("chars map :- " + characterIntegerHashMap);

        return highestCountChar;
    };


    public static void main(String [] args){

        String str = "Helloworld";

        System.out.println("max count - " + maxCharacterCount(str));
    };
}

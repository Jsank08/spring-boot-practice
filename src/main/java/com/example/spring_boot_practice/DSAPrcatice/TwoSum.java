package com.example.spring_boot_practice.DSAPrcatice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target){

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++){
            int needed = target  - arr[i];

            if (map.containsKey(needed)){
                System.out.println("needed in map - " + needed + " needed - " + needed + ", i : " + arr[i]);
                return new int[]{map.get(needed), i};
            } else{
                map.put(arr[i], i);
            }
        }
        return new int[]{};

    }

    public static void main(String[] args){
        int[] nums = {2,7,11,15};

        System.out.println("Hello :- " + Arrays.toString(twoSum(nums, 9)));
    }
}

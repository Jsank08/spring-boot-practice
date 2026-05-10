package com.example.spring_boot_practice.DSAPrcatice;

import java.util.Arrays;
import java.util.HashMap;

public class TargetDiff {



        public static String targetDiff(int[] nums, int target){

            HashMap<Integer, Boolean> orderedList = new HashMap<>();

            for (int i = 0; i < nums.length; i ++){
                if (!orderedList.containsKey(nums[i])){
                    orderedList.put(nums[i], true);
                }
            }

            System.out.println("nums - " + Arrays.toString(nums));

            return "";

        }

        static int[] nums = {1,2,3,3,4,5};
        static int target = 2;

        public static void main(String[] args) {
            System.out.println("Hello, World! - " + targetDiff(nums, target));
        }
}

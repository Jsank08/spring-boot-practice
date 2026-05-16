package com.example.spring_boot_practice.DSAPrcatice;

import java.util.Arrays;

public class MaximizeSum {

    public static int maximizeSum(int[] nums, int k){

        Arrays.sort(nums);

        int maxSum = 0;

        for (int i = 0; i < nums.length; i++){

            if ( nums[i] < 0){
                nums[i] = nums[i] * -1;
                k--;
            }
//            maxSum+=nums[i];
        }

        Arrays.sort(nums);

        for (int num : nums){

            if (k > 0){
               maxSum = num * -1 + maxSum;
               k--;
            } else {
                maxSum += num;
            }

        }

        System.out.println("ordered array :- " + Arrays.toString(nums) + ", minAbs : " );

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {5, -2, -3, 6, 7};
        int k = 3;

        int result = maximizeSum(arr, k);

        System.out.println("Maximum Sum = " + result);
    }
}

package com.example.spring_boot_practice.DSAPrcatice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamElements {

    public static void main(String[] args){

        List<Integer> numbersArr = Arrays.asList(45, 23, 67, 89, 12, 90, 34, 56, 78, 11);

        List<Integer> topNums = numbersArr.stream().sorted(Collections.reverseOrder()).limit(3).toList();

        List<Integer> numsWithDuplicate = Arrays.asList(45, 23, 67, 89, 45, 90, 34, 23, 78, 11);

        List<Integer> topNumsWithDuplicate = numsWithDuplicate.stream().distinct().sorted().limit(3).toList();

         int[] arr2 = {45, 23, 67, 89, 45, 90, 34, 23, 78, 11};

        Arrays.sort(arr2);

        int[] steamArr = Arrays.stream(arr2).distinct().toArray();


        System.out.println("topNums - " + Arrays.toString(steamArr));
    }
}

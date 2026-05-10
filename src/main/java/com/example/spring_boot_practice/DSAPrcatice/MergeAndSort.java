package com.example.spring_boot_practice.DSAPrcatice;

import java.util.Arrays;
import java.util.TreeSet;

public class MergeAndSort {

    public static int[] mergeAndSort(int[] a, int[] b){

        TreeSet<Integer> set = new TreeSet<>();

        for (int n : a){
            set.add(n);
        }

        for (int n : b){
            set.add(n);
        }

        int index = 0;
        int[] sortedAndMergedArr = new int[set.size()];

        for (int n : set){
            sortedAndMergedArr[index++] = n;
        }

        return sortedAndMergedArr;

    }

    public static int[] sortAndMerge(int[] a, int[] b){

        Arrays.sort(a);
        Arrays.sort(b);

        int i=0, j=0, k=0;

        int[] mergedArray = new int[a.length + b.length];

        while (i < a.length && j < b.length){
            if(a[i] <= b[j]){

                mergedArray[k++] = a[i++];
            } else{

                mergedArray[k++] = b[j++];
            }

        }

        System.out.println("mergedArray - " + Arrays.toString(mergedArray));



        return mergedArray;


    }



    public static void main(String[] args) {
        int[] a = {5, 3, 1, 3, 8};
        int[] b = {4, 2, 8, 6, 1};

        int[] result = sortAndMerge(a, b);

        System.out.println("sortedAndMergedArr - " + Arrays.toString(result));
    }
}

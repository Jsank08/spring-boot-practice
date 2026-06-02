package com.example.spring_boot_practice.StreamAPI;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> duplicates = Arrays.asList(1,2,3,2,4,5,1,6,3,3);

        //using map
//        Map<Integer, Integer> duplicateNums = new HashMap<>();
//
//        duplicates.stream().forEach((num) -> {
//            if (duplicateNums.containsKey(num)){
//                duplicateNums.put(num, duplicateNums.(num) + 1);
//            } else {
//                duplicateNums.put(num, 1);
//            }
//
//        });
//
//        duplicateNums.entrySet().stream().forEach(num -> {
//            if (duplicateNums.get(num) > 1){
//                System.out.println("dulicate number is : " + duplicateNums.get(num));
//            }
//        });


        // collect counts into a Map<Integer, Long>
        Map<Integer, Long> counts = duplicates.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // filter entries with count > 1 into a List
        List<Map.Entry<Integer, Long>> duplicateEntries = counts.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .collect(Collectors.toList());

        System.out.println(duplicateEntries);
    }
}

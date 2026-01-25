package com.lovebabbar.dsa.array;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UnionAndIntersectionOfSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        List<Integer> add = new ArrayList<>();
        Set<Integer>integers = new LinkedHashSet<>();
        for(int i = 0; i < arr1.length; i++){
            if (integers.contains(arr1[i])) {
                add.add(arr1[i]);
            }
            integers.add(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++){
            if (integers.contains(arr2[i])) {
                add.add(arr2[i]);
            }
            integers.add(arr2[i]);
        }

        System.out.println("union : " + integers);
        System.out.println(add);
    }
    
}

package com.lovebabbar.dsa.array;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class commonElements {

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 20, 40, 80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};

        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> list = new TreeSet<>();

        // Step 1: store arr1
        for (int temp : arr1) {
            set.add(temp);
        }

        // Step 2: check arr2 with set1
        for (int temp : arr2) {
            if (set.contains(temp)) {
                set2.add(temp);
            }
        }

        // Step 3: check arr3 with set2
        for (int temp : arr3) {
            if (set2.contains(temp)) {
                list.add(temp);
            }
        }

        System.out.println(list);
    }
}

package com.lovebabbar.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        List<Integer> union = new ArrayList<>();
        int i = 0;
        int j = 0;

        // Main two-pointer loop
        while (i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j]){
                if(union.isEmpty() || union.getLast() != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            }
            else if (arr1[i] > arr2[j]) {
                if(union.isEmpty() || union.getLast() != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            } else {
                if(union.isEmpty() || union.getLast() != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        // Remaining elements of arr1
        while (i < arr1.length) {
            if(union.isEmpty() || union.getLast() != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        // Remaining elements of arr2
        while (j < arr2.length) {
            if(union.isEmpty() || union.getLast() != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }
        System.out.println("union of 2 array is :" + union);
    }
    
}

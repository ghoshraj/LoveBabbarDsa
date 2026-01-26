package com.lovebabbar.dsa.array;

import java.util.Arrays;

public class FindKthMaxMin {

    public static void main(String[] args) {
         int[] arr = {8, -3, 21, -4, 10};
         int k = 3;

         //sort the array
        Arrays.sort(arr);
        int min = arr[k - 1];
        int max = arr[arr.length - k];
        System.out.println(max + " " + min);
    }
}

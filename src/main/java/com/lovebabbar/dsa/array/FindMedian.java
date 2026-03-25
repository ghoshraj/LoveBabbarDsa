package com.lovebabbar.dsa.array;

import java.util.Arrays;

public class FindMedian {

    public static void main(String[] args) {
        int[] arr = {90, 100, 78, 89, 67};
        double median = findMedian(arr);
        System.out.println("Median: " + median);
    }

    public static double findMedian(int[] arr) {
        // Code here.
        Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 == 0){
            int sum = arr[n/2] + arr[n/2 - 1];
            return (double)sum/2;
        }
        else {
            return arr[n/2];
        }
    }
}

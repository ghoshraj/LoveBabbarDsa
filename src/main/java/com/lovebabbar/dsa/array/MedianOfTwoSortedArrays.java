package com.lovebabbar.dsa.array;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = {3, 5, 6, 12, 15};
        int[] arr2 = {3, 4, 6, 10, 10, 12};
        double median = findMedian(arr1, arr2);
        System.out.println("Median: " + median);
    }

    public static double findMedian(int[] arr1, int[] arr2) {
        // Code here.
        int n = arr1.length + arr2.length;
        int[] arr = new int[n];
        int i = 0;
        for (int temp : arr1) {
            arr[i] = temp;
            i++;
        }
        for (int temp : arr2) {
            arr[i] = temp;
            i++;
        }
        Arrays.sort(arr);
        if (n % 2 == 0) {
            int sum = arr[n / 2] + arr[n / 2 - 1];
            return (double) sum / 2;
        } else {
            return arr[n / 2];
        }
    }
}

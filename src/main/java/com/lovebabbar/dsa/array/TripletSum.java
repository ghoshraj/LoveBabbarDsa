package com.lovebabbar.dsa.array;

import java.util.Arrays;

public class TripletSum {

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int target = 13;
        boolean isTriplet = isTriplet(arr, target);
        System.out.println("Is Triplet: " + isTriplet);
    }

    public static boolean isTriplet(int[] arr, int target) {
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int newTarget = target - arr[i];
            ;
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                sum = arr[left] + arr[right];
                if (sum == newTarget) {
                    return true;
                } else if (sum > newTarget) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return false;
    }
}

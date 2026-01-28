package com.lovebabbar.dsa.array;

public class maxSubarraySum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -2, 5};
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int j : arr) {
            sum += j;
            if (sum > maxSum) maxSum = sum;
            if (sum < 0) sum = 0;
        }
        System.out.println(maxSum);
    }
}

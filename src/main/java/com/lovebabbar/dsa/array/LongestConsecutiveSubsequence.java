package com.lovebabbar.dsa.array;

import java.util.Arrays;

public class LongestConsecutiveSubsequence {

    public static void main(String[] args) {
        int[] arr = {
                99, 80, 60, 33, 44, 86, 34, 64, 77, 18,
                39, 3, 27, 16, 29, 60, 67, 23, 7, 87,
                6, 75, 92, 11, 59, 13, 88, 24, 98, 4,
                26, 6
        };
        int longestConsecutive = longestConsecutive(arr);
        System.out.println("Longest Consecutive Subsequence: " + longestConsecutive);
    }

    public static int longestConsecutive(int[] arr) {
        Arrays.sort(arr);
        int count = 1, maxCount = 1;

        for (int i = 1; i < arr.length; i++) {

            // skip duplicates
            if (arr[i] == arr[i - 1]) {
                continue;
            } else if (arr[i] == arr[i - 1] + 1) {
                count++;
            } else {
                count = 1;
            }
        }
        return maxCount;
    }
}

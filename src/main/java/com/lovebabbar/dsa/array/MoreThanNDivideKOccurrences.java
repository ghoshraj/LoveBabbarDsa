package com.lovebabbar.dsa.array;

import java.util.HashMap;

public class MoreThanNDivideKOccurrences {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 2, 1, 2, 3, 3};
        int k = 4;
        int result = countOccurence(arr, k);
        System.out.println("Elements that appear more than n/k times: " + result);
    }

    public static int countOccurence(int[] arr, int k) {
        int result = 0;
        int n = arr.length / k;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int value : map.values()) {
            if (value > n) {
                result++;
            }
        }
        return result;
    }
}

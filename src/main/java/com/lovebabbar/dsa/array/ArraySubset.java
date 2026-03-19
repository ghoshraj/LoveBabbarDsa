package com.lovebabbar.dsa.array;

import java.util.HashMap;

public class ArraySubset {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] sub = {1, 2, 3};
        boolean isSubset = isSubset(arr, sub);
        System.out.println("Is Subset: " + isSubset);
    }

    public static boolean isSubset(int[] arr, int[] sub) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int temp : arr) {
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }

        for (int num : sub) {
            if (!map.containsKey(num) || map.get(num) == 0) {
                return false;
            }
            map.put(num, map.get(num) - 1);
        }

        return true;

    }
}

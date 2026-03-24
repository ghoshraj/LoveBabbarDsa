package com.lovebabbar.dsa.array;

import java.util.*;

public class TwoSumPairsWith0Sum {

    public static void main(String[] args) {

        int[] arr = {-1, 0, 1, 2, -1, -4};
        Set<Integer> seen = new HashSet<>();
        Set<String> uniquePairs = new HashSet<>();

        List<List<Integer>> result = new ArrayList<>();

        for (int temp : arr) {
            int target = -temp;

            if (seen.contains(target)) {
                int a = Math.min(temp, target);
                int b = Math.max(temp, target);

                String key = a + "," + b;

                if (!uniquePairs.contains(key)) {
                    result.add(Arrays.asList(a, b));
                    uniquePairs.add(key);
                }
            }
            seen.add(temp);
        }

        for (List<Integer> pair : result) {
            System.out.println(pair);
        }
    }
}

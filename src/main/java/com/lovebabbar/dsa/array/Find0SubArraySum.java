package com.lovebabbar.dsa.array;

import java.util.HashSet;
import java.util.Set;

public class Find0SubArraySum {

    public static void main(String[] args) {
        int[] arr = {4, 2, 0, 1, 6};
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        for (int j : arr) {
            sum += j;

            if (sum == 0)
                System.out.println("SubArray found");

            if (set.contains(sum))
                System.out.println("SubArray found");
            set.add(sum);
        }
    }
}

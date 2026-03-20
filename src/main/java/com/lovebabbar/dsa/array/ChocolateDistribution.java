package com.lovebabbar.dsa.array;

import java.util.Arrays;

public class ChocolateDistribution {

    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;
        int chocolates = chocolates(arr, m);
        System.out.println("Chocolates: " + chocolates);
    }

    public static int chocolates(int[] arr, int m) {
        Arrays.sort(arr);

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i <= arr.length - m; i++) {
            int diff = arr[i + m - 1] - arr[i];
            ans = Math.min(ans, diff);
        }

        return ans;
    }
}

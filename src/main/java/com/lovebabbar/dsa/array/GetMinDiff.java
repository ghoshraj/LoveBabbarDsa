package com.lovebabbar.dsa.array;

import java.util.Arrays;

public class GetMinDiff {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        Arrays.sort(arr);
        int ans = arr[arr.length - 1] - arr[0];

        for (int i = 1; i < arr.length; i++){

            if (arr[i] - k < 0) continue;

            int minHeight = Math.min(arr[0] + k,arr[i] - k);
            int maxHeight = Math.max(arr[i -1] + k, arr[arr.length - 1] - k);
            ans = Math.min(ans, maxHeight - minHeight);
        }

        System.out.println(ans);
    }
}

package com.lovebabbar.dsa.array;

public class MinSwap {

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 3};
        int k = 3;
        int minSwaps = minSwaps(arr, k);
        System.out.println("Min Swaps: " + minSwaps);
    }

    public static int minSwaps(int[] arr, int k) {
        int goodElement = 0;
        for (int temp : arr){
            if (temp <= k) goodElement++;
        }

        int badElement = 0;
        for (int i = 0; i < goodElement; i++){
            if (arr[i] > k) badElement++;
        }

        int ans = badElement;
        for (int i = goodElement; i < arr.length; i++){
            if (arr[i] > k) badElement++;
            if (arr[i - goodElement] > k) badElement--;

            ans = Math.min(ans, badElement);
        }
        return ans;
    }
}

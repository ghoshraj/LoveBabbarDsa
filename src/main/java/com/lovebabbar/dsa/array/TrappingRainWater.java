package com.lovebabbar.dsa.array;

public class TrappingRainWater {

    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 0, 4, 0, 2};
        int trappedRainWater = trappedRainWater(arr);
        System.out.println("Trapped Rain Water: " + trappedRainWater);
    }

    public static int trappedRainWater(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int trappedRainWater = 0;

        while (left <= right) {
            if (arr[left] < arr[right]){
                leftMax = Math.max(leftMax, arr[left]);
                trappedRainWater += leftMax - arr[left];
                left++;
            }
            else{
                rightMax = Math.max(rightMax, arr[right]);
                trappedRainWater += rightMax - arr[right];
                right--;
            }
        }
        return trappedRainWater;
    }
}

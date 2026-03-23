package com.lovebabbar.dsa.array;

public class ThreeWayPartitioning {

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 6, 2, 1};
        int a = 1;
        int b = 3;
        threeWayPartitioning(arr, a, b);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void threeWayPartitioning(int[] arr, int a, int b) {
        int[] small = new int[arr.length];
        int[] mid = new int[arr.length];
        int[] big = new int[arr.length];

        int smallIndex = 0;
        int midIndex = 0;
        int largeIndex = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < a){
                small[smallIndex] = arr[i];
                smallIndex++;
            } else if (arr[i] >= a && arr[i] <= b) {
                mid[midIndex] = arr[i];
                midIndex++;
            } else {
                big[largeIndex] = arr[i];
                largeIndex++;
            }
        }

        for (int i = 0; i < smallIndex; i ++){
            arr[i] = small[i];
        }

        for (int i = 0; i < midIndex; i++){
            arr[i + smallIndex] = mid[i];
        }

        for (int i = 0; i < largeIndex; i++){
            arr[i + smallIndex + midIndex] = big[i];
        }
    }
}

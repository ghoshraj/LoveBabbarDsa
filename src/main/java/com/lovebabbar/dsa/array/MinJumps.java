package com.lovebabbar.dsa.array;

public class MinJumps {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(findMinJumps(arr));
    }

    public static int findMinJumps(int[] arr) {

        int totalJumps = 0;
        int coverage = 0;
        int lastIndexJump = 0;

        //base case
        if(arr.length == 1) return 0;

        for (int i = 0; i < arr.length; i++){
            //find the window
            coverage = Math.max(coverage, i + arr[i]);

            //if we can't move
            if (i == coverage) return -1;

            //update jump count
            if (i == lastIndexJump){
                lastIndexJump = coverage;
                totalJumps++;
            }
        }
        return totalJumps;
    }
}

package com.lovebabbar.dsa.array;

public class SmallestSubWithSum {

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int target = 51;
        int smallestSubWithSum = smallestSubWithSum(arr, target);
        System.out.println("Smallest Sub With Sum: " + smallestSubWithSum);
    }

    public static int smallestSubWithSum(int[] arr, int target) {
        int sum = 0;
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
           while (sum > target){
               minLength = Math.min(minLength, i - left + 1);
               sum -= arr[left];
               left++;
           }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}

package com.lovebabbar.dsa.array;

public class FindMaxMin {

    public static void main(String[] args) {
        int arr[] = {8, -3, 21, -4, 10};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println(max + " " + min);

    }
    
}

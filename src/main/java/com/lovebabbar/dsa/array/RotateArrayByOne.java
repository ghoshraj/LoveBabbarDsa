package com.lovebabbar.dsa.array;

public class RotateArrayByOne {

    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{1, 2, 3, 4, 5};
        int k = arr[arr.length - 1];
        for(int i = arr.length - 2; i >= 0; i--){
            arr[i + 1] = arr[i];
        }
        arr[0] = k;
        for (int temp : arr){
            System.out.println(temp);
        }
    }
}

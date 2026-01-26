package com.lovebabbar.dsa.array;

public class ReverseThearray {

    public static void main(String[] args) {

        //using 2pointer
        int[] arr = {8, 3, 21, -4, 10};
        int i = 0;
        int j  = arr.length - 1;

        while(i < j){
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            i++;
            j--;
        }

        //print the array
        for (int temp : arr){
            System.out.println(temp);
        }
    }
}

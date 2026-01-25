package com.lovebabbar.dsa.array;

public class ReverseThearray {

    public static void main(String[] args) {
        
        int arr[] = {8, 3, 21, -4, 10};
        int finalarr[] = new int[arr.length];
        int j = 0;

        for(int i = arr.length - 1; i >= 0; i--){
           finalarr[j] = arr[i];
           j++;
        }

        for(int temp : finalarr){
            System.out.println(temp);
        }
    }
    
}

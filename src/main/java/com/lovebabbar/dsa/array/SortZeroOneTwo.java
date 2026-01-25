package com.lovebabbar.dsa.array;

public class SortZeroOneTwo {

    public static void main(String[] args) {
        int arr[] = {0, 0, 2, 1, 1, 0, 2, 1, 2};
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
            j++;
            }
             if(arr[i] == 1){
            k++;
            }
             if(arr[i] == 2){
            l++;
            }
               
        }

        for(int i = 0; i < j; i++){
            arr[m] = 0;
            m++;
        }

        for(int i = 0; i < k; i++){
            arr[m] = 1;
            m++;
        }

        for(int i = 0; i < l; i++){
            arr[m] = 2;
            m++;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
}

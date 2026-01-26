package com.lovebabbar.dsa.array;

public class SortZeroOneTwo {

    public static void main(String[] args) {
        int[] arr = {0, 0, 2, 1, 1, 0, 2, 1, 2};
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;

        //take the count of each element
        for (int value : arr) {
            if (value == 0) {
                j++;
            }
            if (value == 1) {
                k++;
            }
            if (value == 2) {
                l++;
            }

        }

        //put all the 0 first
        for (int i = 0; i < j; i++) {
            arr[m] = 0;
            m++;
        }

        //put all the 1
        for (int i = 0; i < k; i++) {
            arr[m] = 1;
            m++;
        }

        //put all the 2
        for (int i = 0; i < l; i++) {
            arr[m] = 2;
            m++;
        }

        //print the array
        for (int value : arr) {
            System.out.println(value);
        }
    }

}

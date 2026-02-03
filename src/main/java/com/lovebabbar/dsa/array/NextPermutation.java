package com.lovebabbar.dsa.array;

public class NextPermutation {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int index = -1;

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                index = i - 1;
                break;
            }
        }

        if (index == -1) {
            reverseArray(arr, 0, arr.length - 1);
        } else {
            for (int i = arr.length - 1; i > index; i--) {
                if (arr[i] > arr[index]) {
                    int temp = arr[index];
                    arr[index] = arr[i];
                    arr[i] = temp;
                }
            }
            reverseArray(arr, index + 1, arr.length - 1);
        }

        for (int temp : arr) {
            System.out.println(temp);
        }
    }

    public static void reverseArray(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

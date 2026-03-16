package com.lovebabbar.dsa.array;

public class InversionCount {

    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 3, 5};
        int count = mergesort(arr, 0, arr.length - 1);
        System.out.println("Inversion Count: " + count);
    }

    public static int mergesort(int[] arr, int start, int end) {

        if (start >= end)
            return 0;
        int mid = start + (end - start) / 2;
        int leftCount = mergesort(arr, start, mid);
        int rightCount = mergesort(arr, mid + 1, end);
        int mergeCount = merge(arr, start, mid, end);
        return leftCount + rightCount + mergeCount;
    }

    public static int merge(int[] arr, int start, int mid, int end) {

        int[] temp = new int[end - start + 1];
        int left = start;
        int right = mid + 1;
        int index = 0;

        int count = 0;

        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) {
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[right++];
                count += (mid - left + 1);
            }
        }

        while (left <= mid) {
            temp[index++] = arr[left++];
        }
        while (right <= end) {
            temp[index++] = arr[right++];
        }
        System.arraycopy(temp, 0, arr, start, temp.length);
        return count;
    }
}
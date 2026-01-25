package com.lovebabbar.dsa.array;

public class MoveNegativeElements {
    public static void main(String[] args) {

        int[] arr = { -1, 3, -5, 6, -2, 4, 0 };
        int left = 0;
        int right = arr.length - 1;
      while (left < right) {
          
        while (left < right && arr[left] >= 0) {
            left++;
        }

        while (left < right && arr[right] < 0) {
            right--;
        }

        if (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
      }

      for(int temp : arr){
        System.out.println(temp);
      }
        
    }
    
}

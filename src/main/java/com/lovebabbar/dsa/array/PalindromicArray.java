package com.lovebabbar.dsa.array;

public class PalindromicArray {

    public static void main(String[] args) {
        int[] arr = {111, 222, 333, 444, 555};
        boolean isPalindromic = isPalindromicArray(arr);
        System.out.println("Is Palindromic: " + isPalindromic);
    }

    public static boolean isPalindromicArray(int[] arr) {

        for (int temp : arr) {
            if (temp < 0) return false;
            if (!isPalindromic(temp)) return false;
        }
        return true;
    }

    public static boolean isPalindromic(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }
}

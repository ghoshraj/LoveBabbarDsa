package com.lovebabbar.dsa.string;

public class PalindromeString {

    public static void main(String[] args) {
        String s = "abba";
        System.out.println("Is Palindrome: " + isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        // code here
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}

package com.lovebabbar.dsa.string;

public class LongestPalindrome {

    public static void main(String[] args) {
        String s = "forgeeksskeegfor";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            String oddLength = expand(s, i, i);
            String evenLength = expand(s, i, i + 1);

            if (oddLength.length() > longest.length())
                longest = oddLength;
            if (evenLength.length() > longest.length())
                longest = evenLength;
        }
        return longest;
    }

    public static String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}

package com.lovebabbar.dsa.string;

public class Subsequence {

    public static void main(String[] args) {
        String s = "ab";
        printSubsequence(s, "", 0);
    }

    public static void printSubsequence(String s, String ans, int index) {
        if (index == s.length()) {
            System.out.println(ans);
            return;
        }
        printSubsequence(s, ans + s.charAt(index), index + 1);
        printSubsequence(s, ans, index + 1);
    }
}

package com.lovebabbar.dsa.string;

public class InterleavingString {
    public static void main(String[] args) {
        String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
        System.out.println(isInterleave(s1, s2, s3));

    }

    public static boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length())
            return false;

        return solve(s1, s2, s3, 0, 0, 0);
    }

    private static boolean solve(String s1, String s2, String s3, int i, int j, int k) {
        if (k == s3.length()) return true;
        boolean takeS1 = false;
        boolean takeS2 = false;

        // try taking from s1
        if (i < s1.length() && s1.charAt(i) == s3.charAt(k)) {
            takeS1 = solve(s1, s2, s3, i + 1, j, k + 1);
        }

        // try taking from s2
        if (j < s2.length() && s2.charAt(j) == s3.charAt(k)) {
            takeS2 = solve(s1, s2, s3, i, j + 1, k + 1);
        }

        return takeS1 || takeS2;
    }
}

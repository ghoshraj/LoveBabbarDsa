package com.lovebabbar.dsa.string;

public class EditDistance {

    public static void main(String[] args) {
        String s1 = "geek";
        String s2 = "gesek";
        System.out.println(editDistance(s1, s2));
    }

    public static int editDistance(String s1, String s2) {
        int[][] dp = new int[s1.length()][s2.length()];

        for (int i = 0; i < s1.length(); i++){
            for (int j = 0; j < s2.length(); j++){
                dp[i][j] = -1;
            }
        }
        return editRecursiveDistance(s1, s2, 0, 0, dp);
    }

    public static int editRecursiveDistance(String s1, String s2, int i, int j, int[][] dp) {
        if (i == s1.length()) return s2.length() - j;
        if (j == s2.length()) return s1.length() - i;

        if (dp[i][j] != -1) return dp[i][j];

        if (s1.charAt(i) == s2.charAt(j))
            return dp[i][j] = editRecursiveDistance(s1, s2, i + 1, j + 1,dp);
        // Insert
        int insert = editRecursiveDistance(s1, s2, i, j + 1, dp);
        // Delete
        int delete = editRecursiveDistance(s1, s2, i + 1, j, dp);
        // Replace
        int replace = editRecursiveDistance(s1, s2, i + 1, j + 1, dp);
        // Take minimum
        return dp[i][j] = 1 + Math.min(insert, Math.min(delete, replace));
    }
}

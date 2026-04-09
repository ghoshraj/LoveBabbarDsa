package com.lovebabbar.dsa.string;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(words));
    }

    public static String longestCommonPrefix(String[] words) {
        if (words == null || words.length == 0) return "";
        String word = words[0];
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            for (int j = 1; j < words.length; j++) {
                if (i >= words[j].length() || ch != words[j].charAt(i))
                    return word.substring(0, i);
            }
        }
        return word;
    }
}

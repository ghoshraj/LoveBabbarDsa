package com.lovebabbar.dsa.string;

import java.util.ArrayList;
import java.util.HashSet;

public class FindPermutation {

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(findPermutation(s));
    }

    public static ArrayList<String> findPermutation(String s) {
        ArrayList<String> result = new ArrayList<>();

        helper("", s, result);

        return result;
    }

    public static void helper(String ans, String remaining, ArrayList<String> result) {
        if (remaining.length() == 0) {
            result.add(ans);
            return;
        }

        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < remaining.length(); i++) {
            char ch = remaining.charAt(i);
            if (set.contains(ch)) continue;
            set.add(ch);
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            helper(ans + ch, newRemaining, result);
        }
    }
}

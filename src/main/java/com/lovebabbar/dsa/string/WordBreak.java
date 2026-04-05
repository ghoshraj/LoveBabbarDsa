package com.lovebabbar.dsa.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordBreak {
    public static void main(String[] args) {
        String s = "ilike";
        String[] dictionary = {"i", "like", "gfg"};
        System.out.println(wordBreak(s, dictionary));
    }

    public static boolean wordBreak(String s, String[] dictionary) {
        // code here
        Set<String> stringSet = new HashSet<>(Arrays.asList(dictionary));
        return helper(s, stringSet);
    }
    public static boolean helper(String s, Set<String>stringSet){
        if (s.isEmpty()) return true;

        for (int i = 1; i <= s.length(); i++){
            String prefix = s.substring(0, i);
            if (stringSet.contains(prefix) && helper(s.substring(i),stringSet))
                return true;
        }
        return false;
    }
}

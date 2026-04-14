package com.lovebabbar.dsa.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SmallestDistinctWindow {

    public static void main(String[] args) {
        String str = "aabcbcdbca";
        System.out.println(findSubString(str));

    }

    public static int findSubString(String str) {
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            characters.add(str.charAt(i));
        }
        int required = characters.size();
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int count = 0;
        Map<Character, Integer> characterCount = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            characterCount.put(current, characterCount.getOrDefault(current, 0) + 1);
            if (characterCount.get(current) == 1) {
                count++;
            }

            while (count == required) {
                minLength = Math.min(minLength, i - left + 1);
                char startChar = str.charAt(left);
                characterCount.put(startChar, characterCount.get(startChar) - 1);
                if (characterCount.get(startChar) == 0) {
                    count--;
                }
                left++;
            }
        }
        return minLength;
    }
}


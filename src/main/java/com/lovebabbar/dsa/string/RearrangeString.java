package com.lovebabbar.dsa.string;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class RearrangeString {

    public static void main(String[] args) {
        String str = "aabbcc";
        System.out.println(findSubString(str));
    }

    public static String findSubString(String str) {
        Map<Character, Integer> characterCount = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            characterCount.put(str.charAt(i), characterCount.getOrDefault(str.charAt(i), 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        pq.addAll(characterCount.entrySet());

        StringBuilder result = new StringBuilder();
        Map.Entry<Character, Integer> prev = null;

        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> current = pq.poll();
            result.append(current.getKey());
            current.setValue(current.getValue() - 1);
            if (prev != null && prev.getValue() > 0) {
                pq.add(prev);
            }
            prev = current;
        }
        if (result.length() != str.length()) {
            return "";
        }

        return result.toString();
    }
}

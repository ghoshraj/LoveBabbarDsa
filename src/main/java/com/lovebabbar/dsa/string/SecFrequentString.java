package com.lovebabbar.dsa.string;

import java.util.HashMap;
import java.util.Map;

public class SecFrequentString {
    public static void main(String[] args) {
        String[] arr = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
        System.out.println(secFrequentString(arr));
    }

    public static String secFrequentString(String[] arr) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        return map.entrySet().stream().sorted((a, b) -> b.getValue() - a.getValue()).skip(1).findFirst().get().getKey();
    }
}

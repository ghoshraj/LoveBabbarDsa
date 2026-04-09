package com.lovebabbar.dsa.string;

import java.util.HashMap;
import java.util.Map;

public class RomanToDecimal {

    public static void main(String[] args) {
        String s = "IX";
        System.out.println(romanToDecimal(s));
    }

    public static int romanToDecimal(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));
            if (i < s.length() - 1 && current < map.get(s.charAt(i + 1)))
                sum -= current;
            else
                sum += current;
        }
        return sum;
    }
}

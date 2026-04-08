package com.lovebabbar.dsa.string;

import java.util.Stack;

public class CountMinReversals {
    public static void main(String[] args) {
        String s = "}{{}}{{{";
        System.out.println(countMinReversals(s));
    }

    public static int countMinReversals(String s) {
        if (s.length() % 2 != 0) return -1;
        Stack<Character> characters = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '{') {
                characters.push(ch);
            } else {
                if (!characters.isEmpty() && characters.peek() == '{')
                    characters.pop();
                else characters.push(ch);
            }
        }
        int m = characters.size();
        int open = 0;

        while (!characters.isEmpty() && characters.peek() == '{') {
            characters.pop();
            open++;
        }

        int close = m - open;

        return (open + 1) / 2 + (close + 1) / 2;
    }
}

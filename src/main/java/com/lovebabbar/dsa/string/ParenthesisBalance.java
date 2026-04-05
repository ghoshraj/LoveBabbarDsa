package com.lovebabbar.dsa.string;

import java.util.Stack;

public class ParenthesisBalance {
    public static void main(String[] args) {
        String str = "[{()}]";
        System.out.println(isBalanced(str));
    }

    public static boolean isBalanced(String s) {
        // code here
        Stack<Character> characters = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                characters.push(ch);
            } else {
                if (characters.isEmpty()) return false;
                char top = characters.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '['))
                    return false;
            }
        }
        return characters.isEmpty();
    }
}

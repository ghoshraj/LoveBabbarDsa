package com.lovebabbar.dsa.string;

public class MinFlips {

    public static void main(String[] args) {
        String s = "001";
        System.out.println(minFlips(s));
    }

    public static int minFlips(String s) {
        int flips1 = 0;
        int flips2 = 0;
        for (int i = 0; i < s.length(); i++) {
            char expected1 = (i % 2 == 0) ? '0' : '1';
            char expected2 = (i % 2 == 0) ? '1' : '0';

            if (s.charAt(i) != expected1) flips1++;
            if (s.charAt(i) != expected2) flips2++;
        }
        return Math.min(flips1, flips2);
    }
}

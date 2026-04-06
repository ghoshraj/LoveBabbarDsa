package com.lovebabbar.dsa.string;

import java.util.ArrayList;

public class SearchPattern {
    public static void main(String[] args) {

        String txt = "abcab";
        String pat = "ab";
        System.out.println(search(pat, txt));

    }

    public static ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i <= txt.length() - pat.length(); i++) {
            if (txt.substring(i, i + pat.length()).equals(pat))
                integers.add(i);
        }
        return integers;
    }
}

package com.lovebabbar.dsa.string;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateCharacter {

    public static void main(String[] args) {

        String str = "programming";
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for (char ch : str.toCharArray()){
            if (seen.contains(ch)) {
                duplicates.add(ch);
            } else {
                seen.add(ch);
            }
        }
        System.out.println(duplicates);
    }
}

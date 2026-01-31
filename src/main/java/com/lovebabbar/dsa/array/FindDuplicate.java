package com.lovebabbar.dsa.array;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

    public static void main(String[] args) {

        int [] arr = {3, 3, 3, 3, 3};
        Set<Integer>integerSet = new HashSet<>();

        for (int j : arr) {
            if (integerSet.contains(j)) {
                System.out.println(j);
                break;
            } else {
                integerSet.add(j);
            }
        }
    }
}

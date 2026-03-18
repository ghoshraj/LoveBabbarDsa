package com.lovebabbar.dsa.array;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArray {

    public static void main(String[] args) {
        int[] arr = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        int[] result = new int[arr.length];
        int i = 0, j = 0, store = 0;

        for (int temp : arr) {
            if (temp >= 0) positive.add(temp);
            else negative.add(temp);
        }

        while (i < positive.size() && j < negative.size()) {
            result[store++] = positive.get(i++);
            result[store++] = negative.get(j++);
        }

        while (i < positive.size()) {
            result[store++] = positive.get(i++);
        }
        while (j < negative.size()) {
            result[store++] = negative.get(j++);
        }

        for (int temp : result) {
            System.out.println(temp);
        }
    }
}

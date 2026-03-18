package com.lovebabbar.dsa.array;

import java.util.ArrayList;

public class Factorials {

    public static void main(String[] args) {
        int n = 5;

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        for (int i = 2; i <= n; i++) {
            multiply(integers, i);
        }
        System.out.println(integers);
    }

    static void multiply(ArrayList<Integer> result, int num) {
        int carry = 0;

        for (int i = result.size() - 1; i >= 0; i--) {
            int product = result.get(i) * num + carry;
            result.set(i, product % 10);
            carry = product / 10;
        }

        while (carry > 0) {
            result.add(0, carry % 10);
            carry = carry / 10;
        }
    }
}

package com.lovebabbar.dsa.string;

public class MinimumNumberOfSwapsBracket {
    public static void main(String[] args) {
        String s = "[]][][]][[";
        System.out.println(minimumNumberOfSwaps(s));
    }

    public static int minimumNumberOfSwaps(String s) {
        int countLeft = 0, countRight = 0, imbalance = 0, swap = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '[') {
                countLeft++;
                if (imbalance > 0) {
                    swap += imbalance;
                    imbalance--;
                }
            } else {
                countRight++;
                imbalance = countRight - countLeft;
            }
        }
        return swap;
    }
}

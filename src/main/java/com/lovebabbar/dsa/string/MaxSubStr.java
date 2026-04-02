package com.lovebabbar.dsa.string;

public class MaxSubStr {

    public static void main(String[] args) {

        String str = "0100110101";
        System.out.println(maxSubStr(str));
    }

    public static int maxSubStr(String str) {
        // Write your code here
        int zeroCount = 0, oneCount = 0, count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') zeroCount++;
            else oneCount++;

            if (zeroCount == oneCount)
                count++;
        }
        return count;
    }
}

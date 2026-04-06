package com.lovebabbar.dsa.string;

public class LongestPrefixSuffix {
    public static void main(String[] args) {
        String str = "abab";
        System.out.println(getLPSLength(str));
    }

    public static int getLPSLength(String s) {
        int n = s.length();
        for (int i = n - 1; i > 0; i--){
            boolean match = true;
            for (int j = 0; j < i; j++){
                if (s.charAt(j) != s.charAt(n - i + j)){
                    match = false;
                    break;
                }
            }
            if (match)
                return i;
        }
        return 0;
    }
}

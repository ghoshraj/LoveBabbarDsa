package com.lovebabbar.dsa.string;

import java.util.ArrayList;

public class GenerateIPAddresses {

    public static void main(String[] args) {
        String s = "255678166";
        ArrayList<String> result = generateIp(s);
        for (String ip : result) {
            System.out.println(ip);
        }
    }

    public static ArrayList<String> generateIp(String s) {
        ArrayList<String> result = new ArrayList<>();

        int n = s.length();
        if (n < 4 || n > 12) return result;

        for (int i = 1; i <= 3 && i < n; i++) {
            for (int j = i + 1; j <= i + 3 && j < n; j++) {
                for (int k = j + 1; k <= j + 3 && k < n; k++) {
                    String s1 = s.substring(0, i);
                    String s2 = s.substring(i, j);
                    String s3 = s.substring(j, k);
                    String s4 = s.substring(k);
                    if (isValid(s1) && isValid(s2) && isValid(s3) && isValid(s4))
                        result.add(s1 + "." + s2 + "." + s3 + "." + s4);
                }
            }

        }
        return result;
    }

    public static boolean isValid(String s) {
        if (s.length() > 3 || s.length() == 0) return false;
        if (s.length() > 1 && s.charAt(0) == '0') return false;
        int num = Integer.parseInt(s);
        return num >= 0 && num <= 255;
    }
}

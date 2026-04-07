package com.lovebabbar.dsa.string;

import java.util.HashMap;
import java.util.Map;

public class PrintSequenceNumber {
    public static void main(String[] args) {
        String s = "HEY U";
        System.out.println(printSequence(s));
    }

    public static String printSequence(String S) {
        // code here
        Map<Character, String> map = new HashMap<>();

        map.put('A', "2");
        map.put('B', "22");
        map.put('C', "222");

        map.put('D', "3");
        map.put('E', "33");
        map.put('F', "333");

        map.put('G', "4");
        map.put('H', "44");
        map.put('I', "444");

        map.put('J', "5");
        map.put('K', "55");
        map.put('L', "555");

        map.put('M', "6");
        map.put('N', "66");
        map.put('O', "666");

        map.put('P', "7");
        map.put('Q', "77");
        map.put('R', "777");
        map.put('S', "7777"); // ⚠️ extra

        map.put('T', "8");
        map.put('U', "88");
        map.put('V', "888");

        map.put('W', "9");
        map.put('X', "99");
        map.put('Y', "999");
        map.put('Z', "9999");

        map.put(' ', "0");
        String ans = "";
        for (int i = 0; i < S.length(); i++){
          String str = map.get(S.charAt(i));
          ans += str;
        }
        return ans;
    }
}

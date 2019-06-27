package com.stackroute.junit;

import java.util.Scanner;

public class StrInt {
    public static String Repeat(String str, int n) {
        int len = str.length();
        String s=str;
        int j = len - n;
        for (int k = 0; k < n; k++) {

            for (int i = j; i < len; i++) {
                s=s+str.charAt(i);

            }
        }
        return s;
    }
}



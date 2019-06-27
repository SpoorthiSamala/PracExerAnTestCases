package com.stackroute.junit;

import java.util.Scanner;

public class Reverse {
    public static String RevString(String str)
    {
        String s="";
        int len=str.length();
        for(int i=len-1;i>=0;i--)
        {
            s=s+str.charAt(i);
        }
        return s;
    }

}

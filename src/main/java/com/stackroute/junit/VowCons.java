package com.stackroute.junit;

import java.util.Scanner;

public class VowCons {
    public static String Check(String str)
    {
        int i;
        String s="";
        int len=str.length();
        for(i=0;i<len;i++)
        {
            char c= str.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                s=s+"Vowel"+" ";
            }
            else
            {
                s=s+"Consonant"+" ";
            }
        }
        return s;
    }
}

package com.stackroute.junit;

import java.util.Scanner;

public class Loop {
    public static String Repeatative(int n)
    {
        String s="";
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                s=s+i;
            }

        }
        return s;
    }

}

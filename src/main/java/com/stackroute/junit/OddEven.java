package com.stackroute.junit;

import java.util.Scanner;

public class OddEven {
    public static String  oddeven(int n)
    {
        if(n>20 & n<30){
            if(n%2!=0)
                return "Tom";
            else
                return "Jerry";
        }
        return "Incorrect Input";

    }


    }


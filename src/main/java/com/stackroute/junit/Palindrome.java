package com.stackroute.junit;

import java.util.Scanner;

public class Palindrome {
    public static String Palin(int n){
        int temp, r, sum, add;
        String s="";
        sum = 0;
        add = 0;
        temp = n;
        while (n != 0)
        {
            r = n % 10;
            sum = sum * 10 + r;
            n = n / 10;
            if (r % 2 == 0)
            {
                add = add + r;
            }
        }
        if (sum == temp)
        {

            if (add > 25)
            {
                s=temp+ " is palindrome and the sum of even numbers is greater than 25";
            }
            else
                {

                s=temp + " is a palindrome and the sum of even numbers is less than 25";
            }

        }
        else {
            s=temp+" is not a palindrome";
        }
        return s;
    }

}

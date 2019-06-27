package com.stackroute.junit;

import java.util.Scanner;

public class GuessNumber {
    public static String Checking(int n) {
        String s="";
        int target = 45;
        if (n > 1 & n < 50) {
            if (n == target) {
                s="Number guessed matches the original number";
            }
            if (n > target) {
                s="Number guessed is more than the original number";
            }
            if (n < target) {
                s="Number guessed is less than the original number";
            }
        }
        else {
            s = "Number not in range";
        }
        return s;
    }
}

package com.stackroute.junit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome pal;
    @Before
    public void setUp(){
        pal=new Palindrome();
    }
    @Test
    public void checkWhetherItIsPalindrome(){
        String result=pal.Palin(6789876);
        assertEquals("6789876 is palindrome and the sum of even numbers is greater than 25",result);
    }
    @Test
    public void checkWhetherItIsNotPalindrome(){
        String result=pal.Palin(1234);
        assertEquals("1234 is not a palindrome",result);
    }
    @Test
    public void checkWhetherItIsNotPalindrome1(){
        String result=pal.Palin(1234321);
        assertEquals("1234321 is a palindrome and the sum of even numbers is less than 25",result);
    }


}
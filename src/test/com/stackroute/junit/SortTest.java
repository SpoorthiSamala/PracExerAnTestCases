package com.stackroute.junit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {
    Sort so;
    @Before
    public void setUp(){
        so=new Sort();

    }
    @Test
    public void sortAndDisplayTheSumOfEvenNumbers(){
        String result=so.Sorting(new int[]{10,20,30,40});
        assertEquals("sum of the number is 100",result);
    }
    @Test
    public void sortAndDisplayTheSumOfEvenNumbers1(){
        String result=so.Sorting(new int[]{1,2,3,4});
        assertEquals("sum of the number is 6",result);
    }

}
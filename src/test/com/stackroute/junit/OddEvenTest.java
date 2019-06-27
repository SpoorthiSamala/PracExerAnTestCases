package com.stackroute.junit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenTest {
    OddEven oe;
    @Before
    public void setUp(){
        oe=new OddEven();
    }
    @Test
    public void checkWhetherItIsOdd(){
        String result=oe.oddeven(23);
        assertEquals("Tom",result);
    }
    @Test
    public void checkWhetherItIsEven(){
        String result=oe.oddeven(26);
        assertEquals("Jerry",result);
    }
    @Test
    public void checkWhetherInputIsCorrect(){
        String result=oe.oddeven(36);
        assertEquals("Incorrect Input",result);
    }

}
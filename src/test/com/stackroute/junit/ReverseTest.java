package com.stackroute.junit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {
    Reverse rev;
    @Before
    public void setUp(){
        rev=new Reverse();
    }
    @Test
    public void checkReverseOfAString()
    {
        String result=rev.RevString("Spoorthi");
        assertEquals("ihtroopS",result);
    }
    @Test
    public void checkReverseOfAString1()
    {
        String result=rev.RevString("Ball");
        assertEquals("llaB",result);
    }
}
package com.stackroute.junit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoopTest {
    Loop lp;
    @Before
    public void setUp(){
        lp=new Loop();
    }
    @Test
    public void givenOneIntegerReturnsAPattern()
    {
        String result=lp.Repeatative(3);
        assertEquals("122333",result);
    }
    @Test
    public void givenOneIntegerReturnsAPatterns()
    {
        String result=lp.Repeatative(5);
        assertEquals("122333444455555",result);
    }

}
package com.stackroute.junit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StrIntTest {
    StrInt si;
    @Before
    public void setUp(){
        si=new StrInt();
    }
    @Test
    public void givenOneStringAndOneIntegerReturnsString(){
        String result=si.Repeat("Stack",3);
        assertEquals("Stackackackack",result);
    }
    @Test
    public void givenOneStringAndOneIntegerReturnString(){
        String result=si.Repeat("Route",2);
        assertEquals("Routetete",result);
    }

}
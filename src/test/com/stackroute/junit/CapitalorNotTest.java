package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CapitalorNotTest {
    CapitalorNot cn;
    @Before
    public void setUp(){
        cn=new CapitalorNot();

    }
    @Test
    public void checkingCapitalLetter()
    {
        String result=cn.CharacterChecking('A');
        assertEquals("Capital Letter",result);
    }
    @Test
    public void checkingSmallcase()
    {
        String result=cn.CharacterChecking('a');
        assertEquals("Smallcase Letter",result);
    }
    @Test
    public void checkingDigit()
    {
        String result=cn.CharacterChecking('1');
        assertEquals("Digit",result);
    }
    @After
    public void tearDown()
    {
        cn=null;
    }


}
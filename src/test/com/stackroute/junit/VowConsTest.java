package com.stackroute.junit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowConsTest {
    VowCons vc;
    @Before
    public void setUp()
    {
        vc=new VowCons();
    }
    @Test
    public void checkWhetherItIsAVowel()
    {
        String result=vc.Check("a");
        assertEquals("Vowel",result);
    }

    @Test
    public void checkWhetherItIsAConsonant()
    {
        String result=vc.Check("b");
        assertEquals("Consonant",result);
    }
    @Test
    public void checkWhetherItIsAConsonantAndVowel()
    {
        String result=vc.Check("ap");
        assertEquals("Vowel Consonant ",result);
    }


}
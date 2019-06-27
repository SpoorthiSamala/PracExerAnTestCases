package com.stackroute.junit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumberTest {
    GuessNumber gn;
    @Before
    public void setUp(){
        gn=new GuessNumber();

    }
    @Test
    public void checkingGuessMatchesTheOriginalNumber()
    {
        String result=gn.Checking(45);
        assertEquals("Number guessed matches the original number",result);
    }
    @Test
    public void checkingGreaterThanTheOriginalNumber()
    {
        String result=gn.Checking(47);
        assertEquals("Number guessed is more than the original number",result);
    }
    @Test
    public void checkingSmallerThanTheOriginalNumber()
    {
        String result=gn.Checking(40);
        assertEquals("Number guessed is less than the original number",result);
    }
    @Test
    public void checkingNumberErrorMessage()
    {
        String result=gn.Checking(52);
        assertEquals("Number not in range",result);
    }
}
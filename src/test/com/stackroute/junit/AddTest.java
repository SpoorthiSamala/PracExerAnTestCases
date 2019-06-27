package com.stackroute.junit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTest {
    Add add;
    @Before
    public void setUp(){
        add=new Add();
    }
    @Test
    public void addingOfNumbers()
    {
        int sum=add.Adding(new int[]{10,20,30,40});
        assertEquals(100,sum);
    }
    @Test
    public void addingOfNumbers1()
    {
        int sum=add.Adding(new int[]{11,20,30,40});
        assertEquals(101,sum);
    }
}
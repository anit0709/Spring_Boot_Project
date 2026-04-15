package org.practice;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.rmi.UnexpectedException;
import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    Calc c=new Calc();


    @Test
    void sum() {
        int actual=c.sum(3, 4);
        int expected=7;
        assertEquals(expected, actual);
    }

    @BeforeEach
    public void beforecall()
    {
        System.out.println("Before Called");
    }

    @AfterEach
    public void aftercall()
    {
        System.out.println("after Called");
    }

    @Test
    public void arraycheck()
    {
        int[] num={2,5,8,3};
        int[] number={2,3,5,8};
        Arrays.sort(num);
        assertArrayEquals(number, num);
    }

    @Test()
    public void nullcheck() {
        int[] num = null;
        assertThrows(NullPointerException.class, ()->
                Arrays.sort(num));

    }

    @Test
        public void performance()
        {
            assertTimeout(Duration.ofMillis(100), ()-> {
            int expected=0;
            for(int i=0;i<1000000000; i++) {
                expected = expected + i;
            }});

        }

    @Test
    void removeAstringFromStart()
    {
        String actual=c.removeAstringFromStart("AACD");
        String expected="CD";
        assertEquals(expected, actual);
    }

    @Test
    void isfirstAndLastequals()
    {
        boolean actual=c.isfirstAndLastequals("ABCDAB");
        boolean expected=false;
        assertTrue(actual);
    }

    @Test
    void isfirstAndLastequals1()
    {
        boolean actual=c.isfirstAndLastequals("ABCDA");
        boolean expected=false;
        assertFalse(actual);
    }
}
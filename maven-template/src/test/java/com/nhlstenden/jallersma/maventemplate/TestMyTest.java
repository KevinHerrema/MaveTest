package com.nhlstenden.jallersma.maventemplate;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMyTest {
   @Test
    public void testmath() {
        MyMathMock math = new MyMathMock();
        int result = math.power();
        int result2 = math.power();
        int result3 = result * result2; 
        assertEquals(16, result3);
    }

}


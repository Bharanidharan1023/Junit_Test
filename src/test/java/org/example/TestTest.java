package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {

    Service t = new Service();



    // assertEquals Method

    @Test
    public void getPositive(){
         String result = t.test(5);

         assertEquals("YES", result);
    }

    @Test
    public void getNegative(){
      //  Service t = new Service();
        String result = t.test(-5);

        assertEquals("NO", result);
    }

    @Test
    public void getZero(){
       // Service t = new Service();
        String result = t.test(0);

        assertEquals("YES", result);
    }

    // assertFalse method



}
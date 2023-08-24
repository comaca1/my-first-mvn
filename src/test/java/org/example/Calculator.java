package org.example;

import junit.framework.TestCase;

public class Calculator extends TestCase {

    public void testAddTure() throws Exception {
        Calculator calc = new Calculator();
        int actualValue = calc.add(5, 10);
        int exprctedValue =15;

        assertTrue(actualValue == exprctedValue);
        }

    private int add(int a, int b) {
        return a;
    }

    public void testAddFlase() throws Exception {
        Calculator calc = new Calculator();
        int actualValue = calc.add(5, 10);
        int exprctedValue =24;

        assertTrue(actualValue!=exprctedValue);
    }
    public void testAddException() throws Exception {
        Calculator calc = new Calculator();
        try{
            int result  = calc.add(15,20);
            assertTrue(false);
        } catch(Exception ex) {
            assertTrue(true);
        }
    }

}
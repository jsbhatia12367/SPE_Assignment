package com.calculator;

import org.junit.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int a = 15;
        int b = 20;
        int expectedResult = 35;
        long result = calculator.add(a, b);
        Assert.assertEquals(expectedResult, result);;
    }
}

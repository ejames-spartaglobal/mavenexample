package com.spartaglobal.mavenexample;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void TestAddition(){
        Assert.assertEquals(4,calculator.add(2,2));
    }

    @Test
    public void TestSubtract(){
        Assert.assertEquals(6, calculator.subtract(12,6));
    }

    @Test
    public void TestMultiply(){
        Assert.assertEquals(4,calculator.multiply(2,2));
    }

    @Test
    public void TestDivision(){
        Assert.assertEquals(2,calculator.divide(4,2));
    }

}

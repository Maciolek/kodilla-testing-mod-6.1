package com.kodilla.patterns2.aop.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(CalculatorTestSuite.class);
    @Autowired
    private Calculator calculator;

    @Test
    public void testAdd() {
        //Given
        //When
        double result = calculator.add(10, 15);
        //Then
        LOGGER.info("Testing add method");
        assertEquals(25, result, 0);
    }

    @Test
    public void testSub() {
        //Given
        //When
        double result = calculator.sub(10, 15);
        //Then
        LOGGER.info("Testing sub method");
        assertEquals(-5, result, 0);
    }

    @Test
    public void testMul() {
        //Given
        //When
        double result = calculator.mul(10, 15);
        //Then
        LOGGER.info("Testing mul method");
        assertEquals(150, result, 0);
    }

    @Test
    public void testDiv() {
        //Given
        //When
        double result = calculator.div(15, 5);
        //Then
        LOGGER.info("Testing div method");
        assertEquals(3, result, 0);
    }

    @Test
    public void testFactorial() {
        //given
        //when
        BigDecimal resultFac = calculator.factorial(new BigDecimal(1000.0));
        //then
        LOGGER.info("Testing factorial method");
        Assert.assertTrue(BigDecimal.ONE.compareTo(resultFac) < 0);
    }
}
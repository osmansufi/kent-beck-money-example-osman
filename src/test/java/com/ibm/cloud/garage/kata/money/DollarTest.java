package com.ibm.cloud.garage.kata.money;

import org.junit.Test;

import static org.junit.Assert.*;

public class DollarTest {
    @Test
    public void canary() {
        assertTrue(true);
    }

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }
}
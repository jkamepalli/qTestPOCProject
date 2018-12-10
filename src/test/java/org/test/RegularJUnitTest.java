package org.test;

import io.cucumber.skeleton.MathsMachine;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegularJUnitTest {
    @Test
    public void testAdditionThatWorks() {
        MathsMachine machine = new MathsMachine();

        machine.setCurrentTotal(0);
        machine.add(10);
        machine.subtract(23);
        machine.multiply(2);

        assertEquals(-26, machine.getCurrentTotal());
    }

    @Test
    public void testAddition2ThatWorks() {
        MathsMachine machine = new MathsMachine();

        machine.setCurrentTotal(0);
        machine.add(12);
        machine.subtract(10);
        machine.multiply(2);

        assertEquals(4, machine.getCurrentTotal());
    }

    @Test
    public void testAdditionThatFails() {
        MathsMachine machine = new MathsMachine();

        machine.setCurrentTotal(0);
        machine.add(10);
        machine.subtract(23);
        machine.multiply(2);

        assertEquals("Testing the test with a deliberate failure", -27, machine.getCurrentTotal());
    }
}

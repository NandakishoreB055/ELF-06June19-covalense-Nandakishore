package com.covalense.junit;

import static org.junit.Assert.*;
import org.junit.Test;

import com.covalense.java.junit.MathOpp;

public class mathOppTest {

	MathOpp m = new MathOpp();

	@Test
	public void testAddMethod() {
		assertEquals(30, m.add(10, 20));
	}

	@Test
	public void testDivMethod() {
		assertEquals(5.0, m.div(10, 2), 0.01);
	}

	@Test(expected = ArithmeticException.class)
	public void testDivForException() {
		m.div(10, 0);
	}
}

package com.covalense.junit;

import static org.junit.Assert.*;
import org.junit.Test;
import com.covalense.java.junit.StringOpp;

public class StringOppTest {
	StringOpp s = new StringOpp();

	@Test
	public void testCount() {
		int expected = 5;
		int actual = s.count("nanda");
		assertEquals(expected, actual);
	}

}

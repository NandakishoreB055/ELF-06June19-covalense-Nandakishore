package com.covalense.junit;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.covalense.java.junit.StringOpp;

@RunWith(Parameterized.class)
public class StringOppMultiValueTest {

	private StringOpp str = new StringOpp();
	private String name;
	private int value;

	public StringOppMultiValueTest(String name, int value) {
		this.name = name;
		this.value = value;
	}

	@Parameters
	public static Collection<Object[]> getPairs() {
		Object[][] obj = { { "apple", 5 }, { "nanda", 5 }, { "kishore", 7 } };
		return Arrays.asList(obj);
	}

	@Test
	public void testToCountCharString() {
		int res = str.count(name);
		assertEquals(value, res);
	}

}

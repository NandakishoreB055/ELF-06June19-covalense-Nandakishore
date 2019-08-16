package com.covalense.filecreationutil.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.covalense.filecreationutil.util.CreateFileUtil;

public class CreateFileUtilTest {
	CreateFileUtil util = new CreateFileUtil();

	@Test
	public void CreateFileTest() {
		boolean actual = util.createFile("nanda.txt", "Its a text file");
		boolean expected = true;
		assertEquals(expected, actual);
	}

}

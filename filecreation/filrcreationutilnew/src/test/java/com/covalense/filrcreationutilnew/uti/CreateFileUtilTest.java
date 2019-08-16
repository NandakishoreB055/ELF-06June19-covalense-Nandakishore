package com.covalense.filrcreationutilnew.uti;

import static org.junit.Assert.*;

import org.junit.Test;

import com.covalense.filrcreationutilnew.util.CreateFileUtil;

public class CreateFileUtilTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	CreateFileUtil util = new CreateFileUtil();
	
	@Test
	public void CreateFileTest() {
		boolean actual = util.createFile("nanda.txt", "Its a text file");
		boolean expected = true;
		assertEquals(expected, actual);
	}
}

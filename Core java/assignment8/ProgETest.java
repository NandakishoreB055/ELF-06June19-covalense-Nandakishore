package com.covalense.java.assignment8;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ProETest {

	static ProgE p = new ProgE();
	static ArrayList<Student> t = new ArrayList<Student>();
	static {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		s1.set("kishore", 18, 67);
		s2.set("nanda", 21, 77);
		s3.set("sindhu", 21, 87);
		s4.set("priya", 22, 96);

		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);

	}

	@Test
	void testTopper() {
		Double expecteds = 90.00;
		Double actuals = p.getTopper(t);

		Assert.assertEquals(expecteds, actuals);

	}

}
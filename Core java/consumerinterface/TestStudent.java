package com.covalense.java.consumerinterface;

import java.util.function.Consumer;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student("nanda", 22, 19, 24);
		Consumer<Student> c = s -> {
			double avg = ((s.m1 + s.m2 + s.m3) / 3);
			System.out.println(s.name + " average is " + avg);
		};
		c.accept(s1);
	}

}

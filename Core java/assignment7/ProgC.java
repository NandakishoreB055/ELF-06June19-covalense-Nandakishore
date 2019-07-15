package com.covalense.java.assignment7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class ProgC {
	private static final Logger log = Logger.getLogger("nanda");

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		s1.set("nanda", 18, 67);
		s2.set("kishore", 55, 47);
		s3.set("sindhu", 14, 97);
		s4.set("priya", 29, 34);
		ArrayList<Student> t = new ArrayList<Student>();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);

		Predicate<Student> x1 = i -> i.marks < 35;
		List<Student> x = t.stream().filter(x1).collect(Collectors.toList());
		for (Student s : x) {
			log.info("" + s);
		}
	}
}
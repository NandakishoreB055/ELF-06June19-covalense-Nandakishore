package com.covalense.java.assignment7;

import java.util.ArrayList;
import java.util.logging.Logger;

import lombok.extern.java.Log;

@Log
public class ProgJ {
	private static final Logger log = Logger.getLogger("nanda");

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		s1.set("nanda", 18, 67);
		s2.set("kishore", 21, 77);
		s3.set("sindhu", 21, 87);
		s4.set("priya", 22, 34);
		ArrayList<Student> t = new ArrayList<Student>();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		 t.stream().forEach(i->log.info(i+""));
	}
}

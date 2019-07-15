package com.covalense.java.assignment8;

import java.util.logging.Logger;

public class Student {
	private static final Logger log = Logger.getLogger("kishore");

	String name;
	double marks;
	int id;
	

	void set(String name, int id, double marks) {
		this.name = name;
		this.marks = marks;
		this.id = id;
		

	}

	@Override
	public String toString() {
		return "name= " + name + " id= " + id + " marks= " + marks;
	}

	void get() {
		log.info("name= " + name + "id= " + id + "marks= " + marks);
	}

}

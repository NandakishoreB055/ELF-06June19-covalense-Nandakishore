package com.covalense.java.assignments6;

import java.io.Serializable;

public class Employ implements Serializable {
	String name;
	int age;
	String designation;
	double salary;

	void set(String name, int age, String designation, double salary) {
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.salary = salary;

	}
}

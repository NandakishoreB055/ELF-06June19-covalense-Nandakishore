package com.covalense.java.constructors;

public class student {
	String name;
	int roll;
	double percent;

	student(String n, int r, double p) {
		name = n;
		roll = r;
		percent = p;
	}

	void display() {
		System.out.println("name is " + name);
		System.out.println("roll is " + roll);
		System.out.println("percent is " + percent);
	}
}

package com.covalense.java.constructors;

public class testemployee {

	public static void main(String[] args) {
		employee e1;
		employee e2;
		e1 = new employee("geetha", 24, 54.7);
		e2 = new employee("priya", 44, 34.7);
		e1.display();
		System.out.println("*****************");
		e2.display();
	}
}

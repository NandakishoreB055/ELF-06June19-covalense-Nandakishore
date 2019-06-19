package com.covalense.java.constructors;

public class teststudent {

	public static void main(String[] args) {
		student s1;
		student s2;
		s1 = new student("geetha", 24, 54.7);
		s2 = new student("priya", 44, 34.7);
		s1.display();
		System.out.println("*****************");
		s2.display();
	}

}

package com.covalense.java.objectclass;

public class TestA {

	public static void main(String[] args) {
		Student s = new Student("nanda", 22, 5.9);
		Student p = new Student("nanda", 22, 5.9);
		System.out.println(s.equals(p));
	}

}

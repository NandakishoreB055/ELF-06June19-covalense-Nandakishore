package com.covalense.java.singleton;

public class Test_emp {

	public static void main(String[] args) {
		Employee e = new Employee("nanda", 22, "male");
		System.out.println("name is " + e.getName());
		System.out.println("age is " + e.getAge());
		System.out.println("gender is " + e.getGender());

	}

}

package com.covalense.java.singleton;

public final class Employee {
	private final String name;
	private final int age;
	private final String gender;

	public Employee(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}
}

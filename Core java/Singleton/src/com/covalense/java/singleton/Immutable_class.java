package com.covalense.java.singleton;

public class Immutable_class {
	private final String name;
	private final int age;

	public Immutable_class(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getname() {
		return name;
	}

	public int getage() {
		return age;
	}
}

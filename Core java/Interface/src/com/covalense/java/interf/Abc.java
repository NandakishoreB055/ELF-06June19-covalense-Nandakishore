package com.covalense.java.interf;

public class Abc {

	final String str = "123";

	void eat() {
		System.out.println(str);
	}

	void xz() {
		System.out.println(str);
	}

	void ab() {
		System.out.println(str);
	}

	public static void main(String[] args) {
		Abc a = new Abc();
		a.ab();
	}
}

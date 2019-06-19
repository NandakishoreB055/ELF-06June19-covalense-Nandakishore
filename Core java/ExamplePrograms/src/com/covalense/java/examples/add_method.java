package com.covalense.java.examples;

public class add_method {
	static int theju(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		int i = theju(10, 5);
		System.out.println(" result is " + i);
	}
}

package com.covalense.java.examples;

public class large3 {

	public static void main(String[] args) {
		int a = 23;
		int b = 25;
		int c = 24;
		if (a > b && a > c) {
			System.out.println("a is greater");
		} else if (b > c) {
			System.out.println("b is greater");
		} else {
			System.out.println("c is greater");
		}
	}
}

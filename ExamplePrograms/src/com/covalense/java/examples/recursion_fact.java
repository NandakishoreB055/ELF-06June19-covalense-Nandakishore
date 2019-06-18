package com.covalense.java.examples;

public class recursion_fact {
	static int fact(int x) {
		if (x == 0) {
			return 1;
		}
		return x * fact(x - 1);
	}

	public static void main(String[] args) {
		int a = fact(6);
		System.out.println("result is" + a);
	}
}

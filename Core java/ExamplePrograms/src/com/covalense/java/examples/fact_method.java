package com.covalense.java.examples;

public class fact_method {

	static int fact(int n) {
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f = f * i;
		}
		return f;
	}

	public static void main(String[] args) {
		int a = fact(5);
		System.out.println("result is" + a);
	}
}

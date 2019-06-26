package com.covalense.java.methodreference;

public class TestAddTwoNum {
	static int sum(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		MyMath m = TestAddTwoNum::sum;
		m.add(10, 10);
	}
}

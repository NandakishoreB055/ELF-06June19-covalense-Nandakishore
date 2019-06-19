package com.covalense.java.referencecasting;

public class test_pen {
	public static void main(String[] args) {
		pen p = new marker();
		marker m = (marker) p;
		m.cost = 10;
		m.size = 7.7;
		m.color();
		m.write();
	}
}

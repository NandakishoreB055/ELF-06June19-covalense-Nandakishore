package com.covalense.java.simpleprogram;

public class testmobile {
	mobile m = new mobile();
	static int i = 5;

	void walk() {
		System.out.println("walk");
	}

	public static void main(String[] args) {
		testmobile t = new testmobile();
		t.walk();
		t.m.call();
		System.out.println(i);
	}
}

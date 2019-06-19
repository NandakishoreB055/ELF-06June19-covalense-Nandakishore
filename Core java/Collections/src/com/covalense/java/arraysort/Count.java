package com.covalense.java.arraysort;

interface Demo {
	int charcount(String a);
}

public class Count {
	public static void main(String[] args) {
		Demo d = a -> a.length();
		int i = d.charcount("nanda");
		System.out.println(i);
	}
}

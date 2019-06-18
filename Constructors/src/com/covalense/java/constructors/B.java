package com.covalense.java.constructors;

public class B {
	int i = 90;
}

class BQ extends B {
	int i = 60;

	void m() {
		int i = 30;
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
}

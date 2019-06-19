package com.covalense.java.inheritance;

public class levelthree3 extends leveltwo2 {
	void move() {
		System.out.println("move from 100 to 150");
	}

	public static void main(String[] args) {
		levelone1 l1 = new levelone1();
		leveltwo2 l2;
		l2 = new levelthree3();
		levelthree3 l3 = new levelthree3();
		l1.move();
		l2.move();
		l3.move();
	}

}
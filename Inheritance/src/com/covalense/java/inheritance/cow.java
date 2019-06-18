package com.covalense.java.inheritance;

public class cow extends animal {

	void eat() {
		System.out.println("cow eat");
	}

	public static void main(String[] args) {
		animal a = new animal();
		lion l = new lion();
		cow c = new cow();
		a.eat();
		l.eat();
		c.eat();
	}
}

package com.covalense.java.interf;

public class person implements animal, human {

	public void walk() {
		System.out.println("walk method");
	}

	public void eat() {
		System.out.println("eat method");
	}

	public static void main(String[] args) {
		person p = new person();
		animal a = new person();
		p.walk();
		p.eat();
		a.eat();
	}
}

package com.covalense.java.inheritance;

public class cow1 extends animal1 {
	void eat() {
		System.out.println("cow eats grass");
	}

	public static void main(String[] args) {
		animal1 a1;
		a1 = new cow1();
		lion1 l1 = new lion1();
		cow1 c1 = new cow1();
		a1.eat();
		l1.eat();
		c1.eat();
	}

}

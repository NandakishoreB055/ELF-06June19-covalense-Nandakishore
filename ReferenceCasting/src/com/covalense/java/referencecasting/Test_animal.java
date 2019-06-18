package com.covalense.java.referencecasting;

public class Test_animal {

	public static void main(String[] args) {
		animal a = new cow();
		a.i = 10;
		a.eat();
		cow c = (cow) a;
		c.i = 10;
		c.x = 15;
		c.eat();
		c.run();

	}

}

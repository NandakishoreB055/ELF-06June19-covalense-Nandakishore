package com.covalense.java.constructors;

public class phone {
	void iphone() {
		System.out.println("i love u");
	}

	void miphone() {
		System.out.println("thank you");
	}

	public static void main(String[] args) {
		phone a = new phone();
		girl g = new girl();
		g.recieve(a);
		a.iphone();
	}
}

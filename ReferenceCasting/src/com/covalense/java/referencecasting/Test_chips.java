package com.covalense.java.referencecasting;

public class Test_chips {

	public static void main(String[] args) {
		chips cl = new lays();
		chips cb = new bingo();
		lays l = (lays) cl;
		bingo b = (bingo) cb;
		l.open();
		l.eat();
		System.out.println("***************");
		b.open();
		b.bytebingo();
	}

}

package com.covalense.java.exceptions;

public class Test_irctc {

	public static void main(String[] args) {
		System.out.println("main method started");

		irctc i = new irctc();
		paytm p = new paytm();
		try {
			i.book();

			p.pay();
		} catch (ArithmeticException t) {
			System.out.println("exception caught at main");
		}

		System.out.println("main method ended");
	}

}

package com.covalense.java.exceptions;

public class paytm {

	void pay() throws NullPointerException {

		try {
			System.out.println(10 / 0);

		} catch (ArithmeticException n) {
			System.out.println("exception caught at paytm");
			throw n;
		} finally {
			System.out.println("paid");
		}
	}
}

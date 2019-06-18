package com.covalense.java.exceptions;

public class irctc {
	void book() throws ArithmeticException {
		System.out.println("booking started");
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException a) {
			System.out.println("exception caught at irctc");
			throw a;
		} finally {
			System.out.println("booking ended");
		}

	}
}

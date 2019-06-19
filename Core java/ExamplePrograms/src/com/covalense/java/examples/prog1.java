package com.covalense.java.examples;

public class prog1 {

	public static void main(String[] args) {
		double price = 1500;
		int count = 2;
		double discount = price * (25 / 100.0);
		if (count > 1) {
			System.out.println("payable amount" + price);
		} else {
			System.out.println("payable amount" + discount);

		}

	}

}

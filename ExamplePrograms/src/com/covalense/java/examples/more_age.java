package com.covalense.java.examples;

public class more_age {

	public static void main(String[] args) {
		int age = 70;
		double amount = 15000.5;
		double discount = amount * (15.2 / 100);
		if (age >= 60) {
			System.out.println("discount amount" + discount);

		}
		System.out.println("payable amount" + amount);
	}
}

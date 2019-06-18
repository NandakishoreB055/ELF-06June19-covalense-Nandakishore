package com.covalense.java.examples;

public class vending_machine {

	public static void main(String[] args) {
		int t = 30;
		switch (t) {
		case 10:
			System.out.println("give him lays");
			break;
		case 20:
			System.out.println("give him kurkure");
			break;
		case 30:
			System.out.println("give him dairy milk");
			break;
		default:
			System.out.println("invalid token number");
			break;
		}
	}
}
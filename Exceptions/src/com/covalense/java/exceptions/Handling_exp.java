package com.covalense.java.exceptions;

public class Handling_exp {
	public static void main(String[] args) {
		int[] a = new int[3];
		String name = null;
		System.out.println("main method started");
		try {
			System.out.println(a[4]);
			System.out.println(name);
			System.out.println(10 / 0);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("dont use out of index value");
		} catch (NullPointerException e) {
			System.out.println("dont use null values");
		} catch (Exception e) {
			System.out.println("general exception");
		}
		System.out.println("main method ended");
	}
}

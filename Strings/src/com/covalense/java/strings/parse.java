package com.covalense.java.strings;

public class parse {

	public static void main(String[] args) {
		String x = "40";
		String y = "50";
		String z = "5.0";
		System.out.println("before parse :" + (x + y));
		int i = Integer.parseInt(x);
		int j = Integer.parseInt(y);
		System.out.println("after parse :" + (i + j));
		double k = Double.parseDouble(z);
		System.out.println("after double parse :" + (i + k));
	}

}

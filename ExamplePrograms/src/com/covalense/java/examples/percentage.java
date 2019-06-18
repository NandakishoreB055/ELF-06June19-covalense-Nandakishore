package com.covalense.java.examples;

public class percentage {
	static double perc(double obtm, double totalm) {
		double res = obtm * 100 / totalm;
		return res;
	}

	public static void main(String[] args) {
		double a = perc(555, 600);
		System.out.println("result" + a);
	}

}

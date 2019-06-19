package com.covalense.java.examples;

public class bmi2 {

	static double bmires(double w, double h) {
		double res = w / (h * h);
		return res;
	}

	static void result(double res) {
		if (res < 18.5) {
			System.out.println("thin");
		} else if (res >= 18.5 && res <= 24) {
			System.out.println("fat");
		} else {
			System.out.println("very fat");
		}
	}

	public static void main(String[] args) {
		double a = bmires(70.6, 1.75);
		System.out.println("result is" + a);
		result(a);
	}
}

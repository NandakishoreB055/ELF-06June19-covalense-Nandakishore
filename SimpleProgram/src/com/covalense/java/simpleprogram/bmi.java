package com.covalense.java.simpleprogram;

public class bmi {
	double height;
	double weight;

	void calc() {
		double res = weight / (height * height);
		System.out.println("result is " + res);
		if (res >= 18 && res <= 23) {
			System.out.println("normal");
		} else if (res > 23) {
			System.out.println("over weight");
		} else {
			System.out.println("under weight");
		}
	}
}

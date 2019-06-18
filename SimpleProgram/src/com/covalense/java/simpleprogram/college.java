package com.covalense.java.simpleprogram;

public class college {
	static student s = new student();

	void teach() {
		System.out.println("teach");
	}

	public static void main(String[] args) {
		college c = new college();
		c.s.play();
		c.s.name = "sait";
		System.out.println(c.s.name);
	}
}

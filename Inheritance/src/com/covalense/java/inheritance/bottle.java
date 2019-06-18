package com.covalense.java.inheritance;

public class bottle {
	void open() {
		System.out.println("open the bottle");
	}

	void drink() {
		System.out.println("drink it");
	}

	public static void main(String[] args) {
		bottle b = new bottle();
		drinker d = new drinker();
		d.recieve(b);
	}
}

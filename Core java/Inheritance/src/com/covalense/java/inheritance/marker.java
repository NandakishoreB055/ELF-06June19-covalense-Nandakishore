package com.covalense.java.inheritance;

public class marker extends pen {
	public static void main(String[] args) {
		pen p = new marker();
		marker m = new marker();
		p.write();
		m.write();
		System.out.println("cost is " + m.cost);
	}

	void color() {
		System.out.println("marker write");
	}
}

package com.covalense.java.inheritance;

public class markerwrite extends penwrite {

	public static void main(String[] args) {
		penwrite p = new penwrite();
		markerwrite m = new markerwrite();
		p.write();
		m.write();
	}

	void write() {
		System.out.println("marker write");
	}
}

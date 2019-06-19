package com.covalense.java.inheritance;

public class son extends father {
	void bike() {
		System.out.println("modified bike");
	}

	public static void main(String[] args) {
		father f = new father();
		// son s=new son();
		f.bike();
		// s.bike();
	}
}

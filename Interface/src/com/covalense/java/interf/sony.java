package com.covalense.java.interf;

public class sony implements printer {
	public void printer() {
		System.out.println("print by sony");
	}

	public static void main(String[] args) {
		printer p = new sony();
		p.printer();
	}
}

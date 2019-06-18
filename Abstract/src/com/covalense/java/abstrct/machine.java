package com.covalense.java.abstrct;

public class machine {
	void slot(atmcard a) {
		a.validate();
		a.getinfo();
	}

	public static void main(String[] args) {
		machine m = new machine();
		icici i = new icici();
		hdfc h = new hdfc();
		sbi s = new sbi();
		m.slot(i);
		m.slot(h);
		m.slot(s);
	}

}

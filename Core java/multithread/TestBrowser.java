package com.covalense.java.multithread;

public class TestBrowser {

	public static void main(String[] args) {
		Pvr p = new Pvr();
		Browser b1 = new Browser(p);
		b1.start();
		Browser b2 = new Browser(p);
		b2.start();
		p.leaveme();
	}

}

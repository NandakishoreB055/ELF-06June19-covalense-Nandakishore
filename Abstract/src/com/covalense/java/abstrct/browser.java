package com.covalense.java.abstrct;

public class browser {
	void open(google g) {
		g.login();
		g.sharedocument();
	}

	public static void main(String[] args) {

		browser b = new browser();
		gmail m = new gmail();
		gdrive d = new gdrive();
		b.open(m);
		b.open(d);
	}
}

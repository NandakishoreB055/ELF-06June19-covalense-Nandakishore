package com.covalense.java.abstrct;

public class marker extends pen {
	void color() {
		System.out.println("color by marker");
	}

	public static void main(String[] args) {
		pencil p = new marker();
		p.color();
		pen pe = new marker();
		pe.draw();
		marker m = new marker();
		m.write();
	}
}

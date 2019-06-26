package com.covalense.java.constructorreference;

public class TestPen {

	public static void main(String[] args) {
		PenFactory pf = Pen::new;
		Pen x = pf.getPen();
	}

}

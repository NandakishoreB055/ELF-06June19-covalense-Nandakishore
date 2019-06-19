package com.covalense.java.collections;

import java.util.ArrayList;

public class TestArray5 {
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(15.0);
		al.add(2.0);
		al.add(20.00);
		al.add(99.9);
		for (Double r : al) {
			System.out.println(r);
		}

	}
}
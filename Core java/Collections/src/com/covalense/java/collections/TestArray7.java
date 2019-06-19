package com.covalense.java.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestArray7 {

	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(99.9);
		al.add(0.9);
		al.add(44.9);
		al.add(2345.9);
		ListIterator<Double> lit = al.listIterator();
		while (lit.hasNext()) {
			Double r = lit.next();
			System.out.println(r);
		}
	}

}

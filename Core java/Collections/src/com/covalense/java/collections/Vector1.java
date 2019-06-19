package com.covalense.java.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector<Double> v = new Vector<Double>();
		v.add(9.2);
		v.add(1.5);
		v.add(6.9);
		v.add(2.4);
		v.add(3.6);
		for (int i = 0; i < v.size(); i++) {
			Double r = v.get(i);
			System.out.println(r);
		}
		System.out.println("*********");
		Enumeration it = v.elements();
		while (it.hasMoreElements()) {
			Double r = (Double) it.nextElement();
			System.out.println(r);

		}
		System.out.println("*********");

	}

}

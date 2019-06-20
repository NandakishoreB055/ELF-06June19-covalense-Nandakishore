package com.covalense.java.comparable;


public class Car implements Comparable<Car> {
	String name;
	String brand;
	Double rate;
	int cost;

	@Override
	public int compareTo(Car o) {
		String d = this.name;
		String e = o.name;
		int k = d.compareTo(e);
		return k;

	}
}

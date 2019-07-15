package com.covalense.java.assignments5;

public class Prog5 implements Comparable<Prog5> {
	String name;
	double cost;
	String brand;

	void set(String name, double cost, String brand) {
		this.name = name;
		this.cost = cost;
		this.brand = brand;
	}

	@Override
	public int compareTo(Prog5 o) {
		Double a = this.cost;
		Double b = o.cost;
		return a.compareTo(b);
	}
}

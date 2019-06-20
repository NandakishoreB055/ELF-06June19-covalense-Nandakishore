package com.covalense.java.comparable;


public class Product implements Comparable<Product> {
	String name;
	Double rate;
	int cost;

	@Override
	public int compareTo(Product o) {
		Double d = this.rate;
		Double e = o.rate;
		int k = d.compareTo(e);
		return -k;

	}

}

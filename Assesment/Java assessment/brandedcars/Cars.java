package com.covalense.java.brandedcars;

public class Cars {
	private String name;
	private String brand;
	private int cost;

	public Cars(String name, String brand, int cost) {
		this.name = name;
		this.brand = brand;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public int getCost() {
		return cost;
	}

}

package com.covalense.java.constructors;

public class train {
	void search(int i) {
		System.out.println("train by number:" + i);
	}

	void search(String a) {
		System.out.println("train by name:" + a);
	}

	public static void main(String[] args) {
		train t = new train();
		t.search(12734);
		t.search("chennai");
	}
}

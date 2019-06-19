package com.covalense.java.singleton;

public class Test_immutable {

	public static void main(String[] args) {
		Immutable_class i = new Immutable_class("nanda", 22);
		System.out.println("name is " + i.getname());
		System.out.println("age is " + i.getage());
	}

}

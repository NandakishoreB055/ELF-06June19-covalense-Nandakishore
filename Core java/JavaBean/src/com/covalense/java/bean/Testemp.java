package com.covalense.java.bean;

public class Testemp {

	public static void main(String[] args) {
		Employee t = new Employee();
		t.setGender("male");
		t.setid(24);
		Dbn d1 = new Dbn();
		d1.recieve(t);
		System.out.println("gender is " + t.getGender());
		System.out.println("id is " + t.getid());
		Dbk d2 = new Dbk();
		d2.recieve(t);
		t.setGender("female");
		t.setid(24);
		System.out.println("gender is " + t.getGender());
		System.out.println("id is " + t.getid());
	}

}

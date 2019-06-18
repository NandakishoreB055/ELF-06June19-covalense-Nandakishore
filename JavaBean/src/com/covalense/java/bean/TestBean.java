package com.covalense.java.bean;

public class TestBean {

	public static void main(String[] args) {

		person a = new person();
		db1 d1 = new db1();
		db2 d2 = new db2();
		d1.recieve(a);
		a.setAge(24);
		a.setName("nanda");

		a.setAge(24);
		a.setName("kishore");
		d2.recieve(a);

	}

}

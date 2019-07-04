package com.covalense.jdbcapp.common;

public class MainMethodClass {

	public static void main(String[] args) {

		/*
		 * MyInterface ref1 = new ClassA(); ref1.print();
		 */

		Connection con = DriverManager.getConnection(args[0]);
		con.print();
	}

}

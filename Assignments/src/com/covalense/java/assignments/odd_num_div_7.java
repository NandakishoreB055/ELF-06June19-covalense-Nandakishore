package com.covalense.java.assignments;

public class odd_num_div_7 {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if ((i % 2 != 0) && (i % 7 == 0)) {
				System.out.println(i);
			}
		}
	}

}

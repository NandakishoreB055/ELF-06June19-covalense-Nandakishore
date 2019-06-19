package com.covalense.java.arraysort;

import java.lang.reflect.Array;
import java.security.PublicKey;
import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] num = { 2, 1, 5 };
		Arrays.sort(num);

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}

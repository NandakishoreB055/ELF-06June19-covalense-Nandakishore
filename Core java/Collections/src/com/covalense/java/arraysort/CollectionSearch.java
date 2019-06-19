package com.covalense.java.arraysort;

import java.util.Arrays;

public class CollectionSearch {

	public static void main(String[] args) {
		int[] num = { 5, 1, 7, 3, 4 };
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		System.out.println("********");
		int index = Arrays.binarySearch(num, 3);
		System.out.println("index of element is :"+index);
	}

}

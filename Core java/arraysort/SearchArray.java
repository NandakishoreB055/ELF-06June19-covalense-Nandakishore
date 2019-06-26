package com.covalense.java.arraysort;

import lombok.extern.java.Log;

@Log
public class SearchArray {
	public static int search(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String a[]) {
		int[] a1 = { 10, 20, 30, 50, 70, 90 };
		int key = 50;
		log.info(key + " is found at index: " + search(a1, key));
	}
}
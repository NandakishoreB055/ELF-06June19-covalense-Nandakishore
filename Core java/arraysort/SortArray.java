package com.covalense.java.arraysort;

import java.util.Arrays;

import lombok.extern.java.Log;

@Log
public class SortArray {

	public static void main(String[] args) {
		int[] num = { 2, 1, 5 };
		Arrays.sort(num);

		for (int i = 0; i < num.length; i++) {
			log.info(" " + num[i]);
		}
	}

}

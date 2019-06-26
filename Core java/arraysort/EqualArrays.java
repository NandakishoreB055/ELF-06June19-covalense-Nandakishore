package com.covalense.java.arraysort;

import java.util.Arrays;

import lombok.extern.java.Log;

@Log
public class EqualArrays {
	public static void main(String[] args) throws Exception {
		int[] ary = { 1, 2, 3, 4, 5, 6 };
		int[] ary1 = { 1, 2, 3, 4, 5, 6 };
		int[] ary2 = { 1, 2, 3, };
		log.info("Is array 1 equal to array 2?? " + Arrays.equals(ary, ary1));
		log.info("Is array 1 equal to array 3?? " + Arrays.equals(ary, ary2));
	}
}

/*
 * arrays are not equal even if they are same in the contents ,elements have to
 * be same according to index then the arrays will be equal
 */
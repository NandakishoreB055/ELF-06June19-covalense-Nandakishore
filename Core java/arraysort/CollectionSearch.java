package com.covalense.java.arraysort;

import java.util.Arrays;
import lombok.extern.java.Log;

@Log
public class CollectionSearch {

	public static void main(String[] args) {
		int[] num = { 5, 1, 7, 3, 4 };
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			log.info(" " + num[i]);
		}
		log.info("********");
		int index = Arrays.binarySearch(num, 3);
		log.info("index of element is :" + index);
	}

}

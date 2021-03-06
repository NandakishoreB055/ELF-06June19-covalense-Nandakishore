package com.covalense.java.arraysort;

import lombok.extern.java.Log;

@Log
public class ForEachLoop {

	public static void main(String[] args) {
		int[] a = { 5, 6, 7, 9, 4 };
		double[] d = { 5.9, 6.9, 7.2, 9.3, 4.4 };
		for (int x : a) {
			log.info(" " + x);
		}
		for (double y : d) {
			log.info(" " + y);
		}

	}

}

package com.covalense.java.arraysort;

import lombok.extern.java.Log;

@Log
public class CopyArray {
	public static void main(String[] args) {
		int a[] = { 7, 6, 2 };

		int b[] = new int[a.length];

		b = a;

		log.info("Contents of a[] ");
		for (int i = 0; i < a.length; i++)
			log.info(a[i] + " ");

		log.info("\n\nContents of b[] ");
		for (int i = 0; i < b.length; i++)
			log.info(b[i] + " ");
	}
}
package com.covalense.java.myarraylist;

import java.util.Arrays;
import java.util.logging.Logger;

public class TestMyArrayClass {
	private static final Logger log = Logger.getLogger("ArrayClass");

	public static void main(String[] args) {

		long starttime = System.currentTimeMillis();

		MyArrayClass m = new MyArrayClass();

		int size = 8;

		// adding 5 values
		for (int i = 0; i < size; i++) {
			m.add("value" + i);
		}
		// getting values
		for (int i = 0; i < size; i++) {
			log.info("total elements " + m.get(i));
		}

		// removing values
		log.info(" second object to be removed ");
		m.remove(18);

		for (int i = 0; i < size; i++) {

			log.info("object removed " + m.get(i));
			
		}
		long endtime = System.currentTimeMillis();
		long ms = endtime - starttime;
		log.info("Execution time is " + ms);
	}

}
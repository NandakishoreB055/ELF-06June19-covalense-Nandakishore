package com.covalense.java.assignments5;

import java.util.logging.Logger;

public class Count1 {
	private static final Logger log = Logger.getLogger("Nanda");

	static int count;

	public Count1() {
		count++;

	}

	static void getCount() {
		log.info("number of object created= " + count);
	}

}

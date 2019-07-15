package com.covalense.java.assignments5;

import java.util.logging.Logger;

public class CustomExp {

	private static final Logger log = Logger.getLogger("bhavani");

	public static void main(String[] args) {
		ValidNum v = new ValidNum();
		try {
			v.valid(0);
		} catch (NotValidNum e) {

			log.info(" " + e);
		}
	}

}

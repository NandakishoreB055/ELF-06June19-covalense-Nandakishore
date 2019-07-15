package com.covalense.java.assignments5;

import java.util.logging.Logger;

public class Prog8 {

	private static final Logger log = Logger.getLogger("bhavani");

	public static void main(String[] args) {
		ValidAge v = new ValidAge();
		try {
			v.valid(18);
		} catch (NotValidAge e) {

			log.info(" " + e);
		}
	}
}

package com.covalense.java.simpleinterest;

import lombok.extern.java.Log;
/**
 * 
 * @author calculating factorial
 *
 */
@Log
public class Factorial {
	void fact() {
		int f = 1;
		for (int i = 1; i <= 5; i++) {
			f = f * i;
		}
		log.info("" + f);
	}
}

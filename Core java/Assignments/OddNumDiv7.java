package com.covalense.java.assignments;

import lombok.extern.java.Log;

@Log
public class OddNumDiv7 {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if ((i % 2 != 0) && (i % 7 == 0)) {
				log.info(" " + i);
			}
		}
	}

}
package com.covalense.java.assignments;

import lombok.extern.java.Log;

@Log
public class EvnNumDiv5 {

	public static void main(String[] args) {
		for (int i = 50; i <= 100; i++) {
			if ((i % 2 == 0) && (i % 5 == 0)) {
				log.info(" " + i);
			}
		}
	}

}

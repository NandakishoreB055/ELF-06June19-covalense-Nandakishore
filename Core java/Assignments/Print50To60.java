package com.covalense.java.assignments;

import lombok.extern.java.Log;

@Log
public class Print50To60 {

	public static void main(String[] args) {
		for (int i = 50; i <= 60; i++) {
			log.info(" " + i);
		}
	}

}

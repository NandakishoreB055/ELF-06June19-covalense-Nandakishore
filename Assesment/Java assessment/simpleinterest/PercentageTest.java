package com.covalense.java.simpleinterest;

import lombok.extern.java.Log;

@Log
/**
 * 
 * @author to calling Percentage method
 *
 */
public class PercentageTest {
	public static void main(String[] args) {
		Percentage p = new Percentage();
		double d = p.calcPerc(100, 600);
		log.info("percentage is " + d);
	}
}

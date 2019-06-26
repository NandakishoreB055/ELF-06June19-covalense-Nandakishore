package com.covalense.java.methodreference;

import lombok.extern.java.Log;

@Log
public class CalculateAvg {
	void calAvg(int a, int b, int c) {
		double res = (a + b + c) / 3.0;
		log.info("" + res);
	}

}

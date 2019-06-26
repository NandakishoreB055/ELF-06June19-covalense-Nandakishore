package com.covalense.java.arraysort;

import lombok.extern.java.Log;

interface Name {
	int charcount(String a);
}

@Log
public class CountCharLambda {
	public static void main(String[] args) {
		Name d = a -> a.length();
		int i = d.charcount("nanda");
		log.info(" " + i);
	}
}

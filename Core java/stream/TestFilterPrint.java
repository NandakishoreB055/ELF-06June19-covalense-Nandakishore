package com.covalense.java.stream;

import java.util.ArrayList;
import lombok.extern.java.Log;

@Log
public class TestFilterPrint {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(4);
		al.add(3);
		al.add(8);
		al.add(1);
		al.stream().forEach(i -> log.info("" + i));

	}

}

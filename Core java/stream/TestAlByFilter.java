package com.covalense.java.stream;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import lombok.extern.java.Log;

@Log
public class TestAlByFilter {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(4);
		al.add(3);
		al.add(8);
		al.add(1);
		List<Integer> x = al.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		log.info("" + x);
	}

}
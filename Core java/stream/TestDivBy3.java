package com.covalense.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.java.Log;

@Log
public class TestDivBy3 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3);
		al.add(6);
		al.add(4);
		al.add(2);
		al.add(1);
		List<Integer> x = al.stream().filter(i -> i % 3 != 0).collect(Collectors.toList());
		log.info("" + x);
	}

}

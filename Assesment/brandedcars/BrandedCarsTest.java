package com.covalense.java.brandedcars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

/**
 * 
 * @author program to display the branded cars
 *
 */
@Log
public class BrandedCarsTest {
	public static void main(String[] args) {
		ArrayList<Cars> al = new ArrayList<Cars>();
		Cars c1 = new Cars("indica", "toyota", 15000);
		Cars c2 = new Cars("dzire", "maruti", 25000);
		Cars c3 = new Cars("scorpio", "mahindra", 15000);

		al.add(c1);
		al.add(c2);
		al.add(c3);

		List<Cars> c = al.stream().filter(s -> s.getBrand() == "toyota").collect(Collectors.toList());
		log.info("" + c);
	}
}

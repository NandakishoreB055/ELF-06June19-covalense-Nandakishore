package com.covalense.java.mobileobject;

import java.util.ArrayList;
import lombok.extern.java.Log;

@Log
/**
 * 
 * @author program to display the the mobile objects into array list 
 *
 */

public class MobileTest {

	public static void main(String[] args) {
		Mobile m1 = new Mobile("sony", 12000);
		Mobile m2 = new Mobile("apple", 150000);
		ArrayList<Mobile> al = new ArrayList<Mobile>();
		al.add(m1);
		al.add(m2);

		for (Mobile m : al) {
			log.info("" + m);

		}

	}

}

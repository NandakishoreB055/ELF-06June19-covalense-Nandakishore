package com.covalense.java.jspider;

public class testcard {

	public static void main(String[] args) {
		card j = new card();
		card a = new card();

		j.swipe();
		j.swipe();
		a.swipe();
		a.swipe();
		a.swipe();

		System.out.println("java count is " + j.count);
		System.out.println("angular count is " + a.count);
		System.out.println("organization count is " + card.orgcount);
	}
}

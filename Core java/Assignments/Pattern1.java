package com.covalense.java.assignments;

import java.util.Scanner;

import lombok.extern.java.Log;

@Log

public class Pattern1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		log.info("enter the rows");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				log.info("* ");
			}
			log.info(" ");
			s.close();
		}
	}

}

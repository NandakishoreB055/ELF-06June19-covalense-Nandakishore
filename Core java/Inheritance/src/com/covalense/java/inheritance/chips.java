package com.covalense.java.inheritance;

public class chips {
	void lays() {
		System.out.println("baby recieves lays");
	}

	void kurkure() {
		System.out.println("baby recieves kurkure");
	}

	public static void main(String[] args) {
		baby b = new baby();
		// chips c=new chips();
		lays l = new lays();
		kurkure k = new kurkure();
		b.recieve(l);
	}
}

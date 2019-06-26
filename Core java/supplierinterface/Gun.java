package com.covalense.java.supplierinterface;

public class Gun {

	int bullets;

	Gun(int i) {
		bullets = i;
	}

	Gun getGun() {
		return new Gun(100);
	}
}

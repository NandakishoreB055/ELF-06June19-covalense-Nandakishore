package com.covalense.java.assignments9;

import lombok.extern.java.Log;

@Log
public class AnimalSound {
	void getSound(Animal a) {
		if (a instanceof Dog) {
			a.sound();
		} else if (a instanceof Cat) {
			a.sound();
		} else {
			log.info("Pass the correct Option");
		}
	}
}

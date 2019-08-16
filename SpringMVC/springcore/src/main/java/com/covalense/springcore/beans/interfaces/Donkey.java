package com.covalense.springcore.beans.interfaces;

import lombok.extern.java.Log;

@Log
public class Donkey implements Animal {

	public void eat() {
		log.info("donkey eating");

	}

	public void sound() {
		log.info("donkey sound");

	}

}

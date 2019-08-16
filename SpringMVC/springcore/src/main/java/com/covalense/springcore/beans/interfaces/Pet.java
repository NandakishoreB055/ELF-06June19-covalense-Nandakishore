package com.covalense.springcore.beans.interfaces;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class Pet {
	private String name;
	@Autowired
	// @Qualifier("monkey")
	private Animal animal;

	public void animalInfo() {
		animal.eat();
		animal.sound();
	}

}

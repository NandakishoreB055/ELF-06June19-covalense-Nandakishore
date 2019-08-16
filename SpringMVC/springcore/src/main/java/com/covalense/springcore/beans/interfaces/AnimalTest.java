package com.covalense.springcore.beans.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnimalTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PetConfig.class);
		Pet pet = applicationContext.getBean(Pet.class);

		pet.animalInfo();
	}

}

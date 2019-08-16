package com.covalense.springcore.beans.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalXmlTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("PetConfig.xml");
		Pet pet = (Pet) applicationContext.getBean("pet");

		pet.animalInfo();
	}

}

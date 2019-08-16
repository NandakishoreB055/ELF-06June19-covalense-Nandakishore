package com.covalense.springcore.beans.interfaces;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PetConfig {
	@Bean
	public Pet getPet() {

		return new Pet();
	}

	@Bean(name="monkey")
	public Animal getMonkey() {

		return new Monkey();
	}

	@Bean(name="Donkey")
	public Animal getDonkey() {

		return new Donkey();
	}

}

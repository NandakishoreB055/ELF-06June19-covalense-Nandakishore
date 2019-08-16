package com.covalense.springcore.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LaptopTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(LaptopConfig.class);
		Laptop messageBean = context.getBean(Laptop.class);
		messageBean.showSpecification();

	}
}

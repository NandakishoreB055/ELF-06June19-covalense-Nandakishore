package com.covalense.springcore.beans;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import lombok.extern.java.Log;

@Log
public class EmppBeanTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("emp.xml");

		EmpBean empBean1 = (EmpBean) applicationContext.getBean("EmpBean");

		Scanner sc = new Scanner(System.in);

		log.info("Enter ID1: ");
		empBean1.setId(sc.nextInt());
		sc.nextLine();

		log.info("Enter Name1: ");
		empBean1.setName(sc.nextLine());

		EmpBean empBean2 = (EmpBean) applicationContext.getBean("EmpBean");

		log.info("Enter ID2: ");
		empBean2.setId(sc.nextInt());
		sc.nextLine();

		log.info("Enter Name2: ");
		empBean2.setName(sc.nextLine());

		log.info("ID is : " + empBean1.getId());
		log.info("Name is : " + empBean1.getName());
		log.info("ID is : " + empBean2.getId());
		log.info("Name is : " + empBean2.getName());

		((AbstractApplicationContext) applicationContext).close();
	}

}

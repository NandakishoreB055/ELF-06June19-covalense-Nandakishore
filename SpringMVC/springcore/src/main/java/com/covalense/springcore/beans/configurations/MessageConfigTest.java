package com.covalense.springcore.beans.configurations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springcore.beans.MessageBean;

import lombok.extern.java.Log;

@Log
public class MessageConfigTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MessageConfig.class);
		((ConfigurableApplicationContext) applicationContext).registerShutdownHook();

		MessageBean messageBean1 = applicationContext.getBean(MessageBean.class);
		MessageBean messageBean2 = applicationContext.getBean(MessageBean.class);

		log.info("msg1 : " + messageBean1.getMessage());
		log.info("msg2 : " + messageBean2.getMessage());

		messageBean2.setMessage("covalense");

		log.info("msg1 : " + messageBean1.getMessage());
		log.info("msg2 : " + messageBean2.getMessage());

	}

}

package com.covalense.springcore.beans.configurations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.covalense.springcore.beans.MessageBean;

import lombok.extern.java.Log;

@Log
@Configuration // similar to <beans> tag in xml file
public class MessageConfig {

	@Bean // similar to <bean> tag in xml file
	@Scope("prototype")//  not to make as singleton
	public MessageBean getMessageBean() {
		MessageBean messageBean = new MessageBean();
		messageBean.setMessage("hello world");
		return messageBean;
	}

	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		log.info("initialize method");

	}

	@PreDestroy
	public void destroy() throws Exception {
		log.info("destroy method");
	}

}

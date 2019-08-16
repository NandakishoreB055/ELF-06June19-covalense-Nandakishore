package com.covalense.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller // takes request from dispatcher-servlet
@RequestMapping("/") // if("/abc") is used then ../WEB-INF/views/message.jsp shd be the path
public class EmployeeController {

	@RequestMapping(path = "/getMessage", method = RequestMethod.GET)
	public ModelAndView getMessage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("./WEB-INF/views/message.jsp");
		return modelAndView;

	}

	@GetMapping("/seeMessage")
	public ModelAndView getMessage(ModelAndView modelAndView) {
		modelAndView.setViewName("./WEB-INF/views/message.jsp");
		return modelAndView;

	}

	// if we use prefix and suffix in the dispatcher-servlet.xml
	@GetMapping("/myMessage")
	public ModelAndView viewMessage(ModelAndView modelAndView) {
		modelAndView.setViewName("message");
		return modelAndView;

	}

}

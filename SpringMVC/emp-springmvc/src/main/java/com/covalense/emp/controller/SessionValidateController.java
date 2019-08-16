package com.covalense.emp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.emp.common.EMPC;

@Controller
@RequestMapping("/validator")
@PropertySource(EMPC.PROPERTY_FILENAME)
public class SessionValidateController {

	@GetMapping("/validate/{url1}/{url2}")
	public String validateSession(ModelMap modelMap, HttpServletRequest req, 
			@PathVariable("url1") String url1,
			@PathVariable("url2") String url2,
			@Value("${loginFirst}") String loginFirst) {
		if (req.getSession(false) == null) {
			modelMap.addAttribute("message", loginFirst);
			return EMPC.VIEW_LOGIN_PAGE;
		}
		return "forward:/" + url1 + "/" + url2;
	}

	@PostMapping("/validate")
	public String validateSessionPost(ModelMap modelMap, HttpServletRequest req, 
			@PathVariable("url1") String url1,
			@PathVariable("url2") String url2, 
			@Value("${loginFirst}") String loginFirst) {
		return validateSession(modelMap, req, url1, url2, loginFirst);
	}
}
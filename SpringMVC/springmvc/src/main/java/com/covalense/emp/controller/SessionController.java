package com.covalense.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.emp.dto.UserBean;

@Controller
@RequestMapping("/session")
public class SessionController {

	@GetMapping("/loginForm")
	public String login() {
		return "loginForm";
	}

	@PostMapping("/login")
	public String authenticate(UserBean userBean, HttpServletRequest req) {
		if (userBean.getUserId() == 101 && userBean.getPassword().equals("101")) {
			HttpSession session = req.getSession(true);
			return "userHome";
		}
		req.setAttribute("msg", "Invalid credentials");
		return "loginForm";

	}
	
	@GetMapping("/logout")
	public String logout(ModelMap modelMap, HttpSession session) {
	 	 session.invalidate();
	 modelMap.addAttribute("message", "Logged out successfully");
	 return "login"; 
	}

}

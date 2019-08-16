package com.covalense.emp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.covalense.emp.dto.UserBean;


@Controller
@RequestMapping("/forms")
public class FormController {

	// to get the form
	@GetMapping("/getForm")
	public String getForm() {
		return "myform";
	}

	// submitting form
	@PostMapping("/formaction")
	public String submitForm(HttpServletRequest req) {
		int user = Integer.parseInt((req.getParameter("user")));
		String pwd = req.getParameter("password");

		req.setAttribute("user", user);
		req.setAttribute("password", pwd);

		return "formDataDisplay";
	}

	// another way of submitting form
	@PostMapping("/submitForm2")
	public String submitForm2(int user, String pwd, ModelMap modelMap) {
		modelMap.addAttribute("user", user);
		modelMap.addAttribute("password", pwd);

		return "formDataDisplay";
	}

	// another way of submitting form by bean
	@PostMapping("/submitForm3")
	public String submitForm3(UserBean userBean, ModelMap modelMap) {
		modelMap.addAttribute("userBean", userBean);

		return "formDataDisplayBeanDisplay";
	}

	// another way of submitting form
	@PostMapping("/submitForm4")
	public String submitForm4(@RequestParam(name = "userId") int uid, @RequestParam(name = "password") String pwd,
			ModelMap modelMap) {
		modelMap.addAttribute("userId", uid);
		modelMap.addAttribute("password", pwd);

		return "formDataDisplay";
	}

	// another way of submitting form
	@PostMapping("/submitForm5")
	public String submitForm5(@RequestParam(name = "userId") int uid, @RequestParam(name = "password") String pwd,
			ModelMap modelMap) {
		modelMap.addAttribute("userId", uid);
		modelMap.addAttribute("password", pwd);

		return "formDataDisplayExpLang";
	}

}
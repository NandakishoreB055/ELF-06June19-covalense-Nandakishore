package com.covalense.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.emp.EmployeeDAO;
import com.covalense.emp.EmployeeInfoBean;
import com.covalense.emp.common.EMPC;

@Controller
@RequestMapping("/login")
@PropertySource(EMPC.PROPERTY_FILENAME)
public class LoginController {

	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;

	@GetMapping("/loginPage")
	public String getForm() {
		return EMPC.VIEW_LOGIN_PAGE;
	}

	@PostMapping("/authenticate")
	public String submit(int eid, String password, HttpServletRequest req, @Value("${invalidId}") String invalidId,
			@Value("${invalidCred}") String invalidCred) {

		EmployeeInfoBean bean = dao.getEmployeeInfo(eid);
		if (bean == null) {
			req.setAttribute("message", invalidId);
			return EMPC.VIEW_LOGIN_PAGE;
		} else if (bean.getPassword().equals(password)) {
			HttpSession session = req.getSession(true);
			session.setAttribute("bean", bean);
			return EMPC.VIEW_HOME_PAGE;
		} else {
			req.setAttribute("message", invalidCred);
			return EMPC.VIEW_LOGIN_PAGE;
		}
	}

	@GetMapping("/logout")
	public String logout(ModelMap modelMap, HttpSession session) {
		session.invalidate();
		modelMap.addAttribute("message", "Logged out successfully");
		return "loginPage";
	}

}
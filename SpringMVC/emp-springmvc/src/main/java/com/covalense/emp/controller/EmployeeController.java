package com.covalense.emp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.covalense.emp.EmployeeDAO;
import com.covalense.emp.EmployeeInfoBean;

import com.covalense.emp.common.EMPC;

@Controller
@RequestMapping("/employee")
@PropertySource(EMPC.PROPERTY_FILENAME)
public class EmployeeController {
	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;

//private int employeeId;
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@GetMapping("/search")
	public String searchEmployee(@RequestParam int id, ModelMap modelMap, HttpServletRequest req) {
		List<EmployeeInfoBean> bean = dao.getAllSearchedEmployee(id);
//modelMap.addAttribute("bean", bean);
		req.setAttribute("bean", bean);
		return "searchPage";
//return "homePage";
	}

//	 @GetMapping("/createEmployee")
//	public String createForm() {
//	return "createEmployee";
//	}
//	 
//	 @PostMapping("/employeeSubmit") 
//	 public String employeeSave(EmployeeInfoBean bean, ModelMap modelMap) { 
//	 modelMap.addAttribute("EmployeeInfoBean",bean.toString());
//	 EmployeeDAO dao = EmployeeDAOFactory.getInstance();
//	 bean.getOtherInfo().setId(bean.getId());
//	 boolean isInserted = dao.createEmployeeInfo(bean);
//	if(isInserted) {
//	modelMap.addAttribute("message", "Employee Created successfully");
//	} else {
//	modelMap.addAttribute("message", "Employee creation faileds");
//	}
//	return "LoginPage";
//	
//	 }

//	 @GetMapping("/selected")
//	public String selectedEmployee(@RequestParam int id, ModelMap modelMap) {
//	 EmployeeDAO dao = EmployeeDAOFactory.getInstance(); 
//	EmployeeInfoBean bean = dao.getEmployeeInfo(id);
//	modelMap.addAttribute("bean", bean);
//	 return "homePage";
//	}
//	 @GetMapping("/profile")
//	public String employeeInfo(ModelMap modelMap) {
//	 EmployeeDAO dao = EmployeeDAOFactory.getInstance(); 
//	EmployeeInfoBean bean = dao.getEmployeeInfo(employeeId);
//	modelMap.addAttribute("bean", bean);
//	 return "homePage";
//	}

}
//
//@GetMapping("/validate")
//	public String validateSession(ModelMap modelMap, HttpServletRequest req, @RequestParam String url) {
//	 if(req.getSession(false) == null) {
//	 modelMap.addAttribute("message", "Login first");
//	 return "LoginPage"; 
//	 }
//	 return "forward:/employee/" +url;
//	}
//@GetMapping("/validate1/{url}")
//	public String validateSession1(ModelMap modelMap, HttpServletRequest req, @PathVariable("url") String url) {
//	 if(req.getSession(false) == null) {
//	 modelMap.addAttribute("message", "Login first");
//	 return "LoginPage"; 
//	 }
//	 return "forward:/employee/" +url;
//	}
//
//@PostMapping("/validate")
//	public String validateSessionPost(ModelMap modelMap, HttpServletRequest req, @RequestParam String url) {
//	 return validateSession(modelMap, req,url); 
//	}
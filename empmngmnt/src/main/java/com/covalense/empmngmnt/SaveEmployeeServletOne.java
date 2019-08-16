package com.covalense.empmngmnt;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.java.Log;

@WebServlet("/save")
@Log
public class SaveEmployeeServletOne extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeData bean = new EmployeeData();
		EmployeeOtherInfoBean otherInfoBean = new EmployeeOtherInfoBean();

		bean.setId(Integer.parseInt(req.getParameter("id")));
		bean.setName(req.getParameter("name"));
		bean.setAccountNumber(Long.parseLong(req.getParameter("accNo")));
		bean.setEmail(req.getParameter("emailId"));
		bean.setAge(Integer.parseInt(req.getParameter("age")));
		bean.setDesignation(req.getParameter("designation"));
		bean.setGender(req.getParameter("gender"));
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			bean.setDob(formatter.parse(req.getParameter("dob")));
			bean.setJoiningDate(formatter.parse(req.getParameter("doj")));

		} catch (ParseException e) {
			e.printStackTrace();
		}
		bean.setSalary(Double.parseDouble(req.getParameter("salary")));
		bean.setDepartmentId(Integer.parseInt(req.getParameter("deptId")));
		bean.setPhone(Long.parseLong(req.getParameter("phNo")));
		bean.setManagerId(Integer.parseInt(req.getParameter("mgrId")));
		bean.setPassword(req.getParameter("pwd"));

		otherInfoBean.setId(Integer.parseInt(req.getParameter("id")));
		otherInfoBean.setAadhar(Long.parseLong(req.getParameter("adharNo")));
		otherInfoBean.setBloodGroup(req.getParameter("bloodGrp"));
		otherInfoBean.setEmergencyContactperson(req.getParameter("contactName"));
		otherInfoBean.setEmergencyContactNumber(Long.parseLong(req.getParameter("contactNum")));
		otherInfoBean.setFatherNm(req.getParameter("fatherName"));
		otherInfoBean.setIschallenged(Boolean.parseBoolean(req.getParameter("challenged")));
		otherInfoBean.setMarried(Boolean.parseBoolean(req.getParameter("status")));
		otherInfoBean.setMotherNm(req.getParameter("motherName"));
		otherInfoBean.setNationality(req.getParameter("nationality"));
		otherInfoBean.setPan(req.getParameter("pan"));
		otherInfoBean.setReligion(req.getParameter("religion"));
		otherInfoBean.setSpouseNm(req.getParameter("spouseName"));
		otherInfoBean.setPassport(req.getParameter("passport"));

		bean.setOtherInfo(otherInfoBean);
		boolean isInserted = dao.createEmployeeInfo(bean);
		if (isInserted) {
			resp.sendRedirect("http://localhost/Empmngmnt/index.html");
		}

	}
}

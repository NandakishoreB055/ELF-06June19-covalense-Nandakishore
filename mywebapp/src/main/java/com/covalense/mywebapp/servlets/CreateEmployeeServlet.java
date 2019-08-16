package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.dao.EmployeeDAO;
import com.covalense.mywebapp.dao.EmployeeDAOFactory;
import com.covalense.mywebapp.dao.EmployeeData;

@WebServlet("/save")
public class CreateEmployeeServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// Interact with DB & get the employee info
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeData bean = new EmployeeData();

		SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");

		bean.setId(Integer.parseInt(req.getParameter("id")));
		bean.setName(req.getParameter("name"));
		bean.setAge(Integer.parseInt(req.getParameter("age")));
		bean.setGender(req.getParameter("gender"));
		bean.setSalary(Double.parseDouble(req.getParameter("salary")));
		bean.setPhone(Integer.parseInt(req.getParameter("phone")));

		try {
			bean.setJoiningDate(form.parse(req.getParameter("joinDate")));
			bean.setDob(form.parse(req.getParameter("dob")));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		bean.setAccount_number(Integer.parseInt(req.getParameter("accno")));
		bean.setEmail(req.getParameter("email"));
		bean.setDesignation(req.getParameter("designation"));

		bean.setDept_Id(Integer.parseInt(req.getParameter("deptId")));
		bean.setMngrId(Integer.parseInt(req.getParameter("mngrId")));

		boolean inserted = dao.createEmployeeInfo(bean);
		PrintWriter out = resp.getWriter();
		if (inserted) {
			out.print("<html>");
			out.print("<body>");
			out.print("<h1><span style=\"color:red\"> Emp info inserted</span></h1>");
			out.print("</body>");
			out.print("</html>");
		} else {
			out.print("<html>");
			out.print("<body>");
			out.print("<h1><span style=\"color:red\"> Emp info not inserted </span></h1>");
			out.print("</body>");
			out.print("</html>");
		}
	}
}

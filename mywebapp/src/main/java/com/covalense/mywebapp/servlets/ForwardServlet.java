package com.covalense.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.dao.EmployeeData;

@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		EmployeeData empInfo = new EmployeeData();
		empInfo.setAge(20);
		empInfo.setDept_Id(2);
		empInfo.setId(10);

		// Pass the above object empInfo to EmployeeSearchServlet
		// req.setAttribute("info", empInfo);
		ServletContext ctx = getServletContext();
		ctx.setAttribute("info", empInfo);

		// String url = "http://www.gmail.com";
		String url = "search?id=101";

		RequestDispatcher dispatcher = req.getRequestDispatcher(url);
		dispatcher.forward(req, resp);
	}

}

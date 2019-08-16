package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.dao.EmployeeData;

import lombok.extern.java.Log;

@Log
public class MyFirstServlet extends HttpServlet {

	public MyFirstServlet() {
		log.info("Inside MyFirstServlet constructor");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ServletContext ctx = req.getServletContext();
		String movieName = ctx.getInitParameter("movie");

		ServletConfig config = getServletConfig();
		String actorName = config.getInitParameter("actor");

		String httpMethod = req.getMethod();
		String protocol = req.getProtocol();
		String requestUrl = req.getRequestURL().toString();

		log.info("httpMethod" + httpMethod);
		log.info("protocol" + protocol);
		log.info("requestUrl" + requestUrl);

		String currentDateTime = new Date().toString();

		// Get Query String information
		String fnameValue = req.getParameter("fname");
		String lnameValue = req.getParameter("lname");

		String htmlResponse = "<!DOCTYPE html>" + "<html>" + "<head>" + "<meta charset=\"ISO-8859-1\">"
				+ "<title>My First HTML</title>" + "</head>" + "<body>" + "<h1>" + "Current date and time is:" + "<br>"
				+ "<span style=\"color:red\">" + currentDateTime + "</span>" + "<br><br>" + "First Name : " + fnameValue
				+ "<br><br>" + "Last Name: " + lnameValue + "<h1>" + "</body>" + "</html>";

		// Send the above code to browser
		// resp.setHeader("Refresh", "1"); //Auto-refresh for every second
		// resp.setContentType("application/pdf");
		// resp.setContentType("video/mp4");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print(htmlResponse);

		// Get the object from from ForwardServlet
		// EmployeeData empInfo = (EmployeeData) req.getAttribute("info");
		EmployeeData empInfo = (EmployeeData) ctx.getAttribute("info");
		if (empInfo == null) {
			out.print("<html>");
			out.print("<body>");
			out.print("<h1><span style=\"color:red\"> Emp object not found </span></h1>");
			out.print("</body>");
			out.print("</html>");
		} else {
			out.print("<html>");
			out.print("<body>");
			out.print("<h1><span style=\"color:red\"> Emp object found </span></h1>");
			out.print("<br>");
			out.print("<br>Id is " + empInfo.getId());
			out.print("<br>Age is " + empInfo.getAge());
			out.print("<br>DepartmentId is " + empInfo.getDept_Id());
			out.print("</body>");
			out.print("</html>");
		}

	}
}

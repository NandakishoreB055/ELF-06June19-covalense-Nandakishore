package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.dao.EmployeeDAO;
import com.covalense.mywebapp.dao.EmployeeDAOFactory;
import com.covalense.mywebapp.dao.EmployeeData;

@WebServlet(urlPatterns = "/search", initParams = { @WebInitParam(name = "actress", value = "basanthi") })
public class EmployeeSearchServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext ctx = req.getServletContext();
		String movieName = ctx.getInitParameter("movie");

		ServletConfig config = getServletConfig();
		String actorName = config.getInitParameter("actor");
		String actressName = config.getInitParameter("actress");

		String idValue = req.getParameter("id");

		// Interact with DB & get the employee info
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeData bean = dao.getEmployeeInfo(idValue);

		// Send the Response to browser
		PrintWriter out = resp.getWriter();

		if (bean == null) {
			out.print("<html>");
			out.print("<body>");
			out.print("<h1><span style=\"color:red\"> Emp not found </span></h1>");
			out.print("</body>");
			out.print("</html>");
		} else {
			out.print("<html>");
			out.print("<body>");
			out.print("<h1><span style=\"color:red\"> Emp found </span></h1>");
			out.print("<br>");
			out.print("<br>Id is " + bean.getId());
			out.print("<br>Name is " + bean.getName());
			out.print("<br>Age is " + bean.getAge());
			out.print("<br>Gender is " + bean.getGender());
			out.print("<br>Salary is " + bean.getSalary());
			out.print("<br>Phone is " + bean.getPhone());
			out.print("<br>Joiningdate is " + bean.getJoiningDate());
			out.print("<br>AccountNumber is " + bean.getAccount_number());
			out.print("<br>Email is " + bean.getEmail());
			out.print("<br>Designation is " + bean.getDesignation());
			out.print("<br>Dob is " + bean.getDob());
			out.print("<br>DepartmentId is " + bean.getDept_Id());
			out.print("<br>ManagerId is " + bean.getMngrId());
			out.print("</body>");
			out.print("</html>");

		}

		// Get the object from from ForwardServlet
		//EmployeeData empInfo = (EmployeeData) req.getAttribute("info");
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

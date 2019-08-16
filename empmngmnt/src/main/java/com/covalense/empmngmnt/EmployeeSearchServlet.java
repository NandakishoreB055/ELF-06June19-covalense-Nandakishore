package com.covalense.empmngmnt;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lombok.extern.java.Log;

@WebServlet("/search")
@Log
public class EmployeeSearchServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		// validate session
		HttpSession session = req.getSession(false);
		if (session == null) {
			// invalid session;Generate login page with error info
			out.print("<h1><span style='color:red'>Invalid session!! pls Login</h1>");
			out.print("<BR><BR>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("index.html");
			dispatcher.include(req, resp);
		} else {
			EmployeeDAO dao = EmployeeDAOFactory.getInstance();
			List<EmployeeData> bean = dao.getAllSearchedEmployee(req.getParameter("search"));
			if (!bean.isEmpty()) {
				out.print("<html>");
				out.print("<head>");
				out.print("<meta charset='UTF-8'>");
				out.print("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
				out.print("<meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">");
				out.print("<title>Employee Management Portal</title>");
				out.print(
						"<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">");
				out.print("<style>                     ");
				out.print(".nav {                      ");
				out.print("background-color: beige;    ");
				out.print("}                           ");
				out.print(".profile {                  ");
				out.print("height:50px;                ");
				out.print("width:20px;                 ");
				out.print("background-color: blueviolet");
				out.print("}                           ");
				out.print(".logout {                   ");
				out.print("font-size: 25px;            ");
				out.print("color: brown;               ");
				out.print("font-weight: 600;           ");
				out.print("                            ");
				out.print("}                           ");
				out.print(".employee-info {            ");
				out.print("border: 1px solid brown;    ");
				out.print("}                           ");
				out.print(".data-display {             ");
				out.print("font-size: 18px;            ");
				out.print("padding: 5px;               ");
				out.print("}                           ");
				out.print("</style>                    ");
				out.print("</head>                     ");
				out.print("<body>                      ");
				out.print("<div style=\"background-color: beige;\"> ");
				out.print("<h1 style=\"margin-left:35%\">Employee Management Portal</h1>                        ");
				out.print("<div class=\"row\" style=\"height:70px; padding: 20px;\">                              ");
				out.print("<div class=\"col-1 profile\"><span ></span></div>                                    ");
				out.print("<div class=\"col-5\"><span class=\"logout\">Edit</span></div>                          ");
				out.print(
						"<div class=\"search col-2\"><form action=\"http://localhost:80/Empmngmnt/search\"> <input type=\"text\" placeholder=\"Search\" name=\"search\"/></form></div>         ");
				out.print(
						"<div class=\"col-3\"><a href=\"index.html?loged=out\"><span class=\"logout\" style=\"margin-left: 70%;\">Logout</span></a></div> ");
				out.print("</div>     ");
				out.print("</div>     ");
				out.print("<br><br>   ");
				out.print("<div class=\"employee-info container\">            ");
				for (EmployeeData b : bean) {
					out.print("<div class=\"data-display\"><a href=\"./result?id=" + b.getId() + "\" >" + b.getName()
							+ " </a></div>");
				}
				out.print("</div> ");
				out.print("</body>");
				out.print("</html>");
			} else {
				out.print("<html>");
				out.print("<head>");
				out.print("<meta charset='UTF-8'>");
				out.print("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
				out.print("<meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">");
				out.print("<title>Employee Management Portal</title>");
				out.print(
						"<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">");
				out.print("<style>                     ");
				out.print(".nav {                      ");
				out.print("background-color: beige;    ");
				out.print("}                           ");
				out.print(".profile {                  ");
				out.print("height:50px;                ");
				out.print("width:20px;                 ");
				out.print("background-color: blueviolet");
				out.print("}                           ");
				out.print(".logout {                   ");
				out.print("font-size: 25px;            ");
				out.print("color: brown;               ");
				out.print("font-weight: 600;           ");
				out.print("                            ");
				out.print("}                           ");
				out.print(
						".search-button {border: none;background-color: beige;margin-top: -26px;margin-left: -60px;}");
				out.print(".employee-info {            ");
				out.print("border: 1px solid brown;    ");
				out.print("}                           ");
				out.print(".data-display {             ");
				out.print("font-size: 18px;            ");
				out.print("padding: 5px;               ");
				out.print("}                           ");
				out.print("</style>                    ");
				out.print("</head>                     ");
				out.print("<body>                      ");
				out.print("<div style=\"background-color: beige;\"> ");
				out.print("<h1 style=\"margin-left:35%\">Employee Management Portal</h1>                        ");
				out.print("<div class=\"row\" style=\"height:70px; padding: 20px;\">                              ");
				out.print("<div class=\"col-1 profile\"><span ></span></div>                                    ");
				out.print("<div class=\"col-5\"><span class=\"logout\">Edit</span></div>                          ");
				out.print(
						"<div class=\"search col-2\"><form action=\"http://localhost:80/Empmngmnt/search\"> <input type=\"text\" placeholder=\"Search\" name=\"search\"/></form></div>         ");
				out.print(
						"<div class=\"col-3\"><a href=\"./logout\"><span class=\"logout\" style=\"margin-left: 70%;\">Logout</span></a></div> ");
				out.print("</div>     ");
				out.print("</div>     ");
				out.print("<br><br>   ");
				out.print("<div class=\"employee-info container\">            ");

				out.print("<div class=\"data-display\">No Result Found</div>");

				out.print("</div> ");
				out.print("</body>");
				out.print("</html>");
			}

			// EmployeeInfoBean bean = dao.getEmployeeInfo(req.getParameter("search"));

		}

	}
}